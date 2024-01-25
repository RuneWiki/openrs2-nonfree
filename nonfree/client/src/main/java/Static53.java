import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!di", name = "f", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	public static int anInt1290 = -1;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "[I")
	public static final int[] anIntArray93 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!di", name = "e", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_25 = new Class37(500);

	@OriginalMember(owner = "client!di", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString45 = "Loading wordpack - ";

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Lclient!rm;")
	public static Class1_Sub2_Sub16 method1077(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub16 local10 = (Class1_Sub2_Sub16) Static248.aClass88_2.method1652((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static193.aClass134_94.method3009(arg0, 19);
		local10 = new Class1_Sub2_Sub16();
		if (local20 != null) {
			local10.method4804(new Class1_Sub21(local20));
		}
		Static248.aClass88_2.method1651((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public static void method1078() {
		Static208.method3730();
		Static12.aClass78_1 = null;
		Static152.aClass105_9 = null;
		Static272.aClass78_5 = null;
		Static183.aClass78_4 = null;
		Static89.aClass172ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(II)Lclient!ns;")
	public static Class147 method1079(@OriginalArg(0) int arg0) {
		@Pc(5) Class37 local5 = Static314.aClass37_102;
		@Pc(14) Class147 local14;
		synchronized (Static314.aClass37_102) {
			local14 = (Class147) Static314.aClass37_102.method915((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static222.aClass134_106.method3009(arg0, 16);
		local14 = new Class147();
		if (local30 != null) {
			local14.method3767(new Class1_Sub21(local30));
		}
		@Pc(53) Class37 local53 = Static314.aClass37_102;
		synchronized (Static314.aClass37_102) {
			Static314.aClass37_102.method922((long) arg0, local14);
			return local14;
		}
	}
}
