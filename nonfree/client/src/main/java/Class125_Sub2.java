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

@OriginalClass("client!ub")
public final class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
	private int anInt6145;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "Z")
	private boolean aBoolean509 = false;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "()V")
	@Override
	protected void method5315() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean509) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6145 << (Static340.aBoolean542 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	@Override
	public void method5312(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static340.aBoolean542 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6145 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static196.method3453(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5312(Static304.method5275(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5304(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) javax.sound.sampled.Mixer.Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(27) String local27 = local21.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean509 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static348.anInt6162, 16, Static340.aBoolean542 ? 2 : 1, true, false);
		this.aByteArray69 = new byte[0x100 << (Static340.aBoolean542 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()I")
	@Override
	protected int method5302() {
		return this.anInt6145 - (this.aSourceDataLine1.available() >> (Static340.aBoolean542 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()V")
	@Override
	protected void method5313() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()V")
	@Override
	protected void method5308() {
		@Pc(1) short local1 = 256;
		if (Static340.aBoolean542) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray588[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray69[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray69[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray69, 0, local1 << 1);
	}
}
