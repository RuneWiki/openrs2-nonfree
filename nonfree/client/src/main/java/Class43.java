import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class43 {

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
	private int anInt1759;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
	private int anInt1762;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private int anInt1764;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt1765;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "[I")
	private final int[] anIntArray253 = new int[256];

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "[I")
	private final int[] anIntArray254 = new int[256];

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([I)V")
	public Class43(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray254[local13] = arg0[local13];
		}
		this.method1225();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	private void method1223() {
		this.anInt1765 += ++this.anInt1764;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(30) int local30 = this.anIntArray253[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt1762 ^= this.anInt1762 << 13;
				} else {
					this.anInt1762 ^= this.anInt1762 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt1762 ^= this.anInt1762 << 2;
			} else {
				this.anInt1762 ^= this.anInt1762 >>> 16;
			}
			this.anInt1762 += this.anIntArray253[local24 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray253[local24] = local119 = this.anInt1765 + this.anIntArray253[local30 >> 2 & 0xFF] + this.anInt1762;
			this.anIntArray254[local24] = this.anInt1765 = this.anIntArray253[local119 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)I")
	public int method1224() {
		if (this.anInt1759-- == 0) {
			this.method1223();
			this.anInt1759 = 255;
		}
		return this.anIntArray254[this.anInt1759];
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	private void method1225() {
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
			local25 ^= local23 >>> 2;
			local19 += local25;
			local21 += local26;
			local23 += local21;
			local23 ^= local21 << 8;
			local21 += local19;
			local21 ^= local19 >>> 16;
			local17 += local23;
			local15 += local21;
			local19 += local17;
			local19 ^= local17 << 10;
			local13 += local19;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local15 += local13;
			local15 ^= local13 << 8;
			local26 += local17;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local23 += local13;
			local26 += local25;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local21 += this.anIntArray254[local28 + 3];
			local19 += this.anIntArray254[local28 + 4];
			local17 += this.anIntArray254[local28 + 5];
			local13 += this.anIntArray254[local28 + 7];
			local23 += this.anIntArray254[local28 + 2];
			local15 += this.anIntArray254[local28 + 6];
			local26 += this.anIntArray254[local28];
			local25 += this.anIntArray254[local28 + 1];
			local26 ^= local25 << 11;
			local21 += local26;
			local25 += local23;
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
			local17 += local15;
			local17 ^= local15 >>> 4;
			local13 += local19;
			local15 += local13;
			local26 += local17;
			local15 ^= local13 << 8;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local26 += local25;
			this.anIntArray253[local28] = local26;
			local23 += local13;
			this.anIntArray253[local28 + 1] = local25;
			this.anIntArray253[local28 + 2] = local23;
			this.anIntArray253[local28 + 3] = local21;
			this.anIntArray253[local28 + 4] = local19;
			this.anIntArray253[local28 + 5] = local17;
			this.anIntArray253[local28 + 6] = local15;
			this.anIntArray253[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local26 += this.anIntArray253[local28];
			local13 += this.anIntArray253[local28 + 7];
			local17 += this.anIntArray253[local28 + 5];
			local19 += this.anIntArray253[local28 + 4];
			local23 += this.anIntArray253[local28 + 2];
			local15 += this.anIntArray253[local28 + 6];
			local21 += this.anIntArray253[local28 + 3];
			local25 += this.anIntArray253[local28 + 1];
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
			local17 ^= local15 >>> 4;
			local13 += local19;
			local26 += local17;
			local15 += local13;
			local15 ^= local13 << 8;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local26 += local25;
			this.anIntArray253[local28] = local26;
			local23 += local13;
			this.anIntArray253[local28 + 1] = local25;
			this.anIntArray253[local28 + 2] = local23;
			this.anIntArray253[local28 + 3] = local21;
			this.anIntArray253[local28 + 4] = local19;
			this.anIntArray253[local28 + 5] = local17;
			this.anIntArray253[local28 + 6] = local15;
			this.anIntArray253[local28 + 7] = local13;
		}
		this.method1223();
		this.anInt1759 = 256;
	}
}
