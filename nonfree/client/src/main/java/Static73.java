import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!lf", name = "Eb", descriptor = "Lclient!jd;")
	public static Class38 aClass38_15 = new Class38();

	@OriginalMember(owner = "client!lf", name = "Qb", descriptor = "Lclient!ua;")
	public static Class75 aClass75_1 = new Class75();

	@OriginalMember(owner = "client!lf", name = "Rb", descriptor = "Lclient!id;")
	public static Class34 aClass34_952 = Static9.method266(":assistreq:");

	@OriginalMember(owner = "client!lf", name = "Sb", descriptor = "Lclient!id;")
	private static Class34 aClass34_953 = Static9.method266("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!lf", name = "Ub", descriptor = "I")
	public static int anInt1947 = 0;

	@OriginalMember(owner = "client!lf", name = "Vb", descriptor = "Lclient!id;")
	public static Class34 aClass34_954 = aClass34_953;

	@OriginalMember(owner = "client!lf", name = "Xb", descriptor = "Lclient!id;")
	private static Class34 aClass34_956 = Static9.method266("Connecting to update server");

	@OriginalMember(owner = "client!lf", name = "Wb", descriptor = "Lclient!id;")
	public static Class34 aClass34_955 = aClass34_956;

	@OriginalMember(owner = "client!lf", name = "Yb", descriptor = "Lclient!id;")
	public static Class34 aClass34_957 = Static9.method266("scrollbar");

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
	public static void method1285() {
		aClass75_1 = null;
		aClass34_953 = null;
		aClass34_956 = null;
		aClass38_15 = null;
		aClass34_954 = null;
		aClass34_952 = null;
		aClass34_957 = null;
		aClass34_955 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIBLclient!id;IILclient!id;)V")
	public static void method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class34 arg5) {
		if (Static115.aBoolean158 || Static71.anInt1876 >= 500) {
			return;
		}
		Static59.aClass34Array12[Static71.anInt1876] = arg5;
		Static71.aClass34Array16[Static71.anInt1876] = arg2;
		Static78.anIntArray245[Static71.anInt1876] = arg1;
		Static126.anIntArray368[Static71.anInt1876] = arg0;
		Static51.anIntArray155[Static71.anInt1876] = arg3;
		Static62.anIntArray178[Static71.anInt1876] = arg4;
		Static71.anInt1876++;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)I")
	public static int method1287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(30) int local30 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local30;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!id;ZLclient!ie;Lclient!id;Lclient!ie;)Lclient!h;")
	public static Class1_Sub1_Sub2_Sub3_Sub1 method1288(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class35 arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) Class35 arg3) {
		@Pc(13) int local13 = arg1.method1582(arg2);
		@Pc(19) int local19 = arg1.method1564(arg0, local13);
		return Static119.method1884(local19, arg3, arg1, local13);
	}
}
