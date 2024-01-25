import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!uf", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString241 = "Use";

	@OriginalMember(owner = "client!uf", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!uf", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString242 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!uf", name = "N", descriptor = "Z")
	public static boolean aBoolean531 = false;

	@OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
	public static int anInt6037 = 0;

	@OriginalMember(owner = "client!uf", name = "P", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[100];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([JI[I)V")
	public static void method5282(@OriginalArg(0) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static2.method3303(arg1, arg0, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
	public static void method5283() {
		if (Static34.aClass2_6 == null) {
			return;
		}
		Static46.aClass175_1.method4667();
		Static84.method1606();
		Static227.method4127();
		Static294.method5054();
		Static268.method4681();
		Static351.method5672();
		if (Static92.aClass32_1 != null) {
			Static92.aClass32_1.method1033();
		}
		Static38.method3475();
		Static328.method5502();
		Static270.method4719();
		Static317.method5332(false);
		Static77.method1482();
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			@Pc(39) Class5_Sub3_Sub3_Sub1 local39 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local33];
			if (local39 != null) {
				local39.anInterface8_3 = null;
				for (@Pc(46) int local46 = 0; local46 < local39.aClass78Array3.length; local46++) {
					local39.aClass78Array3[local46] = null;
				}
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static169.aClass5_Sub3_Sub3_Sub2Array2.length; local71++) {
			@Pc(77) Class5_Sub3_Sub3_Sub2 local77 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local71];
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < local77.aClass78Array3.length; local81++) {
					local77.aClass78Array3[local81] = null;
				}
			}
		}
		Static34.aClass2_6.method3324();
		Static34.aClass2_6 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!cp;Z)Z")
	public static boolean method5285(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static7.aClass41Array1 == Static236.aClass41Array4;
		@Pc(8) int local8 = 0;
		arg0.method4584();
		if (arg0.aShort75 < 0 || arg0.aShort77 < 0 || arg0.aShort78 >= Static222.anInt4391 || arg0.aShort76 >= Static74.anInt3404) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort75; local30 <= arg0.aShort78; local30++) {
			for (local34 = arg0.aShort77; local34 <= arg0.aShort76; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort75) {
					local37++;
				}
				if (local30 < arg0.aShort78) {
					local37 += 4;
				}
				if (local34 > arg0.aShort77) {
					local37 += 8;
				}
				if (local34 < arg0.aShort76) {
					local37 += 2;
				}
				Static148.method4534(arg0.aByte53, local30, local34);
				@Pc(71) Class204 local71 = Static138.aClass204ArrayArrayArray1[arg0.aByte53][local30][local34];
				@Pc(76) Class17 local76 = Static19.method441(local37, arg0);
				@Pc(79) Class17 local79 = local71.aClass17_3;
				if (local79 == null) {
					local71.aClass17_3 = local76;
				} else {
					while (local79.aClass17_1 != null) {
						local79 = local79.aClass17_1;
					}
					local79.aClass17_1 = local76;
				}
				local71.aByte61 = (byte) (local71.aByte61 | local37);
				if (local6 && Static23.anIntArrayArray1[local30][local34] != 0) {
					local8 = Static23.anIntArrayArray1[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort75; local34 <= arg0.aShort78; local34++) {
				for (local37 = arg0.aShort77; local37 <= arg0.aShort76; local37++) {
					if (Static23.anIntArrayArray1[local34][local37] == 0) {
						Static23.anIntArrayArray1[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static184.aClass5_Sub3Array3[Static10.anInt234++] = arg0;
		}
		return true;
	}
}
