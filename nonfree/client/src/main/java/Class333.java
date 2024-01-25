import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class333 {

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "[J")
	public static final long[] aLongArray14 = new long[11];

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "[[J")
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
			@Pc(56) long local56 = local28 ^ local44;
			@Pc(60) long local60 = local44 << 1;
			if (local60 >= 256L) {
				local60 ^= 0x11DL;
			}
			@Pc(74) long local74 = local60 ^ local28;
			aLongArrayArray1[0][local8] = Static427.method6698(Static427.method6698(Static427.method6698(Static427.method6698(Static427.method6698(local28 << 32, Static427.method6698(local44 << 40, Static427.method6698(local28 << 56, local28 << 48))), local60 << 24), local56 << 16), local32 << 8), local74);
			for (@Pc(110) int local110 = 1; local110 < 8; local110++) {
				aLongArrayArray1[local110][local8] = Static427.method6698(aLongArrayArray1[local110 - 1][local8] << 56, aLongArrayArray1[local110 - 1][local8] >>> 8);
			}
		}
		aLongArray14[0] = 0L;
		for (@Pc(153) int local153 = 1; local153 <= 10; local153++) {
			@Pc(160) int local160 = (local153 - 1) * 8;
			aLongArray14[local153] = Static200.method3539(Static448.method6927(255L, aLongArrayArray1[7][local160 + 7]), Static200.method3539(Static200.method3539(Static200.method3539(Static200.method3539(Static200.method3539(Static200.method3539(Static448.method6927(-72057594037927936L, aLongArrayArray1[0][local160]), Static448.method6927(aLongArrayArray1[1][local160 + 1], 71776119061217280L)), Static448.method6927(aLongArrayArray1[2][local160 + 2], 280375465082880L)), Static448.method6927(aLongArrayArray1[3][local160 + 3], 1095216660480L)), Static448.method6927(aLongArrayArray1[4][local160 + 4], 4278190080L)), Static448.method6927(aLongArrayArray1[5][local160 + 5], 16711680L)), Static448.method6927(aLongArrayArray1[6][local160 + 6], 65280L)));
		}
	}
}
