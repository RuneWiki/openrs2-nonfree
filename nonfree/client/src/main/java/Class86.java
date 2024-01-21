import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class86 {

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	private int anInt4252;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	private int anInt4253;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	private int anInt4254;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "I")
	private int anInt4255;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "[I")
	private final int[] anIntArray703 = new int[256];

	@OriginalMember(owner = "client!we", name = "c", descriptor = "[I")
	private final int[] anIntArray702 = new int[256];

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "([I)V")
	public Class86(@OriginalArg(0) int[] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray702[local11] = arg0[local11];
		}
		this.method3191();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I")
	public int method3189() {
		if (this.anInt4254-- == 0) {
			this.method3192();
			this.anInt4254 = 255;
		}
		return this.anIntArray702[this.anInt4254];
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	private void method3191() {
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
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local24 += this.anIntArray702[local29 + 2];
			local20 += this.anIntArray702[local29 + 4];
			local14 += this.anIntArray702[local29 + 7];
			local26 += this.anIntArray702[local29 + 1];
			local18 += this.anIntArray702[local29 + 5];
			local22 += this.anIntArray702[local29 + 3];
			local16 += this.anIntArray702[local29 + 6];
			local27 += this.anIntArray702[local29];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local18 += local24;
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
			local24 += local14;
			local27 += local26;
			this.anIntArray703[local29] = local27;
			this.anIntArray703[local29 + 1] = local26;
			this.anIntArray703[local29 + 2] = local24;
			this.anIntArray703[local29 + 3] = local22;
			this.anIntArray703[local29 + 4] = local20;
			this.anIntArray703[local29 + 5] = local18;
			this.anIntArray703[local29 + 6] = local16;
			this.anIntArray703[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local20 += this.anIntArray703[local29 + 4];
			local27 += this.anIntArray703[local29];
			local22 += this.anIntArray703[local29 + 3];
			local24 += this.anIntArray703[local29 + 2];
			local14 += this.anIntArray703[local29 + 7];
			local18 += this.anIntArray703[local29 + 5];
			local26 += this.anIntArray703[local29 + 1];
			local27 ^= local26 << 11;
			local26 += local24;
			local16 += this.anIntArray703[local29 + 6];
			local26 ^= local24 >>> 2;
			local22 += local27;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local18 += local24;
			local20 += local18;
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
			this.anIntArray703[local29] = local27;
			this.anIntArray703[local29 + 1] = local26;
			this.anIntArray703[local29 + 2] = local24;
			this.anIntArray703[local29 + 3] = local22;
			this.anIntArray703[local29 + 4] = local20;
			this.anIntArray703[local29 + 5] = local18;
			this.anIntArray703[local29 + 6] = local16;
			this.anIntArray703[local29 + 7] = local14;
		}
		this.method3192();
		this.anInt4254 = 256;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	private void method3192() {
		this.anInt4252 += ++this.anInt4253;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(31) int local31 = this.anIntArray703[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt4255 ^= this.anInt4255 << 13;
				} else {
					this.anInt4255 ^= this.anInt4255 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt4255 ^= this.anInt4255 << 2;
			} else {
				this.anInt4255 ^= this.anInt4255 >>> 16;
			}
			this.anInt4255 += this.anIntArray703[local25 + 128 & 0xFF];
			@Pc(120) int local120;
			this.anIntArray703[local25] = local120 = this.anInt4252 + this.anIntArray703[local31 >> 2 & 0xFF] + this.anInt4255;
			this.anIntArray702[local25] = this.anInt4252 = this.anIntArray703[local120 >> 8 >> 2 & 0xFF] + local31;
		}
	}
}
