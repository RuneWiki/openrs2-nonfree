import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!rp", name = "D", descriptor = "I")
	public static int anInt5968 = -1;

	@OriginalMember(owner = "client!rp", name = "E", descriptor = "I")
	public static int anInt5969 = 0;

	@OriginalMember(owner = "client!rp", name = "M", descriptor = "I")
	public static int anInt5976 = 0;

	@OriginalMember(owner = "client!rp", name = "U", descriptor = "Lclient!sn;")
	public static final Class225 aClass225_15 = new Class225(2, 7);

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!pf;B)I")
	public static int method4669(@OriginalArg(0) Class3_Sub4_Sub1_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt4989;
		@Pc(17) Class173 local17 = arg0.method4001();
		if (arg0.aBoolean353) {
			local13 = arg0.anInt4985;
		} else if (arg0.anInt4922 == local17.anInt4463 || local17.anInt4485 == arg0.anInt4922 || local17.anInt4459 == arg0.anInt4922 || arg0.anInt4922 == local17.anInt4460) {
			local13 = arg0.anInt5015;
		} else if (local17.anInt4488 == arg0.anInt4922 || arg0.anInt4922 == local17.anInt4472 || local17.anInt4476 == arg0.anInt4922 || arg0.anInt4922 == local17.anInt4454) {
			local13 = arg0.anInt4986;
		}
		return local13;
	}
}
