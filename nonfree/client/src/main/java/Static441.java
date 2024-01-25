import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "[I")
	public static int[] anIntArray522;

	@OriginalMember(owner = "client!wa", name = "Y", descriptor = "Lclient!an;")
	public static Class11 aClass11_43 = new Class11(64);

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)V")
	public static void method5812(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg0, 8);
		local8.method3244();
	}
}
