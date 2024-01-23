import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!d", name = "F", descriptor = "I")
	public static int anInt939;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "Lclient!jd;")
	public static Class84 aClass84_17;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!d", name = "B", descriptor = "I")
	public static int anInt936 = -1;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "Lclient!ec;")
	public static Class46 aClass46_6 = new Class46(100);

	@OriginalMember(owner = "client!d", name = "M", descriptor = "I")
	public static int anInt945 = -1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!jd;)V")
	public static void method743(@OriginalArg(1) Class84 arg0) {
		Static215.aClass84_98 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
	public static void method744() {
		Static169.aClass46_29.method1077();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
	public static void method745(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub3_Sub16 local8 = Static119.method2204(arg0, 7);
		local8.method2719();
	}
}
