import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "Lclient!wu;")
	public static Class380 aClass380_76;

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "[Lclient!cha;")
	public static Interface4[] anInterface4Array1;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "Lclient!hk;")
	public static Class141 aClass141_4;

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "Z")
	public static boolean aBoolean356 = false;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
	public static int anInt5080 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method4274(@OriginalArg(0) String arg0) {
		return Static378.method8132(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!hg;B)V")
	public static void method4276(@OriginalArg(0) Class13_Sub1_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class13_Sub1_Sub1_Sub1_Sub1) {
			@Pc(9) Class13_Sub1_Sub1_Sub1_Sub1 local9 = (Class13_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local9.aClass150_1 != null) {
				Static626.method8391(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 != local9.aByte127, local9);
			}
		} else if (arg0 instanceof Class13_Sub1_Sub1_Sub1_Sub2) {
			@Pc(31) Class13_Sub1_Sub1_Sub1_Sub2 local31 = (Class13_Sub1_Sub1_Sub1_Sub2) arg0;
			Static643.method8607(local31.aByte127 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, local31);
		}
	}
}
