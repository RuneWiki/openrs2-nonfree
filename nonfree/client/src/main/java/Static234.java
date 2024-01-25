import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!no", name = "n", descriptor = "Lclient!nl;")
	public static Class171 aClass171_56;

	@OriginalMember(owner = "client!no", name = "p", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!no", name = "b", descriptor = "I")
	public static int anInt4158 = -1;

	@OriginalMember(owner = "client!no", name = "l", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_35 = new Class30();

	@OriginalMember(owner = "client!no", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	public static void method3798() {
		if (Static111.aClass63_3 == null) {
			return;
		}
		Static200.aClass154_6.method3488();
		Static149.method5444();
		Static51.method869();
		Static145.method4669();
		Static161.method2879();
		Static201.method3376();
		if (Static103.aClass33_1 != null) {
			Static103.aClass33_1.method707();
		}
		Static1.method5645();
		Static206.method3485();
		Static301.method4644();
		Static358.method1970(false);
		Static100.method1950();
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(45) Class1_Sub5_Sub1_Sub1 local45 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local39];
			if (local45 != null) {
				local45.aClass2_Sub42_3 = null;
				for (@Pc(52) int local52 = 0; local52 < local45.aClass66Array3.length; local52++) {
					local45.aClass66Array3[local52] = null;
				}
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static299.aClass1_Sub5_Sub1_Sub2Array1.length; local71++) {
			@Pc(77) Class1_Sub5_Sub1_Sub2 local77 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local71];
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < local77.aClass66Array3.length; local81++) {
					local77.aClass66Array3[local81] = null;
				}
			}
		}
		Static111.aClass63_3.method2050();
		Static111.aClass63_3 = null;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
	public static void method3802() {
		if (Static152.aString34.toLowerCase().indexOf("microsoft") != -1) {
			Static174.anIntArray650[221] = 43;
			Static174.anIntArray650[190] = 72;
			Static174.anIntArray650[186] = 57;
			Static174.anIntArray650[220] = 74;
			Static174.anIntArray650[189] = 26;
			Static174.anIntArray650[223] = 28;
			Static174.anIntArray650[192] = 58;
			Static174.anIntArray650[219] = 42;
			Static174.anIntArray650[188] = 71;
			Static174.anIntArray650[222] = 59;
			Static174.anIntArray650[191] = 73;
			Static174.anIntArray650[187] = 27;
			return;
		}
		Static174.anIntArray650[91] = 42;
		Static174.anIntArray650[93] = 43;
		Static174.anIntArray650[92] = 74;
		Static174.anIntArray650[61] = 27;
		if (Static152.aMethod2 == null) {
			Static174.anIntArray650[192] = 58;
			Static174.anIntArray650[222] = 59;
		} else {
			Static174.anIntArray650[222] = 58;
			Static174.anIntArray650[520] = 59;
			Static174.anIntArray650[192] = 28;
		}
		Static174.anIntArray650[46] = 72;
		Static174.anIntArray650[44] = 71;
		Static174.anIntArray650[45] = 26;
		Static174.anIntArray650[59] = 57;
		Static174.anIntArray650[47] = 73;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZZII)I")
	public static int method3803(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class2_Sub1 local10 = Static72.method4067(arg2, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray14.length; local18++) {
			if (local10.anIntArray14[local18] >= 0 && local10.anIntArray14[local18] < Static15.aClass81_1.anInt2148) {
				@Pc(52) Class179 local52 = Static15.aClass81_1.method2175(local10.anIntArray14[local18]);
				@Pc(64) int local64 = local52.method3943(Static261.aClass125_2.method2922(arg0).anInt3627, arg0);
				if (arg1) {
					local16 += local64 * local10.anIntArray15[local18];
				} else {
					local16 += local64;
				}
			}
		}
		return local16;
	}
}
