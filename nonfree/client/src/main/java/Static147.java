import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	public static int anInt3166;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "Lclient!df;")
	public static Class27 aClass27_6;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
	public static int anInt3169;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_854 = Static231.method3737(":");

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public static int anInt3168 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lclient!fj;")
	public static Class40 method2400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class40 local14 = local7.aClass40_1;
			local7.aClass40_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
	public static void method2402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg1 << 16) + arg0);
		@Pc(23) Class1_Sub2_Sub12 local23 = (Class1_Sub2_Sub12) Static64.aClass50_11.method1364(local11);
		if (local23 != null) {
			Static25.aClass85_2.method2423(local23);
		}
	}
}
