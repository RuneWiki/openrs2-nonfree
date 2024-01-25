import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class91 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "[I")
	private int[] anIntArray287;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
	private int anInt2154;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	private int anInt2155;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
	private int anInt2156;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
	private int anInt2159;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	private Class91() {
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([I)V")
	public Class91(@OriginalArg(0) int[] arg0) {
		this.anIntArray286 = new int[256];
		this.anIntArray287 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray286[local13] = arg0[local13];
		}
		this.method2326();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	private void method2322() {
		this.anInt2156 += ++this.anInt2159;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray287[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt2155 ^= this.anInt2155 << 13;
				} else {
					this.anInt2155 ^= this.anInt2155 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt2155 ^= this.anInt2155 << 2;
			} else {
				this.anInt2155 ^= this.anInt2155 >>> 16;
			}
			this.anInt2155 += this.anIntArray287[local25 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray287[local25] = local121 = this.anInt2156 + this.anInt2155 + this.anIntArray287[local32 >> 2 & 0xFF];
			this.anIntArray286[local25] = this.anInt2156 = local32 + this.anIntArray287[local121 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)I")
	public int method2325() {
		if (this.anInt2154-- == 0) {
			this.method2322();
			this.anInt2154 = 255;
		}
		return this.anIntArray286[this.anInt2154];
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	private void method2326() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(27) int local27;
		for (local27 = 0; local27 < 4; local27++) {
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
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
			local12 += local10;
			local8 += local14;
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
		for (local27 = 0; local27 < 256; local27 += 8) {
			local20 += this.anIntArray286[local27 + 1];
			local18 += this.anIntArray286[local27 + 2];
			local21 += this.anIntArray286[local27];
			local16 += this.anIntArray286[local27 + 3];
			local12 += this.anIntArray286[local27 + 5];
			local10 += this.anIntArray286[local27 + 6];
			local8 += this.anIntArray286[local27 + 7];
			local14 += this.anIntArray286[local27 + 4];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
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
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray287[local27] = local21;
			this.anIntArray287[local27 + 1] = local20;
			this.anIntArray287[local27 + 2] = local18;
			this.anIntArray287[local27 + 3] = local16;
			this.anIntArray287[local27 + 4] = local14;
			this.anIntArray287[local27 + 5] = local12;
			this.anIntArray287[local27 + 6] = local10;
			this.anIntArray287[local27 + 7] = local8;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local8 += this.anIntArray287[local27 + 7];
			local16 += this.anIntArray287[local27 + 3];
			local14 += this.anIntArray287[local27 + 4];
			local18 += this.anIntArray287[local27 + 2];
			local20 += this.anIntArray287[local27 + 1];
			local12 += this.anIntArray287[local27 + 5];
			local10 += this.anIntArray287[local27 + 6];
			local21 += this.anIntArray287[local27];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
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
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray287[local27] = local21;
			this.anIntArray287[local27 + 1] = local20;
			this.anIntArray287[local27 + 2] = local18;
			this.anIntArray287[local27 + 3] = local16;
			this.anIntArray287[local27 + 4] = local14;
			this.anIntArray287[local27 + 5] = local12;
			this.anIntArray287[local27 + 6] = local10;
			this.anIntArray287[local27 + 7] = local8;
		}
		this.method2322();
		this.anInt2154 = 256;
	}
}
