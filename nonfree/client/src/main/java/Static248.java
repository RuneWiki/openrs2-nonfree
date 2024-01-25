import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!jg", name = "N", descriptor = "Lclient!lf;")
	public static Class207 aClass207_1;

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
	public static int anInt4654;

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "Lclient!ki;")
	public static final Class190 aClass190_3 = new Class190();

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
	public static final int anInt4653 = 1400;

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString36 = null;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!es;)Lclient!mk;")
	public static Class222 method3896(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(13) int local13 = arg0.method4294();
		return new Class222(local13);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!i;)V")
	public static void method3897(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1) {
		Static421.aClass67Array7[arg0] = arg1;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)I")
	public static int method3898(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
