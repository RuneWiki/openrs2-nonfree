import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class6_Sub40 extends Class6 {

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "[J")
	public static final long[] aLongArray9 = new long[11];

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	public final int anInt8176;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	public final int anInt8178;

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
			@Pc(61) long local61 = local31 ^ local49;
			@Pc(65) long local65 = local49 << 1;
			if (local65 >= 256L) {
				local65 ^= 0x11DL;
			}
			@Pc(79) long local79 = local31 ^ local65;
			aLongArrayArray1[0][local8] = Static30.method996(local79, Static30.method996(local35 << 8, Static30.method996(Static30.method996(local65 << 24, Static30.method996(Static30.method996(Static30.method996(local31 << 56, local31 << 48), local49 << 40), local31 << 32)), local61 << 16)));
			for (@Pc(115) int local115 = 1; local115 < 8; local115++) {
				aLongArrayArray1[local115][local8] = Static30.method996(aLongArrayArray1[local115 - 1][local8] << 56, aLongArrayArray1[local115 - 1][local8] >>> 8);
			}
		}
		aLongArray9[0] = 0L;
		for (@Pc(156) int local156 = 1; local156 <= 10; local156++) {
			@Pc(163) int local163 = local156 * 8 - 8;
			aLongArray9[local156] = Static446.method5086(Static446.method5086(Static220.method3991(aLongArrayArray1[6][local163 + 6], 65280L), Static446.method5086(Static446.method5086(Static220.method3991(4278190080L, aLongArrayArray1[4][local163 + 4]), Static446.method5086(Static446.method5086(Static446.method5086(Static220.method3991(71776119061217280L, aLongArrayArray1[1][local163 + 1]), Static220.method3991(-72057594037927936L, aLongArrayArray1[0][local163])), Static220.method3991(aLongArrayArray1[2][local163 + 2], 280375465082880L)), Static220.method3991(1095216660480L, aLongArrayArray1[3][local163 + 3]))), Static220.method3991(aLongArrayArray1[5][local163 + 5], 16711680L))), Static220.method3991(255L, aLongArrayArray1[7][local163 + 7]));
		}
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(II)V")
	public Class6_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8176 = arg1;
		this.anInt8178 = arg0;
	}
}
