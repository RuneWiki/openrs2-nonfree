import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "Lclient!jb;")
	public static Class115_Sub1 aClass115_Sub1_2;

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "[I")
	public static final int[] anIntArray133 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!ck", name = "O", descriptor = "Lclient!fa;")
	public static final Class77 aClass77_4 = new Class77(16);

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "Lclient!o;")
	public static final Class169 aClass169_41 = new Class169("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_31 = new Class48(78, 8);

	@OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
	public static int anInt952 = 0;

	@OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
	public static int anInt953 = 503;

	@OriginalMember(owner = "client!ck", name = "T", descriptor = "[I")
	public static final int[] anIntArray134 = new int[50];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!je;IB)V")
	public static void method743(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aByte40 == 0) {
			arg1.anInt3104 = arg1.anInt3087;
		} else if (arg1.aByte40 == 1) {
			arg1.anInt3104 = (arg0 - arg1.anInt3071) / 2 + arg1.anInt3087;
		} else if (arg1.aByte40 == 2) {
			arg1.anInt3104 = arg0 - arg1.anInt3071 - arg1.anInt3087;
		} else if (arg1.aByte40 == 3) {
			arg1.anInt3104 = arg0 * arg1.anInt3087 >> 14;
		} else if (arg1.aByte40 == 4) {
			arg1.anInt3104 = (arg0 - arg1.anInt3071) / 2 + (arg0 * arg1.anInt3087 >> 14);
		} else {
			arg1.anInt3104 = arg0 - (arg0 * arg1.anInt3087 >> 14) - arg1.anInt3071;
		}
		if (arg1.aByte41 == 0) {
			arg1.anInt3072 = arg1.anInt3037;
		} else if (arg1.aByte41 == 1) {
			arg1.anInt3072 = (arg2 - arg1.anInt3074) / 2 + arg1.anInt3037;
		} else if (arg1.aByte41 == 2) {
			arg1.anInt3072 = arg2 - arg1.anInt3074 - arg1.anInt3037;
		} else if (arg1.aByte41 == 3) {
			arg1.anInt3072 = arg2 * arg1.anInt3037 >> 14;
		} else if (arg1.aByte41 == 4) {
			arg1.anInt3072 = (arg2 - arg1.anInt3074) / 2 + (arg2 * arg1.anInt3037 >> 14);
		} else {
			arg1.anInt3072 = arg2 - arg1.anInt3074 - (arg1.anInt3037 * arg2 >> 14);
		}
		if (!Static274.aBoolean463) {
			return;
		}
		if (Static50.method810(arg1).anInt3451 == 0 && arg1.anInt3108 != 0) {
			return;
		}
		if (arg1.anInt3072 < 0) {
			arg1.anInt3072 = 0;
		} else if (arg1.anInt3074 + arg1.anInt3072 > arg2) {
			arg1.anInt3072 = arg2 - arg1.anInt3074;
		}
		if (arg1.anInt3104 < 0) {
			arg1.anInt3104 = 0;
			return;
		}
		if (arg1.anInt3071 + arg1.anInt3104 > arg0) {
			arg1.anInt3104 = arg0 - arg1.anInt3071;
			return;
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
	public static void method744() {
		if (Static186.anInt3265 > 0) {
			Static384.method5442();
		} else {
			Static151.aClass130_4 = Static6.aClass130_1;
			Static6.aClass130_1 = null;
			Static212.method2974(40);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIBIIII)V")
	public static void method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 + arg5;
		@Pc(14) int local14 = arg3 - arg1;
		for (@Pc(16) int local16 = arg5; local16 < local9; local16++) {
			Static382.method5419(Static369.anIntArrayArray35[local16], arg0, arg4, arg2);
		}
		@Pc(39) int local39 = arg4 - arg1;
		for (@Pc(46) int local46 = arg3; local46 > local14; local46--) {
			Static382.method5419(Static369.anIntArrayArray35[local46], arg0, arg4, arg2);
		}
		@Pc(65) int local65 = arg0 + arg1;
		for (@Pc(67) int local67 = local9; local67 <= local14; local67++) {
			@Pc(73) int[] local73 = Static369.anIntArrayArray35[local67];
			Static382.method5419(local73, arg0, local65, arg2);
			Static382.method5419(local73, local39, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method747(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static248.anInt4157 >= 100 && !Static254.aBoolean435 || Static248.anInt4157 >= 200) {
			Static118.method1733(Static238.aClass169_213.method3680(anInt952));
			return;
		}
		@Pc(29) String local29 = Static125.method1826(arg0);
		if (local29 == null) {
			return;
		}
		for (@Pc(34) int local34 = 0; local34 < Static248.anInt4157; local34++) {
			@Pc(42) String local42 = Static125.method1826(Static175.aStringArray45[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static118.method1733(arg0 + Static371.aClass169_136.method3680(anInt952));
				return;
			}
			if (Static334.aStringArray78[local34] != null) {
				@Pc(72) String local72 = Static125.method1826(Static334.aStringArray78[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static118.method1733(arg0 + Static371.aClass169_136.method3680(anInt952));
					return;
				}
			}
		}
		for (@Pc(106) int local106 = 0; local106 < Static56.anInt1157; local106++) {
			@Pc(114) String local114 = Static125.method1826(Static250.aStringArray59[local106]);
			if (local114 != null && local114.equals(local29)) {
				Static118.method1733(Static10.aClass169_11.method3680(anInt952) + arg0 + Static34.aClass169_24.method3680(anInt952));
				return;
			}
			if (Static256.aStringArray60[local106] != null) {
				@Pc(149) String local149 = Static125.method1826(Static256.aStringArray60[local106]);
				if (local149 != null && local149.equals(local29)) {
					Static118.method1733(Static10.aClass169_11.method3680(anInt952) + arg0 + Static34.aClass169_24.method3680(anInt952));
					return;
				}
			}
		}
		if (Static125.method1826(Static321.aClass25_Sub1_Sub1_Sub1_2.aString6).equals(local29)) {
			Static118.method1733(Static313.aClass169_290.method3680(anInt952));
		} else {
			Static177.method1119(Static256.aClass48_155);
			Static209.aClass1_Sub33_Sub2_2.method5165(Static56.method903(arg0));
			Static209.aClass1_Sub33_Sub2_2.method5143(arg0);
		}
	}
}
