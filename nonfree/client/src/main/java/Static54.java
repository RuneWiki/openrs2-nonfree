import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	public static int anInt778;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
	public static final int[] anIntArray109 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)Z")
	public static boolean method702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static421.method5391(arg1, arg0) | (arg0 & 0x10000) != 0 || Static157.method2094(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static275.method3737(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!hm;Lclient!za;III)V")
	public static void method705(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class73 local12 = arg0.method2116(arg1);
		if (local12 == null) {
			return;
		}
		arg1.ba(arg3, arg2, arg3 + arg0.anInt2648, arg0.anInt2606 + arg2);
		if (Static61.anInt7291 == 2 || Static61.anInt7291 == 5 || Static353.aClass85_17 == null) {
			arg1.ra(-16777216, local12, arg3, arg2);
			return;
		}
		@Pc(63) int local63;
		@Pc(60) int local60;
		@Pc(71) int local71;
		@Pc(57) int local57;
		if (Static139.anInt2147 == 4) {
			local57 = 4096;
			local63 = Static75.anInt1065;
			local60 = Static4.anInt58;
			local71 = (int) -Static99.aFloat9 & 0x3FFF;
		} else {
			local57 = 4096 - Static265.anInt4616 * 16;
			local60 = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430;
			local63 = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428;
			local71 = Static20.anInt301 + (int) -Static99.aFloat9 & 0x3FFF;
		}
		@Pc(98) int local98 = local63 / 32 + 208 + 48 - Static147.anInt2300 * 2;
		@Pc(116) int local116 = Static293.anInt4886 * 4 + 48 - (Static293.anInt4886 - 104) * 2 - local60 / 32;
		Static353.aClass85_17.method5409((float) arg0.anInt2648 / 2.0F + (float) arg3, (float) arg0.anInt2606 / 2.0F + (float) arg2, (float) local98, (float) local116, local57, local71 << 2, local12, arg3, arg2);
		@Pc(167) int local167;
		@Pc(177) int local177;
		@Pc(187) int local187;
		@Pc(198) int local198;
		for (@Pc(150) Class1_Sub18 local150 = (Class1_Sub18) Static278.aClass14_39.method203(); local150 != null; local150 = (Class1_Sub18) Static278.aClass14_39.method208()) {
			@Pc(155) int local155 = local150.anInt2354;
			local167 = (Static376.aClass144_3.anIntArray289[local155] >> 14 & 0x3FFF) - Static315.anInt5207;
			local177 = (Static376.aClass144_3.anIntArray289[local155] & 0x3FFF) - Static47.anInt676;
			local187 = local167 * 4 + 2 - local63 / 32;
			local198 = local177 * 4 + 2 - local60 / 32;
			Static55.method765(local187, local198, local12, arg1, Static376.aClass144_3.anIntArray290[local155], arg0, arg3, arg2);
		}
		for (local167 = 0; local167 < Static122.anInt1845; local167++) {
			local177 = Static270.anIntArray172[local167] * 4 + 2 - local63 / 32;
			local187 = Static361.anIntArray440[local167] * 4 + 2 - local60 / 32;
			@Pc(256) Class87 local256 = Static86.aClass248_7.method5246(Static365.anIntArray447[local167]);
			if (local256.anIntArray170 != null) {
				local256 = local256.method1571(Static32.aClass4_1);
				if (local256 == null || local256.anInt1929 == -1) {
					continue;
				}
			}
			Static55.method765(local177, local187, local12, arg1, local256.anInt1929, arg0, arg3, arg2);
		}
		@Pc(340) int local340;
		@Pc(351) int local351;
		for (@Pc(292) Class1_Sub32 local292 = (Class1_Sub32) Static402.aClass208_37.method4414(); local292 != null; local292 = (Class1_Sub32) Static402.aClass208_37.method4410()) {
			local187 = (int) (local292.aLong236 >> 28 & 0x3L);
			if (Static190.anInt3500 == local187) {
				local198 = (int) (local292.aLong236 & 0x3FFFL) - Static315.anInt5207;
				@Pc(329) int local329 = (int) (local292.aLong236 >> 14 & 0x3FFFL) - Static47.anInt676;
				local340 = local198 * 4 + 2 - local63 / 32;
				local351 = local329 * 4 + 2 - local60 / 32;
				Static72.method928(local340, arg0, arg3, local12, Static20.aClass85Array1[0], arg2, local351);
			}
		}
		@Pc(443) int local443;
		for (local187 = 0; local187 < Static137.anInt2142; local187++) {
			@Pc(384) Class1_Sub44 local384 = (Class1_Sub44) Static46.aClass208_33.method4405((long) Static135.anIntArray183[local187]);
			if (local384 != null) {
				@Pc(389) Class11_Sub1_Sub3_Sub1 local389 = local384.aClass11_Sub1_Sub3_Sub1_2;
				if (local389.method1300() && Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 == local389.aByte90) {
					@Pc(407) Class272 local407 = local389.aClass272_1;
					if (local407 != null && local407.anIntArray543 != null) {
						local407 = local407.method5900(Static32.aClass4_1);
					}
					if (local407 != null && local407.aBoolean632 && local407.aBoolean638) {
						local351 = local389.anInt6428 / 32 - local63 / 32;
						local443 = local389.anInt6430 / 32 - local60 / 32;
						if (local407.anInt7312 == -1) {
							Static72.method928(local351, arg0, arg3, local12, Static20.aClass85Array1[1], arg2, local443);
						} else {
							Static55.method765(local351, local443, local12, arg1, local407.anInt7312, arg0, arg3, arg2);
						}
					}
				}
			}
		}
		local198 = Static103.anInt6434;
		@Pc(487) int[] local487 = Static56.anIntArray110;
		@Pc(536) int local536;
		@Pc(540) int local540;
		@Pc(572) int local572;
		for (local340 = 0; local340 < local198; local340++) {
			@Pc(497) Class11_Sub1_Sub3_Sub2 local497 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local487[local340]];
			if (local497 != null && local497.method2647() && Static94.aClass11_Sub1_Sub3_Sub2_1 != local497 && Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 == local497.aByte90) {
				local443 = local497.anInt6428 / 32 - local63 / 32;
				local536 = local497.anInt6430 / 32 - local60 / 32;
				@Pc(538) boolean local538 = false;
				for (local540 = 0; local540 < Static148.anInt2307; local540++) {
					if (local497.aString32.equals(Static108.aStringArray10[local540]) && Static284.anIntArray359[local540] != 0) {
						local538 = true;
						break;
					}
				}
				@Pc(570) boolean local570 = false;
				for (local572 = 0; local572 < Static362.anInt5836; local572++) {
					if (local497.aString32.equals(Static126.aClass180Array1[local572].aString56)) {
						local570 = true;
						break;
					}
				}
				@Pc(596) boolean local596 = false;
				if (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3370 != 0 && local497.anInt3370 != 0 && local497.anInt3370 == Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3370) {
					local596 = true;
				}
				if (local497.aBoolean328) {
					Static72.method928(local443, arg0, arg3, local12, Static20.aClass85Array1[6], arg2, local536);
				} else if (local538) {
					Static72.method928(local443, arg0, arg3, local12, Static20.aClass85Array1[3], arg2, local536);
				} else if (local570) {
					Static72.method928(local443, arg0, arg3, local12, Static20.aClass85Array1[5], arg2, local536);
				} else if (local596) {
					Static72.method928(local443, arg0, arg3, local12, Static20.aClass85Array1[4], arg2, local536);
				} else {
					Static72.method928(local443, arg0, arg3, local12, Static20.aClass85Array1[2], arg2, local536);
				}
			}
		}
		@Pc(699) Class78[] local699 = Static13.aClass78Array1;
		@Pc(781) int local781;
		for (local443 = 0; local443 < local699.length; local443++) {
			@Pc(707) Class78 local707 = local699[local443];
			if (local707 != null && local707.anInt1697 != 0 && Static98.anInt1304 % 20 < 10) {
				@Pc(746) int local746;
				if (local707.anInt1697 == 1) {
					@Pc(731) Class1_Sub44 local731 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local707.anInt1704);
					if (local731 != null) {
						@Pc(736) Class11_Sub1_Sub3_Sub1 local736 = local731.aClass11_Sub1_Sub3_Sub1_2;
						local746 = local736.anInt6428 / 32 - local63 / 32;
						local572 = local736.anInt6430 / 32 - local60 / 32;
						Static316.method4176(local12, local572, local746, arg2, local707.anInt1701, arg0, arg3, 360000L);
					}
				}
				if (local707.anInt1697 == 2) {
					local781 = local707.anInt1703 / 32 - local63 / 32;
					local540 = local707.anInt1700 / 32 - local60 / 32;
					@Pc(797) long local797 = (long) (local707.anInt1705 << 5);
					@Pc(801) long local801 = local797 * local797;
					Static316.method4176(local12, local540, local781, arg2, local707.anInt1701, arg0, arg3, local801);
				}
				if (local707.anInt1697 == 10 && local707.anInt1704 >= 0 && local707.anInt1704 < Static399.aClass11_Sub1_Sub3_Sub2Array1.length) {
					@Pc(834) Class11_Sub1_Sub3_Sub2 local834 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local707.anInt1704];
					if (local834 != null) {
						local540 = local834.anInt6428 / 32 - local63 / 32;
						local746 = local834.anInt6430 / 32 - local60 / 32;
						Static316.method4176(local12, local746, local540, arg2, local707.anInt1701, arg0, arg3, 360000L);
					}
				}
			}
		}
		if (Static139.anInt2147 == 4) {
			return;
		}
		if (Static460.anInt7364 != 0) {
			local536 = Static460.anInt7364 * 4 + (Static94.aClass11_Sub1_Sub3_Sub2_1.method2635() + -1) * 2 + 2 - local63 / 32;
			local781 = Static288.anInt4834 * 4 + Static94.aClass11_Sub1_Sub3_Sub2_1.method2635() * 2 + 2 - local60 / 32 - 2;
			Static72.method928(local536, arg0, arg3, local12, Static97.aClass85Array6[Static207.aBoolean358 ? 1 : 0], arg2, local781);
		}
		arg1.method5664(3, arg0.anInt2606 / 2 + arg2 - 1, -1, 3, arg0.anInt2648 / 2 + arg3 - 1);
		return;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)I")
	public static int method706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return ((arg1 >>> 31) + arg1) % arg0 + local16;
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
	public static void method708() {
		Static181.aClass1_Sub9_Sub3_2.method4629();
		Static270.anInt1979 = 1;
		Static371.aClass185_97 = null;
	}
}
