import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class72 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
	private int anInt2678;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	private int anInt2679;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "[I")
	private int[] anIntArray238 = new int[256];

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "[I")
	private int[] anIntArray239 = new int[256];

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	private int anInt2683;

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	private int anInt2684;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([I)V")
	public Class72(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray238[local13] = arg0[local13];
		}
		this.method2088();
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)I")
	public int method2086() {
		if (this.anInt2679-- == 0) {
			this.method2089();
			this.anInt2679 = 255;
		}
		return this.anIntArray238[this.anInt2679];
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	private void method2088() {
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
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
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
			local8 += local21;
			local8 ^= local21 >>> 9;
			local20 += local10;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray238[local23 + 3];
			local14 += this.anIntArray238[local23 + 4];
			local12 += this.anIntArray238[local23 + 5];
			local10 += this.anIntArray238[local23 + 6];
			local8 += this.anIntArray238[local23 + 7];
			local18 += this.anIntArray238[local23 + 2];
			local20 += this.anIntArray238[local23 + 1];
			local21 += this.anIntArray238[local23];
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local16 += local21;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local10 += local16;
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
			this.anIntArray239[local23] = local21;
			this.anIntArray239[local23 + 1] = local20;
			this.anIntArray239[local23 + 2] = local18;
			this.anIntArray239[local23 + 3] = local16;
			this.anIntArray239[local23 + 4] = local14;
			this.anIntArray239[local23 + 5] = local12;
			this.anIntArray239[local23 + 6] = local10;
			this.anIntArray239[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local14 += this.anIntArray239[local23 + 4];
			local21 += this.anIntArray239[local23];
			local18 += this.anIntArray239[local23 + 2];
			local16 += this.anIntArray239[local23 + 3];
			local12 += this.anIntArray239[local23 + 5];
			local10 += this.anIntArray239[local23 + 6];
			local20 += this.anIntArray239[local23 + 1];
			local8 += this.anIntArray239[local23 + 7];
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local16 += local21;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray239[local23] = local21;
			this.anIntArray239[local23 + 1] = local20;
			this.anIntArray239[local23 + 2] = local18;
			this.anIntArray239[local23 + 3] = local16;
			this.anIntArray239[local23 + 4] = local14;
			this.anIntArray239[local23 + 5] = local12;
			this.anIntArray239[local23 + 6] = local10;
			this.anIntArray239[local23 + 7] = local8;
		}
		this.method2089();
		this.anInt2679 = 256;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	private void method2089() {
		this.anInt2678 += ++this.anInt2684;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray239[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt2683 ^= this.anInt2683 << 13;
				} else {
					this.anInt2683 ^= this.anInt2683 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt2683 ^= this.anInt2683 << 2;
			} else {
				this.anInt2683 ^= this.anInt2683 >>> 16;
			}
			this.anInt2683 += this.anIntArray239[local25 + 128 & 0xFF];
			@Pc(118) int local118;
			this.anIntArray239[local25] = local118 = this.anInt2683 + this.anIntArray239[local32 >> 2 & 0xFF] + this.anInt2678;
			this.anIntArray238[local25] = this.anInt2678 = this.anIntArray239[local118 >> 8 >> 2 & 0xFF] + local32;
		}
	}
}
