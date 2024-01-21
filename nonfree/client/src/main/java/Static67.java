import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!ae;")
	public static Interface1 anInterface1_6;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_31 = new Class85(64);

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1535 = Static193.method3027("Lade Sprites )2 ");

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1536 = Static193.method3027("Loading fonts )2 ");

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1537 = Static193.method3027("title_mute");

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1538 = aClass70_1536;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static208.anIntArrayArrayArray10[arg0][local16][local20] == -Static90.anInt1778) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static210.anIntArrayArrayArray12[arg0][arg1][arg3] + arg5;
			if (!Static116.method2444(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static116.method2444(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static116.method2444(local20, local156, local182)) {
				return false;
			} else if (Static116.method2444(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static137.method1962(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static116.method2444(local16 + 1, Static210.anIntArrayArrayArray12[arg0][arg1][arg3] + arg5, local20 + 1) && Static116.method2444(local16 + 128 - 1, Static210.anIntArrayArrayArray12[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static116.method2444(local16 + 128 - 1, Static210.anIntArrayArrayArray12[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static116.method2444(local16 + 1, Static210.anIntArrayArrayArray12[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method2289() {
		Static48.aClass3_Sub4_Sub1_43.method1302();
		@Pc(13) int local13 = Static48.aClass3_Sub4_Sub1_43.method1299(8);
		@Pc(22) int local22;
		if (Static201.anInt4110 > local13) {
			for (local22 = local13; local22 < Static201.anInt4110; local22++) {
				Static160.anIntArray244[Static54.anInt1164++] = Static80.anIntArray85[local22];
			}
		}
		if (Static201.anInt4110 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static201.anInt4110 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static80.anIntArray85[local22];
			@Pc(64) Class26_Sub2_Sub2 local64 = Static8.aClass26_Sub2_Sub2Array1[local60];
			@Pc(69) int local69 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
			if (local69 == 0) {
				Static80.anIntArray85[Static201.anInt4110++] = local60;
				local64.anInt2645 = Static184.anInt3760;
			} else {
				@Pc(92) int local92 = Static48.aClass3_Sub4_Sub1_43.method1299(2);
				if (local92 == 0) {
					Static80.anIntArray85[Static201.anInt4110++] = local60;
					local64.anInt2645 = Static184.anInt3760;
					Static108.anIntArray130[Static134.anInt2682++] = local60;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local92 == 1) {
						Static80.anIntArray85[Static201.anInt4110++] = local60;
						local64.anInt2645 = Static184.anInt3760;
						local134 = Static48.aClass3_Sub4_Sub1_43.method1299(3);
						local64.method1854(false, local134);
						local144 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
						if (local144 == 1) {
							Static108.anIntArray130[Static134.anInt2682++] = local60;
						}
					} else if (local92 == 2) {
						Static80.anIntArray85[Static201.anInt4110++] = local60;
						local64.anInt2645 = Static184.anInt3760;
						local134 = Static48.aClass3_Sub4_Sub1_43.method1299(3);
						local64.method1854(true, local134);
						local144 = Static48.aClass3_Sub4_Sub1_43.method1299(3);
						local64.method1854(true, local144);
						@Pc(198) int local198 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
						if (local198 == 1) {
							Static108.anIntArray130[Static134.anInt2682++] = local60;
						}
					} else if (local92 == 3) {
						Static160.anIntArray244[Static54.anInt1164++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([BB)[B")
	public static byte[] method2290(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static218.method2016(arg0, 0, local9, 0, local6);
		return local9;
	}
}
