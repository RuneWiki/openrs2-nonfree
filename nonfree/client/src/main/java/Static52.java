import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
	public static int anInt1173;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
	public static int[] anIntArray257 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public static int anInt1171 = 0;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_358 = Static13.method257("Cancel");

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Lclient!o;")
	public static Class40 aClass40_359 = Static13.method257("null");

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!o;")
	public static Class40 aClass40_360 = Static13.method257("::hiddenbuttontest");

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "[I")
	public static int[] anIntArray258 = new int[1000];

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt1175 = 0;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_361 = Static13.method257("Please wait)3)3)3");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I")
	public static int method849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method850() {
		Static90.aClass47_17.method1330();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method852() {
		aClass40_358 = null;
		anIntArray257 = null;
		anIntArray258 = null;
		aClass40_359 = null;
		aClass40_361 = null;
		aClass40_360 = null;
	}
}
