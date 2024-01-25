import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static512 {

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
	public static int anInt9960;

	@OriginalMember(owner = "client!sca", name = "h", descriptor = "Lclient!ha;")
	public static Class126 aClass126_22;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
	public static void method8464(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static498.aHashtable7.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "(B)V")
	public static void method8465() {
		Static175.method2685();
	}
}
