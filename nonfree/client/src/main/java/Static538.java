import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "Lclient!ega;")
	public static final Class98 aClass98_4 = new Class98("game3", 2);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method7524() {
		@Pc(13) Class340 local13 = Static483.aClass340_45;
		synchronized (Static483.aClass340_45) {
			Static483.aClass340_45.method8000();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Z")
	public static boolean method7533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static439.method6409(arg0, arg1) & Static371.method5567(arg0, arg1);
	}
}
