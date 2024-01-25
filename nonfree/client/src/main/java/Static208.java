import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Lclient!ha;")
	public static Class65 aClass65_7;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray16 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "[I")
	public static final int[] anIntArray197 = new int[500];

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBILclient!vba;)V")
	public static void method3305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub3_Sub20 arg2) {
		if (arg2 == null || Static231.aClass114_24.aClass5_84 == arg2) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt10179;
		@Pc(18) int local18 = arg2.anInt10176;
		@Pc(21) int local21 = arg2.anInt10178;
		@Pc(25) int local25 = (int) arg2.aLong289;
		@Pc(28) long local28 = arg2.aLong289;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(42) Class5_Sub25 local42;
		@Pc(47) Class28_Sub1_Sub4_Sub2_Sub1 local47;
		@Pc(64) Class5_Sub21 local64;
		if (local21 == 44) {
			local42 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local25);
			if (local42 != null) {
				local47 = local42.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				Static562.anInt9143 = arg1;
				Static177.anInt3435 = 0;
				Static645.anInt10469 = 2;
				Static173.anInt3410 = arg0;
				local64 = Static64.method905(Static263.aClass49_1, Static149.aClass305_27);
				local64.aClass5_Sub41_Sub2_1.method7828(Static529.anInt9069);
				local64.aClass5_Sub41_Sub2_1.method7828(Static353.anInt6392);
				local64.aClass5_Sub41_Sub2_1.method7809(local25);
				local64.aClass5_Sub41_Sub2_1.method7822(Static549.anInt9003);
				local64.aClass5_Sub41_Sub2_1.method7800(Static17.aClass252_1.method8818(82) ? 1 : 0);
				Static495.method7092(local64);
				Static274.method4253(local47.anIntArray307[0], 0, local47.anIntArray308[0], local47.method4599(), -2, 0, local47.method4599(), true);
			}
		}
		@Pc(142) Class5_Sub21 local142;
		if (local21 == 8) {
			Static645.anInt10469 = 2;
			Static562.anInt9143 = arg1;
			Static173.anInt3410 = arg0;
			Static177.anInt3435 = 0;
			local142 = Static64.method905(Static263.aClass49_1, Static329.aClass305_49);
			local142.aClass5_Sub41_Sub2_1.method7850(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7828(local25);
			local142.aClass5_Sub41_Sub2_1.method7814(local15 + Static153.anInt3147);
			local142.aClass5_Sub41_Sub2_1.method7809(Static201.anInt3839 + local18);
			Static495.method7092(local142);
			Static178.method2991(local15, local18);
		}
		@Pc(187) Class28_Sub1_Sub4_Sub2_Sub2 local187;
		@Pc(206) Class5_Sub21 local206;
		if (local21 == 12) {
			local187 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local25];
			if (local187 != null) {
				Static173.anInt3410 = arg0;
				Static177.anInt3435 = 0;
				Static645.anInt10469 = 2;
				Static562.anInt9143 = arg1;
				local206 = Static64.method905(Static263.aClass49_1, Static50.aClass305_11);
				local206.aClass5_Sub41_Sub2_1.method7828(local25);
				local206.aClass5_Sub41_Sub2_1.method7809(Static353.anInt6392);
				local206.aClass5_Sub41_Sub2_1.method7803(Static549.anInt9003);
				local206.aClass5_Sub41_Sub2_1.method7850(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local206.aClass5_Sub41_Sub2_1.method7809(Static529.anInt9069);
				Static495.method7092(local206);
				Static274.method4253(local187.anIntArray307[0], 0, local187.anIntArray308[0], local187.method4599(), -2, 0, local187.method4599(), true);
			}
		}
		if (local21 == 23) {
			Static173.anInt3410 = arg0;
			Static645.anInt10469 = 2;
			Static177.anInt3435 = 0;
			Static562.anInt9143 = arg1;
			local142 = Static64.method905(Static263.aClass49_1, Static660.aClass305_106);
			local142.aClass5_Sub41_Sub2_1.method7828(local15 + Static153.anInt3147);
			local142.aClass5_Sub41_Sub2_1.method7850(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7809(local18 + Static201.anInt3839);
			local142.aClass5_Sub41_Sub2_1.method7848((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static495.method7092(local142);
			Static84.method1815(local28, local15, local18);
		}
		@Pc(339) Class345 local339;
		if (local21 == 9) {
			local339 = Static144.method2595(local18, local15);
			if (local339 != null) {
				Static61.method828(local339);
			}
		}
		if (local21 == 13) {
			Static173.anInt3410 = arg0;
			Static645.anInt10469 = 2;
			Static562.anInt9143 = arg1;
			Static177.anInt3435 = 0;
			local142 = Static64.method905(Static263.aClass49_1, Static466.aClass305_72);
			local142.aClass5_Sub41_Sub2_1.method7814(Static201.anInt3839 + local18);
			local142.aClass5_Sub41_Sub2_1.method7828(local15 + Static153.anInt3147);
			local142.aClass5_Sub41_Sub2_1.method7828((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local142.aClass5_Sub41_Sub2_1.method7840(Static17.aClass252_1.method8818(82) ? 1 : 0);
			Static495.method7092(local142);
			Static84.method1815(local28, local15, local18);
		}
		if (local21 == 1002) {
			Static645.anInt10469 = 2;
			Static562.anInt9143 = arg1;
			Static177.anInt3435 = 0;
			Static173.anInt3410 = arg0;
			local142 = Static64.method905(Static263.aClass49_1, Static98.aClass305_17);
			local142.aClass5_Sub41_Sub2_1.method7828(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local142.aClass5_Sub41_Sub2_1.method7828(local15 + Static153.anInt3147);
			local142.aClass5_Sub41_Sub2_1.method7840(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7809(local18 + Static201.anInt3839);
			Static495.method7092(local142);
			Static84.method1815(local28, local15, local18);
		}
		if (local21 == 57) {
			local187 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local25];
			if (local187 != null) {
				Static645.anInt10469 = 2;
				Static562.anInt9143 = arg1;
				Static173.anInt3410 = arg0;
				Static177.anInt3435 = 0;
				local206 = Static64.method905(Static263.aClass49_1, Static218.aClass305_36);
				local206.aClass5_Sub41_Sub2_1.method7828(local25);
				local206.aClass5_Sub41_Sub2_1.method7798(Static17.aClass252_1.method8818(82) ? 1 : 0);
				Static495.method7092(local206);
				Static274.method4253(local187.anIntArray307[0], 0, local187.anIntArray308[0], local187.method4599(), -2, 0, local187.method4599(), true);
			}
		}
		if (local21 == 1009) {
			Static173.anInt3410 = arg0;
			Static645.anInt10469 = 2;
			Static177.anInt3435 = 0;
			Static562.anInt9143 = arg1;
			local142 = Static64.method905(Static263.aClass49_1, Static17.aClass305_5);
			local142.aClass5_Sub41_Sub2_1.method7848(local25);
			Static495.method7092(local142);
		}
		if (local21 == 22) {
			local187 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local25];
			if (local187 != null) {
				Static173.anInt3410 = arg0;
				Static177.anInt3435 = 0;
				Static645.anInt10469 = 2;
				Static562.anInt9143 = arg1;
				local206 = Static64.method905(Static263.aClass49_1, Static457.aClass305_71);
				local206.aClass5_Sub41_Sub2_1.method7840(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local206.aClass5_Sub41_Sub2_1.method7809(local25);
				Static495.method7092(local206);
				Static274.method4253(local187.anIntArray307[0], 0, local187.anIntArray308[0], local187.method4599(), -2, 0, local187.method4599(), true);
			}
		}
		if (local21 == 48) {
			Static645.anInt10469 = 2;
			Static562.anInt9143 = arg1;
			Static177.anInt3435 = 0;
			Static173.anInt3410 = arg0;
			local142 = Static64.method905(Static263.aClass49_1, Static64.aClass305_14);
			local142.aClass5_Sub41_Sub2_1.method7809(local25);
			local142.aClass5_Sub41_Sub2_1.method7828(Static201.anInt3839 + local18);
			local142.aClass5_Sub41_Sub2_1.method7798(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7848(local15 + Static153.anInt3147);
			Static495.method7092(local142);
			Static178.method2991(local15, local18);
		}
		if (local21 == 49) {
			Static562.anInt9143 = arg1;
			Static645.anInt10469 = 2;
			Static177.anInt3435 = 0;
			Static173.anInt3410 = arg0;
			local142 = Static64.method905(Static263.aClass49_1, Static50.aClass305_11);
			local142.aClass5_Sub41_Sub2_1.method7828(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5512);
			local142.aClass5_Sub41_Sub2_1.method7809(Static353.anInt6392);
			local142.aClass5_Sub41_Sub2_1.method7803(Static549.anInt9003);
			local142.aClass5_Sub41_Sub2_1.method7850(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7809(Static529.anInt9069);
			Static495.method7092(local142);
		}
		if (local21 == 5) {
			Static177.anInt3435 = 0;
			Static562.anInt9143 = arg1;
			Static173.anInt3410 = arg0;
			Static645.anInt10469 = 1;
			local142 = Static64.method905(Static263.aClass49_1, Static231.aClass305_38);
			local142.aClass5_Sub41_Sub2_1.method7809(Static153.anInt3147 + local15);
			local142.aClass5_Sub41_Sub2_1.method7848(Static353.anInt6392);
			local142.aClass5_Sub41_Sub2_1.method7828(Static529.anInt9069);
			local142.aClass5_Sub41_Sub2_1.method7828(Static201.anInt3839 + local18);
			local142.aClass5_Sub41_Sub2_1.method7803(Static549.anInt9003);
			Static495.method7092(local142);
			Static274.method4253(local18, 0, local15, 1, -4, 0, 1, true);
		}
		if (local21 == 25) {
			local42 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local25);
			if (local42 != null) {
				Static562.anInt9143 = arg1;
				Static177.anInt3435 = 0;
				Static173.anInt3410 = arg0;
				local47 = local42.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				Static645.anInt10469 = 2;
				local64 = Static64.method905(Static263.aClass49_1, Static312.aClass305_47);
				local64.aClass5_Sub41_Sub2_1.method7850(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local64.aClass5_Sub41_Sub2_1.method7814(local25);
				Static495.method7092(local64);
				Static274.method4253(local47.anIntArray307[0], 0, local47.anIntArray308[0], local47.method4599(), -2, 0, local47.method4599(), true);
			}
		}
		if (local21 == 21) {
			Static177.anInt3435 = 0;
			Static645.anInt10469 = 2;
			Static173.anInt3410 = arg0;
			Static562.anInt9143 = arg1;
			local142 = Static64.method905(Static263.aClass49_1, Static583.aClass305_93);
			local142.aClass5_Sub41_Sub2_1.method7809(Static529.anInt9069);
			local142.aClass5_Sub41_Sub2_1.method7809(local25);
			local142.aClass5_Sub41_Sub2_1.method7848(Static353.anInt6392);
			local142.aClass5_Sub41_Sub2_1.method7806(Static549.anInt9003);
			local142.aClass5_Sub41_Sub2_1.method7840(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7828(Static201.anInt3839 + local18);
			local142.aClass5_Sub41_Sub2_1.method7828(local15 + Static153.anInt3147);
			Static495.method7092(local142);
			Static178.method2991(local15, local18);
		}
		if (local21 == 17) {
			local187 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local25];
			if (local187 != null) {
				Static173.anInt3410 = arg0;
				Static645.anInt10469 = 2;
				Static177.anInt3435 = 0;
				Static562.anInt9143 = arg1;
				local206 = Static64.method905(Static263.aClass49_1, Static561.aClass305_88);
				local206.aClass5_Sub41_Sub2_1.method7809(local25);
				local206.aClass5_Sub41_Sub2_1.method7798(Static17.aClass252_1.method8818(82) ? 1 : 0);
				Static495.method7092(local206);
				Static274.method4253(local187.anIntArray307[0], 0, local187.anIntArray308[0], local187.method4599(), -2, 0, local187.method4599(), true);
			}
		}
		if (local21 == 20) {
			Static173.anInt3410 = arg0;
			Static177.anInt3435 = 0;
			Static645.anInt10469 = 2;
			Static562.anInt9143 = arg1;
			local142 = Static64.method905(Static263.aClass49_1, Static445.aClass305_70);
			local142.aClass5_Sub41_Sub2_1.method7809(local15 + Static153.anInt3147);
			local142.aClass5_Sub41_Sub2_1.method7800(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7809(local25);
			local142.aClass5_Sub41_Sub2_1.method7848(local18 + Static201.anInt3839);
			Static495.method7092(local142);
			Static178.method2991(local15, local18);
		}
		if (local21 == 2) {
			local187 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local25];
			if (local187 != null) {
				Static173.anInt3410 = arg0;
				Static177.anInt3435 = 0;
				Static645.anInt10469 = 2;
				Static562.anInt9143 = arg1;
				local206 = Static64.method905(Static263.aClass49_1, Static514.aClass305_80);
				local206.aClass5_Sub41_Sub2_1.method7800(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local206.aClass5_Sub41_Sub2_1.method7848(local25);
				Static495.method7092(local206);
				Static274.method4253(local187.anIntArray307[0], 0, local187.anIntArray308[0], local187.method4599(), -2, 0, local187.method4599(), true);
			}
		}
		if (local21 == 1003) {
			Static177.anInt3435 = 0;
			Static645.anInt10469 = 2;
			Static173.anInt3410 = arg0;
			Static562.anInt9143 = arg1;
			local142 = Static64.method905(Static263.aClass49_1, Static642.aClass305_102);
			local142.aClass5_Sub41_Sub2_1.method7848(local25);
			Static495.method7092(local142);
		}
		if (local21 == 1001) {
			Static645.anInt10469 = 2;
			Static562.anInt9143 = arg1;
			Static173.anInt3410 = arg0;
			Static177.anInt3435 = 0;
			local42 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local25);
			if (local42 != null) {
				local47 = local42.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				@Pc(1251) Class134 local1251 = local47.aClass134_1;
				if (local1251.anIntArray191 != null) {
					local1251 = local1251.method3276(Static161.aClass237_3);
				}
				if (local1251 != null) {
					@Pc(1270) Class5_Sub21 local1270 = Static64.method905(Static263.aClass49_1, Static430.aClass305_2);
					local1270.aClass5_Sub41_Sub2_1.method7848(local1251.anInt3816);
					Static495.method7092(local1270);
				}
			}
		}
		if (local21 == 58) {
			local187 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local25];
			if (local187 != null) {
				Static645.anInt10469 = 2;
				Static173.anInt3410 = arg0;
				Static177.anInt3435 = 0;
				Static562.anInt9143 = arg1;
				local206 = Static64.method905(Static263.aClass49_1, Static80.aClass305_15);
				local206.aClass5_Sub41_Sub2_1.method7800(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local206.aClass5_Sub41_Sub2_1.method7848(local25);
				Static495.method7092(local206);
				Static274.method4253(local187.anIntArray307[0], 0, local187.anIntArray308[0], local187.method4599(), -2, 0, local187.method4599(), true);
			}
		}
		if (local21 == 10) {
			local187 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local25];
			if (local187 != null) {
				Static645.anInt10469 = 2;
				Static177.anInt3435 = 0;
				Static173.anInt3410 = arg0;
				Static562.anInt9143 = arg1;
				local206 = Static64.method905(Static263.aClass49_1, Static412.aClass305_62);
				local206.aClass5_Sub41_Sub2_1.method7800(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local206.aClass5_Sub41_Sub2_1.method7848(local25);
				Static495.method7092(local206);
				Static274.method4253(local187.anIntArray307[0], 0, local187.anIntArray308[0], local187.method4599(), -2, 0, local187.method4599(), true);
			}
		}
		if (local21 == 46) {
			Static562.anInt9143 = arg1;
			Static645.anInt10469 = 2;
			Static173.anInt3410 = arg0;
			Static177.anInt3435 = 0;
			local142 = Static64.method905(Static263.aClass49_1, Static52.aClass305_12);
			local142.aClass5_Sub41_Sub2_1.method7809(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local142.aClass5_Sub41_Sub2_1.method7800(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7828(Static201.anInt3839 + local18);
			local142.aClass5_Sub41_Sub2_1.method7814(local15 + Static153.anInt3147);
			Static495.method7092(local142);
			Static84.method1815(local28, local15, local18);
		}
		if (local21 == 19) {
			local42 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local25);
			if (local42 != null) {
				local47 = local42.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				Static173.anInt3410 = arg0;
				Static177.anInt3435 = 0;
				Static562.anInt9143 = arg1;
				Static645.anInt10469 = 2;
				local64 = Static64.method905(Static263.aClass49_1, Static25.aClass305_7);
				local64.aClass5_Sub41_Sub2_1.method7800(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local64.aClass5_Sub41_Sub2_1.method7809(local25);
				Static495.method7092(local64);
				Static274.method4253(local47.anIntArray307[0], 0, local47.anIntArray308[0], local47.method4599(), -2, 0, local47.method4599(), true);
			}
		}
		if (local21 == 6) {
			local42 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local25);
			if (local42 != null) {
				local47 = local42.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				Static645.anInt10469 = 2;
				Static562.anInt9143 = arg1;
				Static173.anInt3410 = arg0;
				Static177.anInt3435 = 0;
				local64 = Static64.method905(Static263.aClass49_1, Static284.aClass305_43);
				local64.aClass5_Sub41_Sub2_1.method7850(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local64.aClass5_Sub41_Sub2_1.method7848(local25);
				Static495.method7092(local64);
				Static274.method4253(local47.anIntArray307[0], 0, local47.anIntArray308[0], local47.method4599(), -2, 0, local47.method4599(), true);
			}
		}
		if (local21 == 18 && Static244.aClass345_7 == null) {
			Static357.method5362(local15, local18);
			Static244.aClass345_7 = Static144.method2595(local18, local15);
			Static211.method3351(Static244.aClass345_7);
		}
		if (local21 == 53) {
			Static173.anInt3410 = arg0;
			Static177.anInt3435 = 0;
			Static645.anInt10469 = 2;
			Static562.anInt9143 = arg1;
			local142 = Static64.method905(Static263.aClass49_1, Static240.aClass305_41);
			local142.aClass5_Sub41_Sub2_1.method7828(Static529.anInt9069);
			local142.aClass5_Sub41_Sub2_1.method7828(Static353.anInt6392);
			local142.aClass5_Sub41_Sub2_1.method7848(local18 + Static201.anInt3839);
			local142.aClass5_Sub41_Sub2_1.method7806(Static549.anInt9003);
			local142.aClass5_Sub41_Sub2_1.method7828(local15 + Static153.anInt3147);
			local142.aClass5_Sub41_Sub2_1.method7840(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7809((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static495.method7092(local142);
			Static84.method1815(local28, local15, local18);
		}
		if (local21 == 45) {
			local339 = Static144.method2595(local18, local15);
			if (local339 != null) {
				Static424.method6285();
				@Pc(1758) Class5_Sub5 local1758 = Static84.method1822(local339);
				Static30.method365(local339, local1758.anInt508, local1758.method457());
				Static421.aString59 = Static531.method7465(local339);
				if (Static421.aString59 == null) {
					Static421.aString59 = "Null";
				}
				Static199.aString28 = local339.aString90 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 51) {
			Static177.anInt3435 = 0;
			Static173.anInt3410 = arg0;
			Static562.anInt9143 = arg1;
			Static645.anInt10469 = 2;
			local142 = Static64.method905(Static263.aClass49_1, Static336.aClass305_50);
			local142.aClass5_Sub41_Sub2_1.method7809(Static201.anInt3839 + local18);
			local142.aClass5_Sub41_Sub2_1.method7840(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7828(local15 + Static153.anInt3147);
			local142.aClass5_Sub41_Sub2_1.method7809(local25);
			Static495.method7092(local142);
			Static178.method2991(local15, local18);
		}
		if (local21 == 59) {
			local42 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local25);
			if (local42 != null) {
				local47 = local42.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				Static562.anInt9143 = arg1;
				Static645.anInt10469 = 2;
				Static173.anInt3410 = arg0;
				Static177.anInt3435 = 0;
				local64 = Static64.method905(Static263.aClass49_1, Static209.aClass305_77);
				local64.aClass5_Sub41_Sub2_1.method7850(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local64.aClass5_Sub41_Sub2_1.method7828(local25);
				Static495.method7092(local64);
				Static274.method4253(local47.anIntArray307[0], 0, local47.anIntArray308[0], local47.method4599(), -2, 0, local47.method4599(), true);
			}
		}
		if (local21 == 4) {
			if (Static105.anInt2257 > 0 && Static17.aClass252_1.method8818(82) && Static17.aClass252_1.method8818(81)) {
				Static442.method6446(local15 + Static153.anInt3147, Static201.anInt3839 + local18, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145);
			} else {
				Static177.anInt3435 = 0;
				Static562.anInt9143 = arg1;
				Static645.anInt10469 = 1;
				Static173.anInt3410 = arg0;
				local142 = Static64.method905(Static263.aClass49_1, Static378.aClass305_57);
				local142.aClass5_Sub41_Sub2_1.method7828(local15 + Static153.anInt3147);
				local142.aClass5_Sub41_Sub2_1.method7809(local18 + Static201.anInt3839);
				Static495.method7092(local142);
			}
		}
		if (local21 == 30) {
			Static562.anInt9143 = arg1;
			Static177.anInt3435 = 0;
			Static645.anInt10469 = 2;
			Static173.anInt3410 = arg0;
			local142 = Static64.method905(Static263.aClass49_1, Static491.aClass305_74);
			local142.aClass5_Sub41_Sub2_1.method7809(Static153.anInt3147 + local15);
			local142.aClass5_Sub41_Sub2_1.method7848(Static201.anInt3839 + local18);
			local142.aClass5_Sub41_Sub2_1.method7850(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7809(local25);
			Static495.method7092(local142);
			Static178.method2991(local15, local18);
		}
		if (local21 == 52 || local21 == 1012) {
			Static43.method600(local25, arg2.aString101, local18, local15);
		}
		if (local21 == 11) {
			local187 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local25];
			if (local187 != null) {
				Static173.anInt3410 = arg0;
				Static177.anInt3435 = 0;
				Static645.anInt10469 = 2;
				Static562.anInt9143 = arg1;
				local206 = Static64.method905(Static263.aClass49_1, Static207.aClass305_33);
				local206.aClass5_Sub41_Sub2_1.method7848(local25);
				local206.aClass5_Sub41_Sub2_1.method7840(Static17.aClass252_1.method8818(82) ? 1 : 0);
				Static495.method7092(local206);
				Static274.method4253(local187.anIntArray307[0], 0, local187.anIntArray308[0], local187.method4599(), -2, 0, local187.method4599(), true);
			}
		}
		if (local21 == 16) {
			if (Static105.anInt2257 > 0 && Static17.aClass252_1.method8818(82) && Static17.aClass252_1.method8818(81)) {
				Static442.method6446(local15 + Static153.anInt3147, local18 + Static201.anInt3839, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145);
			} else {
				local142 = Static362.method4083(local25, local18, local15);
				if (local25 == 1) {
					local142.aClass5_Sub41_Sub2_1.method7798(-1);
					local142.aClass5_Sub41_Sub2_1.method7798(-1);
					local142.aClass5_Sub41_Sub2_1.method7848((int) Static157.aFloat83);
					local142.aClass5_Sub41_Sub2_1.method7798(57);
					local142.aClass5_Sub41_Sub2_1.method7798(Static213.anInt9568);
					local142.aClass5_Sub41_Sub2_1.method7798(Static569.anInt9215);
					local142.aClass5_Sub41_Sub2_1.method7798(89);
					local142.aClass5_Sub41_Sub2_1.method7848(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781);
					local142.aClass5_Sub41_Sub2_1.method7848(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784);
					local142.aClass5_Sub41_Sub2_1.method7798(63);
				} else {
					Static645.anInt10469 = 1;
					Static562.anInt9143 = arg1;
					Static173.anInt3410 = arg0;
					Static177.anInt3435 = 0;
				}
				Static495.method7092(local142);
				Static274.method4253(local18, 0, local15, 1, -4, 0, 1, true);
			}
		}
		if (local21 == 3) {
			local187 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local25];
			if (local187 != null) {
				Static562.anInt9143 = arg1;
				Static173.anInt3410 = arg0;
				Static645.anInt10469 = 2;
				Static177.anInt3435 = 0;
				local206 = Static64.method905(Static263.aClass49_1, Static235.aClass305_39);
				local206.aClass5_Sub41_Sub2_1.method7798(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local206.aClass5_Sub41_Sub2_1.method7828(local25);
				Static495.method7092(local206);
				Static274.method4253(local187.anIntArray307[0], 0, local187.anIntArray308[0], local187.method4599(), -2, 0, local187.method4599(), true);
			}
		}
		if (local21 == 1007 || local21 == 1010 || local21 == 1004 || local21 == 1008 || local21 == 1006) {
			Static211.method3350(local21, local15, local25);
		}
		if (local21 == 15) {
			Static177.anInt3435 = 0;
			Static562.anInt9143 = arg1;
			Static645.anInt10469 = 2;
			Static173.anInt3410 = arg0;
			local142 = Static64.method905(Static263.aClass49_1, Static40.aClass305_10);
			local142.aClass5_Sub41_Sub2_1.method7809(local18 + Static201.anInt3839);
			local142.aClass5_Sub41_Sub2_1.method7809(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local142.aClass5_Sub41_Sub2_1.method7798(Static17.aClass252_1.method8818(82) ? 1 : 0);
			local142.aClass5_Sub41_Sub2_1.method7828(local15 + Static153.anInt3147);
			Static495.method7092(local142);
			Static84.method1815(local28, local15, local18);
		}
		if (local21 == 50) {
			local187 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local25];
			if (local187 != null) {
				Static173.anInt3410 = arg0;
				Static562.anInt9143 = arg1;
				Static645.anInt10469 = 2;
				Static177.anInt3435 = 0;
				local206 = Static64.method905(Static263.aClass49_1, Static95.aClass305_59);
				local206.aClass5_Sub41_Sub2_1.method7840(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local206.aClass5_Sub41_Sub2_1.method7828(local25);
				Static495.method7092(local206);
				Static274.method4253(local187.anIntArray307[0], 0, local187.anIntArray308[0], local187.method4599(), -2, 0, local187.method4599(), true);
			}
		}
		if (local21 == 60) {
			local42 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local25);
			if (local42 != null) {
				Static173.anInt3410 = arg0;
				local47 = local42.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				Static177.anInt3435 = 0;
				Static562.anInt9143 = arg1;
				Static645.anInt10469 = 2;
				local64 = Static64.method905(Static263.aClass49_1, Static541.aClass305_86);
				local64.aClass5_Sub41_Sub2_1.method7800(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local64.aClass5_Sub41_Sub2_1.method7814(local25);
				Static495.method7092(local64);
				Static274.method4253(local47.anIntArray307[0], 0, local47.anIntArray308[0], local47.method4599(), -2, 0, local47.method4599(), true);
			}
		}
		if (local21 == 47) {
			local187 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local25];
			if (local187 != null) {
				Static562.anInt9143 = arg1;
				Static173.anInt3410 = arg0;
				Static177.anInt3435 = 0;
				Static645.anInt10469 = 2;
				local206 = Static64.method905(Static263.aClass49_1, Static635.aClass305_100);
				local206.aClass5_Sub41_Sub2_1.method7798(Static17.aClass252_1.method8818(82) ? 1 : 0);
				local206.aClass5_Sub41_Sub2_1.method7809(local25);
				Static495.method7092(local206);
				Static274.method4253(local187.anIntArray307[0], 0, local187.anIntArray308[0], local187.method4599(), -2, 0, local187.method4599(), true);
			}
		}
		if (Static55.aBoolean60) {
			Static424.method6285();
		}
		if (Static206.aClass345_3 != null && Static308.anInt5865 == 0) {
			Static211.method3351(Static206.aClass345_3);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZIILjava/awt/Canvas;Lclient!wm;Lclient!d;)Lclient!ha;")
	public static Class65 method3307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class390 arg3, @OriginalArg(5) Interface4 arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg2 != null) {
			@Pc(17) Dimension local17 = arg2.getSize();
			local7 = local17.height;
			local5 = local17.width;
		}
		return Static215.method6962(arg1, local7, arg4, arg0, local5, arg3, arg2);
	}
}
