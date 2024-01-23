import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas12;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public static int anInt6075;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Lclient!rn;")
	public static Class155 aClass155_119;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Z")
	public static boolean aBoolean432;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Lclient!rn;")
	public static Class155 aClass155_120;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Lclient!bi;")
	public static Class3_Sub4_Sub2 aClass3_Sub4_Sub2_14;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Lclient!rn;")
	public static Class155 aClass155_121;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
	public static int anInt6078 = 0;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
	public static int anInt6084 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method4974() {
		if (Static165.aBoolean221) {
			return;
		}
		Static153.aBoolean205 = true;
		if (Static247.aBoolean348) {
			Static179.aFloat48 = (int) Static179.aFloat48 - 17 & 0xFFFFFFF0;
		} else {
			Static258.aFloat65 += (-12.0F - Static258.aFloat65) / 2.0F;
		}
		Static165.aBoolean221 = true;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)Z")
	public static boolean method4975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static306.method4923(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static256.anIntArrayArrayArray14[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static282.anInt5668) {
					if (!Static217.method3570(local10, local24, local14)) {
						return false;
					}
					if (!Static217.method3570(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static217.method3570(local10, local28, local14)) {
						return false;
					}
					if (!Static217.method3570(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static217.method3570(local10, local32, local14)) {
					return false;
				}
				if (!Static217.method3570(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static104.anInt1924) {
					if (!Static217.method3570(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static217.method3570(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static217.method3570(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static217.method3570(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static217.method3570(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static217.method3570(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static282.anInt5668) {
					if (!Static217.method3570(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static217.method3570(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static217.method3570(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static217.method3570(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static217.method3570(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static217.method3570(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static104.anInt1924) {
					if (!Static217.method3570(local10, local24, local14)) {
						return false;
					}
					if (!Static217.method3570(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static217.method3570(local10, local28, local14)) {
						return false;
					}
					if (!Static217.method3570(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static217.method3570(local10, local32, local14)) {
					return false;
				}
				if (!Static217.method3570(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static217.method3570(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static217.method3570(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static217.method3570(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static217.method3570(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static217.method3570(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method4977(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(17) int local17 = arg1.indexOf(arg2); local17 != -1; local17 = arg1.indexOf(arg2, arg0.length() + local17)) {
			arg1 = arg1.substring(0, local17) + arg0 + arg1.substring(local17 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)I")
	public static int method4978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local12 * arg0;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIZ)V")
	public static void method4979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > arg1) {
			Static235.method3988(arg2, Static129.anIntArrayArray40[arg3], arg0, arg1);
		} else {
			Static235.method3988(arg2, Static129.anIntArrayArray40[arg3], arg1, arg0);
		}
	}
}
