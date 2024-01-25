import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
	public static int anInt5630;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_74 = new Class212(63, 0);

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_90 = new Class21("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!ci;)I")
	public static int method4676(@OriginalArg(1) Class38 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1037(Static245.anInt4782)) {
			local5++;
		}
		if (arg0.method1037(Static391.anInt6799)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
	public static void method4677(@OriginalArg(0) int arg0) {
		if (Static445.anInt7575 == 0) {
			Static196.aClass4_Sub7_Sub2_6.method1425(arg0);
		} else {
			Static263.anInt5010 = arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	public static void method4679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(1, arg1);
		local8.method521();
		local8.anInt621 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIB)Lclient!uc;")
	public static Class11_Sub5_Sub2 method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(19) Class162 local19 = Static294.aClass162ArrayArrayArray2[arg1][arg0][arg2];
		if (local19 == null) {
			return null;
		}
		@Pc(25) Class11_Sub5_Sub2 local25 = null;
		@Pc(27) int local27 = -1;
		for (@Pc(30) Class199 local30 = local19.aClass199_1; local30 != null; local30 = local30.aClass199_2) {
			@Pc(34) Class11_Sub5 local34 = local30.aClass11_Sub5_1;
			if (local34 instanceof Class11_Sub5_Sub2) {
				@Pc(40) Class11_Sub5_Sub2 local40 = (Class11_Sub5_Sub2) local34;
				@Pc(50) int local50 = (local40.method5302() - 1) * 64 + 60;
				@Pc(58) int local58 = local40.anInt7514 - local50 >> 7;
				@Pc(66) int local66 = local40.anInt7515 - local50 >> 7;
				@Pc(73) int local73 = local40.anInt7514 + local50 >> 7;
				@Pc(80) int local80 = local40.anInt7515 + local50 >> 7;
				if (local58 <= arg0 && local66 <= arg2 && arg0 <= local73 && arg2 <= local80) {
					@Pc(109) int local109 = (local73 + 1 - arg0) * (local80 + 1 + -arg2);
					if (local109 > local27) {
						local27 = local109;
						local25 = local40;
					}
				}
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)V")
	public static void method4681(@OriginalArg(1) long arg0) {
		if (Static294.aClass162ArrayArrayArray2 != null) {
			if (Static275.anInt5173 == 1 || Static275.anInt5173 == 5) {
				Static17.method294(arg0);
			} else if (Static275.anInt5173 == 4) {
				Static462.method6244(arg0);
			}
		}
		Static447.method6112(Static30.aClass30_3, (long) Static277.anInt2834);
		if (Static248.anInt4793 != -1) {
			Static392.method5525(Static248.anInt4793);
		}
		for (@Pc(38) int local38 = 0; local38 < Static171.anInt3372; local38++) {
			if (Static353.aBooleanArray124[local38]) {
				Static237.aBooleanArray88[local38] = true;
			}
			Static122.aBooleanArray51[local38] = Static353.aBooleanArray124[local38];
			Static353.aBooleanArray124[local38] = false;
		}
		Static52.anInt1250 = Static277.anInt2834;
		if (Static30.aClass30_3.method2052()) {
			Static345.aBoolean455 = true;
		}
		if (Static248.anInt4793 != -1) {
			Static171.anInt3372 = 0;
			Static195.method4949();
		}
		Static30.aClass30_3.H();
		Static206.method3647(Static30.aClass30_3);
		@Pc(97) int local97 = Static107.method2120();
		if (local97 == -1) {
			local97 = Static457.anInt7815;
		}
		if (local97 == -1) {
			local97 = Static5.anInt66;
		}
		Static249.method4104(local97);
		Static296.method5573(Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514, Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100, Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515, Static75.anInt1854);
		Static75.anInt1854 = 0;
	}
}
