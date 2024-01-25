import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!id", name = "s", descriptor = "Lclient!rg;")
	public static Class310 aClass310_55;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "J")
	public static long aLong131 = -1L;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "[I")
	public static final int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	public static void method4086(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg0, 7);
		local9.method4004();
		local9.anInt4595 = arg1;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(III)Z")
	public static boolean method4089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static376.method7670(arg0, arg1) & Static385.method5885(arg1, arg0);
	}
}
