import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public static int anInt9068;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "I")
	public static int anInt9070;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	public static int anInt9071;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Z")
	public static boolean aBoolean673 = false;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method7787() {
		for (@Pc(10) Class3_Sub40 local10 = (Class3_Sub40) Static580.aClass25_45.method435(); local10 != null; local10 = (Class3_Sub40) Static580.aClass25_45.method432()) {
			Static558.method7939(local10.anInt7435);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method7788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
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
