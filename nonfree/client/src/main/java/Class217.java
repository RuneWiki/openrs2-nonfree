import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class217 {

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "[I")
	public static int[] anIntArray409 = new int[2];

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "[I")
	public static final int[] anIntArray410 = new int[2048];

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "[I")
	private int[] anIntArray408;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	private int anInt6054;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	private int anInt6060;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
	private int anInt6062;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
	private int anInt6063;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V", line = 396)
	private Class217() {
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "([I)V", line = 399)
	public Class217(@OriginalArg(0) int[] arg0) {
		this.anIntArray411 = new int[256];
		this.anIntArray408 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray411[local13] = arg0[local13];
		}
		this.method5538();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I", line = 5)
	public int method5534() {
		if (this.anInt6063 == 0) {
			this.method5539();
			this.anInt6063 = 256;
		}
		return this.anIntArray411[this.anInt6063 - 1];
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)I", line = 26)
	public int method5535() {
		if (this.anInt6063 == 0) {
			this.method5539();
			this.anInt6063 = 256;
		}
		return this.anIntArray411[--this.anInt6063];
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V", line = 129)
	private void method5538() {
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
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local15 += local28;
			local27 += local17;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local17 += this.anIntArray411[local30 + 6];
			local21 += this.anIntArray411[local30 + 4];
			local15 += this.anIntArray411[local30 + 7];
			local19 += this.anIntArray411[local30 + 5];
			local23 += this.anIntArray411[local30 + 3];
			local27 += this.anIntArray411[local30 + 1];
			local25 += this.anIntArray411[local30 + 2];
			local28 += this.anIntArray411[local30];
			local28 ^= local27 << 11;
			local23 += local28;
			local27 += local25;
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
			local25 += local15;
			local28 += local27;
			this.anIntArray408[local30] = local28;
			this.anIntArray408[local30 + 1] = local27;
			this.anIntArray408[local30 + 2] = local25;
			this.anIntArray408[local30 + 3] = local23;
			this.anIntArray408[local30 + 4] = local21;
			this.anIntArray408[local30 + 5] = local19;
			this.anIntArray408[local30 + 6] = local17;
			this.anIntArray408[local30 + 7] = local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local15 += this.anIntArray408[local30 + 7];
			local28 += this.anIntArray408[local30];
			local19 += this.anIntArray408[local30 + 5];
			local21 += this.anIntArray408[local30 + 4];
			local27 += this.anIntArray408[local30 + 1];
			local17 += this.anIntArray408[local30 + 6];
			local23 += this.anIntArray408[local30 + 3];
			local25 += this.anIntArray408[local30 + 2];
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
			local17 += local23;
			local21 += local19;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local28 += local27;
			local25 += local15;
			this.anIntArray408[local30] = local28;
			this.anIntArray408[local30 + 1] = local27;
			this.anIntArray408[local30 + 2] = local25;
			this.anIntArray408[local30 + 3] = local23;
			this.anIntArray408[local30 + 4] = local21;
			this.anIntArray408[local30 + 5] = local19;
			this.anIntArray408[local30 + 6] = local17;
			this.anIntArray408[local30 + 7] = local15;
		}
		this.method5539();
		this.anInt6063 = 256;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V", line = 278)
	private void method5539() {
		this.anInt6060 += ++this.anInt6062;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(29) int local29 = this.anIntArray408[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt6054 ^= this.anInt6054 << 13;
				} else {
					this.anInt6054 ^= this.anInt6054 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt6054 ^= this.anInt6054 << 2;
			} else {
				this.anInt6054 ^= this.anInt6054 >>> 16;
			}
			this.anInt6054 += this.anIntArray408[local23 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray408[local23] = local116 = this.anInt6060 + this.anIntArray408[local29 >> 2 & 0xFF] + this.anInt6054;
			this.anIntArray411[local23] = this.anInt6060 = this.anIntArray408[local116 >> 8 >> 2 & 0xFF] + local29;
		}
	}
}
