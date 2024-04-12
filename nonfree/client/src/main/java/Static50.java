import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!kd", name = "Pb", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V", line = 54)
	public static void method940() {
		Class2_Sub2_Sub12_Sub2.aClass47_13 = null;
		Class2_Sub2_Sub12_Sub2.aClass40_407 = null;
		Class2_Sub2_Sub12_Sub2.aClass40_408 = null;
		Class2_Sub2_Sub12_Sub2.anIntArray298 = null;
		anIntArray299 = null;
		Class2_Sub2_Sub12_Sub2.aClass40_410 = null;
		Class2_Sub2_Sub12_Sub2.aClass40_409 = null;
		Class2_Sub2_Sub12_Sub2.aClass40_405 = null;
		Class2_Sub2_Sub12_Sub2.aClass40_406 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ud;Lclient!o;Lclient!o;Z)Lclient!fc;", line = 72)
	public static Class2_Sub2_Sub2_Sub2 method941(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class40 arg2) {
		@Pc(13) int local13 = arg0.method80(arg2);
		@Pc(19) int local19 = arg0.method72(arg1, local13);
		return Static12.method260(local13, arg0, local19);
	}
}
