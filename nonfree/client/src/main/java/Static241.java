import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "Z")
	public static boolean aBoolean323;

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "[I")
	public static int[] anIntArray221 = new int[1];

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!nfa;ZLclient!nfa;IZI)I")
	public static int method4008(@OriginalArg(0) int arg0, @OriginalArg(1) Class33_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class33_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(15) int local15 = Static103.method1644(arg3, arg2, arg0, arg1);
		if (local15 != 0) {
			return arg2 ? -local15 : local15;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(39) int local39 = Static103.method1644(arg3, arg5, arg4, arg1);
			return arg5 ? -local39 : local39;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BII)Z")
	public static boolean method4009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class181 local8 = Static61.aClass246_7.method5497(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method4276(arg0);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method4011(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1 || arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(41) int local41 = 2;
		@Pc(45) int local45 = arg0 / 10;
		while (local45 != 0) {
			local45 /= 10;
			local41++;
		}
		@Pc(60) char[] local60 = new char[local41];
		local60[0] = '+';
		for (@Pc(68) int local68 = local41 - 1; local68 > 0; local68--) {
			@Pc(72) int local72 = arg0;
			arg0 /= 10;
			@Pc(83) int local83 = local72 - arg0 * 10;
			if (local83 >= 10) {
				local60[local68] = (char) (local83 + 87);
			} else {
				local60[local68] = (char) (local83 + 48);
			}
		}
		return new String(local60);
	}
}
