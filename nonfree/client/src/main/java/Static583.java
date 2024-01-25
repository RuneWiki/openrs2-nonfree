import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Lclient!nw;")
	public static final Class236 aClass236_5 = new Class236();

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
	public static int anInt9519 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method7909(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(25) byte[] local25 = (byte[]) arg1;
			return arg0 ? Static285.method5288(local25) : local25;
		} else if (arg1 instanceof Class195) {
			@Pc(39) Class195 local39 = (Class195) arg1;
			return local39.method5286();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIZ)Lclient!jt;")
	public static Class37 method7914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 76724863L ^ (long) arg1 * 986053L ^ (long) arg0 * 67481L ^ (long) arg5 * 97549L ^ (long) arg4 * 475427L ^ (long) arg2 * 32147369L;
		@Pc(39) Class37 local39 = (Class37) Static590.aClass313_62.method6989(local33);
		if (local39 == null) {
			local39 = Static312.aClass100_7.method6214(arg0, arg5, arg4, arg1, arg2, arg3);
			Static590.aClass313_62.method6980(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}
}
