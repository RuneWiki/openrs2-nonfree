import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class186 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
	private int anInt4812;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
	private int anInt4814;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
	private int anInt4818;

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
	private int anInt4820;

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	private Class186() {
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "([I)V")
	public Class186(@OriginalArg(0) int[] arg0) {
		this.anIntArray361 = new int[256];
		this.anIntArray362 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray361[local13] = arg0[local13];
		}
		this.method3815();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	private void method3815() {
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
			local14 += this.anIntArray361[local29 + 7];
			local20 += this.anIntArray361[local29 + 4];
			local22 += this.anIntArray361[local29 + 3];
			local16 += this.anIntArray361[local29 + 6];
			local27 += this.anIntArray361[local29];
			local24 += this.anIntArray361[local29 + 2];
			local18 += this.anIntArray361[local29 + 5];
			local26 += this.anIntArray361[local29 + 1];
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
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray362[local29] = local27;
			this.anIntArray362[local29 + 1] = local26;
			this.anIntArray362[local29 + 2] = local24;
			this.anIntArray362[local29 + 3] = local22;
			this.anIntArray362[local29 + 4] = local20;
			this.anIntArray362[local29 + 5] = local18;
			this.anIntArray362[local29 + 6] = local16;
			this.anIntArray362[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local20 += this.anIntArray362[local29 + 4];
			local24 += this.anIntArray362[local29 + 2];
			local22 += this.anIntArray362[local29 + 3];
			local27 += this.anIntArray362[local29];
			local26 += this.anIntArray362[local29 + 1];
			local14 += this.anIntArray362[local29 + 7];
			local18 += this.anIntArray362[local29 + 5];
			local16 += this.anIntArray362[local29 + 6];
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
			local20 += local18;
			local16 += local22;
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
			this.anIntArray362[local29] = local27;
			this.anIntArray362[local29 + 1] = local26;
			this.anIntArray362[local29 + 2] = local24;
			this.anIntArray362[local29 + 3] = local22;
			this.anIntArray362[local29 + 4] = local20;
			this.anIntArray362[local29 + 5] = local18;
			this.anIntArray362[local29 + 6] = local16;
			this.anIntArray362[local29 + 7] = local14;
		}
		this.method3818();
		this.anInt4820 = 256;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)I")
	public int method3816() {
		if (this.anInt4820 == 0) {
			this.method3818();
			this.anInt4820 = 256;
		}
		return this.anIntArray361[--this.anInt4820];
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
	private void method3818() {
		this.anInt4814 += ++this.anInt4812;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray362[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt4818 ^= this.anInt4818 << 13;
				} else {
					this.anInt4818 ^= this.anInt4818 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt4818 ^= this.anInt4818 << 2;
			} else {
				this.anInt4818 ^= this.anInt4818 >>> 16;
			}
			this.anInt4818 += this.anIntArray362[local19 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray362[local19] = local115 = this.anInt4818 + this.anIntArray362[local26 >> 2 & 0xFF] + this.anInt4814;
			this.anIntArray361[local19] = this.anInt4814 = this.anIntArray362[local115 >> 8 >> 2 & 0xFF] + local26;
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)I")
	public int method3819() {
		if (this.anInt4820 == 0) {
			this.method3818();
			this.anInt4820 = 256;
		}
		return this.anIntArray361[this.anInt4820 - 1];
	}
}
