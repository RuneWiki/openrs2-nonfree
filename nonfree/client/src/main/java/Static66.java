import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
	public static int anInt1705;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
	public static int anInt1706 = 0;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "F")
	public static float aFloat20 = 1.0F;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;BLjava/io/File;)V")
	public static void method1650(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1) {
		Static598.aHashtable7.put(arg0, arg1);
	}
}
