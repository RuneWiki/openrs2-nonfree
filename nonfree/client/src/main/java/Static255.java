import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mt", name = "H", descriptor = "Lclient!hn;")
	public static Class107 aClass107_135;

	@OriginalMember(owner = "client!mt", name = "B", descriptor = "[I")
	public static final int[] anIntArray391 = new int[1000];

	@OriginalMember(owner = "client!mt", name = "E", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[50][];

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_54 = new Class179(47, 18);

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "(III)Z")
	public static boolean method3829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static254.anIntArrayArrayArray13[arg0][arg1][arg2];
		if (local7 == -Static22.anInt541) {
			return false;
		} else if (local7 == Static22.anInt541) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static31.anInt665;
			@Pc(26) int local26 = arg2 << Static31.anInt665;
			if (Static316.method4482(local22 + 1, Static105.aClass149Array1[arg0].l(arg1, arg2), local26 + 1) && Static316.method4482(local22 + Static186.anInt3374 - 1, Static105.aClass149Array1[arg0].l(arg1 + 1, arg2), local26 + 1) && Static316.method4482(local22 + Static186.anInt3374 - 1, Static105.aClass149Array1[arg0].l(arg1 + 1, arg2 + 1), local26 + Static186.anInt3374 - 1) && Static316.method4482(local22 + 1, Static105.aClass149Array1[arg0].l(arg1, arg2 + 1), local26 + Static186.anInt3374 - 1) && Static316.method4482(local22 + Static69.anInt1593, Static105.aClass149Array1[arg0].l(arg1, arg2), local26 + 1) && Static316.method4482(local22 + Static186.anInt3374 - 1, Static105.aClass149Array1[arg0].l(arg1 + 1, arg2), local26 + Static69.anInt1593) && Static316.method4482(local22 + Static69.anInt1593, Static105.aClass149Array1[arg0].l(arg1, arg2 + 1), local26 + Static186.anInt3374 - 1) && Static316.method4482(local22 + Static186.anInt3374 - 1, Static105.aClass149Array1[arg0].l(arg1, arg2), local26 + Static69.anInt1593) && Static316.method4482(local22 + Static69.anInt1593, Static105.aClass149Array1[arg0].l(arg1, arg2), local26 + Static69.anInt1593)) {
				Static254.anIntArrayArrayArray13[arg0][arg1][arg2] = Static22.anInt541;
				return true;
			} else {
				Static254.anIntArrayArrayArray13[arg0][arg1][arg2] = -Static22.anInt541;
				return false;
			}
		}
	}
}
