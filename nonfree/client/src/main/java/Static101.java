import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!eba", name = "j", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
	public static int anInt2454 = -1;

	@OriginalMember(owner = "client!eba", name = "l", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_41 = new Class6(56, 4);

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZLclient!cu;Lclient!cu;II)I")
	public static int method2270(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class50_Sub1 arg1, @OriginalArg(2) Class50_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg3 == 1) {
			local11 = arg1.anInt1981;
			local14 = arg2.anInt1981;
			if (!arg0) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg3 == 2) {
			return Static200.method3716(arg2.method1915().aString58, Static315.anInt5993, arg1.method1915().aString58);
		} else if (arg3 == 3) {
			if (arg1.aString12.equals("-")) {
				if (arg2.aString12.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString12.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static200.method3716(arg2.aString12, Static315.anInt5993, arg1.aString12);
			}
		} else if (arg3 == 4) {
			if (arg1.method1907()) {
				return arg2.method1907() ? 0 : 1;
			} else if (arg2.method1907()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method1910()) {
				return arg2.method1910() ? 0 : 1;
			} else if (arg2.method1910()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method1904()) {
				return arg2.method1904() ? 0 : 1;
			} else if (arg2.method1904()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method1908()) {
				return arg2.method1908() ? 0 : 1;
			} else if (arg2.method1908()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local11 = arg1.anInt1991;
			local14 = arg2.anInt1991;
			if (arg0) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg1.anInt1988 - arg2.anInt1988;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljava/lang/String;Lclient!lp;ZZI)V")
	public static void method2271(@OriginalArg(0) String arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg2) {
			Static21.method865(3, arg1, arg0);
			return;
		}
		@Pc(21) String local21;
		if (Static283.aString53.startsWith("win") && Static283.anInt5580 != 3) {
			local21 = null;
			if (arg1.anApplet1 != null) {
				local21 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local21 == null || !local21.equals("1")) {
				@Pc(41) Class243 local41 = Static21.method865(0, arg1, arg0);
				Static34.aClass243_1 = local41;
				Static478.aString70 = arg0;
				Static42.aClass182_3 = arg1;
				return;
			}
		}
		if (Static283.aString53.startsWith("mac")) {
			local21 = null;
			if (arg1.anApplet1 != null) {
				local21 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local21 != null && local21.equals("1") && arg3) {
				Static21.method865(1, arg1, arg0);
				return;
			}
		}
		Static21.method865(2, arg1, arg0);
	}
}
