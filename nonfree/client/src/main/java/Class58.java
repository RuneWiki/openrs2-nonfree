import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class58 {

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
	private int anInt2714;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "[I")
	private final int[] anIntArray269 = new int[256];

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
	private int anInt2715;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	private int anInt2716;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	private int anInt2720;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "[I")
	private final int[] anIntArray270 = new int[256];

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([I)V")
	public Class58(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray270[local13] = arg0[local13];
		}
		this.method2068();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	private void method2066() {
		this.anInt2716 += ++this.anInt2714;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray269[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt2720 ^= this.anInt2720 << 13;
				} else {
					this.anInt2720 ^= this.anInt2720 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt2720 ^= this.anInt2720 << 2;
			} else {
				this.anInt2720 ^= this.anInt2720 >>> 16;
			}
			this.anInt2720 += this.anIntArray269[local19 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray269[local19] = local119 = this.anInt2716 + this.anIntArray269[local26 >> 2 & 0xFF] + this.anInt2720;
			this.anIntArray270[local19] = this.anInt2716 = local26 + this.anIntArray269[local119 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
	public int method2067() {
		if (this.anInt2715-- == 0) {
			this.method2066();
			this.anInt2715 = 255;
		}
		return this.anIntArray270[this.anInt2715];
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	private void method2068() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23;
		for (local23 = 0; local23 < 4; local23++) {
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local10 += local16;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray270[local23 + 5];
			local16 += this.anIntArray270[local23 + 3];
			local10 += this.anIntArray270[local23 + 6];
			local14 += this.anIntArray270[local23 + 4];
			local18 += this.anIntArray270[local23 + 2];
			local20 += this.anIntArray270[local23 + 1];
			local8 += this.anIntArray270[local23 + 7];
			local21 += this.anIntArray270[local23];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			this.anIntArray269[local23] = local21;
			local18 += local8;
			this.anIntArray269[local23 + 1] = local20;
			this.anIntArray269[local23 + 2] = local18;
			this.anIntArray269[local23 + 3] = local16;
			this.anIntArray269[local23 + 4] = local14;
			this.anIntArray269[local23 + 5] = local12;
			this.anIntArray269[local23 + 6] = local10;
			this.anIntArray269[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray269[local23 + 1];
			local16 += this.anIntArray269[local23 + 3];
			local8 += this.anIntArray269[local23 + 7];
			local21 += this.anIntArray269[local23];
			local10 += this.anIntArray269[local23 + 6];
			local18 += this.anIntArray269[local23 + 2];
			local12 += this.anIntArray269[local23 + 5];
			local14 += this.anIntArray269[local23 + 4];
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray269[local23] = local21;
			this.anIntArray269[local23 + 1] = local20;
			this.anIntArray269[local23 + 2] = local18;
			this.anIntArray269[local23 + 3] = local16;
			this.anIntArray269[local23 + 4] = local14;
			this.anIntArray269[local23 + 5] = local12;
			this.anIntArray269[local23 + 6] = local10;
			this.anIntArray269[local23 + 7] = local8;
		}
		this.method2066();
		this.anInt2715 = 256;
	}
}
