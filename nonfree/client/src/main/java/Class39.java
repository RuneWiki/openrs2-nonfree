import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class39 {

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "([I)V")
	public Class39(@OriginalArg(0) int[] arg0) {
		this.anIntArray95 = new int[256];
		this.anIntArray97 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray95[local13] = arg0[local13];
		}
		this.method808();
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)V")
	private void method807() {
		this.anInt964 += ++this.anInt972;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray97[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt965 ^= this.anInt965 << 13;
				} else {
					this.anInt965 ^= this.anInt965 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt965 ^= this.anInt965 << 2;
			} else {
				this.anInt965 ^= this.anInt965 >>> 16;
			}
			this.anInt965 += this.anIntArray97[local25 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray97[local25] = local121 = this.anInt964 + this.anInt965 + this.anIntArray97[local32 >> 2 & 0xFF];
			this.anIntArray95[local25] = this.anInt964 = this.anIntArray97[local121 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
	private void method808() {
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
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local14 += this.anIntArray95[local23 + 4];
			local20 += this.anIntArray95[local23 + 1];
			local21 += this.anIntArray95[local23];
			local16 += this.anIntArray95[local23 + 3];
			local8 += this.anIntArray95[local23 + 7];
			local18 += this.anIntArray95[local23 + 2];
			local10 += this.anIntArray95[local23 + 6];
			local12 += this.anIntArray95[local23 + 5];
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
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray97[local23] = local21;
			this.anIntArray97[local23 + 1] = local20;
			this.anIntArray97[local23 + 2] = local18;
			this.anIntArray97[local23 + 3] = local16;
			this.anIntArray97[local23 + 4] = local14;
			this.anIntArray97[local23 + 5] = local12;
			this.anIntArray97[local23 + 6] = local10;
			this.anIntArray97[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray97[local23 + 3];
			local10 += this.anIntArray97[local23 + 6];
			local12 += this.anIntArray97[local23 + 5];
			local21 += this.anIntArray97[local23];
			local18 += this.anIntArray97[local23 + 2];
			local8 += this.anIntArray97[local23 + 7];
			local14 += this.anIntArray97[local23 + 4];
			local20 += this.anIntArray97[local23 + 1];
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray97[local23] = local21;
			this.anIntArray97[local23 + 1] = local20;
			this.anIntArray97[local23 + 2] = local18;
			this.anIntArray97[local23 + 3] = local16;
			this.anIntArray97[local23 + 4] = local14;
			this.anIntArray97[local23 + 5] = local12;
			this.anIntArray97[local23 + 6] = local10;
			this.anIntArray97[local23 + 7] = local8;
		}
		this.method807();
		this.anInt967 = 256;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)I")
	public int method809() {
		if (this.anInt967 == 0) {
			this.method807();
			this.anInt967 = 256;
		}
		return this.anIntArray95[--this.anInt967];
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)I")
	public int method810() {
		if (this.anInt967 == 0) {
			this.method807();
			this.anInt967 = 256;
		}
		return this.anIntArray95[this.anInt967 - 1];
	}
}
