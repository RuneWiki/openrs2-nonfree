import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Lclient!jm;")
	public static final Class105 aClass105_11 = new Class105("", 17);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lclient!am;")
	public static Class9 method2867(@OriginalArg(0) int arg0) {
		@Pc(5) Class21 local5 = Static21.aClass21_20;
		@Pc(14) Class9 local14;
		synchronized (Static21.aClass21_20) {
			local14 = (Class9) Static21.aClass21_20.method854((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static208.aClass30_60.method1161(Static66.method1506(arg0), Static157.method2980(arg0));
		local14 = new Class9();
		if (local34 != null) {
			local14.method330(new Class1_Sub7(local34));
		}
		@Pc(49) Class21 local49 = Static21.aClass21_20;
		synchronized (Static21.aClass21_20) {
			Static21.aClass21_20.method843(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)Lclient!kg;")
	public static Class112 method2868(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class112 local7 = Static188.method3536(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass112Array2 == null || arg1 >= local7.aClass112Array2.length) {
			return null;
		} else {
			return local7.aClass112Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method2869() {
		Static180.aClass4_11 = null;
		Static161.aClass4_10 = null;
		Static288.aClass4_20 = null;
		Static49.aClass4_4 = null;
		Static23.aClass4_2 = null;
		Static196.aClass4_15 = null;
		Static22.aClass4_26 = null;
		Static324.aClass4_21 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII)I")
	public static int method2870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(8) int local8 = arg3;
			arg3 = arg4;
			arg4 = local8;
		}
		@Pc(16) int local16 = arg0 & 0x3;
		if (local16 == 0) {
			return arg2;
		} else if (local16 == 1) {
			return arg5;
		} else if (local16 == 2) {
			return 7 + 1 - arg2 - arg3;
		} else {
			return 1 + 7 - arg4 - arg5;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZ)I")
	public static int method2871(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(40) int local40 = (arg0 & 0x7F) * 96 >> 7;
			if (local40 < 2) {
				local40 = 2;
			} else if (local40 > 126) {
				local40 = 126;
			}
			return (arg0 & 0xFF80) + local40;
		}
	}
}
