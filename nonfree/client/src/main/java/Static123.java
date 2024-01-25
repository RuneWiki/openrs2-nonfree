import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static123 {

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Z")
	public static boolean aBoolean234;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "Lclient!kp;")
	public static Class192 aClass192_2;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
	public static int anInt2784 = 0;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
	public static int anInt2786 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!qr;")
	public static Class152 method2535(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class152_Sub1(arg0, 7500);
	}
}
