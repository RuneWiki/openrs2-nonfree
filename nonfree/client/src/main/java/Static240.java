import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_65 = new Class177(37, -1);

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "[I")
	public static final int[] anIntArray442 = new int[25];

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;IIIZIII)V")
	public static void method3624(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class41_Sub4 local7 = new Class41_Sub4();
		local7.anInt3095 = arg3;
		local7.anInt3094 = arg4;
		local7.anInt3096 = arg2;
		local7.anInt3098 = arg6;
		local7.anInt3097 = Static187.anInt3975 + arg1;
		local7.anInt3099 = arg5;
		local7.aString27 = arg0;
		Static367.aClass117_8.method2961(local7);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II[II[Ljava/lang/Object;)V")
	public static void method3627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(13) int local13 = (arg0 + arg1) / 2;
		@Pc(15) int local15 = arg0;
		@Pc(19) int local19 = arg2[local13];
		arg2[local13] = arg2[arg1];
		arg2[arg1] = local19;
		@Pc(33) Object local33 = arg3[local13];
		arg3[local13] = arg3[arg1];
		arg3[arg1] = local33;
		@Pc(52) int local52 = ~local19 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg0; local54 < arg1; local54++) {
			if (local19 + (local52 & local54) > arg2[local54]) {
				@Pc(68) int local68 = arg2[local54];
				arg2[local54] = arg2[local15];
				arg2[local15] = local68;
				@Pc(82) Object local82 = arg3[local54];
				arg3[local54] = arg3[local15];
				arg3[local15++] = local82;
			}
		}
		arg2[arg1] = arg2[local15];
		arg2[local15] = local19;
		arg3[arg1] = arg3[local15];
		arg3[local15] = local33;
		method3627(arg0, local15 - 1, arg2, arg3);
		method3627(local15 + 1, arg1, arg2, arg3);
	}
}
