import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
	public static int anInt2444;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Lclient!jf;")
	public static Class179 aClass179_1;

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "Lclient!hia;")
	public static Class144 aClass144_2;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "Lclient!tl;")
	public static final Class2_Sub48 aClass2_Sub48_1 = new Class2_Sub48(0, 0);

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	public static int anInt2441 = 0;

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "[I")
	public static final int[] anIntArray147 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!da;)V")
	public static void method2256(@OriginalArg(0) Class59 arg0) {
		Static394.aClass59_9 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLclient!fm;)V")
	public static void method2261(@OriginalArg(1) Class15_Sub3_Sub3_Sub1 arg0) {
		if (arg0 instanceof Class15_Sub3_Sub3_Sub1_Sub2) {
			@Pc(10) Class15_Sub3_Sub3_Sub1_Sub2 local10 = (Class15_Sub3_Sub3_Sub1_Sub2) arg0;
			if (local10.aClass312_1 != null) {
				Static177.method3491(local10, local10.aByte142 != Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142);
			}
		} else if (arg0 instanceof Class15_Sub3_Sub3_Sub1_Sub1) {
			@Pc(36) Class15_Sub3_Sub3_Sub1_Sub1 local36 = (Class15_Sub3_Sub3_Sub1_Sub1) arg0;
			Static278.method4675(local36, local36.aByte142 != Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142);
		}
	}
}
