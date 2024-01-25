import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "F")
	public static float aFloat106;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_119 = new Class239(18, 7);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
	public static void method4819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class2_Sub13_Sub15 local13 = Static370.method5893(arg2, 9);
		local13.method6968();
		local13.anInt8318 = arg1;
		local13.anInt8320 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIB)Z")
	public static boolean method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static204.method3284(arg0, arg1) || Static326.method5155(arg0, arg1);
	}
}
