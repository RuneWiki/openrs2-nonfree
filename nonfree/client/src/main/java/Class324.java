import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class324 {

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
	private int anInt8740;

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
	private int anInt8743;

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "[I")
	private int[] anIntArray644;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
	private int anInt8746;

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
	private int anInt8747;

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "[I")
	private int[] anIntArray645;

	static {
		new Class261("", 76);
	}

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	private Class324() {
	}

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "([I)V")
	public Class324(@OriginalArg(0) int[] arg0) {
		this.anIntArray644 = new int[256];
		this.anIntArray645 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray645[local13] = arg0[local13];
		}
		this.method7155();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	private void method7154() {
		this.anInt8746 += ++this.anInt8743;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray644[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt8747 ^= this.anInt8747 << 13;
				} else {
					this.anInt8747 ^= this.anInt8747 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt8747 ^= this.anInt8747 << 2;
			} else {
				this.anInt8747 ^= this.anInt8747 >>> 16;
			}
			this.anInt8747 += this.anIntArray644[local24 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray644[local24] = local123 = this.anInt8746 + this.anInt8747 + this.anIntArray644[local31 >> 2 & 0xFF];
			this.anIntArray645[local24] = this.anInt8746 = this.anIntArray644[local123 >> 8 >> 2 & 0xFF] + local31;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
	private void method7155() {
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
			local21 += local27;
			local25 += local23;
			local25 ^= local23 << 8;
			local19 += local25;
			local23 += local21;
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
			local15 += local28;
			local27 += local17;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local28 += this.anIntArray645[local30];
			local19 += this.anIntArray645[local30 + 5];
			local23 += this.anIntArray645[local30 + 3];
			local17 += this.anIntArray645[local30 + 6];
			local21 += this.anIntArray645[local30 + 4];
			local15 += this.anIntArray645[local30 + 7];
			local25 += this.anIntArray645[local30 + 2];
			local27 += this.anIntArray645[local30 + 1];
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
			local21 += local19;
			local17 += local23;
			local21 ^= local19 << 10;
			local15 += local21;
			local19 += local17;
			local19 ^= local17 >>> 4;
			local17 += local15;
			local28 += local19;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local28 += local27;
			local25 += local15;
			this.anIntArray644[local30] = local28;
			this.anIntArray644[local30 + 1] = local27;
			this.anIntArray644[local30 + 2] = local25;
			this.anIntArray644[local30 + 3] = local23;
			this.anIntArray644[local30 + 4] = local21;
			this.anIntArray644[local30 + 5] = local19;
			this.anIntArray644[local30 + 6] = local17;
			this.anIntArray644[local30 + 7] = local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local21 += this.anIntArray644[local30 + 4];
			local19 += this.anIntArray644[local30 + 5];
			local25 += this.anIntArray644[local30 + 2];
			local17 += this.anIntArray644[local30 + 6];
			local15 += this.anIntArray644[local30 + 7];
			local27 += this.anIntArray644[local30 + 1];
			local23 += this.anIntArray644[local30 + 3];
			local28 += this.anIntArray644[local30];
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
			local17 += local15;
			local28 += local19;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
			this.anIntArray644[local30] = local28;
			this.anIntArray644[local30 + 1] = local27;
			this.anIntArray644[local30 + 2] = local25;
			this.anIntArray644[local30 + 3] = local23;
			this.anIntArray644[local30 + 4] = local21;
			this.anIntArray644[local30 + 5] = local19;
			this.anIntArray644[local30 + 6] = local17;
			this.anIntArray644[local30 + 7] = local15;
		}
		this.method7154();
		this.anInt8740 = 256;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)I")
	public int method7158() {
		if (this.anInt8740 == 0) {
			this.method7154();
			this.anInt8740 = 256;
		}
		return this.anIntArray645[--this.anInt8740];
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)I")
	public int method7159() {
		if (this.anInt8740 == 0) {
			this.method7154();
			this.anInt8740 = 256;
		}
		return this.anIntArray645[this.anInt8740 - 1];
	}
}
