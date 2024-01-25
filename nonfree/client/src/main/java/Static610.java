import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_72 = new Class144(68, -1);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIBI)V")
	public static void method6271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static82.anInt1902 <= arg0 - arg4 && arg4 + arg0 <= Static77.anInt1737 && Static549.anInt5294 <= arg5 - arg4 && arg4 + arg5 <= Static334.anInt5381) {
			Static4.method227(arg2, arg5, arg1, arg4, arg0, arg3);
		} else {
			Static548.method7604(arg0, arg3, arg2, arg5, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIB)I")
	public static int method6272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static510.aByteArrayArrayArray11[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static510.aByteArrayArrayArray11[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)Z")
	public static boolean method6274() {
		if (Static98.anInt2140 == 3) {
			return Static74.anInt1708 == 0 && Static446.anInt6827 == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(JII)Ljava/lang/String;")
	public static String method6275(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static464.method8626(arg0);
		@Pc(10) int local10 = Static280.aCalendar3.get(5);
		@Pc(24) int local24 = Static280.aCalendar3.get(2) + 1;
		@Pc(28) int local28 = Static280.aCalendar3.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local24 / 10 + local24 % 10 + "/" + local28 % 100 / 10 + local28 % 10;
	}
}
