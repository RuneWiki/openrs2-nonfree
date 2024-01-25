import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Lclient!mca;")
	public static Class188 aClass188_1;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
	public static int anInt7247 = 0;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "Z")
	public static boolean aBoolean553 = false;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	public static void method5822() {
		Static490.aClass207_51.method4397(50);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIBII)V")
	public static void method5823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg2, 8);
		local8.method4833();
		local8.anInt5970 = arg0;
		local8.anInt5968 = arg3;
		local8.anInt5969 = arg1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)Z")
	public static boolean method5824() {
		return Static22.anInt572 > 0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method5828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static136.aClass333Array1[Static165.anInt3162++] = new Class333(4, arg0, arg1, arg4, arg4, arg1, arg5, arg2, arg2, arg5, arg6, arg6, arg3, arg3);
	}
}
