import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static221 {

	@OriginalMember(owner = "client!in", name = "l", descriptor = "J")
	public static long aLong121;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "Lclient!qf;")
	public static final Class271 aClass271_4 = new Class271();

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;)V")
	public static void method3602(@OriginalArg(0) File arg0, @OriginalArg(2) String arg1) {
		Static210.aHashtable4.put(arg1, arg0);
	}
}
