import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_174 = new Class215(60, 0);

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "[I")
	public static final int[] anIntArray535 = new int[200];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ma;I)Lclient!ma;")
	public static Class2_Sub8_Sub3 method6890(@OriginalArg(0) Class2_Sub8_Sub3 arg0) {
		@Pc(14) Class2_Sub8_Sub3 local14 = arg0 == null ? new Class2_Sub8_Sub3() : new Class2_Sub8_Sub3(arg0);
		local14.method5783();
		return local14;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)I")
	public static int method6891() {
		return Static428.anInt5962;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	public static void method6892() {
		Static127.aClass169_21.method5006();
		Static140.aClass169_24.method5006();
		Static90.aClass169_13.method5006();
		Static297.aClass169_34.method5006();
	}
}
