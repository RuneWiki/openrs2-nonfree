import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "Lclient!nb;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ca", name = "eb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ca", name = "ib", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_146 = Static151.method2243("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "Lclient!mb;")
	public static Class62 aClass62_144 = aClass62_146;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_145 = Static151.method2243("::noclip");

	@OriginalMember(owner = "client!ca", name = "ob", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_147 = Static151.method2243("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!gg;ZZ)V")
	public static void method371(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) int local7 = (int) arg0.aLong148;
		@Pc(10) int local10 = arg0.anInt1410;
		arg0.method3183();
		if (arg1) {
			Static35.method606(local10);
		}
		Static193.method2762(local10);
		@Pc(25) Class47 local25 = Static143.method2159(local7);
		if (local25 != null) {
			Static165.method2410(local25);
		}
		Static180.aBoolean167 = false;
		Static51.anInt1111 = 0;
		Static135.method2042(Static145.anInt3129, Static21.anInt505, Static46.anInt1034, Static157.anInt3335);
		if (Static40.anInt969 != -1) {
			Static204.method2973(Static40.anInt969, 1);
		}
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(II)I")
	public static int method375(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILclient!ii;IIII)V")
	public static void method388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class47 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static13.aBoolean17) {
			Static209.anInt4378 = 32;
		} else {
			Static209.anInt4378 = 0;
		}
		Static13.aBoolean17 = false;
		@Pc(125) int local125;
		if (Static55.anInt1137 != 0) {
			if (arg6 <= arg1 && arg6 + 16 > arg1 && arg3 >= arg0 && arg3 < arg0 + 16) {
				arg2.anInt1836 -= 4;
				Static165.method2410(arg2);
			} else if (arg6 <= arg1 && arg1 < arg6 + 16 && arg4 + arg0 - 16 <= arg3 && arg3 < arg4 + arg0) {
				arg2.anInt1836 += 4;
				Static165.method2410(arg2);
			} else if (arg6 - Static209.anInt4378 <= arg1 && arg6 + Static209.anInt4378 + 16 > arg1 && arg3 >= arg0 + 16 && arg4 + arg0 - 16 > arg3) {
				local125 = arg4 * (arg4 - 32) / arg5;
				if (local125 < 8) {
					local125 = 8;
				}
				@Pc(144) int local144 = arg3 - local125 / 2 - arg0 - 16;
				@Pc(150) int local150 = arg4 - local125 - 32;
				arg2.anInt1836 = (arg5 - arg4) * local144 / local150;
				Static165.method2410(arg2);
				Static13.aBoolean17 = true;
			}
		}
		if (Static87.anInt1822 == 0) {
			return;
		}
		local125 = arg2.anInt1910;
		if (arg1 >= arg6 - local125 && arg3 >= arg0 && arg6 + 16 > arg1 && arg0 + arg4 >= arg3) {
			arg2.anInt1836 += Static87.anInt1822 * 45;
			Static165.method2410(arg2);
			return;
		}
	}
}
