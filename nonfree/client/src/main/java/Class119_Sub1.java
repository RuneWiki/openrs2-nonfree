import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
	private int anInt4905;

	@OriginalMember(owner = "client!qe", name = "O", descriptor = "[B")
	private byte[] aByteArray65;

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "Z")
	private boolean aBoolean375 = false;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	@Override
	public void method4978(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static340.aBoolean439 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4905 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static194.method3068(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4978(Static304.method2746(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
	@Override
	protected void method4979() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean375) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4905 << (Static340.aBoolean439 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()V")
	@Override
	protected void method4984() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()V")
	@Override
	protected void method4980() {
		@Pc(1) short local1 = 256;
		if (Static340.aBoolean439) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray603[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray65[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray65[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray65, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()I")
	@Override
	protected int method4995() {
		return this.anInt4905 - (this.aSourceDataLine1.available() >> (Static340.aBoolean439 ? 2 : 1));
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4993(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(26) String local26 = local20.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean375 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static374.anInt6244, 16, Static340.aBoolean439 ? 2 : 1, true, false);
		this.aByteArray65 = new byte[0x100 << (Static340.aBoolean439 ? 2 : 1)];
	}
}
