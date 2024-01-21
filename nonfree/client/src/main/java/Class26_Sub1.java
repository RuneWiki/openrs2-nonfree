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

@OriginalClass("client!od")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!od", name = "db", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
	private int anInt2087;

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()I")
	@Override
	protected int method1922() {
		return this.anInt2087 - (this.aSourceDataLine1.available() >> (Static18.aBoolean56 ? 2 : 1));
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1937(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static44.anInt1243, 16, Static18.aBoolean56 ? 2 : 1, true, false);
		this.aByteArray66 = new byte[0x100 << (Static18.aBoolean56 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	@Override
	public void method1928(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static18.aBoolean56 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2087 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static95.method2009(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1928(Static128.method2208(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()V")
	@Override
	protected void method1931() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
	@Override
	protected void method1923() {
		@Pc(1) short local1 = 256;
		if (Static18.aBoolean56) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray421[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray66[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray66[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray66, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()V")
	@Override
	protected void method1933() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
