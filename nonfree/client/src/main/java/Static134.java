import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	public static int anInt3130;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "[I")
	public static int[] anIntArray351 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Lclient!nb;")
	public static Class57 aClass57_21 = new Class57(50);

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1082 = Static65.method1172("Fertigkeit)2");

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1083 = Static65.method1172("(U0a )2 via: ");

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1084 = Static65.method1172("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "[I")
	public static int[] anIntArray352 = new int[500];

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1085 = Static65.method1172("Loading interfaces )2 ");

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1086 = aClass46_1085;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1088 = Static65.method1172("Attack");

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1087 = aClass46_1088;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZII)V")
	public static void method2268(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static177.method2831();
		Static103.method2215(arg2, arg0, Static54.aClass3_Sub2_Sub3_Sub2_2.anInt2494 + arg2, Static54.aClass3_Sub2_Sub3_Sub2_2.anInt2495 + arg0);
		if (Static97.anInt1739 == 2 || Static97.anInt1739 == 5) {
			Static103.method2214(arg2 + 25, arg0 + 5, Static85.anIntArray48, Static121.anIntArray328);
		} else {
			@Pc(32) int local32 = Static29.anInt697 + Static81.anInt2039 & 0x7FF;
			@Pc(39) int local39 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 / 32 + 48;
			@Pc(47) int local47 = 464 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 / 32;
			Static12.aClass3_Sub2_Sub3_Sub3_43.method1893(arg2 + 25, arg0 + 5, 146, 151, local39, local47, local32, Static172.anInt3773 + 256, Static85.anIntArray48, Static121.anIntArray328);
			@Pc(96) int local96;
			@Pc(82) int local82;
			for (@Pc(67) int local67 = 0; local67 < Static161.anInt3579; local67++) {
				local82 = Static104.anIntArray251[local67] * 4 + 2 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 / 32;
				local96 = Static118.anIntArray325[local67] * 4 + 2 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 / 32;
				Static162.method2590(Static88.aClass3_Sub2_Sub3_Sub3Array5[local67], local96, arg0, arg2, local82);
			}
			@Pc(139) int local139;
			@Pc(151) int local151;
			for (local96 = 0; local96 < 104; local96++) {
				for (local82 = 0; local82 < 104; local82++) {
					@Pc(125) Class59 local125 = Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local96][local82];
					if (local125 != null) {
						local139 = local96 * 4 + 2 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 / 32;
						local151 = local82 * 4 + 2 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 / 32;
						Static162.method2590(Static53.aClass3_Sub2_Sub3_Sub3Array3[0], local139, arg0, arg2, local151);
					}
				}
			}
			@Pc(217) int local217;
			for (local82 = 0; local82 < Static174.anInt3804; local82++) {
				@Pc(180) Class3_Sub2_Sub1_Sub1_Sub2 local180 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[Static42.anIntArray106[local82]];
				if (local180 != null && local180.method1161()) {
					@Pc(189) Class3_Sub2_Sub16 local189 = local180.aClass3_Sub2_Sub16_1;
					if (local189 != null && local189.anIntArray428 != null) {
						local189 = local189.method2747();
					}
					if (local189 != null && local189.aBoolean163 && local189.aBoolean164) {
						local217 = local180.anInt1711 / 32 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 / 32;
						local151 = local180.anInt1700 / 32 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 / 32;
						Static162.method2590(Static53.aClass3_Sub2_Sub3_Sub3Array3[1], local151, arg0, arg2, local217);
					}
				}
			}
			@Pc(250) Class3_Sub2_Sub1_Sub1_Sub1 local250;
			for (@Pc(242) int local242 = 0; local242 < Static180.anInt3971; local242++) {
				local250 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[Static127.anIntArray338[local242]];
				if (local250 != null && local250.method1161()) {
					local151 = local250.anInt1700 / 32 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 / 32;
					@Pc(268) boolean local268 = false;
					local217 = local250.anInt1711 / 32 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 / 32;
					@Pc(284) long local284 = local250.aClass46_233.method1348();
					for (@Pc(286) int local286 = 0; local286 < Static52.anInt1391; local286++) {
						if (local284 == Static133.aLongArray2[local286] && Static99.anIntArray246[local286] != 0) {
							local268 = true;
							break;
						}
					}
					@Pc(315) boolean local315 = false;
					if (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt892 != 0 && local250.anInt892 != 0 && local250.anInt892 == Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt892) {
						local315 = true;
					}
					if (local268) {
						Static162.method2590(Static53.aClass3_Sub2_Sub3_Sub3Array3[3], local151, arg0, arg2, local217);
					} else if (local315) {
						Static162.method2590(Static53.aClass3_Sub2_Sub3_Sub3Array3[4], local151, arg0, arg2, local217);
					} else {
						Static162.method2590(Static53.aClass3_Sub2_Sub3_Sub3Array3[2], local151, arg0, arg2, local217);
					}
				}
			}
			if (Static34.anInt955 != 0 && Static20.anInt512 % 20 < 10) {
				if (Static34.anInt955 == 1 && Static133.anInt3123 >= 0 && Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1.length > Static133.anInt3123) {
					@Pc(393) Class3_Sub2_Sub1_Sub1_Sub2 local393 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[Static133.anInt3123];
					if (local393 != null) {
						local151 = local393.anInt1700 / 32 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 / 32;
						local217 = local393.anInt1711 / 32 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 / 32;
						Static47.method934(arg2, local217, local151, arg0, Static18.aClass3_Sub2_Sub3_Sub3Array2[1]);
					}
				}
				if (Static34.anInt955 == 2) {
					local139 = (Static18.anInt432 - Static42.anInt1173) * 4 + 2 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 / 32;
					local151 = (Static35.anInt987 - Static58.anInt1578) * 4 + 2 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 / 32;
					Static47.method934(arg2, local151, local139, arg0, Static18.aClass3_Sub2_Sub3_Sub3Array2[1]);
				}
				if (Static34.anInt955 == 10 && Static56.anInt1517 >= 0 && Static56.anInt1517 < Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1.length) {
					local250 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[Static56.anInt1517];
					if (local250 != null) {
						local217 = local250.anInt1711 / 32 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 / 32;
						local151 = local250.anInt1700 / 32 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 / 32;
						Static47.method934(arg2, local217, local151, arg0, Static18.aClass3_Sub2_Sub3_Sub3Array2[1]);
					}
				}
			}
			if (Static32.anInt911 != 0) {
				local151 = Static18.anInt423 * 4 + 2 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 / 32;
				local139 = Static32.anInt911 * 4 + 2 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 / 32;
				Static162.method2590(Static18.aClass3_Sub2_Sub3_Sub3Array2[0], local139, arg0, arg2, local151);
			}
			Static103.method2210(arg2 + 93 + 4, arg0 + 82 + -4, 3, 3, 16777215);
		}
		if (Static97.anInt1739 < 3) {
			Static147.aClass3_Sub2_Sub3_Sub3_37.method1893(arg2, arg0, 33, 33, 25, 25, Static29.anInt697, 256, Static180.anIntArray442, Static23.anIntArray38);
		} else {
			Static103.method2214(arg2, arg0, Static180.anIntArray442, Static23.anIntArray38);
		}
		if (Static133.aBooleanArray18[arg1]) {
			Static54.aClass3_Sub2_Sub3_Sub2_2.method1713(arg2, arg0);
		}
		Static77.aBooleanArray10[arg1] = true;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public static void method2269() {
		aClass46_1083 = null;
		aClass57_21 = null;
		aClass46_1088 = null;
		aClass46_1082 = null;
		anIntArray352 = null;
		aClass46_1086 = null;
		aClass46_1087 = null;
		aClass46_1084 = null;
		anIntArray351 = null;
		aClass46_1085 = null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!jg;ZLclient!jg;)V")
	public static void method2270(@OriginalArg(1) Class44 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class44 arg2) {
		Static127.aClass44_24 = arg2;
		Static114.aBoolean114 = arg1;
		Static102.aClass44_19 = arg0;
	}
}
