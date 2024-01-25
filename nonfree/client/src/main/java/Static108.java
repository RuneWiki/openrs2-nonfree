import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	public static int anInt1919;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "S")
	public static short aShort14 = 32767;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[200];

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	public static int anInt1918 = 0;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString15 = "";

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	public static int anInt1921 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < 1 || arg4 < 1 || arg6 > Static425.anInt6922 - 2 || arg4 > Static251.anInt4072 - 2) {
			return;
		}
		@Pc(33) int local33 = arg0;
		if (arg0 < 3 && Static346.method4403(arg4, arg6)) {
			local33 = arg0 + 1;
		}
		if (!Static336.aClass106_Sub1_1.method4438(Static410.anInt6680) && !Static66.method997(arg4, Static257.anInt6933, local33, arg6)) {
			return;
		}
		if (Static159.aClass82ArrayArrayArray2 == null) {
			return;
		}
		Static279.aClass148_Sub1_8.method4889(arg0, arg3, arg4, arg6, Static383.aClass247Array1[arg0], Static213.aClass128_22);
		if (arg5 < 0) {
			return;
		}
		@Pc(77) boolean local77 = Static336.aClass106_Sub1_1.aBoolean465;
		Static336.aClass106_Sub1_1.aBoolean465 = true;
		Static279.aClass148_Sub1_8.method4892(arg2, arg0, arg6, Static213.aClass128_22, arg5, Static383.aClass247Array1[arg0], arg4, arg1, arg7, local33);
		Static336.aClass106_Sub1_1.aBoolean465 = local77;
		return;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIZIZ)Lclient!ic;")
	public static Class113 method1515(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class178 local10 = null;
		if (Static402.aClass173_6 != null) {
			local10 = new Class178(arg1, Static402.aClass173_6, Static449.aClass173Array1[arg1], 1000000);
		}
		Static324.aClass222_Sub1Array1[arg1] = Static170.aClass208_1.method4300(arg1, Static171.aClass178_2, local10);
		if (arg2) {
			Static324.aClass222_Sub1Array1[arg1].method4791();
		}
		return new Class113(Static324.aClass222_Sub1Array1[arg1], arg0, 1);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZII)V")
	public static void method1517(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub20 local10 = Static240.method3131(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray149.length; local15++) {
				local10.anIntArray149[local15] = -1;
				local10.anIntArray150[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method1518(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(18) int local18 = Static83.anInt1984;
		for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
			@Pc(29) Class191 local29 = Static100.aClass108_1.method2209(arg0[local20]);
			if (local29.anInt5125 != -1) {
				@Pc(41) Class49 local41 = (Class49) Static390.aClass167_88.method3386((long) local29.anInt5125);
				if (local41 == null) {
					@Pc(49) Class100 local49 = Static458.method1922(Static169.aClass113_55, local29.anInt5125, 0);
					if (local49 != null) {
						local41 = Static213.aClass128_22.method3540(local49);
						Static390.aClass167_88.method3392(local41, (long) local29.anInt5125);
					}
				}
				if (local41 != null) {
					Static214.aClass49Array147[local18] = local41;
					local9.append(" <img=").append(local18).append(">");
					local18++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIII)I")
	public static int method1519(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg1;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method1520() {
		Static379.anIntArray387 = Static249.method3244(0.4F);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
	public static void method1522() {
		@Pc(7) Class227[] local7 = Class20_Sub1_Sub2.aClass227Array1;
		synchronized (Class20_Sub1_Sub2.aClass227Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class20_Sub1_Sub2.aClass227Array1.length; local11++) {
				Class20_Sub1_Sub2.aClass227Array1[local11] = new Class227();
				Static339.anIntArray335[local11] = 0;
			}
		}
	}
}
