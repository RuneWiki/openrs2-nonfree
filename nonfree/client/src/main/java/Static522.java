import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "[I")
	public static final int[] anIntArray509 = new int[13];

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
	public static int anInt8830 = -1;

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
	public static int anInt8831 = 0;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "Z")
	public static boolean aBoolean666 = false;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "(I)V")
	public static void method7559() {
		@Pc(11) Class5_Sub5_Sub6 local11 = Static478.method6972((long) 0, 15);
		local11.method2686();
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)V")
	public static void method7562() {
		Static171.aClass391_16.method9286();
		Static536.aClass391_51.method9286();
		Static606.aClass391_58.method9286();
		Static276.aClass391_24.method9286();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIII)I")
	public static int method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(16) int local16 = arg0;
			arg0 = arg1;
			arg1 = local16;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return arg5;
		} else if (local3 == 2) {
			return 7 + 1 - arg3 - arg0;
		} else {
			return 1 + 7 - arg1 - arg5;
		}
	}
}
