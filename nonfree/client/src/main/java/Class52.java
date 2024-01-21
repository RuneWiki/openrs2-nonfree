import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class52 {

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	private int anInt2517;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
	private int anInt2520;

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
	private int anInt2526;

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
	private int anInt2529;

	@OriginalMember(owner = "client!lh", name = "H", descriptor = "[I")
	private final int[] anIntArray316 = new int[256];

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "[I")
	private final int[] anIntArray315 = new int[256];

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "([I)V")
	public Class52(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray315[local13] = arg0[local13];
		}
		this.method1682();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
	public int method1677() {
		if (this.anInt2520-- == 0) {
			this.method1679();
			this.anInt2520 = 255;
		}
		return this.anIntArray315[this.anInt2520];
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
	private void method1679() {
		this.anInt2526 += ++this.anInt2517;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray316[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt2529 ^= this.anInt2529 << 13;
				} else {
					this.anInt2529 ^= this.anInt2529 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt2529 ^= this.anInt2529 << 2;
			} else {
				this.anInt2529 ^= this.anInt2529 >>> 16;
			}
			this.anInt2529 += this.anIntArray316[local25 + 128 & 0xFF];
			@Pc(127) int local127;
			this.anIntArray316[local25] = local127 = this.anInt2526 + this.anIntArray316[local32 >> 2 & 0xFF] + this.anInt2529;
			this.anIntArray315[local25] = this.anInt2526 = this.anIntArray316[local127 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
	private void method1682() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(28) int local28;
		for (local28 = 0; local28 < 4; local28++) {
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
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
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local21 += this.anIntArray315[local28];
			local14 += this.anIntArray315[local28 + 4];
			local20 += this.anIntArray315[local28 + 1];
			local8 += this.anIntArray315[local28 + 7];
			local16 += this.anIntArray315[local28 + 3];
			local21 ^= local20 << 11;
			local12 += this.anIntArray315[local28 + 5];
			local16 += local21;
			local10 += this.anIntArray315[local28 + 6];
			local18 += this.anIntArray315[local28 + 2];
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
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
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray316[local28] = local21;
			this.anIntArray316[local28 + 1] = local20;
			this.anIntArray316[local28 + 2] = local18;
			this.anIntArray316[local28 + 3] = local16;
			this.anIntArray316[local28 + 4] = local14;
			this.anIntArray316[local28 + 5] = local12;
			this.anIntArray316[local28 + 6] = local10;
			this.anIntArray316[local28 + 7] = local8;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local21 += this.anIntArray316[local28];
			local10 += this.anIntArray316[local28 + 6];
			local12 += this.anIntArray316[local28 + 5];
			local16 += this.anIntArray316[local28 + 3];
			local20 += this.anIntArray316[local28 + 1];
			local14 += this.anIntArray316[local28 + 4];
			local8 += this.anIntArray316[local28 + 7];
			local18 += this.anIntArray316[local28 + 2];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local18 ^= local16 << 8;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray316[local28] = local21;
			this.anIntArray316[local28 + 1] = local20;
			this.anIntArray316[local28 + 2] = local18;
			this.anIntArray316[local28 + 3] = local16;
			this.anIntArray316[local28 + 4] = local14;
			this.anIntArray316[local28 + 5] = local12;
			this.anIntArray316[local28 + 6] = local10;
			this.anIntArray316[local28 + 7] = local8;
		}
		this.method1679();
		this.anInt2520 = 256;
	}
}
