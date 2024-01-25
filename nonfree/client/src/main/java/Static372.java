import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!nf", name = "z", descriptor = "[I")
	public static int[] anIntArray207;

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Lclient!wg;")
	public static final Class372 aClass372_10 = new Class372();

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(JJ)J")
	public static long method3459(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BII)Ljava/lang/String;")
	public static String method3460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "(I)V")
	public static void method3461() {
		Static605.aClass102_62.method2680();
		Static174.aClass102_21.method2680();
		Static402.aClass102_43.method2680();
		Static434.aClass102_45.method2680();
	}
}
