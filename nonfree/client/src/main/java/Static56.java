import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!fh", name = "nb", descriptor = "[I")
	public static int[] anIntArray131;

	@OriginalMember(owner = "client!fh", name = "ob", descriptor = "Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4 aClass2_Sub4_Sub3_Sub4_1;

	@OriginalMember(owner = "client!fh", name = "tb", descriptor = "Lclient!jc;")
	public static Class40 aClass40_16;

	@OriginalMember(owner = "client!fh", name = "gb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_854 = Static107.method1838("null");

	@OriginalMember(owner = "client!fh", name = "qb", descriptor = "[I")
	public static int[] anIntArray132 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!fh", name = "zb", descriptor = "[I")
	public static int[] anIntArray133 = new int[1000];

	@OriginalMember(owner = "client!fh", name = "Bb", descriptor = "I")
	public static int anInt1497 = -1;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	public static void method1026() {
		aClass2_Sub4_Sub3_Sub4_1 = null;
		aClass40_16 = null;
		anIntArray132 = null;
		anIntArray131 = null;
		anIntArray133 = null;
		aClass28_854 = null;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[Lclient!ff;I)V")
	public static void method1028(@OriginalArg(0) int arg0, @OriginalArg(1) Class24[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class24 local13 = arg1[local7];
			if (local13 != null && arg0 == local13.anInt1382 && (!local13.aBoolean63 || !Static165.method2570(local13))) {
				if (local13.anInt1425 == 0) {
					if (!local13.aBoolean63 && Static165.method2570(local13) && local13 != Static11.aClass24_1) {
						continue;
					}
					method1028(local13.anInt1367, arg1);
					if (local13.aClass24Array1 != null) {
						method1028(local13.anInt1367, local13.aClass24Array1);
					}
					@Pc(64) Class2_Sub22 local64 = (Class2_Sub22) Static121.aClass35_35.method1354((long) local13.anInt1367);
					if (local64 != null) {
						Static172.method2691(local64.anInt2866);
					}
				}
				if (local13.anInt1425 == 6) {
					@Pc(93) int local93;
					if (local13.anInt1385 != -1 || local13.anInt1415 != -1) {
						@Pc(88) boolean local88 = Static89.method1596(local13);
						if (local88) {
							local93 = local13.anInt1415;
						} else {
							local93 = local13.anInt1385;
						}
						if (local93 != -1) {
							@Pc(105) Class2_Sub4_Sub2 local105 = Static49.method926(local93);
							local13.anInt1422 += Static119.anInt2853;
							while (local13.anInt1422 > local105.anIntArray36[local13.anInt1359]) {
								local13.anInt1422 -= local105.anIntArray36[local13.anInt1359];
								local13.anInt1359++;
								if (local105.anIntArray37.length <= local13.anInt1359) {
									local13.anInt1359 -= local105.anInt486;
									if (local13.anInt1359 < 0 || local13.anInt1359 >= local105.anIntArray37.length) {
										local13.anInt1359 = 0;
									}
								}
								Static104.method1828(local13);
							}
						}
					}
					if (local13.anInt1366 != 0 && !local13.aBoolean63) {
						@Pc(184) int local184 = local13.anInt1366 >> 16;
						local93 = local13.anInt1366 << 16 >> 16;
						local93 *= Static119.anInt2853;
						@Pc(199) int local199 = local184 * Static119.anInt2853;
						local13.anInt1418 = local93 + local13.anInt1418 & 0x7FF;
						local13.anInt1416 = local13.anInt1416 + local199 & 0x7FF;
						Static104.method1828(local13);
					}
				}
			}
		}
	}
}
