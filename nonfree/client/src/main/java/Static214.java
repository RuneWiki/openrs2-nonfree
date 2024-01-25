import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!io", name = "g", descriptor = "I")
	public static int anInt4061;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "Lclient!nn;")
	public static final Class212 aClass212_9 = new Class212(2, 3);

	@OriginalMember(owner = "client!io", name = "j", descriptor = "I")
	public static int anInt4064 = 0;

	@OriginalMember(owner = "client!io", name = "k", descriptor = "[I")
	public static int[] anIntArray284 = new int[1];

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public static void method3470() {
		Static255.aBoolean356 = false;
		Static35.aClipboard1 = null;
		Static544.method2108();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIBII)Lclient!kk;")
	public static Class92 method3472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 986053L ^ (long) arg3 * 67481L ^ (long) arg0 * 97549L ^ (long) arg1 * 475427L ^ (long) arg2 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(44) Class92 local44 = (Class92) Static56.aClass288_5.method6745(local33);
		if (local44 == null) {
			local44 = Static206.aClass62_24.method7046(arg3, arg0, arg1, arg4, arg2, arg5);
			Static56.aClass288_5.method6746(local44, local33);
			return local44;
		} else {
			return local44;
		}
	}
}
