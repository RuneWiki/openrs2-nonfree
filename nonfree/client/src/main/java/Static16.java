import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "[Lclient!id;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	public static int anInt689 = 0;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_253 = Static161.method2971("");

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
	public static int anInt696 = 0;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
	public static final int anInt697 = 2301979;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "Lclient!dd;")
	public static Class13 aClass13_254 = Static161.method2971("m");

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "Lclient!dd;")
	public static Class13 aClass13_255 = aClass13_253;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "Lclient!dd;")
	public static Class13 aClass13_256 = Static161.method2971("(U(Y");

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "Lclient!dd;")
	public static Class13 aClass13_257 = Static161.method2971("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "Lclient!dd;")
	private static Class13 aClass13_259 = Static161.method2971("Loaded input handler");

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Lclient!dd;")
	public static Class13 aClass13_258 = aClass13_259;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
	public static int method631(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
	public static void method636() {
		aClass13_259 = null;
		aClass13_258 = null;
		aClass13_254 = null;
		aClass13_253 = null;
		aClass13_255 = null;
		aClass36Array1 = null;
		aClass13_256 = null;
		aClass13_257 = null;
	}
}
