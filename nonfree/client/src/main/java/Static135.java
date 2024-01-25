import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "I")
	public static int anInt2371;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "I")
	public static int anInt2372;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "D")
	public static double aDouble42;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "Lclient!vt;")
	public static Class380 aClass380_3;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)[Lclient!o;")
	public static Class246[] method2045() {
		return new Class246[] { Static625.aClass246_33, Static86.aClass246_9, Static108.aClass246_11, Static410.aClass246_26, Static483.aClass246_28, Static512.aClass246_30, Static430.aClass246_32, Static246.aClass246_19, Static147.aClass246_13, Static471.aClass246_27, Static324.aClass246_24, Static63.aClass246_34, Static96.aClass246_10, Static169.aClass246_14 };
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public static void method2046() {
		Static148.anIntArray147 = Static667.method9049(0.4F);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIZLclient!vt;Ljava/lang/String;)V")
	public static void method2048(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class380 arg2, @OriginalArg(4) String arg3) {
		if (!arg1) {
			Static645.method8801(arg2, arg3, 3);
			return;
		}
		@Pc(28) String local28;
		if (Static647.aString144.startsWith("win") && arg2.aBoolean729) {
			local28 = null;
			if (Static180.anApplet6 != null) {
				local28 = Static180.anApplet6.getParameter("haveie6");
			}
			if (local28 == null || !local28.equals("1")) {
				@Pc(46) Class103 local46 = Static645.method8801(arg2, arg3, 0);
				Static402.aClass103_6 = local46;
				Static3.aString18 = arg3;
				Static500.aClass380_5 = arg2;
				return;
			}
		}
		if (Static647.aString144.startsWith("mac")) {
			local28 = null;
			if (Static180.anApplet6 != null) {
				local28 = Static180.anApplet6.getParameter("havefirefox");
			}
			if (local28 != null && local28.equals("1") && arg0) {
				Static645.method8801(arg2, arg3, 1);
				return;
			}
		}
		Static645.method8801(arg2, arg3, 2);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!tja;IIIII)Z")
	public static boolean method2049(@OriginalArg(1) Class338 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static267.aBoolean292 || !Static322.aBoolean345) {
			return false;
		} else if (Static339.anInt5857 < 100) {
			return false;
		} else if (arg4 != arg5 || arg3 != arg1) {
			for (@Pc(54) int local54 = arg4; local54 <= arg5; local54++) {
				for (@Pc(58) int local58 = arg3; local58 <= arg1; local58++) {
					if (-Static237.anInt4278 == Static188.anIntArrayArrayArray16[arg2][local54][local58]) {
						return false;
					}
				}
			}
			if (Static615.method8500(arg0)) {
				Static164.anInt10678++;
				return true;
			} else {
				return false;
			}
		} else if (!Static354.method5134(arg4, arg3, arg2)) {
			return false;
		} else if (Static615.method8500(arg0)) {
			Static164.anInt10678++;
			return true;
		} else {
			return false;
		}
	}
}
