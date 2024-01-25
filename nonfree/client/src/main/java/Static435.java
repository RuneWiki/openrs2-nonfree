import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_122 = new Class274(69, 4);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
	public static void method6491() {
		Static21.aClass20Array1 = null;
		Static553.aClass20Array14 = null;
		Static495.aClass20Array11 = null;
		Static187.aClass20Array6 = null;
		Static316.aClass20Array8 = null;
		Static268.aClass20Array7 = null;
		Static177.aClass20Array4 = null;
		Static165.aClass20_6 = null;
		Static169.aClass20Array15 = null;
		Static4.aClass64_1 = null;
		Static289.aClass20_14 = null;
		Static489.aClass20Array10 = null;
		Static409.aClass20Array9 = null;
		Static539.aClass20Array13 = null;
		Static428.aClass64_11 = null;
		Static536.aClass20Array12 = null;
		Static573.aClass64_15 = null;
		Static621.aClass20Array16 = null;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIBII)I")
	public static int method6493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg0 & 0xF;
		@Pc(21) int local21 = local12 < 8 ? arg1 : arg3;
		@Pc(40) int local40 = local12 < 4 ? arg3 : local12 == 12 || local12 == 14 ? arg1 : arg2;
		return ((local12 & 0x1) == 0 ? local21 : -local21) + ((local12 & 0x2) == 0 ? local40 : -local40);
	}
}
