import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!br", name = "c", descriptor = "I")
	public static int anInt675;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
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

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
	public static void method652() {
		Static79.method1086();
		Static473.aClass75_14 = null;
		Static251.aClass277_4 = null;
		Static522.aClass81_2 = null;
		Static602.aClass81_4 = null;
		Static372.aClass277_7 = null;
		Static547.aClass81_3 = null;
		Static401.aClass304ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method653(@OriginalArg(1) File arg0) {
		return Static632.method8587((int) arg0.length(), arg0);
	}
}
