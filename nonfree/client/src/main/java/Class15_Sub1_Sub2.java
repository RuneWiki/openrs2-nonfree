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

@OriginalClass("client!pc")
public final class Class15_Sub1_Sub2 extends Class15_Sub1 {

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!pc", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!pc", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	@Override
	protected void method1353(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static106.aBoolean147 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
		} catch (@Pc(33) LineUnavailableException local33) {
			this.aSourceDataLine1 = null;
			throw local33;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()V")
	@Override
	protected void method1352() {
		@Pc(1) short local1 = 256;
		if (Static106.aBoolean147) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(16) int local16 = Static77.anIntArray231[local9];
			if ((local16 + 8388608 & 0xFF000000) != 0) {
				local16 = local16 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray15[local9 * 2] = (byte) (local16 >> 8);
			this.aByteArray15[local9 * 2 + 1] = (byte) (local16 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray15, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	@Override
	public void method1355(@OriginalArg(0) Component arg0) {
		Static17.anInt610 = 22050;
		Static106.aBoolean147 = false;
		this.anAudioFormat1 = new AudioFormat((float) Static17.anInt610, 16, Static106.aBoolean147 ? 2 : 1, true, false);
		this.aByteArray15 = new byte[0x100 << (Static106.aBoolean147 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "()I")
	@Override
	protected int method1354() {
		return this.aSourceDataLine1.available() >> (Static106.aBoolean147 ? 2 : 1);
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "()V")
	@Override
	protected void method1357() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
