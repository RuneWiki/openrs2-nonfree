import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
	public static int anInt4717;

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "[I")
	public static final int[] anIntArray409 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIB)V")
	public static void method3923(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static2.aByteArrayArrayArray1 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)I")
	public static int method3924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static35.method5797(arg1 + 45365, 4, arg0 + 91923) + (Static35.method5797(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static35.method5797(arg1, 1, arg0) - 128 >> 2) - 128;
		local42 = (int) ((double) local42 * 0.3D) + 35;
		if (local42 < 10) {
			local42 = 10;
		} else if (local42 > 60) {
			local42 = 60;
		}
		return local42;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII)Lclient!pc;")
	public static Class16 method3925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 475427L ^ (long) arg4 * 67481L ^ (long) arg2 * 97549L ^ (long) arg0 * 986053L ^ (long) arg3 * 32147369L ^ (long) arg1 * 76724863L;
		@Pc(44) Class16 local44 = (Class16) Static339.aClass134_46.method3266(local33);
		if (local44 == null) {
			local44 = Static201.aClass39_6.method4518(arg4, arg2, arg5, arg0, arg3, arg1);
			Static339.aClass134_46.method3263(local33, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIILclient!kd;)Lclient!oi;")
	public static Class3_Sub2_Sub1 method3926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class39_Sub2 arg4) {
		if (arg4.aBoolean237 || Static400.method5337(arg3) && Static400.method5337(arg0)) {
			return new Class3_Sub2_Sub1(arg4, 3553, arg2, arg1, arg3, arg0, true);
		} else if (arg4.aBoolean229) {
			return new Class3_Sub2_Sub1(arg4, 34037, arg2, arg1, arg3, arg0, true);
		} else {
			return new Class3_Sub2_Sub1(arg4, arg2, arg1, arg3, arg0, Static406.method5434(arg3), Static406.method5434(arg0), true);
		}
	}
}
