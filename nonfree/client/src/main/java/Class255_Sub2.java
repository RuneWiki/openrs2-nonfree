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
public final class Class255_Sub2 extends Class255 {

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
	private int anInt8776;

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "Z")
	private boolean aBoolean746 = false;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "()I")
	@Override
	protected int method7450() {
		return this.anInt8776 - (this.aSourceDataLine1.available() >> (Static143.aBoolean243 ? 2 : 1));
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
	@Override
	protected void method7445() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	@Override
	public void method7459(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static143.aBoolean243 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt8776 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static161.method4588(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method7459(Static67.method917(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "()V")
	@Override
	protected void method7448() {
		@Pc(1) short local1 = 256;
		if (Static143.aBoolean243) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray493[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray84[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray84[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray84, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7455(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) javax.sound.sampled.Mixer.Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(27) String local27 = local21.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean746 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static302.anInt5797, 16, Static143.aBoolean243 ? 2 : 1, true, false);
		this.aByteArray84 = new byte[0x100 << (Static143.aBoolean243 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "()V")
	@Override
	protected void method7461() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean746) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt8776 << (Static143.aBoolean243 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
