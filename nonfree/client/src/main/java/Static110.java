import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "[Lclient!pa;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array5;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "Lclient!nk;")
	public static Class121 aClass121_54;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
	public static int anInt2281 = 0;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "[I")
	public static int[] anIntArray202 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!hl", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString130 = "K";

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!lf;)Lclient!rf;")
	public static Class1_Sub4 method1971(@OriginalArg(1) Class1_Sub14 arg0) {
		arg0.method1378();
		@Pc(13) int local13 = arg0.method1378();
		@Pc(17) Class1_Sub4 local17 = Static13.method174(local13);
		local17.anInt5686 = arg0.method1378();
		@Pc(26) int local26 = arg0.method1378();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) int local39 = arg0.method1378();
			local17.method4747(arg0, local39);
		}
		local17.method4755();
		return local17;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1981(@OriginalArg(1) String arg0) {
		return Static172.method2907(arg0, 10);
	}
}
