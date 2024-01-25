import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_217 = new Class180(131, 10);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public static void method9230() {
		try {
			@Pc(17) int local17;
			if (Static18.anInt450 == 1) {
				local17 = Static366.aClass3_Sub1_Sub3_4.method2175();
				if (local17 > 0 && Static366.aClass3_Sub1_Sub3_4.method2161()) {
					local17 -= Static586.anInt9458;
					if (local17 < 0) {
						local17 = 0;
					}
					Static366.aClass3_Sub1_Sub3_4.method2149(local17);
					return;
				}
				Static366.aClass3_Sub1_Sub3_4.method2176();
				Static366.aClass3_Sub1_Sub3_4.method2150();
				if (Static403.aClass15_107 == null) {
					Static18.anInt450 = 0;
				} else {
					Static18.anInt450 = 2;
				}
				Static107.aClass226_1 = null;
				Static172.aClass3_Sub4_2 = null;
			}
			if (Static18.anInt450 == 3) {
				local17 = Static366.aClass3_Sub1_Sub3_4.method2175();
				if (local17 < Static553.anInt9041 && Static366.aClass3_Sub1_Sub3_4.method2161()) {
					local17 += Static229.anInt4278;
					if (Static553.anInt9041 < local17) {
						local17 = Static553.anInt9041;
					}
					Static366.aClass3_Sub1_Sub3_4.method2149(local17);
				} else {
					Static229.anInt4278 = 0;
					Static18.anInt450 = 0;
				}
			}
		} catch (@Pc(94) Exception local94) {
			local94.printStackTrace();
			Static366.aClass3_Sub1_Sub3_4.method2176();
			Static18.anInt450 = 0;
			Static107.aClass226_1 = null;
			Static172.aClass3_Sub4_2 = null;
			Static257.aClass3_Sub1_Sub3_2 = null;
			Static403.aClass15_107 = null;
		}
	}
}
