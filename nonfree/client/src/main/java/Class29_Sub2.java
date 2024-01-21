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

@OriginalClass("client!oe")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!oe", name = "W", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
	private int anInt2103;

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!oe", name = "Z", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "()I")
	@Override
	protected int method1277() {
		return this.anInt2103 - (this.aSourceDataLine1.available() >> (Static36.aBoolean74 ? 2 : 1));
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
	@Override
	public void method1279(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static36.aBoolean74 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2103 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static11.method182(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1279(Static64.method1081(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1268(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static35.anInt1167, 16, Static36.aBoolean74 ? 2 : 1, true, false);
		this.aByteArray33 = new byte[0x100 << (Static36.aBoolean74 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "()V")
	@Override
	protected void method1269() {
		@Pc(1) short local1 = 256;
		if (Static36.aBoolean74) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray279[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray33[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray33[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray33, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "()V")
	@Override
	protected void method1273() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
	@Override
	protected void method1265() {
		this.aSourceDataLine1.flush();
	}
}
