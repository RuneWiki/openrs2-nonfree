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

@OriginalClass("client!br")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!br", name = "Q", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!br", name = "T", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!br", name = "O", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!br", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!br", name = "P", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	private Class45_Sub1() {
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "()V")
	@Override
	protected void method7447() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "()V")
	@Override
	protected void method7458() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean70) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(38) Info local38 = new Info(Static48.aClass4 == null ? (Static48.aClass4 = a("javax.sound.sampled.SourceDataLine")) : Static48.aClass4, this.anAudioFormat1, this.anInt862 << (Static404.aBoolean460 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local38);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(23) Info local23 = new Info(Static48.aClass4 == null ? (Static48.aClass4 = a("javax.sound.sampled.SourceDataLine")) : Static48.aClass4, this.anAudioFormat1, arg0 << (Static404.aBoolean460 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local23);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt862 = arg0;
		} catch (@Pc(39) LineUnavailableException local39) {
			if (Static580.method7998(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local39;
			} else {
				this.method7456(Static146.method2737(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7461(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(24) String local24 = local16.getName();
					if (local24 != null && local24.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean70 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static417.anInt7038, 16, Static404.aBoolean460 ? 2 : 1, true, false);
		this.aByteArray15 = new byte[0x100 << (Static404.aBoolean460 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "()V")
	@Override
	protected void method7449() {
		@Pc(1) short local1 = 256;
		if (Static404.aBoolean460) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray495[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray15[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray15[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray15, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "()I")
	@Override
	protected int method7460() {
		return this.anInt862 - (this.aSourceDataLine1.available() >> (Static404.aBoolean460 ? 2 : 1));
	}
}
