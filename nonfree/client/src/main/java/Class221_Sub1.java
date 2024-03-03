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

@OriginalClass("client!vb")
public final class Class221_Sub1 extends Class221 {

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "[B")
	private byte[] aByteArray97;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	private int anInt6752;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "Z")
	private boolean aBoolean462 = false;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()V", line = 11)
	@Override
	protected void method6325() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V", line = 25)
	@Override
	public void method6333(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static329.aBoolean93 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6752 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static28.method941(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method6333(Static152.method2978(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 47)
	@Override
	public void method6328(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(21) String local21 = local16.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean462 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static331.anInt6630, 16, Static329.aBoolean93 ? 2 : 1, true, false);
		this.aByteArray97 = new byte[0x100 << (Static329.aBoolean93 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()I", line = 84)
	@Override
	protected int method6322() {
		return this.anInt6752 - (this.aSourceDataLine1.available() >> (Static329.aBoolean93 ? 2 : 1));
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "()V", line = 93)
	@Override
	protected void method6330() {
		@Pc(1) short local1 = 256;
		if (Static329.aBoolean93) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray485[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray97[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray97[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray97, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()V", line = 126)
	@Override
	protected void method6323() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean462) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6752 << (Static329.aBoolean93 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
