import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static126 {

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "Lclient!ve;")
	public static Class69 aClass69_30;

	@OriginalMember(owner = "client!mi", name = "H", descriptor = "[S")
	public static short[] aShortArray35;

	@OriginalMember(owner = "client!mi", name = "x", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_835 = Static81.method1507("(R");

	@OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
	public static int anInt2764 = 0;

	@OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
	public static int anInt2768 = -1;

	@OriginalMember(owner = "client!mi", name = "I", descriptor = "[S")
	public static final short[] aShortArray36 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)I")
	public static int method2106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0 + (arg1 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!fj;I)Lclient!ha;")
	public static Class22_Sub2 method2107(@OriginalArg(0) Class1_Sub7 arg0) {
		return new Class22_Sub2(arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2745(), arg0.method2771());
	}
}
