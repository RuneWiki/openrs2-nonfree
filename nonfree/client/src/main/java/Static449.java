import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static449 {

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
	public static int anInt7857;

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "Lclient!cb;")
	public static Class50 aClass50_129;

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "Z")
	public static boolean aBoolean574 = true;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[ILclient!cb;Lclient!cb;)V")
	public static void method6670(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class50 arg1, @OriginalArg(3) Class50 arg2) {
		if (arg0 != null) {
			Static596.anIntArray547 = arg0;
		}
		Static663.aClass50_187 = arg2;
		Static108.aClass50_31 = arg1;
	}
}
