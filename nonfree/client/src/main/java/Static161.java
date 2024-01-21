import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "Z")
	public static boolean aBoolean197;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1134 = Static8.method128("(U1");

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	public static int anInt4393 = 0;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1135 = Static8.method128(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1136 = Static8.method128("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1138 = Static8.method128("level)2");

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1137 = aClass18_1138;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "Lclient!ef;")
	public static Class20 aClass20_13 = null;

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1139 = Static8.method128("blinken3:");

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
	public static int anInt4407 = 0;

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1140 = Static8.method128(":assistreq:");

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Z")
	public static boolean method2989(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIII)V")
	public static void method2990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static87.aClass68_1.method2648(arg4, arg3, arg2);
		@Pc(20) int local20;
		@Pc(53) int local53;
		@Pc(26) int local26;
		@Pc(22) int local22;
		@Pc(40) int local40;
		@Pc(62) int local62;
		if (local11 != 0) {
			local20 = Static87.aClass68_1.method2657(arg4, arg3, arg2, local11);
			local22 = arg0;
			local26 = local20 & 0x1F;
			local40 = arg3 * 4 + (103 - arg2) * 2048 + 24624;
			if (local11 > 0) {
				local22 = arg1;
			}
			local53 = local20 >> 6 & 0x3;
			@Pc(56) int[] local56 = Static86.aClass1_Sub1_Sub8_Sub3_2.anIntArray203;
			local62 = local11 >> 14 & 0x7FFF;
			@Pc(66) Class1_Sub1_Sub11 local66 = Static62.method1274(local62);
			if (local66.anInt2797 == -1) {
				if (local26 == 0 || local26 == 2) {
					if (local53 == 0) {
						local56[local40] = local22;
						local56[local40 + 512] = local22;
						local56[local40 + 1024] = local22;
						local56[local40 + 1536] = local22;
					} else if (local53 == 1) {
						local56[local40] = local22;
						local56[local40 + 1] = local22;
						local56[local40 + 2] = local22;
						local56[local40 + 3] = local22;
					} else if (local53 == 2) {
						local56[local40 + 3] = local22;
						local56[local40 + 515] = local22;
						local56[local40 + 3 + 1024] = local22;
						local56[local40 + 3 + 1536] = local22;
					} else if (local53 == 3) {
						local56[local40 + 1536] = local22;
						local56[local40 + 1536 + 1] = local22;
						local56[local40 + 2 + 1536] = local22;
						local56[local40 + 3 + 1536] = local22;
					}
				}
				if (local26 == 3) {
					if (local53 == 0) {
						local56[local40] = local22;
					} else if (local53 == 1) {
						local56[local40 + 3] = local22;
					} else if (local53 == 2) {
						local56[local40 + 1539] = local22;
					} else if (local53 == 3) {
						local56[local40 + 1536] = local22;
					}
				}
				if (local26 == 2) {
					if (local53 == 3) {
						local56[local40] = local22;
						local56[local40 + 512] = local22;
						local56[local40 + 1024] = local22;
						local56[local40 + 1536] = local22;
					} else if (local53 == 0) {
						local56[local40] = local22;
						local56[local40 + 1] = local22;
						local56[local40 + 2] = local22;
						local56[local40 + 3] = local22;
					} else if (local53 == 1) {
						local56[local40 + 3] = local22;
						local56[local40 + 3 + 512] = local22;
						local56[local40 + 3 + 1024] = local22;
						local56[local40 + 1536 + 3] = local22;
					} else if (local53 == 2) {
						local56[local40 + 1536] = local22;
						local56[local40 + 1 + 1536] = local22;
						local56[local40 + 1536 + 2] = local22;
						local56[local40 + 1536 + 3] = local22;
					}
				}
			} else {
				@Pc(75) Class1_Sub1_Sub8_Sub1 local75 = Static49.aClass1_Sub1_Sub8_Sub1Array2[local66.anInt2797];
				if (local75 != null) {
					@Pc(88) int local88 = (local66.anInt2822 * 4 - local75.anInt1432) / 2;
					@Pc(99) int local99 = (local66.anInt2815 * 4 - local75.anInt1435) / 2;
					local75.method919(arg3 * 4 + local99 + 48, (-arg2 + 104 - local66.anInt2822) * 4 + 48 + local88);
				}
			}
		}
		local11 = Static87.aClass68_1.method2646(arg4, arg3, arg2);
		if (local11 != 0) {
			local20 = Static87.aClass68_1.method2657(arg4, arg3, arg2, local11);
			local53 = local20 >> 6 & 0x3;
			local26 = local20 & 0x1F;
			local22 = local11 >> 14 & 0x7FFF;
			@Pc(471) Class1_Sub1_Sub11 local471 = Static62.method1274(local22);
			@Pc(502) int local502;
			if (local471.anInt2797 != -1) {
				@Pc(480) Class1_Sub1_Sub8_Sub1 local480 = Static49.aClass1_Sub1_Sub8_Sub1Array2[local471.anInt2797];
				if (local480 != null) {
					local62 = (local471.anInt2815 * 4 - local480.anInt1435) / 2;
					local502 = (local471.anInt2822 * 4 - local480.anInt1432) / 2;
					local480.method919(arg3 * 4 + local62 + 48, (-local471.anInt2822 + (104 - arg2)) * 4 + 48 - -local502);
				}
			} else if (local26 == 9) {
				local40 = 15658734;
				if (local11 > 0) {
					local40 = 15597568;
				}
				@Pc(542) int[] local542 = Static86.aClass1_Sub1_Sub8_Sub3_2.anIntArray203;
				local502 = arg3 * 4 + (52736 - arg2 * 512) * 4 + 24624;
				if (local53 == 0 || local53 == 2) {
					local542[local502 + 1536] = local40;
					local542[local502 + 1 + 1024] = local40;
					local542[local502 + 2 + 512] = local40;
					local542[local502 + 3] = local40;
				} else {
					local542[local502] = local40;
					local542[local502 + 513] = local40;
					local542[local502 + 1024 + 2] = local40;
					local542[local502 + 1539] = local40;
				}
			}
		}
		local11 = Static87.aClass68_1.method2617(arg4, arg3, arg2);
		if (local11 == 0) {
			return;
		}
		local20 = local11 >> 14 & 0x7FFF;
		@Pc(641) Class1_Sub1_Sub11 local641 = Static62.method1274(local20);
		if (local641.anInt2797 == -1) {
			return;
		}
		@Pc(650) Class1_Sub1_Sub8_Sub1 local650 = Static49.aClass1_Sub1_Sub8_Sub1Array2[local641.anInt2797];
		if (local650 != null) {
			@Pc(663) int local663 = (local641.anInt2822 * 4 - local650.anInt1432) / 2;
			local22 = (local641.anInt2815 * 4 - local650.anInt1435) / 2;
			local650.method919(arg3 * 4 + local22 + 48, (104 - (arg2 - -local641.anInt2822)) * 4 - -local663 + 48);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method2991() {
		aClass18_1135 = null;
		aClass18_1137 = null;
		aClass18_1134 = null;
		aClass18_1139 = null;
		aClass18_1138 = null;
		aClass18_1136 = null;
		aClass18_1140 = null;
		aClass20_13 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!ea;ZI)V")
	public static void method2992(@OriginalArg(0) Class18 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(18) int local18 = Static37.aClass1_Sub1_Sub8_Sub2_Sub1_12.method2037(arg0, 250);
		@Pc(29) int local29 = Static37.aClass1_Sub1_Sub8_Sub2_Sub1_12.method2021(arg0, 250) * 13;
		Static63.method1990(6, 6, local18 + 4 + 4, local29 - -4 + 4, 0);
		Static63.method2007(6, 6, local18 + 4 + 4, local29 - -4 + 4, 16777215);
		Static37.aClass1_Sub1_Sub8_Sub2_Sub1_12.method2028(arg0, 10, 10, local18, local29, 16777215, -1, 1, 1, 0);
		Static41.method817(local18 + 4 + 4, 6, 6, local29 + 4 + 4);
		if (!arg1) {
			Static74.method1571(local29, local18, 10, 10);
			return;
		}
		try {
			@Pc(118) Graphics local118 = Static46.aCanvas38.getGraphics();
			Static52.aClass17_1.method1250(local118);
		} catch (@Pc(126) Exception local126) {
			Static46.aCanvas38.repaint();
		}
	}
}
