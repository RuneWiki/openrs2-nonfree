import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "I")
	public static int anInt8756;

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
	public static int anInt8757;

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "I")
	public static int anInt8758;

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "Lclient!gba;")
	public static Class114 aClass114_10;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method7222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - arg0;
		if (local16 < -9) {
			return "<col=ff0000>";
		} else if (local16 < -6) {
			return "<col=ff3000>";
		} else if (local16 < -3) {
			return "<col=ff7000>";
		} else if (local16 < 0) {
			return "<col=ffb000>";
		} else if (local16 > 9) {
			return "<col=00ff00>";
		} else if (local16 > 6) {
			return "<col=40ff00>";
		} else if (local16 > 3) {
			return "<col=80ff00>";
		} else if (local16 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
