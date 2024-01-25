import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
	public static int anInt3806;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
	public static int anInt3808;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
	public static int anInt3809 = 0;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
	public static final int anInt3815 = 1339;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZI)V")
	public static void method3226(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static30.anInt830 != -1) {
				Static434.method8407(Static30.anInt830);
			}
			for (@Pc(19) Class6_Sub25 local19 = (Class6_Sub25) Static214.aClass380_15.method8755(); local19 != null; local19 = (Class6_Sub25) Static214.aClass380_15.method8752()) {
				if (!local19.method8791()) {
					local19 = (Class6_Sub25) Static214.aClass380_15.method8755();
					if (local19 == null) {
						break;
					}
				}
				Static360.method5823(false, local19, true);
			}
			Static30.anInt830 = -1;
			Static214.aClass380_15 = new Class380(8);
			Static450.method6848();
			Static30.anInt830 = Static41.anInt1433;
			Static80.method2189(false);
			Static486.method8547();
			Static435.method6680(Static30.anInt830);
		}
		Static366.aBoolean559 = true;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V")
	public static void method3227() {
		Static224.anInt5036 = -1;
		Static453.anInt8163 = 1;
		Static3.aBoolean7 = false;
		Static309.anInt6223 = -1;
		Static597.anInt10148 = 2;
		Static619.anInt7284 = 0;
		Static473.aClass223_111 = null;
		Static214.aClass6_Sub4_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BIIII)V")
	public static void method3228(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(16) int local16 = -arg1;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 + arg1);
		@Pc(34) int local34 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 - arg1);
		Static571.method7990(arg3, Static173.anIntArrayArray15[arg0], local34, local26);
		while (local9 > local7) {
			local18 += 2;
			local16 += local18;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(86) int local86;
			@Pc(95) int local95;
			if (local16 > 0) {
				local9--;
				local16 -= local9 << 1;
				local63 = arg0 - local9;
				local67 = arg0 + local9;
				if (local67 >= Static633.anInt10644 && Static389.anInt7300 >= local63) {
					local86 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 + local7);
					local95 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 - local7);
					if (local67 <= Static389.anInt7300) {
						Static571.method7990(arg3, Static173.anIntArrayArray15[local67], local95, local86);
					}
					if (Static633.anInt10644 <= local63) {
						Static571.method7990(arg3, Static173.anIntArrayArray15[local63], local95, local86);
					}
				}
			}
			local7++;
			local63 = arg0 - local7;
			local67 = local7 + arg0;
			if (Static633.anInt10644 <= local67 && Static389.anInt7300 >= local63) {
				local86 = Static465.method6957(Static7.anInt464, Static309.anInt6227, local9 + arg2);
				local95 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 - local9);
				if (local67 <= Static389.anInt7300) {
					Static571.method7990(arg3, Static173.anIntArrayArray15[local67], local95, local86);
				}
				if (Static633.anInt10644 <= local63) {
					Static571.method7990(arg3, Static173.anIntArrayArray15[local63], local95, local86);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIZ)I")
	public static int method3229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class6_Sub6 local8 = Static612.method8391(arg0, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray33.length > arg1) {
			return local8.anIntArray33[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method3230(@OriginalArg(1) Class5 arg0) {
		if (Static611.anInt10324 < 2 && !Static141.aBoolean262 || Static448.aClass302_13 != null) {
			return;
		}
		@Pc(34) String local34;
		if (Static141.aBoolean262 && Static611.anInt10324 < 2) {
			local34 = Static381.aString72 + Static536.aClass316_34.method7577(Static638.anInt10709) + Static275.aString109 + " ->";
		} else if (Static198.aBoolean343 && Static391.aClass91_1.method6224(81) && Static611.anInt10324 > 2) {
			local34 = Static159.method3114(Static469.aClass6_Sub5_Sub9_2);
		} else {
			@Pc(38) Class6_Sub5_Sub9 local38 = Static469.aClass6_Sub5_Sub9_2;
			if (local38 == null) {
				return;
			}
			local34 = Static159.method3114(local38);
			@Pc(47) int[] local47 = null;
			if (Static578.method8033(local38.anInt3240)) {
				local47 = Static356.aClass221_1.method5923((int) local38.aLong78).anIntArray469;
			} else if (local38.anInt3239 != -1) {
				local47 = Static356.aClass221_1.method5923(local38.anInt3239).anIntArray469;
			} else if (Static74.method2090(local38.anInt3240)) {
				@Pc(134) Class6_Sub42 local134 = (Class6_Sub42) Static461.aClass380_35.method8747((long) (int) local38.aLong78);
				if (local134 != null) {
					@Pc(139) Class9_Sub4_Sub2_Sub1_Sub1 local139 = local134.aClass9_Sub4_Sub2_Sub1_Sub1_1;
					@Pc(142) Class158 local142 = local139.aClass158_1;
					if (local142.anIntArray260 != null) {
						local142 = local142.method4867(Static140.aClass157_1);
					}
					if (local142 != null) {
						local47 = local142.anIntArray262;
					}
				}
			} else if (Static340.method5667(local38.anInt3240)) {
				@Pc(97) Class356 local97;
				if (local38.anInt3240 == 1009) {
					local97 = Static249.aClass310_1.method7474((int) local38.aLong78);
				} else {
					local97 = Static249.aClass310_1.method7474((int) (local38.aLong78 >>> 32 & 0x7FFFFFFFL));
				}
				if (local97.anIntArray545 != null) {
					local97 = local97.method8322(Static140.aClass157_1);
				}
				if (local97 != null) {
					local47 = local97.anIntArray546;
				}
			}
			if (local47 != null) {
				local34 = local34 + Static591.method8148(local47);
			}
		}
		if (Static611.anInt10324 > 2) {
			local34 = local34 + "<col=ffffff> / " + (Static611.anInt10324 - 2) + Static536.aClass316_27.method7577(Static638.anInt10709);
		}
		if (Static497.aClass302_15 != null) {
			@Pc(214) Class34 local214 = Static497.aClass302_15.method7347(arg0);
			if (local214 == null) {
				local214 = Static537.aClass34_12;
			}
			local214.method8603(Static580.anInt9870, Static497.aClass302_15.anInt8859, Static294.anInt6025, Static497.aClass302_15.anInt8937, Static497.aClass302_15.anInt8872, Static309.aRandom1, Static497.aClass302_15.anInt8926, Static539.anIntArray486, Static497.aClass302_15.anInt8909, local34, Static497.aClass302_15.anInt8894, Static92.anIntArray89, Static388.aClass4Array10, Static544.anInt9410);
			Static413.method6488(Static539.anIntArray486[3], Static539.anIntArray486[2], Static539.anIntArray486[0], Static539.anIntArray486[1]);
		} else if (Static467.aClass302_14 != null && Static406.aClass290_34 == Static8.aClass290_1) {
			@Pc(279) int local279 = Static537.aClass34_12.method8594(Static151.anInt3537 + 16, local34, Static309.aRandom1, Static92.anIntArray89, Static294.anInt6025, Static304.anInt6167 + 4, Static388.aClass4Array10);
			Static413.method6488(16, Static2.aClass213_9.method5831(local34) + local279, Static304.anInt6167 + 4, Static151.anInt3537);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	public static void method3231() {
		if (Static496.aClass104_4.aBoolean288) {
			Static510.anInt8806 = 96;
			return;
		}
		try {
			@Pc(27) Method local27 = Runtime.class.getMethod("maxMemory");
			if (local27 != null) {
				try {
					@Pc(31) Runtime local31 = Runtime.getRuntime();
					@Pc(37) Long local37 = (Long) local27.invoke(local31, (Object[]) null);
					Static510.anInt8806 = (int) (local37 / 1048576L) + 1;
					return;
				} catch (@Pc(47) Throwable local47) {
					return;
				}
			}
		} catch (@Pc(49) Exception local49) {
			return;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
	public static void method3232() {
		Static443.aClass5_12.L(Static539.anInt9345, Static87.aClass6_Sub33_6.aClass14_Sub14_1.method4939() == 1 ? Static465.anInt8296 + 256 << 2 : -1, 0);
	}
}
