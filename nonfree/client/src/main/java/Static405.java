import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "Lclient!mfa;")
	public static Class211 aClass211_61 = new Class211();

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
	public static int anInt7594 = 0;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IILclient!pe;Ljava/lang/String;)Lclient!sba;")
	public static Class280 method6332(@OriginalArg(0) int arg0, @OriginalArg(2) Class246 arg1, @OriginalArg(3) String arg2) {
		if (arg0 == 0) {
			return arg1.method6147(arg2);
		}
		@Pc(41) Class280 local41;
		if (arg0 == 1) {
			try {
				Static590.method5697("openjs", new Object[] { (new URL(Static87.anApplet1.getCodeBase(), arg2)).toString() }, Static87.anApplet1);
				local41 = new Class280();
				local41.anInt8467 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class280();
				local41.anInt8467 = 2;
				return local41;
			}
		} else if (arg0 == 2) {
			try {
				Static87.anApplet1.getAppletContext().showDocument(new URL(Static87.anApplet1.getCodeBase(), arg2), "_blank");
				local41 = new Class280();
				local41.anInt8467 = 1;
				return local41;
			} catch (@Pc(81) Exception local81) {
				local41 = new Class280();
				local41.anInt8467 = 2;
				return local41;
			}
		} else if (arg0 == 3) {
			try {
				Static590.method5698("loggedout", Static87.anApplet1);
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				Static87.anApplet1.getAppletContext().showDocument(new URL(Static87.anApplet1.getCodeBase(), arg2), "_top");
				local41 = new Class280();
				local41.anInt8467 = 1;
				return local41;
			} catch (@Pc(125) Exception local125) {
				local41 = new Class280();
				local41.anInt8467 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
