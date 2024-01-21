import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_180 = Static129.method2060("runes");

	@OriginalMember(owner = "client!e", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[104][104];

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Lclient!r;")
	private static Class61 aClass61_181 = Static129.method2060("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!e", name = "D", descriptor = "[I")
	public static int[] anIntArray117 = new int[2000];

	@OriginalMember(owner = "client!e", name = "J", descriptor = "I")
	public static int anInt613 = 0;

	@OriginalMember(owner = "client!e", name = "N", descriptor = "Lclient!r;")
	public static Class61 aClass61_182 = aClass61_181;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
	public static int method434(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLclient!r;Lclient!ff;Lclient!r;)Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4 method441(@OriginalArg(1) Class61 arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class61 arg2) {
		@Pc(8) int local8 = arg1.method1044(arg2);
		@Pc(19) int local19 = arg1.method1039(arg0, local8);
		return Static66.method1109(local19, arg1, local8);
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(B)V")
	public static void method445() {
		anIntArrayArray8 = null;
		anIntArray117 = null;
		aClass61_182 = null;
		aClass61_180 = null;
		aClass61_181 = null;
	}
}
