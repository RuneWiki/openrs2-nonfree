import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class214 {

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "[I")
	private int[] anIntArray412;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
	private int anInt6032;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	private int anInt6035;

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
	private int anInt6042;

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
	private int anInt6043;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	private Class214() {
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "([I)V")
	public Class214(@OriginalArg(0) int[] arg0) {
		this.anIntArray412 = new int[256];
		this.anIntArray413 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray412[local13] = arg0[local13];
		}
		this.method4763();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)I")
	public int method4757() {
		if (this.anInt6043 == 0) {
			this.method4764();
			this.anInt6043 = 256;
		}
		return this.anIntArray412[--this.anInt6043];
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)I")
	public int method4758() {
		if (this.anInt6043 == 0) {
			this.method4764();
			this.anInt6043 = 256;
		}
		return this.anIntArray412[this.anInt6043 - 1];
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
	private void method4763() {
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(28) int local28 = -1640531527;
		@Pc(30) int local30;
		for (local30 = 0; local30 < 4; local30++) {
			local28 ^= local27 << 11;
			local23 += local28;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 << 8;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 >>> 16;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local17 += local15;
			local28 += local19;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local21 += this.anIntArray412[local30 + 4];
			local17 += this.anIntArray412[local30 + 6];
			local28 += this.anIntArray412[local30];
			local27 += this.anIntArray412[local30 + 1];
			local15 += this.anIntArray412[local30 + 7];
			local19 += this.anIntArray412[local30 + 5];
			local25 += this.anIntArray412[local30 + 2];
			local23 += this.anIntArray412[local30 + 3];
			local28 ^= local27 << 11;
			local23 += local28;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local21 += local27;
			local25 += local23;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 << 10;
			local15 += local21;
			local19 += local17;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local28 += local27;
			local25 += local15;
			this.anIntArray413[local30] = local28;
			this.anIntArray413[local30 + 1] = local27;
			this.anIntArray413[local30 + 2] = local25;
			this.anIntArray413[local30 + 3] = local23;
			this.anIntArray413[local30 + 4] = local21;
			this.anIntArray413[local30 + 5] = local19;
			this.anIntArray413[local30 + 6] = local17;
			this.anIntArray413[local30 + 7] = local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local28 += this.anIntArray413[local30];
			local17 += this.anIntArray413[local30 + 6];
			local23 += this.anIntArray413[local30 + 3];
			local15 += this.anIntArray413[local30 + 7];
			local19 += this.anIntArray413[local30 + 5];
			local27 += this.anIntArray413[local30 + 1];
			local25 += this.anIntArray413[local30 + 2];
			local21 += this.anIntArray413[local30 + 4];
			local28 ^= local27 << 11;
			local27 += local25;
			local23 += local28;
			local27 ^= local25 >>> 2;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local17 += local15;
			local28 += local19;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local28 += local27;
			local25 += local15;
			this.anIntArray413[local30] = local28;
			this.anIntArray413[local30 + 1] = local27;
			this.anIntArray413[local30 + 2] = local25;
			this.anIntArray413[local30 + 3] = local23;
			this.anIntArray413[local30 + 4] = local21;
			this.anIntArray413[local30 + 5] = local19;
			this.anIntArray413[local30 + 6] = local17;
			this.anIntArray413[local30 + 7] = local15;
		}
		this.method4764();
		this.anInt6043 = 256;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V")
	private void method4764() {
		this.anInt6042 += ++this.anInt6035;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray413[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt6032 ^= this.anInt6032 << 13;
				} else {
					this.anInt6032 ^= this.anInt6032 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt6032 ^= this.anInt6032 << 2;
			} else {
				this.anInt6032 ^= this.anInt6032 >>> 16;
			}
			this.anInt6032 += this.anIntArray413[local27 + 128 & 0xFF];
			@Pc(128) int local128;
			this.anIntArray413[local27] = local128 = this.anIntArray413[local34 >> 2 & 0xFF] + this.anInt6032 + this.anInt6042;
			this.anIntArray412[local27] = this.anInt6042 = local34 + this.anIntArray413[local128 >> 8 >> 2 & 0xFF];
		}
	}
}
