import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class193 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "[J")
	public static final long[] aLongArray11 = new long[11];

	@OriginalMember(owner = "client!km", name = "d", descriptor = "[[J")
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
			@Pc(58) long local58 = local28 ^ local44;
			@Pc(62) long local62 = local44 << 1;
			if (local62 >= 256L) {
				local62 ^= 0x11DL;
			}
			@Pc(74) long local74 = local62 ^ local28;
			aLongArrayArray1[0][local8] = Static505.method7411(local74, Static505.method7411(local32 << 8, Static505.method7411(local58 << 16, Static505.method7411(Static505.method7411(local28 << 32, Static505.method7411(Static505.method7411(local28 << 48, local28 << 56), local44 << 40)), local62 << 24))));
			for (@Pc(110) int local110 = 1; local110 < 8; local110++) {
				aLongArrayArray1[local110][local8] = Static505.method7411(aLongArrayArray1[local110 - 1][local8] << 56, aLongArrayArray1[local110 - 1][local8] >>> 8);
			}
		}
		aLongArray11[0] = 0L;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(158) int local158 = (local151 - 1) * 8;
			aLongArray11[local151] = Static446.method6893(Static295.method8180(255L, aLongArrayArray1[7][local158 + 7]), Static446.method6893(Static295.method8180(65280L, aLongArrayArray1[6][local158 + 6]), Static446.method6893(Static295.method8180(aLongArrayArray1[5][local158 + 5], 16711680L), Static446.method6893(Static295.method8180(aLongArrayArray1[4][local158 + 4], 4278190080L), Static446.method6893(Static295.method8180(aLongArrayArray1[3][local158 + 3], 1095216660480L), Static446.method6893(Static446.method6893(Static295.method8180(-72057594037927936L, aLongArrayArray1[0][local158]), Static295.method8180(aLongArrayArray1[1][local158 + 1], 71776119061217280L)), Static295.method8180(aLongArrayArray1[2][local158 + 2], 280375465082880L)))))));
		}
	}
}
