import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!saa", name = "i", descriptor = "Lclient!ri;")
	public static Class284 aClass284_137;

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_168 = new Class342(8);

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IB)V")
	public static void method6516(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static80.anInt2134 = arg0;
		Static541.aClass25_Sub7Array1 = new Class25_Sub7[Static357.anIntArray353[Static80.anInt2134] + 1];
		Static447.anInt7896 = 0;
		Static520.anInt9166 = 0;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)I")
	public static int method6518(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(43) int local43 = (arg0 & 0x7F) * 96 >> 7;
			if (local43 < 2) {
				local43 = 2;
			} else if (local43 > 126) {
				local43 = 126;
			}
			return local43 + (arg0 & 0xFF80);
		}
	}
}
