import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!rg;")
	public static Class310 aClass310_102;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean625 = false;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "[Lclient!nq;")
	public static final Interface17[] anInterface17Array3 = new Interface17[75];

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)I")
	public static int method7668() {
		@Pc(10) Class317 local10 = Static111.aClass317_12;
		synchronized (Static111.aClass317_12) {
			return Static111.aClass317_12.method7878();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(CZ)I")
	public static int method7669(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class4_Sub10.anIntArray594.length ? Class4_Sub10.anIntArray594[arg0] : -1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBI)Z")
	public static boolean method7670(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
