import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!st", name = "l", descriptor = "[I")
	public static int[] anIntArray190;

	@OriginalMember(owner = "client!st", name = "n", descriptor = "I")
	public static int anInt2799;

	@OriginalMember(owner = "client!st", name = "m", descriptor = "I")
	public static int anInt2798 = 0;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_126 = new Class103(36, -1);

	@OriginalMember(owner = "client!st", name = "q", descriptor = "Z")
	public static boolean aBoolean331 = false;

	@OriginalMember(owner = "client!st", name = "u", descriptor = "I")
	public static int anInt2804 = 0;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!sv;[[BI)V")
	public static void method2419(@OriginalArg(0) Class195_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt6368; local14++) {
			Static111.method1777();
			for (@Pc(20) int local20 = 0; local20 < Static296.anInt5187 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static206.anInt3607 >> 3; local24++) {
					@Pc(34) int local34 = Static166.anIntArrayArrayArray2[local14][local20][local24];
					if (local34 != -1) {
						@Pc(44) int local44 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean703 || local44 == 0) {
							@Pc(58) int local58 = local34 >> 1 & 0x3;
							@Pc(64) int local64 = local34 >> 14 & 0x3FF;
							@Pc(70) int local70 = local34 >> 3 & 0x7FF;
							@Pc(80) int local80 = local70 / 8 + (local64 / 8 << 8);
							for (@Pc(82) int local82 = 0; local82 < Static248.anIntArray298.length; local82++) {
								if (Static248.anIntArray298[local82] == local80 && arg1[local82] != null) {
									@Pc(100) Class1_Sub28 local100 = new Class1_Sub28(arg1[local82]);
									arg0.method5000(local44, local64, local58, local70, local100, local14, local24 * 8, Static447.aClass14Array3, local20 * 8);
									arg0.method5010(local12[0] == -1 ? local12 : null, local44, local14, local58, local100, local20 * 8, Static185.aClass34_7, local70, local64, local24 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static187.aClass5_1 = Static55.aClass187_1.method4188(Static130.aClass164_1, local12[0], local12[2], local12[3], local12[1]);
			Static360.anInt6139 = local12[4];
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)Z")
	public static boolean method2423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	public static Class method2424(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2425(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static107.anInt2042; local9++) {
			if (arg0.equalsIgnoreCase(Static320.aStringArray44[local9])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static447.aClass25_Sub5_Sub1_Sub2_4.aString51);
	}
}
