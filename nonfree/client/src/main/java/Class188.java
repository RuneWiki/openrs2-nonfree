import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class188 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	private int anInt5298;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	private int anInt5299;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	private int anInt5300;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "[I")
	private int[] anIntArray430;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
	private int anInt5302;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	private Class188() {
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "([I)V")
	public Class188(@OriginalArg(0) int[] arg0) {
		this.anIntArray429 = new int[256];
		this.anIntArray430 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray429[local13] = arg0[local13];
		}
		this.method4255();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I")
	public int method4254() {
		if (this.anInt5302 == 0) {
			this.method4256();
			this.anInt5302 = 256;
		}
		return this.anIntArray429[--this.anInt5302];
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	private void method4255() {
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
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 10;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local18 += this.anIntArray429[local31 + 6];
			local20 += this.anIntArray429[local31 + 5];
			local22 += this.anIntArray429[local31 + 4];
			local16 += this.anIntArray429[local31 + 7];
			local29 += this.anIntArray429[local31];
			local26 += this.anIntArray429[local31 + 2];
			local24 += this.anIntArray429[local31 + 3];
			local28 += this.anIntArray429[local31 + 1];
			local29 ^= local28 << 11;
			local28 += local26;
			local24 += local29;
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
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
			this.anIntArray430[local31] = local29;
			this.anIntArray430[local31 + 1] = local28;
			this.anIntArray430[local31 + 2] = local26;
			this.anIntArray430[local31 + 3] = local24;
			this.anIntArray430[local31 + 4] = local22;
			this.anIntArray430[local31 + 5] = local20;
			this.anIntArray430[local31 + 6] = local18;
			this.anIntArray430[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local29 += this.anIntArray430[local31];
			local20 += this.anIntArray430[local31 + 5];
			local18 += this.anIntArray430[local31 + 6];
			local28 += this.anIntArray430[local31 + 1];
			local24 += this.anIntArray430[local31 + 3];
			local26 += this.anIntArray430[local31 + 2];
			local16 += this.anIntArray430[local31 + 7];
			local22 += this.anIntArray430[local31 + 4];
			local29 ^= local28 << 11;
			local24 += local29;
			local28 += local26;
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
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
			this.anIntArray430[local31] = local29;
			this.anIntArray430[local31 + 1] = local28;
			this.anIntArray430[local31 + 2] = local26;
			this.anIntArray430[local31 + 3] = local24;
			this.anIntArray430[local31 + 4] = local22;
			this.anIntArray430[local31 + 5] = local20;
			this.anIntArray430[local31 + 6] = local18;
			this.anIntArray430[local31 + 7] = local16;
		}
		this.method4256();
		this.anInt5302 = 256;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	private void method4256() {
		this.anInt5300 += ++this.anInt5299;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray430[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt5298 ^= this.anInt5298 << 13;
				} else {
					this.anInt5298 ^= this.anInt5298 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt5298 ^= this.anInt5298 << 2;
			} else {
				this.anInt5298 ^= this.anInt5298 >>> 16;
			}
			this.anInt5298 += this.anIntArray430[local27 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray430[local27] = local123 = this.anIntArray430[local34 >> 2 & 0xFF] + this.anInt5298 + this.anInt5300;
			this.anIntArray429[local27] = this.anInt5300 = this.anIntArray430[local123 >> 8 >> 2 & 0xFF] + local34;
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)I")
	public int method4257() {
		if (this.anInt5302 == 0) {
			this.method4256();
			this.anInt5302 = 256;
		}
		return this.anIntArray429[this.anInt5302 - 1];
	}
}
