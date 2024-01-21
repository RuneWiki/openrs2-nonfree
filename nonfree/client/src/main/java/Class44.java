import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class44 {

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	private int anInt1455;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	private int anInt1456;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
	private int anInt1461;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
	private int anInt1467;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
	private final int[] anIntArray180 = new int[256];

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "[I")
	private final int[] anIntArray179 = new int[256];

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([I)V")
	public Class44(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray179[local13] = arg0[local13];
		}
		this.method1013();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	private void method1013() {
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
			local26 ^= local24 >>> 2;
			local20 += local26;
			local22 += local27;
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
			local16 += local14;
			local16 ^= local14 << 8;
			local27 += local18;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local27 += this.anIntArray179[local29];
			local22 += this.anIntArray179[local29 + 3];
			local18 += this.anIntArray179[local29 + 5];
			local20 += this.anIntArray179[local29 + 4];
			local26 += this.anIntArray179[local29 + 1];
			local27 ^= local26 << 11;
			local24 += this.anIntArray179[local29 + 2];
			local14 += this.anIntArray179[local29 + 7];
			local26 += local24;
			local22 += local27;
			local16 += this.anIntArray179[local29 + 6];
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local16 += local22;
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
			this.anIntArray180[local29] = local27;
			this.anIntArray180[local29 + 1] = local26;
			this.anIntArray180[local29 + 2] = local24;
			this.anIntArray180[local29 + 3] = local22;
			this.anIntArray180[local29 + 4] = local20;
			this.anIntArray180[local29 + 5] = local18;
			this.anIntArray180[local29 + 6] = local16;
			this.anIntArray180[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local27 += this.anIntArray180[local29];
			local24 += this.anIntArray180[local29 + 2];
			local16 += this.anIntArray180[local29 + 6];
			local22 += this.anIntArray180[local29 + 3];
			local18 += this.anIntArray180[local29 + 5];
			local26 += this.anIntArray180[local29 + 1];
			local14 += this.anIntArray180[local29 + 7];
			local20 += this.anIntArray180[local29 + 4];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local24 ^= local22 << 8;
			local20 += local26;
			local18 += local24;
			local22 += local20;
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
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray180[local29] = local27;
			this.anIntArray180[local29 + 1] = local26;
			this.anIntArray180[local29 + 2] = local24;
			this.anIntArray180[local29 + 3] = local22;
			this.anIntArray180[local29 + 4] = local20;
			this.anIntArray180[local29 + 5] = local18;
			this.anIntArray180[local29 + 6] = local16;
			this.anIntArray180[local29 + 7] = local14;
		}
		this.method1015();
		this.anInt1461 = 256;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I")
	public int method1014() {
		if (this.anInt1461-- == 0) {
			this.method1015();
			this.anInt1461 = 255;
		}
		return this.anIntArray179[this.anInt1461];
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	private void method1015() {
		this.anInt1455 += ++this.anInt1456;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray180[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt1467 ^= this.anInt1467 << 13;
				} else {
					this.anInt1467 ^= this.anInt1467 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt1467 ^= this.anInt1467 << 2;
			} else {
				this.anInt1467 ^= this.anInt1467 >>> 16;
			}
			this.anInt1467 += this.anIntArray180[local23 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray180[local23] = local122 = this.anInt1455 + this.anInt1467 + this.anIntArray180[local30 >> 2 & 0xFF];
			this.anIntArray179[local23] = this.anInt1455 = local30 + this.anIntArray180[local122 >> 8 >> 2 & 0xFF];
		}
	}
}
