import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static197 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!jr;)Ljava/lang/String;")
	public static String method3310(@OriginalArg(1) Class6_Sub12 arg0) {
		return Static7.method93(arg0);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method3311(@OriginalArg(0) File arg0) {
		return Static109.method2943((int) arg0.length(), arg0);
	}
}
