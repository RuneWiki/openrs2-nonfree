import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "[Lclient!sf;")
	public static Class41_Sub1[] aClass41_Sub1Array5;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "Z")
	public static boolean aBoolean295;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "S")
	public static short aShort55 = 1;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public static void method3901() {
		Static606.anInt9804 = 0;
		Static675.anInt10637 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static259.anInt4111; local9++) {
			@Pc(14) int local14 = Static449.anInt7857 * local9;
			for (@Pc(16) int local16 = 0; local16 < Static449.anInt7857; local16++) {
				@Pc(21) int local21 = local16 + local14;
				Static368.anInterface2Array1[local21].method8514(local16 * Static586.anInt9622, Static77.anInt1204 * local9, Static586.anInt9622, Static77.anInt1204, true);
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method3902(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (!arg0 || arg1 < 0) {
			return Integer.toString(arg1, 10);
		}
		@Pc(42) int local42 = 2;
		for (@Pc(46) int local46 = arg1 / 10; local46 != 0; local46 /= 10) {
			local42++;
		}
		@Pc(57) char[] local57 = new char[local42];
		local57[0] = '+';
		for (@Pc(65) int local65 = local42 - 1; local65 > 0; local65--) {
			@Pc(68) int local68 = arg1;
			arg1 /= 10;
			@Pc(79) int local79 = local68 - arg1 * 10;
			if (local79 >= 10) {
				local57[local65] = (char) (local79 + 87);
			} else {
				local57[local65] = (char) (local79 + 48);
			}
		}
		return new String(local57);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)Z")
	public static boolean method3903() {
		return Static539.anInt8853 >= 1;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZIIIIIIIIIII)V")
	public static void method3904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static175.method2576(arg5)) {
			return;
		}
		if (Static69.aClass394ArrayArray1[arg5] == null) {
			Static81.method1266(Static227.aClass394ArrayArray2[arg5], -1, arg2, arg3, arg8, arg0, arg6, arg4, arg7, arg9, arg1, arg10);
		} else {
			Static81.method1266(Static69.aClass394ArrayArray1[arg5], -1, arg2, arg3, arg8, arg0, arg6, arg4, arg7, arg9, arg1, arg10);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Z")
	public static boolean method3905(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
