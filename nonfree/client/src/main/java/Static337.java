import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
	public static int anInt6637;

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
	public static int anInt6641;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;BILclient!gh;)Lclient!sb;")
	public static Class301 method5440(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class118 arg2) {
		if (arg1 == 0) {
			return arg2.method3407(arg0);
		}
		@Pc(37) Class301 local37;
		if (arg1 == 1) {
			try {
				Static646.method1437("openjs", Static152.anApplet1, new Object[] { (new URL(Static152.anApplet1.getCodeBase(), arg0)).toString() });
				local37 = new Class301();
				local37.anInt8915 = 1;
				return local37;
			} catch (@Pc(43) Throwable local43) {
				local37 = new Class301();
				local37.anInt8915 = 2;
				return local37;
			}
		} else if (arg1 == 2) {
			try {
				Static152.anApplet1.getAppletContext().showDocument(new URL(Static152.anApplet1.getCodeBase(), arg0), "_blank");
				local37 = new Class301();
				local37.anInt8915 = 1;
				return local37;
			} catch (@Pc(77) Exception local77) {
				local37 = new Class301();
				local37.anInt8915 = 2;
				return local37;
			}
		} else if (arg1 == 3) {
			try {
				Static646.method1435("loggedout", Static152.anApplet1);
			} catch (@Pc(106) Throwable local106) {
			}
			@Pc(120) Class301 local120;
			try {
				Static152.anApplet1.getAppletContext().showDocument(new URL(Static152.anApplet1.getCodeBase(), arg0), "_top");
				local120 = new Class301();
				local120.anInt8915 = 1;
				return local120;
			} catch (@Pc(126) Exception local126) {
				local120 = new Class301();
				local120.anInt8915 = 2;
				return local120;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
