import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ns", name = "ab", descriptor = "Lclient!dr;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!ns", name = "bb", descriptor = "Lclient!oj;")
	public static Class13 aClass13_4;

	@OriginalMember(owner = "client!ns", name = "V", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_154 = new Class221("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!ns", name = "Z", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_119 = new Class77(90, 0);

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(BI)V")
	public static void method3925(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg0, 3);
		local8.method412();
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(IB)Z")
	public static boolean method3927(@OriginalArg(0) int arg0) {
		@Pc(7) Class141_Sub1 local7 = Static106.method1856(arg0);
		if (local7 == null) {
			return false;
		} else if (Static65.anInt1255 == 3) {
			@Pc(38) String local38 = "";
			if (Static91.aClass143_12 != Static337.aClass143_27) {
				local38 = ":" + (local7.anInt6672 + 7000);
			}
			@Pc(54) String local54 = "";
			if (Static209.aString33 != null) {
				local54 = "/p=" + Static209.aString33;
			}
			@Pc(111) String local111 = "http://" + local7.aString63 + local38 + "/l=" + Static189.anInt5185 + "/a=" + Static277.anInt2677 + local54 + "/j" + (Static374.aBoolean489 ? "1" : "0") + ",o" + (Static214.aBoolean295 ? "1" : "0") + ",a2";
			try {
				Static384.aClient1.getAppletContext().showDocument(new URL(local111), "_self");
				return true;
			} catch (@Pc(121) Exception local121) {
				return false;
			}
		} else {
			Static259.anInt4618 = local7.anInt6672;
			Static329.aString57 = local7.aString63;
			if (Static337.aClass143_27 != Static91.aClass143_12) {
				Static33.anInt704 = Static259.anInt4618 + 40000;
				Static230.anInt4259 = Static259.anInt4618 + 50000;
				Static225.anInt4195 = Static33.anInt704;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)I")
	public static int method3929() {
		@Pc(13) Class154 local13 = Static329.aClass154_48;
		synchronized (Static329.aClass154_48) {
			return Static329.aClass154_48.method3744();
		}
	}
}
