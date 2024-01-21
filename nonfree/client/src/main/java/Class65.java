import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class65 {

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	private int anInt3077;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
	private int anInt3078;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
	private int anInt3081;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
	private int anInt3082;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "[I")
	private final int[] anIntArray320 = new int[256];

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
	private final int[] anIntArray319 = new int[256];

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([I)V")
	public Class65(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray319[local13] = arg0[local13];
		}
		this.method2231();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)I")
	public int method2229() {
		if (this.anInt3081-- == 0) {
			this.method2230();
			this.anInt3081 = 255;
		}
		return this.anIntArray319[this.anInt3081];
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	private void method2230() {
		this.anInt3077 += ++this.anInt3082;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray320[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt3078 ^= this.anInt3078 << 13;
				} else {
					this.anInt3078 ^= this.anInt3078 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt3078 ^= this.anInt3078 << 2;
			} else {
				this.anInt3078 ^= this.anInt3078 >>> 16;
			}
			this.anInt3078 += this.anIntArray320[local25 + 128 & 0xFF];
			@Pc(125) int local125;
			this.anIntArray320[local25] = local125 = this.anInt3078 + this.anIntArray320[local32 >> 2 & 0xFF] + this.anInt3077;
			this.anIntArray319[local25] = this.anInt3077 = local32 + this.anIntArray320[local125 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
	private void method2231() {
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
			local23 += local21;
			local23 ^= local21 << 8;
			local17 += local23;
			local19 += local25;
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
			local13 ^= local26 >>> 9;
			local25 += local15;
			local23 += local13;
			local26 += local25;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local15 += this.anIntArray319[local28 + 6];
			local19 += this.anIntArray319[local28 + 4];
			local26 += this.anIntArray319[local28];
			local21 += this.anIntArray319[local28 + 3];
			local17 += this.anIntArray319[local28 + 5];
			local25 += this.anIntArray319[local28 + 1];
			local13 += this.anIntArray319[local28 + 7];
			local23 += this.anIntArray319[local28 + 2];
			local26 ^= local25 << 11;
			local21 += local26;
			local25 += local23;
			local25 ^= local23 >>> 2;
			local23 += local21;
			local23 ^= local21 << 8;
			local17 += local23;
			local19 += local25;
			local21 += local19;
			local21 ^= local19 >>> 16;
			local15 += local21;
			local19 += local17;
			local19 ^= local17 << 10;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local13 += local19;
			local15 += local13;
			local15 ^= local13 << 8;
			local26 += local17;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local25 += local15;
			local26 += local25;
			local23 += local13;
			this.anIntArray320[local28] = local26;
			this.anIntArray320[local28 + 1] = local25;
			this.anIntArray320[local28 + 2] = local23;
			this.anIntArray320[local28 + 3] = local21;
			this.anIntArray320[local28 + 4] = local19;
			this.anIntArray320[local28 + 5] = local17;
			this.anIntArray320[local28 + 6] = local15;
			this.anIntArray320[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local26 += this.anIntArray320[local28];
			local17 += this.anIntArray320[local28 + 5];
			local15 += this.anIntArray320[local28 + 6];
			local25 += this.anIntArray320[local28 + 1];
			local21 += this.anIntArray320[local28 + 3];
			local23 += this.anIntArray320[local28 + 2];
			local26 ^= local25 << 11;
			local25 += local23;
			local21 += local26;
			local25 ^= local23 >>> 2;
			local13 += this.anIntArray320[local28 + 7];
			local23 += local21;
			local19 += this.anIntArray320[local28 + 4];
			local23 ^= local21 << 8;
			local17 += local23;
			local19 += local25;
			local21 += local19;
			local21 ^= local19 >>> 16;
			local19 += local17;
			local19 ^= local17 << 10;
			local13 += local19;
			local15 += local21;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local15 += local13;
			local15 ^= local13 << 8;
			local26 += local17;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local26 += local25;
			this.anIntArray320[local28] = local26;
			this.anIntArray320[local28 + 1] = local25;
			local23 += local13;
			this.anIntArray320[local28 + 2] = local23;
			this.anIntArray320[local28 + 3] = local21;
			this.anIntArray320[local28 + 4] = local19;
			this.anIntArray320[local28 + 5] = local17;
			this.anIntArray320[local28 + 6] = local15;
			this.anIntArray320[local28 + 7] = local13;
		}
		this.method2230();
		this.anInt3081 = 256;
	}
}
