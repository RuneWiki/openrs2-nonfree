import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(B)[Lclient!an;")
	public static Class13[] method4907() {
		if (Static502.aClass13Array1 == null) {
			@Pc(5) Class13[] local5 = Static39.method1145(Static480.aClass326_3);
			@Pc(9) Class13[] local9 = new Class13[local5.length];
			@Pc(11) int local11 = 0;
			@Pc(16) int local16 = Static455.aClass3_Sub27_Sub1_1.method4058(Static275.anInt5823);
			@Pc(75) int local75;
			@Pc(80) Class13 local80;
			label70: for (@Pc(18) int local18 = 0; local18 < local5.length; local18++) {
				@Pc(23) Class13 local23 = local5[local18];
				if ((local23.anInt484 <= 0 || local23.anInt484 >= 24) && local23.anInt487 >= 800 && local23.anInt485 >= 600 && (local16 != 2 || local23.anInt487 <= 800 && local23.anInt485 <= 600) && (local16 != 1 || local23.anInt487 <= 1024 && local23.anInt485 <= 768)) {
					for (local75 = 0; local75 < local11; local75++) {
						local80 = local9[local75];
						if (local80.anInt487 == local23.anInt487 && local23.anInt485 == local80.anInt485) {
							if (local80.anInt484 < local23.anInt484) {
								local9[local75] = local23;
							}
							continue label70;
						}
					}
					local9[local11] = local23;
					local11++;
				}
			}
			Static502.aClass13Array1 = new Class13[local11];
			Static602.method4664(local9, 0, Static502.aClass13Array1, 0, local11);
			@Pc(135) int[] local135 = new int[Static502.aClass13Array1.length];
			for (local75 = 0; local75 < Static502.aClass13Array1.length; local75++) {
				local80 = Static502.aClass13Array1[local75];
				local135[local75] = local80.anInt485 * local80.anInt487;
			}
			Static236.method4121(local135, Static502.aClass13Array1);
		}
		return Static502.aClass13Array1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V")
	public static void method4908(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static87.aFloat149 > Static87.aFloat148) {
			Static87.aFloat148 = (float) ((double) Static87.aFloat148 + (double) Static87.aFloat148 / 30.0D);
			if (Static87.aFloat149 < Static87.aFloat148) {
				Static87.aFloat148 = Static87.aFloat149;
			}
			Static293.method4983();
			Static87.anInt6915 = (int) Static87.aFloat148 >> 1;
			Static87.aByteArrayArrayArray19 = Static550.method7234(Static87.anInt6915);
		} else if (Static87.aFloat148 > Static87.aFloat149) {
			Static87.aFloat148 = (float) ((double) Static87.aFloat148 - (double) Static87.aFloat148 / 30.0D);
			if (Static87.aFloat148 < Static87.aFloat149) {
				Static87.aFloat148 = Static87.aFloat149;
			}
			Static293.method4983();
			Static87.anInt6915 = (int) Static87.aFloat148 >> 1;
			Static87.aByteArrayArrayArray19 = Static550.method7234(Static87.anInt6915);
		}
		if (Static593.anInt10380 != -1 && Static423.anInt8217 != -1) {
			@Pc(80) int local80 = Static593.anInt10380 - Static185.anInt3726;
			if (local80 < 2 || local80 > 2) {
				local80 /= 8;
			}
			@Pc(97) int local97 = Static423.anInt8217 - Static18.anInt597;
			Static185.anInt3726 += local80;
			if (local97 < 2 || local97 > 2) {
				local97 /= 8;
			}
			Static18.anInt597 += local97;
			if (local80 == 0 && local97 == 0) {
				Static423.anInt8217 = -1;
				Static593.anInt10380 = -1;
			}
			Static293.method4983();
		}
		if (Static568.anInt10054 > 0) {
			Static338.anInt6970--;
			if (Static338.anInt6970 == 0) {
				Static568.anInt10054--;
				Static338.anInt6970 = 100;
			}
		} else {
			Static407.anInt8012 = -1;
			Static296.anInt6027 = -1;
		}
		if (!Static193.aBoolean188 || Static493.aClass183_55 == null) {
			return;
		}
		for (@Pc(163) Class3_Sub22 local163 = (Class3_Sub22) Static493.aClass183_55.method4795(); local163 != null; local163 = (Class3_Sub22) Static493.aClass183_55.method4793()) {
			@Pc(171) Class70 local171 = Static87.aClass10_4.method400(local163.aClass3_Sub32_1.anInt5918);
			if (local163.method3768(arg0, arg1)) {
				if (local171.aStringArray11 != null) {
					if (local171.aStringArray11[4] != null) {
						Static200.method3365(0, local171.aString29, (long) local163.aClass3_Sub32_1.anInt5918, local171.aStringArray11[4], 1007, -1, false, -1, local171.anInt2390, true);
					}
					if (local171.aStringArray11[3] != null) {
						Static200.method3365(0, local171.aString29, (long) local163.aClass3_Sub32_1.anInt5918, local171.aStringArray11[3], 1011, -1, false, -1, local171.anInt2390, true);
					}
					if (local171.aStringArray11[2] != null) {
						Static200.method3365(0, local171.aString29, (long) local163.aClass3_Sub32_1.anInt5918, local171.aStringArray11[2], 1012, -1, false, -1, local171.anInt2390, true);
					}
					if (local171.aStringArray11[1] != null) {
						Static200.method3365(0, local171.aString29, (long) local163.aClass3_Sub32_1.anInt5918, local171.aStringArray11[1], 1010, -1, false, -1, local171.anInt2390, true);
					}
					if (local171.aStringArray11[0] != null) {
						Static200.method3365(0, local171.aString29, (long) local163.aClass3_Sub32_1.anInt5918, local171.aStringArray11[0], 1008, -1, false, -1, local171.anInt2390, true);
					}
				}
				if (!local163.aClass3_Sub32_1.aBoolean509) {
					local163.aClass3_Sub32_1.aBoolean509 = true;
					Static597.method8431(Static55.aClass278_2, local163.aClass3_Sub32_1.anInt5918, local171.anInt2390);
				}
				if (local163.aClass3_Sub32_1.aBoolean509) {
					Static597.method8431(Static390.aClass278_11, local163.aClass3_Sub32_1.anInt5918, local171.anInt2390);
				}
			} else if (local163.aClass3_Sub32_1.aBoolean509) {
				local163.aClass3_Sub32_1.aBoolean509 = false;
				Static597.method8431(Static42.aClass278_1, local163.aClass3_Sub32_1.anInt5918, local171.anInt2390);
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[Ljava/lang/Object;II[I)V")
	public static void method4909(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg0 + arg2) / 2;
		@Pc(25) int local25 = arg0;
		@Pc(29) int local29 = arg3[local23];
		arg3[local23] = arg3[arg2];
		arg3[arg2] = local29;
		@Pc(43) Object local43 = arg1[local23];
		arg1[local23] = arg1[arg2];
		arg1[arg2] = local43;
		@Pc(62) int local62 = ~local29 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(64) int local64 = arg0; local64 < arg2; local64++) {
			if ((local62 & local64) + local29 > arg3[local64]) {
				@Pc(82) int local82 = arg3[local64];
				arg3[local64] = arg3[local25];
				arg3[local25] = local82;
				@Pc(96) Object local96 = arg1[local64];
				arg1[local64] = arg1[local25];
				arg1[local25++] = local96;
			}
		}
		arg3[arg2] = arg3[local25];
		arg3[local25] = local29;
		arg1[arg2] = arg1[local25];
		arg1[local25] = local43;
		method4909(arg0, arg1, local25 - 1, arg3);
		method4909(local25 + 1, arg1, arg2, arg3);
	}
}
