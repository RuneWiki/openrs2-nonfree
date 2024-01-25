import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static461 {

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "Lclient!of;")
	public static Class242 aClass242_1;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
	public static int anInt7534;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Lclient!ro;")
	public static final Class292 aClass292_18 = new Class292(4);

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Lclient!ro;")
	public static final Class292 aClass292_14 = new Class292(1);

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "Lclient!ro;")
	public static final Class292 aClass292_11 = new Class292(1);

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "Lclient!ro;")
	public static final Class292 aClass292_12 = new Class292(2);

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "Lclient!ro;")
	public static final Class292 aClass292_13 = new Class292(4);

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "Lclient!ro;")
	public static final Class292 aClass292_15 = new Class292(2);

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "Lclient!ro;")
	public static final Class292 aClass292_16 = new Class292(4);

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "Lclient!ro;")
	public static final Class292 aClass292_17 = new Class292(2);

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_231 = new Class272(13, 17);

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "[I")
	public static final int[] anIntArray585 = new int[5];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method6384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 + arg0 > arg2 && arg2 + arg3 > arg7) {
			return arg1 + arg4 > arg6 && arg1 < arg6 + arg5;
		} else {
			return false;
		}
	}
}
