import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray53 = new int[104][104];

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "[I")
	public static int[] anIntArray169 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!ea;")
	public static Class18 aClass18_482 = Static8.method128("(U4");

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Lclient!ea;")
	public static Class18 aClass18_483 = Static8.method128(" )2>");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method1304() {
		aClass18_482 = null;
		anIntArrayArray53 = null;
		aClass18_483 = null;
		anIntArray169 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ea;ILclient!ea;Lclient!dd;)Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1 method1305(@OriginalArg(0) Class18 arg0, @OriginalArg(2) Class18 arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(8) int local8 = arg2.method2246(arg1);
		@Pc(14) int local14 = arg2.method2251(arg0, local8);
		return Static104.method2156(local14, local8, arg2);
	}
}
