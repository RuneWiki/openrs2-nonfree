import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class208 {

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
	private int anInt5546;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
	private int anInt5547;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	private int anInt5549;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "[I")
	private int[] anIntArray401;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	private int anInt5551;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "[I")
	private int[] anIntArray402;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	private Class208() {
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "([I)V")
	public Class208(@OriginalArg(0) int[] arg0) {
		this.anIntArray402 = new int[256];
		this.anIntArray401 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray401[local13] = arg0[local13];
		}
		this.method4986();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)I")
	public int method4981() {
		if (this.anInt5551 == 0) {
			this.method4983();
			this.anInt5551 = 256;
		}
		return this.anIntArray401[--this.anInt5551];
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)I")
	public int method4982() {
		if (this.anInt5551 == 0) {
			this.method4983();
			this.anInt5551 = 256;
		}
		return this.anIntArray401[this.anInt5551 - 1];
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	private void method4983() {
		this.anInt5546 += ++this.anInt5549;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray402[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt5547 ^= this.anInt5547 << 13;
				} else {
					this.anInt5547 ^= this.anInt5547 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt5547 ^= this.anInt5547 << 2;
			} else {
				this.anInt5547 ^= this.anInt5547 >>> 16;
			}
			this.anInt5547 += this.anIntArray402[local25 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray402[local25] = local122 = this.anIntArray402[local32 >> 2 & 0xFF] + this.anInt5547 + this.anInt5546;
			this.anIntArray401[local25] = this.anInt5546 = local32 + this.anIntArray402[local122 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)V")
	private void method4986() {
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(28) int local28 = -1640531527;
		@Pc(29) int local29 = -1640531527;
		@Pc(31) int local31;
		for (local31 = 0; local31 < 4; local31++) {
			local29 ^= local28 << 11;
			local28 += local26;
			local24 += local29;
			local28 ^= local26 >>> 2;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 >>> 16;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 10;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local22 += this.anIntArray401[local31 + 4];
			local24 += this.anIntArray401[local31 + 3];
			local26 += this.anIntArray401[local31 + 2];
			local18 += this.anIntArray401[local31 + 6];
			local16 += this.anIntArray401[local31 + 7];
			local29 += this.anIntArray401[local31];
			local28 += this.anIntArray401[local31 + 1];
			local20 += this.anIntArray401[local31 + 5];
			local29 ^= local28 << 11;
			local24 += local29;
			local28 += local26;
			local28 ^= local26 >>> 2;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 >>> 16;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 10;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local18 += local16;
			local29 += local20;
			local18 ^= local16 << 8;
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
			this.anIntArray402[local31] = local29;
			this.anIntArray402[local31 + 1] = local28;
			this.anIntArray402[local31 + 2] = local26;
			this.anIntArray402[local31 + 3] = local24;
			this.anIntArray402[local31 + 4] = local22;
			this.anIntArray402[local31 + 5] = local20;
			this.anIntArray402[local31 + 6] = local18;
			this.anIntArray402[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local24 += this.anIntArray402[local31 + 3];
			local22 += this.anIntArray402[local31 + 4];
			local18 += this.anIntArray402[local31 + 6];
			local29 += this.anIntArray402[local31];
			local20 += this.anIntArray402[local31 + 5];
			local26 += this.anIntArray402[local31 + 2];
			local28 += this.anIntArray402[local31 + 1];
			local16 += this.anIntArray402[local31 + 7];
			local29 ^= local28 << 11;
			local28 += local26;
			local24 += local29;
			local28 ^= local26 >>> 2;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 >>> 16;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 10;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local18 += local16;
			local29 += local20;
			local18 ^= local16 << 8;
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
			this.anIntArray402[local31] = local29;
			this.anIntArray402[local31 + 1] = local28;
			this.anIntArray402[local31 + 2] = local26;
			this.anIntArray402[local31 + 3] = local24;
			this.anIntArray402[local31 + 4] = local22;
			this.anIntArray402[local31 + 5] = local20;
			this.anIntArray402[local31 + 6] = local18;
			this.anIntArray402[local31 + 7] = local16;
		}
		this.method4983();
		this.anInt5551 = 256;
	}
}
