import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bl", name = "ge", descriptor = "[Lclient!ig;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!bl", name = "ke", descriptor = "[Lclient!hu;")
	public static Class48_Sub2_Sub1_Sub1[] aClass48_Sub2_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!bl", name = "Id", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_12 = new Class231("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!bl", name = "ie", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_13 = new Class231("K", "T", "K", "K");

	@OriginalMember(owner = "client!bl", name = "je", descriptor = "J")
	public static volatile long aLong24 = 0L;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!vl;)Lclient!qq;")
	public static Class28 method676(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface11 arg2) {
		return new Class28_Sub2(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!od;ILclient!qq;ILclient!gf;I)Z")
	public static boolean method697(@OriginalArg(0) Class6_Sub24 arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(4) Class94 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray230 != null) {
			local9 = (arg0.anInt4798 + arg2.anInt2171 - Static36.anInt2242) * (Static36.anInt2249 - Static36.anInt2239) / (Static36.anInt2247 - Static36.anInt2242) + Static36.anInt2239;
			local7 = (arg0.anInt4798 + arg2.anInt2165 - Static36.anInt2242) * (Static36.anInt2249 - Static36.anInt2239) / (Static36.anInt2247 - Static36.anInt2242) + Static36.anInt2239;
			local13 = Static36.anInt2245 - (Static36.anInt2245 - Static36.anInt2244) * (-Static36.anInt2250 + arg2.anInt2173 + arg0.anInt4805) / (Static36.anInt2240 - Static36.anInt2250);
			local11 = Static36.anInt2245 - (Static36.anInt2245 - Static36.anInt2244) * (arg2.anInt2188 + (arg0.anInt4805 - Static36.anInt2250)) / (Static36.anInt2240 - Static36.anInt2250);
		}
		@Pc(103) Class12 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		if (arg2.anInt2183 != -1) {
			if (arg0.aBoolean340 && arg2.anInt2168 != -1) {
				local103 = arg2.method2001(arg1, true);
			} else {
				local103 = arg2.method2001(arg1, false);
			}
			if (local103 != null) {
				local105 = arg0.anInt4801 - (local103.method5654() + 1 >> 1);
				if (local105 < local7) {
					local7 = local105;
				}
				local107 = arg0.anInt4801 + (local103.method5654() + 1 >> 1);
				local109 = arg0.anInt4808 - (local103.method5655() + 1 >> 1);
				if (local107 > local9) {
					local9 = local107;
				}
				if (local109 < local11) {
					local11 = local109;
				}
				local111 = arg0.anInt4808 + (local103.method5655() + 1 >> 1);
				if (local13 < local111) {
					local13 = local111;
				}
			}
		}
		@Pc(214) Class152 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(278) int local278;
		@Pc(301) int local301;
		if (arg2.aString20 != null) {
			local214 = Static200.method3167(arg2.anInt2190);
			if (local214 != null) {
				local216 = Static358.aClass201_7.method4458(Static122.aStringArray19, null, arg2.aString20, null);
				local218 = arg0.anInt4808;
				if (local103 == null) {
					local218 -= local216 * local214.method3459() / 2;
				} else {
					local218 -= (local103.method5655() >> 1) + (local214.method3463() * local216);
				}
				for (local278 = 0; local278 < local216; local278++) {
					@Pc(284) String local284 = Static122.aStringArray19[local278];
					if (local278 < local216 - 1) {
						local284 = local284.substring(0, local284.length() - 4);
					}
					local301 = local214.method3461(local284);
					if (local220 < local301) {
						local220 = local301;
					}
				}
				local222 = arg0.anInt4801 - local220 / 2;
				local224 = arg0.anInt4801 + local220 / 2;
				if (local7 > local222) {
					local7 = local222;
				}
				if (local224 > local9) {
					local9 = local224;
				}
				local226 = local218;
				local228 = local218 + local216 * local214.method3463();
				if (local226 < local11) {
					local11 = local226;
				}
				if (local13 < local228) {
					local13 = local228;
				}
			}
		}
		if (Static36.anInt2239 > local9 || Static36.anInt2249 < local7 || Static36.anInt2244 > local13 || Static36.anInt2245 < local11) {
			return true;
		}
		@Pc(409) int local409;
		if (arg2.anIntArray230 != null) {
			@Pc(407) int[] local407 = new int[arg2.anIntArray230.length];
			for (local409 = 0; local409 < local407.length / 2; local409++) {
				local301 = arg2.anIntArray230[local409 * 2] + arg0.anInt4798;
				@Pc(433) int local433 = arg0.anInt4805 + arg2.anIntArray230[local409 * 2 + 1];
				local407[local409 * 2] = (Static36.anInt2249 - Static36.anInt2239) * (-Static36.anInt2242 + local301) / (Static36.anInt2247 - Static36.anInt2242) + Static36.anInt2239;
				local407[local409 * 2 + 1] = Static36.anInt2245 - (local433 - Static36.anInt2250) * (Static36.anInt2245 + -Static36.anInt2244) / (Static36.anInt2240 - Static36.anInt2250);
			}
			Static67.method1266(arg1, local407, arg2.anInt2174);
			for (local301 = 0; local301 < local407.length / 2 - 1; local301++) {
				arg1.method3523(local407[local301 * 2 + 1], local407[local301 * 2 + 2], local407[(local301 + 1) * 2 + 1], arg2.anInt2166, local407[local301 * 2]);
			}
			arg1.method3523(local407[local407.length - 1], local407[0], local407[1], arg2.anInt2166, local407[local407.length - 2]);
		}
		if (local103 != null) {
			if (Static71.anInt1487 > 0 && (Static26.anInt2329 != -1 && Static26.anInt2329 == arg0.anInt4802 || Static18.anInt316 != -1 && Static18.anInt316 == arg2.anInt2178)) {
				if (Static119.anInt2070 > 50) {
					local278 = 200 - Static119.anInt2070 * 2;
				} else {
					local278 = Static119.anInt2070 * 2;
				}
				local409 = local278 << 24 | 0xFFFF00;
				arg1.method3526(arg0.anInt4801, local103.method5672() / 2 + 7, local409, arg0.anInt4808);
				arg1.method3526(arg0.anInt4801, local103.method5672() / 2 + 5, local409, arg0.anInt4808);
				arg1.method3526(arg0.anInt4801, local103.method5672() / 2 + 3, local409, arg0.anInt4808);
				arg1.method3526(arg0.anInt4801, local103.method5672() / 2 + 1, local409, arg0.anInt4808);
				arg1.method3526(arg0.anInt4801, local103.method5672() / 2, local409, arg0.anInt4808);
			}
			local103.method5665(arg0.anInt4801 - (local103.method5654() >> 1), arg0.anInt4808 + -(local103.method5655() >> 1));
		}
		if (arg2.aString20 != null && local214 != null) {
			Static209.method3258(local218, arg0, local216, local220, arg1, local214, arg2);
		}
		if (arg2.anInt2183 != -1 || arg2.aString20 != null) {
			@Pc(720) Class6_Sub31 local720 = new Class6_Sub31(arg0);
			local720.anInt5888 = local105;
			local720.anInt5882 = local222;
			local720.anInt5885 = local226;
			local720.anInt5881 = local109;
			local720.anInt5889 = local224;
			local720.anInt5877 = local228;
			local720.anInt5878 = local111;
			local720.anInt5886 = local107;
			Static200.aClass88_31.method1878(local720);
		}
		return false;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!ro;)Ljava/lang/String;")
	public static String method703(@OriginalArg(1) Class6_Sub33 arg0) {
		return arg0.aString52 == null || arg0.aString52.length() <= 0 ? arg0.aString51 : arg0.aString51 + Static198.aClass231_59.method5138(Static382.anInt6289) + arg0.aString52;
	}
}
