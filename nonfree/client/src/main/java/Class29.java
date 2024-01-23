import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class29 {

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "[I")
	private int[] anIntArray113 = new int[256];

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "[I")
	private int[] anIntArray114 = new int[256];

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "([I)V")
	public Class29(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray114[local13] = arg0[local13];
		}
		this.method690();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
	private void method688() {
		this.anInt870 += ++this.anInt861;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(33) int local33 = this.anIntArray113[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt864 ^= this.anInt864 << 13;
				} else {
					this.anInt864 ^= this.anInt864 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt864 ^= this.anInt864 << 2;
			} else {
				this.anInt864 ^= this.anInt864 >>> 16;
			}
			this.anInt864 += this.anIntArray113[local25 + 128 & 0xFF];
			@Pc(126) int local126;
			this.anIntArray113[local25] = local126 = this.anInt870 + this.anIntArray113[local33 >> 2 & 0xFF] + this.anInt864;
			this.anIntArray114[local25] = this.anInt870 = this.anIntArray113[local126 >> 8 >> 2 & 0xFF] + local33;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	private void method690() {
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
			local27 ^= local25 >>> 2;
			local21 += local27;
			local23 += local28;
			local25 += local23;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local21 += local19;
			local21 ^= local19 << 10;
			local15 += local21;
			local17 += local23;
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
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local17 += this.anIntArray114[local30 + 6];
			local27 += this.anIntArray114[local30 + 1];
			local19 += this.anIntArray114[local30 + 5];
			local21 += this.anIntArray114[local30 + 4];
			local15 += this.anIntArray114[local30 + 7];
			local23 += this.anIntArray114[local30 + 3];
			local25 += this.anIntArray114[local30 + 2];
			local28 += this.anIntArray114[local30];
			local28 ^= local27 << 11;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local21 += local27;
			local23 += local28;
			local25 += local23;
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
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local27 += local17;
			local28 += local27;
			this.anIntArray113[local30] = local28;
			this.anIntArray113[local30 + 1] = local27;
			this.anIntArray113[local30 + 2] = local25;
			this.anIntArray113[local30 + 3] = local23;
			this.anIntArray113[local30 + 4] = local21;
			this.anIntArray113[local30 + 5] = local19;
			this.anIntArray113[local30 + 6] = local17;
			this.anIntArray113[local30 + 7] = local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local23 += this.anIntArray113[local30 + 3];
			local21 += this.anIntArray113[local30 + 4];
			local19 += this.anIntArray113[local30 + 5];
			local17 += this.anIntArray113[local30 + 6];
			local27 += this.anIntArray113[local30 + 1];
			local15 += this.anIntArray113[local30 + 7];
			local28 += this.anIntArray113[local30];
			local28 ^= local27 << 11;
			local25 += this.anIntArray113[local30 + 2];
			local23 += local28;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local21 += local27;
			local25 += local23;
			local25 ^= local23 << 8;
			local23 += local21;
			local23 ^= local21 >>> 16;
			local19 += local25;
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
			local25 += local15;
			local28 += local27;
			this.anIntArray113[local30] = local28;
			this.anIntArray113[local30 + 1] = local27;
			this.anIntArray113[local30 + 2] = local25;
			this.anIntArray113[local30 + 3] = local23;
			this.anIntArray113[local30 + 4] = local21;
			this.anIntArray113[local30 + 5] = local19;
			this.anIntArray113[local30 + 6] = local17;
			this.anIntArray113[local30 + 7] = local15;
		}
		this.method688();
		this.anInt871 = 256;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I")
	public int method692() {
		if (this.anInt871-- == 0) {
			this.method688();
			this.anInt871 = 255;
		}
		return this.anIntArray114[this.anInt871];
	}
}
