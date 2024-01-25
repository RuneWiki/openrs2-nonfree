import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static70 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
	public static final int[] anIntArray118 = new int[8];

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "[Lclient!jba;")
	public static final Class175[] aClass175Array1 = new Class175[100];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)Z")
	public static boolean method1361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static535.method7641(arg0, arg1) | Static275.method4000(arg0, arg1) | Static410.method6056(arg0, arg1)) & Static305.method4469(arg1, arg0);
	}
}
