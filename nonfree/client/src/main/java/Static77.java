import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
	public static int anInt1844 = -1;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
	public static int anInt1849 = 0;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "[I")
	public static final int[] anIntArray100 = new int[50];

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public static void method1710() {
		Static131.aClass54_8 = null;
		Static320.aClass54_22 = null;
		Static263.aClass54_15 = null;
		Static84.aClass54_5 = null;
		Static180.aClass54_10 = null;
		Static31.aClass54_2 = null;
		Static168.aClass54_9 = null;
		Static81.aClass54_4 = null;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!jf;IILclient!en;IILclient!hm;I)V")
	public static void method1711(@OriginalArg(1) Class96 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class59 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class15 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Class121 local11 = Static299.method5085(arg5);
		if (local11 == null || !local11.aBoolean255 || !local11.method3309()) {
			return;
		}
		@Pc(30) int local30;
		if (local11.anIntArray269 != null) {
			@Pc(28) int[] local28 = new int[local11.anIntArray269.length];
			@Pc(43) int local43;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static215.anInt4279 == 4) {
					local43 = (int) Static155.aFloat64 & 0x3FFF;
				} else {
					local43 = Static253.anInt4957 + (int) Static155.aFloat64 & 0x3FFF;
				}
				@Pc(53) int local53 = Class5_Sub9_Sub12.anIntArray169[local43];
				@Pc(57) int local57 = Class5_Sub9_Sub12.anIntArray170[local43];
				if (Static215.anInt4279 != 4) {
					local57 = local57 * 256 / (Static339.anInt6353 + 256);
					local53 = local53 * 256 / (Static339.anInt6353 + 256);
				}
				local28[local30 * 2] = arg0.anInt2943 / 2 + arg4 + ((arg7 - -(local11.anIntArray269[local30 * 2] * 4)) * local57 + (local11.anIntArray269[local30 * 2 + 1] * 4 + arg1) * local53 >> 15);
				local28[local30 * 2 + 1] = arg0.anInt2916 / 2 + arg2 - (local57 * (local11.anIntArray269[local30 * 2 - -1] * 4 + arg1) + -((local11.anIntArray269[local30 * 2] * 4 + arg7) * local53) >> 15);
			}
			Static174.method3297(arg3, local28, local11.anInt3565, arg0.anIntArray183, arg0.anIntArray186);
			for (local43 = 0; local43 < local28.length / 2 - 1; local43++) {
				arg3.method4809(local28[local43 * 2], local28[local43 * 2 + 1], local28[local43 * 2 + 2], local28[(local43 + 1) * 2 + 1], local11.anInt3572, arg6, arg4, arg2);
			}
			arg3.method4809(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local11.anInt3572, arg6, arg4, arg2);
		}
		@Pc(254) Class54 local254 = null;
		if (local11.anInt3562 != -1) {
			local254 = local11.method3307(arg3, false);
			if (local254 != null) {
				Static208.method3707(arg4, arg2, arg1, arg6, arg0, arg7, local254);
			}
		}
		if (local11.aString211 == null) {
			return;
		}
		local30 = 0;
		if (local254 != null) {
			local30 = local254.method5565();
		}
		@Pc(287) Class91 local287 = Static247.aClass91_9;
		@Pc(289) Class138 local289 = Static65.aClass138_3;
		if (local11.anInt3566 == 1) {
			local287 = Static62.aClass91_3;
			local289 = Static282.aClass138_7;
		}
		if (local11.anInt3566 == 2) {
			local287 = Static190.aClass91_8;
			local289 = Static337.aClass138_10;
		}
		Static27.method4645(arg1, arg7, local11.aString211, arg6, local30, arg4, arg0, arg2, local11.anInt3580, local289, local287);
		return;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIZ)V")
	public static void method1720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static138.aClass51ArrayArrayArray1 == null) {
			Static15.aClass59_1.method4835(arg0, arg3, arg1, arg2, -16777216);
			return;
		}
		Static117.anInt2497++;
		if (Static85.aClass25_Sub1_Sub1_Sub1_1 != null && Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 - (Static85.aClass25_Sub1_Sub1_Sub1_1.method4646() - 1) * 64 >> 7 == Static79.anInt1909 && Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 + 64 - Static85.aClass25_Sub1_Sub1_Sub1_1.method4646() * 64 >> 7 == Static238.anInt4612) {
			Static238.anInt4612 = -1;
			Static79.anInt1909 = -1;
			Static301.method5304();
		}
		Static278.method4726();
		if (!arg4) {
			Static51.method1139();
		}
		Static92.method1969();
		Static187.method5593(arg2, true, arg1, arg0, arg3);
		@Pc(82) int local82 = Static17.anInt5994;
		@Pc(84) int local84 = Static192.anInt3804;
		@Pc(86) int local86 = Static21.anInt6208;
		@Pc(88) int local88 = Static309.anInt5915;
		@Pc(94) int local94;
		@Pc(131) int local131;
		if (Static215.anInt4279 == 1) {
			local94 = (int) Static5.aFloat2;
			if (Static288.anInt5540 >> 8 > local94) {
				local94 = Static288.anInt5540 >> 8;
			}
			if (Static183.aBooleanArray16[4] && local94 < Static76.anIntArray410[4] + 128) {
				local94 = Static76.anIntArray410[4] + 128;
			}
			local131 = Static293.anInt5615 + (int) Static155.aFloat64 & 0x3FFF;
			Static72.method1583(Static64.anInt1546, Static66.method1393(Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773, Static156.anInt3123, Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769) - 50, local131, (local94 >> 3) * 3 + 600, local84, local94, Static259.anInt3210);
		} else if (Static215.anInt4279 == 4) {
			local94 = (int) Static5.aFloat2;
			if (local94 < Static288.anInt5540 >> 8) {
				local94 = Static288.anInt5540 >> 8;
			}
			if (Static183.aBooleanArray16[4] && local94 < Static76.anIntArray410[4] + 128) {
				local94 = Static76.anIntArray410[4] + 128;
			}
			local131 = (int) Static155.aFloat64 & 0x3FFF;
			Static72.method1583(Static64.anInt1546, Static66.method1393(Static130.anInt2662, Static156.anInt3123, Static159.anInt3220) - 50, local131, (local94 >> 3) * 3 + 600, local84, local94, Static259.anInt3210);
		} else if (Static215.anInt4279 == 5) {
			Static197.method3519(local84);
		}
		local94 = Static347.anInt6472;
		local131 = Static339.anInt6354;
		@Pc(233) int local233 = Static347.anInt6471;
		@Pc(235) int local235 = Static311.anInt6461;
		@Pc(237) int local237 = Static199.anInt3858;
		@Pc(281) int local281;
		for (@Pc(239) int local239 = 0; local239 < 5; local239++) {
			if (Static183.aBooleanArray16[local239]) {
				local281 = (int) ((double) -Static326.anIntArray533[local239] + Math.random() * (double) (Static326.anIntArray533[local239] * 2 + 1) + Math.sin((double) Static195.anIntArray278[local239] / 100.0D * (double) Static238.anIntArray366[local239]) * (double) Static76.anIntArray410[local239]);
				if (local239 == 0) {
					Static347.anInt6472 += local281;
				}
				if (local239 == 1) {
					Static339.anInt6354 += local281;
				}
				if (local239 == 4) {
					Static311.anInt6461 += local281;
					if (Static311.anInt6461 < 1024) {
						Static311.anInt6461 = 1024;
					} else if (Static311.anInt6461 > 3072) {
						Static311.anInt6461 = 3072;
					}
				}
				if (local239 == 2) {
					Static347.anInt6471 += local281;
				}
				if (local239 == 3) {
					Static199.anInt3858 = local281 + Static199.anInt3858 & 0x3FFF;
				}
			}
		}
		if (Static347.anInt6472 < 0) {
			Static347.anInt6472 = 0;
		}
		if (Static347.anInt6471 < 0) {
			Static347.anInt6471 = 0;
		}
		if (Static347.anInt6472 > (Static12.anInt378 << 7) - 1) {
			Static347.anInt6472 = (Static12.anInt378 << 7) - 1;
		}
		if ((Static248.anInt4822 << 7) - 1 < Static347.anInt6471) {
			Static347.anInt6471 = (Static248.anInt4822 << 7) - 1;
		}
		Static199.method3529();
		Static222.method3885();
		Static15.aClass59_1.method4795(local86, local82, local86 + local88, local82 + local84);
		Static15.aClass59_1.method4860();
		local281 = Static49.anInt1234;
		if (Static34.aClass129_1 == null) {
			Static15.aClass59_1.method4823(local281);
		} else {
			Static34.aClass129_1.method3484(Static15.aClass59_1, local88, local84, Static199.anInt3858, local86, local281, Static135.anInt2760 << 3, local82, Static311.anInt6461);
		}
		Static153.method2894();
		Static110.aClass112_2.method3586(Static347.anInt6472, Static339.anInt6354, Static347.anInt6471, -Static311.anInt6461 & 0x3FFF, -Static199.anInt3858 & 0x3FFF, -Static160.anInt3243 & 0x3FFF);
		Static15.aClass59_1.method4787(Static110.aClass112_2);
		Static15.aClass59_1.method4869(local88 / 2 + local86, local84 / 2 + local82, Static306.anInt5899 << 1, Static306.anInt5899 << 1);
		Static189.method3466(local86 + local88 / 2, local82 + local84 / 2, Static306.anInt5899 << 1, Static306.anInt5899 << 1);
		Static237.method4035(Static347.anInt6472, -Static311.anInt6461 & 0x3FFF, Static339.anInt6354, -Static160.anInt3243 & 0x3FFF, -Static199.anInt3858 & 0x3FFF, Static347.anInt6471);
		@Pc(509) byte local509 = Static354.method5830() == 2 ? (byte) Static117.anInt2497 : 1;
		Static52.method1173(Static15.aClass59_1, Static180.anInt3606, Static255.anInt4975, Static110.aClass112_2, Static347.anInt6472, Static339.anInt6354, Static347.anInt6471, Static293.aByteArrayArrayArray25, Static28.anIntArray40, Static346.anIntArray555, Static203.anIntArray285, Static302.anIntArray447, Static75.anIntArray97, Static156.anInt3123 + 1, local509, Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 >> 7, Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 >> 7, !Static263.aBoolean385);
		Static153.method2894();
		if (Static247.anInt3874 == 30) {
			Static354.method5833(local86, local84, local82, local88);
			Static27.method4640(local82, local86, local88, local84);
			Static262.method4497(local82, local88, local84, local86);
			Static124.method2417(local88, local84, local82, local86);
		}
		Static270.method4559();
		Static199.anInt3858 = local237;
		Static311.anInt6461 = local235;
		Static347.anInt6471 = local233;
		Static347.anInt6472 = local94;
		Static339.anInt6354 = local131;
		if (Static133.aBoolean487 && Static159.aClass7_1.method244() == 0) {
			Static133.aBoolean487 = false;
		}
		if (Static133.aBoolean487) {
			Static15.aClass59_1.method4835(local82, local86, local84, local88, -16777216);
			Static240.method4079(Static334.aString363, Static62.aClass91_3, false);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)V")
	public static void method1721() {
		@Pc(1) Class66 local1 = Static59.aClass66_20;
		synchronized (Static59.aClass66_20) {
			Static59.aClass66_20.method1944(5);
		}
		local1 = Static43.aClass66_14;
		synchronized (Static43.aClass66_14) {
			Static43.aClass66_14.method1944(5);
		}
		local1 = Static287.aClass66_96;
		synchronized (Static287.aClass66_96) {
			Static287.aClass66_96.method1944(5);
		}
	}
}
