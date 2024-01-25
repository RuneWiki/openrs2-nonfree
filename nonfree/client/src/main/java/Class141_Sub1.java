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

@OriginalClass("client!hw")
public final class Class141_Sub1 extends Class141 {

	@OriginalMember(owner = "client!hw", name = "G", descriptor = "I")
	private int anInt4131;

	@OriginalMember(owner = "client!hw", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!hw", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!hw", name = "L", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!hw", name = "M", descriptor = "Z")
	private boolean aBoolean337 = false;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "()V")
	@Override
	protected void method5528() {
		@Pc(1) short local1 = 256;
		if (Static582.aBoolean692) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray450[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray40[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray40[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray40, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "()I")
	@Override
	protected int method5532() {
		return this.anInt4131 - (this.aSourceDataLine1.available() >> (Static582.aBoolean692 ? 2 : 1));
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
	@Override
	public void method5533(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static582.aBoolean692 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4131 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static351.method5174(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5533(Static200.method3428(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "()V")
	@Override
	protected void method5538() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "()V")
	@Override
	protected void method5536() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean337) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4131 << (Static582.aBoolean692 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5534(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(22) String local22 = local16.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean337 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static426.anInt7216, 16, Static582.aBoolean692 ? 2 : 1, true, false);
		this.aByteArray40 = new byte[0x100 << (Static582.aBoolean692 ? 2 : 1)];
	}
}
