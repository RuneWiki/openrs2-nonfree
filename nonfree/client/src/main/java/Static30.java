import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	public static int anInt768;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_7 = new Class313(260);

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "[I")
	public static final int[] anIntArray44 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!fm;")
	public static Class116 method547(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class116_Sub1(arg0, 7500);
	}
}
