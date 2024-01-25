import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!hp", name = "X", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!hp", name = "Y", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!hp", name = "Z", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!hp", name = "ab", descriptor = "I")
	private int anInt2931;

	@OriginalMember(owner = "client!hp", name = "bb", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "()V")
	@Override
	protected void method2553() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "()I")
	@Override
	protected int method2557() {
		return this.anInt2931 - (this.aSourceDataLine1.available() >> (Static314.aBoolean451 ? 2 : 1));
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2555(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(27) String local27 = local21.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean210 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static251.anInt5134, 16, Static314.aBoolean451 ? 2 : 1, true, false);
		this.aByteArray46 = new byte[0x100 << (Static314.aBoolean451 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "()V")
	@Override
	protected void method2558() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean210) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2931 << (Static314.aBoolean451 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "()V")
	@Override
	protected void method2565() {
		@Pc(1) short local1 = 256;
		if (Static314.aBoolean451) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray255[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray46[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray46[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray46, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	@Override
	public void method2552(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static314.aBoolean451 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2931 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static354.method5639(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2552(Static28.method5505(arg0));
			}
		}
	}
}
