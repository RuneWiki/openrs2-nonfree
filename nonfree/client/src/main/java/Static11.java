import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aj", name = "hb", descriptor = "I")
	public static int anInt2953;

	@OriginalMember(owner = "client!aj", name = "eb", descriptor = "Z")
	public static volatile boolean aBoolean243 = true;

	@OriginalMember(owner = "client!aj", name = "fb", descriptor = "I")
	public static int anInt2951 = 0;

	@OriginalMember(owner = "client!aj", name = "ub", descriptor = "Lclient!gd;")
	public static Class61 aClass61_23 = new Class61(64);

	@OriginalMember(owner = "client!aj", name = "Fb", descriptor = "Z")
	public static boolean aBoolean244 = true;

	@OriginalMember(owner = "client!aj", name = "Gb", descriptor = "I")
	public static int anInt2976 = 2;

	@OriginalMember(owner = "client!aj", name = "Hb", descriptor = "I")
	public static int anInt2977 = -1;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "(B)Z")
	public static boolean method2355() {
		if (Static282.aBoolean65) {
			try {
				return !((Boolean) Static304.method1290(Static199.aClass17_3.anApplet1, "showingVideoAd"));
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Lclient!re;")
	public static Class141 method2357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass141_1;
	}
}
