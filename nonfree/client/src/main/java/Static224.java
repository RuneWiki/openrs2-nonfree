import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_61 = new Class242(60, -1);

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_53 = new Class142("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "[I")
	public static final int[] anIntArray288 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "J")
	public static long aLong131 = 0L;

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "Z")
	public static boolean aBoolean370 = false;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
	public static void method3209() {
		Static137.aClass107Array1 = null;
		Static220.method3159(Static192.anInt3532, 0, Static118.anInt1785, 0, 0, Static40.anInt597, 0, -1);
		if (Static137.aClass107Array1 != null) {
			Static249.method3534(Static192.aClass107_9.anInt2665, Static137.aClass107Array1, Static71.anInt1036, -1412584499, Static366.anInt5956, Static40.anInt597, 0, Static192.anInt3532, 0);
			Static137.aClass107Array1 = null;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZIIIIII)Z")
	public static boolean method3210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray246[0];
		@Pc(18) int local18 = Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray247[0];
		if (local13 < 0 || Static147.anInt2300 <= local13 || local18 < 0 || local18 >= Static293.anInt4886) {
			return false;
		} else if (arg7 >= 0 && arg7 < Static147.anInt2300 && arg5 >= 0 && Static293.anInt4886 > arg5) {
			@Pc(77) int local77 = Static282.method3775(Static385.aClass158Array1[Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90], arg0, arg6, arg7, Static94.aClass11_Sub1_Sub3_Sub2_1.method2635(), Static279.anIntArray356, arg2, arg1, local18, arg4, arg3, local13, Static392.anIntArray462, arg5);
			if (local77 < 1) {
				return false;
			}
			Static460.anInt7364 = Static392.anIntArray462[local77 - 1];
			Static288.anInt4834 = Static279.anIntArray356[local77 - 1];
			Static207.aBoolean358 = false;
			Static413.method5275();
			return true;
		} else {
			return false;
		}
	}
}
