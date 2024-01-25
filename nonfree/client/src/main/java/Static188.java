import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "[S")
	public static short[] aShortArray61;

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
	public static int anInt3275;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
	public static int anInt3276;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Lclient!jv;")
	public static final Class165 aClass165_7 = new Class165(3, 1);

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "Lclient!td;")
	public static final Class301 aClass301_6 = new Class301();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII)Lclient!aq;")
	public static Class17 method2785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg1 * 76724863L ^ (long) arg2 * 475427L ^ (long) arg0 * 67481L ^ (long) arg3 * 97549L ^ (long) arg4 * 986053L ^ (long) arg5 * 32147369L;
		@Pc(39) Class17 local39 = (Class17) Static529.aClass332_192.method7502(local33);
		if (local39 == null) {
			local39 = Static246.aClass121_7.method7113(arg0, arg3, arg2, arg4, arg5, arg1);
			Static529.aClass332_192.method7498(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}
}
