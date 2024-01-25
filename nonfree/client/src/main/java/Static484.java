import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!qja", name = "n", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IIIII)V")
	public static void method7006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static642.anInt10429 <= arg1 && arg1 <= Static456.anInt7806) {
			@Pc(28) int local28 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg2);
			@Pc(36) int local36 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg3);
			Static227.method3224(local36, arg1, arg0, local28);
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ILclient!sb;)Z")
	public static boolean method7007(@OriginalArg(1) Class315 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean673) {
			return false;
		} else if (!arg0.method7598(Static629.anInterface7_2)) {
			return false;
		} else if (Static80.aClass291_4.method6993((long) arg0.anInt8868, 1) == null) {
			return Static103.aClass291_7.method6993((long) arg0.anInt8900, 1) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(B)V")
	public static void method7008() {
		if (Static420.aBoolean562) {
			return;
		}
		Static220.method3147(Static253.aClass174ArrayArrayArray1);
		if (Static422.aClass174ArrayArrayArray3 != null) {
			Static220.method3147(Static422.aClass174ArrayArrayArray3);
		}
		Static420.aBoolean562 = true;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IBII)I")
	public static int method7009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg1 & arg2 - 1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(28) int local28 = Static607.method8684(local7, local17);
		@Pc(41) int local41 = Static607.method8684(local7 + 1, local17);
		@Pc(48) int local48 = Static607.method8684(local7, local17 + 1);
		@Pc(57) int local57 = Static607.method8684(local7 + 1, local17 + 1);
		@Pc(64) int local64 = Static88.method6672(arg2, local13, local28, local41);
		@Pc(71) int local71 = Static88.method6672(arg2, local13, local48, local57);
		return Static88.method6672(arg2, local23, local64, local71);
	}
}
