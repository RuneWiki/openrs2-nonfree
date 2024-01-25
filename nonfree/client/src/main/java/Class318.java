import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class318 {

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "[J")
	public static final long[] aLongArray15 = new long[11];

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString93;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString95;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString94;

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
			@Pc(79) long local79 = local31 ^ local67;
			aLongArrayArray1[0][local8] = Static508.method7072(Static508.method7072(local35 << 8, Static508.method7072(Static508.method7072(Static508.method7072(Static508.method7072(Static508.method7072(local31 << 48, local31 << 56), local49 << 40), local31 << 32), local67 << 24), local63 << 16)), local79);
			for (@Pc(115) int local115 = 1; local115 < 8; local115++) {
				aLongArrayArray1[local115][local8] = Static508.method7072(aLongArrayArray1[local115 - 1][local8] >>> 8, aLongArrayArray1[local115 - 1][local8] << 56);
			}
		}
		aLongArray15[0] = 0L;
		for (@Pc(154) int local154 = 1; local154 <= 10; local154++) {
			@Pc(161) int local161 = (local154 - 1) * 8;
			aLongArray15[local154] = Static28.method885(Static423.method6099(aLongArrayArray1[7][local161 + 7], 255L), Static28.method885(Static28.method885(Static423.method6099(aLongArrayArray1[5][local161 + 5], 16711680L), Static28.method885(Static423.method6099(aLongArrayArray1[4][local161 + 4], 4278190080L), Static28.method885(Static423.method6099(aLongArrayArray1[3][local161 + 3], 1095216660480L), Static28.method885(Static28.method885(Static423.method6099(aLongArrayArray1[1][local161 + 1], 71776119061217280L), Static423.method6099(-72057594037927936L, aLongArrayArray1[0][local161])), Static423.method6099(aLongArrayArray1[2][local161 + 2], 280375465082880L))))), Static423.method6099(65280L, aLongArrayArray1[6][local161 + 6])));
		}
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class318(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString93 = arg1;
		this.aString95 = arg0;
		this.aString94 = arg2;
	}
}
