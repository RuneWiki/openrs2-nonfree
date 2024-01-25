import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class5_Sub52 extends Class5 {

	@OriginalMember(owner = "client!uga", name = "q", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!uga", name = "m", descriptor = "[J")
	public static final long[] aLongArray15 = new long[11];

	@OriginalMember(owner = "client!uga", name = "p", descriptor = "I")
	public final int anInt9563;

	@OriginalMember(owner = "client!uga", name = "o", descriptor = "I")
	public final int anInt9562;

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
			aLongArrayArray1[0][local8] = Static139.method2025(local81, Static139.method2025(Static139.method2025(Static139.method2025(local67 << 24, Static139.method2025(Static139.method2025(Static139.method2025(local31 << 56, local31 << 48), local49 << 40), local31 << 32)), local63 << 16), local35 << 8));
			for (@Pc(117) int local117 = 1; local117 < 8; local117++) {
				aLongArrayArray1[local117][local8] = Static139.method2025(aLongArrayArray1[local117 - 1][local8] << 56, aLongArrayArray1[local117 - 1][local8] >>> 8);
			}
		}
		aLongArray15[0] = 0L;
		for (@Pc(158) int local158 = 1; local158 <= 10; local158++) {
			@Pc(165) int local165 = (local158 - 1) * 8;
			aLongArray15[local158] = Static63.method1049(Static63.method1049(Static63.method1049(Static63.method1049(Static482.method7144(4278190080L, aLongArrayArray1[4][local165 + 4]), Static63.method1049(Static63.method1049(Static482.method7144(aLongArrayArray1[2][local165 + 2], 280375465082880L), Static63.method1049(Static482.method7144(71776119061217280L, aLongArrayArray1[1][local165 + 1]), Static482.method7144(-72057594037927936L, aLongArrayArray1[0][local165]))), Static482.method7144(aLongArrayArray1[3][local165 + 3], 1095216660480L))), Static482.method7144(16711680L, aLongArrayArray1[5][local165 + 5])), Static482.method7144(aLongArrayArray1[6][local165 + 6], 65280L)), Static482.method7144(255L, aLongArrayArray1[7][local165 + 7]));
		}
	}

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(II)V")
	public Class5_Sub52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9563 = arg0;
		this.anInt9562 = arg1;
	}
}
