import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
	public static int anInt2346;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_63 = new Class12(16, 6);

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
	public static int anInt2345 = -1;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_64 = new Class12(5, 6);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!za;II)V")
	public static void method2018(@OriginalArg(1) Class34 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static383.aClass34_11 = arg0;
		Static383.aClass109ArrayArray1 = new Class109[arg2][arg1];
		if (Static137.anIntArray163 != null) {
			Static322.aClass3_2 = Static86.method1409(Static137.anIntArray163[2], Static137.anIntArray163[1], Static137.anIntArray163[4], Static137.anIntArray163[0], Static137.anIntArray163[5], Static137.anIntArray163[3]);
		}
		Static136.aClass109_3 = new Class109();
		Static156.method2287();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)Lclient!wk;")
	public static Class25_Sub5_Sub1 method2020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class169 local11 = Static359.aClass169ArrayArrayArray5[arg0][arg2][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class25_Sub5_Sub1 local17 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class27 local27 = local11.aClass27_3; local27 != null; local27 = local27.aClass27_1) {
			@Pc(31) Class25_Sub5 local31 = local27.aClass25_Sub5_1;
			if (local31 instanceof Class25_Sub5_Sub1) {
				@Pc(37) Class25_Sub5_Sub1 local37 = (Class25_Sub5_Sub1) local31;
				@Pc(47) int local47 = (local37.method3427() - 1) * 64 + 60;
				@Pc(55) int local55 = local37.anInt5518 - local47 >> 7;
				@Pc(62) int local62 = local37.anInt5514 - local47 >> 7;
				@Pc(70) int local70 = local37.anInt5518 + local47 >> 7;
				@Pc(77) int local77 = local47 + local37.anInt5514 >> 7;
				if (local55 <= arg2 && arg1 >= local62 && local70 >= arg2 && local77 >= arg1) {
					@Pc(111) int local111 = (local70 + 1 - arg2) * (local77 + 1 + -arg1);
					if (local111 > local24) {
						local17 = local37;
						local24 = local111;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public static void method2021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class252 local3 = new Class252();
		local3.anInt7244 = arg1 >> Static215.anInt4460;
		local3.anInt7225 = arg2 >> Static215.anInt4460;
		local3.anInt7224 = arg3 >> Static215.anInt4460;
		local3.anInt7242 = arg4 >> Static215.anInt4460;
		local3.anInt7230 = arg0;
		local3.anInt7228 = arg1;
		local3.anInt7241 = arg2;
		local3.anInt7237 = arg3;
		local3.anInt7236 = arg4;
		local3.anInt7231 = arg5;
		local3.anInt7240 = arg6;
		Static78.aClass252Array5[Static278.anInt4935++] = local3;
	}
}
