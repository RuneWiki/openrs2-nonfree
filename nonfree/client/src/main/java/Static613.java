import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "Lclient!iea;")
	public static Class170 aClass170_2;

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "Z")
	public static boolean aBoolean757 = false;

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_117 = new Class387(15, -1);

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
	public static int anInt10137 = 0;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([JIB[II)V")
	public static void method8707(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(26) int local26 = (arg1 + arg3) / 2;
		@Pc(28) int local28 = arg3;
		@Pc(32) long local32 = arg0[local26];
		arg0[local26] = arg0[arg1];
		arg0[arg1] = local32;
		@Pc(46) int local46 = arg2[local26];
		arg2[local26] = arg2[arg1];
		arg2[arg1] = local46;
		@Pc(65) int local65 = local32 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(67) int local67 = arg3; local67 < arg1; local67++) {
			if (arg0[local67] < local32 + (long) (local67 & local65)) {
				@Pc(87) long local87 = arg0[local67];
				arg0[local67] = arg0[local28];
				arg0[local28] = local87;
				@Pc(101) int local101 = arg2[local67];
				arg2[local67] = arg2[local28];
				arg2[local28++] = local101;
			}
		}
		arg0[arg1] = arg0[local28];
		arg0[local28] = local32;
		arg2[arg1] = arg2[local28];
		arg2[local28] = local46;
		method8707(arg0, local28 - 1, arg2, arg3);
		method8707(arg0, arg1, arg2, local28 + 1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;BLclient!ffa;I)Lclient!jt;")
	public static Class191 method8709(@OriginalArg(0) String arg0, @OriginalArg(2) Class57_Sub2 arg1) {
		@Pc(12) int local12 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local12);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static105.anIntArray90, 0);
		if (Static105.anIntArray90[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class191(arg1, 34336, local12);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
