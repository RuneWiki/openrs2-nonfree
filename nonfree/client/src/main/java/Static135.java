import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public static int anInt3581;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public static int anInt3578 = 0;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public static int anInt3583 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public static void method2776() {
		Static7.aClass2_Sub3_Sub1_43.method244(82);
		Static7.aClass2_Sub3_Sub1_43.method205(0L);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Lclient!tc;")
	public static Class2_Sub1_Sub19 method2777(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub19 local10 = (Class2_Sub1_Sub19) Static143.aClass89_54.method3437((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static32.aClass13_7.method521(arg0, 4);
		local10 = new Class2_Sub1_Sub19();
		if (local28 != null) {
			local10.method3202(arg0, new Class2_Sub3(local28));
		}
		Static143.aClass89_54.method3432(local10, (long) arg0);
		return local10;
	}
}
