import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ve", name = "L", descriptor = "Lclient!jd;")
	public static Class84 aClass84_118;

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
	public static int anInt5749 = -1;

	@OriginalMember(owner = "client!ve", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString274 = null;

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
	public static int anInt5757 = 0;

	@OriginalMember(owner = "client!ve", name = "W", descriptor = "J")
	public static long aLong296 = 0L;

	@OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
	public static int anInt5762 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIII)V")
	public static void method4620(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static202.method3411(Static127.anInt2664, arg0, Static290.anInt6021);
		@Pc(19) int local19 = Static202.method3411(Static127.anInt2664, arg3, Static290.anInt6021);
		@Pc(25) int local25 = Static202.method3411(Static68.anInt1509, arg1, Static43.anInt1054);
		@Pc(31) int local31 = Static202.method3411(Static68.anInt1509, arg2, Static43.anInt1054);
		for (@Pc(33) int local33 = local11; local33 <= local19; local33++) {
			Static133.method2321(local31, local25, Static274.anIntArrayArray50[local33], arg4);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)I")
	public static int method4624(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
