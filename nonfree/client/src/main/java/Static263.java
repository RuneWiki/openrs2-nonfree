import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!l", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "[I")
	public static final int[] anIntArray439 = new int[1];

	@OriginalMember(owner = "client!l", name = "b", descriptor = "[I")
	public static final int[] anIntArray440 = new int[1000];

	@OriginalMember(owner = "client!l", name = "c", descriptor = "S")
	public static short aShort96 = 32767;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!ra;ZLjava/lang/String;)V")
	public static void method4275(@OriginalArg(1) Class47 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(25) int local25 = Static124.aClass52_6.method1584(null, arg2, 250);
		@Pc(34) int local34 = Static124.aClass52_6.method1587(arg2, null, 250) * 13;
		Static103.aClass39_3.f(6, 6, local25 + 4 + 4, local34 + 8, -16777216, 0);
		Static103.aClass39_3.method6060(6, 6, local25 + 4 + 4, local34 + 4 + 4, -1, 0);
		arg0.method7612(local34, 10, null, 0, local25, arg2, 10, null, -1, null, -1, 1, 0);
		Static330.method3994(local34 + 4 + 4, 6, local25 + 4 + 4, 6);
		if (arg1) {
			try {
				Static103.aClass39_3.method6034();
			} catch (@Pc(124) Exception_Sub1 local124) {
			}
		}
	}
}
