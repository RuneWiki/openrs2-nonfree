import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "F")
	public static float aFloat89 = 1.0F;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
	public static final int[] anIntArray338 = new int[4096];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
	public static void method4441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static82.anInt1486 = arg1 - Static211.anInt278;
		Static280.anInt4669 = arg0 - Static211.anInt276;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZIIIIII)Lclient!lo;")
	public static Class139 method4443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 475427L ^ (long) arg3 * 67481L ^ (long) arg1 * 97549L ^ (long) arg5 * 986053L ^ (long) arg0 * 32147369L ^ (long) arg4 * 76724863L;
		@Pc(39) Class139 local39 = (Class139) Static198.aClass268_28.method6166(local33);
		if (local39 == null) {
			local39 = Static132.aClass167_4.method5980(arg3, arg1, arg2, arg5, arg0, arg4);
			Static198.aClass268_28.method6164(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}
}
