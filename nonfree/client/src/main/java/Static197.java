import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!wh", name = "V", descriptor = "[I")
	public static final int[] anIntArray527 = new int[128];

	@OriginalMember(owner = "client!wh", name = "eb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1747 = Static120.method1824("Freie Welt");

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)I")
	public static int method3177(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!rd;)V")
	public static void method3178(@OriginalArg(1) Class80 arg0) {
		if (Static177.anInt3975 >= 2) {
			if (arg0.method2432(Static26.aClass80_205)) {
				System.gc();
			}
			if (arg0.method2432(Static34.aClass80_264)) {
				Static9.method169();
			}
			if (arg0.method2432(Static156.aClass80_1356)) {
				Static51.aBoolean49 = true;
			}
			if (arg0.method2432(Static107.aClass80_941)) {
				Static51.aBoolean49 = false;
			}
			arg0.method2432(Static84.aClass80_1653);
			arg0.method2432(Static108.aClass80_1154);
			if (arg0.method2432(Static194.aClass80_1722)) {
				for (@Pc(64) int local64 = 0; local64 < 4; local64++) {
					for (@Pc(68) int local68 = 1; local68 < 103; local68++) {
						for (@Pc(72) int local72 = 1; local72 < 103; local72++) {
							Static32.aClass82Array11[local64].anIntArrayArray38[local68][local72] = 0;
						}
					}
				}
			}
			if (arg0.method2466(Static143.aClass80_1203) && Static94.anInt2013 != 0) {
				Static62.method916(arg0.method2449(6).method2463());
			}
			if (arg0.method2432(Static103.aClass80_878) && Static94.anInt2013 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method2466(Static112.aClass80_998)) {
				Static102.anInt2141 = arg0.method2449(12).method2431().method2463();
				Static147.method2354(null, 0, Static154.method2467(new Class80[] { Static97.aClass80_833, Static83.method1219(Static102.anInt2141) }));
			}
			if (arg0.method2432(Static135.aClass80_1134)) {
				Static106.aBoolean90 = true;
			}
		}
		Static146.aClass3_Sub17_Sub1_3.method2146(29);
		Static146.aClass3_Sub17_Sub1_3.method2108(arg0.method2462() - 1);
		Static146.aClass3_Sub17_Sub1_3.method2130(arg0.method2449(2));
	}
}
