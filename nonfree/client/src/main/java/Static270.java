import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "Lclient!dj;")
	public static Class43 aClass43_29 = new Class43(8);

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
	public static final int anInt5394 = 0;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
	public static int anInt5396 = 0;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method4633() {
		@Pc(1) Class198 local1 = Static88.aClass198_76;
		synchronized (Static88.aClass198_76) {
			Static88.aClass198_76.method5213();
		}
		local1 = Static28.aClass198_241;
		synchronized (Static28.aClass198_241) {
			Static28.aClass198_241.method5213();
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)I")
	public static int method4635() {
		return 2;
	}
}
