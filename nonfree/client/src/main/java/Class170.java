import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class170 {

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
	private int anInt4632;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
	private int[] anIntArray284;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	private int anInt4634;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
	private int anInt4635;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
	private int anInt4640;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	private Class170() {
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([I)V")
	public Class170(@OriginalArg(0) int[] arg0) {
		this.anIntArray284 = new int[256];
		this.anIntArray285 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray284[local13] = arg0[local13];
		}
		this.method3982();
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
	private void method3982() {
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
			local24 += local22;
			local20 += local26;
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
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local24 += this.anIntArray284[local29 + 2];
			local20 += this.anIntArray284[local29 + 4];
			local16 += this.anIntArray284[local29 + 6];
			local26 += this.anIntArray284[local29 + 1];
			local22 += this.anIntArray284[local29 + 3];
			local18 += this.anIntArray284[local29 + 5];
			local14 += this.anIntArray284[local29 + 7];
			local27 += this.anIntArray284[local29];
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
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray285[local29] = local27;
			this.anIntArray285[local29 + 1] = local26;
			this.anIntArray285[local29 + 2] = local24;
			this.anIntArray285[local29 + 3] = local22;
			this.anIntArray285[local29 + 4] = local20;
			this.anIntArray285[local29 + 5] = local18;
			this.anIntArray285[local29 + 6] = local16;
			this.anIntArray285[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local20 += this.anIntArray285[local29 + 4];
			local26 += this.anIntArray285[local29 + 1];
			local27 += this.anIntArray285[local29];
			local14 += this.anIntArray285[local29 + 7];
			local18 += this.anIntArray285[local29 + 5];
			local16 += this.anIntArray285[local29 + 6];
			local22 += this.anIntArray285[local29 + 3];
			local24 += this.anIntArray285[local29 + 2];
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
			local20 += local18;
			local16 += local22;
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
			local27 += local26;
			local24 += local14;
			this.anIntArray285[local29] = local27;
			this.anIntArray285[local29 + 1] = local26;
			this.anIntArray285[local29 + 2] = local24;
			this.anIntArray285[local29 + 3] = local22;
			this.anIntArray285[local29 + 4] = local20;
			this.anIntArray285[local29 + 5] = local18;
			this.anIntArray285[local29 + 6] = local16;
			this.anIntArray285[local29 + 7] = local14;
		}
		this.method3986();
		this.anInt4634 = 256;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)I")
	public int method3984() {
		if (this.anInt4634 == 0) {
			this.method3986();
			this.anInt4634 = 256;
		}
		return this.anIntArray284[--this.anInt4634];
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I")
	public int method3985() {
		if (this.anInt4634 == 0) {
			this.method3986();
			this.anInt4634 = 256;
		}
		return this.anIntArray284[this.anInt4634 - 1];
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	private void method3986() {
		this.anInt4640 += ++this.anInt4635;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray285[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt4632 ^= this.anInt4632 << 13;
				} else {
					this.anInt4632 ^= this.anInt4632 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt4632 ^= this.anInt4632 << 2;
			} else {
				this.anInt4632 ^= this.anInt4632 >>> 16;
			}
			this.anInt4632 += this.anIntArray285[local25 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray285[local25] = local124 = this.anInt4632 + this.anIntArray285[local32 >> 2 & 0xFF] + this.anInt4640;
			this.anIntArray284[local25] = this.anInt4640 = local32 + this.anIntArray285[local124 >> 8 >> 2 & 0xFF];
		}
	}
}
