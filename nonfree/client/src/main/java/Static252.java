import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
	public static int anInt4784;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "[I")
	public static int[] anIntArray323;

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
	public static int anInt4786 = 0;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BI)Z")
	public static boolean method3870(@OriginalArg(1) int arg0) {
		if (arg0 == 21 || arg0 == 44 || arg0 == 13 || arg0 == 5 || arg0 == 48) {
			return true;
		} else {
			return arg0 == 4 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!md;I)V")
	public static void method3871(@OriginalArg(0) Class2_Sub20 arg0) {
		if (arg0.aByteArray136.length - arg0.anInt4608 < 1) {
			return;
		}
		@Pc(26) int local26 = arg0.method3737();
		if (local26 < 0 || local26 > 1 || arg0.aByteArray136.length - arg0.anInt4608 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method3711();
		if (arg0.aByteArray136.length - arg0.anInt4608 != local46 * 6) {
			return;
		}
		while (true) {
			@Pc(62) int local62;
			@Pc(66) int local66;
			do {
				do {
					do {
						if (arg0.anInt4608 >= arg0.aByteArray136.length) {
							return;
						}
						local62 = arg0.method3711();
						local66 = arg0.method3731();
					} while (Static299.anIntArray357.length <= local62);
				} while (!Static381.aBooleanArray48[local62]);
			} while (Static275.aClass79_2.method1686(local62).aChar5 == '1' && (local66 < -1 || local66 > 1));
			Static299.anIntArray357[local62] = local66;
		}
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V")
	public static void method3872() {
		if (Static401.aBoolean593) {
			return;
		}
		Static176.method2776(Static79.aClass113ArrayArrayArray2);
		if (Static3.aClass113ArrayArrayArray1 != null) {
			Static176.method2776(Static3.aClass113ArrayArrayArray1);
		}
		Static401.aBoolean593 = true;
	}
}
