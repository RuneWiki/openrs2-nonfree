import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!dc;")
	public static Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!pe;")
	private static Class65 aClass65_649 = Static119.method1462("Invalid username or password)3");

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_648 = aClass65_649;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "I")
	public static int anInt1501 = 0;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!pe;")
	public static Class65 aClass65_650 = Static119.method1462("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!la", name = "x", descriptor = "[I")
	public static int[] anIntArray178 = new int[200];

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Lclient!pe;")
	private static Class65 aClass65_651 = Static119.method1462("Your profile will be transferred in:");

	@OriginalMember(owner = "client!la", name = "A", descriptor = "Lclient!pe;")
	public static Class65 aClass65_652 = aClass65_651;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method1101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub18 local7 = null;
		for (@Pc(12) Class2_Sub18 local12 = (Class2_Sub18) Static23.aClass13_12.method270(); local12 != null; local12 = (Class2_Sub18) Static23.aClass13_12.method273()) {
			if (arg7 == local12.anInt2496 && local12.anInt2499 == arg2 && arg6 == local12.anInt2501 && local12.anInt2503 == arg3) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub18();
			local7.anInt2503 = arg3;
			local7.anInt2501 = arg6;
			local7.anInt2496 = arg7;
			local7.anInt2499 = arg2;
			Static52.method880(local7);
			Static23.aClass13_12.method263(local7);
		}
		local7.anInt2500 = arg5;
		local7.anInt2488 = arg8;
		local7.anInt2495 = arg4;
		local7.anInt2487 = arg1;
		local7.anInt2498 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)Z")
	public static boolean method1103(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1107() {
		aClass65_650 = null;
		anIntArray178 = null;
		aClass17_1 = null;
		aClass65_652 = null;
		aClass65_648 = null;
		aClass65_651 = null;
		aClass65_649 = null;
	}
}
