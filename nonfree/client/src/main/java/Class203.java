import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class203 {

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "[J")
	public static final long[] aLongArray10 = new long[11];

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "Ljava/lang/String;")
	public String aString130;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
	public int anInt6041;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(15) char local15 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(31) long local31 = (long) ((local8 & 0x1) == 0 ? local15 >>> 8 : local15 & 0xFF);
			@Pc(35) long local35 = local31 << 1;
			if (local35 >= 256L) {
				local35 ^= 0x11DL;
			}
			@Pc(49) long local49 = local35 << 1;
			if (local49 >= 256L) {
				local49 ^= 0x11DL;
			}
			@Pc(63) long local63 = local49 ^ local31;
			@Pc(67) long local67 = local49 << 1;
			if (local67 >= 256L) {
				local67 ^= 0x11DL;
			}
			@Pc(81) long local81 = local67 ^ local31;
			aLongArrayArray1[0][local8] = Static176.method2957(Static176.method2957(Static176.method2957(Static176.method2957(Static176.method2957(Static176.method2957(Static176.method2957(local31 << 48, local31 << 56), local49 << 40), local31 << 32), local67 << 24), local63 << 16), local35 << 8), local81);
			for (@Pc(117) int local117 = 1; local117 < 8; local117++) {
				aLongArrayArray1[local117][local8] = Static176.method2957(aLongArrayArray1[local117 - 1][local8] >>> 8, aLongArrayArray1[local117 - 1][local8] << 56);
			}
		}
		aLongArray10[0] = 0L;
		for (@Pc(160) int local160 = 1; local160 <= 10; local160++) {
			@Pc(167) int local167 = (local160 - 1) * 8;
			aLongArray10[local160] = Static483.method7198(Static483.method7198(Static397.method6345(aLongArrayArray1[6][local167 + 6], 65280L), Static483.method7198(Static397.method6345(aLongArrayArray1[5][local167 + 5], 16711680L), Static483.method7198(Static483.method7198(Static397.method6345(aLongArrayArray1[3][local167 + 3], 1095216660480L), Static483.method7198(Static483.method7198(Static397.method6345(-72057594037927936L, aLongArrayArray1[0][local167]), Static397.method6345(71776119061217280L, aLongArrayArray1[1][local167 + 1])), Static397.method6345(280375465082880L, aLongArrayArray1[2][local167 + 2]))), Static397.method6345(4278190080L, aLongArrayArray1[4][local167 + 4])))), Static397.method6345(aLongArrayArray1[7][local167 + 7], 255L));
		}
	}
}
