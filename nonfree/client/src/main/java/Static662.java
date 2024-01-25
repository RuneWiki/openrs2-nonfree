import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static662 {

	@OriginalMember(owner = "client!wga", name = "n", descriptor = "J")
	public static long aLong309;

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "Lclient!wga;")
	public static final Class384 aClass384_1 = new Class384(0, 3, Static453.aClass278_17);

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "Lclient!wga;")
	public static final Class384 aClass384_2 = new Class384(1, 3, Static453.aClass278_17);

	@OriginalMember(owner = "client!wga", name = "q", descriptor = "Lclient!wga;")
	public static final Class384 aClass384_3 = new Class384(2, 4, Static453.aClass278_13);

	@OriginalMember(owner = "client!wga", name = "s", descriptor = "Lclient!wga;")
	public static final Class384 aClass384_4 = new Class384(3, 1, Static453.aClass278_17);

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "Lclient!wga;")
	public static final Class384 aClass384_5 = new Class384(4, 2, Static453.aClass278_17);

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "Lclient!wga;")
	public static final Class384 aClass384_6 = new Class384(5, 3, Static453.aClass278_17);

	@OriginalMember(owner = "client!wga", name = "o", descriptor = "Lclient!wga;")
	public static final Class384 aClass384_7 = new Class384(6, 4, Static453.aClass278_17);

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "I")
	public static final int anInt10637 = Static197.method8882(16);

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_126 = new Class387(19, 8);

	@OriginalMember(owner = "client!wga", name = "i", descriptor = "I")
	public static int anInt10638 = -50;

	@OriginalMember(owner = "client!wga", name = "r", descriptor = "[I")
	public static final int[] anIntArray613 = new int[6];

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IB)Lclient!wga;")
	public static Class384 method9157(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass384_1;
		} else if (arg0 == 1) {
			return aClass384_2;
		} else if (arg0 == 2) {
			return aClass384_3;
		} else if (arg0 == 3) {
			return aClass384_4;
		} else if (arg0 == 4) {
			return aClass384_5;
		} else if (arg0 == 5) {
			return aClass384_6;
		} else if (arg0 == 6) {
			return aClass384_7;
		} else {
			return null;
		}
	}
}
