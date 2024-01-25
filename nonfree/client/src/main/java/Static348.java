import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static348 {

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_187 = new Class272(107, 0);

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!te;")
	public static final Class318 aClass318_5 = new Class318("", 16);

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
	public static int anInt6099 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method5280() {
		Static58.aClass3_Sub44_1 = new Class3_Sub44(Static48.aClass33_6.method797(Static131.anInt2839), "", Static212.anInt4226, 1010, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
	public static boolean method5281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static88.method1971(arg0, arg1) | (arg0 & 0x800) != 0 || Static310.method4847(arg0, arg1);
	}
}
