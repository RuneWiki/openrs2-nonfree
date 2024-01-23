import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class192 {

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "[I")
	private int[] anIntArray562 = new int[256];

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	private int anInt6200;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
	private int anInt6201;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "[I")
	private int[] anIntArray563 = new int[256];

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
	private int anInt6202;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
	private int anInt6207;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([I)V")
	public Class192(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray563[local13] = arg0[local13];
		}
		this.method4694();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
	public int method4689() {
		if (this.anInt6201-- == 0) {
			this.method4691();
			this.anInt6201 = 255;
		}
		return this.anIntArray563[this.anInt6201];
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	private void method4691() {
		this.anInt6207 += ++this.anInt6200;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(31) int local31 = this.anIntArray562[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt6202 ^= this.anInt6202 << 13;
				} else {
					this.anInt6202 ^= this.anInt6202 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt6202 ^= this.anInt6202 << 2;
			} else {
				this.anInt6202 ^= this.anInt6202 >>> 16;
			}
			this.anInt6202 += this.anIntArray562[local23 + 128 & 0xFF];
			@Pc(117) int local117;
			this.anIntArray562[local23] = local117 = this.anInt6202 + this.anIntArray562[local31 >> 2 & 0xFF] + this.anInt6207;
			this.anIntArray563[local23] = this.anInt6207 = this.anIntArray562[local117 >> 8 >> 2 & 0xFF] + local31;
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	private void method4694() {
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
			local26 ^= local24 << 8;
			local20 += local26;
			local22 += local28;
			local24 += local22;
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
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local20 += this.anIntArray563[local31 + 5];
			local26 += this.anIntArray563[local31 + 2];
			local24 += this.anIntArray563[local31 + 3];
			local29 += this.anIntArray563[local31];
			local28 += this.anIntArray563[local31 + 1];
			local29 ^= local28 << 11;
			local28 += local26;
			local22 += this.anIntArray563[local31 + 4];
			local16 += this.anIntArray563[local31 + 7];
			local24 += local29;
			local18 += this.anIntArray563[local31 + 6];
			local28 ^= local26 >>> 2;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local24 += local22;
			local24 ^= local22 >>> 16;
			local20 += local26;
			local18 += local24;
			local22 += local20;
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
			local29 += local28;
			this.anIntArray562[local31] = local29;
			this.anIntArray562[local31 + 1] = local28;
			local26 += local16;
			this.anIntArray562[local31 + 2] = local26;
			this.anIntArray562[local31 + 3] = local24;
			this.anIntArray562[local31 + 4] = local22;
			this.anIntArray562[local31 + 5] = local20;
			this.anIntArray562[local31 + 6] = local18;
			this.anIntArray562[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local16 += this.anIntArray562[local31 + 7];
			local26 += this.anIntArray562[local31 + 2];
			local24 += this.anIntArray562[local31 + 3];
			local18 += this.anIntArray562[local31 + 6];
			local22 += this.anIntArray562[local31 + 4];
			local28 += this.anIntArray562[local31 + 1];
			local20 += this.anIntArray562[local31 + 5];
			local29 += this.anIntArray562[local31];
			local29 ^= local28 << 11;
			local28 += local26;
			local24 += local29;
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
			local28 += local18;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
			this.anIntArray562[local31] = local29;
			this.anIntArray562[local31 + 1] = local28;
			this.anIntArray562[local31 + 2] = local26;
			this.anIntArray562[local31 + 3] = local24;
			this.anIntArray562[local31 + 4] = local22;
			this.anIntArray562[local31 + 5] = local20;
			this.anIntArray562[local31 + 6] = local18;
			this.anIntArray562[local31 + 7] = local16;
		}
		this.method4691();
		this.anInt6201 = 256;
	}
}
