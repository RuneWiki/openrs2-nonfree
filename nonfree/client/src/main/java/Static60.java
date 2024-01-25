import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
	public static int anInt1289 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(CI)Z")
	public static boolean method1078(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILjava/lang/String;Lclient!ge;I)Lclient!tj;")
	public static Class328 method1079(@OriginalArg(1) String arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method3240(arg0);
		}
		@Pc(39) Class328 local39;
		if (arg2 == 1) {
			try {
				Static654.method5165(new Object[] { (new URL(Static42.anApplet1.getCodeBase(), arg0)).toString() }, "openjs", Static42.anApplet1);
				local39 = new Class328();
				local39.anInt9389 = 1;
				return local39;
			} catch (@Pc(45) Throwable local45) {
				local39 = new Class328();
				local39.anInt9389 = 2;
				return local39;
			}
		} else if (arg2 == 2) {
			try {
				Static42.anApplet1.getAppletContext().showDocument(new URL(Static42.anApplet1.getCodeBase(), arg0), "_blank");
				local39 = new Class328();
				local39.anInt9389 = 1;
				return local39;
			} catch (@Pc(79) Exception local79) {
				local39 = new Class328();
				local39.anInt9389 = 2;
				return local39;
			}
		} else if (arg2 == 3) {
			try {
				Static654.method5164(Static42.anApplet1, "loggedout");
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				Static42.anApplet1.getAppletContext().showDocument(new URL(Static42.anApplet1.getCodeBase(), arg0), "_top");
				local39 = new Class328();
				local39.anInt9389 = 1;
				return local39;
			} catch (@Pc(120) Exception local120) {
				local39 = new Class328();
				local39.anInt9389 = 2;
				return local39;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)V")
	public static void method1080() {
		if (Static529.aClass112_6.aBoolean263 && Static561.aClass56_5.anInt1712 != -1) {
			Static470.method7121(Static561.aClass56_5.anInt1712, Static561.aClass56_5.aString17);
		}
	}
}
