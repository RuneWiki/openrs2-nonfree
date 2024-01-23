import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "Lclient!to;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
	public static int anInt508;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!bo;")
	public static Class24 aClass24_1 = new Class24();

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray5 = new String[1000];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)J")
	public static long method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass61_1 == null ? 0L : local7.aClass61_1.aLong65;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method482() {
		for (@Pc(3) int local3 = 0; local3 < Static17.anInt300; local3++) {
			@Pc(18) int local18 = Static158.anIntArray179[local3];
			@Pc(22) Class22_Sub3_Sub1 local22 = Static265.aClass22_Sub3_Sub1Array1[local18];
			@Pc(26) int local26 = Static237.aClass1_Sub14_Sub1_7.method2595();
			if ((local26 & 0x40) != 0) {
				local26 += Static237.aClass1_Sub14_Sub1_7.method2595() << 8;
			}
			@Pc(52) int local52;
			@Pc(64) int local64;
			if ((local26 & 0x10) != 0) {
				local52 = Static237.aClass1_Sub14_Sub1_7.method2626();
				if (local52 == 65535) {
					local52 = -1;
				}
				local64 = Static237.aClass1_Sub14_Sub1_7.method2646();
				Static216.method3405(local22, local52, local64);
			}
			if ((local26 & 0x20) != 0) {
				local52 = Static237.aClass1_Sub14_Sub1_7.method2614();
				if (local52 == 65535) {
					local52 = -1;
				}
				@Pc(88) boolean local88 = true;
				local64 = Static237.aClass1_Sub14_Sub1_7.method2635();
				if (local52 != -1 && local22.anInt4562 != -1 && Static313.method4648(Static239.method3759(local52).anInt2712).anInt5114 < Static313.method4648(Static239.method3759(local22.anInt4562).anInt2712).anInt5114) {
					local88 = false;
				}
				if (local88) {
					local22.anInt4596 = 0;
					local22.anInt4619 = 0;
					local22.anInt4569 = local64 >> 16;
					local22.anInt4575 = Static37.anInt757 + (local64 & 0xFFFF);
					if (Static37.anInt757 < local22.anInt4575) {
						local22.anInt4619 = -1;
					}
					local22.anInt4562 = local52;
					local22.anInt4607 = 1;
					if (local22.anInt4562 != -1 && local22.anInt4575 == Static37.anInt757) {
						@Pc(181) int local181 = Static239.method3759(local22.anInt4562).anInt2712;
						if (local181 != -1) {
							@Pc(191) Class167 local191 = Static313.method4648(local181);
							if (local191 != null && local191.anIntArray461 != null) {
								Static212.method3338(local22.anInt4601, false, 0, local191, local22.anInt4623);
							}
						}
					}
				}
			}
			if ((local26 & 0x1) != 0) {
				if (local22.aClass112_1.method2822()) {
					Static12.method177(local22);
				}
				local22.method3118(Static195.method3169(Static237.aClass1_Sub14_Sub1_7.method2593()));
				local22.method3654(local22.aClass112_1.anInt3495);
				local22.anInt4611 = local22.aClass112_1.anInt3493;
				local22.anInt4646 = local22.aClass112_1.anInt3528;
				if (local22.aClass112_1.method2822()) {
					Static277.method4118(local22.anIntArray427[0], local22, Static295.anInt5586, local22.anIntArray424[0], 0, null, 0, null);
				}
			}
			if ((local26 & 0x100) != 0) {
				local22.anInt4617 = Static237.aClass1_Sub14_Sub1_7.method2593();
				local22.anInt4624 = Static237.aClass1_Sub14_Sub1_7.method2626();
			}
			if ((local26 & 0x2) != 0) {
				local22.aString150 = Static237.aClass1_Sub14_Sub1_7.method2605();
				local22.anInt4636 = 100;
			}
			if ((local26 & 0x4) != 0) {
				local22.anInt4638 = Static237.aClass1_Sub14_Sub1_7.method2593();
				if (local22.anInt4638 == 65535) {
					local22.anInt4638 = -1;
				}
			}
			if ((local26 & 0x200) != 0) {
				local52 = Static237.aClass1_Sub14_Sub1_7.method2627();
				@Pc(330) int[] local330 = new int[local52];
				@Pc(333) int[] local333 = new int[local52];
				@Pc(336) int[] local336 = new int[local52];
				for (@Pc(338) int local338 = 0; local338 < local52; local338++) {
					@Pc(345) int local345 = Static237.aClass1_Sub14_Sub1_7.method2593();
					if (local345 == 65535) {
						local345 = -1;
					}
					local330[local338] = local345;
					local333[local338] = Static237.aClass1_Sub14_Sub1_7.method2627();
					local336[local338] = Static237.aClass1_Sub14_Sub1_7.method2593();
				}
				Static14.method206(local22, local330, local336, local333);
			}
			if ((local26 & 0x8) != 0) {
				local52 = Static237.aClass1_Sub14_Sub1_7.method2595();
				local64 = Static237.aClass1_Sub14_Sub1_7.method2595();
				local22.method3648(Static37.anInt757, local64, local52);
				local22.anInt4594 = Static37.anInt757 + 300;
				local22.anInt4647 = Static237.aClass1_Sub14_Sub1_7.method2596();
			}
			if ((local26 & 0x80) != 0) {
				local52 = Static237.aClass1_Sub14_Sub1_7.method2596();
				local64 = Static237.aClass1_Sub14_Sub1_7.method2596();
				local22.method3648(Static37.anInt757, local64, local52);
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIZII)V")
	public static void method483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static123.anInt2494 = arg5;
		Static223.anInt4332 = arg4;
		Static290.anInt5495 = arg1;
		Static238.anInt4828 = arg2;
		Static23.anInt440 = arg0;
		if (arg3 && Static290.anInt5495 >= 100) {
			Static243.anInt5653 = Static123.anInt2494 * 128 + 64;
			Static105.anInt2016 = Static23.anInt440 * 128 + 64;
			Static141.anInt2760 = Static104.method1648(Static295.anInt5586, Static243.anInt5653, Static105.anInt2016) - Static238.anInt4828;
		}
		Static101.anInt1895 = 2;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)I")
	public static int method484() {
		return ((Static315.anInt5926 == 0 ? 0 : 1) << 22) + ((Static223.anInt4334 == 0 ? 0 : 1) << 20) + ((Static119.aBoolean428 ? 1 : 0) << 19) + (Static157.anInt3329 << 17) + ((Static143.anInt2823 & 0x3) << 11) + ((Static285.aBoolean387 ? 1 : 0) << 10) + ((Static215.aBoolean288 ? 1 : 0) << 9) + ((Static101.aBoolean145 ? 1 : 0) << 7) + ((Static280.aBoolean383 ? 1 : 0) << 6) + ((Static289.aBoolean394 ? 1 : 0) << 5) + ((Static85.aBoolean121 ? 1 : 0) << 3) + (Static287.anInt5449 & 0x7) + ((Static106.aBoolean159 ? 1 : 0) << 4) - (-((Static244.aBoolean348 ? 1 : 0) << 8) - ((Static302.aBoolean419 ? 1 : 0) << 13)) + ((Static311.aBoolean427 ? 1 : 0) << 15) + ((Static269.aBoolean27 ? 1 : 0) << 16) + ((Static311.anInt5846 == 0 ? 0 : 1) << 21) + (Static149.method2401() << 23);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method485(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static82.aString50 = arg1;
		Static251.anInt4923 = arg2;
		Static250.aString104 = arg0;
		if (Static82.aString50.equals("") || Static250.aString104.equals("")) {
			Static213.anInt4207 = 3;
		} else if (Static108.anInt2138 == -1) {
			Static213.anInt4207 = -3;
			Static57.anInt1127 = 0;
			Static207.anInt4071 = 0;
			Static152.anInt3136 = 1;
			@Pc(47) Class1_Sub14 local47 = new Class1_Sub14(128);
			local47.method2631(10);
			local47.method2630((int) (Math.random() * 9.9999999E7D));
			local47.method2603(Static267.method3977(Static82.aString50));
			local47.method2630((int) (Math.random() * 9.9999999E7D));
			local47.method2619(Static250.aString104);
			local47.method2630((int) (Math.random() * 9.9999999E7D));
			local47.method2600(Static164.aBigInteger1, Static195.aBigInteger2);
			Static137.aClass1_Sub14_Sub1_6.anInt3290 = 0;
			Static137.aClass1_Sub14_Sub1_6.method2631(24);
			Static137.aClass1_Sub14_Sub1_6.method2631(local47.anInt3290 + 2);
			Static137.aClass1_Sub14_Sub1_6.method2637(552);
			Static137.aClass1_Sub14_Sub1_6.method2625(local47.anInt3290, local47.aByteArray34);
		} else {
			Static115.method1842();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILclient!ph;)Z")
	public static boolean method486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class138 arg2) {
		@Pc(9) byte[] local9 = arg2.method3346(arg0, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static79.method1216(local9);
			return true;
		}
	}
}
