import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
	public static int anInt1145;

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "Lclient!jq;")
	public static Class156 aClass156_2 = null;

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_18 = new Class306("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I")
	public static int method1111(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(24) int local24 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIII)V")
	public static void method1112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static358.anInt8908 <= arg0 && Static216.anInt4203 >= arg0) {
			@Pc(23) int local23 = Static400.method6041(arg2, Static205.anInt4042, Static99.anInt1988);
			@Pc(29) int local29 = Static400.method6041(arg3, Static205.anInt4042, Static99.anInt1988);
			Static52.method1028(local29, local23, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(II)V")
	public static void method1113(@OriginalArg(0) int arg0) {
		Static214.anInt2191 = arg0;
		Static340.anInt6093 = -1;
		Static340.anInt6093 = -1;
		Static64.method1152();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZIB)V")
	public static void method1114(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static438.anInt7729 = 3;
		Static418.anInt7355 = arg1;
		Static217.method7159(Static192.aClass4_5.anInt111, Static192.aClass4_5.aString2);
		if (arg0) {
			Static524.method7186("", false, "");
		} else {
			Static154.method2421();
			Static524.method7186(Static58.aString7, false, Static6.aString3);
		}
	}
}
