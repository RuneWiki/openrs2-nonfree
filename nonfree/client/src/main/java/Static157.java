import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "[I")
	public static int[] anIntArray396 = new int[1000];

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	public static int anInt4311 = -1;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public static int anInt4313 = 0;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	public static int anInt4315 = 0;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray123 = new int[104][104];

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1104 = Static8.method128("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!u", name = "m", descriptor = "Lclient!ef;")
	public static Class20 aClass20_12 = null;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)I")
	public static int method2925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (arg1 + local7) / arg0 - local7;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)V")
	public static void method2928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static147.method2775();
		Static63.method2001(arg2, arg1, arg2 + Static69.aClass1_Sub1_Sub8_Sub1_2.anInt1435, arg1 - -Static69.aClass1_Sub1_Sub8_Sub1_2.anInt1432);
		if (Static169.anInt4604 == 2 || Static169.anInt4604 == 5) {
			Static63.method2005(arg2 + 25, arg1 + 5, Static89.anIntArray238, Static153.anIntArray390);
		} else {
			@Pc(33) int local33 = Static180.anInt4777 + Static98.anInt3021 & 0x7FF;
			@Pc(40) int local40 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 / 32 + 48;
			@Pc(48) int local48 = 464 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 / 32;
			Static86.aClass1_Sub1_Sub8_Sub3_2.method1649(arg2 + 25, arg1 + 5, 146, 151, local40, local48, local33, Static160.anInt4384 + 256, Static89.anIntArray238, Static153.anIntArray390);
			@Pc(85) int local85;
			@Pc(99) int local99;
			for (@Pc(69) int local69 = 0; local69 < Static59.anInt819; local69++) {
				local85 = anIntArray396[local69] * 4 + 2 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 / 32;
				local99 = Static163.anIntArray404[local69] * 4 + 2 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 / 32;
				Static178.method3191(arg1, local85, Static54.aClass1_Sub1_Sub8_Sub3Array3[local69], arg2, local99);
			}
			@Pc(158) int local158;
			@Pc(146) int local146;
			for (local85 = 0; local85 < 104; local85++) {
				for (local99 = 0; local99 < 104; local99++) {
					@Pc(132) Class59 local132 = Static105.aClass59ArrayArrayArray1[Static9.anInt295][local85][local99];
					if (local132 != null) {
						local146 = local99 * 4 + 2 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 / 32;
						local158 = local85 * 4 + 2 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 / 32;
						Static178.method3191(arg1, local158, Static147.aClass1_Sub1_Sub8_Sub3Array8[0], arg2, local146);
					}
				}
			}
			@Pc(231) int local231;
			for (local99 = 0; local99 < Static155.anInt4267; local99++) {
				@Pc(185) Class1_Sub1_Sub5_Sub1_Sub1 local185 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[Static150.anIntArray382[local99]];
				if (local185 != null && local185.method2479()) {
					@Pc(194) Class1_Sub1_Sub15 local194 = local185.aClass1_Sub1_Sub15_1;
					if (local194 != null && local194.anIntArray338 != null) {
						local194 = local194.method2589();
					}
					if (local194 != null && local194.aBoolean164 && local194.aBoolean163) {
						local146 = local185.anInt3579 / 32 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 / 32;
						local231 = local185.anInt3558 / 32 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 / 32;
						Static178.method3191(arg1, local146, Static147.aClass1_Sub1_Sub8_Sub3Array8[1], arg2, local231);
					}
				}
			}
			@Pc(254) Class1_Sub1_Sub5_Sub1_Sub2 local254;
			for (@Pc(246) int local246 = 0; local246 < Static45.anInt1553; local246++) {
				local254 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[Static58.anIntArray140[local246]];
				if (local254 != null && local254.method2479()) {
					local231 = local254.anInt3558 / 32 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 / 32;
					local146 = local254.anInt3579 / 32 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 / 32;
					@Pc(283) boolean local283 = false;
					@Pc(288) long local288 = local254.aClass18_908.method727();
					for (@Pc(290) int local290 = 0; local290 < Static20.anInt570; local290++) {
						if (Static146.aLongArray5[local290] == local288 && Static20.anIntArray43[local290] != 0) {
							local283 = true;
							break;
						}
					}
					@Pc(323) boolean local323 = false;
					if (Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3627 != 0 && local254.anInt3627 != 0 && local254.anInt3627 == Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3627) {
						local323 = true;
					}
					if (local283) {
						Static178.method3191(arg1, local146, Static147.aClass1_Sub1_Sub8_Sub3Array8[3], arg2, local231);
					} else if (local323) {
						Static178.method3191(arg1, local146, Static147.aClass1_Sub1_Sub8_Sub3Array8[4], arg2, local231);
					} else {
						Static178.method3191(arg1, local146, Static147.aClass1_Sub1_Sub8_Sub3Array8[2], arg2, local231);
					}
				}
			}
			if (Static118.anInt3373 != 0 && Static41.anInt1322 % 20 < 10) {
				if (Static118.anInt3373 == 1 && Static111.anInt3245 >= 0 && Static111.anInt3245 < Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1.length) {
					@Pc(401) Class1_Sub1_Sub5_Sub1_Sub1 local401 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[Static111.anInt3245];
					if (local401 != null) {
						local231 = local401.anInt3558 / 32 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 / 32;
						local146 = local401.anInt3579 / 32 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 / 32;
						Static10.method178(arg2, local146, arg1, local231, Static108.aClass1_Sub1_Sub8_Sub3Array4[1]);
					}
				}
				if (Static118.anInt3373 == 2) {
					local158 = (Static87.anInt2639 - Static117.anInt3328) * 4 + 2 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 / 32;
					local146 = (Static146.anInt4048 - Static110.anInt3227) * 4 + 2 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 / 32;
					Static10.method178(arg2, local158, arg1, local146, Static108.aClass1_Sub1_Sub8_Sub3Array4[1]);
				}
				if (Static118.anInt3373 == 10 && Static5.anInt157 >= 0 && Static5.anInt157 < Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1.length) {
					local254 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[Static5.anInt157];
					if (local254 != null) {
						local146 = local254.anInt3579 / 32 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 / 32;
						local231 = local254.anInt3558 / 32 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 / 32;
						Static10.method178(arg2, local146, arg1, local231, Static108.aClass1_Sub1_Sub8_Sub3Array4[1]);
					}
				}
			}
			if (Static161.anInt4393 != 0) {
				local146 = Static166.anInt4506 * 4 + 2 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 / 32;
				local158 = Static161.anInt4393 * 4 + 2 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 / 32;
				Static178.method3191(arg1, local158, Static108.aClass1_Sub1_Sub8_Sub3Array4[0], arg2, local146);
			}
			Static63.method1990(arg2 + 93 + 4, arg1 - 4 + 82, 3, 3, 16777215);
		}
		if (Static169.anInt4604 < 3) {
			Static145.aClass1_Sub1_Sub8_Sub3_7.method1649(arg2, arg1, 33, 33, 25, 25, Static98.anInt3021, 256, Static2.anIntArray3, Static144.anIntArray371);
		} else {
			Static63.method2005(arg2, arg1, Static2.anIntArray3, Static144.anIntArray371);
		}
		if (Static169.aBooleanArray15[arg0]) {
			Static69.aClass1_Sub1_Sub8_Sub1_2.method919(arg2, arg1);
		}
		Static9.aBooleanArray1[arg0] = true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method2930() {
		anIntArray396 = null;
		aClass18_1104 = null;
		aClass20_12 = null;
		anIntArrayArray123 = null;
	}
}
