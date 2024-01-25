import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "Lclient!fea;")
	public static Class2_Sub25 aClass2_Sub25_1;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_3 = new Class85(4);

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	public static int anInt443 = 765;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method470(@OriginalArg(0) Class145 arg0) {
		Static435.aClass68_11 = Static311.method4349(true, Static609.anInt9447, true, arg0);
		Static607.aClass289_17 = Static473.method6776(arg0, Static609.anInt9447);
		Static61.aClass68_1 = Static311.method4349(true, Static212.anInt3397, true, arg0);
		Static175.aClass289_18 = Static473.method6776(arg0, Static212.anInt3397);
		Static387.aClass68_12 = Static311.method4349(true, Static59.anInt1028, true, arg0);
		Static277.aClass289_8 = Static473.method6776(arg0, Static59.anInt1028);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)V")
	public static void method471() {
		Static355.method5102();
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	public static void method472() {
		try {
			@Pc(10) int local10;
			if (Static39.anInt535 == 1) {
				local10 = Static442.aClass2_Sub23_Sub5_3.method7696(255);
				if (local10 > 0 && Static442.aClass2_Sub23_Sub5_3.method7695()) {
					local10 -= Static225.anInt3586;
					if (local10 < 0) {
						local10 = 0;
					}
					Static442.aClass2_Sub23_Sub5_3.method7682(local10);
					return;
				}
				Static442.aClass2_Sub23_Sub5_3.method7681();
				Static442.aClass2_Sub23_Sub5_3.method7713();
				Static156.aClass2_Sub21_2 = null;
				Static314.aClass6_1 = null;
				if (Static24.aClass254_16 == null) {
					Static39.anInt535 = 0;
				} else {
					Static39.anInt535 = 2;
				}
			}
			if (Static39.anInt535 == 3) {
				local10 = Static442.aClass2_Sub23_Sub5_3.method7696(255);
				if (local10 < Static515.anInt8213 && Static442.aClass2_Sub23_Sub5_3.method7695()) {
					local10 += Static84.anInt1426;
					if (local10 > Static515.anInt8213) {
						local10 = Static515.anInt8213;
					}
					Static442.aClass2_Sub23_Sub5_3.method7682(local10);
					return;
				}
				Static84.anInt1426 = 0;
				Static39.anInt535 = 0;
			}
		} catch (@Pc(102) Exception local102) {
			local102.printStackTrace();
			Static442.aClass2_Sub23_Sub5_3.method7681();
			Static156.aClass2_Sub21_2 = null;
			Static24.aClass254_16 = null;
			Static39.anInt535 = 0;
			Static314.aClass6_1 = null;
			Static478.aClass2_Sub23_Sub5_4 = null;
		}
	}
}
