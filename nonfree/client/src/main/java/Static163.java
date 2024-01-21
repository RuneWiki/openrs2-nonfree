import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "[S")
	public static short[] aShortArray118;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "[I")
	public static int[] anIntArray302;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "[I")
	public static final int[] anIntArray299 = new int[] { 0, 0, 24, 0, 0, 0, 1, 8, 6, 0, 6, 0, -2, 0, 0, 5, 0, 0, 0, 0, 0, 7, 3, 0, 10, 6, 0, 2, 0, -1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 2, 0, 0, 0, 0, 0, 0, 0, 4, 0, 2, 0, 0, 0, 8, 0, 0, 4, 0, 0, 5, 0, 0, 8, 0, -1, 2, 0, 15, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 3, 0, 0, -1, 0, 0, 0, 0, -2, 1, 0, 0, 6, 4, 0, 0, -2, 0, 5, 0, 0, -1, 1, 0, 0, 4, 0, 0, 0, 0, 0, 9, 0, 0, 0, -2, 5, 3, 6, -2, 5, 0, 0, 6, 0, 0, 0, 10, 0, -1, 0, 7, 0, 0, -1, 0, 0, -1, 3, 0, 0, 0, 0, 0, 0, -1, -2, 0, 0, 4, 0, 0, 0, -1, -2, -2, -2, 0, 5, 0, -1, -1, 14, 0, 0, 2, -2, 0, 0, 6, 0, 7, 12, 0, 0, -2, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 6, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 3, 0, 0, 0, 0, -1, 0, 0 };

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1225 = Static151.method2243("Select");

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1224 = aClass62_1225;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "Lclient!bg;")
	public static final Class13 aClass13_11 = new Class13();

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	public static int anInt3446 = 0;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1226 = Static151.method2243(")3runescape)3com");

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method2392() {
		Static81.aClass53_26.method1649();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIILclient!mf;Lclient!mf;IIJ)V")
	public static void method2393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(5) Class7 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class85 local8 = new Class85();
		local8.aLong114 = arg8;
		local8.anInt3573 = arg1 * 128 + 64;
		local8.anInt3576 = arg2 * 128 + 64;
		local8.anInt3575 = arg3;
		local8.aClass7_8 = arg4;
		local8.aClass7_9 = arg5;
		local8.anInt3574 = arg6;
		local8.anInt3571 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static92.aClass2_Sub18ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static92.aClass2_Sub18ArrayArrayArray1[local42][arg1][arg2] = new Class2_Sub18(local42, arg1, arg2);
			}
		}
		Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2].aClass85_1 = local8;
	}
}
