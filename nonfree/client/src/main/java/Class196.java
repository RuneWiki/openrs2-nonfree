import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class196 {

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	private int anInt4918;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	private int anInt4919;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
	private int anInt4921;

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
	private int anInt4922;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	private Class196() {
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "([I)V")
	public Class196(@OriginalArg(0) int[] arg0) {
		this.anIntArray374 = new int[256];
		this.anIntArray375 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray374[local13] = arg0[local13];
		}
		this.method4378();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
	public int method4375() {
		if (this.anInt4919 == 0) {
			this.method4380();
			this.anInt4919 = 256;
		}
		return this.anIntArray374[--this.anInt4919];
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I")
	public int method4376() {
		if (this.anInt4919 == 0) {
			this.method4380();
			this.anInt4919 = 256;
		}
		return this.anIntArray374[this.anInt4919 - 1];
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
	private void method4378() {
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
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray374[local23 + 2];
			local14 += this.anIntArray374[local23 + 4];
			local12 += this.anIntArray374[local23 + 5];
			local21 += this.anIntArray374[local23];
			local20 += this.anIntArray374[local23 + 1];
			local8 += this.anIntArray374[local23 + 7];
			local16 += this.anIntArray374[local23 + 3];
			local10 += this.anIntArray374[local23 + 6];
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
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray375[local23] = local21;
			this.anIntArray375[local23 + 1] = local20;
			this.anIntArray375[local23 + 2] = local18;
			this.anIntArray375[local23 + 3] = local16;
			this.anIntArray375[local23 + 4] = local14;
			this.anIntArray375[local23 + 5] = local12;
			this.anIntArray375[local23 + 6] = local10;
			this.anIntArray375[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray375[local23 + 2];
			local12 += this.anIntArray375[local23 + 5];
			local8 += this.anIntArray375[local23 + 7];
			local14 += this.anIntArray375[local23 + 4];
			local10 += this.anIntArray375[local23 + 6];
			local16 += this.anIntArray375[local23 + 3];
			local20 += this.anIntArray375[local23 + 1];
			local21 += this.anIntArray375[local23];
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
			this.anIntArray375[local23] = local21;
			this.anIntArray375[local23 + 1] = local20;
			this.anIntArray375[local23 + 2] = local18;
			this.anIntArray375[local23 + 3] = local16;
			this.anIntArray375[local23 + 4] = local14;
			this.anIntArray375[local23 + 5] = local12;
			this.anIntArray375[local23 + 6] = local10;
			this.anIntArray375[local23 + 7] = local8;
		}
		this.method4380();
		this.anInt4919 = 256;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
	private void method4380() {
		this.anInt4921 += ++this.anInt4918;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray375[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt4922 ^= this.anInt4922 << 13;
				} else {
					this.anInt4922 ^= this.anInt4922 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt4922 ^= this.anInt4922 << 2;
			} else {
				this.anInt4922 ^= this.anInt4922 >>> 16;
			}
			this.anInt4922 += this.anIntArray375[local23 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray375[local23] = local116 = this.anInt4921 + this.anInt4922 + this.anIntArray375[local30 >> 2 & 0xFF];
			this.anIntArray374[local23] = this.anInt4921 = this.anIntArray375[local116 >> 8 >> 2 & 0xFF] + local30;
		}
	}
}
