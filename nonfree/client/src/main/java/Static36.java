import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_22 = new Class211(11, 3);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!la;ZIILclient!za;B)V")
	public static void method535(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class163 arg5) {
		if (arg2) {
			Static220.aClass13_13.method5668((Static141.anInt2513 - Static220.aClass13_13.RA()) / 2, (Static314.anInt5426 - Static220.aClass13_13.Q()) / 2);
			Static126.aClass13_4.method5668((Static141.anInt2513 - Static126.aClass13_4.RA()) / 2, 18);
		}
		@Pc(30) String local30 = "";
		if (Static193.aClass4_2 == Static118.aClass4_1) {
			local30 = Static348.aClass134_81.method2720(Static331.anInt5597);
		} else if (Static118.aClass4_1 == Static270.aClass4_3) {
			local30 = Static278.aClass134_70.method2720(Static331.anInt5597);
		}
		arg1.method4515(arg4, local30, -1, Static314.anInt5426 / 2 - 26, Static141.anInt2513 / 2);
		@Pc(68) int local68 = Static314.anInt5426 / 2 - 18;
		arg5.method5565(Static141.anInt2513 / 2 - 152, local68, 304, 34, arg0, 0);
		arg5.method5565(Static141.anInt2513 / 2 - 151, local68 + 1, 302, 32, 0, 0);
		arg5.P(Static141.anInt2513 / 2 - 150, local68 + 2, Static13.anInt178 * 3, 30, arg3, 0);
		arg5.P(Static141.anInt2513 / 2 + Static13.anInt178 * 3 - 150, local68 - -2, 300 - Static13.anInt178 * 3, 30, 0, 0);
		arg1.method4515(arg4, Static378.aString175, -1, Static314.anInt5426 / 2 + 4, Static141.anInt2513 / 2);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)I")
	public static int method539(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method541() {
		@Pc(7) String local7 = "www";
		if (Static368.aClass258_8 == Static260.aClass258_7) {
			local7 = "www-wtrc";
		} else if (Static271.aClass258_5 == Static260.aClass258_7) {
			local7 = "www-wtqa";
		} else if (Static107.aClass258_2 == Static260.aClass258_7) {
			local7 = "www-wtwip";
		}
		@Pc(34) String local34 = "";
		if (Static182.aString95 != null) {
			local34 = "/p=" + Static182.aString95;
		}
		return "http://" + local7 + "." + Static118.aClass4_1.aString6 + ".com/l=" + Static331.anInt5597 + "/a=" + Static294.anInt979 + local34 + "/";
	}
}
