import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cw", name = "o", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array2;

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array3;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "Lclient!ki;")
	public static final Class183 aClass183_6 = new Class183();

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)V")
	public static void method1786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass2_Sub3_2 != null) {
			local7.aClass2_Sub3_2 = null;
		}
		if (local7.aClass2_Sub3_1 != null) {
			local7.aClass2_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)V")
	public static void method1787() {
		if (Static211.method3722(Static75.anInt1880) || Static159.method3027(Static75.anInt1880)) {
			Static523.method7750(Static594.anInt10391 >> 12, 5000, Static496.anInt9269 >> 12);
		} else {
			@Pc(18) int local18 = Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray487[0] >> 3;
			@Pc(25) int local25 = Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray488[0] >> 3;
			if (local18 >= 0 && local18 < Static460.anInt8640 >> 3 && local25 >= 0 && local25 < Static292.anInt7682 >> 3) {
				Static523.method7750(local18, 5000, local25);
			} else {
				Static523.method7750(Static460.anInt8640 >> 4, 0, Static292.anInt7682 >> 4);
			}
		}
		Static203.method3388();
		Static481.method7380();
		Static270.method3650();
		Static460.method7069();
	}
}
