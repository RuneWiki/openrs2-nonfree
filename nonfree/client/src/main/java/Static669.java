import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static669 {

	@OriginalMember(owner = "client!wn", name = "nb", descriptor = "Lclient!sea;")
	public static Class269 aClass269_2;

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_84 = new Class165(4);

	@OriginalMember(owner = "client!wn", name = "X", descriptor = "I")
	public static int anInt10705 = 0;

	@OriginalMember(owner = "client!wn", name = "kb", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_156 = new Class218(88, -1);

	@OriginalMember(owner = "client!wn", name = "mb", descriptor = "Z")
	public static boolean aBoolean815 = false;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!sea;")
	public static Class269 method9265(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class269_Sub1(arg0, 15000);
	}
}
