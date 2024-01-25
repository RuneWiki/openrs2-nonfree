import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	public static int anInt2146;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "[S")
	public static short[] aShortArray30;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
	public static int anInt2152;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;Lclient!pc;II)Lclient!cw;")
	public static Class45 method1702(@OriginalArg(0) String arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method3913(arg0);
		}
		@Pc(36) Class45 local36;
		if (arg2 == 1) {
			try {
				Static467.method6001(new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg0)).toString() }, "openjs", arg1.anApplet1);
				local36 = new Class45();
				local36.anInt1129 = 1;
				return local36;
			} catch (@Pc(42) Throwable local42) {
				local36 = new Class45();
				local36.anInt1129 = 2;
				return local36;
			}
		} else if (arg2 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_blank");
				local36 = new Class45();
				local36.anInt1129 = 1;
				return local36;
			} catch (@Pc(76) Exception local76) {
				local36 = new Class45();
				local36.anInt1129 = 2;
				return local36;
			}
		} else if (arg2 == 3) {
			try {
				Static467.method6000("loggedout", arg1.anApplet1);
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_top");
				local36 = new Class45();
				local36.anInt1129 = 1;
				return local36;
			} catch (@Pc(125) Exception local125) {
				local36 = new Class45();
				local36.anInt1129 = 2;
				return local36;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)Lclient!ui;")
	public static Class4_Sub2_Sub17 method1709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub2_Sub17 local15 = (Class4_Sub2_Sub17) Static66.aClass67_5.method1429((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new Class4_Sub2_Sub17(arg0, arg1);
			Static66.aClass67_5.method1426(local15, local15.aLong227);
		}
		return local15;
	}
}
