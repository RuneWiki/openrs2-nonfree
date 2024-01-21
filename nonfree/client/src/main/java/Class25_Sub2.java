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

@OriginalClass("client!je")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!je", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!je", name = "O", descriptor = "I")
	private int anInt2234;

	@OriginalMember(owner = "client!je", name = "P", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!je", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()V")
	@Override
	protected void method1557() {
		@Pc(1) short local1 = 256;
		if (Static71.aBoolean84) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray197[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray28[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray28[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray28, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "()I")
	@Override
	protected int method1559() {
		return this.anInt2234 - (this.aSourceDataLine1.available() >> (Static71.aBoolean84 ? 2 : 1));
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "()V")
	@Override
	protected void method1558() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1555(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static74.anInt2248, 16, Static71.aBoolean84 ? 2 : 1, true, false);
		this.aByteArray28 = new byte[0x100 << (Static71.aBoolean84 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
	@Override
	protected void method1554() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	@Override
	public void method1564(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static71.aBoolean84 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2234 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static53.method1132(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1564(Static6.method112(arg0));
			}
		}
	}
}
