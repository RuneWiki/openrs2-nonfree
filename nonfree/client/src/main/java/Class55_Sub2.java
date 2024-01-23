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

@OriginalClass("client!qd")
public final class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
	private int anInt4265;

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!qd", name = "S", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "()V")
	@Override
	protected void method3221() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean208) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4265 << (Static121.aBoolean167 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
	@Override
	protected void method3209() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "()V")
	@Override
	protected void method3211() {
		@Pc(1) short local1 = 256;
		if (Static121.aBoolean167) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray320[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray47[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray47[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray47, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	@Override
	public void method3206(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static121.aBoolean167 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4265 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static132.method2485(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3206(Static110.method2245(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3213(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(26) String local26 = local19.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean208 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static107.anInt2862, 16, Static121.aBoolean167 ? 2 : 1, true, false);
		this.aByteArray47 = new byte[0x100 << (Static121.aBoolean167 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "()I")
	@Override
	protected int method3214() {
		return this.anInt4265 - (this.aSourceDataLine1.available() >> (Static121.aBoolean167 ? 2 : 1));
	}
}
