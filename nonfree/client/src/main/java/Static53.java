import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Z")
	public static boolean aBoolean84 = true;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	public static void method1072() {
		Static50.aClass155_10.method4364(5);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method1079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 - arg0;
		if (local14 < -9) {
			return "<col=ff0000>";
		} else if (local14 < -6) {
			return "<col=ff3000>";
		} else if (local14 < -3) {
			return "<col=ff7000>";
		} else if (local14 < 0) {
			return "<col=ffb000>";
		} else if (local14 > 9) {
			return "<col=00ff00>";
		} else if (local14 > 6) {
			return "<col=40ff00>";
		} else if (local14 <= 3) {
			return local14 <= 0 ? "<col=ffff00>" : "<col=c0ff00>";
		} else {
			return "<col=80ff00>";
		}
	}
}
