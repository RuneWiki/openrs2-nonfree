import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static70 {

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "[I")
	public static int[] anIntArray93;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	public static int anInt1230 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V")
	public static void method967(@OriginalArg(0) int arg0) {
		if (Static486.anIntArray563 == null || Static486.anIntArray563.length < arg0) {
			Static486.anIntArray563 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!paa;B)V")
	public static void method970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class261 arg2) {
		Static633.aClass261_13 = arg2;
		Static200.anInt3399 = arg1;
		Static145.anInt2640 = arg0;
	}
}
