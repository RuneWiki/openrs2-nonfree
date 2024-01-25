import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
	public static int anInt1753;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
	public static int anInt1750 = 0;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_62 = new Class217(21, 3);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public static void method1684() {
		Static51.aClass63_2.method4650(((float) Static140.anInt3021 * 0.1F + 0.7F) * Static265.aFloat56);
		Static51.aClass63_2.method4622(Static215.anInt4291, Static110.aFloat19, Static243.aFloat53, (float) Static87.anInt1926, (float) Static31.anInt782, (float) Static346.anInt6545);
		Static51.aClass63_2.method4607(Static188.aClass13_3);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Lclient!jg;")
	public static Class102 method1685(@OriginalArg(1) int arg0) {
		@Pc(14) Class102 local14 = (Class102) Static17.aClass21_62.method854((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(24) byte[] local24 = Static253.aClass30_76.method1161(arg0, 1);
		local14 = new Class102();
		local14.anInt3113 = arg0;
		if (local24 != null) {
			local14.method2874(new Class1_Sub7(local24));
		}
		local14.method2873();
		if (local14.anInt3112 == 2 && Static247.aClass38_29.method1475((long) arg0) == null) {
			Static247.aClass38_29.method1472(new Class1_Sub9(Static138.anInt2969), (long) arg0);
			Static2.aClass102Array1[Static138.anInt2969++] = local14;
		}
		Static17.aClass21_62.method843(local14, (long) arg0);
		return local14;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)V")
	public static void method1687() {
		Static112.aClass21_72.method844(5);
		Static104.aClass21_68.method844(5);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIB)V")
	public static void method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class1_Sub4_Sub17 local15 = Static132.method2717(arg0, 13);
		local15.method3480();
		local15.anInt3727 = arg1;
	}
}
