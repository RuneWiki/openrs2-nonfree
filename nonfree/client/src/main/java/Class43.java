import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class43 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "[I")
	private int[] anIntArray112 = new int[256];

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	private int anInt1348;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	private int anInt1350;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "[I")
	private int[] anIntArray113 = new int[256];

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
	private int anInt1352;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
	private int anInt1355;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "([I)V")
	public Class43(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray113[local13] = arg0[local13];
		}
		this.method1042();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	private void method1042() {
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
			local15 += local21;
			local19 += local17;
			local19 ^= local17 << 10;
			local13 += local19;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local26 += local17;
			local15 += local13;
			local15 ^= local13 << 8;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local25 += local15;
			local26 += local25;
			local23 += local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local21 += this.anIntArray113[local28 + 3];
			local17 += this.anIntArray113[local28 + 5];
			local13 += this.anIntArray113[local28 + 7];
			local23 += this.anIntArray113[local28 + 2];
			local25 += this.anIntArray113[local28 + 1];
			local26 += this.anIntArray113[local28];
			local15 += this.anIntArray113[local28 + 6];
			local26 ^= local25 << 11;
			local25 += local23;
			local19 += this.anIntArray113[local28 + 4];
			local21 += local26;
			local25 ^= local23 >>> 2;
			local23 += local21;
			local23 ^= local21 << 8;
			local19 += local25;
			local17 += local23;
			local21 += local19;
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
			local26 += local25;
			local23 += local13;
			this.anIntArray112[local28] = local26;
			this.anIntArray112[local28 + 1] = local25;
			this.anIntArray112[local28 + 2] = local23;
			this.anIntArray112[local28 + 3] = local21;
			this.anIntArray112[local28 + 4] = local19;
			this.anIntArray112[local28 + 5] = local17;
			this.anIntArray112[local28 + 6] = local15;
			this.anIntArray112[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local19 += this.anIntArray112[local28 + 4];
			local13 += this.anIntArray112[local28 + 7];
			local21 += this.anIntArray112[local28 + 3];
			local26 += this.anIntArray112[local28];
			local23 += this.anIntArray112[local28 + 2];
			local25 += this.anIntArray112[local28 + 1];
			local26 ^= local25 << 11;
			local15 += this.anIntArray112[local28 + 6];
			local21 += local26;
			local17 += this.anIntArray112[local28 + 5];
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
			local13 += local26;
			local25 += local15;
			local13 ^= local26 >>> 9;
			local26 += local25;
			local23 += local13;
			this.anIntArray112[local28] = local26;
			this.anIntArray112[local28 + 1] = local25;
			this.anIntArray112[local28 + 2] = local23;
			this.anIntArray112[local28 + 3] = local21;
			this.anIntArray112[local28 + 4] = local19;
			this.anIntArray112[local28 + 5] = local17;
			this.anIntArray112[local28 + 6] = local15;
			this.anIntArray112[local28 + 7] = local13;
		}
		this.method1043();
		this.anInt1350 = 256;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	private void method1043() {
		this.anInt1355 += ++this.anInt1352;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray112[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt1348 ^= this.anInt1348 << 13;
				} else {
					this.anInt1348 ^= this.anInt1348 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt1348 ^= this.anInt1348 << 2;
			} else {
				this.anInt1348 ^= this.anInt1348 >>> 16;
			}
			this.anInt1348 += this.anIntArray112[local19 + 128 & 0xFF];
			@Pc(112) int local112;
			this.anIntArray112[local19] = local112 = this.anInt1355 + this.anInt1348 + this.anIntArray112[local26 >> 2 & 0xFF];
			this.anIntArray113[local19] = this.anInt1355 = local26 + this.anIntArray112[local112 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)I")
	public int method1044() {
		if (this.anInt1350-- == 0) {
			this.method1043();
			this.anInt1350 = 255;
		}
		return this.anIntArray113[this.anInt1350];
	}
}
