import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!el", name = "w", descriptor = "Lclient!de;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!el", name = "E", descriptor = "I")
	public static int anInt1412;

	@OriginalMember(owner = "client!el", name = "C", descriptor = "I")
	public static int anInt1410 = -1;

	@OriginalMember(owner = "client!el", name = "F", descriptor = "I")
	public static int anInt1413 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method1137(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(38) int local38 = arg0 / 10;
		while (local38 != 0) {
			local38 /= 10;
			local34++;
		}
		@Pc(53) char[] local53 = new char[local34];
		local53[0] = '+';
		for (@Pc(66) int local66 = local34 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 < 10) {
				local53[local66] = (char) (local81 + 48);
			} else {
				local53[local66] = (char) (local81 + 87);
			}
		}
		return new String(local53);
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(III)Lclient!es;")
	public static Class67_Sub1 method1139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass67_Sub1_1;
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(B)Z")
	public static boolean method1141() {
		return Static329.anInt6323 == 0 ? Static309.aClass11_Sub10_Sub4_3.method4063() : true;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method1142(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static137.method2134("%0a", arg0, "\n"));
	}
}
