import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class169 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	private int anInt5281;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
	private int anInt5282;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
	private int anInt5283;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	private int anInt5284;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "[I")
	private int[] anIntArray401;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "[I")
	private int[] anIntArray402;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	private Class169() {
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "([I)V")
	public Class169(@OriginalArg(0) int[] arg0) {
		this.anIntArray401 = new int[256];
		this.anIntArray402 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray401[local13] = arg0[local13];
		}
		this.method4522();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	private void method4519() {
		this.anInt5281 += ++this.anInt5284;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray402[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt5283 ^= this.anInt5283 << 13;
				} else {
					this.anInt5283 ^= this.anInt5283 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt5283 ^= this.anInt5283 << 2;
			} else {
				this.anInt5283 ^= this.anInt5283 >>> 16;
			}
			this.anInt5283 += this.anIntArray402[local23 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray402[local23] = local116 = this.anInt5283 + this.anIntArray402[local30 >> 2 & 0xFF] + this.anInt5281;
			this.anIntArray401[local23] = this.anInt5281 = local30 + this.anIntArray402[local116 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I")
	public int method4520() {
		if (this.anInt5282-- == 0) {
			this.method4519();
			this.anInt5282 = 255;
		}
		return this.anIntArray401[this.anInt5282];
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	private void method4522() {
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
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray401[local23 + 6];
			local14 += this.anIntArray401[local23 + 4];
			local21 += this.anIntArray401[local23];
			local8 += this.anIntArray401[local23 + 7];
			local16 += this.anIntArray401[local23 + 3];
			local18 += this.anIntArray401[local23 + 2];
			local12 += this.anIntArray401[local23 + 5];
			local20 += this.anIntArray401[local23 + 1];
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
			local18 += local8;
			this.anIntArray402[local23] = local21;
			this.anIntArray402[local23 + 1] = local20;
			this.anIntArray402[local23 + 2] = local18;
			this.anIntArray402[local23 + 3] = local16;
			this.anIntArray402[local23 + 4] = local14;
			this.anIntArray402[local23 + 5] = local12;
			this.anIntArray402[local23 + 6] = local10;
			this.anIntArray402[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray402[local23 + 5];
			local8 += this.anIntArray402[local23 + 7];
			local21 += this.anIntArray402[local23];
			local14 += this.anIntArray402[local23 + 4];
			local10 += this.anIntArray402[local23 + 6];
			local16 += this.anIntArray402[local23 + 3];
			local20 += this.anIntArray402[local23 + 1];
			local18 += this.anIntArray402[local23 + 2];
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
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray402[local23] = local21;
			this.anIntArray402[local23 + 1] = local20;
			this.anIntArray402[local23 + 2] = local18;
			this.anIntArray402[local23 + 3] = local16;
			this.anIntArray402[local23 + 4] = local14;
			this.anIntArray402[local23 + 5] = local12;
			this.anIntArray402[local23 + 6] = local10;
			this.anIntArray402[local23 + 7] = local8;
		}
		this.method4519();
		this.anInt5282 = 256;
	}
}
