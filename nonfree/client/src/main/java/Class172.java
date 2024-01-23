import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class172 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	private int anInt5714;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
	private int anInt5715;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
	private int[] anIntArray499 = new int[256];

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	private int anInt5716;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
	private int anInt5719;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "[I")
	private int[] anIntArray500 = new int[256];

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "([I)V")
	public Class172(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray500[local13] = arg0[local13];
		}
		this.method4585();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I")
	public int method4583() {
		if (this.anInt5715-- == 0) {
			this.method4586();
			this.anInt5715 = 255;
		}
		return this.anIntArray500[this.anInt5715];
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	private void method4585() {
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
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
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
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray500[local23 + 3];
			local14 += this.anIntArray500[local23 + 4];
			local20 += this.anIntArray500[local23 + 1];
			local21 += this.anIntArray500[local23];
			local18 += this.anIntArray500[local23 + 2];
			local21 ^= local20 << 11;
			local8 += this.anIntArray500[local23 + 7];
			local16 += local21;
			local20 += local18;
			local10 += this.anIntArray500[local23 + 6];
			local12 += this.anIntArray500[local23 + 5];
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
			this.anIntArray499[local23] = local21;
			this.anIntArray499[local23 + 1] = local20;
			this.anIntArray499[local23 + 2] = local18;
			this.anIntArray499[local23 + 3] = local16;
			this.anIntArray499[local23 + 4] = local14;
			this.anIntArray499[local23 + 5] = local12;
			this.anIntArray499[local23 + 6] = local10;
			this.anIntArray499[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray499[local23];
			local18 += this.anIntArray499[local23 + 2];
			local8 += this.anIntArray499[local23 + 7];
			local16 += this.anIntArray499[local23 + 3];
			local12 += this.anIntArray499[local23 + 5];
			local14 += this.anIntArray499[local23 + 4];
			local10 += this.anIntArray499[local23 + 6];
			local20 += this.anIntArray499[local23 + 1];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local14 += local20;
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
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray499[local23] = local21;
			this.anIntArray499[local23 + 1] = local20;
			this.anIntArray499[local23 + 2] = local18;
			this.anIntArray499[local23 + 3] = local16;
			this.anIntArray499[local23 + 4] = local14;
			this.anIntArray499[local23 + 5] = local12;
			this.anIntArray499[local23 + 6] = local10;
			this.anIntArray499[local23 + 7] = local8;
		}
		this.method4586();
		this.anInt5715 = 256;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	private void method4586() {
		this.anInt5719 += ++this.anInt5714;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(34) int local34 = this.anIntArray499[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt5716 ^= this.anInt5716 << 13;
				} else {
					this.anInt5716 ^= this.anInt5716 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt5716 ^= this.anInt5716 << 2;
			} else {
				this.anInt5716 ^= this.anInt5716 >>> 16;
			}
			this.anInt5716 += this.anIntArray499[local19 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray499[local19] = local124 = this.anIntArray499[local34 >> 2 & 0xFF] + this.anInt5716 + this.anInt5719;
			this.anIntArray500[local19] = this.anInt5719 = this.anIntArray499[local124 >> 8 >> 2 & 0xFF] + local34;
		}
	}
}
