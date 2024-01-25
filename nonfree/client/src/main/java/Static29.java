import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
	public static int anInt673;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
	public static int anInt680;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_28 = new Class21(16);

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	public static final int anInt678 = 0;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "J")
	public static long aLong30 = 0L;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_29 = new Class21(64);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZ)V")
	public static void method698() {
		Static184.aClass21_104.method844(50);
		Static324.aClass21_164.method844(50);
		Static85.aClass21_58.method844(50);
		Static307.aClass21_156.method844(50);
		Static36.aClass21_37.method844(50);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)Z")
	public static boolean method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static368.method6084(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static153.anInt3177;
		@Pc(14) int local14 = arg2 << Static153.anInt3177;
		@Pc(23) int local23 = Static258.aClass36Array2[arg0].method4431(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 == 1) {
			if (local10 > Static134.anInt2901) {
				if (!Static158.method2988(local10, local23, local14)) {
					return false;
				}
				if (!Static158.method2988(local10, local23, local14 + Static66.anInt1552)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static158.method2988(local10, local27, local14)) {
					return false;
				}
				if (!Static158.method2988(local10, local27, local14 + Static66.anInt1552)) {
					return false;
				}
			}
			if (Static158.method2988(local10, local31, local14)) {
				return Static158.method2988(local10, local31, local14 + Static66.anInt1552);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static320.anInt4358) {
				if (!Static158.method2988(local10, local23, local14 + Static66.anInt1552)) {
					return false;
				}
				if (!Static158.method2988(local10 + Static66.anInt1552, local23, local14 + Static66.anInt1552)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static158.method2988(local10, local27, local14 + Static66.anInt1552)) {
					return false;
				}
				if (!Static158.method2988(local10 + Static66.anInt1552, local27, local14 + Static66.anInt1552)) {
					return false;
				}
			}
			if (Static158.method2988(local10, local31, local14 + Static66.anInt1552)) {
				return Static158.method2988(local10 + Static66.anInt1552, local31, local14 + Static66.anInt1552);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static134.anInt2901) {
				if (!Static158.method2988(local10 + Static66.anInt1552, local23, local14)) {
					return false;
				}
				if (!Static158.method2988(local10 + Static66.anInt1552, local23, local14 + Static66.anInt1552)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static158.method2988(local10 + Static66.anInt1552, local27, local14)) {
					return false;
				}
				if (!Static158.method2988(local10 + Static66.anInt1552, local27, local14 + Static66.anInt1552)) {
					return false;
				}
			}
			if (Static158.method2988(local10 + Static66.anInt1552, local31, local14)) {
				return Static158.method2988(local10 + Static66.anInt1552, local31, local14 + Static66.anInt1552);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static320.anInt4358) {
				if (!Static158.method2988(local10, local23, local14)) {
					return false;
				}
				if (!Static158.method2988(local10 + Static66.anInt1552, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static158.method2988(local10, local27, local14)) {
					return false;
				}
				if (!Static158.method2988(local10 + Static66.anInt1552, local27, local14)) {
					return false;
				}
			}
			if (Static158.method2988(local10, local31, local14)) {
				return Static158.method2988(local10 + Static66.anInt1552, local31, local14);
			} else {
				return false;
			}
		} else if (!Static158.method2988(local10 + Static145.anInt3090, local35, local14 + Static145.anInt3090)) {
			return false;
		} else if (arg3 == 16) {
			return Static158.method2988(local10, local31, local14 + Static66.anInt1552);
		} else if (arg3 == 32) {
			return Static158.method2988(local10 + Static66.anInt1552, local31, local14 + Static66.anInt1552);
		} else if (arg3 == 64) {
			return Static158.method2988(local10 + Static66.anInt1552, local31, local14);
		} else if (arg3 == 128) {
			return Static158.method2988(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method700(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static267.method4817(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static216.anInt4293; local30++) {
			@Pc(36) String local36 = Static150.aStringArray32[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static267.method4817(local36);
			if (local36 != null && local36.equals(local25)) {
				Static216.anInt4293--;
				for (@Pc(60) int local60 = local30; local60 < Static216.anInt4293; local60++) {
					Static150.aStringArray32[local60] = Static150.aStringArray32[local60 + 1];
					Static191.aStringArray43[local60] = Static191.aStringArray43[local60 + 1];
					Static322.aStringArray39[local60] = Static322.aStringArray39[local60 + 1];
					Static239.aStringArray26[local60] = Static239.aStringArray26[local60 + 1];
					Static209.aBooleanArray24[local60] = Static209.aBooleanArray24[local60 + 1];
				}
				Static27.anInt621 = Static356.anInt6822;
				Static280.method5009(Static38.aClass18_37);
				Static339.aClass1_Sub7_Sub2_4.method2121(Static131.method2688(arg0));
				Static339.aClass1_Sub7_Sub2_4.method2106(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
	public static void method702() {
		if (Static180.anInt3696 == 0) {
			return;
		}
		try {
			if (++Static100.anInt2306 > 2000) {
				if (Static165.aClass76_2 != null) {
					Static165.aClass76_2.method2377();
					Static165.aClass76_2 = null;
				}
				if (Static280.anInt5464 >= 1) {
					Static180.anInt3696 = 0;
					Static2.anInt125 = -5;
					return;
				}
				if (anInt680 == Static201.anInt4056) {
					Static201.anInt4056 = Static270.anInt5271;
				} else {
					Static201.anInt4056 = anInt680;
				}
				Static100.anInt2306 = 0;
				Static280.anInt5464++;
				Static180.anInt3696 = 1;
			}
			if (Static180.anInt3696 == 1) {
				Static84.aClass121_2 = Static227.aClass75_5.method2359(Static306.aString53, Static201.anInt4056);
				Static180.anInt3696 = 2;
			}
			@Pc(118) int local118;
			if (Static180.anInt3696 == 2) {
				if (Static84.aClass121_2.anInt3693 == 2) {
					throw new IOException();
				}
				if (Static84.aClass121_2.anInt3693 != 1) {
					return;
				}
				Static165.aClass76_2 = new Class76((Socket) Static84.aClass121_2.anObject2, Static227.aClass75_5);
				Static84.aClass121_2 = null;
				Static165.aClass76_2.method2376(Static339.aClass1_Sub7_Sub2_4.anInt2219, Static339.aClass1_Sub7_Sub2_4.aByteArray41);
				if (Static284.aClass48_12 != null) {
					Static284.aClass48_12.method1834();
				}
				if (Static61.aClass48_4 != null) {
					Static61.aClass48_4.method1834();
				}
				local118 = Static165.aClass76_2.method2379();
				if (Static284.aClass48_12 != null) {
					Static284.aClass48_12.method1834();
				}
				if (Static61.aClass48_4 != null) {
					Static61.aClass48_4.method1834();
				}
				if (local118 != 21) {
					Static2.anInt125 = local118;
					Static180.anInt3696 = 0;
					Static165.aClass76_2.method2377();
					Static165.aClass76_2 = null;
					return;
				}
				Static180.anInt3696 = 3;
			}
			if (Static180.anInt3696 == 3) {
				if (Static165.aClass76_2.method2387() < 1) {
					return;
				}
				Static152.aStringArray12 = new String[Static165.aClass76_2.method2379()];
				Static180.anInt3696 = 4;
			}
			if (Static180.anInt3696 == 4 && Static165.aClass76_2.method2387() >= Static152.aStringArray12.length * 8) {
				Static180.aClass1_Sub7_Sub2_2.anInt2219 = 0;
				Static165.aClass76_2.method2384(0, Static152.aStringArray12.length * 8, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
				for (local118 = 0; local118 < Static152.aStringArray12.length; local118++) {
					Static152.aStringArray12[local118] = Static49.method1168(Static180.aClass1_Sub7_Sub2_2.method2148());
				}
				Static180.anInt3696 = 0;
				Static2.anInt125 = 21;
				Static165.aClass76_2.method2377();
				Static165.aClass76_2 = null;
			}
		} catch (@Pc(220) IOException local220) {
			if (Static165.aClass76_2 != null) {
				Static165.aClass76_2.method2377();
				Static165.aClass76_2 = null;
			}
			if (Static280.anInt5464 >= 1) {
				Static180.anInt3696 = 0;
				Static2.anInt125 = -4;
			} else {
				if (anInt680 == Static201.anInt4056) {
					Static201.anInt4056 = Static270.anInt5271;
				} else {
					Static201.anInt4056 = anInt680;
				}
				Static100.anInt2306 = 0;
				Static180.anInt3696 = 1;
				Static280.anInt5464++;
			}
		}
	}
}
