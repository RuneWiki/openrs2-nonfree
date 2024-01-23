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

@OriginalClass("client!ve")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!ve", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
	private int anInt4699;

	@OriginalMember(owner = "client!ve", name = "fb", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!ve", name = "hb", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()I")
	@Override
	protected int method3709() {
		return this.anInt4699 - (this.aSourceDataLine1.available() >> (Static40.aBoolean26 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	@Override
	public void method3706(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static40.aBoolean26 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4699 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static212.method3693(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3706(Static185.method3424(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
	@Override
	protected void method3704() {
		@Pc(1) short local1 = 256;
		if (Static40.aBoolean26) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray744[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray55[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray55[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray55, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "()V")
	@Override
	protected void method3716() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "()V")
	@Override
	protected void method3718() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean202) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4699 << (Static40.aBoolean26 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3714(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(23) String local23 = local16.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean202 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static161.anInt3727, 16, Static40.aBoolean26 ? 2 : 1, true, false);
		this.aByteArray55 = new byte[0x100 << (Static40.aBoolean26 ? 2 : 1)];
	}
}
