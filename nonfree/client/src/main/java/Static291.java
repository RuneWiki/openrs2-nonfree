import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!is", name = "h", descriptor = "I")
	public static int anInt4448;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "Lclient!mk;")
	public static Class251 aClass251_1;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "Lclient!qw;")
	public static final Class319 aClass319_4 = new Class319();

	@OriginalMember(owner = "client!is", name = "g", descriptor = "Lclient!gh;")
	public static Class138 aClass138_2 = null;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIBI)V")
	public static void method4047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static82.anInt1902 && arg1 <= Static77.anInt1737) {
			@Pc(17) int local17 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg3);
			@Pc(23) int local23 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg2);
			Static246.method3493(local17, local23, arg1, arg0);
		}
	}
}
