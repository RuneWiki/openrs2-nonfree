import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_227 = new Class214(9, 6);

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_117 = new Class21("K", "T", "K", "K");

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method6057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
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
}
