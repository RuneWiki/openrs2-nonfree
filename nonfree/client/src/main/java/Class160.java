import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class160 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "[J")
	public static final long[] aLongArray13 = new long[11];

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(15) char local15 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(28) long local28 = (long) ((local8 & 0x1) == 0 ? local15 >>> 8 : local15 & 0xFF);
			@Pc(32) long local32 = local28 << 1;
			if (local32 >= 256L) {
				local32 ^= 0x11DL;
			}
			@Pc(44) long local44 = local32 << 1;
			if (local44 >= 256L) {
				local44 ^= 0x11DL;
			}
			@Pc(58) long local58 = local44 ^ local28;
			@Pc(62) long local62 = local44 << 1;
			if (local62 >= 256L) {
				local62 ^= 0x11DL;
			}
			@Pc(76) long local76 = local62 ^ local28;
			aLongArrayArray1[0][local8] = Static134.method2249(Static134.method2249(local32 << 8, Static134.method2249(local58 << 16, Static134.method2249(local62 << 24, Static134.method2249(Static134.method2249(Static134.method2249(local28 << 56, local28 << 48), local44 << 40), local28 << 32)))), local76);
			for (@Pc(112) int local112 = 1; local112 < 8; local112++) {
				aLongArrayArray1[local112][local8] = Static134.method2249(aLongArrayArray1[local112 - 1][local8] >>> 8, aLongArrayArray1[local112 - 1][local8] << 56);
			}
		}
		aLongArray13[0] = 0L;
		for (@Pc(153) int local153 = 1; local153 <= 10; local153++) {
			@Pc(160) int local160 = local153 * 8 - 8;
			aLongArray13[local153] = Static162.method2506(Static162.method2506(Static162.method2506(Static162.method2506(Static232.method4014(4278190080L, aLongArrayArray1[4][local160 + 4]), Static162.method2506(Static162.method2506(Static232.method4014(aLongArrayArray1[2][local160 + 2], 280375465082880L), Static162.method2506(Static232.method4014(71776119061217280L, aLongArrayArray1[1][local160 + 1]), Static232.method4014(-72057594037927936L, aLongArrayArray1[0][local160]))), Static232.method4014(aLongArrayArray1[3][local160 + 3], 1095216660480L))), Static232.method4014(aLongArrayArray1[5][local160 + 5], 16711680L)), Static232.method4014(65280L, aLongArrayArray1[6][local160 + 6])), Static232.method4014(255L, aLongArrayArray1[7][local160 + 7]));
		}
	}
}
