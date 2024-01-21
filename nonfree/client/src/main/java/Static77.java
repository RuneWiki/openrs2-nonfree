import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!jg", name = "jb", descriptor = "Lclient!ke;")
	public static Class43 aClass43_20;

	@OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
	public static int anInt2029 = 0;

	@OriginalMember(owner = "client!jg", name = "fb", descriptor = "[I")
	public static int[] anIntArray340 = new int[] { 4, 58, 46, 28, 34, 45, 49, 42 };

	@OriginalMember(owner = "client!jg", name = "gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_809 = Static146.method2172("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!jg", name = "hb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_810 = Static146.method2172("scrollbar");

	@OriginalMember(owner = "client!jg", name = "kb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_811 = Static146.method2172("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!jg", name = "lb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_812 = Static146.method2172("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)I")
	public static int method1450(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static140.aByteArrayArrayArray6[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static140.aByteArrayArrayArray6[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(IB)I")
	public static int method1451(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * 6 - 61440;
		@Pc(19) int local19 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(32) int local32 = (arg0 * local9 >> 12) + 40960;
		return local19 * local32 >> 12;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public static void method1453() {
		aClass43_20 = null;
		aClass77_812 = null;
		aClass77_809 = null;
		aClass77_811 = null;
		anIntArray340 = null;
		aClass77_810 = null;
	}
}
