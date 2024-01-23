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

@OriginalClass("client!ii")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ii", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
	private int anInt2143;

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()I")
	@Override
	protected int method1497() {
		return this.anInt2143 - (this.aSourceDataLine1.available() >> (Static6.aBoolean13 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "()V")
	@Override
	protected void method1499() {
		@Pc(1) short local1 = 256;
		if (Static6.aBoolean13) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray207[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray29[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray29[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray29, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "()V")
	@Override
	protected void method1512() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean113) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2143 << (Static6.aBoolean13 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	@Override
	public void method1508(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static6.aBoolean13 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2143 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static140.method2218(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1508(Static163.method2657(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1511(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(23) String local23 = local17.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean113 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static10.anInt374, 16, Static6.aBoolean13 ? 2 : 1, true, false);
		this.aByteArray29 = new byte[0x100 << (Static6.aBoolean13 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()V")
	@Override
	protected void method1507() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
