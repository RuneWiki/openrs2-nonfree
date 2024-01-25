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

@OriginalClass("client!sp")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!sp", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!sp", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
	private int anInt7838;

	@OriginalMember(owner = "client!sp", name = "N", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!sp", name = "K", descriptor = "Z")
	private boolean aBoolean665 = false;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	@Override
	public void method6317(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static517.aBoolean697 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt7838 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static142.method4584(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method6317(Static355.method5078(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "()I")
	@Override
	protected int method6316() {
		return this.anInt7838 - (this.aSourceDataLine1.available() >> (Static517.aBoolean697 ? 2 : 1));
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "()V")
	@Override
	protected void method6315() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean665) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt7838 << (Static517.aBoolean697 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "()V")
	@Override
	protected void method6314() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6318(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) javax.sound.sampled.Mixer.Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(28) String local28 = local21.getName();
					if (local28 != null && local28.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean665 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static591.anInt9580, 16, Static517.aBoolean697 ? 2 : 1, true, false);
		this.aByteArray85 = new byte[0x100 << (Static517.aBoolean697 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "()V")
	@Override
	protected void method6313() {
		@Pc(1) short local1 = 256;
		if (Static517.aBoolean697) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray525[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray85[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray85[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray85, 0, local1 << 1);
	}
}
