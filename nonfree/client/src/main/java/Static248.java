import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
	public static int anInt2367 = 0;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_30 = new Class37();

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!im;")
	public static final Class140 aClass140_42 = new Class140(113, 5);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!gaa;IILjava/lang/String;)Lclient!jr;")
	public static Class157 method1989(@OriginalArg(0) Class102 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method2385(arg2);
		}
		@Pc(41) Class157 local41;
		if (arg1 == 1) {
			try {
				Static557.method5217(arg0.anApplet1, "openjs", new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() });
				local41 = new Class157();
				local41.anInt4742 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class157();
				local41.anInt4742 = 2;
				return local41;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local41 = new Class157();
				local41.anInt4742 = 1;
				return local41;
			} catch (@Pc(81) Exception local81) {
				local41 = new Class157();
				local41.anInt4742 = 2;
				return local41;
			}
		} else if (arg1 == 3) {
			try {
				Static557.method5219("loggedout", arg0.anApplet1);
			} catch (@Pc(101) Throwable local101) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local41 = new Class157();
				local41.anInt4742 = 1;
				return local41;
			} catch (@Pc(123) Exception local123) {
				local41 = new Class157();
				local41.anInt4742 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
