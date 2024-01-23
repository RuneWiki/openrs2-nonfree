import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!og", name = "H", descriptor = "Lclient!nm;")
	public static Class119 aClass119_68;

	@OriginalMember(owner = "client!og", name = "I", descriptor = "Lclient!nm;")
	public static Class119 aClass119_69;

	@OriginalMember(owner = "client!og", name = "J", descriptor = "[Lclient!nc;")
	public static Class115[] aClass115Array1;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "[Lclient!fh;")
	public static Class1_Sub13[] aClass1_Sub13Array1 = new Class1_Sub13[2048];

	@OriginalMember(owner = "client!og", name = "S", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)V")
	public static void method3406(@OriginalArg(1) int arg0) {
		if (Static97.anInt2087 == arg0) {
			return;
		}
		if (Static97.anInt2087 == 0) {
			Static69.method1327();
		}
		@Pc(34) boolean local34 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 == 40) {
			Static19.method319();
		}
		if (arg0 != 40 && Static302.aClass49_4 != null) {
			Static302.aClass49_4.method1307();
			Static302.aClass49_4 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static154.anInt3089 = 1;
			Static132.anInt2603 = 0;
			Static42.anInt956 = 1;
			Static58.anInt1248 = 0;
			Static82.anInt1811 = 0;
			Static261.method4039(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static168.method2836();
		}
		if (arg0 == 5) {
			Static8.method141(Static45.aClass119_15);
		} else {
			Static201.method3424();
		}
		@Pc(111) boolean local111 = Static97.anInt2087 == 5 || Static97.anInt2087 == 10 || Static97.anInt2087 == 28;
		if (local111 != local34) {
			if (local34) {
				Static226.anInt4236 = Static109.anInt2273;
				if (Static172.anInt3363 == 0) {
					Static24.method473();
				} else {
					Static115.method2105(aClass119_68, Static109.anInt2273, 255);
				}
				Static136.aClass164_1.method4070(false);
			} else {
				Static24.method473();
				Static136.aClass164_1.method4070(true);
			}
		}
		if (Static71.aBoolean165 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static71.method1386();
		}
		Static97.anInt2087 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!pl;ILclient!wc;IZLclient!bb;IZ)V")
	public static void method3408(@OriginalArg(0) Class136 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub33 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1_Sub5_Sub1 arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class6 local3 = null;
		if (arg0.anInt4058 == 0) {
			if ((double) Static249.aFloat100 == 3.0D) {
				local3 = Static239.aClass6_7;
			}
			if ((double) Static249.aFloat100 == 4.0D) {
				local3 = Static182.aClass6_6;
			}
			if ((double) Static249.aFloat100 == 6.0D) {
				local3 = Static289.aClass6_8;
			}
			if ((double) Static249.aFloat100 >= 8.0D) {
				local3 = Static125.aClass6_3;
			}
		} else if (arg0.anInt4058 == 1) {
			if ((double) Static249.aFloat100 == 3.0D) {
				local3 = Static289.aClass6_8;
			}
			if ((double) Static249.aFloat100 == 4.0D) {
				local3 = Static125.aClass6_3;
			}
			if ((double) Static249.aFloat100 == 6.0D) {
				local3 = Static24.aClass6_1;
			}
			if ((double) Static249.aFloat100 >= 8.0D) {
				local3 = Static148.aClass6_5;
			}
		} else if (arg0.anInt4058 == 2) {
			if ((double) Static249.aFloat100 == 3.0D) {
				local3 = Static24.aClass6_1;
			}
			if ((double) Static249.aFloat100 == 4.0D) {
				local3 = Static148.aClass6_5;
			}
			if ((double) Static249.aFloat100 == 6.0D) {
				local3 = Static55.aClass6_2;
			}
			if ((double) Static249.aFloat100 >= 8.0D) {
				local3 = Static144.aClass6_4;
			}
		}
		if (local3 == null) {
			return;
		}
		@Pc(135) int local135 = arg0.anInt4068;
		if (arg5.aBoolean34 && arg0.anInt4067 != -1) {
			local135 = arg0.anInt4067;
		}
		@Pc(148) int local148 = 0;
		@Pc(155) int local155 = Static170.aClass1_Sub5_Sub9_4.method2856(arg0.aString142, null, Static118.aStringArray14);
		@Pc(158) int local158 = arg5.anInt360;
		if (arg4) {
			local158 -= local3.method114() * local155 / 2;
		} else {
			local158 -= arg1 + (local155 - 1) * local3.method118() + local3.method114() / 2;
		}
		@Pc(194) int local194 = local158 - local3.method114();
		local158 += local3.method114() / 2;
		@Pc(203) int local203;
		@Pc(232) int local232;
		for (local203 = 0; local203 < local155; local203++) {
			@Pc(210) String local210 = Static118.aStringArray14[local203];
			if (local155 - 1 > local203) {
				local210 = local210.substring(0, local210.length() - 4);
			}
			local232 = local3.method117(local210);
			if (local148 < local232) {
				local148 = local232;
			}
		}
		arg2.anInt5498 = local148 / 2 + arg5.anInt368 + arg6;
		arg2.anInt5499 = arg5.anInt368 + arg6 - local148 / 2;
		arg2.anInt5493 = local194 + arg3;
		arg2.anInt5497 = local194 + local3.method118() * local155 + arg3;
		@Pc(287) int local287 = local194 + 2;
		local203 = arg5.anInt368 - local148 / 2 - 5;
		if (arg0.anInt4056 != 0) {
			Static77.method1584(local203, local287, local148 + 10, -local287 + local194 + local155 * local3.method118() + 1, arg0.anInt4056, arg0.anInt4056 >>> 24);
		}
		if (arg0.anInt4066 != 0) {
			Static77.method1600(local203, local287, local148 + 10, -local287 + local3.method118() * local155 + (local194 - -1), arg0.anInt4066, arg0.anInt4066 >>> 24);
		}
		for (local232 = 0; local232 < local155; local232++) {
			@Pc(360) String local360 = Static118.aStringArray14[local232];
			if (local232 < local155 - 1) {
				local360 = local360.substring(0, local360.length() - 4);
			}
			@Pc(381) int local381 = local3.method117(local360);
			if (local148 < local381) {
				local148 = local381;
			}
			local3.method122(local360, arg5.anInt368, local158, local135);
			local158 += local3.method118();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!nm;IB)Lclient!fo;")
	public static Class57_Sub1 method3409(@OriginalArg(1) Class119 arg0, @OriginalArg(2) int arg1) {
		return Static114.method2083(arg1, arg0, 0) ? Static237.method3822() : null;
	}
}
