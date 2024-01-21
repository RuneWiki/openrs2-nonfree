import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class55 {

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	private int anInt2697;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	private int anInt2698;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
	private int anInt2699;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	private int anInt2700;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[I")
	private final int[] anIntArray260 = new int[256];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
	private final int[] anIntArray259 = new int[256];

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([I)V")
	public Class55(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray260[local13] = arg0[local13];
		}
		this.method1882();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
	public int method1881() {
		if (this.anInt2700-- == 0) {
			this.method1883();
			this.anInt2700 = 255;
		}
		return this.anIntArray260[this.anInt2700];
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	private void method1882() {
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
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray260[local23 + 3];
			local12 += this.anIntArray260[local23 + 5];
			local8 += this.anIntArray260[local23 + 7];
			local21 += this.anIntArray260[local23];
			local20 += this.anIntArray260[local23 + 1];
			local10 += this.anIntArray260[local23 + 6];
			local14 += this.anIntArray260[local23 + 4];
			local21 ^= local20 << 11;
			local18 += this.anIntArray260[local23 + 2];
			local16 += local21;
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
			this.anIntArray259[local23] = local21;
			this.anIntArray259[local23 + 1] = local20;
			this.anIntArray259[local23 + 2] = local18;
			this.anIntArray259[local23 + 3] = local16;
			this.anIntArray259[local23 + 4] = local14;
			this.anIntArray259[local23 + 5] = local12;
			this.anIntArray259[local23 + 6] = local10;
			this.anIntArray259[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray259[local23 + 5];
			local18 += this.anIntArray259[local23 + 2];
			local16 += this.anIntArray259[local23 + 3];
			local20 += this.anIntArray259[local23 + 1];
			local10 += this.anIntArray259[local23 + 6];
			local21 += this.anIntArray259[local23];
			local21 ^= local20 << 11;
			local14 += this.anIntArray259[local23 + 4];
			local20 += local18;
			local16 += local21;
			local8 += this.anIntArray259[local23 + 7];
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
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
			this.anIntArray259[local23] = local21;
			this.anIntArray259[local23 + 1] = local20;
			this.anIntArray259[local23 + 2] = local18;
			this.anIntArray259[local23 + 3] = local16;
			this.anIntArray259[local23 + 4] = local14;
			this.anIntArray259[local23 + 5] = local12;
			this.anIntArray259[local23 + 6] = local10;
			this.anIntArray259[local23 + 7] = local8;
		}
		this.method1883();
		this.anInt2700 = 256;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	private void method1883() {
		this.anInt2698 += ++this.anInt2699;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray259[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt2697 ^= this.anInt2697 << 13;
				} else {
					this.anInt2697 ^= this.anInt2697 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt2697 ^= this.anInt2697 << 2;
			} else {
				this.anInt2697 ^= this.anInt2697 >>> 16;
			}
			this.anInt2697 += this.anIntArray259[local19 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray259[local19] = local119 = this.anIntArray259[local26 >> 2 & 0xFF] + this.anInt2697 + this.anInt2698;
			this.anIntArray260[local19] = this.anInt2698 = local26 + this.anIntArray259[local119 >> 8 >> 2 & 0xFF];
		}
	}
}
