import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
	public static int anInt7015;

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
	public static int anInt7017;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZIZIZ)V", line = 3)
	public static void method6268(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!arg2 && Static98.anInt2184 == arg1 && Static9.anInt212 == arg3 && (Static330.anInt6573 == Class2_Sub6.anInt1114 || Static203.aClass177_Sub1_2.method4496(Class2_Sub10.anInt1760))) {
			return;
		}
		Class2_Sub6.anInt1114 = Static330.anInt6573;
		Static98.anInt2184 = arg1;
		Static9.anInt212 = arg3;
		if (Static203.aClass177_Sub1_2.method4496(Class2_Sub10.anInt1760)) {
			Class2_Sub6.anInt1114 = 0;
		}
		if (arg0) {
			Static313.method5706(28);
		} else {
			Static313.method5706(25);
		}
		Static326.method5858(Static253.aClass130_4, true, Class11_Sub5_Sub3.aClass79_102.method2269(Class197.anInt5569));
		@Pc(59) int local59 = Static154.anInt3136;
		Static154.anInt3136 = (Static98.anInt2184 - (Class241.anInt7020 >> 4)) * 8;
		@Pc(70) int local70 = Static139.anInt2716;
		Static139.anInt2716 = (Static9.anInt212 - (OutputStream_Sub1.anInt4442 >> 4)) * 8;
		Static85.aClass2_Sub2_Sub17_1 = Static321.method5528(Static98.anInt2184 * 8, Static9.anInt212 * 8);
		Static33.aClass103_3 = null;
		@Pc(94) int local94 = Static154.anInt3136 - local59;
		@Pc(99) int local99 = Static139.anInt2716 - local70;
		@Pc(103) int local103;
		@Pc(113) int local113;
		if (arg0) {
			Class117.anInt3183 = 0;
			local103 = (Class241.anInt7020 - 1) * 128;
			@Pc(175) int local175 = (OutputStream_Sub1.anInt4442 - 1) * 128;
			for (local113 = 0; local113 < 32768; local113++) {
				@Pc(183) Class11_Sub5_Sub2_Sub2 local183 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local113];
				if (local183 != null) {
					local183.anInt6768 -= local94 * 128;
					local183.anInt6770 -= local99 * 128;
					if (local183.anInt6768 >= 0 && local183.anInt6768 <= local103 && local183.anInt6770 >= 0 && local183.anInt6770 <= local175) {
						@Pc(232) boolean local232 = true;
						for (@Pc(234) int local234 = 0; local234 < 10; local234++) {
							local183.anIntArray316[local234] -= local94;
							local183.anIntArray317[local234] -= local99;
							if (local183.anIntArray316[local234] < 0 || Class241.anInt7020 <= local183.anIntArray316[local234] || local183.anIntArray317[local234] < 0 || local183.anIntArray317[local234] >= OutputStream_Sub1.anInt4442) {
								local232 = false;
							}
						}
						if (local232) {
							Class149.anIntArray230[Class117.anInt3183++] = local113;
						} else {
							Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local113].method4343(null);
							Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local113] = null;
						}
					} else {
						Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local113].method4343(null);
						Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local113] = null;
					}
				}
			}
		} else {
			for (local103 = 0; local103 < 32768; local103++) {
				@Pc(109) Class11_Sub5_Sub2_Sub2 local109 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local103];
				if (local109 != null) {
					for (local113 = 0; local113 < 10; local113++) {
						local109.anIntArray316[local113] -= local94;
						local109.anIntArray317[local113] -= local99;
					}
					local109.anInt6770 -= local99 * 128;
					local109.anInt6768 -= local94 * 128;
				}
			}
		}
		for (local103 = 0; local103 < 2048; local103++) {
			@Pc(314) Class11_Sub5_Sub2_Sub1 local314 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local103];
			if (local314 != null) {
				for (local113 = 0; local113 < 10; local113++) {
					local314.anIntArray316[local113] -= local94;
					local314.anIntArray317[local113] -= local99;
				}
				local314.anInt6770 -= local99 * 128;
				local314.anInt6768 -= local94 * 128;
			}
		}
		Static347.method6263(local99, local94);
		for (@Pc(371) Class2_Sub37 local371 = (Class2_Sub37) Class145.aClass135_26.method3552(); local371 != null; local371 = (Class2_Sub37) Class145.aClass135_26.method3553()) {
			local371.anInt6472 -= local94;
			local371.anInt6474 -= local99;
			if (local371.anInt6472 < 0 || local371.anInt6474 < 0 || local371.anInt6472 >= Class241.anInt7020 || local371.anInt6474 >= OutputStream_Sub1.anInt4442) {
				local371.method6469();
			}
		}
		Class2_Sub2_Sub13.anInt4496 = 0;
		if (Class130.anInt6538 != 0) {
			Class130.anInt6538 -= local94;
			Class2_Sub3_Sub31.anInt5832 -= local99;
		}
		if (arg0) {
			Static288.anInt5798 -= local94;
			Static127.anInt6765 -= local94 * 128;
			Static116.anInt2417 -= local99;
			Static197.anInt3773 -= local99 * 128;
			Static19.anInt535 -= local99;
			Static234.anInt4689 -= local94;
			if (Math.abs(local94) > Class241.anInt7020 || Math.abs(local99) > OutputStream_Sub1.anInt4442) {
				Static323.method5829();
			}
		} else if (Static291.anInt5899 == 4) {
			Static265.anInt5451 -= local94 * 128;
			Class229.anInt6436 -= local99 * 128;
			Class2_Sub3_Sub39.anInt7251 -= local94 * 128;
			Static58.anInt2392 -= local99 * 128;
		} else {
			Static291.anInt5899 = 1;
		}
		Static150.method2957();
		Static228.method4300();
		Class92.aClass135_20.method3545();
		Class6.aClass135_38.method3545();
		Class190.aClass36_7.method1418();
		Static113.method2382();
	}
}
