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

@OriginalClass("client!vd")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "[B")
	private byte[] aByteArray93;

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
	private int anInt6041;

	@OriginalMember(owner = "client!vd", name = "S", descriptor = "Z")
	private boolean aBoolean403 = false;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()V")
	@Override
	protected void method5828() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()I")
	@Override
	protected int method5830() {
		return this.anInt6041 - (this.aSourceDataLine1.available() >> (Static16.aBoolean25 ? 2 : 1));
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	public void method5818(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static16.aBoolean25 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6041 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static321.method5368(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5818(Static247.method4066(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()V")
	@Override
	protected void method5833() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean403) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6041 << (Static16.aBoolean25 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5824(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(27) String local27 = local20.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean403 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static22.anInt358, 16, Static16.aBoolean25 ? 2 : 1, true, false);
		this.aByteArray93 = new byte[0x100 << (Static16.aBoolean25 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()V")
	@Override
	protected void method5826() {
		@Pc(1) short local1 = 256;
		if (Static16.aBoolean25) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray722[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray93[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray93[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray93, 0, local1 << 1);
	}
}
