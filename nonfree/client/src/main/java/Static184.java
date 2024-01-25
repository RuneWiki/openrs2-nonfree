import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	public static int anInt4052;

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
	public static int anInt4058;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
	public static int anInt4055 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBLjava/lang/String;Lclient!lh;)Lclient!dj;")
	public static Class51 method3415(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class120 arg2) {
		if (arg0 == 0) {
			return arg2.method3221(arg1);
		}
		@Pc(36) Class51 local36;
		if (arg0 == 1) {
			try {
				Static369.method5672(new Object[] { (new URL(arg2.anApplet1.getCodeBase(), arg1)).toString() }, "openjs", arg2.anApplet1);
				local36 = new Class51();
				local36.anInt1229 = 1;
				return local36;
			} catch (@Pc(42) Throwable local42) {
				local36 = new Class51();
				local36.anInt1229 = 2;
				return local36;
			}
		} else if (arg0 == 2) {
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg1), "_blank");
				local36 = new Class51();
				local36.anInt1229 = 1;
				return local36;
			} catch (@Pc(83) Exception local83) {
				local36 = new Class51();
				local36.anInt1229 = 2;
				return local36;
			}
		} else if (arg0 == 3) {
			try {
				Static369.method5674(arg2.anApplet1, "loggedout");
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg1), "_top");
				local36 = new Class51();
				local36.anInt1229 = 1;
				return local36;
			} catch (@Pc(125) Exception local125) {
				local36 = new Class51();
				local36.anInt1229 = 2;
				return local36;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
	public static boolean method3416(@OriginalArg(0) int arg0) {
		if (arg0 == 28 || arg0 == 34 || arg0 == 39 || arg0 == 6 || arg0 == 57) {
			return true;
		} else if (arg0 == 29 || arg0 == 60 || arg0 == 1003) {
			return true;
		} else if (arg0 == 15 || arg0 == 32 || arg0 == 5 || arg0 == 13 || arg0 == 1) {
			return true;
		} else {
			return arg0 == 51 || arg0 == 59 || arg0 == 1001 || arg0 == 16;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!am;Lclient!bf;Lclient!am;I)V")
	public static void method3417(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) Class11 arg2) {
		Static310.aClass11_139 = arg0;
		Static301.aClass11_133 = arg2;
		Static352.anInterface2_3 = arg1;
		if (Static310.aClass11_139 != null) {
			Static279.anInt5651 = Static310.aClass11_139.method292(1);
		}
		if (Static301.aClass11_133 != null) {
			Static306.anInt6194 = Static301.aClass11_133.method292(1);
		}
	}
}
