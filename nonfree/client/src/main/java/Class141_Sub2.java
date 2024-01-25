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

@OriginalClass("client!sv")
public final class Class141_Sub2 extends Class141 {

	@OriginalMember(owner = "client!sv", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!sv", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
	private int anInt6630;

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "[B")
	private byte[] aByteArray182;

	@OriginalMember(owner = "client!sv", name = "H", descriptor = "Z")
	private boolean aBoolean570 = false;

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "()V")
	@Override
	protected void method5193() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean570) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6630 << (Static451.aBoolean125 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5189(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) javax.sound.sampled.Mixer.Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(21) String local21 = local15.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean570 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static369.anInt6566, 16, Static451.aBoolean125 ? 2 : 1, true, false);
		this.aByteArray182 = new byte[0x100 << (Static451.aBoolean125 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
	@Override
	public void method5191(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static451.aBoolean125 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6630 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static276.method4100(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5191(Static316.method4530(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "()V")
	@Override
	protected void method5194() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "()I")
	@Override
	protected int method5195() {
		return this.anInt6630 - (this.aSourceDataLine1.available() >> (Static451.aBoolean125 ? 2 : 1));
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "()V")
	@Override
	protected void method5192() {
		@Pc(1) short local1 = 256;
		if (Static451.aBoolean125) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray440[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray182[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray182[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray182, 0, local1 << 1);
	}
}
