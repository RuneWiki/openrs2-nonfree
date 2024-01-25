import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "[I")
	public static int[] anIntArray541;

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray49;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
	public static int anInt6558 = 0;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
	public static int anInt6561 = 0;

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
	public static int anInt6563 = 0;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIII)I")
	public static int method5576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(21) int local21 = arg1 & arg2 - 1;
		@Pc(25) int local25 = arg0 / arg2;
		@Pc(31) int local31 = arg2 - 1 & arg0;
		@Pc(36) int local36 = Static246.method4316(local25, local7);
		@Pc(43) int local43 = Static246.method4316(local25, local7 + 1);
		@Pc(50) int local50 = Static246.method4316(local25 + 1, local7);
		@Pc(59) int local59 = Static246.method4316(local25 + 1, local7 + 1);
		@Pc(66) int local66 = Static291.method4841(local21, arg2, local43, local36);
		@Pc(73) int local73 = Static291.method4841(local21, arg2, local59, local50);
		return Static291.method4841(local31, arg2, local73, local66);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)V")
	public static void method5578() {
		@Pc(9) Class26 local9 = Static262.aClass26_49;
		synchronized (Static262.aClass26_49) {
			Static262.aClass26_49.method329(5);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)I")
	public static int method5579(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
