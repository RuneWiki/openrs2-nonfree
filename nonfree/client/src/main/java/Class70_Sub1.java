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

@OriginalClass("client!cq")
public final class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!cq", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!cq", name = "J", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!cq", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!cq", name = "O", descriptor = "I")
	private int anInt1726;

	@OriginalMember(owner = "client!cq", name = "N", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	private Class70_Sub1() {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	@Override
	public void method9360(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(23) Info local23 = new Info(Static95.aClass15 == null ? (Static95.aClass15 = a("javax.sound.sampled.SourceDataLine")) : Static95.aClass15, this.anAudioFormat1, arg0 << (Static42.aBoolean76 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local23);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1726 = arg0;
		} catch (@Pc(39) LineUnavailableException local39) {
			if (Static55.method813(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local39;
			} else {
				this.method9360(Static330.method4577(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "()V")
	@Override
	protected void method9359() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean200) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(38) Info local38 = new Info(Static95.aClass15 == null ? (Static95.aClass15 = a("javax.sound.sampled.SourceDataLine")) : Static95.aClass15, this.anAudioFormat1, this.anInt1726 << (Static42.aBoolean76 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local38);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "()V")
	@Override
	protected void method9355() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method9361(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) javax.sound.sampled.Mixer.Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(27) String local27 = local21.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean200 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static24.anInt294, 16, Static42.aBoolean76 ? 2 : 1, true, false);
		this.aByteArray20 = new byte[0x100 << (Static42.aBoolean76 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "()I")
	@Override
	protected int method9364() {
		return this.anInt1726 - (this.aSourceDataLine1.available() >> (Static42.aBoolean76 ? 2 : 1));
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "()V")
	@Override
	protected void method9354() {
		@Pc(1) short local1 = 256;
		if (Static42.aBoolean76) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray742[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray20[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray20[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray20, 0, local1 << 1);
	}
}
