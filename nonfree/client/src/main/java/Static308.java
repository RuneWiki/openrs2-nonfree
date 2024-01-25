import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
	public static int anInt5415;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "Lclient!ce;")
	public static final Class35 aClass35_1 = new Class35();

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "[Lclient!cu;")
	public static final Class3_Sub2_Sub1_Sub1[] aClass3_Sub2_Sub1_Sub1Array1 = new Class3_Sub2_Sub1_Sub1[32768];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!bn;I)V")
	public static void method4525(@OriginalArg(0) Class3_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class3_Sub2_Sub1_Sub1) {
			@Pc(13) Class3_Sub2_Sub1_Sub1 local13 = (Class3_Sub2_Sub1_Sub1) arg0;
			if (local13.aClass48_1 != null) {
				Static173.method2866(Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 != local13.aByte103, local13);
				return;
			}
		} else if (arg0 instanceof Class3_Sub2_Sub1_Sub2) {
			@Pc(40) Class3_Sub2_Sub1_Sub2 local40 = (Class3_Sub2_Sub1_Sub2) arg0;
			Static178.method6352(local40, Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 != local40.aByte103);
		} else {
			return;
		}
	}
}
