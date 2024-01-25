import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "Lclient!ie;")
	public static final Class112 aClass112_4 = new Class112("LIVE", 0);

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_66 = new Class179(77, 6);

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_67 = new Class179(16, 1);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;Lclient!od;BI)Lclient!am;")
	public static Class9 method4606(@OriginalArg(0) String arg0, @OriginalArg(1) Class180 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method4090(arg0);
		}
		@Pc(46) Class9 local46;
		if (arg2 == 1) {
			try {
				Static463.method2377("openjs", new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg0)).toString() }, arg1.anApplet1);
				local46 = new Class9();
				local46.anInt368 = 1;
				return local46;
			} catch (@Pc(52) Throwable local52) {
				local46 = new Class9();
				local46.anInt368 = 2;
				return local46;
			}
		} else if (arg2 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_blank");
				local46 = new Class9();
				local46.anInt368 = 1;
				return local46;
			} catch (@Pc(88) Exception local88) {
				local46 = new Class9();
				local46.anInt368 = 2;
				return local46;
			}
		} else if (arg2 == 3) {
			try {
				Static463.method2376("loggedout", arg1.anApplet1);
			} catch (@Pc(110) Throwable local110) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_top");
				local46 = new Class9();
				local46.anInt368 = 1;
				return local46;
			} catch (@Pc(132) Exception local132) {
				local46 = new Class9();
				local46.anInt368 = 2;
				return local46;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Z")
	public static boolean method4607(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}
}
