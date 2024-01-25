import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
	public static int anInt4872;

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "[I")
	public static final int[] anIntArray269 = new int[14];

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_62 = new Class208(13, -1);

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "[Lclient!ba;")
	public static final Class1_Sub9[] aClass1_Sub9Array1 = new Class1_Sub9[300];

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)Lclient!fc;")
	public static Class93 method3883(@OriginalArg(1) int arg0) {
		@Pc(13) Class93[] local13 = Static538.method6117();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class93 local21 = local13[local15];
			if (arg0 == local21.anInt2627) {
				return local21;
			}
		}
		return null;
	}
}
