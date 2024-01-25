import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
	public static int anInt485;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "S")
	public static short aShort2 = 256;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
	public static int anInt483 = 2;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	public static int anInt484 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method446() {
		Static195.anInt3883 = 0;
		Static200.anInt3972 = 0;
		Static72.method1329();
		Static72.method1327();
		Static123.method2174();
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static200.anInt3972; local23++) {
			local29 = Static86.anIntArray135[local23];
			if (Static283.anInt5563 != Static280.aClass4_Sub5_Sub2_Sub2Array1[local29].anInt5350) {
				if (Static280.aClass4_Sub5_Sub2_Sub2Array1[local29].aClass106_1.method2822()) {
					Static161.method2843(Static280.aClass4_Sub5_Sub2_Sub2Array1[local29]);
				}
				Static280.aClass4_Sub5_Sub2_Sub2Array1[local29].method4821(null);
				Static280.aClass4_Sub5_Sub2_Sub2Array1[local29] = null;
			}
		}
		if (Static54.anInt1000 != Static187.aClass5_Sub12_Sub2_4.anInt5731) {
			throw new RuntimeException("gnp1 pos:" + Static187.aClass5_Sub12_Sub2_4.anInt5731 + " psize:" + Static54.anInt1000);
		}
		for (local29 = 0; local29 < Static133.anInt2579; local29++) {
			if (Static280.aClass4_Sub5_Sub2_Sub2Array1[Static95.anIntArray160[local29]] == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static133.anInt2579);
			}
		}
	}
}
