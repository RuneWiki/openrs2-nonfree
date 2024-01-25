import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class5_Sub42_Sub1 extends Class5_Sub42 {

	@OriginalMember(owner = "client!to", name = "z", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!to", name = "A", descriptor = "[J")
	public static final long[] aLongArray9 = new long[11];

	@OriginalMember(owner = "client!to", name = "p", descriptor = "I")
	public int anInt8236;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "I")
	public int anInt8239;

	@OriginalMember(owner = "client!to", name = "v", descriptor = "I")
	public int anInt8242;

	@OriginalMember(owner = "client!to", name = "y", descriptor = "J")
	public long aLong227;

	static {
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(21) char local21 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local14 / 2);
			@Pc(37) long local37 = (long) ((local14 & 0x1) == 0 ? local21 >>> 8 : local21 & 0xFF);
			@Pc(41) long local41 = local37 << 1;
			if (local41 >= 256L) {
				local41 ^= 0x11DL;
			}
			@Pc(55) long local55 = local41 << 1;
			if (local55 >= 256L) {
				local55 ^= 0x11DL;
			}
			@Pc(67) long local67 = local55 ^ local37;
			@Pc(71) long local71 = local55 << 1;
			if (local71 >= 256L) {
				local71 ^= 0x11DL;
			}
			@Pc(85) long local85 = local37 ^ local71;
			aLongArrayArray1[0][local14] = Static374.method5617(Static374.method5617(Static374.method5617(Static374.method5617(Static374.method5617(local37 << 32, Static374.method5617(local55 << 40, Static374.method5617(local37 << 48, local37 << 56))), local71 << 24), local67 << 16), local41 << 8), local85);
			for (@Pc(121) int local121 = 1; local121 < 8; local121++) {
				aLongArrayArray1[local121][local14] = Static374.method5617(aLongArrayArray1[local121 - 1][local14] << 56, aLongArrayArray1[local121 - 1][local14] >>> 8);
			}
		}
		aLongArray9[0] = 0L;
		for (@Pc(162) int local162 = 1; local162 <= 10; local162++) {
			@Pc(169) int local169 = local162 * 8 - 8;
			aLongArray9[local162] = Static460.method6394(Static429.method6127(aLongArrayArray1[7][local169 + 7], 255L), Static460.method6394(Static429.method6127(aLongArrayArray1[6][local169 + 6], 65280L), Static460.method6394(Static460.method6394(Static460.method6394(Static460.method6394(Static429.method6127(aLongArrayArray1[2][local169 + 2], 280375465082880L), Static460.method6394(Static429.method6127(aLongArrayArray1[0][local169], -72057594037927936L), Static429.method6127(71776119061217280L, aLongArrayArray1[1][local169 + 1]))), Static429.method6127(1095216660480L, aLongArrayArray1[3][local169 + 3])), Static429.method6127(aLongArrayArray1[4][local169 + 4], 4278190080L)), Static429.method6127(16711680L, aLongArrayArray1[5][local169 + 5]))));
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)I")
	@Override
	public int method7432() {
		return this.anInt8242;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(Z)I")
	@Override
	public int method7433() {
		return this.anInt8239;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)I")
	@Override
	public int method7431() {
		return this.anInt8236;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)J")
	@Override
	public long method7430() {
		return this.aLong227;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
	@Override
	public int method7429() {
		return 0;
	}
}
