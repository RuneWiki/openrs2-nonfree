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

@OriginalClass("client!to")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!to", name = "G", descriptor = "I")
	private int anInt8495;

	@OriginalMember(owner = "client!to", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!to", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!to", name = "K", descriptor = "[B")
	private byte[] aByteArray98;

	@OriginalMember(owner = "client!to", name = "H", descriptor = "Z")
	private boolean aBoolean622 = false;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "()V")
	@Override
	protected void method7026() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
	@Override
	public void method7024(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static8.aBoolean56 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt8495 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static543.method7765(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method7024(Static483.method7134(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7021(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(26) String local26 = local19.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean622 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static361.anInt6755, 16, Static8.aBoolean56 ? 2 : 1, true, false);
		this.aByteArray98 = new byte[0x100 << (Static8.aBoolean56 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "()I")
	@Override
	protected int method7018() {
		return this.anInt8495 - (this.aSourceDataLine1.available() >> (Static8.aBoolean56 ? 2 : 1));
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "()V")
	@Override
	protected void method7023() {
		@Pc(1) short local1 = 256;
		if (Static8.aBoolean56) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray727[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray98[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray98[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray98, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "()V")
	@Override
	protected void method7020() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean622) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt8495 << (Static8.aBoolean56 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
