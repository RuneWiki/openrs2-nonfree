import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "[Lclient!qg;")
	public static Class87[] aClass87Array14;

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_250 = new Class123(24, 16);

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
	public static void method3979() {
		Static100.aClass87_7 = null;
		Static387.aClass87_28 = null;
		Static379.aClass87_27 = null;
		Static306.aClass87_21 = null;
		Static335.aClass87_24 = null;
		Static330.aClass87_23 = null;
		Static447.aClass87_30 = null;
		Static234.aClass87_19 = null;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)I")
	public static int method3981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static81.anIntArray118[arg1 & 0x3] : 256;
	}
}
