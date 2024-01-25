import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public abstract class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "[[J")
	public static final long[][] aLongArrayArray2 = new long[8][256];

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "[J")
	public static final long[] aLongArray24 = new long[11];

	static {
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(21) char local21 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local14 / 2);
			@Pc(34) long local34 = (long) ((local14 & 0x1) == 0 ? local21 >>> 8 : local21 & 0xFF);
			@Pc(38) long local38 = local34 << 1;
			if (local38 >= 256L) {
				local38 ^= 0x11DL;
			}
			@Pc(50) long local50 = local38 << 1;
			if (local50 >= 256L) {
				local50 ^= 0x11DL;
			}
			@Pc(62) long local62 = local50 ^ local34;
			@Pc(66) long local66 = local50 << 1;
			if (local66 >= 256L) {
				local66 ^= 0x11DL;
			}
			@Pc(80) long local80 = local66 ^ local34;
			aLongArrayArray2[0][local14] = Static32.method425(Static32.method425(local38 << 8, Static32.method425(local62 << 16, Static32.method425(Static32.method425(Static32.method425(Static32.method425(local34 << 48, local34 << 56), local50 << 40), local34 << 32), local66 << 24))), local80);
			for (@Pc(116) int local116 = 1; local116 < 8; local116++) {
				aLongArrayArray2[local116][local14] = Static32.method425(aLongArrayArray2[local116 - 1][local14] << 56, aLongArrayArray2[local116 - 1][local14] >>> 8);
			}
		}
		aLongArray24[0] = 0L;
		for (@Pc(155) int local155 = 1; local155 <= 10; local155++) {
			@Pc(162) int local162 = (local155 - 1) * 8;
			aLongArray24[local155] = Static137.method2049(Static563.method7703(255L, aLongArrayArray2[7][local162 + 7]), Static137.method2049(Static137.method2049(Static563.method7703(aLongArrayArray2[5][local162 + 5], 16711680L), Static137.method2049(Static137.method2049(Static137.method2049(Static137.method2049(Static563.method7703(aLongArrayArray2[0][local162], -72057594037927936L), Static563.method7703(aLongArrayArray2[1][local162 + 1], 71776119061217280L)), Static563.method7703(280375465082880L, aLongArrayArray2[2][local162 + 2])), Static563.method7703(1095216660480L, aLongArrayArray2[3][local162 + 3])), Static563.method7703(4278190080L, aLongArrayArray2[4][local162 + 4]))), Static563.method7703(aLongArrayArray2[6][local162 + 6], 65280L)));
		}
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	protected Class11_Sub2() {
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)Lclient!bv;")
	public abstract Interface1 method8638();
}
