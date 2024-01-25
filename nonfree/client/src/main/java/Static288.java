import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_81 = new Class186(108, 2);

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_76 = new Class25(46, 3);

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
	public static int anInt4836 = 0;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_82 = new Class186(29, 8);

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IC)Z")
	public static boolean method4288(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static284.method4265(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static350.aCharArray7;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(51) char[] local51 = Static183.aCharArray6;
			for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
				@Pc(59) char local59 = local51[local53];
				if (arg0 == local59) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/lang/Object;Lclient!hf;)V")
	public static void method4289(@OriginalArg(1) Object arg0, @OriginalArg(2) Class103 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static170.method1617(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4290(@OriginalArg(1) String arg0) {
		Static300.aString70 = arg0;
		if (Static165.aClass103_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static165.aClass103_3.anApplet1.getParameter("cookieprefix");
			@Pc(26) String local26 = Static165.aClass103_3.anApplet1.getParameter("cookiehost");
			@Pc(41) String local41 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local26;
			if (arg0.length() == 0) {
				local41 = local41 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local41 = local41 + "; Expires=" + Static63.method1196(Static154.method2527() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static453.method335("document.cookie=\"" + local41 + "\"", Static165.aClass103_3.anApplet1);
		} catch (@Pc(93) Throwable local93) {
		}
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
	public static void method4291() {
		for (@Pc(18) Class48_Sub1 local18 = (Class48_Sub1) Static62.aClass128_2.method2831(); local18 != null; local18 = (Class48_Sub1) Static62.aClass128_2.method2832()) {
			local18.method1295();
		}
	}
}
