import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!br", name = "r", descriptor = "Lclient!io;")
	public static final Class148 aClass148_2 = new Class148(4, 1, 1, 1);

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(CI)C")
	public static char method1043(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!dg;I)I")
	public static int method1045(@OriginalArg(0) Class63 arg0) {
		if (arg0 == Static24.aClass63_4) {
			return 5890;
		} else if (Static44.aClass63_2 == arg0) {
			return 34167;
		} else if (arg0 == Static233.aClass63_5) {
			return 34168;
		} else if (Static429.aClass63_6 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!gp;Lclient!gp;ILclient!gp;Lclient!tda;)Z")
	public static boolean method1046(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(3) Class117 arg2, @OriginalArg(4) Class5_Sub15_Sub4 arg3) {
		Static514.aClass117_218 = arg2;
		Static151.aClass117_79 = arg1;
		Static66.aClass117_32 = arg0;
		Static290.aClass5_Sub15_Sub4_1 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)Lclient!bea;")
	public static Class5_Sub2_Sub5 method1047() {
		return Static245.aClass5_Sub2_Sub5_3;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)[Lclient!ml;")
	public static Class199[] method1048() {
		return new Class199[] { Static124.aClass199_3, Static242.aClass199_6, Static75.aClass199_2, Static14.aClass199_1, Static357.aClass199_7, Static240.aClass199_5 };
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(Z)V")
	public static void method1049() {
		if (Static395.anInt7085 == -1) {
			return;
		}
		@Pc(11) int local11 = Static280.aClass214_1.method6766();
		@Pc(15) int local15 = Static280.aClass214_1.method6770();
		@Pc(20) Class5_Sub42 local20 = (Class5_Sub42) Static483.aClass99_76.method2526();
		if (local20 != null) {
			local11 = local20.method7433();
			local15 = local20.method7432();
		}
		Static190.method3194(0, Static456.anInt7874, local15, 0, 0, Static395.anInt7085, Static383.anInt6994, local11, 0);
		if (Static75.aClass220_4 != null) {
			Static137.method1260(local15, local11);
		}
	}
}
