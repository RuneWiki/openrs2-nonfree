import java.awt.Image;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static350 {

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "[I")
	public static int[] anIntArray116 = new int[1];

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZLjava/io/File;)[B")
	public static byte[] method1352(@OriginalArg(1) File arg0) {
		return Static579.method8268(arg0, (int) arg0.length());
	}
}
