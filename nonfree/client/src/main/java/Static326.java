import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "[I")
	public static int[] anIntArray521;

	@OriginalMember(owner = "client!so", name = "C", descriptor = "[Lclient!mn;")
	public static Class153[] aClass153Array2;

	@OriginalMember(owner = "client!so", name = "D", descriptor = "[I")
	public static final int[] anIntArray523 = new int[4096];

	@OriginalMember(owner = "client!so", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString57 = null;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/String;Lclient!kd;II)Lclient!gj;")
	public static Class86 method5242(@OriginalArg(0) String arg0, @OriginalArg(1) Class123 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return arg1.method3256(arg0);
		}
		@Pc(43) Class86 local43;
		if (arg2 == 1) {
			try {
				Static406.method5997(new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg0)).toString() }, "openjs", arg1.anApplet1);
				local43 = new Class86();
				local43.anInt2590 = 1;
				return local43;
			} catch (@Pc(49) Throwable local49) {
				local43 = new Class86();
				local43.anInt2590 = 2;
				return local43;
			}
		} else if (arg2 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_blank");
				local43 = new Class86();
				local43.anInt2590 = 1;
				return local43;
			} catch (@Pc(83) Exception local83) {
				local43 = new Class86();
				local43.anInt2590 = 2;
				return local43;
			}
		} else if (arg2 == 3) {
			try {
				Static406.method5995(arg1.anApplet1, "loggedout");
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_top");
				local43 = new Class86();
				local43.anInt2590 = 1;
				return local43;
			} catch (@Pc(127) Exception local127) {
				local43 = new Class86();
				local43.anInt2590 = 2;
				return local43;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!g;Lclient!g;I)V")
	public static void method5248(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1) {
		Static257.aClass83_89 = arg0;
		Static102.aClass83_49 = arg1;
	}
}
