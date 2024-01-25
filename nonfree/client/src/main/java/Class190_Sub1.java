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

@OriginalClass("client!lga")
public final class Class190_Sub1 extends Class190 {

	@OriginalMember(owner = "client!lga", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!lga", name = "M", descriptor = "[B")
	private byte[] aByteArray65;

	@OriginalMember(owner = "client!lga", name = "N", descriptor = "I")
	private int anInt6037;

	@OriginalMember(owner = "client!lga", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!lga", name = "P", descriptor = "Z")
	private boolean aBoolean406 = false;

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "()I")
	@Override
	protected int method7500() {
		return this.anInt6037 - (this.aSourceDataLine1.available() >> (Static339.aBoolean677 ? 2 : 1));
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7497(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(24) String local24 = local19.getName();
					if (local24 != null && local24.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean406 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static78.anInt1661, 16, Static339.aBoolean677 ? 2 : 1, true, false);
		this.aByteArray65 = new byte[0x100 << (Static339.aBoolean677 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V")
	@Override
	public void method7492(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static339.aBoolean677 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6037 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static406.method6499(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method7492(Static567.method8129(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "()V")
	@Override
	protected void method7489() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "()V")
	@Override
	protected void method7495() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean406) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6037 << (Static339.aBoolean677 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "()V")
	@Override
	protected void method7503() {
		@Pc(1) short local1 = 256;
		if (Static339.aBoolean677) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray540[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray65[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray65[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray65, 0, local1 << 1);
	}
}
