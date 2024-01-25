import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gg", name = "pd", descriptor = "I")
	public static int anInt3328;

	@OriginalMember(owner = "client!gg", name = "Fd", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!gg", name = "Nc", descriptor = "Lclient!c;")
	public static final Class51 aClass51_13 = new Class51(5, 1);

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V")
	public static void method2890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static480.aClass80_10 == Static161.aClass80_6) {
			if (!Static369.method5538(arg1, false, 1, 0, -2, 0, 1, arg0)) {
				Static369.method5538(arg1, false, 1, 0, -3, 0, 1, arg0);
			}
		} else if (!Static369.method5538(arg1, false, 1, 0, -3, 0, 1, arg0)) {
			Static369.method5538(arg1, false, 1, 0, -2, 0, 1, arg0);
		}
	}

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "(I)Z")
	public static boolean method2891() {
		try {
			if (Static625.anInt11174 == 2) {
				if (Static675.aClass14_Sub28_2 == null) {
					Static675.aClass14_Sub28_2 = Static695.method5901(Static431.aClass310_93, Static485.anInt8392, Static316.anInt5540);
					if (Static675.aClass14_Sub28_2 == null) {
						return false;
					}
				}
				if (Static2.aClass226_1 == null) {
					Static2.aClass226_1 = new Class226(Static127.aClass310_138, Static497.aClass310_100);
				}
				@Pc(36) Class14_Sub1_Sub3 local36 = Static472.aClass14_Sub1_Sub3_3;
				if (Static556.aClass14_Sub1_Sub3_4 != null) {
					local36 = Static556.aClass14_Sub1_Sub3_4;
				}
				if (local36.method1907(Static2.aClass226_1, Static675.aClass14_Sub28_2, Static267.aClass310_59)) {
					Static472.aClass14_Sub1_Sub3_3 = local36;
					Static472.aClass14_Sub1_Sub3_3.method1892();
					@Pc(65) int local65;
					if (Static184.anInt7568 <= 0) {
						Static625.anInt11174 = 0;
						Static472.aClass14_Sub1_Sub3_3.method1890(Static210.anInt3677);
						for (local65 = 0; local65 < Static269.anIntArray561.length; local65++) {
							Static472.aClass14_Sub1_Sub3_3.method1919(Static269.anIntArray561[local65], local65);
							Static269.anIntArray561[local65] = 255;
						}
					} else {
						Static625.anInt11174 = 3;
						Static472.aClass14_Sub1_Sub3_3.method1890(Static210.anInt3677 < Static184.anInt7568 ? Static210.anInt3677 : Static184.anInt7568);
						for (local65 = 0; local65 < Static269.anIntArray561.length; local65++) {
							Static472.aClass14_Sub1_Sub3_3.method1919(Static269.anIntArray561[local65], local65);
							Static269.anIntArray561[local65] = 255;
						}
					}
					if (Static556.aClass14_Sub1_Sub3_4 == null) {
						if (Static136.aLong92 <= 0L) {
							Static472.aClass14_Sub1_Sub3_3.method1903(Static270.aBoolean372, Static675.aClass14_Sub28_2);
						} else {
							Static472.aClass14_Sub1_Sub3_3.method1906(Static675.aClass14_Sub28_2, Static136.aLong92, Static270.aBoolean372);
						}
					}
					if (Static354.aClass37_2 != null) {
						Static354.aClass37_2.method4380(Static472.aClass14_Sub1_Sub3_3);
					}
					Static2.aClass226_1 = null;
					Static556.aClass14_Sub1_Sub3_4 = null;
					Static136.aLong92 = 0L;
					Static675.aClass14_Sub28_2 = null;
					Static431.aClass310_93 = null;
					return true;
				}
			}
		} catch (@Pc(182) Exception local182) {
			local182.printStackTrace();
			Static472.aClass14_Sub1_Sub3_3.method1914();
			Static2.aClass226_1 = null;
			Static556.aClass14_Sub1_Sub3_4 = null;
			Static625.anInt11174 = 0;
			Static675.aClass14_Sub28_2 = null;
			Static431.aClass310_93 = null;
		}
		return false;
	}
}
