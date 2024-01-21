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

@OriginalClass("client!ui")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!ui", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ui", name = "K", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
	private int anInt3888;

	@OriginalMember(owner = "client!ui", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ui", name = "L", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "()I")
	@Override
	protected int method2936() {
		return this.anInt3888 - (this.aSourceDataLine1.available() >> (Static30.aBoolean37 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "()V")
	@Override
	protected void method2939() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2937(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(22) String local22 = local15.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean177 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static62.anInt1362, 16, Static30.aBoolean37 ? 2 : 1, true, false);
		this.aByteArray55 = new byte[0x100 << (Static30.aBoolean37 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
	@Override
	public void method2942(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static30.aBoolean37 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3888 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static193.method2878(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2942(Static213.method3129(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "()V")
	@Override
	protected void method2938() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean177) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3888 << (Static30.aBoolean37 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
	@Override
	protected void method2935() {
		@Pc(1) short local1 = 256;
		if (Static30.aBoolean37) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray408[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray55[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray55[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray55, 0, local1 << 1);
	}
}
