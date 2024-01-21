import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class44 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	private int anInt1639;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
	private int anInt1640;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	private int anInt1645;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
	private int anInt1649;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "[I")
	private final int[] anIntArray200 = new int[256];

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "[I")
	private final int[] anIntArray201 = new int[256];

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([I)V")
	public Class44(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray201[local13] = arg0[local13];
		}
		this.method1110();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	private void method1110() {
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
			local28 ^= local26 >>> 2;
			local22 += local28;
			local24 += local29;
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
			local18 += local16;
			local18 ^= local16 << 8;
			local28 += local18;
			local29 += local20;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local28 += this.anIntArray201[local31 + 1];
			local24 += this.anIntArray201[local31 + 3];
			local26 += this.anIntArray201[local31 + 2];
			local29 += this.anIntArray201[local31];
			local22 += this.anIntArray201[local31 + 4];
			local20 += this.anIntArray201[local31 + 5];
			local18 += this.anIntArray201[local31 + 6];
			local29 ^= local28 << 11;
			local16 += this.anIntArray201[local31 + 7];
			local28 += local26;
			local24 += local29;
			local28 ^= local26 >>> 2;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 >>> 16;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 10;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local16 += local22;
			local29 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
			this.anIntArray200[local31] = local29;
			this.anIntArray200[local31 + 1] = local28;
			this.anIntArray200[local31 + 2] = local26;
			this.anIntArray200[local31 + 3] = local24;
			this.anIntArray200[local31 + 4] = local22;
			this.anIntArray200[local31 + 5] = local20;
			this.anIntArray200[local31 + 6] = local18;
			this.anIntArray200[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local26 += this.anIntArray200[local31 + 2];
			local22 += this.anIntArray200[local31 + 4];
			local16 += this.anIntArray200[local31 + 7];
			local29 += this.anIntArray200[local31];
			local18 += this.anIntArray200[local31 + 6];
			local28 += this.anIntArray200[local31 + 1];
			local24 += this.anIntArray200[local31 + 3];
			local20 += this.anIntArray200[local31 + 5];
			local29 ^= local28 << 11;
			local28 += local26;
			local24 += local29;
			local28 ^= local26 >>> 2;
			local26 += local24;
			local22 += local28;
			local26 ^= local24 << 8;
			local24 += local22;
			local24 ^= local22 >>> 16;
			local20 += local26;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 10;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local18 += local16;
			local18 ^= local16 << 8;
			local28 += local18;
			local29 += local20;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
			this.anIntArray200[local31] = local29;
			this.anIntArray200[local31 + 1] = local28;
			this.anIntArray200[local31 + 2] = local26;
			this.anIntArray200[local31 + 3] = local24;
			this.anIntArray200[local31 + 4] = local22;
			this.anIntArray200[local31 + 5] = local20;
			this.anIntArray200[local31 + 6] = local18;
			this.anIntArray200[local31 + 7] = local16;
		}
		this.method1112();
		this.anInt1639 = 256;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)I")
	public int method1111() {
		if (this.anInt1639-- == 0) {
			this.method1112();
			this.anInt1639 = 255;
		}
		return this.anIntArray201[this.anInt1639];
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	private void method1112() {
		this.anInt1645 += ++this.anInt1640;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray200[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt1649 ^= this.anInt1649 << 13;
				} else {
					this.anInt1649 ^= this.anInt1649 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt1649 ^= this.anInt1649 << 2;
			} else {
				this.anInt1649 ^= this.anInt1649 >>> 16;
			}
			this.anInt1649 += this.anIntArray200[local25 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray200[local25] = local121 = this.anInt1645 + this.anInt1649 + this.anIntArray200[local32 >> 2 & 0xFF];
			this.anIntArray201[local25] = this.anInt1645 = local32 + this.anIntArray200[local121 >> 8 >> 2 & 0xFF];
		}
	}
}
