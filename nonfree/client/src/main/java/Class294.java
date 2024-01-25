import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class294 {

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "[I")
	private int[] anIntArray557;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "[I")
	private int[] anIntArray558;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
	private int anInt8784;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
	private int anInt8786;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
	private int anInt8788;

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
	private int anInt8790;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	private Class294() {
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "([I)V")
	public Class294(@OriginalArg(0) int[] arg0) {
		this.anIntArray557 = new int[256];
		this.anIntArray558 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray557[local13] = arg0[local13];
		}
		this.method7255();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)I")
	public int method7249() {
		if (this.anInt8790 == 0) {
			this.method7250();
			this.anInt8790 = 256;
		}
		return this.anIntArray557[this.anInt8790 - 1];
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V")
	private void method7250() {
		this.anInt8786 += ++this.anInt8784;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray558[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt8788 ^= this.anInt8788 << 13;
				} else {
					this.anInt8788 ^= this.anInt8788 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt8788 ^= this.anInt8788 << 2;
			} else {
				this.anInt8788 ^= this.anInt8788 >>> 16;
			}
			this.anInt8788 += this.anIntArray558[local25 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray558[local25] = local124 = this.anInt8786 + this.anInt8788 + this.anIntArray558[local32 >> 2 & 0xFF];
			this.anIntArray557[local25] = this.anInt8786 = local32 + this.anIntArray558[local124 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I")
	public int method7252() {
		if (this.anInt8790 == 0) {
			this.method7250();
			this.anInt8790 = 256;
		}
		return this.anIntArray557[--this.anInt8790];
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)V")
	private void method7255() {
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
			local8 += this.anIntArray557[local23 + 7];
			local16 += this.anIntArray557[local23 + 3];
			local20 += this.anIntArray557[local23 + 1];
			local21 += this.anIntArray557[local23];
			local10 += this.anIntArray557[local23 + 6];
			local14 += this.anIntArray557[local23 + 4];
			local18 += this.anIntArray557[local23 + 2];
			local12 += this.anIntArray557[local23 + 5];
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
			local21 += local20;
			local18 += local8;
			this.anIntArray558[local23] = local21;
			this.anIntArray558[local23 + 1] = local20;
			this.anIntArray558[local23 + 2] = local18;
			this.anIntArray558[local23 + 3] = local16;
			this.anIntArray558[local23 + 4] = local14;
			this.anIntArray558[local23 + 5] = local12;
			this.anIntArray558[local23 + 6] = local10;
			this.anIntArray558[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray558[local23];
			local10 += this.anIntArray558[local23 + 6];
			local16 += this.anIntArray558[local23 + 3];
			local12 += this.anIntArray558[local23 + 5];
			local8 += this.anIntArray558[local23 + 7];
			local14 += this.anIntArray558[local23 + 4];
			local20 += this.anIntArray558[local23 + 1];
			local18 += this.anIntArray558[local23 + 2];
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
			local14 += local12;
			local10 += local16;
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
			local18 += local8;
			local21 += local20;
			this.anIntArray558[local23] = local21;
			this.anIntArray558[local23 + 1] = local20;
			this.anIntArray558[local23 + 2] = local18;
			this.anIntArray558[local23 + 3] = local16;
			this.anIntArray558[local23 + 4] = local14;
			this.anIntArray558[local23 + 5] = local12;
			this.anIntArray558[local23 + 6] = local10;
			this.anIntArray558[local23 + 7] = local8;
		}
		this.method7250();
		this.anInt8790 = 256;
	}
}
