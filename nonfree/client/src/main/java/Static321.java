import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
	public static int anInt6091 = -1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5420(@OriginalArg(0) String arg0) {
		@Pc(16) String local16 = Static176.method1787(Static204.method3630(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLclient!ra;Lclient!ra;Z)V")
	public static void method5421(@OriginalArg(1) Class170 arg0, @OriginalArg(2) Class170 arg1) {
		Static92.aClass170_39 = arg1;
		Static96.aClass170_87 = arg0;
		Static324.aBoolean461 = true;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!dh;ZILclient!dh;)I")
	public static int method5422(@OriginalArg(0) int arg0, @OriginalArg(1) Class47_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class47_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg0 == 1) {
			local11 = arg3.anInt1359;
			local14 = arg1.anInt1359;
			if (!arg2) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static121.method2399(Static259.anInt3205, arg3.method1199().aString322, arg1.method1199().aString322);
		} else if (arg0 == 3) {
			if (arg3.aString77.equals("-")) {
				if (arg1.aString77.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString77.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static121.method2399(Static259.anInt3205, arg3.aString77, arg1.aString77);
			}
		} else if (arg0 == 4) {
			if (arg3.method1193()) {
				return arg1.method1193() ? 0 : 1;
			} else if (arg1.method1193()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg3.method1196()) {
				return arg1.method1196() ? 0 : 1;
			} else if (arg1.method1196()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg3.method1197()) {
				return arg1.method1197() ? 0 : 1;
			} else if (arg1.method1197()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg3.method1194()) {
				return arg1.method1194() ? 0 : 1;
			} else if (arg1.method1194()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local11 = arg3.anInt1366;
			local14 = arg1.anInt1366;
			if (arg2) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local14 == -1) {
					local14 = 1000;
				}
				if (local11 == -1) {
					local11 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg3.anInt1361 - arg1.anInt1361;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Lclient!oo;")
	public static Class149 method5423(@OriginalArg(0) int arg0) {
		@Pc(10) Class149 local10 = (Class149) Static25.aClass66_3.method1939((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static67.aClass170_23.method4584(31, arg0);
		local10 = new Class149();
		if (local20 != null) {
			local10.method3947(new Class5_Sub1(local20), arg0);
		}
		Static25.aClass66_3.method1936((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "(I)V")
	public static void method5424() {
		Static328.aClass66_103.method1933();
	}
}
