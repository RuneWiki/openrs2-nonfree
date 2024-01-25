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

@OriginalClass("client!bm")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!bm", name = "L", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!bm", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!bm", name = "K", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V")
	@Override
	public void method2881(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static440.aBoolean586 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1027 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static468.method6749(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2881(Static347.method5404(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "()V")
	@Override
	protected void method2873() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "()V")
	@Override
	protected void method2879() {
		@Pc(1) short local1 = 256;
		if (Static440.aBoolean586) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray247[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray11[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray11[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray11, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2876(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(22) String local22 = local16.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean72 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static66.anInt1396, 16, Static440.aBoolean586 ? 2 : 1, true, false);
		this.aByteArray11 = new byte[0x100 << (Static440.aBoolean586 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "()I")
	@Override
	protected int method2875() {
		return this.anInt1027 - (this.aSourceDataLine1.available() >> (Static440.aBoolean586 ? 2 : 1));
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "()V")
	@Override
	protected void method2889() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean72) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1027 << (Static440.aBoolean586 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
