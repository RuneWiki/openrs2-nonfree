import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class28 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	private int anInt544;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	private int anInt548;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	private int anInt549;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
	private int[] anIntArray46 = new int[256];

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
	private int anInt554;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "[I")
	private int[] anIntArray47 = new int[256];

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "([I)V")
	public Class28(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray47[local13] = arg0[local13];
		}
		this.method529();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	private void method529() {
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
			local21 += local27;
			local25 += local23;
			local25 ^= local23 << 8;
			local19 += local25;
			local23 += local21;
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
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local17 += this.anIntArray47[local30 + 6];
			local27 += this.anIntArray47[local30 + 1];
			local21 += this.anIntArray47[local30 + 4];
			local19 += this.anIntArray47[local30 + 5];
			local25 += this.anIntArray47[local30 + 2];
			local28 += this.anIntArray47[local30];
			local15 += this.anIntArray47[local30 + 7];
			local23 += this.anIntArray47[local30 + 3];
			local28 ^= local27 << 11;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local23 += local28;
			local25 += local23;
			local25 ^= local23 << 8;
			local19 += local25;
			local21 += local27;
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
			local25 += local15;
			local28 += local27;
			this.anIntArray46[local30] = local28;
			this.anIntArray46[local30 + 1] = local27;
			this.anIntArray46[local30 + 2] = local25;
			this.anIntArray46[local30 + 3] = local23;
			this.anIntArray46[local30 + 4] = local21;
			this.anIntArray46[local30 + 5] = local19;
			this.anIntArray46[local30 + 6] = local17;
			this.anIntArray46[local30 + 7] = local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local21 += this.anIntArray46[local30 + 4];
			local28 += this.anIntArray46[local30];
			local17 += this.anIntArray46[local30 + 6];
			local23 += this.anIntArray46[local30 + 3];
			local15 += this.anIntArray46[local30 + 7];
			local25 += this.anIntArray46[local30 + 2];
			local19 += this.anIntArray46[local30 + 5];
			local27 += this.anIntArray46[local30 + 1];
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
			this.anIntArray46[local30] = local28;
			this.anIntArray46[local30 + 1] = local27;
			this.anIntArray46[local30 + 2] = local25;
			this.anIntArray46[local30 + 3] = local23;
			this.anIntArray46[local30 + 4] = local21;
			this.anIntArray46[local30 + 5] = local19;
			this.anIntArray46[local30 + 6] = local17;
			this.anIntArray46[local30 + 7] = local15;
		}
		this.method531();
		this.anInt554 = 256;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)I")
	public int method530() {
		if (this.anInt554-- == 0) {
			this.method531();
			this.anInt554 = 255;
		}
		return this.anIntArray47[this.anInt554];
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	private void method531() {
		this.anInt544 += ++this.anInt548;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(31) int local31 = this.anIntArray46[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt549 ^= this.anInt549 << 13;
				} else {
					this.anInt549 ^= this.anInt549 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt549 ^= this.anInt549 << 2;
			} else {
				this.anInt549 ^= this.anInt549 >>> 16;
			}
			this.anInt549 += this.anIntArray46[local23 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray46[local23] = local123 = this.anInt549 + this.anIntArray46[local31 >> 2 & 0xFF] + this.anInt544;
			this.anIntArray47[local23] = this.anInt544 = this.anIntArray46[local123 >> 8 >> 2 & 0xFF] + local31;
		}
	}
}
