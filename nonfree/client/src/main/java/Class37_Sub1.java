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

@OriginalClass("client!f")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!f", name = "K", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!f", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!f", name = "M", descriptor = "I")
	private int anInt2345;

	@OriginalMember(owner = "client!f", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!f", name = "I", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4373(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(10) int local10 = 0; local10 < local1.length; local10++) {
				@Pc(22) Info local22 = local1[local10];
				if (local22 != null) {
					@Pc(30) String local30 = local22.getName();
					if (local30 != null && local30.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean160 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static157.anInt2396, 16, Static583.aBoolean664 ? 2 : 1, true, false);
		this.aByteArray41 = new byte[0x100 << (Static583.aBoolean664 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	@Override
	public void method4372(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(23) javax.sound.sampled.DataLine.Info local23 = new javax.sound.sampled.DataLine.Info(Static150.aClass14 == null ? (Static150.aClass14 = a("javax.sound.sampled.SourceDataLine")) : Static150.aClass14, this.anAudioFormat1, arg0 << (Static583.aBoolean664 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local23);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2345 = arg0;
		} catch (@Pc(39) LineUnavailableException local39) {
			if (Static248.method4213(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local39;
			} else {
				this.method4372(Static255.method4294(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()I")
	@Override
	protected int method4375() {
		return this.anInt2345 - (this.aSourceDataLine1.available() >> (Static583.aBoolean664 ? 2 : 1));
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()V")
	@Override
	protected void method4383() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
	@Override
	protected void method4374() {
		@Pc(1) short local1 = 256;
		if (Static583.aBoolean664) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray247[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray41[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray41[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray41, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
	@Override
	protected void method4378() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean160) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(38) javax.sound.sampled.DataLine.Info local38 = new javax.sound.sampled.DataLine.Info(Static150.aClass14 == null ? (Static150.aClass14 = a("javax.sound.sampled.SourceDataLine")) : Static150.aClass14, this.anAudioFormat1, this.anInt2345 << (Static583.aBoolean664 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local38);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
