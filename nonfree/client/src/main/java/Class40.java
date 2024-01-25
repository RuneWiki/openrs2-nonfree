import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class40 {

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
	private int anInt1272;

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
	private int anInt1275;

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
	private int anInt1276;

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
	private int anInt1277;

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V")
	private Class40() {
	}

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "([I)V")
	public Class40(@OriginalArg(0) int[] arg0) {
		this.anIntArray75 = new int[256];
		this.anIntArray76 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray76[local13] = arg0[local13];
		}
		this.method1286();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)I")
	public int method1282() {
		if (this.anInt1275 == 0) {
			this.method1285();
			this.anInt1275 = 256;
		}
		return this.anIntArray76[--this.anInt1275];
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)I")
	public int method1283() {
		if (this.anInt1275 == 0) {
			this.method1285();
			this.anInt1275 = 256;
		}
		return this.anIntArray76[this.anInt1275 - 1];
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
	private void method1285() {
		this.anInt1272 += ++this.anInt1277;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(30) int local30 = this.anIntArray75[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt1276 ^= this.anInt1276 << 13;
				} else {
					this.anInt1276 ^= this.anInt1276 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt1276 ^= this.anInt1276 << 2;
			} else {
				this.anInt1276 ^= this.anInt1276 >>> 16;
			}
			this.anInt1276 += this.anIntArray75[local24 + 128 & 0xFF];
			@Pc(117) int local117;
			this.anIntArray75[local24] = local117 = this.anIntArray75[local30 >> 2 & 0xFF] + this.anInt1276 + this.anInt1272;
			this.anIntArray76[local24] = this.anInt1272 = this.anIntArray75[local117 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V")
	private void method1286() {
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
			local21 += local26;
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
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local23 += this.anIntArray76[local28 + 2];
			local25 += this.anIntArray76[local28 + 1];
			local17 += this.anIntArray76[local28 + 5];
			local21 += this.anIntArray76[local28 + 3];
			local13 += this.anIntArray76[local28 + 7];
			local15 += this.anIntArray76[local28 + 6];
			local19 += this.anIntArray76[local28 + 4];
			local26 += this.anIntArray76[local28];
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
			this.anIntArray75[local28] = local26;
			this.anIntArray75[local28 + 1] = local25;
			this.anIntArray75[local28 + 2] = local23;
			this.anIntArray75[local28 + 3] = local21;
			this.anIntArray75[local28 + 4] = local19;
			this.anIntArray75[local28 + 5] = local17;
			this.anIntArray75[local28 + 6] = local15;
			this.anIntArray75[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local13 += this.anIntArray75[local28 + 7];
			local19 += this.anIntArray75[local28 + 4];
			local25 += this.anIntArray75[local28 + 1];
			local21 += this.anIntArray75[local28 + 3];
			local26 += this.anIntArray75[local28];
			local17 += this.anIntArray75[local28 + 5];
			local23 += this.anIntArray75[local28 + 2];
			local15 += this.anIntArray75[local28 + 6];
			local26 ^= local25 << 11;
			local21 += local26;
			local25 += local23;
			local25 ^= local23 >>> 2;
			local23 += local21;
			local19 += local25;
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
			this.anIntArray75[local28] = local26;
			this.anIntArray75[local28 + 1] = local25;
			this.anIntArray75[local28 + 2] = local23;
			this.anIntArray75[local28 + 3] = local21;
			this.anIntArray75[local28 + 4] = local19;
			this.anIntArray75[local28 + 5] = local17;
			this.anIntArray75[local28 + 6] = local15;
			this.anIntArray75[local28 + 7] = local13;
		}
		this.method1285();
		this.anInt1275 = 256;
	}
}
