import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "F")
	public static float aFloat202;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	public static int anInt7725;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_104 = new Class154(67, 2);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Z")
	public static boolean method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIIIIII)V")
	public static void method6241(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class80[] local3 = Static271.aClass80Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class80 local11 = local3[local5];
			if (local11 != null && local11.anInt1806 == 2) {
				Static89.method1351(arg0 >> 1, local11.anInt1809, local11.anInt1804, local11.anInt1802, arg2 >> 1, local11.anInt1811 * 2);
				if (Static494.anIntArray527[0] > -1 && Static532.anInt8757 % 20 < 10) {
					Static317.aClass38Array17[local11.anInt1801].method7463(Static494.anIntArray527[0] + arg3 - 12, Static494.anIntArray527[1] + -28 + arg1);
				}
			}
		}
	}
}
