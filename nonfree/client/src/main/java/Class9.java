import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class9 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
	private final int[] anIntArray16 = new int[256];

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "[I")
	private final int[] anIntArray15 = new int[256];

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([I)V")
	public Class9(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray16[local13] = arg0[local13];
		}
		this.method205();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	private void method204() {
		this.anInt247 += ++this.anInt248;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray15[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt249 ^= this.anInt249 << 13;
				} else {
					this.anInt249 ^= this.anInt249 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt249 ^= this.anInt249 << 2;
			} else {
				this.anInt249 ^= this.anInt249 >>> 16;
			}
			this.anInt249 += this.anIntArray15[local25 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray15[local25] = local122 = this.anInt247 + this.anIntArray15[local32 >> 2 & 0xFF] + this.anInt249;
			this.anIntArray16[local25] = this.anInt247 = local32 + this.anIntArray15[local122 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	private void method205() {
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
			local24 += local29;
			local28 += local26;
			local28 ^= local26 >>> 2;
			local26 += local24;
			local22 += local28;
			local26 ^= local24 << 8;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 >>> 16;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 10;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local28 += local18;
			local26 += local16;
			local29 += local28;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local20 += this.anIntArray16[local31 + 5];
			local29 += this.anIntArray16[local31];
			local22 += this.anIntArray16[local31 + 4];
			local18 += this.anIntArray16[local31 + 6];
			local28 += this.anIntArray16[local31 + 1];
			local16 += this.anIntArray16[local31 + 7];
			local29 ^= local28 << 11;
			local26 += this.anIntArray16[local31 + 2];
			local28 += local26;
			local24 += this.anIntArray16[local31 + 3];
			local28 ^= local26 >>> 2;
			local24 += local29;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 >>> 16;
			local22 += local20;
			local22 ^= local20 << 10;
			local18 += local24;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local18 += local16;
			local18 ^= local16 << 8;
			local29 += local20;
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
			this.anIntArray15[local31] = local29;
			this.anIntArray15[local31 + 1] = local28;
			this.anIntArray15[local31 + 2] = local26;
			this.anIntArray15[local31 + 3] = local24;
			this.anIntArray15[local31 + 4] = local22;
			this.anIntArray15[local31 + 5] = local20;
			this.anIntArray15[local31 + 6] = local18;
			this.anIntArray15[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local26 += this.anIntArray15[local31 + 2];
			local18 += this.anIntArray15[local31 + 6];
			local24 += this.anIntArray15[local31 + 3];
			local29 += this.anIntArray15[local31];
			local22 += this.anIntArray15[local31 + 4];
			local16 += this.anIntArray15[local31 + 7];
			local20 += this.anIntArray15[local31 + 5];
			local28 += this.anIntArray15[local31 + 1];
			local29 ^= local28 << 11;
			local28 += local26;
			local28 ^= local26 >>> 2;
			local24 += local29;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local24 += local22;
			local20 += local26;
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
			local16 ^= local29 >>> 9;
			local28 += local18;
			local29 += local28;
			this.anIntArray15[local31] = local29;
			this.anIntArray15[local31 + 1] = local28;
			local26 += local16;
			this.anIntArray15[local31 + 2] = local26;
			this.anIntArray15[local31 + 3] = local24;
			this.anIntArray15[local31 + 4] = local22;
			this.anIntArray15[local31 + 5] = local20;
			this.anIntArray15[local31 + 6] = local18;
			this.anIntArray15[local31 + 7] = local16;
		}
		this.method204();
		this.anInt246 = 256;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)I")
	public int method207() {
		if (this.anInt246-- == 0) {
			this.method204();
			this.anInt246 = 255;
		}
		return this.anIntArray16[this.anInt246];
	}
}
