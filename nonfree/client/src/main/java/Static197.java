import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "[Lclient!mo;")
	public static Class103[] aClass103Array3;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "Lclient!th;")
	public static Class169 aClass169_109 = new Class169(64);

	@OriginalMember(owner = "client!og", name = "b", descriptor = "[I")
	public static int[] anIntArray324 = new int[3];

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public static int anInt3990 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method3204(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static46.method815(Static267.method3977(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!uo;Lclient!uo;IIZZ)I")
	public static int method3206(@OriginalArg(0) int arg0, @OriginalArg(1) Class182_Sub1 arg1, @OriginalArg(2) Class182_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static95.method4070(arg0, arg1, arg4, arg2);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(44) int local44 = Static95.method4070(arg3, arg1, arg5, arg2);
			return arg5 ? -local44 : local44;
		}
	}
}
