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

@OriginalClass("client!wg")
public final class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
	private int anInt4160;

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	@Override
	public void method3047(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static97.aBoolean323 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4160 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static30.method910(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3047(Static16.method631(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "()V")
	@Override
	protected void method3045() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()V")
	@Override
	protected void method3043() {
		@Pc(1) short local1 = 256;
		if (Static97.aBoolean323) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray456[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray47[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray47[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray47, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()V")
	@Override
	protected void method3041() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3046(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static135.anInt3382, 16, Static97.aBoolean323 ? 2 : 1, true, false);
		this.aByteArray47 = new byte[0x100 << (Static97.aBoolean323 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()I")
	@Override
	protected int method3054() {
		return this.anInt4160 - (this.aSourceDataLine1.available() >> (Static97.aBoolean323 ? 2 : 1));
	}
}
