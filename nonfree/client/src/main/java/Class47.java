import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class47 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	private int anInt2359;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	private int anInt2361;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	private int anInt2364;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	private int anInt2366;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "[I")
	private final int[] anIntArray381 = new int[256];

	@OriginalMember(owner = "client!le", name = "q", descriptor = "[I")
	private final int[] anIntArray382 = new int[256];

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "([I)V")
	public Class47(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray382[local13] = arg0[local13];
		}
		this.method1671();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	private void method1671() {
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
			local20 += local18;
			local20 ^= local18 >>> 4;
			local16 += local22;
			local18 += local16;
			local29 += local20;
			local18 ^= local16 << 8;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local28 += local18;
			local29 += local28;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local22 += this.anIntArray382[local31 + 4];
			local29 += this.anIntArray382[local31];
			local24 += this.anIntArray382[local31 + 3];
			local20 += this.anIntArray382[local31 + 5];
			local26 += this.anIntArray382[local31 + 2];
			local18 += this.anIntArray382[local31 + 6];
			local28 += this.anIntArray382[local31 + 1];
			local29 ^= local28 << 11;
			local28 += local26;
			local16 += this.anIntArray382[local31 + 7];
			local24 += local29;
			local28 ^= local26 >>> 2;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local24 += local22;
			local24 ^= local22 >>> 16;
			local18 += local24;
			local20 += local26;
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
			local29 += local28;
			this.anIntArray381[local31] = local29;
			this.anIntArray381[local31 + 1] = local28;
			local26 += local16;
			this.anIntArray381[local31 + 2] = local26;
			this.anIntArray381[local31 + 3] = local24;
			this.anIntArray381[local31 + 4] = local22;
			this.anIntArray381[local31 + 5] = local20;
			this.anIntArray381[local31 + 6] = local18;
			this.anIntArray381[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local16 += this.anIntArray381[local31 + 7];
			local29 += this.anIntArray381[local31];
			local26 += this.anIntArray381[local31 + 2];
			local28 += this.anIntArray381[local31 + 1];
			local29 ^= local28 << 11;
			local18 += this.anIntArray381[local31 + 6];
			local22 += this.anIntArray381[local31 + 4];
			local20 += this.anIntArray381[local31 + 5];
			local24 += this.anIntArray381[local31 + 3];
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
			local18 += local16;
			local29 += local20;
			local18 ^= local16 << 8;
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
			this.anIntArray381[local31] = local29;
			this.anIntArray381[local31 + 1] = local28;
			this.anIntArray381[local31 + 2] = local26;
			this.anIntArray381[local31 + 3] = local24;
			this.anIntArray381[local31 + 4] = local22;
			this.anIntArray381[local31 + 5] = local20;
			this.anIntArray381[local31 + 6] = local18;
			this.anIntArray381[local31 + 7] = local16;
		}
		this.method1672();
		this.anInt2364 = 256;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	private void method1672() {
		this.anInt2361 += ++this.anInt2359;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray381[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt2366 ^= this.anInt2366 << 13;
				} else {
					this.anInt2366 ^= this.anInt2366 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt2366 ^= this.anInt2366 << 2;
			} else {
				this.anInt2366 ^= this.anInt2366 >>> 16;
			}
			this.anInt2366 += this.anIntArray381[local19 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray381[local19] = local116 = this.anInt2366 + this.anIntArray381[local26 >> 2 & 0xFF] + this.anInt2361;
			this.anIntArray382[local19] = this.anInt2361 = local26 + this.anIntArray381[local116 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I")
	public int method1673() {
		if (this.anInt2364-- == 0) {
			this.method1672();
			this.anInt2364 = 255;
		}
		return this.anIntArray382[this.anInt2364];
	}
}
