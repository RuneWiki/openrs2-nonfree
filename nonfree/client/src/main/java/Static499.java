import java.awt.Rectangle;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
	public static int anInt7885;

	@OriginalMember(owner = "client!qp", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString95;

	@OriginalMember(owner = "client!qp", name = "G", descriptor = "Z")
	public static boolean aBoolean550 = false;

	@OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
	public static int anInt7887 = 0;

	@OriginalMember(owner = "client!qp", name = "L", descriptor = "Lclient!kw;")
	public static final Class203 aClass203_8 = new Class203("stellardawn", 1);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V")
	public static void method6547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static514.anInt8102; local3++) {
			@Pc(9) Rectangle local9 = Class167_Sub2.aRectangleArray2[local3];
			if (arg1 < local9.x + local9.width && arg2 + arg1 > local9.x && local9.y + local9.height > arg3 && arg0 + arg3 > local9.y) {
				Static89.aBooleanArray7[local3] = true;
			}
		}
		Static63.method1147(arg3, arg1 + arg2, arg1, arg0 + arg3);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;ILclient!ec;I)Lclient!th;")
	public static Class338 method6549(@OriginalArg(0) String arg0, @OriginalArg(2) Class92 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method1881(arg0);
		}
		@Pc(39) Class338 local39;
		if (arg2 == 1) {
			try {
				Static680.method797(new Object[] { (new URL(Static339.anApplet2.getCodeBase(), arg0)).toString() }, "openjs", Static339.anApplet2);
				local39 = new Class338();
				local39.anInt9321 = 1;
				return local39;
			} catch (@Pc(45) Throwable local45) {
				local39 = new Class338();
				local39.anInt9321 = 2;
				return local39;
			}
		} else if (arg2 == 2) {
			try {
				Static339.anApplet2.getAppletContext().showDocument(new URL(Static339.anApplet2.getCodeBase(), arg0), "_blank");
				local39 = new Class338();
				local39.anInt9321 = 1;
				return local39;
			} catch (@Pc(79) Exception local79) {
				local39 = new Class338();
				local39.anInt9321 = 2;
				return local39;
			}
		} else if (arg2 == 3) {
			try {
				Static680.method795(Static339.anApplet2, "loggedout");
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				Static339.anApplet2.getAppletContext().showDocument(new URL(Static339.anApplet2.getCodeBase(), arg0), "_top");
				local39 = new Class338();
				local39.anInt9321 = 1;
				return local39;
			} catch (@Pc(120) Exception local120) {
				local39 = new Class338();
				local39.anInt9321 = 2;
				return local39;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
