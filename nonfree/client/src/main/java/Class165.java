import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class165 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	private int anInt5073;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
	private int[] anIntArray471;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	private int anInt5074;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	private int anInt5076;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	private int anInt5077;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "[I")
	private int[] anIntArray472;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	private Class165() {
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([I)V")
	public Class165(@OriginalArg(0) int[] arg0) {
		this.anIntArray472 = new int[256];
		this.anIntArray471 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray472[local13] = arg0[local13];
		}
		this.method4402();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	private void method4402() {
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
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local14 += this.anIntArray472[local29 + 7];
			local16 += this.anIntArray472[local29 + 6];
			local20 += this.anIntArray472[local29 + 4];
			local27 += this.anIntArray472[local29];
			local18 += this.anIntArray472[local29 + 5];
			local26 += this.anIntArray472[local29 + 1];
			local22 += this.anIntArray472[local29 + 3];
			local24 += this.anIntArray472[local29 + 2];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
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
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray471[local29] = local27;
			this.anIntArray471[local29 + 1] = local26;
			this.anIntArray471[local29 + 2] = local24;
			this.anIntArray471[local29 + 3] = local22;
			this.anIntArray471[local29 + 4] = local20;
			this.anIntArray471[local29 + 5] = local18;
			this.anIntArray471[local29 + 6] = local16;
			this.anIntArray471[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.anIntArray471[local29 + 6];
			local22 += this.anIntArray471[local29 + 3];
			local20 += this.anIntArray471[local29 + 4];
			local18 += this.anIntArray471[local29 + 5];
			local14 += this.anIntArray471[local29 + 7];
			local27 += this.anIntArray471[local29];
			local26 += this.anIntArray471[local29 + 1];
			local24 += this.anIntArray471[local29 + 2];
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
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray471[local29] = local27;
			this.anIntArray471[local29 + 1] = local26;
			this.anIntArray471[local29 + 2] = local24;
			this.anIntArray471[local29 + 3] = local22;
			this.anIntArray471[local29 + 4] = local20;
			this.anIntArray471[local29 + 5] = local18;
			this.anIntArray471[local29 + 6] = local16;
			this.anIntArray471[local29 + 7] = local14;
		}
		this.method4406();
		this.anInt5076 = 256;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I")
	public int method4405() {
		if (this.anInt5076-- == 0) {
			this.method4406();
			this.anInt5076 = 255;
		}
		return this.anIntArray472[this.anInt5076];
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	private void method4406() {
		this.anInt5073 += ++this.anInt5077;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray471[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt5074 ^= this.anInt5074 << 13;
				} else {
					this.anInt5074 ^= this.anInt5074 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt5074 ^= this.anInt5074 << 2;
			} else {
				this.anInt5074 ^= this.anInt5074 >>> 16;
			}
			this.anInt5074 += this.anIntArray471[local23 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray471[local23] = local123 = this.anInt5074 + this.anIntArray471[local30 >> 2 & 0xFF] + this.anInt5073;
			this.anIntArray472[local23] = this.anInt5073 = this.anIntArray471[local123 >> 8 >> 2 & 0xFF] + local30;
		}
	}
}
