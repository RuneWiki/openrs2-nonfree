import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
	public static int anInt3443;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "[I")
	public static int[] anIntArray464;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "Lclient!bi;")
	public static Class26 aClass26_19 = null;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
	public static int anInt3445 = 127;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BI)[B")
	public static byte[] method3170(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static366.method4202(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIIIIZ)V")
	public static void method3172(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(9) int local9 = (arg1 + arg3) / 2;
		@Pc(11) int local11 = arg1;
		@Pc(15) Class187_Sub1 local15 = Static272.aClass187_Sub1Array2[local9];
		Static272.aClass187_Sub1Array2[local9] = Static272.aClass187_Sub1Array2[arg3];
		Static272.aClass187_Sub1Array2[arg3] = local15;
		for (@Pc(27) int local27 = arg1; local27 < arg3; local27++) {
			if (method3174(local15, Static272.aClass187_Sub1Array2[local27], arg4, arg0, arg5, arg2) <= 0) {
				@Pc(43) Class187_Sub1 local43 = Static272.aClass187_Sub1Array2[local27];
				Static272.aClass187_Sub1Array2[local27] = Static272.aClass187_Sub1Array2[local11];
				Static272.aClass187_Sub1Array2[local11++] = local43;
			}
		}
		Static272.aClass187_Sub1Array2[arg3] = Static272.aClass187_Sub1Array2[local11];
		Static272.aClass187_Sub1Array2[local11] = local15;
		method3172(arg0, arg1, arg2, local11 - 1, arg4, arg5);
		method3172(arg0, local11 + 1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!u;Lclient!u;IZZZI)I")
	private static int method3174(@OriginalArg(0) Class187_Sub1 arg0, @OriginalArg(1) Class187_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static273.method4550(arg4, arg1, arg2, arg0);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(46) int local46 = Static273.method4550(arg3, arg1, arg5, arg0);
			return arg3 ? -local46 : local46;
		}
	}
}
