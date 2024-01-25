import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public static int anInt8037;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public static int anInt8038;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
	public static int anInt8042;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_176 = new Class359(64, -1);

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "[I")
	public static final int[] anIntArray447 = new int[8];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)Z")
	public static boolean method6823(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static208.aClass65_7.method6934();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static208.aClass65_7.method6961();
		} else if (!Static208.aClass65_7.method6929()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static172.aClass5_Sub50_14.method7531(arg0 ? 1 : 0, Static172.aClass5_Sub50_14.aClass12_Sub15_1);
			Static102.method1995();
			return true;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method6824() {
		if (Static570.aClass268_5.aBoolean644 && Static513.aClass395_3.anInt10873 != -1) {
			Static409.method6020(Static513.aClass395_3.anInt10873, Static513.aClass395_3.aString122);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIIIIII)V")
	public static void method6825(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg4);
		@Pc(28) int local28 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg2);
		@Pc(34) int local34 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg0);
		@Pc(40) int local40 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg5);
		@Pc(49) int local49 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg4 + arg3);
		@Pc(58) int local58 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg2 - arg3);
		for (@Pc(60) int local60 = local22; local60 < local49; local60++) {
			Static197.method3240(local40, Static16.anIntArrayArray2[local60], local34, arg1);
		}
		for (@Pc(76) int local76 = local28; local76 > local58; local76--) {
			Static197.method3240(local40, Static16.anIntArrayArray2[local76], local34, arg1);
		}
		@Pc(102) int local102 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg0 + arg3);
		@Pc(111) int local111 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg5 - arg3);
		for (@Pc(113) int local113 = local49; local113 <= local58; local113++) {
			@Pc(119) int[] local119 = Static16.anIntArrayArray2[local113];
			Static197.method3240(local102, local119, local34, arg1);
			Static197.method3240(local40, local119, local111, arg1);
		}
	}
}
