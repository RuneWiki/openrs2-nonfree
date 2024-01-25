import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class107 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
	private int anInt3126;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	private int anInt3130;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "[I")
	private int[] anIntArray408;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	private int anInt3132;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
	private int anInt3135;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "[I")
	private int[] anIntArray409;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	private Class107() {
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([I)V")
	public Class107(@OriginalArg(0) int[] arg0) {
		this.anIntArray409 = new int[256];
		this.anIntArray408 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray409[local13] = arg0[local13];
		}
		this.method2889();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I")
	public int method2888() {
		if (this.anInt3126-- == 0) {
			this.method2892();
			this.anInt3126 = 255;
		}
		return this.anIntArray409[this.anInt3126];
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	private void method2889() {
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
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray409[local23 + 1];
			local14 += this.anIntArray409[local23 + 4];
			local10 += this.anIntArray409[local23 + 6];
			local12 += this.anIntArray409[local23 + 5];
			local16 += this.anIntArray409[local23 + 3];
			local21 += this.anIntArray409[local23];
			local18 += this.anIntArray409[local23 + 2];
			local8 += this.anIntArray409[local23 + 7];
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray408[local23] = local21;
			this.anIntArray408[local23 + 1] = local20;
			this.anIntArray408[local23 + 2] = local18;
			this.anIntArray408[local23 + 3] = local16;
			this.anIntArray408[local23 + 4] = local14;
			this.anIntArray408[local23 + 5] = local12;
			this.anIntArray408[local23 + 6] = local10;
			this.anIntArray408[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray408[local23 + 5];
			local18 += this.anIntArray408[local23 + 2];
			local21 += this.anIntArray408[local23];
			local16 += this.anIntArray408[local23 + 3];
			local20 += this.anIntArray408[local23 + 1];
			local10 += this.anIntArray408[local23 + 6];
			local8 += this.anIntArray408[local23 + 7];
			local14 += this.anIntArray408[local23 + 4];
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
			local10 += local16;
			local14 += local12;
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
			local18 += local8;
			local21 += local20;
			this.anIntArray408[local23] = local21;
			this.anIntArray408[local23 + 1] = local20;
			this.anIntArray408[local23 + 2] = local18;
			this.anIntArray408[local23 + 3] = local16;
			this.anIntArray408[local23 + 4] = local14;
			this.anIntArray408[local23 + 5] = local12;
			this.anIntArray408[local23 + 6] = local10;
			this.anIntArray408[local23 + 7] = local8;
		}
		this.method2892();
		this.anInt3126 = 256;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	private void method2892() {
		this.anInt3130 += ++this.anInt3132;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(23) int local23 = this.anIntArray408[local17];
			if ((local17 & 0x2) == 0) {
				if ((local17 & 0x1) == 0) {
					this.anInt3135 ^= this.anInt3135 << 13;
				} else {
					this.anInt3135 ^= this.anInt3135 >>> 6;
				}
			} else if ((local17 & 0x1) == 0) {
				this.anInt3135 ^= this.anInt3135 << 2;
			} else {
				this.anInt3135 ^= this.anInt3135 >>> 16;
			}
			this.anInt3135 += this.anIntArray408[local17 + 128 & 0xFF];
			@Pc(113) int local113;
			this.anIntArray408[local17] = local113 = this.anInt3130 + this.anIntArray408[local23 >> 2 & 0xFF] + this.anInt3135;
			this.anIntArray409[local17] = this.anInt3130 = local23 + this.anIntArray408[local113 >> 8 >> 2 & 0xFF];
		}
	}
}
