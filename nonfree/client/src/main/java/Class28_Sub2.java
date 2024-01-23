import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!wj", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
	private int anInt5724;

	@OriginalMember(owner = "client!wj", name = "T", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!wj", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!wj", name = "R", descriptor = "Z")
	private boolean aBoolean389 = false;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "()V")
	@Override
	protected void method4766() {
		@Pc(1) short local1 = 256;
		if (Static257.aBoolean319) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray505[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray76[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray76[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray76, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4765(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(25) String local25 = local20.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean389 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static303.anInt5383, 16, Static257.aBoolean319 ? 2 : 1, true, false);
		this.aByteArray76 = new byte[0x100 << (Static257.aBoolean319 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
	@Override
	protected void method4763() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean389) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5724 << (Static257.aBoolean319 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "()I")
	@Override
	protected int method4775() {
		return this.anInt5724 - (this.aSourceDataLine1.available() >> (Static257.aBoolean319 ? 2 : 1));
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "()V")
	@Override
	protected void method4773() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
	@Override
	public void method4776(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static257.aBoolean319 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5724 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static309.method4713(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4776(Static218.method1098(arg0));
			}
		}
	}
}
