import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class22 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "[I")
	private final int[] anIntArray113 = new int[256];

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "[I")
	private final int[] anIntArray114 = new int[256];

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([I)V")
	public Class22(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray113[local13] = arg0[local13];
		}
		this.method595();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
	public int method592() {
		if (this.anInt859-- == 0) {
			this.method594();
			this.anInt859 = 255;
		}
		return this.anIntArray113[this.anInt859];
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
	private void method594() {
		this.anInt866 += ++this.anInt857;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) int local31 = this.anIntArray114[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt865 ^= this.anInt865 << 13;
				} else {
					this.anInt865 ^= this.anInt865 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt865 ^= this.anInt865 << 2;
			} else {
				this.anInt865 ^= this.anInt865 >>> 16;
			}
			this.anInt865 += this.anIntArray114[local19 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray114[local19] = local124 = this.anInt866 + this.anIntArray114[local31 >> 2 & 0xFF] + this.anInt865;
			this.anIntArray113[local19] = this.anInt866 = local31 + this.anIntArray114[local124 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	private void method595() {
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
			local23 += local28;
			local21 += local27;
			local25 += local23;
			local25 ^= local23 << 8;
			local23 += local21;
			local23 ^= local21 >>> 16;
			local17 += local23;
			local19 += local25;
			local21 += local19;
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
			local21 += this.anIntArray113[local30 + 4];
			local15 += this.anIntArray113[local30 + 7];
			local19 += this.anIntArray113[local30 + 5];
			local27 += this.anIntArray113[local30 + 1];
			local23 += this.anIntArray113[local30 + 3];
			local28 += this.anIntArray113[local30];
			local17 += this.anIntArray113[local30 + 6];
			local25 += this.anIntArray113[local30 + 2];
			local28 ^= local27 << 11;
			local23 += local28;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local21 += local27;
			local25 += local23;
			local25 ^= local23 << 8;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 >>> 16;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 << 10;
			local19 += local17;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local15 += local21;
			local17 += local15;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local28 += local27;
			this.anIntArray114[local30] = local28;
			local25 += local15;
			this.anIntArray114[local30 + 1] = local27;
			this.anIntArray114[local30 + 2] = local25;
			this.anIntArray114[local30 + 3] = local23;
			this.anIntArray114[local30 + 4] = local21;
			this.anIntArray114[local30 + 5] = local19;
			this.anIntArray114[local30 + 6] = local17;
			this.anIntArray114[local30 + 7] = local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local23 += this.anIntArray114[local30 + 3];
			local25 += this.anIntArray114[local30 + 2];
			local19 += this.anIntArray114[local30 + 5];
			local17 += this.anIntArray114[local30 + 6];
			local27 += this.anIntArray114[local30 + 1];
			local21 += this.anIntArray114[local30 + 4];
			local28 += this.anIntArray114[local30];
			local15 += this.anIntArray114[local30 + 7];
			local28 ^= local27 << 11;
			local23 += local28;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local21 += local27;
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
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
			this.anIntArray114[local30] = local28;
			this.anIntArray114[local30 + 1] = local27;
			this.anIntArray114[local30 + 2] = local25;
			this.anIntArray114[local30 + 3] = local23;
			this.anIntArray114[local30 + 4] = local21;
			this.anIntArray114[local30 + 5] = local19;
			this.anIntArray114[local30 + 6] = local17;
			this.anIntArray114[local30 + 7] = local15;
		}
		this.method594();
		this.anInt859 = 256;
	}
}
