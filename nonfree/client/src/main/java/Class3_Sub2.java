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

@OriginalClass("client!qc")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!qc", name = "U", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!qc", name = "V", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
	private int anInt2207;

	@OriginalMember(owner = "client!qc", name = "X", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()I")
	@Override
	protected int method1525() {
		return this.anInt2207 - (this.aSourceDataLine1.available() >> (Static72.aBoolean117 ? 2 : 1));
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "()V")
	@Override
	protected void method1528() {
		@Pc(1) short local1 = 256;
		if (Static72.aBoolean117) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray309[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray47[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray47[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray47, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1531(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static106.anInt2355, 16, Static72.aBoolean117 ? 2 : 1, true, false);
		this.aByteArray47 = new byte[0x100 << (Static72.aBoolean117 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
	@Override
	protected void method1529() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	@Override
	public void method1527(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static72.aBoolean117 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2207 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static134.method2019(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1527(Static74.method1368(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
	@Override
	protected void method1517() {
		this.aSourceDataLine1.flush();
	}
}
