import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!s", name = "v", descriptor = "[Lclient!nb;")
	public static Class2_Sub2_Sub17[] aClass2_Sub2_Sub17Array9;

	@OriginalMember(owner = "client!s", name = "w", descriptor = "I")
	public static int anInt3527;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1010 = Static181.method2795("K");

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1008 = aClass83_1010;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!nc;")
	public static final Class63 aClass63_14 = new Class63(32);

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1009 = aClass83_1010;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "I")
	public static int anInt3526 = 0;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray10 = new int[4][105][105];

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1011 = Static181.method2795("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Z")
	public static boolean method2644(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Z")
	public static boolean method2645(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIB)V")
	public static void method2646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = arg4; local15 <= arg4 + arg3; local15++) {
			for (local19 = arg1; local19 <= arg1 + arg2; local19++) {
				if (local19 >= 0 && local19 < 104 && local15 >= 0 && local15 < 104) {
					Static110.aByteArrayArrayArray46[arg0][local19][local15] = 127;
				}
			}
		}
		@Pc(68) int local68;
		for (local19 = arg4; local19 < arg3 + arg4; local19++) {
			for (local68 = arg1; local68 < arg2 + arg1; local68++) {
				if (local68 >= 0 && local68 < 104 && local19 >= 0 && local19 < 104) {
					anIntArrayArrayArray10[arg0][local68][local19] = arg0 <= 0 ? 0 : anIntArrayArrayArray10[arg0 - 1][local68][local19];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local68 = arg4 + 1; local68 < arg4 + arg3; local68++) {
				if (local68 >= 0 && local68 < 104) {
					anIntArrayArrayArray10[arg0][arg1][local68] = anIntArrayArrayArray10[arg0][arg1 - 1][local68];
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (local68 = arg1 + 1; local68 < arg2 + arg1; local68++) {
				if (local68 >= 0 && local68 < 104) {
					anIntArrayArrayArray10[arg0][local68][arg4] = anIntArrayArrayArray10[arg0][local68][arg4 - 1];
				}
			}
		}
		if (arg1 < 0 || arg4 < 0 || arg1 >= 104 || arg4 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 > 0 && anIntArrayArrayArray10[arg0][arg1 - 1][arg4] != 0) {
				anIntArrayArrayArray10[arg0][arg1][arg4] = anIntArrayArrayArray10[arg0][arg1 - 1][arg4];
				return;
			}
			if (arg4 > 0 && anIntArrayArrayArray10[arg0][arg1][arg4 - 1] != 0) {
				anIntArrayArrayArray10[arg0][arg1][arg4] = anIntArrayArrayArray10[arg0][arg1][arg4 - 1];
				return;
			}
			if (arg1 > 0 && arg4 > 0 && anIntArrayArrayArray10[arg0][arg1 - 1][arg4 - 1] != 0) {
				anIntArrayArrayArray10[arg0][arg1][arg4] = anIntArrayArrayArray10[arg0][arg1 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && anIntArrayArrayArray10[arg0][arg1 - 1][arg4] != anIntArrayArrayArray10[arg0 - 1][arg1 - 1][arg4]) {
			anIntArrayArrayArray10[arg0][arg1][arg4] = anIntArrayArrayArray10[arg0][arg1 - 1][arg4];
			return;
		}
		if (arg4 > 0 && anIntArrayArrayArray10[arg0 - 1][arg1][arg4 - 1] != anIntArrayArrayArray10[arg0][arg1][arg4 - 1]) {
			anIntArrayArrayArray10[arg0][arg1][arg4] = anIntArrayArrayArray10[arg0][arg1][arg4 - 1];
			return;
		}
		if (arg1 > 0 && arg4 > 0 && anIntArrayArrayArray10[arg0][arg1 - 1][arg4 - 1] != anIntArrayArrayArray10[arg0 - 1][arg1 - 1][arg4 - 1]) {
			anIntArrayArrayArray10[arg0][arg1][arg4] = anIntArrayArrayArray10[arg0][arg1 - 1][arg4 - 1];
			return;
		}
	}
}
