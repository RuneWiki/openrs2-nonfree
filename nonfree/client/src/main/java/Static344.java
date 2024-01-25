import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public static int anInt5861;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZILclient!gh;)V")
	public static void method4658(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class89 arg1) {
		@Pc(23) int local23 = arg1.anInt2689 == 0 ? arg1.anInt2703 : arg1.anInt2689;
		@Pc(35) int local35 = arg1.anInt2708 == 0 ? arg1.anInt2682 : arg1.anInt2708;
		Static387.method5174(local35, arg1.anInt2677, arg0, Static166.aClass89ArrayArray2[arg1.anInt2677 >> 16], local23);
		if (arg1.aClass89Array1 != null) {
			Static387.method5174(local35, arg1.anInt2677, arg0, arg1.aClass89Array1, local23);
		}
		@Pc(68) Class10_Sub21 local68 = (Class10_Sub21) Static114.aClass167_12.method3709((long) arg1.anInt2677);
		if (local68 != null) {
			Static425.method5655(local23, arg0, local35, local68.anInt3646);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Z")
	public static boolean method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static228.method3401(arg1, arg0) & Static372.method4979(arg1, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZIIII)V")
	public static void method4660(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && Static444.anInt7445 == arg3 && arg2 == Static253.anInt4561 && (Static96.anInt1983 == Static166.anInt3284 || Static361.aClass85_Sub1_1.method2113(Static423.anInt7114))) {
			return;
		}
		Static444.anInt7445 = arg3;
		Static253.anInt4561 = arg2;
		Static166.anInt3284 = Static96.anInt1983;
		if (Static361.aClass85_Sub1_1.method2113(Static423.anInt7114)) {
			Static166.anInt3284 = 0;
		}
		Static458.method6071(arg1);
		Static77.method1475(true, Static114.aClass57_4, Static5.aClass182_1.method4155(Static191.anInt3842));
		@Pc(52) int local52 = Static168.anInt3353;
		@Pc(54) int local54 = Static72.anInt1488;
		Static168.anInt3353 = (Static444.anInt7445 - (Static2.anInt7 >> 4)) * 8;
		Static72.anInt1488 = (Static253.anInt4561 - (Static17.anInt315 >> 4)) * 8;
		Static180.aClass10_Sub1_Sub2_3 = Static143.method2370(Static444.anInt7445 * 8, Static253.anInt4561 * 8);
		Static33.aClass125_5 = null;
		@Pc(86) int local86 = Static168.anInt3353 - local52;
		@Pc(91) int local91 = Static72.anInt1488 - local54;
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(166) int local166;
		@Pc(280) int local280;
		if (arg1 == 10) {
			for (local280 = 0; local280 < Static134.anInt2764; local280++) {
				@Pc(286) Class10_Sub26 local286 = Static149.aClass10_Sub26Array1[local280];
				if (local286 != null) {
					@Pc(291) Class24_Sub3_Sub2_Sub1 local291 = local286.aClass24_Sub3_Sub2_Sub1_2;
					for (local114 = 0; local114 < 10; local114++) {
						local291.anIntArray610[local114] -= local86;
						local291.anIntArray611[local114] -= local91;
					}
					local291.anInt7092 -= local86 * 128;
					local291.anInt7094 -= local91 * 128;
				}
			}
		} else {
			Static219.anInt4155 = 0;
			@Pc(100) boolean local100 = false;
			@Pc(106) int local106 = (Static2.anInt7 - 1) * 128;
			local112 = (Static17.anInt315 - 1) * 128;
			for (local114 = 0; local114 < Static134.anInt2764; local114++) {
				@Pc(120) Class10_Sub26 local120 = Static149.aClass10_Sub26Array1[local114];
				if (local120 != null) {
					@Pc(125) Class24_Sub3_Sub2_Sub1 local125 = local120.aClass24_Sub3_Sub2_Sub1_2;
					local125.anInt7094 -= local91 * 128;
					local125.anInt7092 -= local86 * 128;
					if (local125.anInt7092 >= 0 && local106 >= local125.anInt7092 && local125.anInt7094 >= 0 && local125.anInt7094 <= local112) {
						@Pc(164) boolean local164 = true;
						for (local166 = 0; local166 < 10; local166++) {
							local125.anIntArray610[local166] -= local86;
							local125.anIntArray611[local166] -= local91;
							if (local125.anIntArray610[local166] < 0 || Static2.anInt7 <= local125.anIntArray610[local166] || local125.anIntArray611[local166] < 0 || local125.anIntArray611[local166] >= Static17.anInt315) {
								local164 = false;
							}
						}
						if (local164) {
							Static57.anIntArray91[Static219.anInt4155++] = local125.anInt6228;
						} else {
							local125.method2892(null);
							local100 = true;
							local120.method6033();
						}
					} else {
						local125.method2892(null);
						local120.method6033();
						local100 = true;
					}
				}
			}
			if (local100) {
				Static134.anInt2764 = Static424.aClass167_33.method3698();
				Static424.aClass167_33.method3703(Static149.aClass10_Sub26Array1);
			}
		}
		for (local280 = 0; local280 < 2048; local280++) {
			@Pc(347) Class24_Sub3_Sub2_Sub2 local347 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local280];
			if (local347 != null) {
				for (local112 = 0; local112 < 10; local112++) {
					local347.anIntArray610[local112] -= local86;
					local347.anIntArray611[local112] -= local91;
				}
				local347.anInt7094 -= local91 * 128;
				local347.anInt7092 -= local86 * 128;
			}
		}
		@Pc(395) Class65[] local395 = Static362.aClass65Array1;
		for (local112 = 0; local112 < local395.length; local112++) {
			@Pc(403) Class65 local403 = local395[local112];
			if (local403 != null) {
				local403.anInt1860 -= local91 * 128;
				local403.anInt1855 -= local86 * 128;
			}
		}
		for (@Pc(435) Class10_Sub33 local435 = (Class10_Sub33) Static418.aClass163_44.method3620(); local435 != null; local435 = (Class10_Sub33) Static418.aClass163_44.method3621()) {
			local435.anInt5108 -= local91;
			local435.anInt5100 -= local86;
			if (Static273.anInt4772 != 4 && (local435.anInt5100 < 0 || local435.anInt5108 < 0 || Static2.anInt7 <= local435.anInt5100 || Static17.anInt315 <= local435.anInt5108)) {
				local435.method6033();
			}
		}
		if (Static273.anInt4772 != 4) {
			for (@Pc(499) Class10_Sub14 local499 = (Class10_Sub14) Static293.aClass167_21.method3702(); local499 != null; local499 = (Class10_Sub14) Static293.aClass167_21.method3708()) {
				@Pc(507) int local507 = (int) (local499.aLong264 & 0x3FFFL);
				@Pc(512) int local512 = local507 - Static168.anInt3353;
				local166 = (int) (local499.aLong264 >> 14 & 0x3FFFL);
				@Pc(525) int local525 = local166 - Static72.anInt1488;
				if (local512 < 0 || local525 < 0 || local512 >= Static2.anInt7 || local525 >= Static17.anInt315) {
					local499.method6033();
				}
			}
		}
		if (Static297.anInt5146 != 0) {
			Static457.anInt7597 -= local91;
			Static297.anInt5146 -= local86;
		}
		Static244.method3803();
		if (arg1 != 10) {
			Static200.anInt3979 -= local91;
			Static284.anInt4989 -= local91;
			Static50.anInt906 -= local91 * 128;
			Static55.anInt1001 -= local86;
			Static125.anInt2573 -= local86;
			Static80.anInt1679 -= local86 * 128;
			if (Math.abs(local86) > Static2.anInt7 || Math.abs(local91) > Static17.anInt315) {
				Static343.method4653();
			}
		} else if (Static157.anInt3176 == 4) {
			Static187.anInt3752 -= local86 * 128;
			Static131.anInt2737 -= local91 * 128;
			Static399.anInt6746 -= local86 * 128;
			Static440.anInt7366 -= local91 * 128;
		} else {
			Static157.anInt3176 = 1;
		}
		Static302.method4199();
		Static341.method4585();
		Static91.aClass163_16.method3619();
		Static12.aClass163_2.method3619();
		Static124.aClass240_1.method5232();
		Static48.method838();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method4661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class89 local8 = Static397.method5275(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray10 != null) {
			@Pc(27) Class10_Sub40 local27 = new Class10_Sub40();
			local27.anObjectArray36 = local8.anObjectArray10;
			local27.aClass89_12 = local8;
			local27.aString60 = arg2;
			local27.anInt6383 = arg0;
			Static79.method1501(local27);
		}
		if (Static358.anInt6086 != 9) {
			return;
		}
		@Pc(50) boolean local50 = true;
		if (local8.anInt2715 != 0) {
			local50 = Static69.method1354(local8);
		}
		if (!local50 || !Static56.method1002(local8).method4508(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static310.method4308(Static207.aClass27_65);
			Static356.method4783(local8.anInt2670, arg3, arg1);
		}
		if (arg0 == 2) {
			Static310.method4308(Static29.aClass27_13);
			Static356.method4783(local8.anInt2670, arg3, arg1);
		}
		if (arg0 == 3) {
			Static310.method4308(Static279.aClass27_78);
			Static356.method4783(local8.anInt2670, arg3, arg1);
		}
		if (arg0 == 4) {
			Static310.method4308(Static281.aClass27_88);
			Static356.method4783(local8.anInt2670, arg3, arg1);
		}
		if (arg0 == 5) {
			Static310.method4308(Static28.aClass27_11);
			Static356.method4783(local8.anInt2670, arg3, arg1);
		}
		if (arg0 == 6) {
			Static310.method4308(Static377.aClass27_7);
			Static356.method4783(local8.anInt2670, arg3, arg1);
		}
		if (arg0 == 7) {
			Static310.method4308(Static98.aClass27_40);
			Static356.method4783(local8.anInt2670, arg3, arg1);
		}
		if (arg0 == 8) {
			Static310.method4308(Static100.aClass27_41);
			Static356.method4783(local8.anInt2670, arg3, arg1);
		}
		if (arg0 == 9) {
			Static310.method4308(Static47.aClass27_20);
			Static356.method4783(local8.anInt2670, arg3, arg1);
		}
		if (arg0 == 10) {
			Static310.method4308(Static151.aClass27_57);
			Static356.method4783(local8.anInt2670, arg3, arg1);
		}
	}
}
