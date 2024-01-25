import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "Lclient!pca;")
	public static Class156 aClass156_1;

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "[I")
	public static int[] anIntArray661;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "Lclient!fda;")
	public static final Class93 aClass93_13 = new Class93(1);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLclient!n;Ljava/lang/String;I)Lclient!kp;")
	public static Class192 method7493(@OriginalArg(1) Class221 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg0.method5207(arg1);
		}
		@Pc(42) Class192 local42;
		if (arg2 == 1) {
			try {
				Static605.method6791(new Object[] { (new URL(Static533.anApplet4.getCodeBase(), arg1)).toString() }, "openjs", Static533.anApplet4);
				local42 = new Class192();
				local42.anInt5186 = 1;
				return local42;
			} catch (@Pc(48) Throwable local48) {
				local42 = new Class192();
				local42.anInt5186 = 2;
				return local42;
			}
		} else if (arg2 == 2) {
			try {
				Static533.anApplet4.getAppletContext().showDocument(new URL(Static533.anApplet4.getCodeBase(), arg1), "_blank");
				local42 = new Class192();
				local42.anInt5186 = 1;
				return local42;
			} catch (@Pc(82) Exception local82) {
				local42 = new Class192();
				local42.anInt5186 = 2;
				return local42;
			}
		} else if (arg2 == 3) {
			try {
				Static605.method6792("loggedout", Static533.anApplet4);
			} catch (@Pc(101) Throwable local101) {
			}
			try {
				Static533.anApplet4.getAppletContext().showDocument(new URL(Static533.anApplet4.getCodeBase(), arg1), "_top");
				local42 = new Class192();
				local42.anInt5186 = 1;
				return local42;
			} catch (@Pc(121) Exception local121) {
				local42 = new Class192();
				local42.anInt5186 = 2;
				return local42;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/lang/String;B)I")
	public static int method7494(@OriginalArg(1) String arg0) {
		return Static25.method461(16, arg0);
	}
}
