import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "[I")
	public static final int[] anIntArray298 = new int[2];

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	public static byte[] method5224(@OriginalArg(0) File arg0) {
		return Static385.method6097(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)V")
	public static void method5229() {
		Static334.aClass223_43.method5398();
	}
}
