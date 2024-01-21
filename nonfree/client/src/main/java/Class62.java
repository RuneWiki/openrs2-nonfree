import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class62 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	private int anInt2506;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
	private int anInt2510;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
	private int anInt2513;

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
	private int anInt2519;

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "[I")
	private final int[] anIntArray293 = new int[256];

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "[I")
	private final int[] anIntArray292 = new int[256];

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([I)V")
	public Class62(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray293[local13] = arg0[local13];
		}
		this.method1667();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I")
	public int method1666() {
		if (this.anInt2513-- == 0) {
			this.method1669();
			this.anInt2513 = 255;
		}
		return this.anIntArray293[this.anInt2513];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	private void method1667() {
		@Pc(13) int local13 = -1640531527;
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(28) int local28;
		for (local28 = 0; local28 < 4; local28++) {
			local26 ^= local25 << 11;
			local21 += local26;
			local25 += local23;
			local25 ^= local23 >>> 2;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 << 8;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 >>> 16;
			local15 += local21;
			local19 += local17;
			local19 ^= local17 << 10;
			local13 += local19;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local15 += local13;
			local26 += local17;
			local15 ^= local13 << 8;
			local13 += local26;
			local25 += local15;
			local13 ^= local26 >>> 9;
			local23 += local13;
			local26 += local25;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local23 += this.anIntArray293[local28 + 2];
			local19 += this.anIntArray293[local28 + 4];
			local26 += this.anIntArray293[local28];
			local17 += this.anIntArray293[local28 + 5];
			local15 += this.anIntArray293[local28 + 6];
			local25 += this.anIntArray293[local28 + 1];
			local26 ^= local25 << 11;
			local21 += this.anIntArray293[local28 + 3];
			local21 += local26;
			local13 += this.anIntArray293[local28 + 7];
			local25 += local23;
			local25 ^= local23 >>> 2;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 << 8;
			local21 += local19;
			local21 ^= local19 >>> 16;
			local15 += local21;
			local17 += local23;
			local19 += local17;
			local19 ^= local17 << 10;
			local17 += local15;
			local13 += local19;
			local17 ^= local15 >>> 4;
			local26 += local17;
			local15 += local13;
			local15 ^= local13 << 8;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local26 += local25;
			local23 += local13;
			this.anIntArray292[local28] = local26;
			this.anIntArray292[local28 + 1] = local25;
			this.anIntArray292[local28 + 2] = local23;
			this.anIntArray292[local28 + 3] = local21;
			this.anIntArray292[local28 + 4] = local19;
			this.anIntArray292[local28 + 5] = local17;
			this.anIntArray292[local28 + 6] = local15;
			this.anIntArray292[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local25 += this.anIntArray292[local28 + 1];
			local26 += this.anIntArray292[local28];
			local23 += this.anIntArray292[local28 + 2];
			local15 += this.anIntArray292[local28 + 6];
			local26 ^= local25 << 11;
			local21 += this.anIntArray292[local28 + 3];
			local13 += this.anIntArray292[local28 + 7];
			local21 += local26;
			local19 += this.anIntArray292[local28 + 4];
			local25 += local23;
			local25 ^= local23 >>> 2;
			local23 += local21;
			local23 ^= local21 << 8;
			local19 += local25;
			local17 += this.anIntArray292[local28 + 5];
			local21 += local19;
			local21 ^= local19 >>> 16;
			local15 += local21;
			local17 += local23;
			local19 += local17;
			local19 ^= local17 << 10;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local26 += local17;
			local13 += local19;
			local15 += local13;
			local15 ^= local13 << 8;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local23 += local13;
			local25 += local15;
			local26 += local25;
			this.anIntArray292[local28] = local26;
			this.anIntArray292[local28 + 1] = local25;
			this.anIntArray292[local28 + 2] = local23;
			this.anIntArray292[local28 + 3] = local21;
			this.anIntArray292[local28 + 4] = local19;
			this.anIntArray292[local28 + 5] = local17;
			this.anIntArray292[local28 + 6] = local15;
			this.anIntArray292[local28 + 7] = local13;
		}
		this.method1669();
		this.anInt2513 = 256;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
	private void method1669() {
		this.anInt2506 += ++this.anInt2510;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray292[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt2519 ^= this.anInt2519 << 13;
				} else {
					this.anInt2519 ^= this.anInt2519 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt2519 ^= this.anInt2519 << 2;
			} else {
				this.anInt2519 ^= this.anInt2519 >>> 16;
			}
			this.anInt2519 += this.anIntArray292[local23 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray292[local23] = local119 = this.anInt2519 + this.anIntArray292[local30 >> 2 & 0xFF] + this.anInt2506;
			this.anIntArray293[local23] = this.anInt2506 = this.anIntArray292[local119 >> 8 >> 2 & 0xFF] + local30;
		}
	}
}
