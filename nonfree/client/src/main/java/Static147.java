import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "Lclient!ii;")
	public static Class161 aClass161_4;

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
	public static int anInt3290;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "[[B")
	public static final byte[][] aByteArrayArray13 = new byte[250][];

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
	public static int anInt3279 = -1;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
	public static int anInt3283 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BIIIIII)V")
	public static void method3025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= Static68.anInt1306 && Static589.anInt9684 >= arg0 && Static252.anInt4971 <= arg5 && Static359.anInt6232 >= arg4) {
			if (arg1 == 1) {
				Static112.method2337(arg4, arg3, arg0, arg2, arg5);
			} else {
				Static528.method7384(arg2, arg1, arg3, arg4, arg0, arg5);
			}
		} else if (arg1 == 1) {
			Static380.method5661(arg3, arg2, arg4, arg0, arg5);
		} else {
			Static565.method7770(arg4, arg3, arg5, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(FB)F")
	public static float method3028(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([Ljava/lang/Object;I[JZI)V")
	public static void method3032(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg3) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) long local16 = arg2[local10];
		arg2[local10] = arg2[arg3];
		arg2[arg3] = local16;
		@Pc(30) Object local30 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local30;
		@Pc(50) int local50 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg1; local52 < arg3; local52++) {
			if ((long) (local52 & local50) + local16 > arg2[local52]) {
				@Pc(73) long local73 = arg2[local52];
				arg2[local52] = arg2[local12];
				arg2[local12] = local73;
				@Pc(87) Object local87 = arg0[local52];
				arg0[local52] = arg0[local12];
				arg0[local12++] = local87;
			}
		}
		arg2[arg3] = arg2[local12];
		arg2[local12] = local16;
		arg0[arg3] = arg0[local12];
		arg0[local12] = local30;
		method3032(arg0, arg1, arg2, local12 - 1);
		method3032(arg0, local12 + 1, arg2, arg3);
	}
}
