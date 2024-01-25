import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_51 = new Class240(59, -1);

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
	public static int anInt5078 = -1;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(20) int local20;
		if (Static185.method2900(arg7)) {
			local20 = 0;
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(41) int local41 = 0;
			@Pc(47) int local47 = 0;
			if (Static498.aBoolean757) {
				local41 = Static392.anInt6523;
				local47 = Static263.anInt2100;
				local37 = Static82.anInt1509;
				local20 = Static521.anInt8230;
				local39 = Static669.anInt10276;
				Static263.anInt2100 = 1;
			}
			if (Static78.aClass265ArrayArray1[arg7] == null) {
				Static167.method2650(arg5 < 0, arg0, arg2, -1, arg1, Static270.aClass265ArrayArray2[arg7], arg3, arg5, arg4, arg6);
			} else {
				Static167.method2650(arg5 < 0, arg0, arg2, -1, arg1, Static78.aClass265ArrayArray1[arg7], arg3, arg5, arg4, arg6);
			}
			if (Static498.aBoolean757) {
				if (arg5 >= 0 && Static263.anInt2100 == 2) {
					Static63.method1147(Static82.anInt1509, Static669.anInt10276, Static521.anInt8230, Static392.anInt6523);
				}
				Static82.anInt1509 = local37;
				Static392.anInt6523 = local41;
				Static521.anInt8230 = local20;
				Static669.anInt10276 = local39;
				Static263.anInt2100 = local47;
			}
		} else if (arg5 == -1) {
			for (local20 = 0; local20 < 100; local20++) {
				Static89.aBooleanArray7[local20] = true;
			}
		} else {
			Static89.aBooleanArray7[arg5] = true;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4367(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static345.anInt5912; local16++) {
			if (arg0.equalsIgnoreCase(Static651.aStringArray66[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString25);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIIIBI)V")
	public static void method4368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(38) int local38 = (1 - local29) * local13 + local21;
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = local25 * ((arg4 << 1) - 3);
		@Pc(81) int local81 = local59;
		@Pc(95) int local95;
		@Pc(104) int local104;
		if (arg3 >= Static617.anInt6260 && Static229.anInt4089 >= arg3) {
			local95 = Static166.method2620(arg0 + arg2, Static629.anInt10412, Static300.anInt5091);
			local104 = Static166.method2620(arg2 - arg0, Static629.anInt10412, Static300.anInt5091);
			Static578.method7640(arg1, local104, local95, Static276.anIntArrayArray32[arg3]);
		}
		@Pc(118) int local118 = local55 * (arg4 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local67;
					local46 += local81;
					local81 += local59;
					local7++;
					local67 += local59;
				}
			}
			if (local46 < 0) {
				local46 += local81;
				local38 += local67;
				local7++;
				local67 += local59;
				local81 += local59;
			}
			local38 += -local118;
			local46 += -local75;
			local118 -= local55;
			local75 -= local55;
			local9--;
			local95 = arg3 - local9;
			local104 = local9 + arg3;
			if (local104 >= Static617.anInt6260 && local95 <= Static229.anInt4089) {
				@Pc(211) int local211 = Static166.method2620(arg2 + local7, Static629.anInt10412, Static300.anInt5091);
				@Pc(219) int local219 = Static166.method2620(arg2 - local7, Static629.anInt10412, Static300.anInt5091);
				if (Static617.anInt6260 <= local95) {
					Static578.method7640(arg1, local219, local211, Static276.anIntArrayArray32[local95]);
				}
				if (local104 <= Static229.anInt4089) {
					Static578.method7640(arg1, local219, local211, Static276.anIntArrayArray32[local104]);
				}
			}
		}
	}
}
