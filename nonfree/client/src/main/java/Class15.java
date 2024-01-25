import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class15 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	private Class15() {
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "([I)V")
	public Class15(@OriginalArg(0) int[] arg0) {
		this.anIntArray26 = new int[256];
		this.anIntArray27 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray27[local13] = arg0[local13];
		}
		this.method248();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V")
	private void method244() {
		this.anInt390 += ++this.anInt393;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray26[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt398 ^= this.anInt398 << 13;
				} else {
					this.anInt398 ^= this.anInt398 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt398 ^= this.anInt398 << 2;
			} else {
				this.anInt398 ^= this.anInt398 >>> 16;
			}
			this.anInt398 += this.anIntArray26[local19 + 128 & 0xFF];
			@Pc(118) int local118;
			this.anIntArray26[local19] = local118 = this.anInt390 + this.anIntArray26[local26 >> 2 & 0xFF] + this.anInt398;
			this.anIntArray27[local19] = this.anInt390 = local26 + this.anIntArray26[local118 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)I")
	public int method246() {
		if (this.anInt399 == 0) {
			this.method244();
			this.anInt399 = 256;
		}
		return this.anIntArray27[--this.anInt399];
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)I")
	public int method247() {
		if (this.anInt399 == 0) {
			this.method244();
			this.anInt399 = 256;
		}
		return this.anIntArray27[this.anInt399 - 1];
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)V")
	private void method248() {
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
			local16 += local14;
			local12 += local18;
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
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray27[local23 + 3];
			local20 += this.anIntArray27[local23 + 1];
			local10 += this.anIntArray27[local23 + 6];
			local21 += this.anIntArray27[local23];
			local8 += this.anIntArray27[local23 + 7];
			local12 += this.anIntArray27[local23 + 5];
			local14 += this.anIntArray27[local23 + 4];
			local18 += this.anIntArray27[local23 + 2];
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray26[local23] = local21;
			this.anIntArray26[local23 + 1] = local20;
			this.anIntArray26[local23 + 2] = local18;
			this.anIntArray26[local23 + 3] = local16;
			this.anIntArray26[local23 + 4] = local14;
			this.anIntArray26[local23 + 5] = local12;
			this.anIntArray26[local23 + 6] = local10;
			this.anIntArray26[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray26[local23 + 7];
			local16 += this.anIntArray26[local23 + 3];
			local20 += this.anIntArray26[local23 + 1];
			local12 += this.anIntArray26[local23 + 5];
			local14 += this.anIntArray26[local23 + 4];
			local10 += this.anIntArray26[local23 + 6];
			local21 += this.anIntArray26[local23];
			local18 += this.anIntArray26[local23 + 2];
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray26[local23] = local21;
			this.anIntArray26[local23 + 1] = local20;
			this.anIntArray26[local23 + 2] = local18;
			this.anIntArray26[local23 + 3] = local16;
			this.anIntArray26[local23 + 4] = local14;
			this.anIntArray26[local23 + 5] = local12;
			this.anIntArray26[local23 + 6] = local10;
			this.anIntArray26[local23 + 7] = local8;
		}
		this.method244();
		this.anInt399 = 256;
	}
}
