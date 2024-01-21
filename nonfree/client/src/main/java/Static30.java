import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!df", name = "G", descriptor = "[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] aClass1_Sub1_Sub8_Sub3Array2;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Lclient!ea;")
	private static Class18 aClass18_253 = Static8.method128("No response from server)3");

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Lclient!rc;")
	public static Class66 aClass66_4 = new Class66(260);

	@OriginalMember(owner = "client!df", name = "K", descriptor = "I")
	public static int anInt1026 = 2;

	@OriginalMember(owner = "client!df", name = "L", descriptor = "Lclient!ea;")
	public static Class18 aClass18_254 = aClass18_253;

	@OriginalMember(owner = "client!df", name = "N", descriptor = "Lclient!ea;")
	public static Class18 aClass18_255 = Static8.method128("rot:");

	@OriginalMember(owner = "client!df", name = "P", descriptor = "Lclient!ea;")
	private static Class18 aClass18_257 = Static8.method128("Checking for updates )2 ");

	@OriginalMember(owner = "client!df", name = "O", descriptor = "Lclient!ea;")
	public static Class18 aClass18_256 = aClass18_257;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!ea;Lclient!ea;Lclient!ea;)V")
	public static void method659(@OriginalArg(1) Class18 arg0, @OriginalArg(2) Class18 arg1, @OriginalArg(3) Class18 arg2) {
		Static163.aClass18_1155 = arg0;
		Static163.aClass18_1149 = arg1;
		Static163.aClass18_1150 = arg2;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	public static void method662() {
		aClass18_256 = null;
		aClass18_253 = null;
		aClass18_257 = null;
		aClass1_Sub1_Sub8_Sub3Array2 = null;
		aClass18_254 = null;
		aClass66_4 = null;
		aClass18_255 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIZ)V")
	public static void method663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static119.aClass1_Sub1_Sub8_Sub1Array7[0].method919(arg1, arg3);
		@Pc(13) int local13 = (arg4 - 32) * arg4 / arg2;
		if (local13 < 8) {
			local13 = 8;
		}
		Static119.aClass1_Sub1_Sub8_Sub1Array7[1].method919(arg1, arg3 + arg4 - 16);
		@Pc(53) int local53 = (arg4 - local13 - 32) * arg0 / (arg2 - arg4);
		Static63.method1990(arg1, arg3 + 16, 16, arg4 - 32, Static88.anInt2734);
		Static63.method1990(arg1, arg3 + local53 + 16, 16, local13, Static59.anInt796);
		Static63.method1993(arg1, local53 + arg3 + 16, local13, Static177.anInt4718);
		Static63.method1993(arg1 + 1, arg3 - -local53 + 16, local13, Static177.anInt4718);
		Static63.method1992(arg1, local53 + arg3 + 16, 16, Static177.anInt4718);
		Static63.method1992(arg1, local53 + arg3 + 17, 16, Static177.anInt4718);
		Static63.method1993(arg1 + 15, local53 + arg3 + 16, local13, Static59.anInt818);
		Static63.method1993(arg1 + 14, local53 + (arg3 - -17), local13 - 1, Static59.anInt818);
		Static63.method1992(arg1, arg3 + local53 + local13 + 15, 16, Static59.anInt818);
		Static63.method1992(arg1 + 1, local13 + local53 + 14 + arg3, 15, Static59.anInt818);
	}
}
