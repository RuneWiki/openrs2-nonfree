import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class165 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
	private int anInt5297;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "[I")
	private int[] anIntArray459 = new int[256];

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "[I")
	private int[] anIntArray460 = new int[256];

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	private int anInt5301;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	private int anInt5302;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	private int anInt5306;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([I)V")
	public Class165(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray459[local13] = arg0[local13];
		}
		this.method4018();
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)I")
	public int method4014() {
		if (this.anInt5306-- == 0) {
			this.method4015();
			this.anInt5306 = 255;
		}
		return this.anIntArray459[this.anInt5306];
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
	private void method4015() {
		this.anInt5297 += ++this.anInt5301;
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(36) int local36 = this.anIntArray460[local26];
			if ((local26 & 0x2) == 0) {
				if ((local26 & 0x1) == 0) {
					this.anInt5302 ^= this.anInt5302 << 13;
				} else {
					this.anInt5302 ^= this.anInt5302 >>> 6;
				}
			} else if ((local26 & 0x1) == 0) {
				this.anInt5302 ^= this.anInt5302 << 2;
			} else {
				this.anInt5302 ^= this.anInt5302 >>> 16;
			}
			this.anInt5302 += this.anIntArray460[local26 + 128 & 0xFF];
			@Pc(129) int local129;
			this.anIntArray460[local26] = local129 = this.anInt5302 + this.anIntArray460[local36 >> 2 & 0xFF] + this.anInt5297;
			this.anIntArray459[local26] = this.anInt5297 = local36 + this.anIntArray460[local129 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	private void method4018() {
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
			local22 ^= local20 << 10;
			local18 += local24;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local18 += local16;
			local18 ^= local16 << 8;
			local29 += local20;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local28 += local18;
			local26 += local16;
			local29 += local28;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local16 += this.anIntArray459[local31 + 7];
			local18 += this.anIntArray459[local31 + 6];
			local26 += this.anIntArray459[local31 + 2];
			local20 += this.anIntArray459[local31 + 5];
			local24 += this.anIntArray459[local31 + 3];
			local28 += this.anIntArray459[local31 + 1];
			local22 += this.anIntArray459[local31 + 4];
			local29 += this.anIntArray459[local31];
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
			this.anIntArray460[local31] = local29;
			this.anIntArray460[local31 + 1] = local28;
			this.anIntArray460[local31 + 2] = local26;
			this.anIntArray460[local31 + 3] = local24;
			this.anIntArray460[local31 + 4] = local22;
			this.anIntArray460[local31 + 5] = local20;
			this.anIntArray460[local31 + 6] = local18;
			this.anIntArray460[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local24 += this.anIntArray460[local31 + 3];
			local22 += this.anIntArray460[local31 + 4];
			local29 += this.anIntArray460[local31];
			local16 += this.anIntArray460[local31 + 7];
			local26 += this.anIntArray460[local31 + 2];
			local28 += this.anIntArray460[local31 + 1];
			local20 += this.anIntArray460[local31 + 5];
			local29 ^= local28 << 11;
			local18 += this.anIntArray460[local31 + 6];
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
			local18 ^= local16 << 8;
			local29 += local20;
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
			this.anIntArray460[local31] = local29;
			this.anIntArray460[local31 + 1] = local28;
			this.anIntArray460[local31 + 2] = local26;
			this.anIntArray460[local31 + 3] = local24;
			this.anIntArray460[local31 + 4] = local22;
			this.anIntArray460[local31 + 5] = local20;
			this.anIntArray460[local31 + 6] = local18;
			this.anIntArray460[local31 + 7] = local16;
		}
		this.method4015();
		this.anInt5306 = 256;
	}
}
