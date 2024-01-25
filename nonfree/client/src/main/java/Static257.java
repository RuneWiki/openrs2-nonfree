import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static257 {

	@OriginalMember(owner = "client!il", name = "I", descriptor = "I")
	public static int anInt4846;

	@OriginalMember(owner = "client!il", name = "K", descriptor = "D")
	public static double aDouble19;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "Lclient!jia;")
	public static final Class193 aClass193_27 = new Class193();

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!ha;II)V")
	public static void method4063(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2) {
		Static44.aClass182ArrayArray1 = new Class182[arg2][arg0];
		Static355.aClass16_6 = arg1;
		if (Static379.anIntArray632 != null) {
			Static235.aClass106_2 = Static533.method7424(Static379.anIntArray632[5], Static379.anIntArray632[3], Static379.anIntArray632[4], Static379.anIntArray632[0], Static379.anIntArray632[1], Static379.anIntArray632[2]);
		}
		Static527.aClass182_2 = new Class182();
		Static642.method8426();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZII)I")
	public static int method4065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
