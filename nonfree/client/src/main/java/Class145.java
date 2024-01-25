import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class145 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	private int anInt3996;

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
	private int anInt3998;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	private int anInt4000;

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
	private int anInt4002;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	private Class145() {
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "([I)V")
	public Class145(@OriginalArg(0) int[] arg0) {
		this.anIntArray241 = new int[256];
		this.anIntArray239 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray239[local13] = arg0[local13];
		}
		this.method3321();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I")
	public int method3320() {
		if (this.anInt3996 == 0) {
			this.method3322();
			this.anInt3996 = 256;
		}
		return this.anIntArray239[--this.anInt3996];
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
	private void method3321() {
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
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray239[local23 + 3];
			local8 += this.anIntArray239[local23 + 7];
			local21 += this.anIntArray239[local23];
			local12 += this.anIntArray239[local23 + 5];
			local14 += this.anIntArray239[local23 + 4];
			local10 += this.anIntArray239[local23 + 6];
			local18 += this.anIntArray239[local23 + 2];
			local20 += this.anIntArray239[local23 + 1];
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
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray241[local23] = local21;
			this.anIntArray241[local23 + 1] = local20;
			this.anIntArray241[local23 + 2] = local18;
			this.anIntArray241[local23 + 3] = local16;
			this.anIntArray241[local23 + 4] = local14;
			this.anIntArray241[local23 + 5] = local12;
			this.anIntArray241[local23 + 6] = local10;
			this.anIntArray241[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray241[local23 + 7];
			local10 += this.anIntArray241[local23 + 6];
			local18 += this.anIntArray241[local23 + 2];
			local20 += this.anIntArray241[local23 + 1];
			local12 += this.anIntArray241[local23 + 5];
			local21 += this.anIntArray241[local23];
			local14 += this.anIntArray241[local23 + 4];
			local16 += this.anIntArray241[local23 + 3];
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
			this.anIntArray241[local23] = local21;
			this.anIntArray241[local23 + 1] = local20;
			this.anIntArray241[local23 + 2] = local18;
			this.anIntArray241[local23 + 3] = local16;
			this.anIntArray241[local23 + 4] = local14;
			this.anIntArray241[local23 + 5] = local12;
			this.anIntArray241[local23 + 6] = local10;
			this.anIntArray241[local23 + 7] = local8;
		}
		this.method3322();
		this.anInt3996 = 256;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
	private void method3322() {
		this.anInt3998 += ++this.anInt4000;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray241[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt4002 ^= this.anInt4002 << 13;
				} else {
					this.anInt4002 ^= this.anInt4002 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt4002 ^= this.anInt4002 << 2;
			} else {
				this.anInt4002 ^= this.anInt4002 >>> 16;
			}
			this.anInt4002 += this.anIntArray241[local25 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray241[local25] = local122 = this.anIntArray241[local32 >> 2 & 0xFF] + this.anInt4002 + this.anInt3998;
			this.anIntArray239[local25] = this.anInt3998 = this.anIntArray241[local122 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)I")
	public int method3324() {
		if (this.anInt3996 == 0) {
			this.method3322();
			this.anInt3996 = 256;
		}
		return this.anIntArray239[this.anInt3996 - 1];
	}
}
