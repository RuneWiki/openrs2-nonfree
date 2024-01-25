import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
	public static int anInt4932;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z")
	public static boolean method4281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static422.method6288(arg1, arg0) || Static218.method3891(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static50.method7746(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/net/Socket;B)Lclient!pi;")
	public static Class154 method4282(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class154_Sub1(arg0, 5000);
	}
}
