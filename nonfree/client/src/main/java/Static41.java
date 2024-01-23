import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!nk;")
	public static Class121 aClass121_24;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "[Lclient!pa;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "[Lclient!pa;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array3;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	public static int anInt846 = 2;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "I")
	public static int anInt848 = 0;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "I")
	public static int anInt850 = -1;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "I")
	public static int anInt852 = 0;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	public static void method741() {
		for (@Pc(11) int local11 = 0; local11 < Static224.anInt4118; local11++) {
			@Pc(18) int local18 = Static263.anIntArray425[local11];
			@Pc(22) Class15_Sub5_Sub1 local22 = Static83.aClass15_Sub5_Sub1Array1[local18];
			@Pc(26) int local26 = Static13.aClass1_Sub14_Sub1_1.method1378();
			if ((local26 & 0x1) != 0) {
				local26 += Static13.aClass1_Sub14_Sub1_1.method1378() << 8;
			}
			@Pc(50) int local50;
			@Pc(54) int local54;
			if ((local26 & 0x80) != 0) {
				local50 = Static13.aClass1_Sub14_Sub1_1.method1381();
				local54 = Static13.aClass1_Sub14_Sub1_1.method1381();
				local22.method4697(local54, local50, Static313.anInt2966);
				local22.anInt5566 = Static313.anInt2966 + 300;
				local22.anInt5528 = Static13.aClass1_Sub14_Sub1_1.method1394();
			}
			if ((local26 & 0x40) != 0) {
				local22.aString335 = Static13.aClass1_Sub14_Sub1_1.method1375();
				local22.anInt5546 = 100;
			}
			if ((local26 & 0x100) != 0) {
				local22.anInt5517 = Static13.aClass1_Sub14_Sub1_1.method1366();
				local22.anInt5526 = Static13.aClass1_Sub14_Sub1_1.method1366();
			}
			if ((local26 & 0x200) != 0) {
				local50 = Static13.aClass1_Sub14_Sub1_1.method1378();
				@Pc(114) int[] local114 = new int[local50];
				@Pc(117) int[] local117 = new int[local50];
				@Pc(120) int[] local120 = new int[local50];
				for (@Pc(122) int local122 = 0; local122 < local50; local122++) {
					@Pc(133) int local133 = Static13.aClass1_Sub14_Sub1_1.method1366();
					if (local133 == 65535) {
						local133 = -1;
					}
					local114[local122] = local133;
					local120[local122] = Static13.aClass1_Sub14_Sub1_1.method1381();
					local117[local122] = Static13.aClass1_Sub14_Sub1_1.method1383();
				}
				Static159.method2732(local120, local22, local114, local117);
			}
			if ((local26 & 0x10) != 0) {
				local22.anInt5581 = Static13.aClass1_Sub14_Sub1_1.method1367();
				if (local22.anInt5581 == 65535) {
					local22.anInt5581 = -1;
				}
			}
			if ((local26 & 0x8) != 0) {
				local50 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local54 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local22.method4697(local54, local50, Static313.anInt2966);
			}
			if ((local26 & 0x20) != 0) {
				local50 = Static13.aClass1_Sub14_Sub1_1.method1386();
				if (local50 == 65535) {
					local50 = -1;
				}
				local54 = Static13.aClass1_Sub14_Sub1_1.method1381();
				Static244.method3824(local22, local50, local54);
			}
			if ((local26 & 0x4) != 0) {
				if (local22.aClass99_1.method2644()) {
					Static27.method456(local22);
				}
				local22.method3200(Static261.method4114(Static13.aClass1_Sub14_Sub1_1.method1367()));
				local22.method4700(local22.aClass99_1.anInt3050);
				local22.anInt5529 = local22.aClass99_1.anInt3062;
				local22.anInt5543 = local22.aClass99_1.anInt3069;
				if (local22.aClass99_1.method2644()) {
					Static224.method3476(0, null, local22.anIntArray501[0], local22, null, local22.anIntArray504[0], Static65.anInt1300);
				}
			}
			if ((local26 & 0x2) != 0) {
				local50 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local54 = Static13.aClass1_Sub14_Sub1_1.method1393();
				if (local50 == 65535) {
					local50 = -1;
				}
				@Pc(316) boolean local316 = true;
				if (local50 != -1 && local22.anInt5510 != -1 && Static80.method1561(Static55.method978(local50).anInt3473).anInt4512 < Static80.method1561(Static55.method978(local22.anInt5510).anInt3473).anInt4512) {
					local316 = false;
				}
				if (local316) {
					local22.anInt5547 = 0;
					local22.anInt5576 = local54 >> 16;
					local22.anInt5510 = local50;
					local22.anInt5580 = 1;
					local22.anInt5535 = (local54 & 0xFFFF) + Static313.anInt2966;
					local22.anInt5590 = 0;
					if (Static313.anInt2966 < local22.anInt5535) {
						local22.anInt5590 = -1;
					}
					if (local22.anInt5510 != -1 && local22.anInt5535 == Static313.anInt2966) {
						@Pc(396) int local396 = Static55.method978(local22.anInt5510).anInt3473;
						if (local396 != -1) {
							@Pc(404) Class157 local404 = Static80.method1561(local396);
							if (local404 != null && local404.anIntArray396 != null) {
								Static31.method503(local404, 0, local22.anInt5557, false, local22.anInt5559);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIB)V")
	public static void method742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= Static29.anInt517 && arg1 <= Static11.anInt170 && Static98.anInt2007 <= arg0 && Static213.anInt4452 >= arg2) {
			Static297.method4528(arg3, arg0, arg4, arg2, arg1);
		} else {
			Static33.method520(arg4, arg3, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)I")
	public static int method743() {
		return Static247.aClass187_126.method4531();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!nk;II)Lclient!nj;")
	public static Class1_Sub23 method745(@OriginalArg(0) Class121 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method3139(arg1);
		return local16 == null ? null : new Class1_Sub23(local16);
	}
}
