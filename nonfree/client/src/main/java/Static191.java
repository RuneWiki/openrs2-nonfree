import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static191 {

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	public static int anInt4131;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject11;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
	public static final int[] anIntArray175 = new int[2];

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	public static int anInt4134 = 100;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "[I")
	public static final int[] anIntArray176 = new int[256];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(JJ)J")
	public static long method3354(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public static void method3355(@OriginalArg(0) int arg0) {
		Static426.anInt7532 = arg0;
		Static148.aClass342_58.method7693();
	}
}
