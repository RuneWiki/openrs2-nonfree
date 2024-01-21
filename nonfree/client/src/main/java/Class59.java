import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class59 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	private int anInt2329;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt2331;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	private int anInt2335;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	private int anInt2338;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
	private final int[] anIntArray258 = new int[256];

	@OriginalMember(owner = "client!s", name = "r", descriptor = "[I")
	private final int[] anIntArray259 = new int[256];

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "([I)V")
	public Class59(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray258[local13] = arg0[local13];
		}
		this.method1616();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)I")
	public int method1611() {
		if (this.anInt2338-- == 0) {
			this.method1612();
			this.anInt2338 = 255;
		}
		return this.anIntArray258[this.anInt2338];
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	private void method1612() {
		this.anInt2329 += ++this.anInt2331;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(32) int local32 = this.anIntArray259[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt2335 ^= this.anInt2335 << 13;
				} else {
					this.anInt2335 ^= this.anInt2335 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt2335 ^= this.anInt2335 << 2;
			} else {
				this.anInt2335 ^= this.anInt2335 >>> 16;
			}
			this.anInt2335 += this.anIntArray259[local19 + 128 & 0xFF];
			@Pc(125) int local125;
			this.anIntArray259[local19] = local125 = this.anInt2335 + this.anIntArray259[local32 >> 2 & 0xFF] + this.anInt2329;
			this.anIntArray258[local19] = this.anInt2329 = this.anIntArray259[local125 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
	private void method1616() {
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
			local24 += local22;
			local20 += local26;
			local24 ^= local22 >>> 16;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 10;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local16 += local22;
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
			local18 += this.anIntArray258[local31 + 6];
			local26 += this.anIntArray258[local31 + 2];
			local16 += this.anIntArray258[local31 + 7];
			local22 += this.anIntArray258[local31 + 4];
			local29 += this.anIntArray258[local31];
			local28 += this.anIntArray258[local31 + 1];
			local24 += this.anIntArray258[local31 + 3];
			local20 += this.anIntArray258[local31 + 5];
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
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
			this.anIntArray259[local31] = local29;
			this.anIntArray259[local31 + 1] = local28;
			this.anIntArray259[local31 + 2] = local26;
			this.anIntArray259[local31 + 3] = local24;
			this.anIntArray259[local31 + 4] = local22;
			this.anIntArray259[local31 + 5] = local20;
			this.anIntArray259[local31 + 6] = local18;
			this.anIntArray259[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local26 += this.anIntArray259[local31 + 2];
			local16 += this.anIntArray259[local31 + 7];
			local20 += this.anIntArray259[local31 + 5];
			local18 += this.anIntArray259[local31 + 6];
			local28 += this.anIntArray259[local31 + 1];
			local22 += this.anIntArray259[local31 + 4];
			local24 += this.anIntArray259[local31 + 3];
			local29 += this.anIntArray259[local31];
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
			local22 ^= local20 << 10;
			local18 += local24;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
			this.anIntArray259[local31] = local29;
			this.anIntArray259[local31 + 1] = local28;
			this.anIntArray259[local31 + 2] = local26;
			this.anIntArray259[local31 + 3] = local24;
			this.anIntArray259[local31 + 4] = local22;
			this.anIntArray259[local31 + 5] = local20;
			this.anIntArray259[local31 + 6] = local18;
			this.anIntArray259[local31 + 7] = local16;
		}
		this.method1612();
		this.anInt2338 = 256;
	}
}
