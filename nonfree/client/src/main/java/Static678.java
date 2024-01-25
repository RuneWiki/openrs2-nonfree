import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static678 {

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "[I")
	public static int[] anIntArray619;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString132;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "[[Lclient!bha;")
	public static Class28[][] aClass28ArrayArray5;

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
	public static int anInt11088 = 0;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "[Lclient!tq;")
	public static final Class360[] aClass360Array5 = new Class360[4];

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "[J")
	public static final long[] aLongArray26 = new long[100];

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V")
	public static void method9266(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static284.anInt5151 = arg0;
		Static579.aClass19_Sub9Array2 = new Class19_Sub9[Static31.anIntArray431[Static284.anInt5151] + 1];
		Static330.anInt5785 = 0;
		Static343.anInt5896 = 0;
	}
}
