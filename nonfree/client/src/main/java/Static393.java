import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static393 {

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_118 = new Class145(6, -1);

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[8];

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "Z")
	public static boolean aBoolean479 = false;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IB)Lclient!mia;")
	public static Class226 method5802() {
		return new Class226(1, false);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)Z")
	public static boolean method5803() {
		return Static275.anInt5095 != 0;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
	public static void method5804() {
		Static55.aClass323_5.method7485();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/net/Socket;BI)Lclient!ar;")
	public static Class22 method5805(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class22_Sub1(arg0, 7500);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
	public static boolean method5807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static38.method888(arg0, arg1) || Static357.method5331(arg1, arg0);
	}
}
