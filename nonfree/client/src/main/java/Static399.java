import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
	public static int anInt7790;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_32 = new Class110(7, 17);

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method6435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 - arg0;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
