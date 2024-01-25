import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!qu;")
	public static Class295 aClass295_2;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!o;")
	public static final Class246 aClass246_24 = new Class246(12, 0, 1, 0);

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
	public static final int[] anIntArray327 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!vb;")
	public static final Class364 aClass364_1 = new Class364();

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_213 = new Class179(111, 6);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIB)V")
	public static void method4612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static55.anInt4238 <= arg2 && arg2 <= Static292.anInt4921) {
			@Pc(26) int local26 = Static154.method2176(arg3, Static153.anInt2554, Static502.anInt8456);
			@Pc(34) int local34 = Static154.method2176(arg0, Static153.anInt2554, Static502.anInt8456);
			Static206.method3064(local26, arg2, local34, arg1);
		}
	}
}
