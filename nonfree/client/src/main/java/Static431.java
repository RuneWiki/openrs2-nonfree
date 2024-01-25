import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static431 {

	@OriginalMember(owner = "client!qs", name = "B", descriptor = "I")
	public static int anInt7712;

	@OriginalMember(owner = "client!qs", name = "Q", descriptor = "[Lclient!fb;")
	public static Class60_Sub1_Sub1_Sub1[] aClass60_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!qs", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!qs", name = "X", descriptor = "Lclient!un;")
	public static Class189 aClass189_2;

	@OriginalMember(owner = "client!qs", name = "J", descriptor = "Lclient!gga;")
	public static Class119 aClass119_1 = new Class119(8);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)V")
	public static void method6144(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static340.aClass6_Sub12_Sub2_1.method6042(arg0);
		Static340.aClass6_Sub12_Sub2_1.method6053(arg1);
		Static340.aClass6_Sub12_Sub2_1.method6041(arg2);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBIIII)V")
	public static void method6147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static58.aClass6_Sub17_Sub1_1.anInt9279 != 0 && arg1 != 0 && Static300.anInt5490 < 50 && arg3 != -1) {
			Static486.aClass152Array1[Static300.anInt5490++] = new Class152((byte) 1, arg3, arg1, arg0, arg2, arg4);
		}
	}
}
