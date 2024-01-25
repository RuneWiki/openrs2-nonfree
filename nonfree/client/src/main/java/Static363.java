import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static363 {

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "[I")
	public static final int[] anIntArray343 = new int[2];

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
	public static int anInt5922 = -1;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "[I")
	public static final int[] anIntArray344 = new int[1000];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[BB)I")
	public static int method5288(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static292.method4637(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!cca;")
	public static Class50 method5291(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class50_Sub1(arg0, 15000);
	}
}
