import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "[I")
	public static int[] anIntArray507;

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
	public static int anInt7451 = -2;

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
	public static int anInt7452 = 0;

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "Z")
	public static boolean aBoolean502 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII)I")
	public static int method5987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZIZLclient!ur;)V")
	public static void method5988(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class5_Sub44 arg2) {
		@Pc(8) int local8 = arg2.anInt6981;
		@Pc(12) int local12 = (int) arg2.aLong234;
		arg2.method6003();
		if (arg0) {
			Static326.method4003(local8);
		}
		Static162.method2297(local8);
		@Pc(34) Class76 local34 = Static213.method2817(local12);
		if (local34 != null) {
			Static53.method833(local34);
		}
		Static167.method2333();
		if (!arg1 && Static199.anInt3319 != -1) {
			Static391.method5105(Static199.anInt3319, 1);
		}
		@Pc(56) Class119 local56 = new Class119(Static151.aClass252_42);
		for (@Pc(61) Class5_Sub44 local61 = (Class5_Sub44) local56.method2497(); local61 != null; local61 = (Class5_Sub44) local56.method2496()) {
			if (!local61.method6005()) {
				local61 = (Class5_Sub44) local56.method2497();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt6979 == 3) {
				@Pc(83) int local83 = (int) local61.aLong234;
				if (local83 >>> 16 == local8) {
					method5988(true, arg1, local61);
				}
			}
		}
	}
}
