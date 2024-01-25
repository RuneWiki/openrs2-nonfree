import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
	public static int anInt9182;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!ub;")
	public static Class327 aClass327_13;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Z")
	public static boolean aBoolean712 = false;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)[Lclient!jd;")
	public static Class153[] method7521() {
		return new Class153[] { Static96.aClass153_5, Static558.aClass153_12, Static422.aClass153_9, Static582.aClass153_14, Static71.aClass153_4, Static167.aClass153_7, Static90.aClass153_13, Static455.aClass153_10, Static30.aClass153_3, Static385.aClass153_8 };
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)I")
	public static int method7524(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return local17 + (arg0 & 0xFF80);
	}
}
