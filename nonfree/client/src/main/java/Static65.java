import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "Lclient!oha;")
	public static Class254 aClass254_1;

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "J")
	public static long aLong32;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)V")
	public static void method910() {
		try {
			@Pc(10) int local10;
			if (Static26.anInt352 == 1) {
				local10 = Static386.aClass5_Sub17_Sub1_2.method2562();
				if (local10 > 0 && Static386.aClass5_Sub17_Sub1_2.method2553()) {
					local10 -= Static171.anInt3389;
					if (local10 < 0) {
						local10 = 0;
					}
					Static386.aClass5_Sub17_Sub1_2.method2542(local10);
					return;
				}
				Static386.aClass5_Sub17_Sub1_2.method2527();
				Static386.aClass5_Sub17_Sub1_2.method2529();
				Static424.aClass5_Sub33_2 = null;
				Static430.aClass290_2 = null;
				if (Static234.aClass390_55 == null) {
					Static26.anInt352 = 0;
				} else {
					Static26.anInt352 = 2;
				}
			}
			if (Static26.anInt352 == 3) {
				local10 = Static386.aClass5_Sub17_Sub1_2.method2562();
				if (Static577.anInt9443 > local10 && Static386.aClass5_Sub17_Sub1_2.method2553()) {
					local10 += Static496.anInt8309;
					if (Static577.anInt9443 < local10) {
						local10 = Static577.anInt9443;
					}
					Static386.aClass5_Sub17_Sub1_2.method2542(local10);
					return;
				}
				Static26.anInt352 = 0;
				Static496.anInt8309 = 0;
			}
		} catch (@Pc(90) Exception local90) {
			local90.printStackTrace();
			Static386.aClass5_Sub17_Sub1_2.method2527();
			Static424.aClass5_Sub33_2 = null;
			Static234.aClass390_55 = null;
			Static439.aClass5_Sub17_Sub1_3 = null;
			Static26.anInt352 = 0;
			Static430.aClass290_2 = null;
		}
	}
}
