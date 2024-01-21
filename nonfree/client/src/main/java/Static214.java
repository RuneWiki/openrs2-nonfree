import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!we", name = "cb", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_28;

	@OriginalMember(owner = "client!we", name = "fb", descriptor = "I")
	public static int anInt4155;

	@OriginalMember(owner = "client!we", name = "Y", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1536 = Static161.method2452("Discard");

	@OriginalMember(owner = "client!we", name = "N", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1532 = aClass20_1536;

	@OriginalMember(owner = "client!we", name = "Q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1533 = Static161.method2452("Wordpack geladen)3");

	@OriginalMember(owner = "client!we", name = "T", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1534 = Static161.method2452("http:)4)4");

	@OriginalMember(owner = "client!we", name = "U", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1535 = Static161.method2452("hint_mapmarkers");

	@OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
	public static int anInt4152 = 0;

	@OriginalMember(owner = "client!we", name = "eb", descriptor = "I")
	public static int anInt4154 = 128;

	@OriginalMember(owner = "client!we", name = "ib", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1537 = Static161.method2452("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!we", name = "jb", descriptor = "J")
	public static volatile long aLong247 = 0L;

	@OriginalMember(owner = "client!we", name = "kb", descriptor = "Z")
	public static boolean aBoolean186 = false;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method3154(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
	public static void method3155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg3; local7++) {
			Static27.method409(arg2, arg1, Static9.anIntArrayArray1[local7], arg0);
		}
	}
}
