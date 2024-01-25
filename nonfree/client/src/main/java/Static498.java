import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public static int anInt8630;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_23 = new Class284(0, 7);

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_24 = new Class284(13, 7);

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "S")
	public static short aShort108 = 32767;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method7097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 - arg0;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
