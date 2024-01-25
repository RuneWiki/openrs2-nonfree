import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "Lclient!dp;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!es;)V")
	public static void method3718(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(9) int local9 = arg0.method4328();
		Static217.aClass311Array1 = new Class311[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static217.aClass311Array1[local14] = new Class311();
			Static217.aClass311Array1[local14].anInt8370 = arg0.method4328();
			Static217.aClass311Array1[local14].aString94 = arg0.method4321();
		}
		Static158.anInt3180 = arg0.method4328();
		Static198.anInt3925 = arg0.method4328();
		Static407.anInt7071 = arg0.method4328();
		Static363.aClass136_Sub1Array2 = new Class136_Sub1[Static198.anInt3925 + 1 - Static158.anInt3180];
		for (@Pc(67) int local67 = 0; local67 < Static407.anInt7071; local67++) {
			@Pc(73) int local73 = arg0.method4328();
			@Pc(81) Class136_Sub1 local81 = Static363.aClass136_Sub1Array2[local73] = new Class136_Sub1();
			local81.anInt4378 = arg0.method4325();
			local81.anInt4380 = arg0.method4307();
			local81.anInt4389 = Static158.anInt3180 + local73;
			local81.aString34 = arg0.method4321();
			local81.aString33 = arg0.method4321();
		}
		Static46.anInt1129 = arg0.method4307();
		Static419.aBoolean511 = true;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)V")
	public static void method3719() {
		if (Static100.aBoolean183) {
			return;
		}
		Static341.aBoolean494 = true;
		Static100.aBoolean183 = true;
		if (Static72.aClass2_Sub12_Sub1_1.aBoolean151) {
			Static447.aFloat233 = (int) Static447.aFloat233 - 65 & 0xFFFFFF80;
		} else {
			Static11.aFloat8 += (-Static11.aFloat8 - 24.0F) / 2.0F;
		}
	}
}
