import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!tp", name = "r", descriptor = "[I")
	public static int[] anIntArray517;

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_94 = new Class187(46, 8);

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString98 = null;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!qk;")
	public static Class29 method7869(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class29 local8;
		try {
			local8 = (Class29) Class.forName("Class29_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class29_Sub2();
		}
		local8.aString8 = arg0;
		local8.anInt957 = arg1;
		return local8;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!ev;III)Z")
	public static boolean method7870(@OriginalArg(1) Class41_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static649.aBoolean743 || !Static662.aBoolean761) {
			return false;
		} else if (Static309.anInt5508 < 100) {
			return false;
		} else if (Static103.method1741(arg3, arg1, arg2)) {
			@Pc(26) int local26 = arg2 << Static138.anInt2287;
			@Pc(30) int local30 = arg1 << Static138.anInt2287;
			@Pc(40) int local40 = Static298.aClass88Array3[arg3].method8749(arg2, arg1) - 1;
			@Pc(46) int local46 = local40 + arg0.method8652();
			if (arg0.aShort116 == 1) {
				if (!Static13.method189(local40, local26, local46, local30, Static108.anInt1949 + local30, local46, local26, local26, local30)) {
					return false;
				} else if (Static13.method189(local40, local26, local46, local30 + Static108.anInt1949, Static108.anInt1949 + local30, local40, local26, local26, local30)) {
					Static336.anInt6092++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 2) {
				if (!Static13.method189(local40, local26, local46, Static108.anInt1949 + local30, local30 - -Static108.anInt1949, local46, local26 + Static108.anInt1949, local26, local30 + Static108.anInt1949)) {
					return false;
				} else if (Static13.method189(local40, local26, local40, Static108.anInt1949 + local30, local30 - -Static108.anInt1949, local46, Static108.anInt1949 + local26, Static108.anInt1949 + local26, Static108.anInt1949 + local30)) {
					Static336.anInt6092++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 4) {
				if (!Static13.method189(local40, local26 + Static108.anInt1949, local46, local30, Static108.anInt1949 + local30, local46, local26 + Static108.anInt1949, Static108.anInt1949 + local26, local30)) {
					return false;
				} else if (Static13.method189(local40, local26 + Static108.anInt1949, local46, local30 + Static108.anInt1949, local30 - -Static108.anInt1949, local40, Static108.anInt1949 + local26, local26 - -Static108.anInt1949, local30)) {
					Static336.anInt6092++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 8) {
				if (!Static13.method189(local40, local26, local46, local30, local30, local46, Static108.anInt1949 + local26, local26, local30)) {
					return false;
				} else if (Static13.method189(local40, local26, local40, local30, local30, local46, local26 + Static108.anInt1949, local26 + Static108.anInt1949, local30)) {
					Static336.anInt6092++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 16) {
				if (Static87.method1315(Static143.anInt2383, local40, local30 + Static143.anInt2383, local46, local26, Static143.anInt2383)) {
					Static336.anInt6092++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 32) {
				if (Static87.method1315(Static143.anInt2383, local40, Static143.anInt2383 + local30, local46, Static143.anInt2383 + local26, Static143.anInt2383)) {
					Static336.anInt6092++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 64) {
				if (Static87.method1315(Static143.anInt2383, local40, local30, local46, Static143.anInt2383 + local26, Static143.anInt2383)) {
					Static336.anInt6092++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 != 128) {
				return true;
			} else if (Static87.method1315(Static143.anInt2383, local40, local30, local46, local26, Static143.anInt2383)) {
				Static336.anInt6092++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
