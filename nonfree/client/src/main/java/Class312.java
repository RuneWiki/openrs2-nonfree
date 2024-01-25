import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class312 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	private int anInt8969;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "[I")
	private int[] anIntArray829;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	private int anInt8973;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "I")
	private int anInt8975;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
	private int[] anIntArray831;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	private int anInt8980;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	private Class312() {
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "([I)V")
	public Class312(@OriginalArg(0) int[] arg0) {
		this.anIntArray829 = new int[256];
		this.anIntArray831 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray831[local13] = arg0[local13];
		}
		this.method7378();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	private void method7375() {
		this.anInt8980 += ++this.anInt8973;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray829[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt8969 ^= this.anInt8969 << 13;
				} else {
					this.anInt8969 ^= this.anInt8969 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt8969 ^= this.anInt8969 << 2;
			} else {
				this.anInt8969 ^= this.anInt8969 >>> 16;
			}
			this.anInt8969 += this.anIntArray829[local19 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray829[local19] = local122 = this.anInt8980 + this.anIntArray829[local26 >> 2 & 0xFF] + this.anInt8969;
			this.anIntArray831[local19] = this.anInt8980 = this.anIntArray829[local122 >> 8 >> 2 & 0xFF] + local26;
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	private void method7378() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(29) int local29;
		for (local29 = 0; local29 < 4; local29++) {
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
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local14 += this.anIntArray831[local29 + 4];
			local20 += this.anIntArray831[local29 + 1];
			local18 += this.anIntArray831[local29 + 2];
			local8 += this.anIntArray831[local29 + 7];
			local12 += this.anIntArray831[local29 + 5];
			local21 += this.anIntArray831[local29];
			local16 += this.anIntArray831[local29 + 3];
			local10 += this.anIntArray831[local29 + 6];
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
			this.anIntArray829[local29] = local21;
			this.anIntArray829[local29 + 1] = local20;
			this.anIntArray829[local29 + 2] = local18;
			this.anIntArray829[local29 + 3] = local16;
			this.anIntArray829[local29 + 4] = local14;
			this.anIntArray829[local29 + 5] = local12;
			this.anIntArray829[local29 + 6] = local10;
			this.anIntArray829[local29 + 7] = local8;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local20 += this.anIntArray829[local29 + 1];
			local21 += this.anIntArray829[local29];
			local12 += this.anIntArray829[local29 + 5];
			local14 += this.anIntArray829[local29 + 4];
			local16 += this.anIntArray829[local29 + 3];
			local10 += this.anIntArray829[local29 + 6];
			local8 += this.anIntArray829[local29 + 7];
			local18 += this.anIntArray829[local29 + 2];
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray829[local29] = local21;
			this.anIntArray829[local29 + 1] = local20;
			this.anIntArray829[local29 + 2] = local18;
			this.anIntArray829[local29 + 3] = local16;
			this.anIntArray829[local29 + 4] = local14;
			this.anIntArray829[local29 + 5] = local12;
			this.anIntArray829[local29 + 6] = local10;
			this.anIntArray829[local29 + 7] = local8;
		}
		this.method7375();
		this.anInt8975 = 256;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)I")
	public int method7379() {
		if (this.anInt8975 == 0) {
			this.method7375();
			this.anInt8975 = 256;
		}
		return this.anIntArray831[this.anInt8975 - 1];
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(I)I")
	public int method7381() {
		if (this.anInt8975 == 0) {
			this.method7375();
			this.anInt8975 = 256;
		}
		return this.anIntArray831[--this.anInt8975];
	}
}
