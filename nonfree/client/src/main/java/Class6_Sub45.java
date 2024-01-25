import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class6_Sub45 extends Class6 {

	@OriginalMember(owner = "client!se", name = "q", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!se", name = "s", descriptor = "[J")
	public static final long[] aLongArray19 = new long[11];

	@OriginalMember(owner = "client!se", name = "v", descriptor = "[F")
	public static final float[] aFloatArray68;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "[F")
	public static final float[] aFloatArray69;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "J")
	public long aLong208;

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
			@Pc(59) long local59 = local47 ^ local31;
			@Pc(63) long local63 = local47 << 1;
			if (local63 >= 256L) {
				local63 ^= 0x11DL;
			}
			@Pc(75) long local75 = local31 ^ local63;
			aLongArrayArray1[0][local8] = Static369.method5434(Static369.method5434(Static369.method5434(local59 << 16, Static369.method5434(local63 << 24, Static369.method5434(local31 << 32, Static369.method5434(local47 << 40, Static369.method5434(local31 << 48, local31 << 56))))), local35 << 8), local75);
			for (@Pc(111) int local111 = 1; local111 < 8; local111++) {
				aLongArrayArray1[local111][local8] = Static369.method5434(aLongArrayArray1[local111 - 1][local8] >>> 8, aLongArrayArray1[local111 - 1][local8] << 56);
			}
		}
		aLongArray19[0] = 0L;
		@Pc(157) int local157;
		for (@Pc(150) int local150 = 1; local150 <= 10; local150++) {
			local157 = local150 * 8 - 8;
			aLongArray19[local150] = Static507.method6973(Static507.method6973(Static507.method6973(Static513.method6921(16711680L, aLongArrayArray1[5][local157 + 5]), Static507.method6973(Static513.method6921(aLongArrayArray1[4][local157 + 4], 4278190080L), Static507.method6973(Static507.method6973(Static507.method6973(Static513.method6921(71776119061217280L, aLongArrayArray1[1][local157 + 1]), Static513.method6921(aLongArrayArray1[0][local157], -72057594037927936L)), Static513.method6921(280375465082880L, aLongArrayArray1[2][local157 + 2])), Static513.method6921(aLongArrayArray1[3][local157 + 3], 1095216660480L)))), Static513.method6921(65280L, aLongArrayArray1[6][local157 + 6])), Static513.method6921(255L, aLongArrayArray1[7][local157 + 7]));
		}
		aFloatArray68 = new float[16384];
		aFloatArray69 = new float[16384];
		@Pc(249) double local249 = 3.834951969714103E-4D;
		for (local157 = 0; local157 < 16384; local157++) {
			aFloatArray69[local157] = (float) Math.sin((double) local157 * local249);
			aFloatArray68[local157] = (float) Math.cos(local249 * (double) local157);
		}
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	private Class6_Sub45() {
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(J)V")
	public Class6_Sub45(@OriginalArg(0) long arg0) {
		this.aLong208 = arg0;
	}
}
