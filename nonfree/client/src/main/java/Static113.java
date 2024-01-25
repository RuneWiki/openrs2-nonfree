import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "Lclient!ts;")
	public static Class6_Sub45 aClass6_Sub45_2;

	@OriginalMember(owner = "client!ega", name = "f", descriptor = "[S")
	public static short[] aShortArray14;

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
	public static int anInt2183 = 0;

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "[I")
	public static int[] anIntArray164 = new int[1];

	@OriginalMember(owner = "client!ega", name = "l", descriptor = "Lclient!hs;")
	public static final Class138 aClass138_2 = new Class138();

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIIII)Lclient!ip;")
	public static Class26 method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg1 * 76724863L ^ (long) arg0 * 986053L ^ (long) arg3 * 97549L ^ (long) arg2 * 67481L ^ (long) arg5 * 475427L ^ (long) arg4 * 32147369L;
		@Pc(39) Class26 local39 = (Class26) Static261.aClass136_57.method3473(local33);
		if (local39 == null) {
			local39 = Static25.aClass14_1.method6883(arg2, arg3, arg5, arg0, arg4, arg1);
			Static261.aClass136_57.method3482(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILclient!jaa;III)Lclient!hq;")
	public static Class51_Sub1_Sub1 method2000(@OriginalArg(1) Class14_Sub3 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		if (arg0.aBoolean311 || Static404.method5927(arg2) && Static404.method5927(arg1)) {
			return new Class51_Sub1_Sub1(arg0, 3553, 6408, arg2, arg1);
		} else if (arg0.aBoolean299) {
			return new Class51_Sub1_Sub1(arg0, 34037, 6408, arg2, arg1);
		} else {
			return new Class51_Sub1_Sub1(arg0, 6408, arg2, arg1, Static253.method4296(arg2), Static253.method4296(arg1));
		}
	}
}
