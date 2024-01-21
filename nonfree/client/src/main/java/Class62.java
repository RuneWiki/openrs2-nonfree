import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class62 {

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	private int anInt2392;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	private int anInt2397;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	private int anInt2399;

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
	private int anInt2400;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
	private final int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "[I")
	private final int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([I)V")
	public Class62(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray215[local13] = arg0[local13];
		}
		this.method1629();
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)I")
	public int method1625() {
		if (this.anInt2397-- == 0) {
			this.method1627();
			this.anInt2397 = 255;
		}
		return this.anIntArray215[this.anInt2397];
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	private void method1627() {
		this.anInt2400 += ++this.anInt2392;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(32) int local32 = this.anIntArray214[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt2399 ^= this.anInt2399 << 13;
				} else {
					this.anInt2399 ^= this.anInt2399 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt2399 ^= this.anInt2399 << 2;
			} else {
				this.anInt2399 ^= this.anInt2399 >>> 16;
			}
			this.anInt2399 += this.anIntArray214[local19 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray214[local19] = local124 = this.anInt2399 + this.anIntArray214[local32 >> 2 & 0xFF] + this.anInt2400;
			this.anIntArray215[local19] = this.anInt2400 = this.anIntArray214[local124 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	private void method1629() {
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
			local25 += local23;
			local25 ^= local23 >>> 2;
			local21 += local26;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 << 8;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 >>> 16;
			local19 += local17;
			local19 ^= local17 << 10;
			local15 += local21;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local13 += local19;
			local26 += local17;
			local15 += local13;
			local15 ^= local13 << 8;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local26 += local25;
			local23 += local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local15 += this.anIntArray215[local28 + 6];
			local13 += this.anIntArray215[local28 + 7];
			local17 += this.anIntArray215[local28 + 5];
			local21 += this.anIntArray215[local28 + 3];
			local25 += this.anIntArray215[local28 + 1];
			local19 += this.anIntArray215[local28 + 4];
			local23 += this.anIntArray215[local28 + 2];
			local26 += this.anIntArray215[local28];
			local26 ^= local25 << 11;
			local21 += local26;
			local25 += local23;
			local25 ^= local23 >>> 2;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 << 8;
			local21 += local19;
			local21 ^= local19 >>> 16;
			local17 += local23;
			local15 += local21;
			local19 += local17;
			local19 ^= local17 << 10;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local26 += local17;
			local13 += local19;
			local15 += local13;
			local15 ^= local13 << 8;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local23 += local13;
			local26 += local25;
			this.anIntArray214[local28] = local26;
			this.anIntArray214[local28 + 1] = local25;
			this.anIntArray214[local28 + 2] = local23;
			this.anIntArray214[local28 + 3] = local21;
			this.anIntArray214[local28 + 4] = local19;
			this.anIntArray214[local28 + 5] = local17;
			this.anIntArray214[local28 + 6] = local15;
			this.anIntArray214[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local13 += this.anIntArray214[local28 + 7];
			local25 += this.anIntArray214[local28 + 1];
			local17 += this.anIntArray214[local28 + 5];
			local23 += this.anIntArray214[local28 + 2];
			local19 += this.anIntArray214[local28 + 4];
			local15 += this.anIntArray214[local28 + 6];
			local21 += this.anIntArray214[local28 + 3];
			local26 += this.anIntArray214[local28];
			local26 ^= local25 << 11;
			local25 += local23;
			local21 += local26;
			local25 ^= local23 >>> 2;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 << 8;
			local21 += local19;
			local21 ^= local19 >>> 16;
			local15 += local21;
			local17 += local23;
			local19 += local17;
			local19 ^= local17 << 10;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local13 += local19;
			local26 += local17;
			local15 += local13;
			local15 ^= local13 << 8;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local26 += local25;
			local23 += local13;
			this.anIntArray214[local28] = local26;
			this.anIntArray214[local28 + 1] = local25;
			this.anIntArray214[local28 + 2] = local23;
			this.anIntArray214[local28 + 3] = local21;
			this.anIntArray214[local28 + 4] = local19;
			this.anIntArray214[local28 + 5] = local17;
			this.anIntArray214[local28 + 6] = local15;
			this.anIntArray214[local28 + 7] = local13;
		}
		this.method1627();
		this.anInt2397 = 256;
	}
}
