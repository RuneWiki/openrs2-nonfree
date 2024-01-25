import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!be", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "[I")
	public static final int[] anIntArray726 = new int[50];

	@OriginalMember(owner = "client!be", name = "s", descriptor = "I")
	public static int anInt5708 = -1;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
	public static void method4814() {
		@Pc(13) Class62 local13 = Static17.aClass62_3;
		synchronized (Static17.aClass62_3) {
			Static17.aClass62_3.method1386();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZI)Lclient!bi;")
	public static Class26 method4815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class26 local12 = Static245.method4231(arg1);
		if (arg0 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass26Array1 == null || arg0 >= local12.aClass26Array1.length) {
			return null;
		} else {
			return local12.aClass26Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(B)V")
	public static void method4816() {
		if (Static306.aFloat49 < Static306.aFloat50) {
			Static306.aFloat49 = (float) ((double) Static306.aFloat49 + (double) Static306.aFloat49 / 30.0D);
			if (Static306.aFloat49 > Static306.aFloat50) {
				Static306.aFloat49 = Static306.aFloat50;
			}
			Static201.method3720();
			Static306.anInt3319 = (int) Static306.aFloat49 >> 1;
			Static306.aByteArrayArrayArray8 = Static73.method1454(Static306.anInt3319);
		} else if (Static306.aFloat49 > Static306.aFloat50) {
			Static306.aFloat49 = (float) ((double) Static306.aFloat49 - (double) Static306.aFloat49 / 30.0D);
			if (Static306.aFloat49 < Static306.aFloat50) {
				Static306.aFloat49 = Static306.aFloat50;
			}
			Static201.method3720();
			Static306.anInt3319 = (int) Static306.aFloat49 >> 1;
			Static306.aByteArrayArrayArray8 = Static73.method1454(Static306.anInt3319);
		}
		if (anInt5708 != -1 && Static142.anInt3109 != -1) {
			@Pc(84) int local84 = anInt5708 - Static244.anInt4835;
			if (local84 < 2 || local84 > 2) {
				local84 >>= 0x4;
			}
			@Pc(101) int local101 = Static142.anInt3109 - Static107.anInt1502;
			if (local101 < 2 || local101 > 2) {
				local101 >>= 0x4;
			}
			Static244.anInt4835 += local84;
			Static107.anInt1502 += local101;
			if (local84 == 0 && local101 == 0) {
				anInt5708 = -1;
				Static142.anInt3109 = -1;
			}
			Static201.method3720();
		}
		if (Static242.anInt3402 > 0) {
			Static320.anInt6132--;
			if (Static320.anInt6132 == 0) {
				Static320.anInt6132 = 100;
				Static242.anInt3402--;
			}
		} else {
			Static268.anInt5281 = -1;
			Static100.anInt2435 = -1;
		}
		if (!Static130.aBoolean223 || Static10.aClass74_2 == null) {
			return;
		}
		for (@Pc(172) Class7_Sub2 local172 = (Class7_Sub2) Static10.aClass74_2.method1793(); local172 != null; local172 = (Class7_Sub2) Static10.aClass74_2.method1798()) {
			@Pc(180) Class155 local180 = Static84.method1785(local172.aClass7_Sub37_1.anInt5839);
			if (Static108.anInt1313 == 0 && local172.method152(Static100.anInt2436, Static240.anInt6396)) {
				if (local180.aStringArray40 != null) {
					if (local180.aStringArray40[4] != null) {
						Static198.method3544(0, -1, local180.aStringArray40[4], (long) local172.aClass7_Sub37_1.anInt5839, local180.aString294, 1005, local180.anInt4683);
					}
					if (local180.aStringArray40[3] != null) {
						Static198.method3544(0, -1, local180.aStringArray40[3], (long) local172.aClass7_Sub37_1.anInt5839, local180.aString294, 1007, local180.anInt4683);
					}
					if (local180.aStringArray40[2] != null) {
						Static198.method3544(0, -1, local180.aStringArray40[2], (long) local172.aClass7_Sub37_1.anInt5839, local180.aString294, 1003, local180.anInt4683);
					}
					if (local180.aStringArray40[1] != null) {
						Static198.method3544(0, -1, local180.aStringArray40[1], (long) local172.aClass7_Sub37_1.anInt5839, local180.aString294, 1012, local180.anInt4683);
					}
					if (local180.aStringArray40[0] != null) {
						Static198.method3544(0, -1, local180.aStringArray40[0], (long) local172.aClass7_Sub37_1.anInt5839, local180.aString294, 1001, local180.anInt4683);
					}
				}
				if (!local172.aClass7_Sub37_1.aBoolean426) {
					local172.aClass7_Sub37_1.aBoolean426 = true;
					Static83.method1761(15, local172.aClass7_Sub37_1.anInt5839, local180.anInt4683);
				}
				if (local172.aClass7_Sub37_1.aBoolean426) {
					Static83.method1761(17, local172.aClass7_Sub37_1.anInt5839, local180.anInt4683);
				}
			} else if (local172.aClass7_Sub37_1.aBoolean426) {
				local172.aClass7_Sub37_1.aBoolean426 = false;
				Static83.method1761(16, local172.aClass7_Sub37_1.anInt5839, local180.anInt4683);
			}
		}
	}
}
