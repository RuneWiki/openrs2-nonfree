import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	public static int anInt7064;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public static final int anInt7058 = 1401;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_67 = new Class286(5, -1);

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	public static int anInt7061 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method5919() {
		Static380.anInt6816 = Static381.aClass330_7.anInt9384 + Static381.aClass330_7.anInt9393 + 2;
		Static514.anInt8777 = Static687.aClass330_13.anInt9384 + Static687.aClass330_13.anInt9393 + 2;
		Static527.aStringArray34 = new String[500];
		for (@Pc(31) int local31 = 0; local31 < Static527.aStringArray34.length; local31++) {
			Static527.aStringArray34[local31] = "";
		}
		Static269.method4123(Static476.aClass279_1.method6992(Static141.anInt2658));
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ha;IIIII[[[BIIIIII)V")
	public static void method5920(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		if (arg3 == 0 || arg8 == 0) {
			return;
		}
		if (arg3 == 9) {
			arg3 = 1;
			arg5 = arg5 + 1 & 0x3;
		}
		if (arg3 == 10) {
			arg3 = 1;
			arg5 = arg5 + 3 & 0x3;
		}
		if (arg3 == 11) {
			arg3 = 8;
			arg5 = arg5 + 3 & 0x3;
		}
		arg0.Q(arg10, arg2, arg7, arg11, arg1, arg4, arg6[arg3 - 1][arg5], arg8, arg9);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
	public static void method5921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static433.method6363(local7.aClass19_Sub1_Sub5_1);
			if (local7.aClass19_Sub1_Sub5_1 != null) {
				local7.aClass19_Sub1_Sub5_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	public static void method5922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static241.anInt4516 = arg2;
		Static144.anInt2745 = arg1;
		Static599.anInt9769 = arg0;
		Static204.anInt3530 = arg3;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method5923() {
		if (!Static277.method4237()) {
			return;
		}
		if (Static527.aStringArray34 == null) {
			method5919();
		}
		Static332.anInt5825 = 0;
		Static9.aBoolean8 = true;
	}
}
