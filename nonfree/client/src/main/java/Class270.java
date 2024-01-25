import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oja")
public final class Class270 {

	@OriginalMember(owner = "client!oja", name = "e", descriptor = "I")
	private int anInt7379;

	@OriginalMember(owner = "client!oja", name = "l", descriptor = "I")
	private int anInt7381;

	@OriginalMember(owner = "client!oja", name = "o", descriptor = "[I")
	private int[] anIntArray473;

	@OriginalMember(owner = "client!oja", name = "n", descriptor = "I")
	private int anInt7383;

	@OriginalMember(owner = "client!oja", name = "d", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!oja", name = "f", descriptor = "I")
	private int anInt7388;

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "()V")
	private Class270() {
	}

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "([I)V")
	public Class270(@OriginalArg(0) int[] arg0) {
		this.anIntArray473 = new int[256];
		this.anIntArray474 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray474[local13] = arg0[local13];
		}
		this.method6573();
	}

	@OriginalMember(owner = "client!oja", name = "c", descriptor = "(I)I")
	public int method6569() {
		if (this.anInt7381 == 0) {
			this.method6570();
			this.anInt7381 = 256;
		}
		return this.anIntArray474[--this.anInt7381];
	}

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(I)V")
	private void method6570() {
		this.anInt7383 += ++this.anInt7379;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray473[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt7388 ^= this.anInt7388 << 13;
				} else {
					this.anInt7388 ^= this.anInt7388 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt7388 ^= this.anInt7388 << 2;
			} else {
				this.anInt7388 ^= this.anInt7388 >>> 16;
			}
			this.anInt7388 += this.anIntArray473[local27 + 128 & 0xFF];
			@Pc(135) int local135;
			this.anIntArray473[local27] = local135 = this.anInt7388 + this.anIntArray473[local34 >> 2 & 0xFF] + this.anInt7383;
			this.anIntArray474[local27] = this.anInt7383 = this.anIntArray473[local135 >> 8 >> 2 & 0xFF] + local34;
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(Z)I")
	public int method6572() {
		if (this.anInt7381 == 0) {
			this.method6570();
			this.anInt7381 = 256;
		}
		return this.anIntArray474[this.anInt7381 - 1];
	}

	@OriginalMember(owner = "client!oja", name = "d", descriptor = "(I)V")
	private void method6573() {
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
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
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
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray474[local23 + 3];
			local8 += this.anIntArray474[local23 + 7];
			local21 += this.anIntArray474[local23];
			local20 += this.anIntArray474[local23 + 1];
			local18 += this.anIntArray474[local23 + 2];
			local14 += this.anIntArray474[local23 + 4];
			local10 += this.anIntArray474[local23 + 6];
			local12 += this.anIntArray474[local23 + 5];
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray473[local23] = local21;
			this.anIntArray473[local23 + 1] = local20;
			this.anIntArray473[local23 + 2] = local18;
			this.anIntArray473[local23 + 3] = local16;
			this.anIntArray473[local23 + 4] = local14;
			this.anIntArray473[local23 + 5] = local12;
			this.anIntArray473[local23 + 6] = local10;
			this.anIntArray473[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray473[local23 + 5];
			local18 += this.anIntArray473[local23 + 2];
			local10 += this.anIntArray473[local23 + 6];
			local8 += this.anIntArray473[local23 + 7];
			local14 += this.anIntArray473[local23 + 4];
			local20 += this.anIntArray473[local23 + 1];
			local21 += this.anIntArray473[local23];
			local16 += this.anIntArray473[local23 + 3];
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
			this.anIntArray473[local23] = local21;
			this.anIntArray473[local23 + 1] = local20;
			this.anIntArray473[local23 + 2] = local18;
			this.anIntArray473[local23 + 3] = local16;
			this.anIntArray473[local23 + 4] = local14;
			this.anIntArray473[local23 + 5] = local12;
			this.anIntArray473[local23 + 6] = local10;
			this.anIntArray473[local23 + 7] = local8;
		}
		this.method6570();
		this.anInt7381 = 256;
	}
}
