import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class127 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "[I")
	private int[] anIntArray415 = new int[256];

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	private int anInt3945;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "[I")
	private int[] anIntArray416 = new int[256];

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	private int anInt3949;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	private int anInt3950;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
	private int anInt3951;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "([I)V")
	public Class127(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray415[local13] = arg0[local13];
		}
		this.method3423();
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
	public int method3421() {
		if (this.anInt3949-- == 0) {
			this.method3422();
			this.anInt3949 = 255;
		}
		return this.anIntArray415[this.anInt3949];
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	private void method3422() {
		this.anInt3950 += ++this.anInt3945;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(31) int local31 = this.anIntArray416[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt3951 ^= this.anInt3951 << 13;
				} else {
					this.anInt3951 ^= this.anInt3951 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt3951 ^= this.anInt3951 << 2;
			} else {
				this.anInt3951 ^= this.anInt3951 >>> 16;
			}
			this.anInt3951 += this.anIntArray416[local23 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray416[local23] = local122 = this.anIntArray416[local31 >> 2 & 0xFF] + this.anInt3951 + this.anInt3950;
			this.anIntArray415[local23] = this.anInt3950 = local31 + this.anIntArray416[local122 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
	private void method3423() {
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(29) int local29;
		for (local29 = 0; local29 < 4; local29++) {
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local14 += local20;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local22 += this.anIntArray415[local29 + 3];
			local24 += this.anIntArray415[local29 + 2];
			local27 += this.anIntArray415[local29];
			local20 += this.anIntArray415[local29 + 4];
			local18 += this.anIntArray415[local29 + 5];
			local14 += this.anIntArray415[local29 + 7];
			local26 += this.anIntArray415[local29 + 1];
			local16 += this.anIntArray415[local29 + 6];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local24 ^= local22 << 8;
			local20 += local26;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local20 ^= local18 << 10;
			local16 += local22;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray416[local29] = local27;
			this.anIntArray416[local29 + 1] = local26;
			this.anIntArray416[local29 + 2] = local24;
			this.anIntArray416[local29 + 3] = local22;
			this.anIntArray416[local29 + 4] = local20;
			this.anIntArray416[local29 + 5] = local18;
			this.anIntArray416[local29 + 6] = local16;
			this.anIntArray416[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local18 += this.anIntArray416[local29 + 5];
			local14 += this.anIntArray416[local29 + 7];
			local20 += this.anIntArray416[local29 + 4];
			local22 += this.anIntArray416[local29 + 3];
			local24 += this.anIntArray416[local29 + 2];
			local16 += this.anIntArray416[local29 + 6];
			local27 += this.anIntArray416[local29];
			local26 += this.anIntArray416[local29 + 1];
			local27 ^= local26 << 11;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local22 += local27;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local27 += local18;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray416[local29] = local27;
			this.anIntArray416[local29 + 1] = local26;
			this.anIntArray416[local29 + 2] = local24;
			this.anIntArray416[local29 + 3] = local22;
			this.anIntArray416[local29 + 4] = local20;
			this.anIntArray416[local29 + 5] = local18;
			this.anIntArray416[local29 + 6] = local16;
			this.anIntArray416[local29 + 7] = local14;
		}
		this.method3422();
		this.anInt3949 = 256;
	}
}
