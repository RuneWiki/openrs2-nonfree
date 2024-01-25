import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!th", name = "N", descriptor = "I")
	public static int anInt5948;

	@OriginalMember(owner = "client!th", name = "V", descriptor = "I")
	public static int anInt5956;

	@OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
	public static int anInt5959;

	@OriginalMember(owner = "client!th", name = "Z", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!th", name = "S", descriptor = "I")
	public static int anInt5953 = 0;

	@OriginalMember(owner = "client!th", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString236 = "Starting 3d Library";

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V")
	public static void method5179() {
		Static269.aClass37_88.method914();
		Static44.aClass37_21.method914();
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(II)V")
	public static void method5180() {
		@Pc(1) Class37 local1 = Static165.aClass37_54;
		synchronized (Static165.aClass37_54) {
			Static165.aClass37_54.method920(5);
		}
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(II)Lclient!nn;")
	public static Class145 method5182(@OriginalArg(1) int arg0) {
		@Pc(10) Class145 local10 = (Class145) Static303.aClass37_101.method915((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static320.aClass134_142.method3009(arg0, 33);
		local10 = new Class145();
		if (local20 != null) {
			local10.method3701(arg0, new Class1_Sub21(local20));
		}
		Static303.aClass37_101.method922((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
	public static void method5183() {
		@Pc(5) Class37 local5 = Static54.aClass37_26;
		synchronized (Static54.aClass37_26) {
			Static54.aClass37_26.method919();
		}
		local5 = Static239.aClass37_46;
		synchronized (Static239.aClass37_46) {
			Static239.aClass37_46.method919();
		}
		@Pc(39) Class75 local39 = Static61.aClass75_1;
		synchronized (Static61.aClass75_1) {
			Static61.aClass75_1.method1459();
		}
	}
}
