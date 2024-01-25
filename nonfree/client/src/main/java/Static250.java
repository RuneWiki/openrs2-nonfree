import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Z")
	public static boolean aBoolean432;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array16;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray59 = new String[100];

	@OriginalMember(owner = "client!od", name = "j", descriptor = "[I")
	public static final int[] anIntArray534 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_111 = new Class211(20, -1);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!re;)Lclient!pa;")
	public static Class1_Sub2 method3874(@OriginalArg(1) Class1_Sub33 arg0) {
		arg0.method5174();
		@Pc(13) int local13 = arg0.method5174();
		@Pc(17) Class1_Sub2 local17 = Static165.method2424(local13);
		local17.anInt6344 = arg0.method5174();
		@Pc(30) int local30 = arg0.method5174();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			@Pc(38) int local38 = arg0.method5174();
			local17.method5502(local38, arg0);
		}
		local17.method5505();
		return local17;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!re;)Ljava/lang/String;")
	public static String method3875(@OriginalArg(1) Class1_Sub33 arg0) {
		return Static382.method5420(arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
	public static void method3877(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub6_Sub11 local13 = Static295.method4455(arg0, 9);
		local13.method2998();
	}
}
