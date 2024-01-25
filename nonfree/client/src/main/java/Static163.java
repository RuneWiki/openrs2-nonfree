import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!iv;")
	public static Class170 aClass170_1;

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "Lclient!ae;")
	public static Class8 aClass8_52;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "[I")
	public static int[] anIntArray155 = new int[2];

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_49 = new Class289(89, 8);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!vq;I)I")
	public static int method2340(@OriginalArg(0) Class378 arg0) {
		if (Static368.aClass378_1 == arg0) {
			return 5890;
		} else if (arg0 == Static568.aClass378_2) {
			return 34167;
		} else if (arg0 == Static648.aClass378_4) {
			return 34168;
		} else if (Static583.aClass378_3 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Z")
	public static boolean method2342(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class6_Sub4_Sub12 local10 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8538(); local10 != null; local10 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8530()) {
			if (Static186.method2659(local10.anInt7577) && (long) arg0 == local10.aLong224) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
	public static void method2343() {
		if (Static475.anInt8164 > 1) {
			Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub2_1, 4);
		} else {
			Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub2_1, 2);
		}
	}
}
