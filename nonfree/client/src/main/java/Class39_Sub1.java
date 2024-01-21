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

@OriginalClass("client!ld")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!ld", name = "gb", descriptor = "I")
	private int anInt1757;

	@OriginalMember(owner = "client!ld", name = "hb", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ld", name = "ib", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!ld", name = "jb", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "()I")
	@Override
	protected int method1687() {
		return this.anInt1757 - (this.aSourceDataLine1.available() >> (Static70.aBoolean68 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1680(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static31.anInt846, 16, Static70.aBoolean68 ? 2 : 1, true, false);
		this.aByteArray70 = new byte[0x100 << (Static70.aBoolean68 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
	@Override
	protected void method1676() {
		@Pc(1) short local1 = 256;
		if (Static70.aBoolean68) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray234[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray70[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray70[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray70, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "()V")
	@Override
	protected void method1688() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	@Override
	public void method1677(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static70.aBoolean68 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1757 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static23.method460(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1677(Static20.method360(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "()V")
	@Override
	protected void method1681() {
		this.aSourceDataLine1.flush();
	}
}
