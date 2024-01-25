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

@OriginalClass("client!bj")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!bj", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!bj", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!bj", name = "L", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!bj", name = "H", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	@Override
	public void method6324(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static41.aBoolean53 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1028 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static383.method6466(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method6324(Static432.method7064(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
	@Override
	protected void method6321() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean62) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1028 << (Static41.aBoolean53 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6332(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(25) String local25 = local19.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean62 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static237.anInt4718, 16, Static41.aBoolean53 ? 2 : 1, true, false);
		this.aByteArray13 = new byte[0x100 << (Static41.aBoolean53 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()V")
	@Override
	protected void method6326() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "()I")
	@Override
	protected int method6334() {
		return this.anInt1028 - (this.aSourceDataLine1.available() >> (Static41.aBoolean53 ? 2 : 1));
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "()V")
	@Override
	protected void method6335() {
		@Pc(1) short local1 = 256;
		if (Static41.aBoolean53) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray335[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray13[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray13[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray13, 0, local1 << 1);
	}
}
