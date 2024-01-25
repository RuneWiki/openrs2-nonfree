import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!hr", name = "w", descriptor = "Lclient!tn;")
	public static Class342 aClass342_1;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_49 = new Class171(76, -1);

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "[Lclient!gl;")
	public static final Class134[] aClass134Array1 = new Class134[4];

	@OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
	public static int anInt4142 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	public static void method3517() {
		if (Static126.aString38.toLowerCase().indexOf("microsoft") != -1) {
			Static293.anIntArray482[220] = 74;
			Static293.anIntArray482[189] = 26;
			Static293.anIntArray482[187] = 27;
			Static293.anIntArray482[188] = 71;
			Static293.anIntArray482[192] = 58;
			Static293.anIntArray482[191] = 73;
			Static293.anIntArray482[186] = 57;
			Static293.anIntArray482[223] = 28;
			Static293.anIntArray482[190] = 72;
			Static293.anIntArray482[219] = 42;
			Static293.anIntArray482[221] = 43;
			Static293.anIntArray482[222] = 59;
			return;
		}
		Static293.anIntArray482[46] = 72;
		if (Static126.aMethod2 == null) {
			Static293.anIntArray482[222] = 59;
			Static293.anIntArray482[192] = 58;
		} else {
			Static293.anIntArray482[222] = 58;
			Static293.anIntArray482[192] = 28;
			Static293.anIntArray482[520] = 59;
		}
		Static293.anIntArray482[44] = 71;
		Static293.anIntArray482[92] = 74;
		Static293.anIntArray482[45] = 26;
		Static293.anIntArray482[91] = 42;
		Static293.anIntArray482[47] = 73;
		Static293.anIntArray482[61] = 27;
		Static293.anIntArray482[59] = 57;
		Static293.anIntArray482[93] = 43;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
	public static void method3521(@OriginalArg(0) int arg0) {
		Static492.anIntArray42 = new int[arg0];
		Static58.anIntArray511 = new int[arg0];
		Static652.anIntArray579 = new int[arg0];
		Static464.anIntArray403 = new int[arg0];
		Static419.anIntArray363 = new int[arg0];
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg4;
		@Pc(13) int local13 = arg5 - arg1;
		for (@Pc(15) int local15 = arg4; local15 < local9; local15++) {
			Static578.method7640(arg0, arg6, arg2, Static276.anIntArrayArray32[local15]);
		}
		@Pc(34) int local34 = arg2 - arg1;
		for (@Pc(36) int local36 = arg5; local36 > local13; local36--) {
			Static578.method7640(arg0, arg6, arg2, Static276.anIntArrayArray32[local36]);
		}
		@Pc(58) int local58 = arg6 + arg1;
		for (@Pc(60) int local60 = local9; local60 <= local13; local60++) {
			@Pc(66) int[] local66 = Static276.anIntArrayArray32[local60];
			Static578.method7640(arg0, arg6, local58, local66);
			Static578.method7640(arg3, local58, local34, local66);
			Static578.method7640(arg0, local34, arg2, local66);
		}
	}
}
