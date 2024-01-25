import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "Lclient!qv;")
	public static Class29_Sub1 aClass29_Sub1_1;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IJ)V")
	public static void method4117(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLjava/io/File;Ljava/lang/String;)V")
	public static void method4118(@OriginalArg(1) File arg0, @OriginalArg(2) String arg1) {
		Static48.aHashtable1.put(arg1, arg0);
	}
}
