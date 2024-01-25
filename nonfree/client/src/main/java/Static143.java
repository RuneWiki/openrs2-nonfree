import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString15 = null;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IJ)V")
	public static void method2136(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}
}
