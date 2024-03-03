import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIII)Lclient!rc;", line = 3)
	public static Class42 method5108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 97549L ^ (long) arg4 * 67481L ^ (long) arg0 * 475427L ^ (long) arg5 * 986053L ^ (long) arg1 * 32147369L ^ (long) arg2 * 76724863L;
		@Pc(44) Class42 local44 = (Class42) Class171.aClass98_39.method2614(local33);
		if (local44 == null) {
			local44 = Static61.aClass19_3.method2879(arg4, arg3, arg0, arg5, arg1, arg2);
			Class171.aClass98_39.method2626(local33, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Z", line = 75)
	public static boolean method5112(@OriginalArg(0) int arg0) {
		if (arg0 == 5 || arg0 == 25 || arg0 == 4 || arg0 == 3 || arg0 == 8) {
			return true;
		} else {
			return arg0 == 10 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLclient!mr;)V", line = 103)
	public static void method5114(@OriginalArg(1) Class11_Sub5_Sub2 arg0) {
		@Pc(16) int local16 = arg0.anInt4613 - Class83.anInt2345;
		@Pc(27) int local27 = arg0.anInt4606 * 128 + arg0.method4329() * 64;
		@Pc(39) int local39 = arg0.anInt4580 * 128 + arg0.method4329() * 64;
		arg0.anInt6768 += (local27 - arg0.anInt6768) / local16;
		arg0.anInt6770 += (local39 - arg0.anInt6770) / local16;
		arg0.anInt4632 = 0;
		if (arg0.anInt4605 == 0) {
			arg0.method4326(8192);
		}
		if (arg0.anInt4605 == 1) {
			arg0.method4326(12288);
		}
		if (arg0.anInt4605 == 2) {
			arg0.method4326(0);
		}
		if (arg0.anInt4605 == 3) {
			arg0.method4326(4096);
		}
	}
}
