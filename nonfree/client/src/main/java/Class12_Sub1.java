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

@OriginalClass("client!cc")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
	private int anInt490;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
	@Override
	protected void method1525() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	@Override
	public void method1513(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static37.aBoolean28 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt490 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static95.method1610(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1513(Static113.method1867(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1516(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static78.anInt1981, 16, Static37.aBoolean28 ? 2 : 1, true, false);
		this.aByteArray14 = new byte[0x100 << (Static37.aBoolean28 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
	@Override
	protected void method1522() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	@Override
	protected void method1519() {
		@Pc(1) short local1 = 256;
		if (Static37.aBoolean28) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray290[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray14[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray14[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray14, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "()I")
	@Override
	protected int method1524() {
		return this.anInt490 - (this.aSourceDataLine1.available() >> (Static37.aBoolean28 ? 2 : 1));
	}
}
