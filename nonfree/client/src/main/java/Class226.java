import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class226 {

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "[J")
	public static final long[] aLongArray12 = new long[11];

	static {
		for (@Pc(30) int local30 = 0; local30 < 256; local30++) {
			@Pc(37) char local37 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local30 / 2);
			@Pc(50) long local50 = (long) ((local30 & 0x1) == 0 ? local37 >>> 8 : local37 & 0xFF);
			@Pc(54) long local54 = local50 << 1;
			if (local54 >= 256L) {
				local54 ^= 0x11DL;
			}
			@Pc(66) long local66 = local54 << 1;
			if (local66 >= 256L) {
				local66 ^= 0x11DL;
			}
			@Pc(78) long local78 = local66 ^ local50;
			@Pc(82) long local82 = local66 << 1;
			if (local82 >= 256L) {
				local82 ^= 0x11DL;
			}
			@Pc(96) long local96 = local82 ^ local50;
			aLongArrayArray1[0][local30] = Static543.method7442(Static543.method7442(local54 << 8, Static543.method7442(Static543.method7442(Static543.method7442(Static543.method7442(Static543.method7442(local50 << 48, local50 << 56), local66 << 40), local50 << 32), local82 << 24), local78 << 16)), local96);
			for (@Pc(132) int local132 = 1; local132 < 8; local132++) {
				aLongArrayArray1[local132][local30] = Static543.method7442(aLongArrayArray1[local132 - 1][local30] >>> 8, aLongArrayArray1[local132 - 1][local30] << 56);
			}
		}
		aLongArray12[0] = 0L;
		for (@Pc(171) int local171 = 1; local171 <= 10; local171++) {
			@Pc(178) int local178 = local171 * 8 - 8;
			aLongArray12[local171] = Static531.method7277(Static531.method7277(Static531.method7277(Static191.method3354(aLongArrayArray1[5][local178 + 5], 16711680L), Static531.method7277(Static191.method3354(4278190080L, aLongArrayArray1[4][local178 + 4]), Static531.method7277(Static191.method3354(1095216660480L, aLongArrayArray1[3][local178 + 3]), Static531.method7277(Static531.method7277(Static191.method3354(71776119061217280L, aLongArrayArray1[1][local178 + 1]), Static191.method3354(aLongArrayArray1[0][local178], -72057594037927936L)), Static191.method3354(280375465082880L, aLongArrayArray1[2][local178 + 2]))))), Static191.method3354(65280L, aLongArrayArray1[6][local178 + 6])), Static191.method3354(aLongArrayArray1[7][local178 + 7], 255L));
		}
	}
}
