import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static27 {

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public static int anInt848 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!jd;II)V")
	public static void method951(@OriginalArg(1) Class167 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static198.aClass167ArrayArray1[arg1][arg2] = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!ts;")
	public static Class8 method952(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class8_Sub1(arg0, 7500);
	}
}
