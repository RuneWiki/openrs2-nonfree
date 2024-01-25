import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class304 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "[J")
	public static final long[] aLongArray23 = new long[11];

	@OriginalMember(owner = "client!se", name = "b", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(15) char local15 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(31) long local31 = (long) ((local8 & 0x1) == 0 ? local15 >>> 8 : local15 & 0xFF);
			@Pc(35) long local35 = local31 << 1;
			if (local35 >= 256L) {
				local35 ^= 0x11DL;
			}
			@Pc(47) long local47 = local35 << 1;
			if (local47 >= 256L) {
				local47 ^= 0x11DL;
			}
			@Pc(61) long local61 = local47 ^ local31;
			@Pc(65) long local65 = local47 << 1;
			if (local65 >= 256L) {
				local65 ^= 0x11DL;
			}
			@Pc(77) long local77 = local65 ^ local31;
			aLongArrayArray1[0][local8] = Static604.method3457(local77, Static604.method3457(local35 << 8, Static604.method3457(Static604.method3457(local65 << 24, Static604.method3457(local31 << 32, Static604.method3457(local47 << 40, Static604.method3457(local31 << 48, local31 << 56)))), local61 << 16)));
			for (@Pc(113) int local113 = 1; local113 < 8; local113++) {
				aLongArrayArray1[local113][local8] = Static604.method3457(aLongArrayArray1[local113 - 1][local8] >>> 8, aLongArrayArray1[local113 - 1][local8] << 56);
			}
		}
		aLongArray23[0] = 0L;
		for (@Pc(154) int local154 = 1; local154 <= 10; local154++) {
			@Pc(161) int local161 = (local154 - 1) * 8;
			aLongArray23[local154] = Static340.method4683(Static340.method4683(Static577.method7748(65280L, aLongArrayArray1[6][local161 + 6]), Static340.method4683(Static577.method7748(16711680L, aLongArrayArray1[5][local161 + 5]), Static340.method4683(Static577.method7748(4278190080L, aLongArrayArray1[4][local161 + 4]), Static340.method4683(Static340.method4683(Static577.method7748(280375465082880L, aLongArrayArray1[2][local161 + 2]), Static340.method4683(Static577.method7748(aLongArrayArray1[0][local161], -72057594037927936L), Static577.method7748(71776119061217280L, aLongArrayArray1[1][local161 + 1]))), Static577.method7748(aLongArrayArray1[3][local161 + 3], 1095216660480L))))), Static577.method7748(255L, aLongArrayArray1[7][local161 + 7]));
		}
	}
}
