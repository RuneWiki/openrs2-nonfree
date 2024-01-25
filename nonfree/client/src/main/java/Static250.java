import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ps", name = "D", descriptor = "Lclient!dp;")
	public static Class53 aClass53_22;

	@OriginalMember(owner = "client!ps", name = "J", descriptor = "Lclient!dp;")
	public static Class53 aClass53_23;

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
	public static int anInt486 = 0;

	@OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
	public static int anInt490 = 0;

	@OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
	public static int anInt493 = 0;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)V")
	public static void method422() {
		if (Static289.aClass81_7 == null) {
			return;
		}
		Static66.aClass109_2.method2946();
		Static289.method4941();
		Static184.method3475();
		Static5.method94();
		Static348.method5740();
		Static163.method3244();
		if (Static309.aClass125_1 != null) {
			Static309.aClass125_1.method3406();
		}
		Static172.method3365();
		Static83.method1391();
		Static297.method5063();
		Static31.method487(false);
		Static20.method303();
		for (@Pc(35) int local35 = 0; local35 < 2048; local35++) {
			@Pc(41) Class44_Sub4_Sub4_Sub1 local41 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local35];
			if (local41 != null) {
				local41.anInterface7_3 = null;
				for (@Pc(48) int local48 = 0; local48 < local41.aClass78Array3.length; local48++) {
					local41.aClass78Array3[local48] = null;
				}
			}
		}
		for (@Pc(67) int local67 = 0; local67 < Static239.aClass44_Sub4_Sub4_Sub2Array8.length; local67++) {
			@Pc(73) Class44_Sub4_Sub4_Sub2 local73 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local67];
			if (local73 != null) {
				for (@Pc(77) int local77 = 0; local77 < local73.aClass78Array3.length; local77++) {
					local73.aClass78Array3[local77] = null;
				}
			}
		}
		Static289.aClass81_7.method2966();
		Static289.aClass81_7 = null;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IC)C")
	public static char method424(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
