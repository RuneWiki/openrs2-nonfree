import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class55 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	private int anInt2774;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "I")
	private int anInt2776;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "I")
	private int anInt2777;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "I")
	private int anInt2783;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "[I")
	private final int[] anIntArray405 = new int[256];

	@OriginalMember(owner = "client!td", name = "d", descriptor = "[I")
	private final int[] anIntArray406 = new int[256];

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([I)V")
	public Class55(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray405[local13] = arg0[local13];
		}
		this.method1705();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I")
	public int method1703() {
		if (this.anInt2774-- == 0) {
			this.method1706();
			this.anInt2774 = 255;
		}
		return this.anIntArray405[this.anInt2774];
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	private void method1705() {
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
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray405[local23 + 1];
			local10 += this.anIntArray405[local23 + 6];
			local16 += this.anIntArray405[local23 + 3];
			local8 += this.anIntArray405[local23 + 7];
			local14 += this.anIntArray405[local23 + 4];
			local21 += this.anIntArray405[local23];
			local21 ^= local20 << 11;
			local18 += this.anIntArray405[local23 + 2];
			local12 += this.anIntArray405[local23 + 5];
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
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			this.anIntArray406[local23] = local21;
			this.anIntArray406[local23 + 1] = local20;
			local18 += local8;
			this.anIntArray406[local23 + 2] = local18;
			this.anIntArray406[local23 + 3] = local16;
			this.anIntArray406[local23 + 4] = local14;
			this.anIntArray406[local23 + 5] = local12;
			this.anIntArray406[local23 + 6] = local10;
			this.anIntArray406[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray406[local23 + 6];
			local21 += this.anIntArray406[local23];
			local18 += this.anIntArray406[local23 + 2];
			local16 += this.anIntArray406[local23 + 3];
			local12 += this.anIntArray406[local23 + 5];
			local20 += this.anIntArray406[local23 + 1];
			local21 ^= local20 << 11;
			local8 += this.anIntArray406[local23 + 7];
			local14 += this.anIntArray406[local23 + 4];
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			this.anIntArray406[local23] = local21;
			this.anIntArray406[local23 + 1] = local20;
			local18 += local8;
			this.anIntArray406[local23 + 2] = local18;
			this.anIntArray406[local23 + 3] = local16;
			this.anIntArray406[local23 + 4] = local14;
			this.anIntArray406[local23 + 5] = local12;
			this.anIntArray406[local23 + 6] = local10;
			this.anIntArray406[local23 + 7] = local8;
		}
		this.method1706();
		this.anInt2774 = 256;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	private void method1706() {
		this.anInt2776 += ++this.anInt2777;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray406[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt2783 ^= this.anInt2783 << 13;
				} else {
					this.anInt2783 ^= this.anInt2783 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt2783 ^= this.anInt2783 << 2;
			} else {
				this.anInt2783 ^= this.anInt2783 >>> 16;
			}
			this.anInt2783 += this.anIntArray406[local25 + 128 & 0xFF];
			@Pc(125) int local125;
			this.anIntArray406[local25] = local125 = this.anInt2776 + this.anIntArray406[local32 >> 2 & 0xFF] + this.anInt2783;
			this.anIntArray405[local25] = this.anInt2776 = local32 + this.anIntArray406[local125 >> 8 >> 2 & 0xFF];
		}
	}
}
