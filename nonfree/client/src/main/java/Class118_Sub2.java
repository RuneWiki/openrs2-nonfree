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

@OriginalClass("client!ok")
public final class Class118_Sub2 extends Class118 {

	@OriginalMember(owner = "client!ok", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ok", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
	private int anInt4812;

	@OriginalMember(owner = "client!ok", name = "P", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!ok", name = "N", descriptor = "Z")
	private boolean aBoolean383 = false;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "()V")
	@Override
	protected void method3936() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean383) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4812 << (Static183.aBoolean268 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
	@Override
	public void method3939(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static183.aBoolean268 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4812 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static412.method5588(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3939(Static30.method427(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "()I")
	@Override
	protected int method3930() {
		return this.anInt4812 - (this.aSourceDataLine1.available() >> (Static183.aBoolean268 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3941(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(27) String local27 = local20.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean383 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static3.anInt61, 16, Static183.aBoolean268 ? 2 : 1, true, false);
		this.aByteArray58 = new byte[0x100 << (Static183.aBoolean268 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "()V")
	@Override
	protected void method3929() {
		@Pc(1) short local1 = 256;
		if (Static183.aBoolean268) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray372[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray58[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray58[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray58, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "()V")
	@Override
	protected void method3926() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
