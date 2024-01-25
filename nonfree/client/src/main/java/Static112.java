import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fi", name = "L", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!fi", name = "R", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "Lclient!mn;")
	public static Class171 aClass171_29;

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "Lclient!jd;")
	public static final Class129 aClass129_4 = new Class129("LIVE", 0);

	@OriginalMember(owner = "client!fi", name = "W", descriptor = "[I")
	public static final int[] anIntArray146 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)V")
	public static void method1863(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub1_Sub6 local13 = Static267.method3705(arg0, 10);
		local13.method2578();
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(IB)I")
	public static int method1865(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
