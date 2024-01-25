import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class336 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
	private int[] anIntArray533;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt9693;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private int anInt9694;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	private int[] anIntArray536;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	private int anInt9699;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	private int anInt9701;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	private Class336() {
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([I)V")
	public Class336(@OriginalArg(0) int[] arg0) {
		this.anIntArray536 = new int[256];
		this.anIntArray533 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray536[local13] = arg0[local13];
		}
		this.method7833();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	private void method7833() {
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
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray536[local23 + 1];
			local10 += this.anIntArray536[local23 + 6];
			local16 += this.anIntArray536[local23 + 3];
			local18 += this.anIntArray536[local23 + 2];
			local12 += this.anIntArray536[local23 + 5];
			local8 += this.anIntArray536[local23 + 7];
			local21 += this.anIntArray536[local23];
			local14 += this.anIntArray536[local23 + 4];
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
			this.anIntArray533[local23] = local21;
			this.anIntArray533[local23 + 1] = local20;
			this.anIntArray533[local23 + 2] = local18;
			this.anIntArray533[local23 + 3] = local16;
			this.anIntArray533[local23 + 4] = local14;
			this.anIntArray533[local23 + 5] = local12;
			this.anIntArray533[local23 + 6] = local10;
			this.anIntArray533[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray533[local23 + 7];
			local20 += this.anIntArray533[local23 + 1];
			local21 += this.anIntArray533[local23];
			local12 += this.anIntArray533[local23 + 5];
			local10 += this.anIntArray533[local23 + 6];
			local18 += this.anIntArray533[local23 + 2];
			local16 += this.anIntArray533[local23 + 3];
			local14 += this.anIntArray533[local23 + 4];
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
			this.anIntArray533[local23] = local21;
			this.anIntArray533[local23 + 1] = local20;
			this.anIntArray533[local23 + 2] = local18;
			this.anIntArray533[local23 + 3] = local16;
			this.anIntArray533[local23 + 4] = local14;
			this.anIntArray533[local23 + 5] = local12;
			this.anIntArray533[local23 + 6] = local10;
			this.anIntArray533[local23 + 7] = local8;
		}
		this.method7837();
		this.anInt9699 = 256;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I")
	public int method7834() {
		if (this.anInt9699 == 0) {
			this.method7837();
			this.anInt9699 = 256;
		}
		return this.anIntArray536[this.anInt9699 - 1];
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
	private void method7837() {
		this.anInt9694 += ++this.anInt9701;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray533[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt9693 ^= this.anInt9693 << 13;
				} else {
					this.anInt9693 ^= this.anInt9693 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt9693 ^= this.anInt9693 << 2;
			} else {
				this.anInt9693 ^= this.anInt9693 >>> 16;
			}
			this.anInt9693 += this.anIntArray533[local19 + 128 & 0xFF];
			@Pc(113) int local113;
			this.anIntArray533[local19] = local113 = this.anInt9693 + this.anIntArray533[local26 >> 2 & 0xFF] + this.anInt9694;
			this.anIntArray536[local19] = this.anInt9694 = local26 + this.anIntArray533[local113 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	public int method7838() {
		if (this.anInt9699 == 0) {
			this.method7837();
			this.anInt9699 = 256;
		}
		return this.anIntArray536[--this.anInt9699];
	}
}
