import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "Lclient!ds;")
	public static Class88 aClass88_2;

	@OriginalMember(owner = "client!wca", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject19;

	@OriginalMember(owner = "client!wca", name = "o", descriptor = "[Lclient!paa;")
	public static Class273[] aClass273Array1;

	@OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
	public static int anInt10081;

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
	public static int anInt10079 = 100;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 < 0 || arg6 < 0 || Static251.anInt4680 - 1 <= arg0 || Static406.anInt6924 - 1 <= arg6) {
			return;
		}
		if (Static332.aClass247ArrayArrayArray1 == null) {
			return;
		}
		@Pc(45) Interface2 local45;
		if (arg2 != 0) {
			if (arg2 == 1) {
				local45 = (Interface2) Static244.method3912(arg1, arg0, arg6);
				if (local45 != null) {
					if (local45 instanceof Class23_Sub2_Sub2_Sub1) {
						((Class23_Sub2_Sub2_Sub1) local45).aClass381_1.method8540(arg5);
						return;
					}
					@Pc(61) int local61 = local45.method7823();
					if (arg4 != 4 && arg4 != 5) {
						if (arg4 != 6) {
							if (arg4 == 7) {
								Static551.method7574(4, (arg3 + 2 & 0x3) + 4, arg2, arg0, arg1, arg6, arg5, local61);
							} else if (arg4 == 8) {
								Static551.method7574(4, arg3 + 4, arg2, arg0, arg1, arg6, arg5, local61);
								Static551.method7574(4, (arg3 + 2 & 0x3) + 4, arg2, arg0, arg1, arg6, arg5, local61);
								return;
							}
							return;
						}
						Static551.method7574(4, arg3 + 4, arg2, arg0, arg1, arg6, arg5, local61);
						return;
					}
					Static551.method7574(4, arg3, arg2, arg0, arg1, arg6, arg5, local61);
					return;
				}
				return;
			}
			if (arg2 == 2) {
				local45 = (Interface2) Static344.method5203(arg1, arg0, arg6, bea.class);
				if (local45 != null) {
					if (arg4 == 11) {
						arg4 = 10;
					}
					if (local45 instanceof Class23_Sub2_Sub1_Sub4) {
						((Class23_Sub2_Sub1_Sub4) local45).aClass381_2.method8540(arg5);
						return;
					}
					Static551.method7574(arg4, arg3, arg2, arg0, arg1, arg6, arg5, local45.method7823());
					return;
				}
				return;
			}
			if (arg2 == 3) {
				local45 = (Interface2) Static306.method4709(arg1, arg0, arg6);
				if (local45 != null) {
					if (!(local45 instanceof Class23_Sub2_Sub3_Sub2)) {
						Static551.method7574(arg4, arg3, arg2, arg0, arg1, arg6, arg5, local45.method7823());
						return;
					}
					((Class23_Sub2_Sub3_Sub2) local45).aClass381_4.method8540(arg5);
					return;
				}
			}
			return;
		}
		local45 = (Interface2) Static363.method5416(arg1, arg0, arg6);
		@Pc(245) Interface2 local245 = (Interface2) Static474.method6820(arg1, arg0, arg6);
		if (local45 != null && arg4 != 2) {
			if (local45 instanceof Class23_Sub2_Sub5_Sub1) {
				((Class23_Sub2_Sub5_Sub1) local45).aClass381_3.method8540(arg5);
			} else {
				Static551.method7574(arg4, arg3, arg2, arg0, arg1, arg6, arg5, local45.method7823());
			}
		}
		if (local245 == null) {
			return;
		}
		if (!(local245 instanceof Class23_Sub2_Sub5_Sub1)) {
			Static551.method7574(arg4, arg3, arg2, arg0, arg1, arg6, arg5, local245.method7823());
			return;
		}
		((Class23_Sub2_Sub5_Sub1) local245).aClass381_3.method8540(arg5);
		return;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ct;[[BB)V")
	public static void method8569(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(43) int local43;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt1959; local14++) {
			Static312.method4827();
			for (local20 = 0; local20 < Static251.anInt4680 >> 3; local20++) {
				for (local24 = 0; local24 < Static406.anInt6924 >> 3; local24++) {
					local34 = Static104.anIntArrayArrayArray3[local14][local20][local24];
					if (local34 != -1) {
						local43 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean179 || local43 == 0) {
							@Pc(57) int local57 = local34 >> 1 & 0x3;
							@Pc(63) int local63 = local34 >> 14 & 0x3FF;
							@Pc(69) int local69 = local34 >> 3 & 0x7FF;
							@Pc(79) int local79 = local69 / 8 + (local63 / 8 << 8);
							for (@Pc(81) int local81 = 0; local81 < Static442.anIntArray464.length; local81++) {
								if (local79 == Static442.anIntArray464[local81] && arg1[local81] != null) {
									@Pc(99) Class3_Sub17 local99 = new Class3_Sub17(arg1[local81]);
									arg0.method1827(Static27.aClass198Array1, local20 * 8, local24 * 8, local69, local14, local43, local63, local99, local57);
									arg0.method1837(local43, local57, local63, local12[0] == -1 ? local12 : null, local69, local99, Static582.aClass16_12, local20 * 8, local14, local24 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg0.anInt1959; local20++) {
			Static312.method4827();
			for (local24 = 0; local24 < Static251.anInt4680 >> 3; local24++) {
				for (local34 = 0; local34 < Static406.anInt6924 >> 3; local34++) {
					local43 = Static104.anIntArrayArrayArray3[local20][local24][local34];
					if (local43 == -1) {
						arg0.method1819(local20, 8, local34 * 8, 8, local24 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static578.aClass10_1 = Static377.aClass222_1.method5125(Static357.aClass322_4, local12[2], local12[1], local12[0], local12[3]);
			Static112.anInt2272 = local12[4];
		}
	}
}
