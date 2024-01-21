import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YEQNFKYU")
public final class Class47 {

	@OriginalMember(owner = "client!YEQNFKYU", name = "b", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!YEQNFKYU", name = "e", descriptor = "I")
	private int anInt684;

	@OriginalMember(owner = "client!YEQNFKYU", name = "f", descriptor = "I")
	private int anInt685;

	@OriginalMember(owner = "client!YEQNFKYU", name = "g", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!YEQNFKYU", name = "a", descriptor = "I")
	private int anInt682 = 338;

	@OriginalMember(owner = "client!YEQNFKYU", name = "d", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!YEQNFKYU", name = "c", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!YEQNFKYU", name = "<init>", descriptor = "([II)V")
	public Class47(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.anIntArray173 = new int[256];
			this.anIntArray172 = new int[256];
			for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
				this.anIntArray172[local20] = arg0[local20];
			}
			this.method490();
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("32262, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YEQNFKYU", name = "a", descriptor = "()I")
	public int method488() {
		if (this.anInt683-- == 0) {
			this.method489();
			this.anInt683 = 255;
		}
		return this.anIntArray172[this.anInt683];
	}

	@OriginalMember(owner = "client!YEQNFKYU", name = "b", descriptor = "()V")
	private void method489() {
		this.anInt685 += ++this.anInt686;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray173[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt684 ^= this.anInt684 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt684 ^= this.anInt684 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt684 ^= this.anInt684 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt684 ^= this.anInt684 >>> 16;
			}
			this.anInt684 += this.anIntArray173[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray173[local15] = local115 = this.anIntArray173[local22 >> 2 & 0xFF] + this.anInt684 + this.anInt685;
			this.anIntArray172[local15] = this.anInt685 = this.anIntArray173[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!YEQNFKYU", name = "c", descriptor = "()V")
	private void method490() {
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
			local17 += this.anIntArray172[local19];
			local16 += this.anIntArray172[local19 + 1];
			local14 += this.anIntArray172[local19 + 2];
			local12 += this.anIntArray172[local19 + 3];
			local10 += this.anIntArray172[local19 + 4];
			local8 += this.anIntArray172[local19 + 5];
			local6 += this.anIntArray172[local19 + 6];
			local4 += this.anIntArray172[local19 + 7];
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
			this.anIntArray173[local19] = local17;
			this.anIntArray173[local19 + 1] = local16;
			this.anIntArray173[local19 + 2] = local14;
			this.anIntArray173[local19 + 3] = local12;
			this.anIntArray173[local19 + 4] = local10;
			this.anIntArray173[local19 + 5] = local8;
			this.anIntArray173[local19 + 6] = local6;
			this.anIntArray173[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray173[local19];
			local16 += this.anIntArray173[local19 + 1];
			local14 += this.anIntArray173[local19 + 2];
			local12 += this.anIntArray173[local19 + 3];
			local10 += this.anIntArray173[local19 + 4];
			local8 += this.anIntArray173[local19 + 5];
			local6 += this.anIntArray173[local19 + 6];
			local4 += this.anIntArray173[local19 + 7];
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
			this.anIntArray173[local19] = local17;
			this.anIntArray173[local19 + 1] = local16;
			this.anIntArray173[local19 + 2] = local14;
			this.anIntArray173[local19 + 3] = local12;
			this.anIntArray173[local19 + 4] = local10;
			this.anIntArray173[local19 + 5] = local8;
			this.anIntArray173[local19 + 6] = local6;
			this.anIntArray173[local19 + 7] = local4;
		}
		this.method489();
		this.anInt683 = 256;
	}
}
