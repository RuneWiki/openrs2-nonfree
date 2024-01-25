import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Lclient!g;")
	public static Class83 aClass83_79;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "[Lclient!bl;")
	public static Class7_Sub1_Sub1_Sub1[] aClass7_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!kd;")
	public static Class123 aClass123_4;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!g;")
	public static Class83 aClass83_80;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	public static int anInt4436;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "I")
	public static int anInt4434 = 0;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "[Lclient!pi;")
	public static Class35_Sub1[] aClass35_Sub1Array1 = new Class35_Sub1[0];

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_65 = new Class183(69, 3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)I")
	public static int method3903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
