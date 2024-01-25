import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class175_Sub2 extends Class175 {

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
	private int anInt5486;

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "Z")
	private boolean aBoolean423 = false;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	private Class175_Sub2() {
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "()I")
	@Override
	protected int method4707() {
		return this.anInt5486 - (this.aSourceDataLine1.available() >> (Static128.aBoolean541 ? 2 : 1));
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4697(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(25) String local25 = local17.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean423 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static608.anInt10099, 16, Static128.aBoolean541 ? 2 : 1, true, false);
		this.aByteArray44 = new byte[0x100 << (Static128.aBoolean541 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "()V")
	@Override
	protected void method4706() {
		@Pc(1) short local1 = 256;
		if (Static128.aBoolean541) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray305[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray44[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray44[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray44, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "()V")
	@Override
	protected void method4693() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean423) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(38) javax.sound.sampled.DataLine.Info local38 = new javax.sound.sampled.DataLine.Info(Static308.aClass14 == null ? (Static308.aClass14 = a("javax.sound.sampled.SourceDataLine")) : Static308.aClass14, this.anAudioFormat1, this.anInt5486 << (Static128.aBoolean541 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local38);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	@Override
	public void method4699(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(23) javax.sound.sampled.DataLine.Info local23 = new javax.sound.sampled.DataLine.Info(Static308.aClass14 == null ? (Static308.aClass14 = a("javax.sound.sampled.SourceDataLine")) : Static308.aClass14, this.anAudioFormat1, arg0 << (Static128.aBoolean541 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local23);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5486 = arg0;
		} catch (@Pc(39) LineUnavailableException local39) {
			if (Static436.method6477(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local39;
			} else {
				this.method4699(Static94.method1393(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "()V")
	@Override
	protected void method4696() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
