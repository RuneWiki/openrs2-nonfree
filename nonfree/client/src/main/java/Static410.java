import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!om", name = "f", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "[I")
	public static final int[] anIntArray554 = new int[4];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method6261(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg1, 3);
		local8.method4140();
		local8.aString66 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIII)I")
	public static int method6263(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class5_Sub37 local10 = Static498.method7299(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < local10.anIntArray553.length; local32++) {
				if (local10.anIntArray552[local32] == arg2) {
					local30 += local10.anIntArray553[local32];
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z")
	public static boolean method6264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static402.method8007(arg0, arg1) | (arg1 & 0x70000) != 0 || Static89.method1391(arg1, arg0);
	}
}
