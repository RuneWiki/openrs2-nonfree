import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!po", name = "o", descriptor = "F")
	public static float aFloat149;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "[I")
	public static final int[] anIntArray462 = new int[25];

	@OriginalMember(owner = "client!po", name = "r", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIZ)V")
	public static void method6636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg1 == Static270.anInt5273 && arg0 == Static263.anInt5102 && (Static65.anInt1298 == Static282.anInt5422 || Static32.aClass3_Sub41_3.aClass7_Sub13_2.method5385() == 1)) {
			return;
		}
		Static263.anInt5102 = arg0;
		Static270.anInt5273 = arg1;
		Static282.anInt5422 = Static65.anInt1298;
		if (Static32.aClass3_Sub41_3.aClass7_Sub13_2.method5385() == 1) {
			Static282.anInt5422 = 0;
		}
		Static206.method3226(arg2);
		Static447.method6682(true, Static232.aClass63_6, Static369.aClass235_15.method5893(Static455.anInt7738), Static240.aClass93_4, Static266.aClass82_8);
		@Pc(66) int local66 = Static427.anInt7462;
		Static427.anInt7462 = (Static270.anInt5273 - (Static399.anInt7121 >> 4)) * 8;
		@Pc(77) int local77 = Static22.anInt329;
		Static22.anInt329 = (Static263.anInt5102 - (Static24.anInt345 >> 4)) * 8;
		Static101.aClass3_Sub7_Sub6_1 = Static598.method2538(Static270.anInt5273 * 8, Static263.anInt5102 * 8);
		Static177.aClass76_3 = null;
		@Pc(101) int local101 = Static427.anInt7462 - local66;
		@Pc(105) int local105 = Static22.anInt329 - local77;
		@Pc(124) int local124;
		@Pc(126) int local126;
		@Pc(185) int local185;
		@Pc(288) int local288;
		if (arg2 == 11) {
			for (local288 = 0; local288 < Static73.anInt1445; local288++) {
				@Pc(294) Class3_Sub43 local294 = Static179.aClass3_Sub43Array1[local288];
				if (local294 != null) {
					@Pc(299) Class9_Sub2_Sub1_Sub2_Sub2 local299 = local294.aClass9_Sub2_Sub1_Sub2_Sub2_2;
					for (local126 = 0; local126 < 10; local126++) {
						local299.anIntArray675[local126] -= local101;
						local299.anIntArray676[local126] -= local105;
					}
					local299.anInt10158 -= local105 * 512;
					local299.anInt10152 -= local101 * 512;
				}
			}
		} else {
			Static596.anInt9702 = 0;
			@Pc(112) boolean local112 = false;
			@Pc(118) int local118 = (Static399.anInt7121 - 1) * 512;
			local124 = Static24.anInt345 * 512 - 512;
			for (local126 = 0; local126 < Static73.anInt1445; local126++) {
				@Pc(132) Class3_Sub43 local132 = Static179.aClass3_Sub43Array1[local126];
				if (local132 != null) {
					@Pc(137) Class9_Sub2_Sub1_Sub2_Sub2 local137 = local132.aClass9_Sub2_Sub1_Sub2_Sub2_2;
					local137.anInt10158 -= local105 * 512;
					local137.anInt10152 -= local101 * 512;
					if (local137.anInt10152 >= 0 && local118 >= local137.anInt10152 && local137.anInt10158 >= 0 && local124 >= local137.anInt10158) {
						@Pc(183) boolean local183 = true;
						for (local185 = 0; local185 < 10; local185++) {
							local137.anIntArray675[local185] -= local101;
							local137.anIntArray676[local185] -= local105;
							if (local137.anIntArray675[local185] < 0 || local137.anIntArray675[local185] >= Static399.anInt7121 || local137.anIntArray676[local185] < 0 || Static24.anInt345 <= local137.anIntArray676[local185]) {
								local183 = false;
							}
						}
						if (local183) {
							Static43.anIntArray50[Static596.anInt9702++] = local137.anInt10204;
						} else {
							local137.method8644((Class309) null);
							local112 = true;
							local132.method8682();
						}
					} else {
						local137.method8644((Class309) null);
						local132.method8682();
						local112 = true;
					}
				}
			}
			if (local112) {
				Static73.anInt1445 = Static545.aClass25_40.method430();
				Static545.aClass25_40.method431(Static179.aClass3_Sub43Array1);
			}
		}
		for (local288 = 0; local288 < 2048; local288++) {
			@Pc(351) Class9_Sub2_Sub1_Sub2_Sub1 local351 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local288];
			if (local351 != null) {
				for (local124 = 0; local124 < 10; local124++) {
					local351.anIntArray675[local124] -= local101;
					local351.anIntArray676[local124] -= local105;
				}
				local351.anInt10152 -= local101 * 512;
				local351.anInt10158 -= local105 * 512;
			}
		}
		@Pc(401) Class118[] local401 = Static16.aClass118Array1;
		for (local124 = 0; local124 < local401.length; local124++) {
			@Pc(409) Class118 local409 = local401[local124];
			if (local409 != null) {
				local409.anInt3288 -= local105 * 512;
				local409.anInt3294 -= local101 * 512;
			}
		}
		@Pc(437) Class3_Sub26 local437;
		for (local437 = (Class3_Sub26) Static588.aClass216_70.method5457(); local437 != null; local437 = (Class3_Sub26) Static588.aClass216_70.method5458()) {
			local437.anInt5296 -= local101;
			local437.anInt5286 -= local105;
			if (Static41.anInt768 != 4 && (local437.anInt5296 < 0 || local437.anInt5286 < 0 || local437.anInt5296 >= Static399.anInt7121 || local437.anInt5286 >= Static24.anInt345)) {
				local437.method8682();
			}
		}
		for (local437 = (Class3_Sub26) Static48.aClass216_69.method5457(); local437 != null; local437 = (Class3_Sub26) Static48.aClass216_69.method5458()) {
			local437.anInt5296 -= local101;
			local437.anInt5286 -= local105;
			if (Static41.anInt768 != 4 && (local437.anInt5296 < 0 || local437.anInt5286 < 0 || Static399.anInt7121 <= local437.anInt5296 || local437.anInt5286 >= Static24.anInt345)) {
				local437.method8682();
			}
		}
		if (Static41.anInt768 != 4) {
			for (@Pc(553) Class3_Sub25 local553 = (Class3_Sub25) Static39.aClass25_8.method435(); local553 != null; local553 = (Class3_Sub25) Static39.aClass25_8.method432()) {
				@Pc(561) int local561 = (int) (local553.aLong277 & 0x3FFFL);
				@Pc(566) int local566 = local561 - Static427.anInt7462;
				local185 = (int) (local553.aLong277 >> 14 & 0x3FFFL);
				@Pc(578) int local578 = local185 - Static22.anInt329;
				if (local566 < 0 || local578 < 0 || local566 >= Static399.anInt7121 || Static24.anInt345 <= local578) {
					local553.method8682();
				}
			}
		}
		if (Static162.anInt3235 != 0) {
			Static162.anInt3235 -= local101;
			Static258.anInt5032 -= local105;
		}
		Static174.method2882();
		if (arg2 != 11) {
			Static221.anInt10164 -= local101;
			Static348.anInt6489 -= local101;
			Static522.anInt8849 -= local105 * 512;
			Static540.anInt9071 -= local105;
			Static419.anInt7345 -= local101 * 512;
			Static397.anInt7107 -= local105;
			if (Math.abs(local101) > Static399.anInt7121 || Math.abs(local105) > Static24.anInt345) {
				Static183.method2986();
			}
		} else if (Static471.anInt8064 == 4) {
			Static49.anInt971 -= local101 * 512;
			Static454.anInt7698 -= local101 * 512;
			Static94.anInt1851 -= local105 * 512;
			Static528.anInt8946 -= local105 * 512;
		} else {
			Static471.anInt8064 = 1;
			Static189.anInt3565 = -1;
			Static68.anInt1361 = -1;
		}
		Static460.method6833();
		Static218.method3802();
		Static536.aClass216_64.method5454();
		Static109.aClass216_11.method5454();
		Static169.aClass139_4.method3201();
		Static478.method7057();
	}
}
