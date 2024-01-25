import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static303 {

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "Lclient!wh;")
	public static final Class1_Sub49 aClass1_Sub49_1 = new Class1_Sub49(0, -1);

	@OriginalMember(owner = "client!lm", name = "bb", descriptor = "I")
	public static int anInt5261 = 0;

	@OriginalMember(owner = "client!lm", name = "cb", descriptor = "I")
	public static int anInt5262 = 0;

	@OriginalMember(owner = "client!lm", name = "db", descriptor = "Lclient!vg;")
	public static Class341 aClass341_13 = null;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!ns;")
	public static Class149 method4269(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class149_Sub1(arg0, 7500);
	}
}
