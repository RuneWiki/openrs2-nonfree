import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!ll", name = "Z", descriptor = "[[Lclient!us;")
	public static Class363[][] aClass363ArrayArray1;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "Lclient!in;")
	public static final Class169 aClass169_165 = new Class169(115, -2);

	@OriginalMember(owner = "client!ll", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ll", name = "Y", descriptor = "[I")
	public static final int[] anIntArray321 = new int[13];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIZ)V")
	public static void method6004(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static654.method9605();
		Static258.aLong131 = 0L;
		@Pc(19) int local19 = Static255.method4444();
		if (arg1 == 3 || local19 == 3) {
			arg3 = true;
		}
		if (!Static607.aClass101_15.method8117()) {
			arg3 = true;
		}
		Static392.method6348(arg0, arg1, local19, arg2, arg3);
	}
}
