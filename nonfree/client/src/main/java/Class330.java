import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class330 {

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "[J")
	public static final long[] aLongArray16 = new long[11];

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "[[J")
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
			@Pc(59) long local59 = local31 ^ local47;
			@Pc(63) long local63 = local47 << 1;
			if (local63 >= 256L) {
				local63 ^= 0x11DL;
			}
			@Pc(75) long local75 = local63 ^ local31;
			aLongArrayArray1[0][local8] = Static451.method6871(Static451.method6871(Static451.method6871(local59 << 16, Static451.method6871(local63 << 24, Static451.method6871(Static451.method6871(local47 << 40, Static451.method6871(local31 << 48, local31 << 56)), local31 << 32))), local35 << 8), local75);
			for (@Pc(111) int local111 = 1; local111 < 8; local111++) {
				aLongArrayArray1[local111][local8] = Static451.method6871(aLongArrayArray1[local111 - 1][local8] << 56, aLongArrayArray1[local111 - 1][local8] >>> 8);
			}
		}
		aLongArray16[0] = 0L;
		for (@Pc(150) int local150 = 1; local150 <= 10; local150++) {
			@Pc(157) int local157 = (local150 - 1) * 8;
			aLongArray16[local150] = Static294.method7719(Static515.method6651(255L, aLongArrayArray1[7][local157 + 7]), Static294.method7719(Static515.method6651(aLongArrayArray1[6][local157 + 6], 65280L), Static294.method7719(Static515.method6651(16711680L, aLongArrayArray1[5][local157 + 5]), Static294.method7719(Static294.method7719(Static515.method6651(1095216660480L, aLongArrayArray1[3][local157 + 3]), Static294.method7719(Static515.method6651(280375465082880L, aLongArrayArray1[2][local157 + 2]), Static294.method7719(Static515.method6651(aLongArrayArray1[0][local157], -72057594037927936L), Static515.method6651(aLongArrayArray1[1][local157 + 1], 71776119061217280L)))), Static515.method6651(4278190080L, aLongArrayArray1[4][local157 + 4])))));
		}
	}
}
