import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!gf", name = "w", descriptor = "Lclient!ai;")
	public static Class7 aClass7_11;

	@OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
	public static int anInt1615 = -1;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ai;ILclient!ai;)I")
	public static int method1171(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method3239(Static168.anInt3648)) {
			local5++;
		}
		if (arg1.method3239(Static158.anInt3539)) {
			local5++;
		}
		if (arg1.method3239(Static102.anInt2348)) {
			local5++;
		}
		if (arg1.method3239(Static42.anInt904)) {
			local5++;
		}
		if (arg1.method3239(Static87.anInt2031)) {
			local5++;
		}
		if (arg1.method3239(Static88.anInt2051)) {
			local5++;
		}
		arg1.method3239(Static74.anInt1831);
		arg1.method3239(Static55.anInt1477);
		arg1.method3239(Static218.anInt4729);
		arg1.method3239(Static92.anInt2174);
		arg1.method3239(Static92.anInt2176);
		return local5;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public static void method1172(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static203.anIntArray563[arg0];
		@Pc(14) int local14 = Static38.anIntArray129[arg0];
		@Pc(18) int local18 = Static171.aShortArray50[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		@Pc(29) int local29 = (int) Static77.aLongArray4[arg0];
		@Pc(33) long local33 = Static77.aLongArray4[arg0];
		if (local18 == 38) {
			Static96.aClass1_Sub9_Sub1_3.method953(112);
			Static96.aClass1_Sub9_Sub1_3.method890(local10);
			Static96.aClass1_Sub9_Sub1_3.method911(local14);
			Static96.aClass1_Sub9_Sub1_3.method902(local29);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		if (local18 == 45) {
			Static72.method1314(local10, local14, local33);
			Static96.aClass1_Sub9_Sub1_3.method953(13);
			Static96.aClass1_Sub9_Sub1_3.method902((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static96.aClass1_Sub9_Sub1_3.method914(local10 + Static128.anInt2813);
			Static96.aClass1_Sub9_Sub1_3.method914(Static163.anInt3587 + local14);
		}
		@Pc(115) Class9_Sub4_Sub2 local115;
		if (local18 == 50) {
			local115 = Static1.aClass9_Sub4_Sub2Array1[local29];
			if (local115 != null) {
				Static149.method2551(local115.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local115.anIntArray510[0], 1, 0);
				Static154.anInt3436 = 0;
				Static129.anInt1190 = Static166.anInt3603;
				Static147.anInt3278 = 2;
				Static122.anInt2728 = Static39.anInt882;
				Static96.aClass1_Sub9_Sub1_3.method953(30);
				Static96.aClass1_Sub9_Sub1_3.method914(Static163.anInt3585);
				Static96.aClass1_Sub9_Sub1_3.method911(Static55.anInt1474);
				Static96.aClass1_Sub9_Sub1_3.method914(local29);
				Static96.aClass1_Sub9_Sub1_3.method902(Static217.anInt4660);
			}
		}
		if (local18 == 17) {
			local115 = Static1.aClass9_Sub4_Sub2Array1[local29];
			if (local115 != null) {
				Static149.method2551(local115.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local115.anIntArray510[0], 1, 0);
				Static154.anInt3436 = 0;
				Static147.anInt3278 = 2;
				Static122.anInt2728 = Static39.anInt882;
				Static129.anInt1190 = Static166.anInt3603;
				Static96.aClass1_Sub9_Sub1_3.method953(71);
				Static96.aClass1_Sub9_Sub1_3.method890(local29);
			}
		}
		if (local18 == 1005) {
			Static122.anInt2728 = Static39.anInt882;
			Static129.anInt1190 = Static166.anInt3603;
			Static147.anInt3278 = 2;
			Static154.anInt3436 = 0;
			Static96.aClass1_Sub9_Sub1_3.method953(191);
			Static96.aClass1_Sub9_Sub1_3.method890(local29);
		}
		if (local18 == 10) {
			Static72.method1314(local10, local14, local33);
			Static96.aClass1_Sub9_Sub1_3.method953(94);
			Static96.aClass1_Sub9_Sub1_3.method943(Static128.anInt2813 + local10);
			Static96.aClass1_Sub9_Sub1_3.method890(local14 + Static163.anInt3587);
			Static96.aClass1_Sub9_Sub1_3.method902(Integer.MAX_VALUE & (int) (local33 >>> 32));
		}
		@Pc(323) boolean local323;
		if (local18 == 57) {
			local323 = Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 0, local10, 0, 0);
			if (!local323) {
				Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local10, 1, 0);
			}
			Static129.anInt1190 = Static166.anInt3603;
			Static154.anInt3436 = 0;
			Static122.anInt2728 = Static39.anInt882;
			Static147.anInt3278 = 2;
			Static96.aClass1_Sub9_Sub1_3.method953(77);
			Static96.aClass1_Sub9_Sub1_3.method902(local29);
			Static96.aClass1_Sub9_Sub1_3.method902(local14 + Static163.anInt3587);
			Static96.aClass1_Sub9_Sub1_3.method890(local10 + Static128.anInt2813);
		}
		if (local18 == 7) {
			Static96.aClass1_Sub9_Sub1_3.method953(4);
			Static96.aClass1_Sub9_Sub1_3.method890(Static217.anInt4660);
			Static96.aClass1_Sub9_Sub1_3.method943(local29);
			Static96.aClass1_Sub9_Sub1_3.method943(Static163.anInt3585);
			Static96.aClass1_Sub9_Sub1_3.method911(local14);
			Static96.aClass1_Sub9_Sub1_3.method943(local10);
			Static96.aClass1_Sub9_Sub1_3.method921(Static55.anInt1474);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		@Pc(429) boolean local429;
		@Pc(427) Class6 local427;
		if (local18 == 3) {
			local427 = Static107.method1857(local14);
			local429 = true;
			if (local427.anInt245 > 0) {
				local429 = Static4.method77(local427);
			}
			if (local429) {
				Static96.aClass1_Sub9_Sub1_3.method953(109);
				Static96.aClass1_Sub9_Sub1_3.method921(local14);
			}
		}
		if (local18 == 2) {
			Static96.aClass1_Sub9_Sub1_3.method953(160);
			Static96.aClass1_Sub9_Sub1_3.method902(local10);
			Static96.aClass1_Sub9_Sub1_3.method937(local14);
			Static96.aClass1_Sub9_Sub1_3.method943(local29);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		if (local18 == 35) {
			Static96.aClass1_Sub9_Sub1_3.method953(205);
			Static96.aClass1_Sub9_Sub1_3.method914(local29);
			Static96.aClass1_Sub9_Sub1_3.method943(local10);
			Static96.aClass1_Sub9_Sub1_3.method910(local14);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		if (local18 == 14) {
			Static72.method1314(local10, local14, local33);
			Static96.aClass1_Sub9_Sub1_3.method953(53);
			Static96.aClass1_Sub9_Sub1_3.method890((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static96.aClass1_Sub9_Sub1_3.method902(local14 + Static163.anInt3587);
			Static96.aClass1_Sub9_Sub1_3.method902(local10 + Static128.anInt2813);
		}
		if (local18 == 41) {
			local115 = Static1.aClass9_Sub4_Sub2Array1[local29];
			if (local115 != null) {
				Static149.method2551(local115.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local115.anIntArray510[0], 1, 0);
				Static154.anInt3436 = 0;
				Static147.anInt3278 = 2;
				Static129.anInt1190 = Static166.anInt3603;
				Static122.anInt2728 = Static39.anInt882;
				Static96.aClass1_Sub9_Sub1_3.method953(145);
				Static96.aClass1_Sub9_Sub1_3.method937(Static27.anInt640);
				Static96.aClass1_Sub9_Sub1_3.method914(local29);
				Static96.aClass1_Sub9_Sub1_3.method890(Static96.anInt2254);
			}
		}
		if (local18 == 1007) {
			Static154.anInt3436 = 0;
			Static147.anInt3278 = 2;
			Static122.anInt2728 = Static39.anInt882;
			Static129.anInt1190 = Static166.anInt3603;
			Static96.aClass1_Sub9_Sub1_3.method953(166);
			Static96.aClass1_Sub9_Sub1_3.method943(local29);
		}
		if (local18 == 42) {
			local323 = Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 0, local10, 0, 0);
			if (!local323) {
				Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local10, 1, 0);
			}
			Static129.anInt1190 = Static166.anInt3603;
			Static147.anInt3278 = 2;
			Static122.anInt2728 = Static39.anInt882;
			Static154.anInt3436 = 0;
			Static96.aClass1_Sub9_Sub1_3.method953(39);
			Static96.aClass1_Sub9_Sub1_3.method914(Static128.anInt2813 + local10);
			Static96.aClass1_Sub9_Sub1_3.method943(local29);
			Static96.aClass1_Sub9_Sub1_3.method902(local14 + Static163.anInt3587);
		}
		if (local18 == 15) {
			local323 = Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 0, local10, 0, 0);
			if (!local323) {
				Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local10, 1, 0);
			}
			Static122.anInt2728 = Static39.anInt882;
			Static147.anInt3278 = 2;
			Static154.anInt3436 = 0;
			Static129.anInt1190 = Static166.anInt3603;
			Static96.aClass1_Sub9_Sub1_3.method953(138);
			Static96.aClass1_Sub9_Sub1_3.method943(Static163.anInt3587 + local14);
			Static96.aClass1_Sub9_Sub1_3.method890(local29);
			Static96.aClass1_Sub9_Sub1_3.method943(local10 + Static128.anInt2813);
		}
		if (local18 == 30 && Static72.method1314(local10, local14, local33)) {
			Static96.aClass1_Sub9_Sub1_3.method953(234);
			Static96.aClass1_Sub9_Sub1_3.method914((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static96.aClass1_Sub9_Sub1_3.method914(Static96.anInt2254);
			Static96.aClass1_Sub9_Sub1_3.method910(Static27.anInt640);
			Static96.aClass1_Sub9_Sub1_3.method914(local10 + Static128.anInt2813);
			Static96.aClass1_Sub9_Sub1_3.method890(local14 + Static163.anInt3587);
		}
		if (local18 == 43) {
			local115 = Static1.aClass9_Sub4_Sub2Array1[local29];
			if (local115 != null) {
				Static149.method2551(local115.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local115.anIntArray510[0], 1, 0);
				Static154.anInt3436 = 0;
				Static122.anInt2728 = Static39.anInt882;
				Static129.anInt1190 = Static166.anInt3603;
				Static147.anInt3278 = 2;
				Static96.aClass1_Sub9_Sub1_3.method953(195);
				Static96.aClass1_Sub9_Sub1_3.method890(local29);
			}
		}
		if (local18 == 1) {
			Static96.aClass1_Sub9_Sub1_3.method953(154);
			Static96.aClass1_Sub9_Sub1_3.method921(local14);
			Static96.aClass1_Sub9_Sub1_3.method902(local29);
			Static96.aClass1_Sub9_Sub1_3.method902(local10);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		@Pc(941) Class9_Sub4_Sub1 local941;
		if (local18 == 16) {
			local941 = Static41.aClass9_Sub4_Sub1Array2[local29];
			if (local941 != null) {
				Static149.method2551(local941.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local941.anIntArray510[0], 1, 0);
				Static147.anInt3278 = 2;
				Static129.anInt1190 = Static166.anInt3603;
				Static154.anInt3436 = 0;
				Static122.anInt2728 = Static39.anInt882;
				Static96.aClass1_Sub9_Sub1_3.method953(204);
				Static96.aClass1_Sub9_Sub1_3.method902(local29);
			}
		}
		if (local18 == 39) {
			local115 = Static1.aClass9_Sub4_Sub2Array1[local29];
			if (local115 != null) {
				Static149.method2551(local115.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local115.anIntArray510[0], 1, 0);
				Static122.anInt2728 = Static39.anInt882;
				Static147.anInt3278 = 2;
				Static154.anInt3436 = 0;
				Static129.anInt1190 = Static166.anInt3603;
				Static96.aClass1_Sub9_Sub1_3.method953(78);
				Static96.aClass1_Sub9_Sub1_3.method943(local29);
			}
		}
		if (local18 == 36) {
			Static72.method1314(local10, local14, local33);
			Static96.aClass1_Sub9_Sub1_3.method953(169);
			Static96.aClass1_Sub9_Sub1_3.method890(local14 + Static163.anInt3587);
			Static96.aClass1_Sub9_Sub1_3.method914(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static96.aClass1_Sub9_Sub1_3.method902(Static128.anInt2813 + local10);
		}
		if (local18 == 20) {
			local427 = Static92.method1619(local14, local10);
			if (local427 != null) {
				Static68.method1236();
				Static143.method2453(local14, Static161.method2696(Static166.method2717(local427)), local10);
				Static79.anInt1905 = 0;
				Static36.aClass60_1324 = Static149.method2552(local427);
				if (Static36.aClass60_1324 == null) {
					Static36.aClass60_1324 = Static126.aClass60_954;
				}
				if (local427.aBoolean13) {
					Static73.aClass60_561 = Static34.method611(new Class60[] { local427.aClass60_79, Static187.aClass60_1347 });
					return;
				}
				Static73.aClass60_561 = Static34.method611(new Class60[] { Static194.aClass60_1399, local427.aClass60_80, Static187.aClass60_1347 });
			}
			return;
		}
		if (local18 == 33) {
			Static96.aClass1_Sub9_Sub1_3.method953(196);
			Static96.aClass1_Sub9_Sub1_3.method902(Static96.anInt2254);
			Static96.aClass1_Sub9_Sub1_3.method921(Static27.anInt640);
			Static96.aClass1_Sub9_Sub1_3.method911(local14);
			Static96.aClass1_Sub9_Sub1_3.method943(local10);
		}
		if (local18 == 5) {
			Static96.aClass1_Sub9_Sub1_3.method953(150);
			Static96.aClass1_Sub9_Sub1_3.method910(local14);
			Static96.aClass1_Sub9_Sub1_3.method902(local10);
			Static96.aClass1_Sub9_Sub1_3.method890(local29);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		if (local18 == 9) {
			local941 = Static41.aClass9_Sub4_Sub1Array2[local29];
			if (local941 != null) {
				Static149.method2551(local941.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local941.anIntArray510[0], 1, 0);
				Static129.anInt1190 = Static166.anInt3603;
				Static147.anInt3278 = 2;
				Static122.anInt2728 = Static39.anInt882;
				Static154.anInt3436 = 0;
				Static96.aClass1_Sub9_Sub1_3.method953(6);
				Static96.aClass1_Sub9_Sub1_3.method902(local29);
				Static96.aClass1_Sub9_Sub1_3.method943(Static96.anInt2254);
				Static96.aClass1_Sub9_Sub1_3.method911(Static27.anInt640);
			}
		}
		if (local18 == 58) {
			Static96.aClass1_Sub9_Sub1_3.method953(55);
			Static96.aClass1_Sub9_Sub1_3.method914(local10);
			Static96.aClass1_Sub9_Sub1_3.method937(local14);
			Static96.aClass1_Sub9_Sub1_3.method943(local29);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		if (local18 == 19) {
			local115 = Static1.aClass9_Sub4_Sub2Array1[local29];
			if (local115 != null) {
				Static149.method2551(local115.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local115.anIntArray510[0], 1, 0);
				Static154.anInt3436 = 0;
				Static129.anInt1190 = Static166.anInt3603;
				Static122.anInt2728 = Static39.anInt882;
				Static147.anInt3278 = 2;
				Static96.aClass1_Sub9_Sub1_3.method953(33);
				Static96.aClass1_Sub9_Sub1_3.method914(local29);
			}
		}
		if (local18 == 44) {
			local323 = Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 0, local10, 0, 0);
			if (!local323) {
				Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local10, 1, 0);
			}
			Static122.anInt2728 = Static39.anInt882;
			Static147.anInt3278 = 2;
			Static154.anInt3436 = 0;
			Static129.anInt1190 = Static166.anInt3603;
			Static96.aClass1_Sub9_Sub1_3.method953(211);
			Static96.aClass1_Sub9_Sub1_3.method902(Static128.anInt2813 + local10);
			Static96.aClass1_Sub9_Sub1_3.method914(Static163.anInt3587 + local14);
			Static96.aClass1_Sub9_Sub1_3.method902(local29);
		}
		if (local18 == 6) {
			local941 = Static41.aClass9_Sub4_Sub1Array2[local29];
			if (local941 != null) {
				Static149.method2551(local941.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local941.anIntArray510[0], 1, 0);
				Static147.anInt3278 = 2;
				Static129.anInt1190 = Static166.anInt3603;
				Static122.anInt2728 = Static39.anInt882;
				Static154.anInt3436 = 0;
				Static96.aClass1_Sub9_Sub1_3.method953(214);
				Static96.aClass1_Sub9_Sub1_3.method943(local29);
			}
		}
		if (local18 == 31) {
			Static96.aClass1_Sub9_Sub1_3.method953(109);
			Static96.aClass1_Sub9_Sub1_3.method921(local14);
			local427 = Static107.method1857(local14);
			if (local427.anIntArrayArray6 != null && local427.anIntArrayArray6[0][0] == 5) {
				@Pc(1538) int local1538 = local427.anIntArrayArray6[0][1];
				Static126.anIntArray358[local1538] = 1 - Static126.anIntArray358[local1538];
				Static193.method3013(local1538);
			}
		}
		if (local18 == 29) {
			local941 = Static41.aClass9_Sub4_Sub1Array2[local29];
			if (local941 != null) {
				Static149.method2551(local941.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local941.anIntArray510[0], 1, 0);
				Static122.anInt2728 = Static39.anInt882;
				Static147.anInt3278 = 2;
				Static154.anInt3436 = 0;
				Static129.anInt1190 = Static166.anInt3603;
				Static96.aClass1_Sub9_Sub1_3.method953(118);
				Static96.aClass1_Sub9_Sub1_3.method943(local29);
			}
		}
		if (local18 == 8) {
			local941 = Static41.aClass9_Sub4_Sub1Array2[local29];
			if (local941 != null) {
				Static149.method2551(local941.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local941.anIntArray510[0], 1, 0);
				Static129.anInt1190 = Static166.anInt3603;
				Static147.anInt3278 = 2;
				Static154.anInt3436 = 0;
				Static122.anInt2728 = Static39.anInt882;
				Static96.aClass1_Sub9_Sub1_3.method953(192);
				Static96.aClass1_Sub9_Sub1_3.method943(Static217.anInt4660);
				Static96.aClass1_Sub9_Sub1_3.method937(Static55.anInt1474);
				Static96.aClass1_Sub9_Sub1_3.method890(Static163.anInt3585);
				Static96.aClass1_Sub9_Sub1_3.method890(local29);
			}
		}
		if (local18 == 24) {
			Static96.aClass1_Sub9_Sub1_3.method953(32);
			Static96.aClass1_Sub9_Sub1_3.method902(local29);
			Static96.aClass1_Sub9_Sub1_3.method921(local14);
			Static96.aClass1_Sub9_Sub1_3.method902(local10);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		if (local18 == 28) {
			Static96.aClass1_Sub9_Sub1_3.method953(35);
			Static96.aClass1_Sub9_Sub1_3.method902(local29);
			Static96.aClass1_Sub9_Sub1_3.method890(Static96.anInt2254);
			Static96.aClass1_Sub9_Sub1_3.method910(Static27.anInt640);
			Static96.aClass1_Sub9_Sub1_3.method943(local10);
			Static96.aClass1_Sub9_Sub1_3.method910(local14);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		if (local18 == 32) {
			local941 = Static41.aClass9_Sub4_Sub1Array2[local29];
			if (local941 != null) {
				Static149.method2551(local941.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local941.anIntArray510[0], 1, 0);
				Static154.anInt3436 = 0;
				Static147.anInt3278 = 2;
				Static122.anInt2728 = Static39.anInt882;
				Static129.anInt1190 = Static166.anInt3603;
				Static96.aClass1_Sub9_Sub1_3.method953(151);
				Static96.aClass1_Sub9_Sub1_3.method890(local29);
			}
		}
		if (local18 == 25) {
			Static96.aClass1_Sub9_Sub1_3.method953(26);
			Static96.aClass1_Sub9_Sub1_3.method890(local10);
			Static96.aClass1_Sub9_Sub1_3.method890(local29);
			Static96.aClass1_Sub9_Sub1_3.method921(local14);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		if (local18 == 51) {
			Static96.aClass1_Sub9_Sub1_3.method953(251);
			Static96.aClass1_Sub9_Sub1_3.method890(local10);
			Static96.aClass1_Sub9_Sub1_3.method943(local29);
			Static96.aClass1_Sub9_Sub1_3.method921(local14);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		if (local18 == 1006) {
			Static154.anInt3436 = 0;
			Static129.anInt1190 = Static166.anInt3603;
			Static122.anInt2728 = Static39.anInt882;
			Static147.anInt3278 = 2;
			local115 = Static1.aClass9_Sub4_Sub2Array1[local29];
			if (local115 != null) {
				@Pc(1891) Class1_Sub1_Sub9 local1891 = local115.aClass1_Sub1_Sub9_1;
				if (local1891.anIntArray295 != null) {
					local1891 = local1891.method1739();
				}
				if (local1891 != null) {
					Static96.aClass1_Sub9_Sub1_3.method953(127);
					Static96.aClass1_Sub9_Sub1_3.method914(local1891.anInt2305);
				}
			}
		}
		if (local18 == 26 && Static168.aClass6_14 == null) {
			Static3.method56(local14, local10);
			Static168.aClass6_14 = Static92.method1619(local14, local10);
			Static57.method1068(Static168.aClass6_14);
		}
		if (local18 == 34) {
			local115 = Static1.aClass9_Sub4_Sub2Array1[local29];
			if (local115 != null) {
				Static149.method2551(local115.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local115.anIntArray510[0], 1, 0);
				Static129.anInt1190 = Static166.anInt3603;
				Static147.anInt3278 = 2;
				Static154.anInt3436 = 0;
				Static122.anInt2728 = Static39.anInt882;
				Static96.aClass1_Sub9_Sub1_3.method953(164);
				Static96.aClass1_Sub9_Sub1_3.method890(local29);
			}
		}
		if (local18 == 18) {
			Static68.method1236();
			local427 = Static107.method1857(local14);
			Static55.anInt1474 = local14;
			Static79.anInt1905 = 1;
			Static163.anInt3585 = local10;
			Static217.anInt4660 = local29;
			Static57.method1068(local427);
			Static108.aClass60_809 = Static34.method611(new Class60[] { Static211.aClass60_1198, Static191.method2990(local29).aClass60_1043, Static187.aClass60_1347 });
			if (Static108.aClass60_809 == null) {
				Static108.aClass60_809 = Static159.aClass60_1222;
			}
			return;
		}
		if (local18 == 40) {
			local323 = Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 0, local10, 0, 0);
			if (!local323) {
				Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local10, 1, 0);
			}
			Static122.anInt2728 = Static39.anInt882;
			Static147.anInt3278 = 2;
			Static154.anInt3436 = 0;
			Static129.anInt1190 = Static166.anInt3603;
			Static96.aClass1_Sub9_Sub1_3.method953(84);
			Static96.aClass1_Sub9_Sub1_3.method890(local10 + Static128.anInt2813);
			Static96.aClass1_Sub9_Sub1_3.method890(local29);
			Static96.aClass1_Sub9_Sub1_3.method914(Static163.anInt3587 + local14);
			Static96.aClass1_Sub9_Sub1_3.method937(Static27.anInt640);
			Static96.aClass1_Sub9_Sub1_3.method914(Static96.anInt2254);
		}
		if (local18 == 4) {
			local941 = Static41.aClass9_Sub4_Sub1Array2[local29];
			if (local941 != null) {
				Static149.method2551(local941.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local941.anIntArray510[0], 1, 0);
				Static147.anInt3278 = 2;
				Static129.anInt1190 = Static166.anInt3603;
				Static122.anInt2728 = Static39.anInt882;
				Static154.anInt3436 = 0;
				Static96.aClass1_Sub9_Sub1_3.method953(47);
				Static96.aClass1_Sub9_Sub1_3.method902(local29);
			}
		}
		if (local18 == 23) {
			local323 = Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 0, local10, 0, 0);
			if (!local323) {
				Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local10, 1, 0);
			}
			Static122.anInt2728 = Static39.anInt882;
			Static147.anInt3278 = 2;
			Static154.anInt3436 = 0;
			Static129.anInt1190 = Static166.anInt3603;
			Static96.aClass1_Sub9_Sub1_3.method953(107);
			Static96.aClass1_Sub9_Sub1_3.method914(Static163.anInt3587 + local14);
			Static96.aClass1_Sub9_Sub1_3.method914(local29);
			Static96.aClass1_Sub9_Sub1_3.method902(Static128.anInt2813 + local10);
		}
		if (local18 == 1002) {
			Static72.method1314(local10, local14, local33);
			Static96.aClass1_Sub9_Sub1_3.method953(97);
			Static96.aClass1_Sub9_Sub1_3.method902(local14 + Static163.anInt3587);
			Static96.aClass1_Sub9_Sub1_3.method902((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static96.aClass1_Sub9_Sub1_3.method914(local10 + Static128.anInt2813);
		}
		if (local18 == 48) {
			local941 = Static41.aClass9_Sub4_Sub1Array2[local29];
			if (local941 != null) {
				Static149.method2551(local941.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local941.anIntArray510[0], 1, 0);
				Static122.anInt2728 = Static39.anInt882;
				Static129.anInt1190 = Static166.anInt3603;
				Static147.anInt3278 = 2;
				Static154.anInt3436 = 0;
				Static96.aClass1_Sub9_Sub1_3.method953(161);
				Static96.aClass1_Sub9_Sub1_3.method943(local29);
			}
		}
		if (local18 == 49 || local18 == 1001) {
			Static138.method2371(local14, local10, Static52.aClass60Array8[arg0], local29);
		}
		@Pc(2381) Class6 local2381;
		if (local18 == 1003) {
			local2381 = Static107.method1857(local14);
			if (local2381 == null || local2381.anIntArray26[local10] < 100000) {
				Static96.aClass1_Sub9_Sub1_3.method953(191);
				Static96.aClass1_Sub9_Sub1_3.method890(local29);
			} else {
				Static13.method239(Static149.aClass60_1155, Static34.method611(new Class60[] { Static40.method681(local2381.anIntArray26[local10]), Static95.aClass60_1153, Static191.method2990(local29).aClass60_1043 }), 0);
			}
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		if (local18 == 37 && Static72.method1314(local10, local14, local33)) {
			Static96.aClass1_Sub9_Sub1_3.method953(170);
			Static96.aClass1_Sub9_Sub1_3.method943(Static163.anInt3587 + local14);
			Static96.aClass1_Sub9_Sub1_3.method921(Static55.anInt1474);
			Static96.aClass1_Sub9_Sub1_3.method902(Static128.anInt2813 + local10);
			Static96.aClass1_Sub9_Sub1_3.method914(Static163.anInt3585);
			Static96.aClass1_Sub9_Sub1_3.method943((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static96.aClass1_Sub9_Sub1_3.method902(Static217.anInt4660);
		}
		if (local18 == 22) {
			Static96.aClass1_Sub9_Sub1_3.method953(216);
			Static96.aClass1_Sub9_Sub1_3.method910(local14);
			Static96.aClass1_Sub9_Sub1_3.method914(local10);
			Static96.aClass1_Sub9_Sub1_3.method902(local29);
			Static155.anInt3460 = 0;
			Static105.aClass6_11 = Static107.method1857(local14);
			Static147.anInt3280 = local10;
		}
		if (local18 == 12) {
			Static82.method1454();
		}
		@Pc(2536) Class9_Sub4_Sub1 local2536;
		if (local18 == 13) {
			local2536 = Static41.aClass9_Sub4_Sub1Array2[local29];
			if (local2536 != null) {
				Static149.method2551(local2536.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local2536.anIntArray510[0], 1, 0);
				Static147.anInt3278 = 2;
				Static122.anInt2728 = Static39.anInt882;
				Static129.anInt1190 = Static166.anInt3603;
				Static154.anInt3436 = 0;
				Static96.aClass1_Sub9_Sub1_3.method953(114);
				Static96.aClass1_Sub9_Sub1_3.method890(local29);
			}
		}
		if (local18 == 47) {
			local2536 = Static41.aClass9_Sub4_Sub1Array2[local29];
			if (local2536 != null) {
				Static149.method2551(local2536.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local2536.anIntArray510[0], 1, 0);
				Static122.anInt2728 = Static39.anInt882;
				Static147.anInt3278 = 2;
				Static129.anInt1190 = Static166.anInt3603;
				Static154.anInt3436 = 0;
				Static96.aClass1_Sub9_Sub1_3.method953(65);
				Static96.aClass1_Sub9_Sub1_3.method914(local29);
			}
		}
		if (local18 == 11) {
			Static2.method51(Static180.anInt3841, local10, local14);
		}
		if (local18 == 21) {
			Static96.aClass1_Sub9_Sub1_3.method953(109);
			Static96.aClass1_Sub9_Sub1_3.method921(local14);
			local2381 = Static107.method1857(local14);
			if (local2381.anIntArrayArray6 != null && local2381.anIntArrayArray6[0][0] == 5) {
				@Pc(2685) int local2685 = local2381.anIntArrayArray6[0][1];
				if (local2381.anIntArray29[0] != Static126.anIntArray358[local2685]) {
					Static126.anIntArray358[local2685] = local2381.anIntArray29[0];
					Static193.method3013(local2685);
				}
			}
		}
		if (local18 == 46) {
			local429 = Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 0, local10, 0, 0);
			if (!local429) {
				Static149.method2551(local14, 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local10, 1, 0);
			}
			Static129.anInt1190 = Static166.anInt3603;
			Static147.anInt3278 = 2;
			Static122.anInt2728 = Static39.anInt882;
			Static154.anInt3436 = 0;
			Static96.aClass1_Sub9_Sub1_3.method953(176);
			Static96.aClass1_Sub9_Sub1_3.method914(Static163.anInt3587 + local14);
			Static96.aClass1_Sub9_Sub1_3.method910(Static55.anInt1474);
			Static96.aClass1_Sub9_Sub1_3.method914(Static163.anInt3585);
			Static96.aClass1_Sub9_Sub1_3.method902(Static128.anInt2813 + local10);
			Static96.aClass1_Sub9_Sub1_3.method902(Static217.anInt4660);
			Static96.aClass1_Sub9_Sub1_3.method914(local29);
		}
		if (Static79.anInt1905 != 0) {
			Static79.anInt1905 = 0;
			Static57.method1068(Static107.method1857(Static55.anInt1474));
		}
		if (Static75.aBoolean98) {
			Static68.method1236();
		}
		if (Static105.aClass6_11 != null && Static155.anInt3460 == 0) {
			Static57.method1068(Static105.aClass6_11);
		}
	}
}
