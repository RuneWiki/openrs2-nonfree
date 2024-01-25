import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
	public static int anInt3662;

	@OriginalMember(owner = "client!kg", name = "A", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "[I")
	public static final int[] anIntArray336 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!kg", name = "D", descriptor = "[I")
	public static final int[] anIntArray337 = new int[32];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3020(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static352.method4954(Static71.method1107(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z")
	public static boolean method3021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBI)Z")
	public static boolean method3024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!i;III[Z)V")
	public static void method3025(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static241.aClass22Array3 == Static46.aClass22Array1) {
			return;
		}
		@Pc(9) int local9 = Static114.aClass22Array2[arg1].ca(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class22 local22 = Static114.aClass22Array2[local11];
				if (local22 != null) {
					local22.ba(arg0, arg2, local9 - local22.ca(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
