import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	public static int anInt2179;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1025 = Static32.method683("leuchten1:");

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public static int anInt2176 = 0;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1026 = null;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1027 = Static32.method683("Stufe)2");

	@OriginalMember(owner = "client!md", name = "h", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array16 = new Class49[1000];

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1030 = Static32.method683("scroll:");

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1028 = aClass49_1030;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1029 = aClass49_1030;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array17 = new Class49[100];

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1031 = Static32.method683("<col=ffffff>");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!bg;I)Lclient!mb;")
	public static Class2_Sub20 method1757(@OriginalArg(1) Class11 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method2075(arg1);
		return local16 == null ? null : new Class2_Sub20(local16);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)Z")
	public static boolean method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static177.method2902(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static27.anIntArrayArrayArray2[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static17.anInt2522) {
					if (!Static1.method1(local10, local24, local14)) {
						return false;
					}
					if (!Static1.method1(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static1.method1(local10, local28, local14)) {
						return false;
					}
					if (!Static1.method1(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static1.method1(local10, local32, local14)) {
					return false;
				}
				if (!Static1.method1(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static128.anInt2775) {
					if (!Static1.method1(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static1.method1(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static1.method1(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static1.method1(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static1.method1(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static1.method1(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static17.anInt2522) {
					if (!Static1.method1(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static1.method1(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static1.method1(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static1.method1(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static1.method1(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static1.method1(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static128.anInt2775) {
					if (!Static1.method1(local10, local24, local14)) {
						return false;
					}
					if (!Static1.method1(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static1.method1(local10, local28, local14)) {
						return false;
					}
					if (!Static1.method1(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static1.method1(local10, local32, local14)) {
					return false;
				}
				if (!Static1.method1(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static1.method1(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static1.method1(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static1.method1(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static1.method1(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static1.method1(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method1759() {
		aClass49Array16 = null;
		aClass49_1029 = null;
		aClass49_1031 = null;
		aClass49_1028 = null;
		aClass49Array17 = null;
		aClass49_1027 = null;
		aClass49_1026 = null;
		aClass49_1025 = null;
		aClass49_1030 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IILclient!oh;)V")
	public static void method1760(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub1 arg1) {
		if (Static105.aClass2_Sub13_3 == null) {
			Static79.method3014(0, (byte) 0, null, true, 255, 255);
			Static47.aClass11_Sub1Array1[arg0] = arg1;
		} else {
			Static105.aClass2_Sub13_3.anInt3940 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static105.aClass2_Sub13_3.method2946();
			@Pc(20) int local20 = Static105.aClass2_Sub13_3.method2946();
			arg1.method2080(local16, local20);
		}
	}
}
