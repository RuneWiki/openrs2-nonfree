import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	public static int anInt6680;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "I")
	public static int anInt6688;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "I")
	public static int anInt6689;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZBI)V")
	public static void method5196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static40.aClass53ArrayArrayArray2 == null) {
			Static16.aClass30_11.method4692(arg0, arg1, arg4, -16777216, arg2);
		} else if (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 >= 0 && Static126.anInt2569 * 128 > Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 && Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 >= 0 && Static190.anInt3697 * 128 > Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061) {
			Static203.anInt3898++;
			if (Static375.aClass6_Sub2_Sub1_Sub1_3 != null && Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 + 64 - Static375.aClass6_Sub2_Sub1_Sub1_3.method4763() * 64 >> 7 == Static454.anInt7591 && Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 - (Static375.aClass6_Sub2_Sub1_Sub1_3.method4763() - 1) * 64 >> 7 == Static52.anInt1390) {
				Static52.anInt1390 = -1;
				Static454.anInt7591 = -1;
				Static200.method2884();
			}
			Static210.method2987();
			if (!arg3) {
				Static380.method5185();
			}
			Static448.method5744();
			Static44.method896(arg1, true, arg0, arg2, arg4);
			@Pc(107) int local107 = Static267.anInt4770;
			@Pc(109) int local109 = Static3.anInt139;
			@Pc(111) int local111 = Static103.anInt2206;
			@Pc(113) int local113 = Static416.anInt7075;
			@Pc(136) int local136;
			@Pc(171) int local171;
			if (Static134.anInt2621 == 1) {
				local136 = (int) Static416.aFloat208;
				if (local136 < Static448.anInt7459 >> 8) {
					local136 = Static448.anInt7459 >> 8;
				}
				if (Static293.aBooleanArray21[4] && Static418.anIntArray625[4] + 128 > local136) {
					local136 = Static418.anIntArray625[4] + 128;
				}
				local171 = Static102.anInt2155 + (int) Static146.aFloat82 & 0x3FFF;
				Static108.method1688(local136, Static322.anInt5750, local171, local113, (local136 >> 3) * 3 + 600 << 0, Static156.anInt2980, Static222.method3109(Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062, Static221.anInt4855, Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061) - 50);
			} else if (Static134.anInt2621 == 4) {
				local136 = (int) Static416.aFloat208;
				if (Static448.anInt7459 >> 8 > local136) {
					local136 = Static448.anInt7459 >> 8;
				}
				if (Static293.aBooleanArray21[4] && local136 < Static418.anIntArray625[4] + 128) {
					local136 = Static418.anIntArray625[4] + 128;
				}
				local171 = (int) Static146.aFloat82 & 0x3FFF;
				Static108.method1688(local136, Static322.anInt5750, local171, local113, (local136 >> 3) * 3 + 600 << 0, Static156.anInt2980, Static222.method3109(Static207.anInt3914, Static221.anInt4855, Static110.anInt2331) - 50);
			} else if (Static134.anInt2621 == 5) {
				Static243.method3330(local113);
			}
			local136 = Static254.anInt4614;
			local171 = Static292.anInt5287;
			@Pc(280) int local280 = Static30.anInt696;
			@Pc(282) int local282 = Static183.anInt3503;
			@Pc(284) int local284 = Static142.anInt2687;
			@Pc(328) int local328;
			for (@Pc(286) int local286 = 0; local286 < 5; local286++) {
				if (Static293.aBooleanArray21[local286]) {
					local328 = (int) ((double) -Static411.anIntArray619[local286] + (double) (Static411.anIntArray619[local286] * 2 + 1) * Math.random() + Math.sin((double) Static313.anIntArray484[local286] * ((double) Static98.anIntArray131[local286] / 100.0D)) * (double) Static418.anIntArray625[local286]);
					if (local286 == 0) {
						Static254.anInt4614 += local328;
					}
					if (local286 == 3) {
						Static142.anInt2687 = Static142.anInt2687 + local328 & 0x3FFF;
					}
					if (local286 == 4) {
						Static183.anInt3503 += local328;
						if (Static183.anInt3503 < 1024) {
							Static183.anInt3503 = 1024;
						} else if (Static183.anInt3503 > 3072) {
							Static183.anInt3503 = 3072;
						}
					}
					if (local286 == 2) {
						Static30.anInt696 += local328;
					}
					if (local286 == 1) {
						Static292.anInt5287 += local328;
					}
				}
			}
			if (Static254.anInt4614 < 0) {
				Static254.anInt4614 = 0;
			}
			if (Static30.anInt696 < 0) {
				Static30.anInt696 = 0;
			}
			if ((Static301.anInt5434 << 7) - 1 < Static254.anInt4614) {
				Static254.anInt4614 = (Static301.anInt5434 << 7) - 1;
			}
			if ((Static241.anInt4414 << 7) - 1 < Static30.anInt696) {
				Static30.anInt696 = (Static241.anInt4414 << 7) - 1;
			}
			Static388.method5239();
			Static153.method2272();
			Static16.aClass30_11.pa(local107, local109, local111 + local107, local109 + local113);
			Static16.aClass30_11.method4700();
			local328 = Static197.anInt6471;
			if (Static132.aClass129_1 == null) {
				Static16.aClass30_11.M(local328);
			} else {
				Static132.aClass129_1.method2797(Static142.anInt2687, local111, Static183.anInt3503, local328, local109, Static16.aClass30_11, local113, Static300.anInt5429 << 3, local107);
			}
			Static10.method281();
			Static248.aClass116_3.Q(Static254.anInt4614, Static292.anInt5287, Static30.anInt696, -Static183.anInt3503 & 0x3FFF, -Static142.anInt2687 & 0x3FFF, -Static185.anInt6759 & 0x3FFF);
			Static16.aClass30_11.m(Static248.aClass116_3);
			Static16.aClass30_11.GA(local111 / 2 + local107, local109 + local113 / 2, Static114.anInt2419 << 1, Static114.anInt2419 << 1);
			Static45.method979(local111 / 2 + local107, Static114.anInt2419 << 1, Static114.anInt2419 << 1, local109 + local113 / 2);
			Static285.method3978(-Static142.anInt2687 & 0x3FFF, Static30.anInt696, -Static185.anInt6759 & 0x3FFF, -Static183.anInt3503 & 0x3FFF, Static292.anInt5287, Static254.anInt4614);
			@Pc(563) byte local563 = Static126.aClass67_Sub1_1.method4535(Static286.anInt5207) == 2 ? (byte) Static203.anInt3898 : 1;
			Static356.method4974(Static16.aClass30_11, Static175.anInt3261, Static11.anInt379, Static248.aClass116_3, Static254.anInt4614, Static292.anInt5287, Static30.anInt696, Static275.aByteArrayArrayArray8, Static68.anIntArray382, Static385.anIntArray500, Static322.anIntArray502, Static90.anIntArray123, Static254.anIntArray385, Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 + 1, local563, Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 >> 7, Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 >> 7, !Static126.aClass67_Sub1_1.aBoolean395);
			Static10.method281();
			if (Static73.anInt1749 == 30) {
				Static5.method161(local107, local109, local111, local113);
				Static455.method5876(local111, local109, local107, local113);
				Static192.method5860(local113, local111, local109, local107);
				Static13.method318(local107, local109, local111, local113);
			}
			Static324.method5210();
			Static292.anInt5287 = local171;
			Static254.anInt4614 = local136;
			Static30.anInt696 = local280;
			Static183.anInt3503 = local282;
			Static142.anInt2687 = local284;
			if (Static65.aBoolean113 && Static366.aClass125_3.method2618() == 0) {
				Static65.aBoolean113 = false;
			}
			if (Static65.aBoolean113) {
				Static16.aClass30_11.method4692(local111, local113, local107, -16777216, local109);
				Static309.method4260(Static390.aClass105_7, Static104.aClass242_28.method5320(Static139.anInt2670), false);
			}
		} else {
			Static16.aClass30_11.method4692(arg0, arg1, arg4, -16777216, arg2);
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
	public static void method5197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class196 local18 = new Class196(16);
		for (@Pc(23) Class4_Sub20 local23 = (Class4_Sub20) Static437.aClass196_41.method4482(); local23 != null; local23 = (Class4_Sub20) Static437.aClass196_41.method4472()) {
			local23.method5854();
			@Pc(34) int local34 = (int) (local23.aLong225 >> 28);
			@Pc(45) int local45 = (int) (local23.aLong225 >> 14 & 0x3FFFL) - arg1;
			@Pc(54) int local54 = (int) (local23.aLong225 & 0x3FFFL) - arg0;
			if (local54 >= 0 && local45 >= 0 && Static126.anInt2569 > local54 && Static190.anInt3697 > local45) {
				local18.method4474((long) (local54 | local34 << 28 | local45 << 14), local23);
			}
		}
		Static437.aClass196_41 = local18;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Lclient!pj;")
	public static Class41_Sub6 method5198(@OriginalArg(0) int arg0) {
		@Pc(14) Class27[] local14 = Class84_Sub1.aClass27Array1;
		synchronized (Class84_Sub1.aClass27Array1) {
			@Pc(30) Class41_Sub6 local30;
			if (Class84_Sub1.aClass27Array1.length <= arg0 || Class84_Sub1.aClass27Array1[arg0].method731()) {
				local30 = new Class41_Sub6();
				local30.aClass41_Sub4Array1 = new Class41_Sub4[arg0];
				for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
					local30.aClass41_Sub4Array1[local36] = new Class41_Sub4();
				}
			} else {
				local30 = (Class41_Sub6) Class84_Sub1.aClass27Array1[arg0].method732();
				local30.method5818();
				@Pc(69) int local69 = Static5.anIntArray15[arg0]--;
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!ic;)Ljava/lang/String;")
	public static String method5199(@OriginalArg(1) Class4_Sub21 arg0) {
		return arg0.aString36 == null || arg0.aString36.length() <= 0 ? arg0.aString35 : arg0.aString35 + Static387.aClass242_96.method5320(Static139.anInt2670) + arg0.aString36;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V")
	public static void method5200(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg0, 12);
		local8.method2761();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIIZ)I")
	public static int method5201(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class4_Sub39 local10 = Static195.method2229(arg0, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray589.length; local18++) {
			if (local10.anIntArray589[local18] >= 0 && local10.anIntArray589[local18] < Static390.aClass204_2.anInt5967) {
				@Pc(44) Class127 local44 = Static390.aClass204_2.method4629(local10.anIntArray589[local18]);
				@Pc(54) int local54 = local44.method2741(Static110.aClass262_1.method5689(arg1).anInt7035, arg1);
				if (arg2) {
					local16 += local10.anIntArray588[local18] * local54;
				} else {
					local16 += local54;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!jb;I)V")
	public static void method5202(@OriginalArg(0) Class126 arg0) {
		if (arg0.anInt3426 == 5 && arg0.anInt3395 != -1) {
			Static384.method4838(arg0, Static16.aClass30_11);
		}
	}
}
