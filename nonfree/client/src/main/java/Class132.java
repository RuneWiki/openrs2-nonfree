import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class132 {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	private int anInt3825;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
	private int anInt3826;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "[I")
	private int[] anIntArray317;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
	private int anInt3830;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	private int anInt3831;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	private Class132() {
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([I)V")
	public Class132(@OriginalArg(0) int[] arg0) {
		this.anIntArray317 = new int[256];
		this.anIntArray316 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray317[local13] = arg0[local13];
		}
		this.method3242();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	private void method3238() {
		this.anInt3831 += ++this.anInt3826;
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(27) int local27 = this.anIntArray316[local21];
			if ((local21 & 0x2) == 0) {
				if ((local21 & 0x1) == 0) {
					this.anInt3825 ^= this.anInt3825 << 13;
				} else {
					this.anInt3825 ^= this.anInt3825 >>> 6;
				}
			} else if ((local21 & 0x1) == 0) {
				this.anInt3825 ^= this.anInt3825 << 2;
			} else {
				this.anInt3825 ^= this.anInt3825 >>> 16;
			}
			this.anInt3825 += this.anIntArray316[local21 + 128 & 0xFF];
			@Pc(113) int local113;
			this.anIntArray316[local21] = local113 = this.anInt3831 + this.anIntArray316[local27 >> 2 & 0xFF] + this.anInt3825;
			this.anIntArray317[local21] = this.anInt3831 = local27 + this.anIntArray316[local113 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)I")
	public int method3239() {
		if (this.anInt3830 == 0) {
			this.method3238();
			this.anInt3830 = 256;
		}
		return this.anIntArray317[--this.anInt3830];
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I")
	public int method3240() {
		if (this.anInt3830 == 0) {
			this.method3238();
			this.anInt3830 = 256;
		}
		return this.anIntArray317[this.anInt3830 - 1];
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	private void method3242() {
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
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.anIntArray317[local29 + 6];
			local27 += this.anIntArray317[local29];
			local24 += this.anIntArray317[local29 + 2];
			local18 += this.anIntArray317[local29 + 5];
			local14 += this.anIntArray317[local29 + 7];
			local26 += this.anIntArray317[local29 + 1];
			local22 += this.anIntArray317[local29 + 3];
			local20 += this.anIntArray317[local29 + 4];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
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
			this.anIntArray316[local29] = local27;
			this.anIntArray316[local29 + 1] = local26;
			this.anIntArray316[local29 + 2] = local24;
			this.anIntArray316[local29 + 3] = local22;
			this.anIntArray316[local29 + 4] = local20;
			this.anIntArray316[local29 + 5] = local18;
			this.anIntArray316[local29 + 6] = local16;
			this.anIntArray316[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.anIntArray316[local29 + 6];
			local20 += this.anIntArray316[local29 + 4];
			local27 += this.anIntArray316[local29];
			local26 += this.anIntArray316[local29 + 1];
			local14 += this.anIntArray316[local29 + 7];
			local24 += this.anIntArray316[local29 + 2];
			local18 += this.anIntArray316[local29 + 5];
			local22 += this.anIntArray316[local29 + 3];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
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
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray316[local29] = local27;
			this.anIntArray316[local29 + 1] = local26;
			this.anIntArray316[local29 + 2] = local24;
			this.anIntArray316[local29 + 3] = local22;
			this.anIntArray316[local29 + 4] = local20;
			this.anIntArray316[local29 + 5] = local18;
			this.anIntArray316[local29 + 6] = local16;
			this.anIntArray316[local29 + 7] = local14;
		}
		this.method3238();
		this.anInt3830 = 256;
	}
}
