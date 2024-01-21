import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	public static int anInt2520;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!id;")
	public static Class44 aClass44_2;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "Lclient!ae;")
	public static Class5 aClass5_14;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "[I")
	public static int[] anIntArray249;

	@OriginalMember(owner = "client!nb", name = "R", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_737 = Static181.method2795("Loading title screen )2 ");

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "Lclient!qe;")
	public static Class83 aClass83_738 = aClass83_737;

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_741 = Static181.method2795("Loaded wordpack");

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "Lclient!qe;")
	public static Class83 aClass83_739 = aClass83_741;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_740 = Static181.method2795("sl_arrows");

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "[I")
	public static final int[] anIntArray250 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
	public static int anInt2528 = 0;

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_742 = Static181.method2795("Fps:");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIBII)V")
	public static void method1906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static139.anInt2948; local7++) {
			if (arg3 < Static86.anIntArray181[local7] + Static71.anIntArray167[local7] && arg3 + arg0 > Static86.anIntArray181[local7] && Static15.anIntArray27[local7] + Static101.anIntArray226[local7] > arg2 && Static101.anIntArray226[local7] < arg1 + arg2) {
				aBooleanArray16[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg4 < 128 || arg0 < 128 || arg4 > 13056 || arg0 > 13056) {
			Static152.anInt3095 = -1;
			Static62.anInt1509 = -1;
			return;
		}
		@Pc(33) int local33 = Static177.method2711(arg4, Static43.anInt1126, arg0) - arg1;
		@Pc(37) int local37 = local33 - Static199.anInt3952;
		@Pc(41) int local41 = Class16.anIntArray39[Static18.anInt2017];
		@Pc(45) int local45 = arg0 - Static174.anInt3596;
		@Pc(49) int local49 = Class16.anIntArray44[Static18.anInt2017];
		@Pc(53) int local53 = arg4 - Static21.anInt567;
		@Pc(57) int local57 = Class16.anIntArray44[Static54.anInt1360];
		@Pc(61) int local61 = Class16.anIntArray39[Static54.anInt1360];
		@Pc(71) int local71 = local53 * local61 + local45 * local57 >> 16;
		@Pc(81) int local81 = local45 * local61 - local53 * local57 >> 16;
		@Pc(83) int local83 = local71;
		@Pc(94) int local94 = local37 * local41 - local49 * local81 >> 16;
		@Pc(104) int local104 = local41 * local81 + local37 * local49 >> 16;
		if (local104 >= 50) {
			Static62.anInt1509 = arg2 + (local94 << 9) / local104;
			Static152.anInt3095 = arg3 + (local83 << 9) / local104;
		} else {
			Static62.anInt1509 = -1;
			Static152.anInt3095 = -1;
		}
	}
}
