import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
	public static int anInt7040;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_100 = new Class200(59, 4);

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "Z")
	public static boolean aBoolean508 = false;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)I")
	public static int method6064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;)V")
	public static void method6065(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1) {
		Static340.aHashtable6.put(arg0, arg1);
	}
}
