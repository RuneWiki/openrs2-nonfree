import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Lclient!bg;")
	public static Class24 aClass24_10;

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
	public static int anInt6767;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
	public static int anInt6758 = 100;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray63 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
	public static int anInt6774 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIZI)Lclient!aj;")
	public static Class10 method5861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg0 * 76724863L ^ (long) arg2 * 475427L ^ (long) arg5 * 67481L ^ (long) arg1 * 97549L ^ (long) arg4 * 986053L ^ (long) arg3 * 32147369L;
		@Pc(39) Class10 local39 = (Class10) Static140.aClass41_36.method823(local33);
		if (local39 == null) {
			local39 = Static92.aClass48_5.method2447(arg5, arg1, arg2, arg4, arg3, arg0);
			Static140.aClass41_36.method832(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Lclient!rm;")
	public static Class1_Sub3 method5862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub3_2;
	}
}
