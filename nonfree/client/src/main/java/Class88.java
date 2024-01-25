import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class88 {

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
	private int anInt2582;

	@OriginalMember(owner = "client!eca", name = "k", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
	private int anInt2585;

	@OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
	private int anInt2588;

	@OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
	private int anInt2589;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "()V")
	private Class88() {
	}

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "([I)V")
	public Class88(@OriginalArg(0) int[] arg0) {
		this.anIntArray159 = new int[256];
		this.anIntArray158 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray158[local13] = arg0[local13];
		}
		this.method2362();
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V")
	private void method2362() {
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
			local17 += local15;
			local13 += local19;
			local17 ^= local15 >>> 4;
			local26 += local17;
			local15 += local13;
			local15 ^= local13 << 8;
			local13 += local26;
			local25 += local15;
			local13 ^= local26 >>> 9;
			local26 += local25;
			local23 += local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local19 += this.anIntArray158[local28 + 4];
			local15 += this.anIntArray158[local28 + 6];
			local23 += this.anIntArray158[local28 + 2];
			local13 += this.anIntArray158[local28 + 7];
			local17 += this.anIntArray158[local28 + 5];
			local26 += this.anIntArray158[local28];
			local21 += this.anIntArray158[local28 + 3];
			local25 += this.anIntArray158[local28 + 1];
			local26 ^= local25 << 11;
			local21 += local26;
			local25 += local23;
			local25 ^= local23 >>> 2;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 << 8;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 >>> 16;
			local19 += local17;
			local15 += local21;
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
			this.anIntArray159[local28] = local26;
			this.anIntArray159[local28 + 1] = local25;
			this.anIntArray159[local28 + 2] = local23;
			this.anIntArray159[local28 + 3] = local21;
			this.anIntArray159[local28 + 4] = local19;
			this.anIntArray159[local28 + 5] = local17;
			this.anIntArray159[local28 + 6] = local15;
			this.anIntArray159[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local26 += this.anIntArray159[local28];
			local19 += this.anIntArray159[local28 + 4];
			local21 += this.anIntArray159[local28 + 3];
			local23 += this.anIntArray159[local28 + 2];
			local17 += this.anIntArray159[local28 + 5];
			local25 += this.anIntArray159[local28 + 1];
			local15 += this.anIntArray159[local28 + 6];
			local13 += this.anIntArray159[local28 + 7];
			local26 ^= local25 << 11;
			local25 += local23;
			local21 += local26;
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
			local13 += local19;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local15 += local13;
			local26 += local17;
			local15 ^= local13 << 8;
			local13 += local26;
			local25 += local15;
			local13 ^= local26 >>> 9;
			local26 += local25;
			local23 += local13;
			this.anIntArray159[local28] = local26;
			this.anIntArray159[local28 + 1] = local25;
			this.anIntArray159[local28 + 2] = local23;
			this.anIntArray159[local28 + 3] = local21;
			this.anIntArray159[local28 + 4] = local19;
			this.anIntArray159[local28 + 5] = local17;
			this.anIntArray159[local28 + 6] = local15;
			this.anIntArray159[local28 + 7] = local13;
		}
		this.method2364();
		this.anInt2588 = 256;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
	private void method2364() {
		this.anInt2582 += ++this.anInt2589;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray159[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt2585 ^= this.anInt2585 << 13;
				} else {
					this.anInt2585 ^= this.anInt2585 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt2585 ^= this.anInt2585 << 2;
			} else {
				this.anInt2585 ^= this.anInt2585 >>> 16;
			}
			this.anInt2585 += this.anIntArray159[local27 + 128 & 0xFF];
			@Pc(138) int local138;
			this.anIntArray159[local27] = local138 = this.anInt2582 + this.anInt2585 + this.anIntArray159[local34 >> 2 & 0xFF];
			this.anIntArray158[local27] = this.anInt2582 = this.anIntArray159[local138 >> 8 >> 2 & 0xFF] + local34;
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)I")
	public int method2367() {
		if (this.anInt2588 == 0) {
			this.method2364();
			this.anInt2588 = 256;
		}
		return this.anIntArray158[--this.anInt2588];
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)I")
	public int method2368() {
		if (this.anInt2588 == 0) {
			this.method2364();
			this.anInt2588 = 256;
		}
		return this.anIntArray158[this.anInt2588 - 1];
	}
}
