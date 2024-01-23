import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ad", name = "Z", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "Lclient!fk;")
	public static Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
	public static void method101() {
		if (Static150.aClass139_3 != null) {
			Static150.aClass139_3.method3559();
			Static150.aClass139_3 = null;
		}
		Static104.method1669();
		Static286.method4489();
		@Pc(17) int local17;
		for (local17 = 0; local17 < 4; local17++) {
			Static138.aClass153Array1[local17].method4081();
		}
		Static306.method4921(false);
		System.gc();
		Static233.method3956();
		Static201.anInt3962 = -1;
		Static73.aBoolean123 = false;
		Static202.method3344(true);
		Static3.anInt70 = 0;
		Static43.anInt798 = 0;
		Static131.anInt2471 = 0;
		Static45.aBoolean71 = false;
		Static101.anInt1844 = 0;
		for (local17 = 0; local17 < Static51.aClass121Array1.length; local17++) {
			Static51.aClass121Array1[local17] = null;
		}
		Static152.anInt2869 = 0;
		Static118.anInt2202 = 0;
		for (local17 = 0; local17 < 2048; local17++) {
			Static52.aClass10_Sub5_Sub1Array1[local17] = null;
			Static302.aClass3_Sub26Array1[local17] = null;
		}
		for (local17 = 0; local17 < 32768; local17++) {
			Static110.aClass10_Sub5_Sub2Array1[local17] = null;
		}
		for (local17 = 0; local17 < 4; local17++) {
			for (@Pc(113) int local113 = 0; local113 < 104; local113++) {
				for (@Pc(118) int local118 = 0; local118 < 104; local118++) {
					Static223.aClass56ArrayArrayArray1[local17][local113][local118] = null;
				}
			}
		}
		Static291.method4773();
		Static263.anInt5410 = 0;
		Static64.method1015();
		Static133.method2310(true);
		try {
			Static325.method4166(Static274.aClass176_4.anApplet1, "loggedout");
		} catch (@Pc(157) Throwable local157) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)V")
	public static void method102() {
		Static19.aClass98_2.method2565(5);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!sd;)V")
	public static void method103(@OriginalArg(1) Class10_Sub5_Sub2 arg0) {
		for (@Pc(18) Class3_Sub20 local18 = (Class3_Sub20) Static39.aClass56_4.method1281(); local18 != null; local18 = (Class3_Sub20) Static39.aClass56_4.method1278()) {
			if (arg0 == local18.aClass10_Sub5_Sub2_1) {
				if (local18.aClass3_Sub15_Sub1_3 != null) {
					Static86.aClass3_Sub15_Sub2_1.method2432(local18.aClass3_Sub15_Sub1_3);
					local18.aClass3_Sub15_Sub1_3 = null;
				}
				local18.method5013();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
	public static void method104() {
		@Pc(8) int local8 = Static272.aByteArrayArray75.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			if (Static272.aByteArrayArray75[local14] != null) {
				@Pc(29) int local29 = -1;
				for (@Pc(31) int local31 = 0; local31 < Static100.anInt1833; local31++) {
					if (Static297.anIntArray220[local14] == Static89.anIntArray159[local31]) {
						local29 = local31;
						break;
					}
				}
				if (local29 == -1) {
					Static89.anIntArray159[Static100.anInt1833] = Static297.anIntArray220[local14];
					local29 = Static100.anInt1833++;
				}
				@Pc(69) int local69 = 0;
				@Pc(76) Class3_Sub26 local76 = new Class3_Sub26(Static272.aByteArrayArray75[local14]);
				while (local76.anInt4615 < Static272.aByteArrayArray75[local14].length && local69 < 511 && Static118.anInt2202 < 1023) {
					@Pc(102) int local102 = local69++ << 6 | local29;
					@Pc(106) int local106 = local76.method3948();
					@Pc(110) int local110 = local106 >> 14;
					@Pc(116) int local116 = local106 >> 7 & 0x3F;
					@Pc(120) int local120 = local106 & 0x3F;
					@Pc(133) int local133 = local116 + (Static297.anIntArray220[local14] >> 8) * 64 - Static101.anInt1844;
					@Pc(147) int local147 = (Static297.anIntArray220[local14] & 0xFF) * 64 + local120 - Static43.anInt798;
					@Pc(153) Class124 local153 = Static218.method3602(local76.method3948());
					if (Static110.aClass10_Sub5_Sub2Array1[local102] == null && (local153.aByte19 & 0x1) > 0 && Static187.anInt3700 == local110 && local133 >= 0 && local153.anInt3781 + local133 < 104 && local147 >= 0 && local147 + local153.anInt3781 < 104) {
						Static110.aClass10_Sub5_Sub2Array1[local102] = new Class10_Sub5_Sub2();
						@Pc(204) Class10_Sub5_Sub2 local204 = Static110.aClass10_Sub5_Sub2Array1[local102];
						Static253.anIntArray547[Static118.anInt2202++] = local102;
						local204.anInt5095 = Static124.anInt2371;
						local204.method4209(local153);
						local204.method4199(local204.aClass124_1.anInt3781);
						local204.anInt5018 = local204.anInt5043 = Static285.anIntArray597[local204.aClass124_1.aByte22];
						local204.anInt5017 = local204.aClass124_1.anInt3778;
						if (local204.anInt5017 == 0) {
							local204.anInt5043 = 0;
						}
						local204.anInt5090 = local204.aClass124_1.anInt3758;
						local204.method4197(local204.method4186(), true, local147, local133);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZI)V")
	public static void method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class3_Sub4_Sub22 local5 = Static156.method2607(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		Static309.anIntArray628 = new int[local5.anInt5807];
		Static309.aStringArray43 = new String[local5.anInt5812];
		if (local5.anInt5814 == 15 || local5.anInt5814 == 17 || local5.anInt5814 == 16) {
			@Pc(44) int local44 = 0;
			@Pc(46) int local46 = 0;
			if (Static287.aClass151_19 != null) {
				local46 = Static287.aClass151_19.anInt4730;
				local44 = Static287.aClass151_19.anInt4756;
			}
			Static309.anIntArray628[0] = Static167.anInt3153 - local44;
			Static309.anIntArray628[1] = Static153.anInt2892 - local46;
		}
		Static101.method1610(200000, local5);
	}
}
