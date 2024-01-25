import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_27 = new Class150(110, -1);

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
	public static int anInt1105 = 0;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "[I")
	public static final int[] anIntArray151 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1070(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static553.method2534(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
