import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class375 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	private int anInt10341;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	private int anInt10345;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	private int anInt10346;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
	private int[] anIntArray911;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "I")
	private int anInt10347;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "[I")
	private int[] anIntArray912;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	private Class375() {
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "([I)V")
	public Class375(@OriginalArg(0) int[] arg0) {
		this.anIntArray912 = new int[256];
		this.anIntArray911 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray912[local13] = arg0[local13];
		}
		this.method9015();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)I")
	public int method9012() {
		if (this.anInt10346 == 0) {
			this.method9013();
			this.anInt10346 = 256;
		}
		return this.anIntArray912[this.anInt10346 - 1];
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	private void method9013() {
		this.anInt10347 += ++this.anInt10341;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray911[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt10345 ^= this.anInt10345 << 13;
				} else {
					this.anInt10345 ^= this.anInt10345 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt10345 ^= this.anInt10345 << 2;
			} else {
				this.anInt10345 ^= this.anInt10345 >>> 16;
			}
			this.anInt10345 += this.anIntArray911[local25 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray911[local25] = local122 = this.anIntArray911[local32 >> 2 & 0xFF] + this.anInt10345 + this.anInt10347;
			this.anIntArray912[local25] = this.anInt10347 = this.anIntArray911[local122 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)I")
	public int method9014() {
		if (this.anInt10346 == 0) {
			this.method9013();
			this.anInt10346 = 256;
		}
		return this.anIntArray912[--this.anInt10346];
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	private void method9015() {
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
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local14 += this.anIntArray912[local29 + 7];
			local26 += this.anIntArray912[local29 + 1];
			local18 += this.anIntArray912[local29 + 5];
			local22 += this.anIntArray912[local29 + 3];
			local27 += this.anIntArray912[local29];
			local24 += this.anIntArray912[local29 + 2];
			local20 += this.anIntArray912[local29 + 4];
			local16 += this.anIntArray912[local29 + 6];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray911[local29] = local27;
			this.anIntArray911[local29 + 1] = local26;
			this.anIntArray911[local29 + 2] = local24;
			this.anIntArray911[local29 + 3] = local22;
			this.anIntArray911[local29 + 4] = local20;
			this.anIntArray911[local29 + 5] = local18;
			this.anIntArray911[local29 + 6] = local16;
			this.anIntArray911[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local26 += this.anIntArray911[local29 + 1];
			local14 += this.anIntArray911[local29 + 7];
			local20 += this.anIntArray911[local29 + 4];
			local22 += this.anIntArray911[local29 + 3];
			local18 += this.anIntArray911[local29 + 5];
			local24 += this.anIntArray911[local29 + 2];
			local27 += this.anIntArray911[local29];
			local16 += this.anIntArray911[local29 + 6];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray911[local29] = local27;
			this.anIntArray911[local29 + 1] = local26;
			this.anIntArray911[local29 + 2] = local24;
			this.anIntArray911[local29 + 3] = local22;
			this.anIntArray911[local29 + 4] = local20;
			this.anIntArray911[local29 + 5] = local18;
			this.anIntArray911[local29 + 6] = local16;
			this.anIntArray911[local29 + 7] = local14;
		}
		this.method9013();
		this.anInt10346 = 256;
	}
}
