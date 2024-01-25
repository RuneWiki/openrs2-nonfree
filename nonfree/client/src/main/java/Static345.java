import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
	public static int anInt6662;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILjava/lang/String;ILclient!wd;)Lclient!nga;")
	public static Class234 method5588(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class354 arg2) {
		if (arg0 == 0) {
			return arg2.method8232(arg1);
		}
		@Pc(44) Class234 local44;
		if (arg0 == 1) {
			try {
				Static604.method8249(Static110.anApplet1, "openjs", new Object[] { (new URL(Static110.anApplet1.getCodeBase(), arg1)).toString() });
				local44 = new Class234();
				local44.anInt6717 = 1;
				return local44;
			} catch (@Pc(50) Throwable local50) {
				local44 = new Class234();
				local44.anInt6717 = 2;
				return local44;
			}
		} else if (arg0 == 2) {
			try {
				Static110.anApplet1.getAppletContext().showDocument(new URL(Static110.anApplet1.getCodeBase(), arg1), "_blank");
				local44 = new Class234();
				local44.anInt6717 = 1;
				return local44;
			} catch (@Pc(82) Exception local82) {
				local44 = new Class234();
				local44.anInt6717 = 2;
				return local44;
			}
		} else if (arg0 == 3) {
			try {
				Static604.method8248(Static110.anApplet1, "loggedout");
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				Static110.anApplet1.getAppletContext().showDocument(new URL(Static110.anApplet1.getCodeBase(), arg1), "_top");
				local44 = new Class234();
				local44.anInt6717 = 1;
				return local44;
			} catch (@Pc(123) Exception local123) {
				local44 = new Class234();
				local44.anInt6717 = 2;
				return local44;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BII)Z")
	public static boolean method5589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static232.method3741(arg0, arg1) || Static50.method667(arg1, arg0);
	}
}
