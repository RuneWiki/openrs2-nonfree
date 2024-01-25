import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
	public static final int[] anIntArray838 = new int[1000];

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "J")
	public static long aLong249 = 0L;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZLjava/io/File;)[B")
	public static byte[] method8098(@OriginalArg(0) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg0];
			Static77.method1705(arg1, arg0, local6);
			return local6;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}
}
