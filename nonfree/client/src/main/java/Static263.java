import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)V")
	public static void method4282() {
		@Pc(1) Class168 local1 = Static62.aClass168_11;
		synchronized (Static62.aClass168_11) {
			Static62.aClass168_11.method3862();
		}
		local1 = Static101.aClass168_18;
		synchronized (Static101.aClass168_18) {
			Static101.aClass168_18.method3862();
		}
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)V")
	public static void method4283() {
		Static405.anInt10904 = -1;
		Static319.anInt5446 = -1;
		Static215.anInt3739 = 0;
		Static19.anInt250 = -1;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIIIII)Lclient!lia;")
	public static Class185 method4284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 76724863L ^ (long) arg2 * 475427L ^ (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg3 * 986053L ^ (long) arg5 * 32147369L;
		@Pc(39) Class185 local39 = (Class185) Static487.aClass168_76.method3860(local33);
		if (local39 == null) {
			local39 = Static437.aClass100_10.method8658(arg0, arg1, arg2, arg3, arg5, arg4);
			Static487.aClass168_76.method3853(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}
}
