import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Lclient!bw;")
	public static Class34 aClass34_3;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "Lclient!nl;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
	public static int anInt6415 = -2;

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "[I")
	public static final int[] anIntArray546 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIB)I")
	public static int method5078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z")
	public static boolean method5080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static151.method2523(arg1, arg0) & Static30.method538(arg0, arg1);
	}
}
