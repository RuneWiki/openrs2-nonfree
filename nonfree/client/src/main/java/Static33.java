import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bba", name = "K", descriptor = "[J")
	public static long[] aLongArray2;

	@OriginalMember(owner = "client!bba", name = "M", descriptor = "I")
	public static int anInt812;

	@OriginalMember(owner = "client!bba", name = "F", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_13 = new Class289(56, 7);

	@OriginalMember(owner = "client!bba", name = "H", descriptor = "I")
	public static int anInt810 = 0;

	@OriginalMember(owner = "client!bba", name = "J", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_38 = new Class179(11, -2);

	@OriginalMember(owner = "client!bba", name = "L", descriptor = "Lclient!lk;")
	public static final Class209 aClass209_3 = new Class209(64);

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!ha;I)Lclient!ho;")
	public static Class9 method811(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1) {
		@Pc(10) Class6_Sub34 local10 = (Class6_Sub34) Static60.aClass209_5.method5038((long) arg0);
		if (local10 != null) {
			@Pc(17) Class6_Sub14_Sub2 local17 = local10.aClass204_Sub1_1.method6606();
			local10.aBoolean342 = true;
			if (local17 != null) {
				return local17.method4208(arg1);
			}
		}
		return null;
	}
}
