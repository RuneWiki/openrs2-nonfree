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

@OriginalClass("client!uh")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
	private int anInt4128;

	@OriginalMember(owner = "client!uh", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!uh", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!uh", name = "Q", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "()V")
	@Override
	protected void method2942() {
		@Pc(1) short local1 = 256;
		if (Static112.aBoolean97) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray492[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray48[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray48[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray48, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "()V")
	@Override
	protected void method2956() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean166) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4128 << (Static112.aBoolean97 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	@Override
	public void method2953(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static112.aBoolean97 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4128 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static7.method155(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2953(Static129.method1945(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "()I")
	@Override
	protected int method2950() {
		return this.anInt4128 - (this.aSourceDataLine1.available() >> (Static112.aBoolean97 ? 2 : 1));
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2939(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(22) String local22 = local16.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean166 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static47.anInt1073, 16, Static112.aBoolean97 ? 2 : 1, true, false);
		this.aByteArray48 = new byte[0x100 << (Static112.aBoolean97 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "()V")
	@Override
	protected void method2948() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
