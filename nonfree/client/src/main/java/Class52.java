import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class52 {

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
	private int[] anIntArray167 = new int[256];

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
	private int anInt1920;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	private int anInt1921;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
	private int[] anIntArray168 = new int[256];

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
	private int anInt1922;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
	private int anInt1923;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([I)V")
	public Class52(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray167[local13] = arg0[local13];
		}
		this.method1481();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
	private void method1481() {
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
			local19 += local25;
			local21 += local26;
			local23 += local21;
			local23 ^= local21 << 8;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 >>> 16;
			local19 += local17;
			local19 ^= local17 << 10;
			local13 += local19;
			local15 += local21;
			local17 += local15;
			local17 ^= local15 >>> 4;
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
			local25 += this.anIntArray167[local28 + 1];
			local17 += this.anIntArray167[local28 + 5];
			local23 += this.anIntArray167[local28 + 2];
			local13 += this.anIntArray167[local28 + 7];
			local26 += this.anIntArray167[local28];
			local19 += this.anIntArray167[local28 + 4];
			local21 += this.anIntArray167[local28 + 3];
			local15 += this.anIntArray167[local28 + 6];
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
			local26 += local17;
			local15 += local13;
			local15 ^= local13 << 8;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local23 += local13;
			local26 += local25;
			this.anIntArray168[local28] = local26;
			this.anIntArray168[local28 + 1] = local25;
			this.anIntArray168[local28 + 2] = local23;
			this.anIntArray168[local28 + 3] = local21;
			this.anIntArray168[local28 + 4] = local19;
			this.anIntArray168[local28 + 5] = local17;
			this.anIntArray168[local28 + 6] = local15;
			this.anIntArray168[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local25 += this.anIntArray168[local28 + 1];
			local21 += this.anIntArray168[local28 + 3];
			local17 += this.anIntArray168[local28 + 5];
			local26 += this.anIntArray168[local28];
			local15 += this.anIntArray168[local28 + 6];
			local19 += this.anIntArray168[local28 + 4];
			local13 += this.anIntArray168[local28 + 7];
			local23 += this.anIntArray168[local28 + 2];
			local26 ^= local25 << 11;
			local25 += local23;
			local25 ^= local23 >>> 2;
			local19 += local25;
			local21 += local26;
			local23 += local21;
			local23 ^= local21 << 8;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 >>> 16;
			local15 += local21;
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
			local23 += local13;
			local26 += local25;
			this.anIntArray168[local28] = local26;
			this.anIntArray168[local28 + 1] = local25;
			this.anIntArray168[local28 + 2] = local23;
			this.anIntArray168[local28 + 3] = local21;
			this.anIntArray168[local28 + 4] = local19;
			this.anIntArray168[local28 + 5] = local17;
			this.anIntArray168[local28 + 6] = local15;
			this.anIntArray168[local28 + 7] = local13;
		}
		this.method1485();
		this.anInt1921 = 256;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)I")
	public int method1483() {
		if (this.anInt1921-- == 0) {
			this.method1485();
			this.anInt1921 = 255;
		}
		return this.anIntArray167[this.anInt1921];
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)V")
	private void method1485() {
		this.anInt1922 += ++this.anInt1923;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(32) int local32 = this.anIntArray168[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt1920 ^= this.anInt1920 << 13;
				} else {
					this.anInt1920 ^= this.anInt1920 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt1920 ^= this.anInt1920 << 2;
			} else {
				this.anInt1920 ^= this.anInt1920 >>> 16;
			}
			this.anInt1920 += this.anIntArray168[local24 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray168[local24] = local122 = this.anInt1920 + this.anIntArray168[local32 >> 2 & 0xFF] + this.anInt1922;
			this.anIntArray167[local24] = this.anInt1922 = this.anIntArray168[local122 >> 8 >> 2 & 0xFF] + local32;
		}
	}
}
