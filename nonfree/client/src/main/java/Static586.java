import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "Lclient!q;")
	public static Class34 aClass34_6;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "Lclient!gea;")
	public static final Class114 aClass114_1 = new Class114();

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "[I")
	public static final int[] anIntArray616 = new int[25];

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_110 = new Class208(50, 3);

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray40 = new boolean[5];

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIII)V")
	public static void method7841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(37) int local37 = local21 + local13 * (1 - local29);
		@Pc(51) int local51 = local17 - local25 * (local29 - 1);
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = ((arg2 << 1) - 3) * local25;
		@Pc(81) int local81 = local59;
		@Pc(104) int local104;
		@Pc(112) int local112;
		if (arg4 >= Static120.anInt2491 && arg4 <= Static71.anInt1350) {
			local104 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg0 + arg1);
			local112 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg0 - arg1);
			Static329.method4871(local112, local104, Static280.anIntArrayArray25[arg4], arg3);
		}
		@Pc(126) int local126 = (arg2 - 1) * local55;
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local51 += local81;
					local37 += local67;
					local67 += local59;
					local81 += local59;
					local7++;
				}
			}
			if (local51 < 0) {
				local37 += local67;
				local51 += local81;
				local67 += local59;
				local81 += local59;
				local7++;
			}
			local37 += -local126;
			local51 += -local75;
			local9--;
			local75 -= local55;
			local126 -= local55;
			local104 = arg4 - local9;
			local112 = arg4 + local9;
			if (local112 >= Static120.anInt2491 && local104 <= Static71.anInt1350) {
				@Pc(223) int local223 = Static57.method966(Static194.anInt3788, Static330.anInt6025, local7 + arg0);
				@Pc(232) int local232 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg0 - local7);
				if (Static120.anInt2491 <= local104) {
					Static329.method4871(local232, local223, Static280.anIntArrayArray25[local104], arg3);
				}
				if (local112 <= Static71.anInt1350) {
					Static329.method4871(local232, local223, Static280.anIntArrayArray25[local112], arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)Lclient!bca;")
	public static Class11_Sub2 method7842(@OriginalArg(1) int arg0) {
		@Pc(21) Class196[] local21 = Class1_Sub1_Sub34.aClass196Array1;
		synchronized (Class1_Sub1_Sub34.aClass196Array1) {
			@Pc(41) Class11_Sub2 local41;
			if (Class1_Sub1_Sub34.aClass196Array1.length <= arg0 || Class1_Sub1_Sub34.aClass196Array1[arg0].method4030()) {
				local41 = new Class11_Sub2();
				local41.aClass11_Sub4Array1 = new Class11_Sub4[arg0];
				for (@Pc(47) int local47 = 0; local47 < arg0; local47++) {
					local41.aClass11_Sub4Array1[local47] = new Class11_Sub4();
				}
			} else {
				local41 = (Class11_Sub2) Class1_Sub1_Sub34.aClass196Array1[arg0].method4026();
				local41.method7200();
				@Pc(80) int local80 = Static4.anIntArray591[arg0]--;
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[FIFIIII)V")
	public static void method7843(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg3 - arg0;
		@Pc(9) int local9 = arg7 - arg5;
		@Pc(13) int local13 = arg8 - arg1;
		@Pc(38) float local38 = arg2[1] * (float) local9 + arg2[0] * (float) local5 + arg2[2] * (float) local13;
		@Pc(59) float local59 = (float) local9 * arg2[4] + arg2[3] * (float) local5 + arg2[5] * (float) local13;
		@Pc(80) float local80 = (float) local13 * arg2[8] + (float) local9 * arg2[7] + (float) local5 * arg2[6];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg4 + 0.5F;
		@Pc(134) float local134;
		if (arg6 == 1) {
			local134 = local106;
			local106 = -local119;
			local119 = local134;
		} else if (arg6 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg6 == 3) {
			local134 = local106;
			local106 = local119;
			local119 = -local134;
		}
		Static482.aFloat205 = local119;
		Static271.aFloat132 = local106;
	}
}
