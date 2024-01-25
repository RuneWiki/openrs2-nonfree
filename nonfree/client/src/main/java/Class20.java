import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class20 {

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	private Class20() {
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "([I)V")
	public Class20(@OriginalArg(0) int[] arg0) {
		this.anIntArray28 = new int[256];
		this.anIntArray29 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray29[local13] = arg0[local13];
		}
		this.method326();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
	private void method320() {
		this.anInt336 += ++this.anInt337;
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(33) int local33 = this.anIntArray28[local26];
			if ((local26 & 0x2) == 0) {
				if ((local26 & 0x1) == 0) {
					this.anInt332 ^= this.anInt332 << 13;
				} else {
					this.anInt332 ^= this.anInt332 >>> 6;
				}
			} else if ((local26 & 0x1) == 0) {
				this.anInt332 ^= this.anInt332 << 2;
			} else {
				this.anInt332 ^= this.anInt332 >>> 16;
			}
			this.anInt332 += this.anIntArray28[local26 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray28[local26] = local122 = this.anIntArray28[local33 >> 2 & 0xFF] + this.anInt332 + this.anInt336;
			this.anIntArray29[local26] = this.anInt336 = local33 + this.anIntArray28[local122 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)I")
	public int method321() {
		if (this.anInt341 == 0) {
			this.method320();
			this.anInt341 = 256;
		}
		return this.anIntArray29[this.anInt341 - 1];
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)I")
	public int method323() {
		if (this.anInt341 == 0) {
			this.method320();
			this.anInt341 = 256;
		}
		return this.anIntArray29[--this.anInt341];
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(B)V")
	private void method326() {
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
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray29[local23 + 7];
			local21 += this.anIntArray29[local23];
			local10 += this.anIntArray29[local23 + 6];
			local20 += this.anIntArray29[local23 + 1];
			local16 += this.anIntArray29[local23 + 3];
			local12 += this.anIntArray29[local23 + 5];
			local18 += this.anIntArray29[local23 + 2];
			local14 += this.anIntArray29[local23 + 4];
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
			local10 += local16;
			local14 += local12;
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
			this.anIntArray28[local23] = local21;
			this.anIntArray28[local23 + 1] = local20;
			this.anIntArray28[local23 + 2] = local18;
			this.anIntArray28[local23 + 3] = local16;
			this.anIntArray28[local23 + 4] = local14;
			this.anIntArray28[local23 + 5] = local12;
			this.anIntArray28[local23 + 6] = local10;
			this.anIntArray28[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray28[local23 + 1];
			local21 += this.anIntArray28[local23];
			local8 += this.anIntArray28[local23 + 7];
			local12 += this.anIntArray28[local23 + 5];
			local10 += this.anIntArray28[local23 + 6];
			local14 += this.anIntArray28[local23 + 4];
			local16 += this.anIntArray28[local23 + 3];
			local18 += this.anIntArray28[local23 + 2];
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
			local21 += local20;
			local18 += local8;
			this.anIntArray28[local23] = local21;
			this.anIntArray28[local23 + 1] = local20;
			this.anIntArray28[local23 + 2] = local18;
			this.anIntArray28[local23 + 3] = local16;
			this.anIntArray28[local23 + 4] = local14;
			this.anIntArray28[local23 + 5] = local12;
			this.anIntArray28[local23 + 6] = local10;
			this.anIntArray28[local23 + 7] = local8;
		}
		this.method320();
		this.anInt341 = 256;
	}
}
