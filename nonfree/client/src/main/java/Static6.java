import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public static int anInt211;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_48 = Static120.method1824("The server is being updated)3");

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!rd;")
	public static Class80 aClass80_47 = aClass80_48;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!lc;")
	public static Class54 aClass54_2 = new Class54(32);

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "[I")
	public static final int[] anIntArray30 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "J")
	public static long aLong6 = 0L;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method147() {
		Static162.aClass5_50.method146();
		Static192.aClass5_64.method146();
		Static27.aClass5_65.method146();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZ)I")
	public static int method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)Z")
	public static boolean method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static188.method3073(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static111.anIntArrayArrayArray7[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static87.anInt1818) {
					if (!Static79.method1201(local10, local24, local14)) {
						return false;
					}
					if (!Static79.method1201(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static79.method1201(local10, local28, local14)) {
						return false;
					}
					if (!Static79.method1201(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static79.method1201(local10, local32, local14)) {
					return false;
				}
				if (!Static79.method1201(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static143.anInt3081) {
					if (!Static79.method1201(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static79.method1201(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static79.method1201(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static79.method1201(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static79.method1201(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static79.method1201(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static87.anInt1818) {
					if (!Static79.method1201(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static79.method1201(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static79.method1201(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static79.method1201(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static79.method1201(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static79.method1201(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static143.anInt3081) {
					if (!Static79.method1201(local10, local24, local14)) {
						return false;
					}
					if (!Static79.method1201(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static79.method1201(local10, local28, local14)) {
						return false;
					}
					if (!Static79.method1201(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static79.method1201(local10, local32, local14)) {
					return false;
				}
				if (!Static79.method1201(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static79.method1201(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static79.method1201(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static79.method1201(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static79.method1201(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static79.method1201(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIILjava/awt/Component;Lclient!na;)Lclient!hi;")
	public static Class38 method151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Class61 arg3) {
		if (Static47.anInt1073 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class38 local33 = (Class38) Class.forName("Class38_Sub2").getDeclaredConstructor().newInstance();
			local33.anInt4122 = arg0;
			local33.anIntArray492 = new int[(Static112.aBoolean97 ? 2 : 1) * 256];
			local33.method2939(arg2);
			local33.anInt4127 = (arg0 & 0xFFFFFC00) + 1024;
			if (local33.anInt4127 > 16384) {
				local33.anInt4127 = 16384;
			}
			local33.method2953(local33.anInt4127);
			if (Static182.anInt4069 > 0 && Static173.aClass90_1 == null) {
				Static173.aClass90_1 = new Class90();
				Static173.aClass90_1.aClass61_4 = arg3;
				arg3.method1792(Static182.anInt4069, Static173.aClass90_1);
			}
			if (Static173.aClass90_1 != null) {
				if (Static173.aClass90_1.aClass38Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static173.aClass90_1.aClass38Array1[arg1] = local33;
			}
			return local33;
		} catch (@Pc(103) Throwable local103) {
			try {
				@Pc(114) Class38_Sub1 local114 = new Class38_Sub1(arg3, arg1);
				local114.anInt4122 = arg0;
				local114.anIntArray492 = new int[(Static112.aBoolean97 ? 2 : 1) * 256];
				local114.method2939(arg2);
				local114.anInt4127 = 16384;
				local114.method2953(local114.anInt4127);
				if (Static182.anInt4069 > 0 && Static173.aClass90_1 == null) {
					Static173.aClass90_1 = new Class90();
					Static173.aClass90_1.aClass61_4 = arg3;
					arg3.method1792(Static182.anInt4069, Static173.aClass90_1);
				}
				if (Static173.aClass90_1 != null) {
					if (Static173.aClass90_1.aClass38Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static173.aClass90_1.aClass38Array1[arg1] = local114;
				}
				return local114;
			} catch (@Pc(173) Throwable local173) {
				return new Class38();
			}
		}
	}
}
