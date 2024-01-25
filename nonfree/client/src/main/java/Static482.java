import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	public static int anInt8056;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public static int anInt8057;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array21;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
	public static final int[] anIntArray533 = new int[1000];

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_192 = new Class81(18, 11);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6705(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static60.anInt1505;
		@Pc(9) int[] local9 = Static346.anIntArray413;
		@Pc(11) boolean local11 = false;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class20_Sub2_Sub4_Sub1_Sub1 local26 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local9[local18]];
			if (local26 != null && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 != local26 && local26.aString49 != null && local26.aString49.equalsIgnoreCase(arg1)) {
				local11 = true;
				@Pc(59) Class1_Sub48 local59;
				if (arg0 == 1) {
					local59 = Static320.method4867(Static442.aClass170_2, Static388.aClass319_129);
					local59.aClass1_Sub20_Sub1_2.method4402(local9[local18]);
					local59.aClass1_Sub20_Sub1_2.method4422(0);
					Static34.method813(local59);
				} else if (arg0 == 4) {
					local59 = Static320.method4867(Static442.aClass170_2, Static138.aClass319_56);
					local59.aClass1_Sub20_Sub1_2.method4422(0);
					local59.aClass1_Sub20_Sub1_2.method4409(local9[local18]);
					Static34.method813(local59);
				} else if (arg0 == 5) {
					local59 = Static320.method4867(Static442.aClass170_2, Static459.aClass319_145);
					local59.aClass1_Sub20_Sub1_2.method4402(local9[local18]);
					local59.aClass1_Sub20_Sub1_2.method4422(0);
					Static34.method813(local59);
				} else if (arg0 == 6) {
					local59 = Static320.method4867(Static442.aClass170_2, Static109.aClass319_42);
					local59.aClass1_Sub20_Sub1_2.method4378(0);
					local59.aClass1_Sub20_Sub1_2.method4381(local9[local18]);
					Static34.method813(local59);
				} else if (arg0 == 7) {
					local59 = Static320.method4867(Static442.aClass170_2, Static592.aClass319_173);
					local59.aClass1_Sub20_Sub1_2.method4422(0);
					local59.aClass1_Sub20_Sub1_2.method4381(local9[local18]);
					Static34.method813(local59);
				}
				break;
			}
		}
		if (!local11) {
			Static172.method2626(Static103.aClass77_23.method1864(Static562.anInt9127) + arg1);
		}
	}
}
