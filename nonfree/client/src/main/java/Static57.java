import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "Lclient!cja;")
	public static final Class62 aClass62_33 = new Class62(8);

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "Lclient!em;")
	public static final Class105 aClass105_10 = new Class105();

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method6339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg2 + arg4;
		@Pc(17) int local17 = arg5 + arg1;
		@Pc(21) int local21 = arg0 + arg3;
		if (!Static301.method4655(local21, arg4, arg3, local21, arg4, local17, local17, local17, local12)) {
			return false;
		} else if (Static301.method4655(local21, arg4, arg3, arg3, local12, local17, local17, local17, local12)) {
			if (arg4 >= Static356.anInt6401) {
				if (!Static301.method4655(local21, local12, local21, arg3, local12, arg5, local17, local17, local12)) {
					return false;
				}
				if (!Static301.method4655(arg3, local12, local21, arg3, local12, arg5, arg5, local17, local12)) {
					return false;
				}
			} else if (!Static301.method4655(local21, arg4, local21, arg3, arg4, arg5, local17, local17, arg4)) {
				return false;
			} else if (!Static301.method4655(arg3, arg4, local21, arg3, arg4, arg5, arg5, local17, arg4)) {
				return false;
			}
			if (arg3 < Static6.anInt89) {
				if (!Static301.method4655(arg3, arg4, arg3, arg3, arg4, arg5, local17, local17, local12)) {
					return false;
				}
				if (!Static301.method4655(arg3, arg4, arg3, arg3, local12, arg5, arg5, local17, local12)) {
					return false;
				}
			} else if (!Static301.method4655(local21, arg4, local21, local21, arg4, arg5, local17, local17, local12)) {
				return false;
			} else if (!Static301.method4655(local21, arg4, local21, local21, local12, arg5, arg5, local17, local12)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!fca;B)Lclient!bp;")
	public static Class45 method6340(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method4858();
		return new Class45(local7);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public static void method6341() {
		@Pc(7) Class123 local7 = null;
		try {
			@Pc(13) Class129 local13 = Static499.aClass231_4.method5295("");
			while (local13.anInt3299 == 0) {
				Static365.method3472(1L);
			}
			if (local13.anInt3299 == 1) {
				local7 = (Class123) local13.anObject7;
				@Pc(36) Class3_Sub17 local36 = Static227.aClass3_Sub15_11.method2435();
				local7.method2763(0, local36.aByteArray59, local36.lb);
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			if (local7 != null) {
				local7.method2764();
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)Lclient!fr;")
	public static Class131 method6344(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static320.aClass131Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BC)Z")
	public static boolean method6350(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static496.method7044(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static264.aCharArray4;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static201.aCharArray3;
			for (@Pc(53) int local53 = 0; local53 < local46.length; local53++) {
				@Pc(59) char local59 = local46[local53];
				if (arg0 == local59) {
					return true;
				}
			}
			return false;
		}
	}
}
