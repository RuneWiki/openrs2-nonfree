import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class129 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	private int anInt3987;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	private int anInt3988;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	private int anInt3990;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	private int anInt3993;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	private Class129() {
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "([I)V")
	public Class129(@OriginalArg(0) int[] arg0) {
		this.anIntArray255 = new int[256];
		this.anIntArray256 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray255[local13] = arg0[local13];
		}
		this.method3193();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
	public int method3190() {
		if (this.anInt3988 == 0) {
			this.method3194();
			this.anInt3988 = 256;
		}
		return this.anIntArray255[--this.anInt3988];
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
	private void method3193() {
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
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray255[local23 + 2];
			local8 += this.anIntArray255[local23 + 7];
			local21 += this.anIntArray255[local23];
			local10 += this.anIntArray255[local23 + 6];
			local14 += this.anIntArray255[local23 + 4];
			local12 += this.anIntArray255[local23 + 5];
			local20 += this.anIntArray255[local23 + 1];
			local16 += this.anIntArray255[local23 + 3];
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
			this.anIntArray256[local23] = local21;
			this.anIntArray256[local23 + 1] = local20;
			this.anIntArray256[local23 + 2] = local18;
			this.anIntArray256[local23 + 3] = local16;
			this.anIntArray256[local23 + 4] = local14;
			this.anIntArray256[local23 + 5] = local12;
			this.anIntArray256[local23 + 6] = local10;
			this.anIntArray256[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray256[local23 + 3];
			local12 += this.anIntArray256[local23 + 5];
			local18 += this.anIntArray256[local23 + 2];
			local14 += this.anIntArray256[local23 + 4];
			local8 += this.anIntArray256[local23 + 7];
			local21 += this.anIntArray256[local23];
			local10 += this.anIntArray256[local23 + 6];
			local20 += this.anIntArray256[local23 + 1];
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
			local18 += local8;
			local21 += local20;
			this.anIntArray256[local23] = local21;
			this.anIntArray256[local23 + 1] = local20;
			this.anIntArray256[local23 + 2] = local18;
			this.anIntArray256[local23 + 3] = local16;
			this.anIntArray256[local23 + 4] = local14;
			this.anIntArray256[local23 + 5] = local12;
			this.anIntArray256[local23 + 6] = local10;
			this.anIntArray256[local23 + 7] = local8;
		}
		this.method3194();
		this.anInt3988 = 256;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
	private void method3194() {
		this.anInt3987 += ++this.anInt3990;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(23) int local23 = this.anIntArray256[local17];
			if ((local17 & 0x2) == 0) {
				if ((local17 & 0x1) == 0) {
					this.anInt3993 ^= this.anInt3993 << 13;
				} else {
					this.anInt3993 ^= this.anInt3993 >>> 6;
				}
			} else if ((local17 & 0x1) == 0) {
				this.anInt3993 ^= this.anInt3993 << 2;
			} else {
				this.anInt3993 ^= this.anInt3993 >>> 16;
			}
			this.anInt3993 += this.anIntArray256[local17 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray256[local17] = local115 = this.anInt3987 + this.anIntArray256[local23 >> 2 & 0xFF] + this.anInt3993;
			this.anIntArray255[local17] = this.anInt3987 = this.anIntArray256[local115 >> 8 >> 2 & 0xFF] + local23;
		}
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)I")
	public int method3195() {
		if (this.anInt3988 == 0) {
			this.method3194();
			this.anInt3988 = 256;
		}
		return this.anIntArray255[this.anInt3988 - 1];
	}
}
