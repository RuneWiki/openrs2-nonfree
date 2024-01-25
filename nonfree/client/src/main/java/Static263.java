import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "[Lclient!bj;")
	public static Class20_Sub1_Sub1_Sub1[] aClass20_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "Lclient!cj;")
	public static Interface2 anInterface2_5;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "[[S")
	public static short[][] aShortArrayArray46;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
	public static int anInt4786 = 0;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "[I")
	public static final int[] anIntArray530 = new int[50];

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "Z")
	public static boolean aBoolean339 = true;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4433(@OriginalArg(1) String arg0) {
		Static106.aString74 = arg0;
		if (Static308.aClass206_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static308.aClass206_5.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static308.aClass206_5.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static271.method4598(Static245.method4300() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static365.method3243("document.cookie=\"" + local34 + "\"", Static308.aClass206_5.anApplet1);
		} catch (@Pc(86) Throwable local86) {
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!dp;I)V")
	public static void method4434(@OriginalArg(0) Class53 arg0) {
		Static154.aClass53_87 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!ec;II)V")
	public static void method4435(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (Static207.aClass174_2 == null) {
			return;
		}
		try {
			Static207.aClass174_2.method4530(0L);
			Static207.aClass174_2.method4532(arg0.aByteArray67, 24, arg1);
		} catch (@Pc(20) Exception local20) {
		}
	}
}
