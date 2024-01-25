import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!cq;")
	public static Class43 aClass43_4;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
	public static int anInt2657;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_85 = new Class189("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "[I")
	public static final int[] anIntArray158 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIILclient!qa;IZLclient!oa;)V")
	public static void method2008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class172 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class59 arg5) {
		if (arg4) {
			Static186.aClass8_13.method6001((Static333.anInt5712 - Static186.aClass8_13.ja()) / 2, (Static123.anInt2625 - Static186.aClass8_13.JA()) / 2);
			Static437.aClass8_27.method6001((Static333.anInt5712 - Static437.aClass8_27.ja()) / 2, 18);
		}
		arg5.method5774((Static57.aClass183_3 == Static300.aClass183_5 ? Static242.aClass189_146 : Static121.aClass189_83).method4262(Static53.anInt1454), arg3, -1, Static123.anInt2625 / 2 - 26, Static333.anInt5712 / 2);
		@Pc(57) int local57 = Static123.anInt2625 / 2 - 18;
		arg2.method5484(Static333.anInt5712 / 2 - 152, local57, 304, 34, arg0, 0);
		arg2.method5484(Static333.anInt5712 / 2 - 151, local57 + 1, 302, 32, 0, 0);
		arg2.NA(Static333.anInt5712 / 2 - 150, local57 - -2, Static260.anInt6188 * 3, 30, arg1, 0);
		arg2.NA(Static260.anInt6188 * 3 + Static333.anInt5712 / 2 - 150, local57 + 2, 300 - Static260.anInt6188 * 3, 30, 0, 0);
		arg5.method5774(Static75.aString10, arg3, -1, Static123.anInt2625 / 2 + 4, Static333.anInt5712 / 2);
	}
}
