import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class71 {

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	private int anInt2539;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	private int anInt2543;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "I")
	private int anInt2547;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "I")
	private int anInt2548;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "[I")
	private final int[] anIntArray291 = new int[256];

	@OriginalMember(owner = "client!se", name = "l", descriptor = "[I")
	private final int[] anIntArray290 = new int[256];

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "([I)V")
	public Class71(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray291[local13] = arg0[local13];
		}
		this.method1832();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
	private void method1832() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23;
		for (local23 = 0; local23 < 4; local23++) {
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray291[local23];
			local20 += this.anIntArray291[local23 + 1];
			local14 += this.anIntArray291[local23 + 4];
			local10 += this.anIntArray291[local23 + 6];
			local16 += this.anIntArray291[local23 + 3];
			local8 += this.anIntArray291[local23 + 7];
			local12 += this.anIntArray291[local23 + 5];
			local21 ^= local20 << 11;
			local18 += this.anIntArray291[local23 + 2];
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local21 += local12;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray290[local23] = local21;
			this.anIntArray290[local23 + 1] = local20;
			this.anIntArray290[local23 + 2] = local18;
			this.anIntArray290[local23 + 3] = local16;
			this.anIntArray290[local23 + 4] = local14;
			this.anIntArray290[local23 + 5] = local12;
			this.anIntArray290[local23 + 6] = local10;
			this.anIntArray290[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray290[local23 + 5];
			local20 += this.anIntArray290[local23 + 1];
			local21 += this.anIntArray290[local23];
			local14 += this.anIntArray290[local23 + 4];
			local16 += this.anIntArray290[local23 + 3];
			local18 += this.anIntArray290[local23 + 2];
			local8 += this.anIntArray290[local23 + 7];
			local21 ^= local20 << 11;
			local16 += local21;
			local10 += this.anIntArray290[local23 + 6];
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray290[local23] = local21;
			this.anIntArray290[local23 + 1] = local20;
			this.anIntArray290[local23 + 2] = local18;
			this.anIntArray290[local23 + 3] = local16;
			this.anIntArray290[local23 + 4] = local14;
			this.anIntArray290[local23 + 5] = local12;
			this.anIntArray290[local23 + 6] = local10;
			this.anIntArray290[local23 + 7] = local8;
		}
		this.method1834();
		this.anInt2548 = 256;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	private void method1834() {
		this.anInt2543 += ++this.anInt2547;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray290[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt2539 ^= this.anInt2539 << 13;
				} else {
					this.anInt2539 ^= this.anInt2539 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt2539 ^= this.anInt2539 << 2;
			} else {
				this.anInt2539 ^= this.anInt2539 >>> 16;
			}
			this.anInt2539 += this.anIntArray290[local25 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray290[local25] = local124 = this.anInt2543 + this.anIntArray290[local32 >> 2 & 0xFF] + this.anInt2539;
			this.anIntArray291[local25] = this.anInt2543 = local32 + this.anIntArray290[local124 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
	public int method1835() {
		if (this.anInt2548-- == 0) {
			this.method1834();
			this.anInt2548 = 255;
		}
		return this.anIntArray291[this.anInt2548];
	}
}
