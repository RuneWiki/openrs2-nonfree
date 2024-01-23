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

@OriginalClass("client!ok")
public final class Class112_Sub1 extends Class112 {

	@OriginalMember(owner = "client!ok", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ok", name = "N", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
	private int anInt3978;

	@OriginalMember(owner = "client!ok", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ok", name = "L", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "()V")
	@Override
	protected void method4451() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean246) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3978 << (Static155.aBoolean207 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "()V")
	@Override
	protected void method4450() {
		@Pc(1) short local1 = 256;
		if (Static155.aBoolean207) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray448[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray54[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray54[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray54, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "()I")
	@Override
	protected int method4449() {
		return this.anInt3978 - (this.aSourceDataLine1.available() >> (Static155.aBoolean207 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	@Override
	public void method4457(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static155.aBoolean207 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3978 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static279.method4351(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4457(Static308.method4715(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4448(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) javax.sound.sampled.Mixer.Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(28) String local28 = local21.getName();
					if (local28 != null && local28.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean246 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static75.anInt1523, 16, Static155.aBoolean207 ? 2 : 1, true, false);
		this.aByteArray54 = new byte[0x100 << (Static155.aBoolean207 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "()V")
	@Override
	protected void method4460() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
