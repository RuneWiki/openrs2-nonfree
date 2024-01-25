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

@OriginalClass("client!he")
public final class Class150_Sub1 extends Class150 {

	@OriginalMember(owner = "client!he", name = "M", descriptor = "I")
	private int anInt4341;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!he", name = "L", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!he", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Z")
	private boolean aBoolean347 = false;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	private Class150_Sub1() {
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	@Override
	public void method5496(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(23) Info local23 = new Info(Static218.aClass11 == null ? (Static218.aClass11 = a("javax.sound.sampled.SourceDataLine")) : Static218.aClass11, this.anAudioFormat1, arg0 << (Static30.aBoolean32 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local23);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4341 = arg0;
		} catch (@Pc(39) LineUnavailableException local39) {
			if (Static272.method973(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local39;
			} else {
				this.method5496(Static314.method4970(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
	@Override
	protected void method5488() {
		@Pc(1) short local1 = 256;
		if (Static30.aBoolean32) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray360[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray29[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray29[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray29, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()I")
	@Override
	protected int method5491() {
		return this.anInt4341 - (this.aSourceDataLine1.available() >> (Static30.aBoolean32 ? 2 : 1));
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
	@Override
	protected void method5497() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()V")
	@Override
	protected void method5489() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean347) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(38) Info local38 = new Info(Static218.aClass11 == null ? (Static218.aClass11 = a("javax.sound.sampled.SourceDataLine")) : Static218.aClass11, this.anAudioFormat1, this.anInt4341 << (Static30.aBoolean32 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local38);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5494(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(25) String local25 = local20.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean347 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static90.anInt9479, 16, Static30.aBoolean32 ? 2 : 1, true, false);
		this.aByteArray29 = new byte[0x100 << (Static30.aBoolean32 ? 2 : 1)];
	}
}
