import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static449 {

	@OriginalMember(owner = "client!wk", name = "H", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_162 = new Class253(8, 18);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)Z")
	public static boolean method5706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(Z)V")
	public static void method5708() {
		if (Static297.aBoolean308) {
			Static297.aBoolean308 = false;
			Static344.aClass11_18 = null;
			Static126.aClass11_7 = null;
		}
	}
}
