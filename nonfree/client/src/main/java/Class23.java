import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LAXXBEFB")
public final class Class23 {

	@OriginalMember(owner = "client!LAXXBEFB", name = "a", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!LAXXBEFB", name = "d", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!LAXXBEFB", name = "e", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!LAXXBEFB", name = "f", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!LAXXBEFB", name = "c", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!LAXXBEFB", name = "b", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!LAXXBEFB", name = "<init>", descriptor = "([IZ)V")
	public Class23(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anIntArray80 = new int[256];
			this.anIntArray79 = new int[256];
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				this.anIntArray79[local11] = arg0[local11];
			}
			this.method163();
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("41309, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAXXBEFB", name = "a", descriptor = "()I")
	public int method161() {
		if (this.anInt250-- == 0) {
			this.method162();
			this.anInt250 = 255;
		}
		return this.anIntArray79[this.anInt250];
	}

	@OriginalMember(owner = "client!LAXXBEFB", name = "b", descriptor = "()V")
	private void method162() {
		this.anInt252 += ++this.anInt253;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray80[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt251 ^= this.anInt251 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt251 ^= this.anInt251 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt251 ^= this.anInt251 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt251 ^= this.anInt251 >>> 16;
			}
			this.anInt251 += this.anIntArray80[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray80[local15] = local115 = this.anIntArray80[local22 >> 2 & 0xFF] + this.anInt251 + this.anInt252;
			this.anIntArray79[local15] = this.anInt252 = this.anIntArray80[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!LAXXBEFB", name = "c", descriptor = "()V")
	private void method163() {
		@Pc(4) int local4 = -1640531527;
		@Pc(6) int local6 = -1640531527;
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19;
		for (local19 = 0; local19 < 4; local19++) {
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray79[local19];
			local16 += this.anIntArray79[local19 + 1];
			local14 += this.anIntArray79[local19 + 2];
			local12 += this.anIntArray79[local19 + 3];
			local10 += this.anIntArray79[local19 + 4];
			local8 += this.anIntArray79[local19 + 5];
			local6 += this.anIntArray79[local19 + 6];
			local4 += this.anIntArray79[local19 + 7];
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
			this.anIntArray80[local19] = local17;
			this.anIntArray80[local19 + 1] = local16;
			this.anIntArray80[local19 + 2] = local14;
			this.anIntArray80[local19 + 3] = local12;
			this.anIntArray80[local19 + 4] = local10;
			this.anIntArray80[local19 + 5] = local8;
			this.anIntArray80[local19 + 6] = local6;
			this.anIntArray80[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray80[local19];
			local16 += this.anIntArray80[local19 + 1];
			local14 += this.anIntArray80[local19 + 2];
			local12 += this.anIntArray80[local19 + 3];
			local10 += this.anIntArray80[local19 + 4];
			local8 += this.anIntArray80[local19 + 5];
			local6 += this.anIntArray80[local19 + 6];
			local4 += this.anIntArray80[local19 + 7];
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
			this.anIntArray80[local19] = local17;
			this.anIntArray80[local19 + 1] = local16;
			this.anIntArray80[local19 + 2] = local14;
			this.anIntArray80[local19 + 3] = local12;
			this.anIntArray80[local19 + 4] = local10;
			this.anIntArray80[local19 + 5] = local8;
			this.anIntArray80[local19 + 6] = local6;
			this.anIntArray80[local19 + 7] = local4;
		}
		this.method162();
		this.anInt250 = 256;
	}
}
