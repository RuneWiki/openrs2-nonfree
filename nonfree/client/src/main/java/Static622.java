import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static622 {

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "Z")
	public static boolean aBoolean738 = false;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_254 = new Class215(55, 0);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IBI)Z")
	public static boolean method9059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
	public static void method9063() {
		Static498.method7728();
		Static293.method5263();
	}
}
