import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class60 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	private int anInt2735;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
	private int anInt2741;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
	private int anInt2744;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
	private int anInt2745;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "[I")
	private final int[] anIntArray332 = new int[256];

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "[I")
	private final int[] anIntArray333 = new int[256];

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "([I)V")
	public Class60(@OriginalArg(0) int[] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray333[local11] = arg0[local11];
		}
		this.method1951();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
	public int method1947() {
		if (this.anInt2744-- == 0) {
			this.method1948();
			this.anInt2744 = 255;
		}
		return this.anIntArray333[this.anInt2744];
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	private void method1948() {
		this.anInt2741 += ++this.anInt2735;
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(27) int local27 = this.anIntArray332[local21];
			if ((local21 & 0x2) == 0) {
				if ((local21 & 0x1) == 0) {
					this.anInt2745 ^= this.anInt2745 << 13;
				} else {
					this.anInt2745 ^= this.anInt2745 >>> 6;
				}
			} else if ((local21 & 0x1) == 0) {
				this.anInt2745 ^= this.anInt2745 << 2;
			} else {
				this.anInt2745 ^= this.anInt2745 >>> 16;
			}
			this.anInt2745 += this.anIntArray332[local21 + 128 & 0xFF];
			@Pc(113) int local113;
			this.anIntArray332[local21] = local113 = this.anInt2745 + this.anIntArray332[local27 >> 2 & 0xFF] + this.anInt2741;
			this.anIntArray333[local21] = this.anInt2741 = local27 + this.anIntArray332[local113 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	private void method1951() {
		@Pc(6) int local6 = -1640531527;
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(29) int local29;
		for (local29 = 0; local29 < 4; local29++) {
			local19 ^= local18 << 11;
			local14 += local19;
			local18 += local16;
			local18 ^= local16 >>> 2;
			local16 += local14;
			local16 ^= local14 << 8;
			local12 += local18;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 << 10;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local19 += local10;
			local6 += local12;
			local8 += local6;
			local8 ^= local6 << 8;
			local18 += local8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local19 += local18;
			local16 += local6;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local12 += this.anIntArray333[local29 + 4];
			local10 += this.anIntArray333[local29 + 5];
			local18 += this.anIntArray333[local29 + 1];
			local14 += this.anIntArray333[local29 + 3];
			local16 += this.anIntArray333[local29 + 2];
			local19 += this.anIntArray333[local29];
			local19 ^= local18 << 11;
			local14 += local19;
			local6 += this.anIntArray333[local29 + 7];
			local8 += this.anIntArray333[local29 + 6];
			local18 += local16;
			local18 ^= local16 >>> 2;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local12 ^= local10 << 10;
			local8 += local14;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local19 += local10;
			local8 += local6;
			local8 ^= local6 << 8;
			local6 += local19;
			local18 += local8;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local19 += local18;
			this.anIntArray332[local29] = local19;
			this.anIntArray332[local29 + 1] = local18;
			this.anIntArray332[local29 + 2] = local16;
			this.anIntArray332[local29 + 3] = local14;
			this.anIntArray332[local29 + 4] = local12;
			this.anIntArray332[local29 + 5] = local10;
			this.anIntArray332[local29 + 6] = local8;
			this.anIntArray332[local29 + 7] = local6;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local12 += this.anIntArray332[local29 + 4];
			local16 += this.anIntArray332[local29 + 2];
			local10 += this.anIntArray332[local29 + 5];
			local19 += this.anIntArray332[local29];
			local6 += this.anIntArray332[local29 + 7];
			local8 += this.anIntArray332[local29 + 6];
			local18 += this.anIntArray332[local29 + 1];
			local19 ^= local18 << 11;
			local14 += this.anIntArray332[local29 + 3];
			local18 += local16;
			local14 += local19;
			local18 ^= local16 >>> 2;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 >>> 16;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 << 10;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local19 += local10;
			local8 += local6;
			local8 ^= local6 << 8;
			local18 += local8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local19 += local18;
			local16 += local6;
			this.anIntArray332[local29] = local19;
			this.anIntArray332[local29 + 1] = local18;
			this.anIntArray332[local29 + 2] = local16;
			this.anIntArray332[local29 + 3] = local14;
			this.anIntArray332[local29 + 4] = local12;
			this.anIntArray332[local29 + 5] = local10;
			this.anIntArray332[local29 + 6] = local8;
			this.anIntArray332[local29 + 7] = local6;
		}
		this.method1948();
		this.anInt2744 = 256;
	}
}
