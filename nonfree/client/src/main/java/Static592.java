import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
	public static int anInt9586;

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
	public static int anInt9588;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
	public static int anInt9585 = 765;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
	public static int anInt9587 = 1;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIII)V")
	public static void method7816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(9) int local9 = arg0; local9 <= arg3; local9++) {
			Static208.method3687(arg1, arg2, Static454.anIntArrayArray71[local9], arg4);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!wv;II)V")
	public static void method7817(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray519 == null) {
			return;
		}
		@Pc(17) int local17 = arg0.anIntArray519[arg1 + 1];
		if (local17 == arg0.anInt7085) {
			return;
		}
		arg0.anInt7112 = 0;
		arg0.anInt7054 = 0;
		arg0.anInt7101 = 1;
		arg0.anInt7085 = local17;
		arg0.anInt7121 = 0;
		arg0.anInt7133 = arg0.anInt7132;
		if (arg0.anInt7085 != -1) {
			Static520.method6532(arg0.aByte108, Static78.aClass298_2.method6521(arg0.anInt7085), Static328.aClass4_Sub1_Sub1_Sub2_2 == arg0, arg0.anInt9542, arg0.anInt7112, arg0.anInt9540);
			return;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7819(@OriginalArg(0) String arg0) {
		Static110.aString17 = arg0;
		if (Static249.anApplet1 == null) {
			return;
		}
		try {
			@Pc(17) String local17 = Static249.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static249.anApplet1.getParameter("cookiehost");
			@Pc(36) String local36 = local17 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static170.method3179(Static8.method201() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static608.method4637(Static249.anApplet1, "document.cookie=\"" + local36 + "\"");
		} catch (@Pc(86) Throwable local86) {
		}
	}
}
