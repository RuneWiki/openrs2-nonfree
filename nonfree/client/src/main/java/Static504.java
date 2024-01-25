import java.awt.Font;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!uf;IILjava/lang/String;)Lclient!bca;")
	public static Class20 method7418(@OriginalArg(0) Class283 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method7186(arg2);
		}
		@Pc(43) Class20 local43;
		if (arg1 == 1) {
			try {
				Static559.method6633(arg0.anApplet1, "openjs", new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() });
				local43 = new Class20();
				local43.anInt593 = 1;
				return local43;
			} catch (@Pc(49) Throwable local49) {
				local43 = new Class20();
				local43.anInt593 = 2;
				return local43;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local43 = new Class20();
				local43.anInt593 = 1;
				return local43;
			} catch (@Pc(85) Exception local85) {
				local43 = new Class20();
				local43.anInt593 = 2;
				return local43;
			}
		} else if (arg1 == 3) {
			try {
				Static559.method6631("loggedout", arg0.anApplet1);
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local43 = new Class20();
				local43.anInt593 = 1;
				return local43;
			} catch (@Pc(127) Exception local127) {
				local43 = new Class20();
				local43.anInt593 = 2;
				return local43;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
