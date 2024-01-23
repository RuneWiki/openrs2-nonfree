import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString93 = "red:";

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString94 = "Loaded title screen";

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "Z")
	public static boolean aBoolean192 = true;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZLclient!ph;Lclient!ph;)V")
	public static void method2055(@OriginalArg(2) Class138 arg0, @OriginalArg(3) Class138 arg1) {
		Static8.aBoolean9 = true;
		Static242.aClass138_65 = arg1;
		Static30.aClass138_7 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public static void method2057() {
		Static86.method1275();
		Static36.method655();
		Static107.method1774();
		Static143.method2285();
		Static208.method3305();
		Static262.method1893();
		Static120.method1927();
		Static204.method3258();
		Static105.method1698();
		Static103.method1607();
		Static157.method2682();
		Static264.method3946();
		Static107.method1775();
		Static69.method1148();
		Static195.method3171();
		Static23.method453();
		Static234.method3704();
		Static36.method639();
		Static15.method210();
		Static277.method4114();
		Static91.method1362();
		Static97.aClass169_59.method4014();
		Static52.aClass169_42.method4014();
		Static81.aClass169_55.method4014();
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)[Lclient!wi;")
	public static Class103_Sub2[] method2058() {
		@Pc(4) Class103_Sub2[] local4 = new Class103_Sub2[Static194.anInt3940];
		for (@Pc(16) int local16 = 0; local16 < Static194.anInt3940; local16++) {
			local4[local16] = new Class103_Sub2(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[local16], Static148.anIntArray242[local16], Static134.anIntArray220[local16], Static255.anIntArray450[local16], Static255.aByteArrayArray15[local16], Static40.anIntArray59);
		}
		Static295.method4395();
		return local4;
	}
}
