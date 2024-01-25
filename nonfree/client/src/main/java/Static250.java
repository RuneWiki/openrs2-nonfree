import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_115 = new Class85("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
	public static int anInt4969 = 0;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
	public static int anInt4970 = -1;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "[I")
	public static final int[] anIntArray484 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!vg;Lclient!ea;BI)V")
	public static void method4436(@OriginalArg(0) int arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class46 local10 = arg1.method5811(arg2);
		if (local10 == null) {
			return;
		}
		arg2.method5258(arg3, arg0, arg3 + arg1.anInt6505, arg1.anInt6510 + arg0);
		if (Static271.anInt5299 == 2 || Static271.anInt5299 == 5 || Static98.aClass95_7 == null) {
			arg2.method5185(local10, arg3, arg0);
			return;
		}
		@Pc(58) int local58;
		@Pc(40) int local40;
		@Pc(55) int local55;
		@Pc(47) int local47;
		if (Static53.anInt992 == 4) {
			local58 = Static348.anInt6696;
			local40 = Static213.anInt4128;
			local55 = (int) -Static164.aFloat24 & 0x3FFF;
			local47 = 4096;
		} else {
			local40 = Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632;
			local47 = 4096 - Static9.anInt191 * 16;
			local55 = (int) -Static164.aFloat24 + Static170.anInt3407 & 0x3FFF;
			local58 = Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631;
		}
		@Pc(84) int local84 = local58 / 32 + 208 + 48 - Static22.anInt481 * 2;
		@Pc(103) int local103 = Static269.anInt5281 * 4 + 48 - (Static269.anInt5281 - 104) * 2 - local40 / 32;
		Static98.aClass95_7.method5501((float) arg1.anInt6505 / 2.0F + (float) arg3, (float) arg0 + (float) arg1.anInt6510 / 2.0F, (float) local84, (float) local103, local47, local55 << 2, local10, arg3, arg0);
		@Pc(154) int local154;
		@Pc(164) int local164;
		@Pc(175) int local175;
		@Pc(186) int local186;
		for (@Pc(137) Class5_Sub15 local137 = (Class5_Sub15) Static111.aClass103_54.method2756(); local137 != null; local137 = (Class5_Sub15) Static111.aClass103_54.method2748()) {
			@Pc(142) int local142 = local137.anInt1686;
			local154 = (Static353.aClass64_3.anIntArray122[local142] >> 14 & 0x3FFF) - Static172.anInt4394;
			local164 = (Static353.aClass64_3.anIntArray122[local142] & 0x3FFF) - Static12.anInt3797;
			local175 = local154 * 4 + 2 - local58 / 32;
			local186 = local164 * 4 + 2 - local40 / 32;
			Static131.method2337(Static353.aClass64_3.anIntArray123[local142], local186, local10, arg3, arg2, arg1, local175, arg0);
		}
		for (local154 = 0; local154 < Static76.anInt1459; local154++) {
			local164 = Static320.anIntArray595[local154] * 4 + 2 - local58 / 32;
			local175 = Static207.anIntArray393[local154] * 4 + 2 - local40 / 32;
			@Pc(241) Class156 local241 = Static111.method1967(Static127.anIntArray242[local154]);
			if (local241.anIntArray437 != null) {
				local241 = local241.method4232();
				if (local241 == null || local241.anInt4753 == -1) {
					continue;
				}
			}
			Static131.method2337(local241.anInt4753, local175, local10, arg3, arg2, arg1, local164, arg0);
		}
		for (@Pc(277) Class5_Sub29 local277 = (Class5_Sub29) Static343.aClass190_33.method5471(); local277 != null; local277 = (Class5_Sub29) Static343.aClass190_33.method5465()) {
			local175 = (int) (local277.aLong235 >> 28 & 0x3L);
			if (Static101.anInt1914 == local175) {
				local186 = (int) (local277.aLong235 & 0x3FFFL) * 4 + 2 - local58 / 32;
				@Pc(326) int local326 = (int) (local277.aLong235 >> 14 & 0x3FFFL) * 4 + 2 - local40 / 32;
				Static334.method5777(arg1, local186, local326, Static287.aClass95Array14[0], local10, arg3, arg0);
			}
		}
		@Pc(389) int local389;
		@Pc(399) int local399;
		for (local175 = 0; local175 < Static133.anInt2579; local175++) {
			@Pc(354) Class4_Sub5_Sub2_Sub2 local354 = Static280.aClass4_Sub5_Sub2_Sub2Array1[Static95.anIntArray160[local175]];
			if (local354 != null && local354.method4826()) {
				@Pc(363) Class106 local363 = local354.aClass106_1;
				if (local363 != null && local363.anIntArray326 != null) {
					local363 = local363.method2829();
				}
				if (local363 != null && local363.aBoolean242 && local363.aBoolean241) {
					local389 = local354.anInt6631 / 32 - local58 / 32;
					local399 = local354.anInt6632 / 32 - local40 / 32;
					if (local363.anInt3137 == -1) {
						Static334.method5777(arg1, local389, local399, Static287.aClass95Array14[1], local10, arg3, arg0);
					} else {
						Static131.method2337(local363.anInt3137, local399, local10, arg3, arg2, arg1, local389, arg0);
					}
				}
			}
		}
		@Pc(475) int local475;
		for (local186 = 0; local186 < Static22.anInt472; local186++) {
			@Pc(445) Class4_Sub5_Sub2_Sub1 local445 = Static62.aClass4_Sub5_Sub2_Sub1Array1[Static88.anIntArray137[local186]];
			if (local445 != null && local445.method4126()) {
				local389 = local445.anInt6631 / 32 - local58 / 32;
				local399 = local445.anInt6632 / 32 - local40 / 32;
				@Pc(473) boolean local473 = false;
				for (local475 = 0; local475 < Static44.anInt750; local475++) {
					if (local445.aString40.equals(Static85.aStringArray14[local475]) && Static60.anIntArray185[local475] != 0) {
						local473 = true;
						break;
					}
				}
				@Pc(505) boolean local505 = false;
				for (@Pc(507) int local507 = 0; local507 < Static247.anInt4953; local507++) {
					if (local445.aString40.equals(Static49.aClass157Array2[local507].aString44)) {
						local505 = true;
						break;
					}
				}
				@Pc(527) boolean local527 = false;
				if (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4575 != 0 && local445.anInt4575 != 0 && local445.anInt4575 == Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4575) {
					local527 = true;
				}
				if (local473) {
					Static334.method5777(arg1, local389, local399, Static287.aClass95Array14[3], local10, arg3, arg0);
				} else if (local505) {
					Static334.method5777(arg1, local389, local399, Static287.aClass95Array14[5], local10, arg3, arg0);
				} else if (local527) {
					Static334.method5777(arg1, local389, local399, Static287.aClass95Array14[4], local10, arg3, arg0);
				} else {
					Static334.method5777(arg1, local389, local399, Static287.aClass95Array14[2], local10, arg3, arg0);
				}
			}
		}
		@Pc(610) Class131[] local610 = Static149.aClass131Array1;
		@Pc(711) int local711;
		for (local389 = 0; local389 < local610.length; local389++) {
			@Pc(618) Class131 local618 = local610[local389];
			if (local618 != null && local618.anInt3892 != 0 && Static283.anInt5563 % 20 < 10) {
				@Pc(681) int local681;
				if (local618.anInt3892 == 1 && local618.anInt3886 >= 0 && local618.anInt3886 < Static280.aClass4_Sub5_Sub2_Sub2Array1.length) {
					@Pc(659) Class4_Sub5_Sub2_Sub2 local659 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local618.anInt3886];
					if (local659 != null) {
						local475 = local659.anInt6631 / 32 - local58 / 32;
						local681 = local659.anInt6632 / 32 - local40 / 32;
						Static258.method4530(360000, local681, arg0, local10, local618.anInt3889, arg1, local475, arg3);
					}
				}
				if (local618.anInt3892 == 2) {
					local711 = (local618.anInt3879 - Static172.anInt4394) * 4 + 2 - local58 / 32;
					local475 = (local618.anInt3885 - Static12.anInt3797) * 4 + 2 - local40 / 32;
					local681 = local618.anInt3887 * 4;
					local681 *= local681;
					Static258.method4530(local681, local475, arg0, local10, local618.anInt3889, arg1, local711, arg3);
				}
				if (local618.anInt3892 == 10 && local618.anInt3886 >= 0 && local618.anInt3886 < Static62.aClass4_Sub5_Sub2_Sub1Array1.length) {
					@Pc(768) Class4_Sub5_Sub2_Sub1 local768 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local618.anInt3886];
					if (local768 != null) {
						local475 = local768.anInt6631 / 32 - local58 / 32;
						local681 = local768.anInt6632 / 32 - local40 / 32;
						Static258.method4530(360000, local681, arg0, local10, local618.anInt3889, arg1, local475, arg3);
					}
				}
			}
		}
		if (Static53.anInt992 == 4) {
			return;
		}
		if (Static224.anInt4437 != 0) {
			local399 = Static224.anInt4437 * 4 + Static192.aClass4_Sub5_Sub2_Sub1_2.method4807() * 2 + 2 - local58 / 32 - 2;
			local711 = Static159.anInt3128 * 4 + Static192.aClass4_Sub5_Sub2_Sub1_2.method4807() * 2 + 2 - local40 / 32 - 2;
			Static334.method5777(arg1, local399, local711, Static2.aClass95Array6[Static48.aBoolean65 ? 1 : 0], local10, arg3, arg0);
		}
		arg2.method5254(3, -1, 3, arg1.anInt6505 / 2 + arg3 - 1, arg1.anInt6510 / 2 + arg0 - 1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "()V")
	public static void method4437() {
		for (@Pc(1) int local1 = 0; local1 < Static107.anInt4822; local1++) {
			@Pc(6) Class4_Sub5 local6 = Static274.aClass4_Sub5Array2[local1];
			Static326.method5657(local6);
			Static274.aClass4_Sub5Array2[local1] = null;
		}
		Static107.anInt4822 = 0;
	}
}
