import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static526 {

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
	public static int anInt9307;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "Lclient!n;")
	public static Interface13 anInterface13_14;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "Z")
	public static boolean aBoolean698 = false;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
	public static void method8052() {
		Static361.aBoolean482 = true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
	public static boolean method8053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static447.method6927(arg0, arg1) || Static508.method7752(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static420.method6572(arg1, arg0);
		}
	}
}
