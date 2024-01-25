import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "[I")
	public static int[] anIntArray683;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "[I")
	public static final int[] anIntArray684 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/lang/String;Lclient!rj;I)Lclient!vfa;")
	public static Class347 method7928(@OriginalArg(1) String arg0, @OriginalArg(2) Class287 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method6539(arg0);
		}
		@Pc(34) Class347 local34;
		if (arg2 == 1) {
			try {
				Static602.method6576(Static562.anApplet2, "openjs", new Object[] { (new URL(Static562.anApplet2.getCodeBase(), arg0)).toString() });
				local34 = new Class347();
				local34.anInt9172 = 1;
				return local34;
			} catch (@Pc(40) Throwable local40) {
				local34 = new Class347();
				local34.anInt9172 = 2;
				return local34;
			}
		} else if (arg2 == 2) {
			try {
				Static562.anApplet2.getAppletContext().showDocument(new URL(Static562.anApplet2.getCodeBase(), arg0), "_blank");
				local34 = new Class347();
				local34.anInt9172 = 1;
				return local34;
			} catch (@Pc(72) Exception local72) {
				local34 = new Class347();
				local34.anInt9172 = 2;
				return local34;
			}
		} else if (arg2 == 3) {
			try {
				Static602.method6577("loggedout", Static562.anApplet2);
			} catch (@Pc(91) Throwable local91) {
			}
			try {
				Static562.anApplet2.getAppletContext().showDocument(new URL(Static562.anApplet2.getCodeBase(), arg0), "_top");
				local34 = new Class347();
				local34.anInt9172 = 1;
				return local34;
			} catch (@Pc(111) Exception local111) {
				local34 = new Class347();
				local34.anInt9172 = 2;
				return local34;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)Z")
	public static boolean method7929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static434.aClass68_3.method6467(arg2, arg1, arg0, Static427.anIntArray497);
		@Pc(22) int local22 = Static427.anIntArray497[2];
		if (local22 < 50) {
			return false;
		} else {
			Static427.anIntArray497[1] = Static47.anInt1133 * Static427.anIntArray497[1] / local22 + Static101.anInt2055;
			Static427.anIntArray497[2] = local22;
			Static427.anIntArray497[0] = Static51.anInt1261 * Static427.anIntArray497[0] / local22 + Static230.anInt4316;
			return true;
		}
	}
}
