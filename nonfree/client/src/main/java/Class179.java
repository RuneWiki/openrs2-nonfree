import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class179 {

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "[I")
	private int[] anIntArray449;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	private int anInt5656;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
	private int anInt5657;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "[I")
	private int[] anIntArray450;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
	private int anInt5659;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	private int anInt5660;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	private Class179() {
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([I)V")
	public Class179(@OriginalArg(0) int[] arg0) {
		this.anIntArray450 = new int[256];
		this.anIntArray449 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray449[local13] = arg0[local13];
		}
		this.method4889();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	private void method4887() {
		this.anInt5659 += ++this.anInt5660;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray450[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt5656 ^= this.anInt5656 << 13;
				} else {
					this.anInt5656 ^= this.anInt5656 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt5656 ^= this.anInt5656 << 2;
			} else {
				this.anInt5656 ^= this.anInt5656 >>> 16;
			}
			this.anInt5656 += this.anIntArray450[local25 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray450[local25] = local121 = this.anInt5659 + this.anInt5656 + this.anIntArray450[local32 >> 2 & 0xFF];
			this.anIntArray449[local25] = this.anInt5659 = local32 + this.anIntArray450[local121 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	private void method4889() {
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
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray449[local23];
			local16 += this.anIntArray449[local23 + 3];
			local10 += this.anIntArray449[local23 + 6];
			local20 += this.anIntArray449[local23 + 1];
			local18 += this.anIntArray449[local23 + 2];
			local14 += this.anIntArray449[local23 + 4];
			local12 += this.anIntArray449[local23 + 5];
			local8 += this.anIntArray449[local23 + 7];
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
			local18 += local8;
			local21 += local20;
			this.anIntArray450[local23] = local21;
			this.anIntArray450[local23 + 1] = local20;
			this.anIntArray450[local23 + 2] = local18;
			this.anIntArray450[local23 + 3] = local16;
			this.anIntArray450[local23 + 4] = local14;
			this.anIntArray450[local23 + 5] = local12;
			this.anIntArray450[local23 + 6] = local10;
			this.anIntArray450[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray450[local23 + 2];
			local21 += this.anIntArray450[local23];
			local16 += this.anIntArray450[local23 + 3];
			local20 += this.anIntArray450[local23 + 1];
			local8 += this.anIntArray450[local23 + 7];
			local10 += this.anIntArray450[local23 + 6];
			local14 += this.anIntArray450[local23 + 4];
			local12 += this.anIntArray450[local23 + 5];
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray450[local23] = local21;
			this.anIntArray450[local23 + 1] = local20;
			this.anIntArray450[local23 + 2] = local18;
			this.anIntArray450[local23 + 3] = local16;
			this.anIntArray450[local23 + 4] = local14;
			this.anIntArray450[local23 + 5] = local12;
			this.anIntArray450[local23 + 6] = local10;
			this.anIntArray450[local23 + 7] = local8;
		}
		this.method4887();
		this.anInt5657 = 256;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)I")
	public int method4890() {
		if (this.anInt5657-- == 0) {
			this.method4887();
			this.anInt5657 = 255;
		}
		return this.anIntArray449[this.anInt5657];
	}
}
