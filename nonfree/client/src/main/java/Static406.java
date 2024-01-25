import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "Lclient!hh;")
	public static Class109 aClass109_92;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
	public static int anInt7171;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_348 = new Class12(84, 4);

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Z")
	public static boolean aBoolean595 = false;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)Z")
	public static boolean method5515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static291.anIntArrayArrayArray141[arg0][arg1][arg2];
		if (local7 == -Static79.anInt1457) {
			return false;
		} else if (local7 == Static79.anInt1457) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static58.anInt1051;
			@Pc(26) int local26 = arg2 << Static58.anInt1051;
			if (Static87.method4374(local22 + 1, Static256.aClass70Array2[arg0].I(arg1, arg2), local26 + 1) && Static87.method4374(local22 + Static297.anInt4985 - 1, Static256.aClass70Array2[arg0].I(arg1 + 1, arg2), local26 + 1) && Static87.method4374(local22 + Static297.anInt4985 - 1, Static256.aClass70Array2[arg0].I(arg1 + 1, arg2 + 1), local26 + Static297.anInt4985 - 1) && Static87.method4374(local22 + 1, Static256.aClass70Array2[arg0].I(arg1, arg2 + 1), local26 + Static297.anInt4985 - 1) && Static87.method4374(local22 + Static86.anInt1530, Static256.aClass70Array2[arg0].I(arg1, arg2), local26 + 1) && Static87.method4374(local22 + Static297.anInt4985 - 1, Static256.aClass70Array2[arg0].I(arg1 + 1, arg2), local26 + Static86.anInt1530) && Static87.method4374(local22 + Static86.anInt1530, Static256.aClass70Array2[arg0].I(arg1, arg2 + 1), local26 + Static297.anInt4985 - 1) && Static87.method4374(local22 + Static297.anInt4985 - 1, Static256.aClass70Array2[arg0].I(arg1, arg2), local26 + Static86.anInt1530) && Static87.method4374(local22 + Static86.anInt1530, Static256.aClass70Array2[arg0].I(arg1, arg2), local26 + Static86.anInt1530)) {
				Static291.anIntArrayArrayArray141[arg0][arg1][arg2] = Static79.anInt1457;
				return true;
			} else {
				Static291.anIntArrayArrayArray141[arg0][arg1][arg2] = -Static79.anInt1457;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZZIII)V")
	public static void method5517(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static177.method2859(arg2, arg1, 0, arg3, arg0, Static4.aClass48_Sub1Array1.length - 1);
		Static355.aClass1_Sub4_5 = null;
		Static164.anInt2905 = 0;
	}
}
