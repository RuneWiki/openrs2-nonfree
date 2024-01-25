import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public static int anInt549;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
	public static void method581() {
		@Pc(13) Class317 local13 = Static111.aClass317_12;
		synchronized (Static111.aClass317_12) {
			Static111.aClass317_12.method7870(5);
		}
		local13 = Static306.aClass317_31;
		synchronized (Static306.aClass317_31) {
			Static306.aClass317_31.method7870(5);
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)I")
	public static int method583() {
		return Static102.anInt1771++;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method586(@OriginalArg(1) byte[] arg0) {
		return Static490.method7391(arg0.length, 0, arg0);
	}
}
