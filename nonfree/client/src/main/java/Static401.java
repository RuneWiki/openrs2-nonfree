import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
	public static int anInt7021;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	public static int anInt7022;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Lclient!uc;")
	public static final Class328 aClass328_21 = new Class328(7, 5);

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_110 = new Class47(57, 4);

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_111 = new Class47(82, 18);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Lclient!uo;")
	public static Class4_Sub2 method5859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub2_3;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZ)Lclient!fc;")
	public static Class6_Sub2_Sub7 method5861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class6_Sub2_Sub7 local15 = (Class6_Sub2_Sub7) Static562.aClass128_42.method3263((long) arg0 | (long) arg1 << 32);
		if (local15 == null) {
			local15 = new Class6_Sub2_Sub7(arg1, arg0);
			Static562.aClass128_42.method3267(local15, local15.aLong263);
		}
		return local15;
	}
}
