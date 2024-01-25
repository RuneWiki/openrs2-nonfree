import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public static int anInt5047 = 0;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "[I")
	public static final int[] anIntArray347 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_64 = new Class179(49, 7);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	public static void method4253() {
		@Pc(9) int local9;
		if (Static321.aClass327Array3 != null) {
			for (local9 = 0; local9 < Static631.anInt9614; local9++) {
				Static321.aClass327Array3[local9] = null;
			}
			Static321.aClass327Array3 = null;
		}
		if (Static144.aClass327Array1 != null) {
			for (local9 = 0; local9 < Static238.anInt3898; local9++) {
				Static144.aClass327Array1[local9] = null;
			}
			Static144.aClass327Array1 = null;
		}
		if (Static422.aClass327Array4 != null) {
			for (local9 = 0; local9 < Static296.anInt4855; local9++) {
				Static422.aClass327Array4[local9] = null;
			}
			Static422.aClass327Array4 = null;
		}
		Static585.anInt9543 = -1;
		Static278.anInt4447 = -1;
		Static160.aClass327Array2 = null;
		Static195.anIntArrayArrayArray9 = null;
		Static269.anIntArray287 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[Lclient!paa;I)V")
	public static void method4254(@OriginalArg(0) int arg0, @OriginalArg(1) Class261[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class261 local13 = arg1[local7];
			if (local13 != null) {
				if (local13.anInt6635 == 0) {
					if (local13.aClass261Array2 != null) {
						method4254(arg0, local13.aClass261Array2);
					}
					@Pc(34) Class2_Sub9 local34 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local13.anInt6614);
					if (local34 != null) {
						Static170.method7974(local34.anInt2171, arg0);
					}
				}
				@Pc(53) Class2_Sub46 local53;
				if (arg0 == 0 && local13.anObjectArray5 != null) {
					local53 = new Class2_Sub46();
					local53.aClass261_10 = local13;
					local53.anObjectArray32 = local13.anObjectArray5;
					Static300.method4138(local53);
				}
				if (arg0 == 1 && local13.anObjectArray13 != null) {
					if (local13.anInt6629 >= 0) {
						@Pc(76) Class261 local76 = Static357.method4826(local13.anInt6614);
						if (local76 == null || local76.aClass261Array2 == null || local76.aClass261Array2.length <= local13.anInt6629 || local13 != local76.aClass261Array2[local13.anInt6629]) {
							continue;
						}
					}
					local53 = new Class2_Sub46();
					local53.aClass261_10 = local13;
					local53.anObjectArray32 = local13.anObjectArray13;
					Static300.method4138(local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BZI)V")
	public static void method4257(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static41.method665(arg1, arg0, Static434.aClass271_12.method5972(Static483.anInt7694));
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)Z")
	public static boolean method4263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static528.method7294(arg0, arg1) || Static51.method829(arg0, arg1);
	}
}
