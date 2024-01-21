import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class76 {

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	private int anInt2948;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "I")
	private int anInt2952;

	@OriginalMember(owner = "client!va", name = "u", descriptor = "I")
	private int anInt2953;

	@OriginalMember(owner = "client!va", name = "w", descriptor = "I")
	private int anInt2954;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "[I")
	private final int[] anIntArray319 = new int[256];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
	private final int[] anIntArray318 = new int[256];

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "([I)V")
	public Class76(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray319[local13] = arg0[local13];
		}
		this.method1887();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	private void method1886() {
		this.anInt2953 += ++this.anInt2952;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray318[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt2948 ^= this.anInt2948 << 13;
				} else {
					this.anInt2948 ^= this.anInt2948 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt2948 ^= this.anInt2948 << 2;
			} else {
				this.anInt2948 ^= this.anInt2948 >>> 16;
			}
			this.anInt2948 += this.anIntArray318[local23 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray318[local23] = local119 = this.anInt2953 + this.anInt2948 + this.anIntArray318[local30 >> 2 & 0xFF];
			this.anIntArray319[local23] = this.anInt2953 = this.anIntArray318[local119 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
	private void method1887() {
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
			local18 ^= local16 << 8;
			local14 += local20;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local10 += local16;
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
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray319[local23 + 1];
			local10 += this.anIntArray319[local23 + 6];
			local12 += this.anIntArray319[local23 + 5];
			local16 += this.anIntArray319[local23 + 3];
			local14 += this.anIntArray319[local23 + 4];
			local21 += this.anIntArray319[local23];
			local8 += this.anIntArray319[local23 + 7];
			local18 += this.anIntArray319[local23 + 2];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
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
			local10 += local8;
			local10 ^= local8 << 8;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local20 += local10;
			local18 += local8;
			local21 += local20;
			this.anIntArray318[local23] = local21;
			this.anIntArray318[local23 + 1] = local20;
			this.anIntArray318[local23 + 2] = local18;
			this.anIntArray318[local23 + 3] = local16;
			this.anIntArray318[local23 + 4] = local14;
			this.anIntArray318[local23 + 5] = local12;
			this.anIntArray318[local23 + 6] = local10;
			this.anIntArray318[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray318[local23];
			local12 += this.anIntArray318[local23 + 5];
			local14 += this.anIntArray318[local23 + 4];
			local20 += this.anIntArray318[local23 + 1];
			local8 += this.anIntArray318[local23 + 7];
			local18 += this.anIntArray318[local23 + 2];
			local16 += this.anIntArray318[local23 + 3];
			local10 += this.anIntArray318[local23 + 6];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local18 ^= local16 << 8;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
			local10 += local16;
			local14 += local12;
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
			this.anIntArray318[local23] = local21;
			local18 += local8;
			this.anIntArray318[local23 + 1] = local20;
			this.anIntArray318[local23 + 2] = local18;
			this.anIntArray318[local23 + 3] = local16;
			this.anIntArray318[local23 + 4] = local14;
			this.anIntArray318[local23 + 5] = local12;
			this.anIntArray318[local23 + 6] = local10;
			this.anIntArray318[local23 + 7] = local8;
		}
		this.method1886();
		this.anInt2954 = 256;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I")
	public int method1891() {
		if (this.anInt2954-- == 0) {
			this.method1886();
			this.anInt2954 = 255;
		}
		return this.anIntArray319[this.anInt2954];
	}
}
