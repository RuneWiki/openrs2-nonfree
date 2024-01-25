import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!js;")
	public static Class166 aClass166_1;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!qj;")
	public static Class275 aClass275_1;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_36 = new Class303(30, 3);

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "[I")
	public static final int[] anIntArray141 = new int[25];

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!rn;I)Ljava/lang/String;")
	public static String method2767(@OriginalArg(0) Class3_Sub43 arg0) {
		return arg0.aString74 == null || arg0.aString74.length() <= 0 ? arg0.aString75 : arg0.aString75 + Static544.aClass343_36.method7222(Static256.anInt4535) + arg0.aString74;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method2768(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(15) byte[] local15 = new byte[32768];
		Static601.method2816(arg0, arg1, local15, 0, 32768);
		return local15;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZC)Z")
	public static boolean method2769(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!lba;")
	public static Class165 method2770(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class165_Sub1(arg0, 7500);
	}
}
