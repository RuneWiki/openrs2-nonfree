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

@OriginalClass("client!fb")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
	private int anInt2936;

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "()V")
	@Override
	protected void method4215() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean220) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2936 << (Static411.aBoolean570 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "()I")
	@Override
	protected int method4219() {
		return this.anInt2936 - (this.aSourceDataLine1.available() >> (Static411.aBoolean570 ? 2 : 1));
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
	@Override
	protected void method4212() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	@Override
	public void method4211(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static411.aBoolean570 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2936 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static279.method4565(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4211(Static533.method1203(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	@Override
	protected void method4210() {
		@Pc(1) short local1 = 256;
		if (Static411.aBoolean570) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray272[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray29[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray29[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray29, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4217(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(23) String local23 = local17.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean220 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static168.anInt3272, 16, Static411.aBoolean570 ? 2 : 1, true, false);
		this.aByteArray29 = new byte[0x100 << (Static411.aBoolean570 ? 2 : 1)];
	}
}
