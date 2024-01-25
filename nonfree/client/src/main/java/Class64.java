import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class64 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
	private int anInt1361;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	private int anInt1362;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
	private int anInt1368;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
	private int anInt1369;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	private Class64() {
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "([I)V")
	public Class64(@OriginalArg(0) int[] arg0) {
		this.anIntArray134 = new int[256];
		this.anIntArray135 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray135[local13] = arg0[local13];
		}
		this.method1210();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	private void method1208() {
		this.anInt1368 += ++this.anInt1362;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray134[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt1369 ^= this.anInt1369 << 13;
				} else {
					this.anInt1369 ^= this.anInt1369 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt1369 ^= this.anInt1369 << 2;
			} else {
				this.anInt1369 ^= this.anInt1369 >>> 16;
			}
			this.anInt1369 += this.anIntArray134[local19 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray134[local19] = local116 = this.anInt1369 + this.anIntArray134[local26 >> 2 & 0xFF] + this.anInt1368;
			this.anIntArray135[local19] = this.anInt1368 = local26 + this.anIntArray134[local116 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V")
	private void method1210() {
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
			local22 += local27;
			local26 += local24;
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
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local22 += this.anIntArray135[local29 + 3];
			local18 += this.anIntArray135[local29 + 5];
			local16 += this.anIntArray135[local29 + 6];
			local24 += this.anIntArray135[local29 + 2];
			local26 += this.anIntArray135[local29 + 1];
			local27 += this.anIntArray135[local29];
			local20 += this.anIntArray135[local29 + 4];
			local14 += this.anIntArray135[local29 + 7];
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
			this.anIntArray134[local29] = local27;
			this.anIntArray134[local29 + 1] = local26;
			this.anIntArray134[local29 + 2] = local24;
			this.anIntArray134[local29 + 3] = local22;
			this.anIntArray134[local29 + 4] = local20;
			this.anIntArray134[local29 + 5] = local18;
			this.anIntArray134[local29 + 6] = local16;
			this.anIntArray134[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local24 += this.anIntArray134[local29 + 2];
			local16 += this.anIntArray134[local29 + 6];
			local14 += this.anIntArray134[local29 + 7];
			local26 += this.anIntArray134[local29 + 1];
			local27 += this.anIntArray134[local29];
			local18 += this.anIntArray134[local29 + 5];
			local20 += this.anIntArray134[local29 + 4];
			local22 += this.anIntArray134[local29 + 3];
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
			local14 += local20;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray134[local29] = local27;
			this.anIntArray134[local29 + 1] = local26;
			this.anIntArray134[local29 + 2] = local24;
			this.anIntArray134[local29 + 3] = local22;
			this.anIntArray134[local29 + 4] = local20;
			this.anIntArray134[local29 + 5] = local18;
			this.anIntArray134[local29 + 6] = local16;
			this.anIntArray134[local29 + 7] = local14;
		}
		this.method1208();
		this.anInt1361 = 256;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)I")
	public int method1211() {
		if (this.anInt1361 == 0) {
			this.method1208();
			this.anInt1361 = 256;
		}
		return this.anIntArray135[this.anInt1361 - 1];
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)I")
	public int method1212() {
		if (this.anInt1361 == 0) {
			this.method1208();
			this.anInt1361 = 256;
		}
		return this.anIntArray135[--this.anInt1361];
	}
}
