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

@OriginalClass("client!mb")
public final class Class105_Sub2 extends Class105 {

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
	private int anInt3149;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!mb", name = "O", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
	@Override
	protected void method2773() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()V")
	@Override
	protected void method2780() {
		@Pc(1) short local1 = 256;
		if (Static105.aBoolean156) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray367[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray40[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray40[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray40, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	@Override
	public void method2772(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static105.aBoolean156 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3149 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static314.method5010(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2772(Static165.method2731(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()I")
	@Override
	protected int method2769() {
		return this.anInt3149 - (this.aSourceDataLine1.available() >> (Static105.aBoolean156 ? 2 : 1));
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()V")
	@Override
	protected void method2775() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean226) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3149 << (Static105.aBoolean156 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2778(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(22) String local22 = local17.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean226 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static155.anInt2915, 16, Static105.aBoolean156 ? 2 : 1, true, false);
		this.aByteArray40 = new byte[0x100 << (Static105.aBoolean156 ? 2 : 1)];
	}
}
