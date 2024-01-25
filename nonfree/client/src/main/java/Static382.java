import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
	public static int anInt6965;

	@OriginalMember(owner = "client!qba", name = "w", descriptor = "I")
	public static int anInt6971;

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "Lclient!ei;")
	public static final Class79 aClass79_10 = new Class79();

	@OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
	public static int anInt6967 = 0;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)I")
	public static int method5847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static132.method2205(arg1 - 1, arg0 + -1) + Static132.method2205(arg1 + 1, arg0 - 1) + Static132.method2205(arg1 - 1, arg0 + 1) + Static132.method2205(arg1 - -1, arg0 + 1);
		@Pc(74) int local74 = Static132.method2205(arg1 - 1, arg0) + Static132.method2205(arg1 + 1, arg0) + Static132.method2205(arg1, arg0 - 1) + Static132.method2205(arg1, arg0 + 1);
		@Pc(79) int local79 = Static132.method2205(arg1, arg0);
		return local74 / 8 + local42 / 16 + local79 / 4;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)Z")
	public static boolean method5849() {
		try {
			if (Static302.anInt5579 == 2) {
				if (Static181.aClass1_Sub21_1 == null) {
					Static181.aClass1_Sub21_1 = Static549.method2481(Static351.aClass171_102, Static215.anInt4126, Static38.anInt834);
					if (Static181.aClass1_Sub21_1 == null) {
						return false;
					}
				}
				if (Static545.aClass258_1 == null) {
					Static545.aClass258_1 = new Class258(Static272.aClass171_83, Static497.aClass171_147);
				}
				if (Static106.aClass1_Sub16_Sub3_1.method5248(Static419.aClass171_131, Static545.aClass258_1, Static181.aClass1_Sub21_1)) {
					Static106.aClass1_Sub16_Sub3_1.method5272();
					Static106.aClass1_Sub16_Sub3_1.method5254(Static101.anInt7625);
					Static106.aClass1_Sub16_Sub3_1.method5251(Static55.aBoolean70, Static181.aClass1_Sub21_1);
					Static302.anInt5579 = 0;
					Static545.aClass258_1 = null;
					Static181.aClass1_Sub21_1 = null;
					Static351.aClass171_102 = null;
					return true;
				}
			}
		} catch (@Pc(67) Exception local67) {
			local67.printStackTrace();
			Static106.aClass1_Sub16_Sub3_1.method5253();
			Static181.aClass1_Sub21_1 = null;
			Static545.aClass258_1 = null;
			Static351.aClass171_102 = null;
			Static302.anInt5579 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)V")
	public static void method5850() {
		Static227.method3905();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static86.aClass91Array1[local8].method2180();
		}
		Static359.method5344();
		Static194.method2970();
		System.gc();
	}
}
