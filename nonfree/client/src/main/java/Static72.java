import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
	public static int anInt1522;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/io/File;IZ)[B")
	public static byte[] method1438(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static45.method1076(arg1, arg0, local6);
			return local6;
		} catch (@Pc(21) IOException local21) {
			return null;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)I")
	public static int method1440(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
