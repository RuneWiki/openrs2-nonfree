import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	public static int anInt2783;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!na;")
	private static Class53 aClass53_1379 = Static109.method1737("Loading friend list");

	@OriginalMember(owner = "client!j", name = "f", descriptor = "I")
	public static int anInt2786 = 0;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "[I")
	public static int[] anIntArray403 = new int[4000];

	@OriginalMember(owner = "client!j", name = "i", descriptor = "I")
	public static int anInt2788 = 0;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_1380 = Static109.method1737("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	public static int anInt2790 = 0;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "I")
	public static volatile int anInt2791 = 0;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Lclient!na;")
	public static Class53 aClass53_1381 = Static109.method1737("Menge eingeben:");

	@OriginalMember(owner = "client!j", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1382 = Static109.method1737("(U1");

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_1383 = aClass53_1379;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method1909() {
		try {
			@Pc(2) Graphics local2 = Static87.aCanvas1.getGraphics();
			Static60.aClass27_22.method1536(357, local2, 17);
		} catch (@Pc(10) Exception local10) {
			Static87.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
	public static void method1911() {
		anIntArray403 = null;
		aClass53_1379 = null;
		aClass53_1382 = null;
		aClass53_1381 = null;
		aClass53_1383 = null;
		aClass53_1380 = null;
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
	public static void method1912() {
		try {
			@Pc(11) Graphics local11 = Static87.aCanvas1.getGraphics();
			Static87.aClass27_33.method1536(4, local11, 550);
		} catch (@Pc(19) Exception local19) {
			Static87.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!vb;)I")
	public static int method1914(@OriginalArg(1) Class3_Sub1_Sub15 arg0) {
		@Pc(17) Class3_Sub8 local17 = (Class3_Sub8) Static44.aClass77_6.method1805(((long) arg0.anInt2686 << 1018705184) + (long) arg0.anInt2693);
		return local17 == null ? arg0.anInt2728 : local17.anInt1076;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public static void method1915() {
		@Pc(10) int local10 = Static62.aClass3_Sub7_Sub1_2.method661(8);
		@Pc(15) int local15;
		if (local10 < Static72.anInt1820) {
			for (local15 = local10; local15 < Static72.anInt1820; local15++) {
				Static119.anIntArray46[Static101.anInt2376++] = Static71.anIntArray228[local15];
			}
		}
		if (local10 > Static72.anInt1820) {
			throw new RuntimeException("gppov1");
		}
		Static72.anInt1820 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(53) int local53 = Static71.anIntArray228[local15];
			@Pc(57) Class3_Sub1_Sub4_Sub1_Sub2 local57 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local53];
			@Pc(62) int local62 = Static62.aClass3_Sub7_Sub1_2.method661(1);
			if (local62 == 0) {
				Static71.anIntArray228[Static72.anInt1820++] = local53;
				local57.anInt1455 = Static27.anInt843;
			} else {
				@Pc(82) int local82 = Static62.aClass3_Sub7_Sub1_2.method661(2);
				if (local82 == 0) {
					Static71.anIntArray228[Static72.anInt1820++] = local53;
					local57.anInt1455 = Static27.anInt843;
					Static5.anIntArray19[Static107.anInt2462++] = local53;
				} else {
					@Pc(127) int local127;
					@Pc(137) int local137;
					if (local82 == 1) {
						Static71.anIntArray228[Static72.anInt1820++] = local53;
						local57.anInt1455 = Static27.anInt843;
						local127 = Static62.aClass3_Sub7_Sub1_2.method661(3);
						local57.method1031(false, local127);
						local137 = Static62.aClass3_Sub7_Sub1_2.method661(1);
						if (local137 == 1) {
							Static5.anIntArray19[Static107.anInt2462++] = local53;
						}
					} else if (local82 == 2) {
						Static71.anIntArray228[Static72.anInt1820++] = local53;
						local57.anInt1455 = Static27.anInt843;
						local127 = Static62.aClass3_Sub7_Sub1_2.method661(3);
						local57.method1031(true, local127);
						local137 = Static62.aClass3_Sub7_Sub1_2.method661(3);
						local57.method1031(true, local137);
						@Pc(193) int local193 = Static62.aClass3_Sub7_Sub1_2.method661(1);
						if (local193 == 1) {
							Static5.anIntArray19[Static107.anInt2462++] = local53;
						}
					} else if (local82 == 3) {
						Static119.anIntArray46[Static101.anInt2376++] = local53;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIIIIIII)V")
	public static void method1916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg1 < 1 || arg2 > 102 || arg1 > 102) {
			return;
		}
		if (Static45.aBoolean47 && Static72.anInt1813 != arg3) {
			return;
		}
		@Pc(36) int local36 = 0;
		if (arg4 == 0) {
			local36 = Static120.aClass39_1.method1010(arg3, arg2, arg1);
		}
		if (arg4 == 1) {
			local36 = Static120.aClass39_1.method979(arg3, arg2, arg1);
		}
		if (arg4 == 2) {
			local36 = Static120.aClass39_1.method973(arg3, arg2, arg1);
		}
		if (arg4 == 3) {
			local36 = Static120.aClass39_1.method971(arg3, arg2, arg1);
		}
		@Pc(100) int local100;
		if (local36 != 0) {
			@Pc(93) int local93 = local36 >> 14 & 0x7FFF;
			local100 = Static120.aClass39_1.method985(arg3, arg2, arg1, local36);
			@Pc(106) int local106 = local100 >> 6 & 0x3;
			@Pc(110) int local110 = local100 & 0x1F;
			@Pc(124) Class3_Sub1_Sub2 local124;
			if (arg4 == 0) {
				Static120.aClass39_1.method1008(arg3, arg2, arg1);
				local124 = Static12.method200(local93);
				if (local124.aBoolean10) {
					Static90.aClass9Array1[arg3].method146(local124.aBoolean17, local106, arg1, local110, arg2);
				}
			}
			if (arg4 == 1) {
				Static120.aClass39_1.method997(arg3, arg2, arg1);
			}
			if (arg4 == 2) {
				Static120.aClass39_1.method972(arg3, arg2, arg1);
				local124 = Static12.method200(local93);
				if (local124.anInt270 + arg2 > 103 || arg1 + local124.anInt270 > 103 || arg2 + local124.anInt282 > 103 || arg1 + local124.anInt282 > 103) {
					return;
				}
				if (local124.aBoolean10) {
					Static90.aClass9Array1[arg3].method140(local106, local124.anInt282, arg2, local124.aBoolean17, local124.anInt270, arg1);
				}
			}
			if (arg4 == 3) {
				Static120.aClass39_1.method983(arg3, arg2, arg1);
				local124 = Static12.method200(local93);
				if (local124.aBoolean10 && local124.anInt279 == 1) {
					Static90.aClass9Array1[arg3].method137(arg2, arg1);
				}
			}
		}
		if (arg0 < 0) {
			return;
		}
		local100 = arg3;
		if (arg3 < 3 && (Static37.aByteArrayArrayArray17[1][arg2][arg1] & 0x2) == 2) {
			local100 = arg3 + 1;
		}
		Static102.method1673(local100, arg2, arg3, Static90.aClass9Array1[arg3], Static120.aClass39_1, arg5, arg0, arg6, arg1);
		return;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BILclient!we;)Z")
	public static boolean method1917(@OriginalArg(1) int arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(8) byte[] local8 = arg1.method1509(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static103.method1693(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!ob;I)Lclient!na;")
	public static Class53 method1918(@OriginalArg(0) Class3_Sub7 arg0) {
		return Static56.method1042(arg0);
	}
}
