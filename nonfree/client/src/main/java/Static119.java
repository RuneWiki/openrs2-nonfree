import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "Lclient!ie;")
	public static Class109 aClass109_1;

	@OriginalMember(owner = "client!ft", name = "I", descriptor = "[I")
	public static int[] anIntArray146;

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
	public static int anInt2216 = 0;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	public static void method1899() {
		for (@Pc(10) Class1_Sub5_Sub6 local10 = (Class1_Sub5_Sub6) Static340.aClass227_35.method4967(); local10 != null; local10 = (Class1_Sub5_Sub6) Static340.aClass227_35.method4973()) {
			@Pc(15) Class25_Sub5_Sub5 local15 = local10.aClass25_Sub5_Sub5_1;
			if (local15.aBoolean529) {
				local10.method5915();
				local15.method3636();
			} else if (Static236.anInt4213 >= local15.anInt4597) {
				local15.method3633(Static341.anInt5831);
				if (local15.aBoolean529) {
					local10.method5915();
				} else {
					Static277.method4344(local15, true);
				}
			}
		}
	}
}
