import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class131 {

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
	private int anInt3385;

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
	private int anInt3387;

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
	private int anInt3393;

	@OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
	private int anInt3396;

	@OriginalMember(owner = "client!haa", name = "n", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
	private Class131() {
	}

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "([I)V")
	public Class131(@OriginalArg(0) int[] arg0) {
		this.anIntArray220 = new int[256];
		this.anIntArray221 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray221[local13] = arg0[local13];
		}
		this.method2848();
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)V")
	private void method2842() {
		this.anInt3387 += ++this.anInt3393;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray220[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt3385 ^= this.anInt3385 << 13;
				} else {
					this.anInt3385 ^= this.anInt3385 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt3385 ^= this.anInt3385 << 2;
			} else {
				this.anInt3385 ^= this.anInt3385 >>> 16;
			}
			this.anInt3385 += this.anIntArray220[local19 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray220[local19] = local122 = this.anInt3387 + this.anIntArray220[local26 >> 2 & 0xFF] + this.anInt3385;
			this.anIntArray221[local19] = this.anInt3387 = local26 + this.anIntArray220[local122 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)I")
	public int method2843() {
		if (this.anInt3396 == 0) {
			this.method2842();
			this.anInt3396 = 256;
		}
		return this.anIntArray221[this.anInt3396 - 1];
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)I")
	public int method2844() {
		if (this.anInt3396 == 0) {
			this.method2842();
			this.anInt3396 = 256;
		}
		return this.anIntArray221[--this.anInt3396];
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(Z)V")
	private void method2848() {
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(29) int local29;
		for (local29 = 0; local29 < 4; local29++) {
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local14 += this.anIntArray221[local29 + 7];
			local26 += this.anIntArray221[local29 + 1];
			local24 += this.anIntArray221[local29 + 2];
			local22 += this.anIntArray221[local29 + 3];
			local18 += this.anIntArray221[local29 + 5];
			local16 += this.anIntArray221[local29 + 6];
			local20 += this.anIntArray221[local29 + 4];
			local27 += this.anIntArray221[local29];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray220[local29] = local27;
			this.anIntArray220[local29 + 1] = local26;
			this.anIntArray220[local29 + 2] = local24;
			this.anIntArray220[local29 + 3] = local22;
			this.anIntArray220[local29 + 4] = local20;
			this.anIntArray220[local29 + 5] = local18;
			this.anIntArray220[local29 + 6] = local16;
			this.anIntArray220[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local26 += this.anIntArray220[local29 + 1];
			local18 += this.anIntArray220[local29 + 5];
			local24 += this.anIntArray220[local29 + 2];
			local22 += this.anIntArray220[local29 + 3];
			local20 += this.anIntArray220[local29 + 4];
			local27 += this.anIntArray220[local29];
			local14 += this.anIntArray220[local29 + 7];
			local16 += this.anIntArray220[local29 + 6];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray220[local29] = local27;
			this.anIntArray220[local29 + 1] = local26;
			this.anIntArray220[local29 + 2] = local24;
			this.anIntArray220[local29 + 3] = local22;
			this.anIntArray220[local29 + 4] = local20;
			this.anIntArray220[local29 + 5] = local18;
			this.anIntArray220[local29 + 6] = local16;
			this.anIntArray220[local29 + 7] = local14;
		}
		this.method2842();
		this.anInt3396 = 256;
	}
}
