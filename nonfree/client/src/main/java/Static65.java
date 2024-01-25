import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!ci;")
	public static Class38 aClass38_15;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
	public static int anInt1620;

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "Lclient!aa;")
	public static Class2 aClass2_8;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "Lclient!tf;")
	public static Class240 aClass240_4 = null;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	public static int anInt1626 = 0;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
	public static int anInt1627 = 1;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!uc;I)V")
	public static void method1480(@OriginalArg(0) Class11_Sub5_Sub2 arg0) {
		if (arg0 instanceof Class11_Sub5_Sub2_Sub2) {
			@Pc(32) Class11_Sub5_Sub2_Sub2 local32 = (Class11_Sub5_Sub2_Sub2) arg0;
			if (local32.aClass241_1 == null) {
				return;
			}
			Static104.method1972(local32, Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 != local32.aByte100);
		} else if (arg0 instanceof Class11_Sub5_Sub2_Sub1) {
			@Pc(17) Class11_Sub5_Sub2_Sub1 local17 = (Class11_Sub5_Sub2_Sub1) arg0;
			Static199.method175(Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 != local17.aByte100, local17);
			return;
		}
	}
}
