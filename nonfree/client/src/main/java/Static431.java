import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static431 {

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "[I")
	public static int[] anIntArray533;

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
	public static int anInt8060 = 0;

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString91 = null;

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "S")
	public static short aShort99 = 256;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/net/Socket;BI)Lclient!ss;")
	public static Class116 method6883(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class116_Sub1(arg0, 7500);
	}
}
