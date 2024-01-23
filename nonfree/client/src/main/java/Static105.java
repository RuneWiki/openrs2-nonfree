import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!hl", name = "U", descriptor = "[Lclient!in;")
	public static Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array7;

	@OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
	public static int anInt2016;

	@OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
	public static int anInt2010 = 0;

	@OriginalMember(owner = "client!hl", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString77 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!hl", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString78 = null;

	@OriginalMember(owner = "client!hl", name = "X", descriptor = "I")
	public static int anInt2015 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(CB)Z")
	public static boolean method1694(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;ZLclient!ph;)Lclient!to;")
	public static Class172 method1695(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class138 arg2) {
		@Pc(10) int local10 = arg2.method3331(arg0);
		if (local10 == -1) {
			return new Class172(0);
		}
		@Pc(25) int[] local25 = arg2.method3334(local10);
		@Pc(31) Class172 local31 = new Class172(local25.length);
		@Pc(33) int local33 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local31.anInt5300 > local33) {
				@Pc(57) Class1_Sub14 local57 = new Class1_Sub14(arg2.method3346(local10, local25[local41++]));
				@Pc(61) int local61 = local57.method2647();
				@Pc(65) int local65 = local57.method2593();
				@Pc(69) int local69 = local57.method2595();
				if (!arg1 && local69 == 1) {
					local31.anInt5300--;
				} else {
					local31.anIntArray489[local33] = local61;
					local31.aClass1_Sub1_Sub10Array1[local33] = new Class1_Sub1_Sub10();
					local31.aClass1_Sub1_Sub10Array1[local33].anInt1638 = local65;
					local33++;
				}
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1696(@OriginalArg(0) String arg0) {
		Static198.aString134 = arg0;
		if (Static117.aClass117_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static117.aClass117_3.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static117.aClass117_3.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static35.method602(Static135.method2186() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static324.method4225("document.cookie=\"" + local34 + "\"", Static117.aClass117_3.anApplet1);
		} catch (@Pc(94) Throwable local94) {
		}
	}

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "(I)V")
	public static void method1698() {
		Static240.aClass169_51.method4014();
	}
}
