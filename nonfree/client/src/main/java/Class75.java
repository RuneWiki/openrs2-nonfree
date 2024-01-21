import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class75 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	private int anInt3206;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	private int anInt3208;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	private int anInt3211;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	private int anInt3215;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "[I")
	private final int[] anIntArray342 = new int[256];

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "[I")
	private final int[] anIntArray341 = new int[256];

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "([I)V")
	public Class75(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray341[local13] = arg0[local13];
		}
		this.method2281();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	private void method2280() {
		this.anInt3215 += ++this.anInt3211;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray342[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt3206 ^= this.anInt3206 << 13;
				} else {
					this.anInt3206 ^= this.anInt3206 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt3206 ^= this.anInt3206 << 2;
			} else {
				this.anInt3206 ^= this.anInt3206 >>> 16;
			}
			this.anInt3206 += this.anIntArray342[local25 + 128 & 0xFF];
			@Pc(118) int local118;
			this.anIntArray342[local25] = local118 = this.anInt3215 + this.anInt3206 + this.anIntArray342[local32 >> 2 & 0xFF];
			this.anIntArray341[local25] = this.anInt3215 = this.anIntArray342[local118 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	private void method2281() {
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
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 10;
			local10 += local16;
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
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray341[local23 + 5];
			local8 += this.anIntArray341[local23 + 7];
			local21 += this.anIntArray341[local23];
			local18 += this.anIntArray341[local23 + 2];
			local10 += this.anIntArray341[local23 + 6];
			local16 += this.anIntArray341[local23 + 3];
			local14 += this.anIntArray341[local23 + 4];
			local20 += this.anIntArray341[local23 + 1];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
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
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
			this.anIntArray342[local23] = local21;
			this.anIntArray342[local23 + 1] = local20;
			this.anIntArray342[local23 + 2] = local18;
			this.anIntArray342[local23 + 3] = local16;
			this.anIntArray342[local23 + 4] = local14;
			this.anIntArray342[local23 + 5] = local12;
			this.anIntArray342[local23 + 6] = local10;
			this.anIntArray342[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray342[local23 + 2];
			local10 += this.anIntArray342[local23 + 6];
			local20 += this.anIntArray342[local23 + 1];
			local21 += this.anIntArray342[local23];
			local14 += this.anIntArray342[local23 + 4];
			local16 += this.anIntArray342[local23 + 3];
			local12 += this.anIntArray342[local23 + 5];
			local8 += this.anIntArray342[local23 + 7];
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
			local12 ^= local10 >>> 4;
			local21 += local12;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			this.anIntArray342[local23] = local21;
			local18 += local8;
			this.anIntArray342[local23 + 1] = local20;
			this.anIntArray342[local23 + 2] = local18;
			this.anIntArray342[local23 + 3] = local16;
			this.anIntArray342[local23 + 4] = local14;
			this.anIntArray342[local23 + 5] = local12;
			this.anIntArray342[local23 + 6] = local10;
			this.anIntArray342[local23 + 7] = local8;
		}
		this.method2280();
		this.anInt3208 = 256;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)I")
	public int method2284() {
		if (this.anInt3208-- == 0) {
			this.method2280();
			this.anInt3208 = 255;
		}
		return this.anIntArray341[this.anInt3208];
	}
}
