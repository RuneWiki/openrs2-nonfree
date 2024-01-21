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

@OriginalClass("client!md")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!md", name = "A", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!md", name = "S", descriptor = "I")
	private int anInt1950;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1194(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static116.anInt2873, 16, Static48.aBoolean123 ? 2 : 1, true, false);
		this.aByteArray25 = new byte[0x100 << (Static48.aBoolean123 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	@Override
	public void method1195(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static48.aBoolean123 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1950 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static101.method1703(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1195(Static38.method620(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
	@Override
	protected int method1199() {
		return this.anInt1950 - (this.aSourceDataLine1.available() >> (Static48.aBoolean123 ? 2 : 1));
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "()V")
	@Override
	protected void method1202() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "()V")
	@Override
	protected void method1201() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "()V")
	@Override
	protected void method1196() {
		@Pc(1) short local1 = 256;
		if (Static48.aBoolean123) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray197[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray25[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray25[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray25, 0, local1 << 1);
	}
}
