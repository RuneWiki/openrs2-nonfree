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

@OriginalClass("client!aq")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!aq", name = "D", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!aq", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!aq", name = "P", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!aq", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!aq", name = "R", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "()V")
	@Override
	protected void method5486() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean28) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt426 << (Static250.aBoolean374 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(I)V")
	@Override
	public void method5484(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static250.aBoolean374 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt426 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static261.method4488(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5484(Static266.method4535(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "()V")
	@Override
	protected void method5487() {
		@Pc(1) short local1 = 256;
		if (Static250.aBoolean374) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray530[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray3[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray3[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray3, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5475(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(21) String local21 = local16.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean28 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static344.anInt1063, 16, Static250.aBoolean374 ? 2 : 1, true, false);
		this.aByteArray3 = new byte[0x100 << (Static250.aBoolean374 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "()V")
	@Override
	protected void method5485() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "()I")
	@Override
	protected int method5476() {
		return this.anInt426 - (this.aSourceDataLine1.available() >> (Static250.aBoolean374 ? 2 : 1));
	}
}
