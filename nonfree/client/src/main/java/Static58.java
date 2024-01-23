import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
	public static int anInt1304;

	@OriginalMember(owner = "client!eg", name = "S", descriptor = "Lclient!ch;")
	public static Class28 aClass28_4;

	@OriginalMember(owner = "client!eg", name = "ab", descriptor = "[I")
	public static int[] anIntArray100;

	@OriginalMember(owner = "client!eg", name = "db", descriptor = "[Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1[] aClass2_Sub3_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!eg", name = "fb", descriptor = "Lclient!ch;")
	public static Class28 aClass28_5;

	@OriginalMember(owner = "client!eg", name = "hb", descriptor = "I")
	public static int anInt1315;

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString67 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIILclient!fc;Lclient!fc;IIJ)V")
	public static void method1120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) Class36 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class168 local8 = new Class168();
		local8.aLong268 = arg8;
		local8.anInt5427 = arg1 * 128 + 64;
		local8.anInt5433 = arg2 * 128 + 64;
		local8.anInt5424 = arg3;
		local8.aClass36_10 = arg4;
		local8.aClass36_9 = arg5;
		local8.anInt5425 = arg6;
		local8.anInt5430 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static180.aClass2_Sub31ArrayArrayArray2[local42][arg1][arg2] == null) {
				Static180.aClass2_Sub31ArrayArrayArray2[local42][arg1][arg2] = new Class2_Sub31(local42, arg1, arg2);
			}
		}
		Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2].aClass168_1 = local8;
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)V")
	public static void method1121() {
		Static102.anInt2234 = 0;
		Static67.anInt6137 = 0;
		Static268.method4460();
		Static165.method2847();
		Static90.method1691();
		Static295.method4899();
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static67.anInt6137; local19++) {
			@Pc(26) int local26 = Static33.anIntArray51[local19];
			if (Static212.aClass36_Sub3_Sub2Array1[local26].anInt5091 != Static148.anInt3168) {
				if (Static212.aClass36_Sub3_Sub2Array1[local26].anInt5149 > 0) {
					Static88.method3790(Static212.aClass36_Sub3_Sub2Array1[local26]);
				}
				Static212.aClass36_Sub3_Sub2Array1[local26] = null;
			}
		}
		if (Static250.aClass2_Sub26_Sub1_2.anInt5328 != Static4.anInt151) {
			throw new RuntimeException("gpp1 pos:" + Static250.aClass2_Sub26_Sub1_2.anInt5328 + " psize:" + Static4.anInt151);
		}
		for (local19 = 0; local19 < Static68.anInt1507; local19++) {
			if (Static212.aClass36_Sub3_Sub2Array1[Static33.anIntArray50[local19]] == null) {
				throw new RuntimeException("gpp2 pos:" + local19 + " size:" + Static68.anInt1507);
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "(I)V")
	public static void method1122() {
		if (Static107.aClass3_2 != null) {
			Static107.aClass3_2.method2225();
		}
		if (Static68.aClass3_1 != null) {
			Static68.aClass3_1.method2225();
		}
		Static122.method2221(Static183.aBoolean332);
		Static107.aClass3_2 = Static145.method2560(0, Static299.aClass177_5, Static105.aCanvas1, 22050);
		Static107.aClass3_2.method2228(Static272.aClass2_Sub5_Sub3_3);
		Static68.aClass3_1 = Static145.method2560(1, Static299.aClass177_5, Static105.aCanvas1, 2048);
		Static68.aClass3_1.method2228(Static43.aClass2_Sub5_Sub1_1);
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
	public static void method1123() {
		if (!Static295.aBoolean487 && Static7.anInt237 != 2) {
			try {
				Static303.method484("tbrefresh", Static262.aClient41);
			} catch (@Pc(23) Throwable local23) {
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method1126(@OriginalArg(0) int arg0) {
		@Pc(10) String local10 = Integer.toString(arg0);
		for (@Pc(15) int local15 = local10.length() - 3; local15 > 0; local15 -= 3) {
			local10 = local10.substring(0, local15) + "," + local10.substring(local15);
		}
		if (local10.length() <= 9) {
			return local10.length() > 6 ? " <col=ffffff>" + local10.substring(0, local10.length() - 4) + Static213.aString225 + " (" + local10 + ")</col>" : " <col=ffff00>" + local10 + "</col>";
		} else {
			return " <col=00ff80>" + local10.substring(0, local10.length() - 8) + Static205.aString214 + " (" + local10 + ")</col>";
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!wm;)Lclient!fm;")
	public static Class59 method1127(@OriginalArg(1) Class2_Sub26 arg0) {
		@Pc(7) Class59 local7 = new Class59();
		local7.anInt1646 = arg0.method4242();
		local7.aClass2_Sub3_Sub22_1 = Static190.method3493(local7.anInt1646);
		return local7;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BIIII)Lclient!pi;")
	public static Class137 method1128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(31) long local31 = ((long) arg3 & 0xFFFFL) << 16 | ((long) arg1 & 0xFFFFL) << 32 | ((long) arg2 & 0xFFFFL) << 48 | (long) arg0 & 0xFFFFL;
		@Pc(37) Class137 local37 = (Class137) Static144.aClass46_24.method1074(local31);
		if (local37 != null) {
			return local37;
		}
		@Pc(44) Class129[] local44 = null;
		@Pc(50) Class80 local50 = Static222.method3720(arg0);
		if (local50.anIntArray163 != null) {
			local44 = new Class129[local50.anIntArray163.length];
			for (@Pc(61) int local61 = 0; local61 < local44.length; local61++) {
				@Pc(78) Class37 local78 = Static67.method4882(local50.anIntArray163[local61]);
				local44[local61] = new Class129(local78.anInt1053, local78.anInt1060, local78.anInt1064, local78.anInt1063, local78.anInt1056, local78.anInt1061, local78.anInt1066, local78.aBoolean76);
			}
		}
		local37 = new Class137(local50.anInt2338, local44, local50.anInt2333, arg2, arg1, arg3);
		Static144.aClass46_24.method1071(local37, local31);
		return local37;
	}
}
