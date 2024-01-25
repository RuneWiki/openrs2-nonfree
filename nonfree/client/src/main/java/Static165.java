import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!kj", name = "J", descriptor = "Lclient!t;")
	public static Class189 aClass189_7;

	@OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
	public static int anInt3522;

	@OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
	public static int anInt3518 = 0;

	@OriginalMember(owner = "client!kj", name = "R", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!kj", name = "S", descriptor = "Lclient!dj;")
	public static Class43 aClass43_20 = new Class43(64);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V")
	public static void method3206() {
		@Pc(5) Class198 local5 = Static88.aClass198_76;
		synchronized (Static88.aClass198_76) {
			Static88.aClass198_76.method5202(5);
		}
		local5 = Static28.aClass198_241;
		synchronized (Static28.aClass198_241) {
			Static28.aClass198_241.method5202(5);
		}
	}
}
