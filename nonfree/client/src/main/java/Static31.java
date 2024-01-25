import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bba", name = "s", descriptor = "Lclient!ag;")
	public static final Class8 aClass8_1 = new Class8(3, 2);

	@OriginalMember(owner = "client!bba", name = "J", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZLclient!wu;IJIII)V")
	public static void method572(@OriginalArg(1) Class380 arg0, @OriginalArg(3) long arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static642.method8604(arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IILclient!mr;Ljava/lang/String;)Lclient!fg;")
	public static Class108 method573(@OriginalArg(1) int arg0, @OriginalArg(2) Class226 arg1, @OriginalArg(3) String arg2) {
		if (arg0 == 0) {
			return arg1.method4852(arg2);
		}
		@Pc(39) Class108 local39;
		if (arg0 == 1) {
			try {
				Static651.method4294(Static617.anApplet2, new Object[] { (new URL(Static617.anApplet2.getCodeBase(), arg2)).toString() }, "openjs");
				local39 = new Class108();
				local39.anInt2766 = 1;
				return local39;
			} catch (@Pc(45) Throwable local45) {
				local39 = new Class108();
				local39.anInt2766 = 2;
				return local39;
			}
		} else if (arg0 == 2) {
			try {
				Static617.anApplet2.getAppletContext().showDocument(new URL(Static617.anApplet2.getCodeBase(), arg2), "_blank");
				local39 = new Class108();
				local39.anInt2766 = 1;
				return local39;
			} catch (@Pc(79) Exception local79) {
				local39 = new Class108();
				local39.anInt2766 = 2;
				return local39;
			}
		} else if (arg0 == 3) {
			try {
				Static651.method4296("loggedout", Static617.anApplet2);
			} catch (@Pc(104) Throwable local104) {
			}
			try {
				Static617.anApplet2.getAppletContext().showDocument(new URL(Static617.anApplet2.getCodeBase(), arg2), "_top");
				local39 = new Class108();
				local39.anInt2766 = 1;
				return local39;
			} catch (@Pc(124) Exception local124) {
				local39 = new Class108();
				local39.anInt2766 = 2;
				return local39;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
