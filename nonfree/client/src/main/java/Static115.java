import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!lb", name = "kb", descriptor = "I")
	public static int anInt2533;

	@OriginalMember(owner = "client!lb", name = "lb", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_34;

	@OriginalMember(owner = "client!lb", name = "ab", descriptor = "Lclient!ia;")
	private static Class51 aClass51_849 = Static64.method1101("green:");

	@OriginalMember(owner = "client!lb", name = "bb", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!lb", name = "db", descriptor = "Lclient!ia;")
	public static Class51 aClass51_850 = Static64.method1101("m");

	@OriginalMember(owner = "client!lb", name = "gb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_851 = aClass51_849;

	@OriginalMember(owner = "client!lb", name = "hb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_852 = aClass51_849;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLclient!ib;)V")
	public static void method1935(@OriginalArg(1) Class5_Sub1_Sub1 arg0) {
		@Pc(14) Class1_Sub18 local14 = (Class1_Sub18) Static92.aClass102_11.method3093(arg0.aClass51_619.method1388());
		if (local14 == null) {
			Static187.method3123(null, arg0.anIntArray238[0], null, Static197.anInt2422, arg0, 0, arg0.anIntArray233[0]);
		} else {
			local14.method1908();
		}
	}
}
