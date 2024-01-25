import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "J")
	public static long aLong107 = 0L;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	public static void method2835(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static395.anInt7085 != -1) {
				Static492.method6830(Static395.anInt7085);
			}
			for (@Pc(19) Class5_Sub43 local19 = (Class5_Sub43) Static307.aClass42_24.method1103(); local19 != null; local19 = (Class5_Sub43) Static307.aClass42_24.method1105()) {
				if (!local19.method7426()) {
					local19 = (Class5_Sub43) Static307.aClass42_24.method1103();
					if (local19 == null) {
						break;
					}
				}
				Static343.method5317(true, false, local19);
			}
			Static395.anInt7085 = -1;
			Static307.aClass42_24 = new Class42(8);
			Static304.method4998();
			Static395.anInt7085 = Static82.anInt1573;
			Static92.method1973(false);
			Static544.method2108();
			Static266.method4402(Static395.anInt7085);
		}
		Static428.aBoolean536 = false;
		Static469.aString73 = "";
		Static17.aString14 = "";
		Static329.method5207();
		Static92.anInt2142 = -1;
		Static354.method5481(Static221.anInt4156);
		Static35.aClass15_Sub2_Sub1_Sub1_1 = new Class15_Sub2_Sub1_Sub1();
		Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray306[0] = Static460.anInt7894 / 2;
		Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 = Static460.anInt7894 * 128 / 2;
		Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 = Static235.anInt4493 * 128 / 2;
		Static364.anInt6817 = 0;
		Static367.anInt6861 = 0;
		Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray307[0] = Static235.anInt4493 / 2;
		if (Static166.anInt3343 == 2) {
			Static367.anInt6861 = Static65.anInt1250 << 7;
			Static364.anInt6817 = Static394.anInt7079 << 7;
		} else {
			Static317.method5104();
		}
		Static81.method1438();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
	public static int method2836(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
