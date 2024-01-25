import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class115 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	private int anInt3305;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	private int anInt3307;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "[I")
	private int[] anIntArray314;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	private int anInt3314;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	private int anInt3315;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	private Class115() {
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([I)V")
	public Class115(@OriginalArg(0) int[] arg0) {
		this.anIntArray313 = new int[256];
		this.anIntArray314 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray313[local13] = arg0[local13];
		}
		this.method2772();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	private void method2772() {
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
			local13 += local26;
			local25 += local15;
			local13 ^= local26 >>> 9;
			local23 += local13;
			local26 += local25;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local26 += this.anIntArray313[local28];
			local23 += this.anIntArray313[local28 + 2];
			local13 += this.anIntArray313[local28 + 7];
			local19 += this.anIntArray313[local28 + 4];
			local21 += this.anIntArray313[local28 + 3];
			local15 += this.anIntArray313[local28 + 6];
			local17 += this.anIntArray313[local28 + 5];
			local25 += this.anIntArray313[local28 + 1];
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
			local13 += local19;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local26 += local17;
			local15 += local13;
			local15 ^= local13 << 8;
			local13 += local26;
			local25 += local15;
			local13 ^= local26 >>> 9;
			local26 += local25;
			local23 += local13;
			this.anIntArray314[local28] = local26;
			this.anIntArray314[local28 + 1] = local25;
			this.anIntArray314[local28 + 2] = local23;
			this.anIntArray314[local28 + 3] = local21;
			this.anIntArray314[local28 + 4] = local19;
			this.anIntArray314[local28 + 5] = local17;
			this.anIntArray314[local28 + 6] = local15;
			this.anIntArray314[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local17 += this.anIntArray314[local28 + 5];
			local23 += this.anIntArray314[local28 + 2];
			local15 += this.anIntArray314[local28 + 6];
			local25 += this.anIntArray314[local28 + 1];
			local26 += this.anIntArray314[local28];
			local19 += this.anIntArray314[local28 + 4];
			local21 += this.anIntArray314[local28 + 3];
			local13 += this.anIntArray314[local28 + 7];
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
			local26 += local25;
			local23 += local13;
			this.anIntArray314[local28] = local26;
			this.anIntArray314[local28 + 1] = local25;
			this.anIntArray314[local28 + 2] = local23;
			this.anIntArray314[local28 + 3] = local21;
			this.anIntArray314[local28 + 4] = local19;
			this.anIntArray314[local28 + 5] = local17;
			this.anIntArray314[local28 + 6] = local15;
			this.anIntArray314[local28 + 7] = local13;
		}
		this.method2775();
		this.anInt3314 = 256;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)I")
	public int method2774() {
		if (this.anInt3314 == 0) {
			this.method2775();
			this.anInt3314 = 256;
		}
		return this.anIntArray313[this.anInt3314 - 1];
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	private void method2775() {
		this.anInt3315 += ++this.anInt3307;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray314[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt3305 ^= this.anInt3305 << 13;
				} else {
					this.anInt3305 ^= this.anInt3305 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt3305 ^= this.anInt3305 << 2;
			} else {
				this.anInt3305 ^= this.anInt3305 >>> 16;
			}
			this.anInt3305 += this.anIntArray314[local25 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray314[local25] = local122 = this.anIntArray314[local32 >> 2 & 0xFF] + this.anInt3305 + this.anInt3315;
			this.anIntArray313[local25] = this.anInt3315 = local32 + this.anIntArray314[local122 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I")
	public int method2778() {
		if (this.anInt3314 == 0) {
			this.method2775();
			this.anInt3314 = 256;
		}
		return this.anIntArray313[--this.anInt3314];
	}
}
