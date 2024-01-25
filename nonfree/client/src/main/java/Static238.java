import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!hha", name = "x", descriptor = "S")
	public static short aShort55;

	@OriginalMember(owner = "client!hha", name = "C", descriptor = "Lclient!cga;")
	public static final Class60 aClass60_79 = new Class60();

	@OriginalMember(owner = "client!hha", name = "z", descriptor = "I")
	public static int anInt3744 = -1;

	@OriginalMember(owner = "client!hha", name = "B", descriptor = "I")
	public static int anInt3745 = 0;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method3364(@OriginalArg(1) String arg0) {
		if (Class2_Sub10_Sub2.aString15.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class2_Sub10_Sub2.aString15.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class2_Sub10_Sub2.aString15.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "([II[III)V")
	public static void method3366(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(26) int local26 = (arg2 + arg3) / 2;
		@Pc(28) int local28 = arg2;
		@Pc(32) int local32 = arg0[local26];
		arg0[local26] = arg0[arg3];
		arg0[arg3] = local32;
		@Pc(46) int local46 = arg1[local26];
		arg1[local26] = arg1[arg3];
		arg1[arg3] = local46;
		@Pc(64) int local64 = local32 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(66) int local66 = arg2; local66 < arg3; local66++) {
			if (arg0[local66] < local32 + (local64 & local66)) {
				@Pc(87) int local87 = arg0[local66];
				arg0[local66] = arg0[local28];
				arg0[local28] = local87;
				@Pc(101) int local101 = arg1[local66];
				arg1[local66] = arg1[local28];
				arg1[local28++] = local101;
			}
		}
		arg0[arg3] = arg0[local28];
		arg0[local28] = local32;
		arg1[arg3] = arg1[local28];
		arg1[local28] = local46;
		method3366(arg0, arg1, arg2, local28 - 1);
		method3366(arg0, arg1, local28 + 1, arg3);
	}
}
