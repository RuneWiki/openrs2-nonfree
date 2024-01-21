import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	public static int anInt924;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Lclient!vb;")
	public static Class82 aClass82_16;

	@OriginalMember(owner = "client!df", name = "x", descriptor = "I")
	public static int anInt927;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "[I")
	public static int[] anIntArray71 = new int[2000];

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_310 = Static120.method2057("(U5");

	@OriginalMember(owner = "client!df", name = "p", descriptor = "Lclient!wc;")
	public static Class90 aClass90_1 = new Class90();

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!tg;")
	public static Class81 aClass81_311 = Static120.method2057("");

	@OriginalMember(owner = "client!df", name = "u", descriptor = "Z")
	public static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "I")
	public static int anInt928 = -1;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method712() {
		if (Static157.aClass8_1 != null) {
			@Pc(16) Class8 local16 = Static157.aClass8_1;
			synchronized (Static157.aClass8_1) {
				Static157.aClass8_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public static void method713() {
		aClass81_311 = null;
		aClass81_310 = null;
		aClass90_1 = null;
		aClass82_16 = null;
		anIntArray71 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)I")
	public static int method714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
