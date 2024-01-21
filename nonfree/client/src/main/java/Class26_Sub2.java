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

@OriginalClass("client!qf")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
	private int anInt2485;

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1808(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static123.anInt3048, 16, Static7.aBoolean9 ? 2 : 1, true, false);
		this.aByteArray30 = new byte[0x100 << (Static7.aBoolean9 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()V")
	@Override
	protected void method1796() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	@Override
	public void method1797(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static7.aBoolean9 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2485 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static55.method981(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1797(Static49.method798(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()V")
	@Override
	protected void method1806() {
		@Pc(1) short local1 = 256;
		if (Static7.aBoolean9) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray278[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray30[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray30[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray30, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()I")
	@Override
	protected int method1795() {
		return this.anInt2485 - (this.aSourceDataLine1.available() >> (Static7.aBoolean9 ? 2 : 1));
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "()V")
	@Override
	protected void method1804() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
