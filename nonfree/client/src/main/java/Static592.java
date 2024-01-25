import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static592 {

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "[I")
	public static int[] anIntArray612;

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray37;

	@OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
	public static int anInt9421;

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_112 = new Class241(21, -1);

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_176 = new Class322(59, 0);

	@OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
	public static final int anInt9419 = 1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z")
	public static boolean method8219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static681.method8957(arg0, arg1) | (arg0 & 0x800) != 0 || Static165.method3263(arg0, arg1);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BJ)I")
	public static int method8220(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZILclient!lga;JIII)V")
	public static void method8221(@OriginalArg(1) int arg0, @OriginalArg(2) Class223 arg1, @OriginalArg(3) long arg2, @OriginalArg(5) int arg3) {
		Static465.method7034(arg3, arg1, arg2, arg0);
	}
}
