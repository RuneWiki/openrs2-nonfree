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

@OriginalClass("client!sb")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
	private int anInt2814;

	@OriginalMember(owner = "client!sb", name = "Z", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "()V")
	@Override
	protected void method1920() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "()V")
	@Override
	protected void method1925() {
		@Pc(1) short local1 = 256;
		if (Static31.aBoolean156) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray337[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray35[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray35[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray35, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "()I")
	@Override
	protected int method1919() {
		return this.anInt2814 - (this.aSourceDataLine1.available() >> (Static31.aBoolean156 ? 2 : 1));
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
	@Override
	protected void method1910() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	@Override
	public void method1923(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static31.aBoolean156 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2814 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static25.method2162(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1923(Static18.method277(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1916(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static110.anInt2948, 16, Static31.aBoolean156 ? 2 : 1, true, false);
		this.aByteArray35 = new byte[0x100 << (Static31.aBoolean156 ? 2 : 1)];
	}
}
