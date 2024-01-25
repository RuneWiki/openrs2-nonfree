import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class309 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
	private int[] anIntArray662;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "[I")
	private int[] anIntArray663;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	private int anInt8597;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
	private int anInt8600;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
	private int anInt8606;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
	private int anInt8609;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	private Class309() {
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([I)V")
	public Class309(@OriginalArg(0) int[] arg0) {
		this.anIntArray663 = new int[256];
		this.anIntArray662 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray663[local13] = arg0[local13];
		}
		this.method7071();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I")
	public int method7067() {
		if (this.anInt8597 == 0) {
			this.method7070();
			this.anInt8597 = 256;
		}
		return this.anIntArray663[--this.anInt8597];
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	private void method7070() {
		this.anInt8609 += ++this.anInt8600;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray662[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt8606 ^= this.anInt8606 << 13;
				} else {
					this.anInt8606 ^= this.anInt8606 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt8606 ^= this.anInt8606 << 2;
			} else {
				this.anInt8606 ^= this.anInt8606 >>> 16;
			}
			this.anInt8606 += this.anIntArray662[local23 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray662[local23] = local119 = this.anInt8609 + this.anInt8606 + this.anIntArray662[local30 >> 2 & 0xFF];
			this.anIntArray663[local23] = this.anInt8609 = this.anIntArray662[local119 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
	private void method7071() {
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
			local13 += local26;
			local25 += local15;
			local13 ^= local26 >>> 9;
			local23 += local13;
			local26 += local25;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local25 += this.anIntArray663[local28 + 1];
			local21 += this.anIntArray663[local28 + 3];
			local23 += this.anIntArray663[local28 + 2];
			local26 += this.anIntArray663[local28];
			local17 += this.anIntArray663[local28 + 5];
			local19 += this.anIntArray663[local28 + 4];
			local13 += this.anIntArray663[local28 + 7];
			local15 += this.anIntArray663[local28 + 6];
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
			local15 += local13;
			local26 += local17;
			local15 ^= local13 << 8;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local26 += local25;
			local23 += local13;
			this.anIntArray662[local28] = local26;
			this.anIntArray662[local28 + 1] = local25;
			this.anIntArray662[local28 + 2] = local23;
			this.anIntArray662[local28 + 3] = local21;
			this.anIntArray662[local28 + 4] = local19;
			this.anIntArray662[local28 + 5] = local17;
			this.anIntArray662[local28 + 6] = local15;
			this.anIntArray662[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local26 += this.anIntArray662[local28];
			local21 += this.anIntArray662[local28 + 3];
			local25 += this.anIntArray662[local28 + 1];
			local15 += this.anIntArray662[local28 + 6];
			local17 += this.anIntArray662[local28 + 5];
			local23 += this.anIntArray662[local28 + 2];
			local19 += this.anIntArray662[local28 + 4];
			local13 += this.anIntArray662[local28 + 7];
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
			this.anIntArray662[local28] = local26;
			this.anIntArray662[local28 + 1] = local25;
			this.anIntArray662[local28 + 2] = local23;
			this.anIntArray662[local28 + 3] = local21;
			this.anIntArray662[local28 + 4] = local19;
			this.anIntArray662[local28 + 5] = local17;
			this.anIntArray662[local28 + 6] = local15;
			this.anIntArray662[local28 + 7] = local13;
		}
		this.method7070();
		this.anInt8597 = 256;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)I")
	public int method7073() {
		if (this.anInt8597 == 0) {
			this.method7070();
			this.anInt8597 = 256;
		}
		return this.anIntArray663[this.anInt8597 - 1];
	}
}
