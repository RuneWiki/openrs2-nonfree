import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static32 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method722(@OriginalArg(0) File arg0) {
		return Static177.method3060((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BII)I")
	public static int method723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static212.anIntArray283[arg1 & 0x3] : 256;
	}
}
