import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static117 {

	@OriginalMember(owner = "client!efa", name = "q", descriptor = "[I")
	public static int[] anIntArray125;

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "Lclient!efa;")
	public static final Class91 aClass91_1 = new Class91(0, 3, Static424.aClass273_16);

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "Lclient!efa;")
	public static final Class91 aClass91_2 = new Class91(1, 3, Static424.aClass273_16);

	@OriginalMember(owner = "client!efa", name = "i", descriptor = "Lclient!efa;")
	public static final Class91 aClass91_3 = new Class91(2, 4, Static424.aClass273_12);

	@OriginalMember(owner = "client!efa", name = "j", descriptor = "Lclient!efa;")
	public static final Class91 aClass91_4 = new Class91(3, 1, Static424.aClass273_16);

	@OriginalMember(owner = "client!efa", name = "k", descriptor = "Lclient!efa;")
	public static final Class91 aClass91_5 = new Class91(4, 2, Static424.aClass273_16);

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "Lclient!efa;")
	public static final Class91 aClass91_6 = new Class91(5, 3, Static424.aClass273_16);

	@OriginalMember(owner = "client!efa", name = "m", descriptor = "Lclient!efa;")
	public static final Class91 aClass91_7 = new Class91(6, 4, Static424.aClass273_16);

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
	public static final int anInt2701 = Static507.method7317(16);

	@OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
	public static int anInt2702 = 0;

	@OriginalMember(owner = "client!efa", name = "p", descriptor = "Z")
	public static boolean aBoolean207 = false;

	@OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
	public static int anInt2703 = -1;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IB)Lclient!efa;")
	public static Class91 method2161(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass91_1;
		} else if (arg0 == 1) {
			return aClass91_2;
		} else if (arg0 == 2) {
			return aClass91_3;
		} else if (arg0 == 3) {
			return aClass91_4;
		} else if (arg0 == 4) {
			return aClass91_5;
		} else if (arg0 == 5) {
			return aClass91_6;
		} else if (arg0 == 6) {
			return aClass91_7;
		} else {
			return null;
		}
	}
}
