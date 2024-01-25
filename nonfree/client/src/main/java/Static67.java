import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public static int anInt1223;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Z")
	public static boolean aBoolean107;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	public static final int anInt1218 = 1337;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)Lclient!md;")
	public static Class89 method996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(41) long local41 = (long) arg3 * 32147369L ^ (long) arg0 * 67481L ^ (long) arg5 * 97549L ^ (long) arg1 * 475427L ^ (long) arg2 * 986053L ^ (long) arg4 * 76724863L;
		@Pc(47) Class89 local47 = (Class89) Static14.aClass151_10.method3288(local41);
		if (local47 == null) {
			local47 = Static328.aClass121_9.method4623(arg0, arg5, arg1, arg2, arg3, arg4);
			Static14.aClass151_10.method3291(local41, local47);
			return local47;
		} else {
			return local47;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIC)I")
	public static int method997(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
