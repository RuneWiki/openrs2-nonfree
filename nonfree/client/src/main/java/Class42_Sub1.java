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

@OriginalClass("client!hh")
public final class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
	private int anInt1879;

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!hh", name = "S", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "()V")
	@Override
	protected void method2428() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean91) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1879 << (Static138.aBoolean145 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2419(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local7];
				if (local17 != null) {
					@Pc(23) String local23 = local17.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean91 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static148.anInt3288, 16, Static138.aBoolean145 ? 2 : 1, true, false);
		this.aByteArray18 = new byte[0x100 << (Static138.aBoolean145 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	@Override
	public void method2417(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static138.aBoolean145 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1879 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static2.method86(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2417(Static208.method3518(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
	@Override
	protected void method2420() {
		@Pc(1) short local1 = 256;
		if (Static138.aBoolean145) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray256[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray18[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray18[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray18, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "()V")
	@Override
	protected void method2421() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "()I")
	@Override
	protected int method2423() {
		return this.anInt1879 - (this.aSourceDataLine1.available() >> (Static138.aBoolean145 ? 2 : 1));
	}
}
