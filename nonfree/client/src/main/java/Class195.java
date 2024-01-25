import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class195 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	private int anInt5684;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	private int anInt5688;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
	private int anInt5690;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "[I")
	private int[] anIntArray459;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
	private int anInt5691;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "[I")
	private int[] anIntArray460;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	private Class195() {
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "([I)V")
	public Class195(@OriginalArg(0) int[] arg0) {
		this.anIntArray459 = new int[256];
		this.anIntArray460 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray459[local13] = arg0[local13];
		}
		this.method4718();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
	public int method4717() {
		if (this.anInt5684 == 0) {
			this.method4719();
			this.anInt5684 = 256;
		}
		return this.anIntArray459[this.anInt5684 - 1];
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
	private void method4718() {
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
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray459[local23 + 2];
			local20 += this.anIntArray459[local23 + 1];
			local14 += this.anIntArray459[local23 + 4];
			local21 += this.anIntArray459[local23];
			local12 += this.anIntArray459[local23 + 5];
			local10 += this.anIntArray459[local23 + 6];
			local8 += this.anIntArray459[local23 + 7];
			local16 += this.anIntArray459[local23 + 3];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray460[local23] = local21;
			this.anIntArray460[local23 + 1] = local20;
			this.anIntArray460[local23 + 2] = local18;
			this.anIntArray460[local23 + 3] = local16;
			this.anIntArray460[local23 + 4] = local14;
			this.anIntArray460[local23 + 5] = local12;
			this.anIntArray460[local23 + 6] = local10;
			this.anIntArray460[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray460[local23];
			local8 += this.anIntArray460[local23 + 7];
			local16 += this.anIntArray460[local23 + 3];
			local20 += this.anIntArray460[local23 + 1];
			local10 += this.anIntArray460[local23 + 6];
			local18 += this.anIntArray460[local23 + 2];
			local14 += this.anIntArray460[local23 + 4];
			local12 += this.anIntArray460[local23 + 5];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
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
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray460[local23] = local21;
			this.anIntArray460[local23 + 1] = local20;
			this.anIntArray460[local23 + 2] = local18;
			this.anIntArray460[local23 + 3] = local16;
			this.anIntArray460[local23 + 4] = local14;
			this.anIntArray460[local23 + 5] = local12;
			this.anIntArray460[local23 + 6] = local10;
			this.anIntArray460[local23 + 7] = local8;
		}
		this.method4719();
		this.anInt5684 = 256;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
	private void method4719() {
		this.anInt5691 += ++this.anInt5690;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray460[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt5688 ^= this.anInt5688 << 13;
				} else {
					this.anInt5688 ^= this.anInt5688 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt5688 ^= this.anInt5688 << 2;
			} else {
				this.anInt5688 ^= this.anInt5688 >>> 16;
			}
			this.anInt5688 += this.anIntArray460[local27 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray460[local27] = local124 = this.anIntArray460[local34 >> 2 & 0xFF] + this.anInt5688 + this.anInt5691;
			this.anIntArray459[local27] = this.anInt5691 = local34 + this.anIntArray460[local124 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)I")
	public int method4720() {
		if (this.anInt5684 == 0) {
			this.method4719();
			this.anInt5684 = 256;
		}
		return this.anIntArray459[--this.anInt5684];
	}
}
