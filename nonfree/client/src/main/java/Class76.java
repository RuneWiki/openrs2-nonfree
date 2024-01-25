import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class76 {

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
	private int anInt2538;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
	private int anInt2539;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	private int anInt2540;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
	private int anInt2542;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	private Class76() {
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([I)V")
	public Class76(@OriginalArg(0) int[] arg0) {
		this.anIntArray212 = new int[256];
		this.anIntArray211 = new int[256];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray212[local11] = arg0[local11];
		}
		this.method2104();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)I")
	public int method2100() {
		if (this.anInt2542 == 0) {
			this.method2102();
			this.anInt2542 = 256;
		}
		return this.anIntArray212[this.anInt2542 - 1];
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
	private void method2102() {
		this.anInt2540 += ++this.anInt2538;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(23) int local23 = this.anIntArray211[local17];
			if ((local17 & 0x2) == 0) {
				if ((local17 & 0x1) == 0) {
					this.anInt2539 ^= this.anInt2539 << 13;
				} else {
					this.anInt2539 ^= this.anInt2539 >>> 6;
				}
			} else if ((local17 & 0x1) == 0) {
				this.anInt2539 ^= this.anInt2539 << 2;
			} else {
				this.anInt2539 ^= this.anInt2539 >>> 16;
			}
			this.anInt2539 += this.anIntArray211[local17 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray211[local17] = local116 = this.anInt2539 + this.anIntArray211[local23 >> 2 & 0xFF] + this.anInt2540;
			this.anIntArray212[local17] = this.anInt2540 = this.anIntArray211[local116 >> 8 >> 2 & 0xFF] + local23;
		}
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)I")
	public int method2103() {
		if (this.anInt2542 == 0) {
			this.method2102();
			this.anInt2542 = 256;
		}
		return this.anIntArray212[--this.anInt2542];
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
	private void method2104() {
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
			local19 += local17;
			local15 += local21;
			local19 ^= local17 << 10;
			local13 += local19;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local26 += local17;
			local15 += local13;
			local15 ^= local13 << 8;
			local13 += local26;
			local25 += local15;
			local13 ^= local26 >>> 9;
			local23 += local13;
			local26 += local25;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local25 += this.anIntArray212[local28 + 1];
			local19 += this.anIntArray212[local28 + 4];
			local15 += this.anIntArray212[local28 + 6];
			local23 += this.anIntArray212[local28 + 2];
			local13 += this.anIntArray212[local28 + 7];
			local17 += this.anIntArray212[local28 + 5];
			local21 += this.anIntArray212[local28 + 3];
			local26 += this.anIntArray212[local28];
			local26 ^= local25 << 11;
			local25 += local23;
			local21 += local26;
			local25 ^= local23 >>> 2;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 << 8;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 >>> 16;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 << 10;
			local17 += local15;
			local13 += local19;
			local17 ^= local15 >>> 4;
			local15 += local13;
			local26 += local17;
			local15 ^= local13 << 8;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local23 += local13;
			local26 += local25;
			this.anIntArray211[local28] = local26;
			this.anIntArray211[local28 + 1] = local25;
			this.anIntArray211[local28 + 2] = local23;
			this.anIntArray211[local28 + 3] = local21;
			this.anIntArray211[local28 + 4] = local19;
			this.anIntArray211[local28 + 5] = local17;
			this.anIntArray211[local28 + 6] = local15;
			this.anIntArray211[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local17 += this.anIntArray211[local28 + 5];
			local15 += this.anIntArray211[local28 + 6];
			local23 += this.anIntArray211[local28 + 2];
			local26 += this.anIntArray211[local28];
			local25 += this.anIntArray211[local28 + 1];
			local19 += this.anIntArray211[local28 + 4];
			local13 += this.anIntArray211[local28 + 7];
			local21 += this.anIntArray211[local28 + 3];
			local26 ^= local25 << 11;
			local21 += local26;
			local25 += local23;
			local25 ^= local23 >>> 2;
			local23 += local21;
			local19 += local25;
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
			local26 += local25;
			local23 += local13;
			this.anIntArray211[local28] = local26;
			this.anIntArray211[local28 + 1] = local25;
			this.anIntArray211[local28 + 2] = local23;
			this.anIntArray211[local28 + 3] = local21;
			this.anIntArray211[local28 + 4] = local19;
			this.anIntArray211[local28 + 5] = local17;
			this.anIntArray211[local28 + 6] = local15;
			this.anIntArray211[local28 + 7] = local13;
		}
		this.method2102();
		this.anInt2542 = 256;
	}
}
