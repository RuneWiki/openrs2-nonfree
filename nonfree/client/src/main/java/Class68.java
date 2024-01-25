import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class68 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "[I")
	private int[] anIntArray105;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	private int anInt1520;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
	private int anInt1521;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	private int anInt1522;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
	private int anInt1524;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	private Class68() {
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([I)V")
	public Class68(@OriginalArg(0) int[] arg0) {
		this.anIntArray106 = new int[256];
		this.anIntArray105 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray106[local13] = arg0[local13];
		}
		this.method1402();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	private void method1402() {
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
			local21 += this.anIntArray106[local23];
			local20 += this.anIntArray106[local23 + 1];
			local14 += this.anIntArray106[local23 + 4];
			local10 += this.anIntArray106[local23 + 6];
			local16 += this.anIntArray106[local23 + 3];
			local12 += this.anIntArray106[local23 + 5];
			local18 += this.anIntArray106[local23 + 2];
			local8 += this.anIntArray106[local23 + 7];
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
			this.anIntArray105[local23] = local21;
			this.anIntArray105[local23 + 1] = local20;
			this.anIntArray105[local23 + 2] = local18;
			this.anIntArray105[local23 + 3] = local16;
			this.anIntArray105[local23 + 4] = local14;
			this.anIntArray105[local23 + 5] = local12;
			this.anIntArray105[local23 + 6] = local10;
			this.anIntArray105[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray105[local23 + 6];
			local8 += this.anIntArray105[local23 + 7];
			local14 += this.anIntArray105[local23 + 4];
			local21 += this.anIntArray105[local23];
			local16 += this.anIntArray105[local23 + 3];
			local20 += this.anIntArray105[local23 + 1];
			local18 += this.anIntArray105[local23 + 2];
			local12 += this.anIntArray105[local23 + 5];
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
			this.anIntArray105[local23] = local21;
			this.anIntArray105[local23 + 1] = local20;
			this.anIntArray105[local23 + 2] = local18;
			this.anIntArray105[local23 + 3] = local16;
			this.anIntArray105[local23 + 4] = local14;
			this.anIntArray105[local23 + 5] = local12;
			this.anIntArray105[local23 + 6] = local10;
			this.anIntArray105[local23 + 7] = local8;
		}
		this.method1404();
		this.anInt1522 = 256;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)I")
	public int method1403() {
		if (this.anInt1522 == 0) {
			this.method1404();
			this.anInt1522 = 256;
		}
		return this.anIntArray106[--this.anInt1522];
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
	private void method1404() {
		this.anInt1520 += ++this.anInt1521;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(23) int local23 = this.anIntArray105[local17];
			if ((local17 & 0x2) == 0) {
				if ((local17 & 0x1) == 0) {
					this.anInt1524 ^= this.anInt1524 << 13;
				} else {
					this.anInt1524 ^= this.anInt1524 >>> 6;
				}
			} else if ((local17 & 0x1) == 0) {
				this.anInt1524 ^= this.anInt1524 << 2;
			} else {
				this.anInt1524 ^= this.anInt1524 >>> 16;
			}
			this.anInt1524 += this.anIntArray105[local17 + 128 & 0xFF];
			@Pc(110) int local110;
			this.anIntArray105[local17] = local110 = this.anIntArray105[local23 >> 2 & 0xFF] + this.anInt1524 + this.anInt1520;
			this.anIntArray106[local17] = this.anInt1520 = this.anIntArray105[local110 >> 8 >> 2 & 0xFF] + local23;
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)I")
	public int method1405() {
		if (this.anInt1522 == 0) {
			this.method1404();
			this.anInt1522 = 256;
		}
		return this.anIntArray106[this.anInt1522 - 1];
	}
}
