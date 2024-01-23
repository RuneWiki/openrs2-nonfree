import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class66 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
	private int[] anIntArray319 = new int[256];

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	private int anInt2995;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "[I")
	private int[] anIntArray321 = new int[256];

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	private int anInt3005;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
	private int anInt3008;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([I)V")
	public Class66(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray321[local13] = arg0[local13];
		}
		this.method2091();
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
	public int method2090() {
		if (this.anInt3008-- == 0) {
			this.method2092();
			this.anInt3008 = 255;
		}
		return this.anIntArray321[this.anInt3008];
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V")
	private void method2091() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(30) int local30;
		for (local30 = 0; local30 < 4; local30++) {
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
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
			local18 += local8;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local10 += this.anIntArray321[local30 + 6];
			local16 += this.anIntArray321[local30 + 3];
			local21 += this.anIntArray321[local30];
			local14 += this.anIntArray321[local30 + 4];
			local8 += this.anIntArray321[local30 + 7];
			local20 += this.anIntArray321[local30 + 1];
			local18 += this.anIntArray321[local30 + 2];
			local12 += this.anIntArray321[local30 + 5];
			local21 ^= local20 << 11;
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
			this.anIntArray319[local30] = local21;
			this.anIntArray319[local30 + 1] = local20;
			this.anIntArray319[local30 + 2] = local18;
			this.anIntArray319[local30 + 3] = local16;
			this.anIntArray319[local30 + 4] = local14;
			this.anIntArray319[local30 + 5] = local12;
			this.anIntArray319[local30 + 6] = local10;
			this.anIntArray319[local30 + 7] = local8;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local20 += this.anIntArray319[local30 + 1];
			local14 += this.anIntArray319[local30 + 4];
			local16 += this.anIntArray319[local30 + 3];
			local18 += this.anIntArray319[local30 + 2];
			local12 += this.anIntArray319[local30 + 5];
			local10 += this.anIntArray319[local30 + 6];
			local21 += this.anIntArray319[local30];
			local8 += this.anIntArray319[local30 + 7];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
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
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local20 += local10;
			local21 += local20;
			this.anIntArray319[local30] = local21;
			local18 += local8;
			this.anIntArray319[local30 + 1] = local20;
			this.anIntArray319[local30 + 2] = local18;
			this.anIntArray319[local30 + 3] = local16;
			this.anIntArray319[local30 + 4] = local14;
			this.anIntArray319[local30 + 5] = local12;
			this.anIntArray319[local30 + 6] = local10;
			this.anIntArray319[local30 + 7] = local8;
		}
		this.method2092();
		this.anInt3008 = 256;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	private void method2092() {
		this.anInt3005 += ++this.anInt3001;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray319[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt2995 ^= this.anInt2995 << 13;
				} else {
					this.anInt2995 ^= this.anInt2995 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt2995 ^= this.anInt2995 << 2;
			} else {
				this.anInt2995 ^= this.anInt2995 >>> 16;
			}
			this.anInt2995 += this.anIntArray319[local27 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray319[local27] = local123 = this.anInt2995 + this.anIntArray319[local34 >> 2 & 0xFF] + this.anInt3005;
			this.anIntArray321[local27] = this.anInt3005 = local34 + this.anIntArray319[local123 >> 8 >> 2 & 0xFF];
		}
	}
}
