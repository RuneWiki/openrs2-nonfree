import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!daa", name = "s", descriptor = "[Lclient!oe;")
	public static final Class227[] aClass227Array3 = new Class227[100];

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(JB)V")
	public static void method5205(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!sq;")
	public static Class277 method5220(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class277_Sub1(arg0, 5000);
	}
}
