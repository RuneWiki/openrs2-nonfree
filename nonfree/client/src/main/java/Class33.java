import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class33 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private int anInt1581;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt1584;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	private int anInt1587;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
	private int anInt1590;

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
	private final int[] anIntArray241 = new int[256];

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[I")
	private final int[] anIntArray238 = new int[256];

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([I)V")
	public Class33(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray241[local13] = arg0[local13];
		}
		this.method1092();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	public int method1087() {
		if (this.anInt1590-- == 0) {
			this.method1088();
			this.anInt1590 = 255;
		}
		return this.anIntArray241[this.anInt1590];
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	private void method1088() {
		this.anInt1581 += ++this.anInt1587;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(28) int local28 = this.anIntArray238[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt1584 ^= this.anInt1584 << 13;
				} else {
					this.anInt1584 ^= this.anInt1584 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt1584 ^= this.anInt1584 << 2;
			} else {
				this.anInt1584 ^= this.anInt1584 >>> 16;
			}
			this.anInt1584 += this.anIntArray238[local19 + 128 & 0xFF];
			@Pc(117) int local117;
			this.anIntArray238[local19] = local117 = this.anInt1584 + this.anIntArray238[local28 >> 2 & 0xFF] + this.anInt1581;
			this.anIntArray241[local19] = this.anInt1581 = local28 + this.anIntArray238[local117 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	private void method1092() {
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
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray241[local23 + 3];
			local20 += this.anIntArray241[local23 + 1];
			local12 += this.anIntArray241[local23 + 5];
			local14 += this.anIntArray241[local23 + 4];
			local10 += this.anIntArray241[local23 + 6];
			local8 += this.anIntArray241[local23 + 7];
			local21 += this.anIntArray241[local23];
			local18 += this.anIntArray241[local23 + 2];
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
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray238[local23] = local21;
			this.anIntArray238[local23 + 1] = local20;
			this.anIntArray238[local23 + 2] = local18;
			this.anIntArray238[local23 + 3] = local16;
			this.anIntArray238[local23 + 4] = local14;
			this.anIntArray238[local23 + 5] = local12;
			this.anIntArray238[local23 + 6] = local10;
			this.anIntArray238[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray238[local23 + 7];
			local18 += this.anIntArray238[local23 + 2];
			local12 += this.anIntArray238[local23 + 5];
			local16 += this.anIntArray238[local23 + 3];
			local21 += this.anIntArray238[local23];
			local14 += this.anIntArray238[local23 + 4];
			local20 += this.anIntArray238[local23 + 1];
			local21 ^= local20 << 11;
			local10 += this.anIntArray238[local23 + 6];
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			this.anIntArray238[local23] = local21;
			this.anIntArray238[local23 + 1] = local20;
			local18 += local8;
			this.anIntArray238[local23 + 2] = local18;
			this.anIntArray238[local23 + 3] = local16;
			this.anIntArray238[local23 + 4] = local14;
			this.anIntArray238[local23 + 5] = local12;
			this.anIntArray238[local23 + 6] = local10;
			this.anIntArray238[local23 + 7] = local8;
		}
		this.method1088();
		this.anInt1590 = 256;
	}
}
