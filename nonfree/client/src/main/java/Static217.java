import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static217 {

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V")
	public static void method3358(@OriginalArg(1) String arg0, @OriginalArg(2) File arg1) {
		Static393.aHashtable6.put(arg0, arg1);
	}
}
