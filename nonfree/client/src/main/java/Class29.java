import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class29 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "[I")
	private int[] anIntArray90 = new int[256];

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "[I")
	private int[] anIntArray91 = new int[256];

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([I)V")
	public Class29(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray91[local13] = arg0[local13];
		}
		this.method668();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)I")
	public int method667() {
		if (this.anInt813-- == 0) {
			this.method670();
			this.anInt813 = 255;
		}
		return this.anIntArray91[this.anInt813];
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
	private void method668() {
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
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray91[local23 + 3];
			local18 += this.anIntArray91[local23 + 2];
			local12 += this.anIntArray91[local23 + 5];
			local20 += this.anIntArray91[local23 + 1];
			local14 += this.anIntArray91[local23 + 4];
			local8 += this.anIntArray91[local23 + 7];
			local21 += this.anIntArray91[local23];
			local21 ^= local20 << 11;
			local10 += this.anIntArray91[local23 + 6];
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
			local21 += local12;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray90[local23] = local21;
			this.anIntArray90[local23 + 1] = local20;
			this.anIntArray90[local23 + 2] = local18;
			this.anIntArray90[local23 + 3] = local16;
			this.anIntArray90[local23 + 4] = local14;
			this.anIntArray90[local23 + 5] = local12;
			this.anIntArray90[local23 + 6] = local10;
			this.anIntArray90[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray90[local23 + 2];
			local8 += this.anIntArray90[local23 + 7];
			local16 += this.anIntArray90[local23 + 3];
			local14 += this.anIntArray90[local23 + 4];
			local21 += this.anIntArray90[local23];
			local10 += this.anIntArray90[local23 + 6];
			local20 += this.anIntArray90[local23 + 1];
			local12 += this.anIntArray90[local23 + 5];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local10 += local16;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray90[local23] = local21;
			this.anIntArray90[local23 + 1] = local20;
			this.anIntArray90[local23 + 2] = local18;
			this.anIntArray90[local23 + 3] = local16;
			this.anIntArray90[local23 + 4] = local14;
			this.anIntArray90[local23 + 5] = local12;
			this.anIntArray90[local23 + 6] = local10;
			this.anIntArray90[local23 + 7] = local8;
		}
		this.method670();
		this.anInt813 = 256;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	private void method670() {
		this.anInt815 += ++this.anInt821;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(32) int local32 = this.anIntArray90[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt810 ^= this.anInt810 << 13;
				} else {
					this.anInt810 ^= this.anInt810 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt810 ^= this.anInt810 << 2;
			} else {
				this.anInt810 ^= this.anInt810 >>> 16;
			}
			this.anInt810 += this.anIntArray90[local24 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray90[local24] = local122 = this.anInt810 + this.anIntArray90[local32 >> 2 & 0xFF] + this.anInt815;
			this.anIntArray91[local24] = this.anInt815 = local32 + this.anIntArray90[local122 >> 8 >> 2 & 0xFF];
		}
	}
}
