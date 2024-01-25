import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class356 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "[I")
	private int[] anIntArray582;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	private int anInt10395;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
	private int[] anIntArray583;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	private int anInt10400;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	private int anInt10401;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	private int anInt10402;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	private Class356() {
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "([I)V")
	public Class356(@OriginalArg(0) int[] arg0) {
		this.anIntArray583 = new int[256];
		this.anIntArray582 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray582[local13] = arg0[local13];
		}
		this.method8115();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	private void method8111() {
		this.anInt10395 += ++this.anInt10402;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray583[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt10400 ^= this.anInt10400 << 13;
				} else {
					this.anInt10400 ^= this.anInt10400 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt10400 ^= this.anInt10400 << 2;
			} else {
				this.anInt10400 ^= this.anInt10400 >>> 16;
			}
			this.anInt10400 += this.anIntArray583[local25 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray583[local25] = local121 = this.anInt10395 + this.anIntArray583[local32 >> 2 & 0xFF] + this.anInt10400;
			this.anIntArray582[local25] = this.anInt10395 = local32 + this.anIntArray583[local121 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)I")
	public int method8113() {
		if (this.anInt10401 == 0) {
			this.method8111();
			this.anInt10401 = 256;
		}
		return this.anIntArray582[this.anInt10401 - 1];
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I")
	public int method8114() {
		if (this.anInt10401 == 0) {
			this.method8111();
			this.anInt10401 = 256;
		}
		return this.anIntArray582[--this.anInt10401];
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	private void method8115() {
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
			local10 += this.anIntArray582[local23 + 6];
			local18 += this.anIntArray582[local23 + 2];
			local12 += this.anIntArray582[local23 + 5];
			local14 += this.anIntArray582[local23 + 4];
			local20 += this.anIntArray582[local23 + 1];
			local16 += this.anIntArray582[local23 + 3];
			local8 += this.anIntArray582[local23 + 7];
			local21 += this.anIntArray582[local23];
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
			this.anIntArray583[local23] = local21;
			this.anIntArray583[local23 + 1] = local20;
			this.anIntArray583[local23 + 2] = local18;
			this.anIntArray583[local23 + 3] = local16;
			this.anIntArray583[local23 + 4] = local14;
			this.anIntArray583[local23 + 5] = local12;
			this.anIntArray583[local23 + 6] = local10;
			this.anIntArray583[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local14 += this.anIntArray583[local23 + 4];
			local10 += this.anIntArray583[local23 + 6];
			local21 += this.anIntArray583[local23];
			local8 += this.anIntArray583[local23 + 7];
			local20 += this.anIntArray583[local23 + 1];
			local16 += this.anIntArray583[local23 + 3];
			local12 += this.anIntArray583[local23 + 5];
			local18 += this.anIntArray583[local23 + 2];
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
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray583[local23] = local21;
			this.anIntArray583[local23 + 1] = local20;
			this.anIntArray583[local23 + 2] = local18;
			this.anIntArray583[local23 + 3] = local16;
			this.anIntArray583[local23 + 4] = local14;
			this.anIntArray583[local23 + 5] = local12;
			this.anIntArray583[local23 + 6] = local10;
			this.anIntArray583[local23 + 7] = local8;
		}
		this.method8111();
		this.anInt10401 = 256;
	}
}
