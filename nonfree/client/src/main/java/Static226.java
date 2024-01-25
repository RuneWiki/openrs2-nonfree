import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static226 {

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!bba;")
	public static Class29 method3873(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class29_Sub1(arg0, 7500);
	}
}
