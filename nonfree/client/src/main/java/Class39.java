import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class39 {

	@OriginalMember(owner = "client!c", name = "h", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[J")
	public static final long[] aLongArray2 = new long[11];

	static {
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) char local34 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local27 / 2);
			@Pc(50) long local50 = (long) ((local27 & 0x1) == 0 ? local34 >>> 8 : local34 & 0xFF);
			@Pc(54) long local54 = local50 << 1;
			if (local54 >= 256L) {
				local54 ^= 0x11DL;
			}
			@Pc(66) long local66 = local54 << 1;
			if (local66 >= 256L) {
				local66 ^= 0x11DL;
			}
			@Pc(80) long local80 = local66 ^ local50;
			@Pc(84) long local84 = local66 << 1;
			if (local84 >= 256L) {
				local84 ^= 0x11DL;
			}
			@Pc(98) long local98 = local50 ^ local84;
			aLongArrayArray1[0][local27] = Static19.method600(local98, Static19.method600(Static19.method600(local80 << 16, Static19.method600(local84 << 24, Static19.method600(Static19.method600(local66 << 40, Static19.method600(local50 << 48, local50 << 56)), local50 << 32))), local54 << 8));
			for (@Pc(134) int local134 = 1; local134 < 8; local134++) {
				aLongArrayArray1[local134][local27] = Static19.method600(aLongArrayArray1[local134 - 1][local27] << 56, aLongArrayArray1[local134 - 1][local27] >>> 8);
			}
		}
		aLongArray2[0] = 0L;
		for (@Pc(175) int local175 = 1; local175 <= 10; local175++) {
			@Pc(182) int local182 = local175 * 8 - 8;
			aLongArray2[local175] = Static121.method2598(Static72.method2066(aLongArrayArray1[7][local182 + 7], 255L), Static121.method2598(Static121.method2598(Static121.method2598(Static72.method2066(aLongArrayArray1[4][local182 + 4], 4278190080L), Static121.method2598(Static72.method2066(aLongArrayArray1[3][local182 + 3], 1095216660480L), Static121.method2598(Static121.method2598(Static72.method2066(71776119061217280L, aLongArrayArray1[1][local182 + 1]), Static72.method2066(aLongArrayArray1[0][local182], -72057594037927936L)), Static72.method2066(aLongArrayArray1[2][local182 + 2], 280375465082880L)))), Static72.method2066(aLongArrayArray1[5][local182 + 5], 16711680L)), Static72.method2066(aLongArrayArray1[6][local182 + 6], 65280L)));
		}
	}
}
