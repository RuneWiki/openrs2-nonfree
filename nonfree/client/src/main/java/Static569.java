import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static569 {

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "Lclient!ne;")
	public static Class247 aClass247_15;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "[Lclient!ui;")
	public static Class351[] aClass351Array1 = new Class351[50];

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
	public static int anInt9215 = 0;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "Z")
	public static boolean aBoolean788 = false;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)I")
	public static int method7785(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLclient!mc;)Lclient!ms;")
	public static Class9_Sub2 method7786(@OriginalArg(1) Class5_Sub41 arg0) {
		return new Class9_Sub2(arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7807(), arg0.method7816());
	}
}
