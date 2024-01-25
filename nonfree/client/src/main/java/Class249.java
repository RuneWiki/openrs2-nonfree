import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class249 {

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "[J")
	public static final long[] aLongArray20 = new long[11];

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!oca", name = "h", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_28;

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "J")
	public final long aLong213;

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
			@Pc(58) long local58 = local28 ^ local44;
			@Pc(62) long local62 = local44 << 1;
			if (local62 >= 256L) {
				local62 ^= 0x11DL;
			}
			@Pc(76) long local76 = local28 ^ local62;
			aLongArrayArray1[0][local8] = Static447.method6555(Static447.method6555(local32 << 8, Static447.method6555(Static447.method6555(local62 << 24, Static447.method6555(local28 << 32, Static447.method6555(Static447.method6555(local28 << 48, local28 << 56), local44 << 40))), local58 << 16)), local76);
			for (@Pc(112) int local112 = 1; local112 < 8; local112++) {
				aLongArrayArray1[local112][local8] = Static447.method6555(aLongArrayArray1[local112 - 1][local8] << 56, aLongArrayArray1[local112 - 1][local8] >>> 8);
			}
		}
		aLongArray20[0] = 0L;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(158) int local158 = (local151 - 1) * 8;
			aLongArray20[local151] = Static154.method2815(Static25.method663(aLongArrayArray1[7][local158 + 7], 255L), Static154.method2815(Static25.method663(65280L, aLongArrayArray1[6][local158 + 6]), Static154.method2815(Static25.method663(aLongArrayArray1[5][local158 + 5], 16711680L), Static154.method2815(Static25.method663(aLongArrayArray1[4][local158 + 4], 4278190080L), Static154.method2815(Static25.method663(1095216660480L, aLongArrayArray1[3][local158 + 3]), Static154.method2815(Static25.method663(280375465082880L, aLongArrayArray1[2][local158 + 2]), Static154.method2815(Static25.method663(aLongArrayArray1[1][local158 + 1], 71776119061217280L), Static25.method663(-72057594037927936L, aLongArrayArray1[0][local158]))))))));
		}
	}

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!dia;J[Lclient!kd;)V")
	public Class249(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class184[] arg2) {
		this.aClass13_Sub2_28 = arg0;
		this.aLong213 = arg1;
	}

	@OriginalMember(owner = "client!oca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub2_28.method1994(this.aLong213);
		super.finalize();
	}
}
