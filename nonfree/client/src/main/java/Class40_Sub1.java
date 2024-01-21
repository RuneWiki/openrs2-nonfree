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

@OriginalClass("client!qg")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!qg", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!qg", name = "V", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
	private int anInt3482;

	@OriginalMember(owner = "client!qg", name = "X", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2519(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static35.anInt974, 16, Static80.aBoolean110 ? 2 : 1, true, false);
		this.aByteArray32 = new byte[0x100 << (Static80.aBoolean110 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
	@Override
	public void method2524(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static80.aBoolean110 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3482 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static105.method1816(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2524(Static130.method2305(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "()V")
	@Override
	protected void method2520() {
		@Pc(1) short local1 = 256;
		if (Static80.aBoolean110) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray483[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray32[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray32[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray32, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "()V")
	@Override
	protected void method2521() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
	@Override
	protected void method2514() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "()I")
	@Override
	protected int method2518() {
		return this.anInt3482 - (this.aSourceDataLine1.available() >> (Static80.aBoolean110 ? 2 : 1));
	}
}
