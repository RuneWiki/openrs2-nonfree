import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
	public static int anInt9126;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;ILclient!ew;I)Lclient!ae;")
	public static Class5 method7304(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class99 arg2) {
		if (arg1 == 0) {
			return arg2.method1786(arg0);
		}
		@Pc(50) Class5 local50;
		if (arg1 == 1) {
			try {
				Static597.method3392(new Object[] { (new URL(Static195.anApplet4.getCodeBase(), arg0)).toString() }, "openjs", Static195.anApplet4);
				local50 = new Class5();
				local50.anInt151 = 1;
				return local50;
			} catch (@Pc(56) Throwable local56) {
				local50 = new Class5();
				local50.anInt151 = 2;
				return local50;
			}
		} else if (arg1 == 2) {
			try {
				Static195.anApplet4.getAppletContext().showDocument(new URL(Static195.anApplet4.getCodeBase(), arg0), "_blank");
				local50 = new Class5();
				local50.anInt151 = 1;
				return local50;
			} catch (@Pc(88) Exception local88) {
				local50 = new Class5();
				local50.anInt151 = 2;
				return local50;
			}
		} else if (arg1 == 3) {
			try {
				Static597.method3394("loggedout", Static195.anApplet4);
			} catch (@Pc(109) Throwable local109) {
			}
			try {
				Static195.anApplet4.getAppletContext().showDocument(new URL(Static195.anApplet4.getCodeBase(), arg0), "_top");
				local50 = new Class5();
				local50.anInt151 = 1;
				return local50;
			} catch (@Pc(129) Exception local129) {
				local50 = new Class5();
				local50.anInt151 = 2;
				return local50;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
