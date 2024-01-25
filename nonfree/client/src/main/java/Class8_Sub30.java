import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!za")
public abstract class Class8_Sub30 extends Class8 {

	@OriginalMember(owner = "client!za", name = "j", descriptor = "[[J")
	public static final long[][] aLongArrayArray4 = new long[8][256];

	@OriginalMember(owner = "client!za", name = "k", descriptor = "[J")
	public static final long[] aLongArray19 = new long[11];

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
			@Pc(63) long local63 = local31 ^ local49;
			@Pc(67) long local67 = local49 << 1;
			if (local67 >= 256L) {
				local67 ^= 0x11DL;
			}
			@Pc(81) long local81 = local67 ^ local31;
			aLongArrayArray4[0][local8] = Static594.method8199(local81, Static594.method8199(Static594.method8199(Static594.method8199(local67 << 24, Static594.method8199(Static594.method8199(local49 << 40, Static594.method8199(local31 << 56, local31 << 48)), local31 << 32)), local63 << 16), local35 << 8));
			for (@Pc(117) int local117 = 1; local117 < 8; local117++) {
				aLongArrayArray4[local117][local8] = Static594.method8199(aLongArrayArray4[local117 - 1][local8] << 56, aLongArrayArray4[local117 - 1][local8] >>> 8);
			}
		}
		aLongArray19[0] = 0L;
		for (@Pc(156) int local156 = 1; local156 <= 10; local156++) {
			@Pc(163) int local163 = local156 * 8 - 8;
			aLongArray19[local156] = Static480.method7079(Static306.method5060(aLongArrayArray4[7][local163 + 7], 255L), Static480.method7079(Static480.method7079(Static480.method7079(Static306.method5060(4278190080L, aLongArrayArray4[4][local163 + 4]), Static480.method7079(Static306.method5060(1095216660480L, aLongArrayArray4[3][local163 + 3]), Static480.method7079(Static480.method7079(Static306.method5060(71776119061217280L, aLongArrayArray4[1][local163 + 1]), Static306.method5060(aLongArrayArray4[0][local163], -72057594037927936L)), Static306.method5060(aLongArrayArray4[2][local163 + 2], 280375465082880L)))), Static306.method5060(16711680L, aLongArrayArray4[5][local163 + 5])), Static306.method5060(65280L, aLongArrayArray4[6][local163 + 6])));
		}
	}

	@OriginalMember(owner = "client!za", name = "<init>", descriptor = "()V")
	protected Class8_Sub30() {
	}
}
