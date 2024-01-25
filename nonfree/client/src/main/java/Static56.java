import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "[Lclient!wt;")
	public static Class365[] aClass365Array1;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
	public static int[] anIntArray43 = new int[2];

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)Lclient!kt;")
	public static Class3_Sub33 method1375() {
		if (Static157.aClass244_22 == null || Static126.aClass85_1 == null) {
			return null;
		}
		for (@Pc(16) Class3_Sub33 local16 = (Class3_Sub33) Static126.aClass85_1.method2286(); local16 != null; local16 = (Class3_Sub33) Static126.aClass85_1.method2286()) {
			@Pc(29) Class338 local29 = Static157.aClass189_2.method4642(local16.anInt5496);
			if (local29 != null && local29.aBoolean645 && local29.method7661(Static157.anInterface7_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!k;Ljava/lang/String;ZI)Lclient!sw;")
	public static Class309 method1376(@OriginalArg(0) Class168 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg0.method4086(arg1);
		}
		@Pc(46) Class309 local46;
		if (arg2 == 1) {
			try {
				Static600.method2905(Static304.anApplet1, "openjs", new Object[] { (new URL(Static304.anApplet1.getCodeBase(), arg1)).toString() });
				local46 = new Class309();
				local46.anInt8650 = 1;
				return local46;
			} catch (@Pc(52) Throwable local52) {
				local46 = new Class309();
				local46.anInt8650 = 2;
				return local46;
			}
		} else if (arg2 == 2) {
			try {
				Static304.anApplet1.getAppletContext().showDocument(new URL(Static304.anApplet1.getCodeBase(), arg1), "_blank");
				local46 = new Class309();
				local46.anInt8650 = 1;
				return local46;
			} catch (@Pc(84) Exception local84) {
				local46 = new Class309();
				local46.anInt8650 = 2;
				return local46;
			}
		} else if (arg2 == 3) {
			try {
				Static600.method2906("loggedout", Static304.anApplet1);
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				Static304.anApplet1.getAppletContext().showDocument(new URL(Static304.anApplet1.getCodeBase(), arg1), "_top");
				local46 = new Class309();
				local46.anInt8650 = 1;
				return local46;
			} catch (@Pc(123) Exception local123) {
				local46 = new Class309();
				local46.anInt8650 = 2;
				return local46;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ss;IIFFBIFFFI)[B")
	public static byte[] method1377(@OriginalArg(0) Class267 arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static190.method3341(arg4, arg0, 0, arg1, arg5, arg2, arg3, local10);
		return local10;
	}
}
