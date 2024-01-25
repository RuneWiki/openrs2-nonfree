import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static308 {

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_57 = new Class109(20);

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
	public static int anInt6006 = 0;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "[I")
	public static final int[] anIntArray588 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)Z")
	public static boolean method5392() {
		return Static160.anInt3181 > 0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B[J[Ljava/lang/Object;)V")
	public static void method5393(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static68.method5001(arg0, arg1, 0, arg0.length - 1);
	}
}
