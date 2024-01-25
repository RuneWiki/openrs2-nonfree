import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class4_Sub29_Sub2 extends Class4_Sub29 {

	@OriginalMember(owner = "client!nr", name = "x", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!nr", name = "H", descriptor = "[J")
	public static final long[] aLongArray9 = new long[11];

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(15) char local15 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(28) long local28 = (long) ((local8 & 0x1) == 0 ? local15 >>> 8 : local15 & 0xFF);
			@Pc(32) long local32 = local28 << 1;
			if (local32 >= 256L) {
				local32 ^= 0x11DL;
			}
			@Pc(46) long local46 = local32 << 1;
			if (local46 >= 256L) {
				local46 ^= 0x11DL;
			}
			@Pc(60) long local60 = local46 ^ local28;
			@Pc(64) long local64 = local46 << 1;
			if (local64 >= 256L) {
				local64 ^= 0x11DL;
			}
			@Pc(76) long local76 = local64 ^ local28;
			aLongArrayArray1[0][local8] = Static384.method4980(local76, Static384.method4980(Static384.method4980(local60 << 16, Static384.method4980(Static384.method4980(local28 << 32, Static384.method4980(Static384.method4980(local28 << 48, local28 << 56), local46 << 40)), local64 << 24)), local32 << 8));
			for (@Pc(112) int local112 = 1; local112 < 8; local112++) {
				aLongArrayArray1[local112][local8] = Static384.method4980(aLongArrayArray1[local112 - 1][local8] << 56, aLongArrayArray1[local112 - 1][local8] >>> 8);
			}
		}
		aLongArray9[0] = 0L;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(158) int local158 = local151 * 8 - 8;
			aLongArray9[local151] = Static484.method6621(Static484.method6621(Static64.method1424(65280L, aLongArrayArray1[6][local158 + 6]), Static484.method6621(Static484.method6621(Static484.method6621(Static64.method1424(aLongArrayArray1[3][local158 + 3], 1095216660480L), Static484.method6621(Static64.method1424(aLongArrayArray1[2][local158 + 2], 280375465082880L), Static484.method6621(Static64.method1424(aLongArrayArray1[1][local158 + 1], 71776119061217280L), Static64.method1424(-72057594037927936L, aLongArrayArray1[0][local158])))), Static64.method1424(4278190080L, aLongArrayArray1[4][local158 + 4])), Static64.method1424(16711680L, aLongArrayArray1[5][local158 + 5]))), Static64.method1424(aLongArrayArray1[7][local158 + 7], 255L));
		}
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub29_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BIII)V")
	@Override
	public void method7629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt8924 = arg1;
		super.anInt8928 = arg2;
		super.anInt8935 = arg0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IF)V")
	@Override
	public void method7625(@OriginalArg(1) float arg0) {
		super.aFloat204 = arg0;
	}
}
