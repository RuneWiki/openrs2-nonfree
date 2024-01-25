import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class6_Sub4_Sub2 extends Class6_Sub4 implements Interface15 {

	@OriginalMember(owner = "client!lca", name = "x", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[16384];

	@OriginalMember(owner = "client!lca", name = "D", descriptor = "[F")
	public static final float[] aFloatArray38 = new float[16384];

	@OriginalMember(owner = "client!lca", name = "N", descriptor = "[J")
	public static final long[] aLongArray13;

	@OriginalMember(owner = "client!lca", name = "P", descriptor = "[[J")
	public static final long[][] aLongArrayArray1;

	@OriginalMember(owner = "client!lca", name = "F", descriptor = "Lclient!mf;")
	public Class6_Sub4 aClass6_Sub4_1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		@Pc(9) int local9;
		for (local9 = 0; local9 < 16384; local9++) {
			aFloatArray37[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray38[local9] = (float) Math.cos((double) local9 * local7);
		}
		aLongArray13 = new long[11];
		aLongArrayArray1 = new long[8][256];
		for (@Pc(41) int local41 = 0; local41 < 256; local41++) {
			@Pc(48) char local48 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local41 / 2);
			@Pc(64) long local64 = (long) ((local41 & 0x1) == 0 ? local48 >>> 8 : local48 & 0xFF);
			@Pc(68) long local68 = local64 << 1;
			if (local68 >= 256L) {
				local68 ^= 0x11DL;
			}
			@Pc(82) long local82 = local68 << 1;
			if (local82 >= 256L) {
				local82 ^= 0x11DL;
			}
			@Pc(96) long local96 = local82 ^ local64;
			@Pc(100) long local100 = local82 << 1;
			if (local100 >= 256L) {
				local100 ^= 0x11DL;
			}
			@Pc(112) long local112 = local64 ^ local100;
			aLongArrayArray1[0][local41] = Static474.method7051(local112, Static474.method7051(Static474.method7051(local96 << 16, Static474.method7051(local100 << 24, Static474.method7051(local64 << 32, Static474.method7051(local82 << 40, Static474.method7051(local64 << 48, local64 << 56))))), local68 << 8));
			for (@Pc(148) int local148 = 1; local148 < 8; local148++) {
				aLongArrayArray1[local148][local41] = Static474.method7051(aLongArrayArray1[local148 - 1][local41] >>> 8, aLongArrayArray1[local148 - 1][local41] << 56);
			}
		}
		aLongArray13[0] = 0L;
		for (@Pc(187) int local187 = 1; local187 <= 10; local187++) {
			local9 = (local187 - 1) * 8;
			aLongArray13[local187] = Static227.method4091(Static227.method4091(Static346.method5508(aLongArrayArray1[6][local9 + 6], 65280L), Static227.method4091(Static227.method4091(Static227.method4091(Static227.method4091(Static346.method5508(280375465082880L, aLongArrayArray1[2][local9 + 2]), Static227.method4091(Static346.method5508(aLongArrayArray1[1][local9 + 1], 71776119061217280L), Static346.method5508(-72057594037927936L, aLongArrayArray1[0][local9]))), Static346.method5508(1095216660480L, aLongArrayArray1[3][local9 + 3])), Static346.method5508(aLongArrayArray1[4][local9 + 4], 4278190080L)), Static346.method5508(aLongArrayArray1[5][local9 + 5], 16711680L))), Static346.method5508(aLongArrayArray1[7][local9 + 7], 255L));
		}
	}

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIIILclient!mf;)V")
	public Class6_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static547.method7808(arg1, arg0));
		this.aClass6_Sub4_1 = arg5;
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V")
	@Override
	public void method7760() {
	}

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "(I)I")
	@Override
	public int method7764() {
		return 0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7759(@OriginalArg(1) Class5 arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)I")
	@Override
	public int method7761() {
		return 0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7762(@OriginalArg(1) Class5 arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7757() {
		return false;
	}

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "(I)I")
	@Override
	public int method7720() {
		return 0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	@Override
	public Class2 method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)I")
	@Override
	public int method7758() {
		return 0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		return this.aClass6_Sub4_1.method7751(arg0);
	}
}
