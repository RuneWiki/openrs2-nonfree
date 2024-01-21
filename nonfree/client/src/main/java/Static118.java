import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!we", name = "s", descriptor = "I")
	public static int anInt3001;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "Lclient!ta;")
	public static Class14 aClass14_40;

	@OriginalMember(owner = "client!we", name = "v", descriptor = "Lclient!cc;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!gd;")
	public static Class22 aClass22_40 = new Class22(30);

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public static int anInt2997 = 0;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "J")
	public static long aLong90 = 0L;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1466 = Static14.method2017("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1455 = aClass36_1466;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public static int anInt3000 = 0;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1456 = Static14.method2017("as it was used to break our rules)3");

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1457 = aClass36_1456;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1464 = Static14.method2017("Accept trade");

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1458 = aClass36_1464;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1467 = Static14.method2017("Close");

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1459 = aClass36_1467;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1462 = Static14.method2017("Prepared visibility map");

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1460 = aClass36_1462;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1461 = Static14.method2017(" )2> @whi@");

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1463 = Static14.method2017(": ");

	@OriginalMember(owner = "client!we", name = "r", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1465 = Static14.method2017("null");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method2080() {
		aClass36_1457 = null;
		aClass36_1456 = null;
		aClass36_1460 = null;
		aClass36_1462 = null;
		aClass14_40 = null;
		aClass36_1467 = null;
		aClass36_1458 = null;
		aClass36_1464 = null;
		aClass22_40 = null;
		aClass36_1463 = null;
		aClass36_1455 = null;
		aClass36_1459 = null;
		aClass36_1466 = null;
		aClass36_1461 = null;
		aClass12_1 = null;
		aClass36_1465 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Lclient!sb;")
	public static Class2_Sub1_Sub15 method2081(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub15 local10 = (Class2_Sub1_Sub15) Static55.aClass22_36.method711((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static11.aClass3_2.method928(arg0, 1);
		local10 = new Class2_Sub1_Sub15();
		if (local25 != null) {
			local10.method1761(new Class2_Sub12(local25), arg0);
		}
		local10.method1764();
		Static55.aClass22_36.method712(local10, (long) arg0);
		return local10;
	}
}
