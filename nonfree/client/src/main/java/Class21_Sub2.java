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

@OriginalClass("client!ib")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
	private int anInt1945;

	@OriginalMember(owner = "client!ib", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ib", name = "V", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
	@Override
	protected void method1336() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
	@Override
	protected void method1339() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1350(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static113.anInt2749, 16, Static114.aBoolean125 ? 2 : 1, true, false);
		this.aByteArray21 = new byte[0x100 << (Static114.aBoolean125 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "()I")
	@Override
	protected int method1338() {
		return this.anInt1945 - (this.aSourceDataLine1.available() >> (Static114.aBoolean125 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
	@Override
	protected void method1345() {
		@Pc(1) short local1 = 256;
		if (Static114.aBoolean125) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray187[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray21[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray21[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray21, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	@Override
	public void method1335(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static114.aBoolean125 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1945 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static87.method1560(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1335(Static149.method2326(arg0));
			}
		}
	}
}
