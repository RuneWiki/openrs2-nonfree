import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!st", name = "l", descriptor = "I")
	public static int anInt6292;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "I")
	public static int anInt6288 = 0;

	@OriginalMember(owner = "client!st", name = "m", descriptor = "I")
	public static int anInt6293 = 0;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IILjava/lang/String;Lclient!ji;)Lclient!rm;")
	public static Class215 method4826(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class124 arg2) {
		if (arg0 == 0) {
			return arg2.method2531(arg1);
		}
		@Pc(52) Class215 local52;
		if (arg0 == 1) {
			try {
				Static460.method3421(new Object[] { (new URL(arg2.anApplet1.getCodeBase(), arg1)).toString() }, arg2.anApplet1, "openjs");
				local52 = new Class215();
				local52.anInt5791 = 1;
				return local52;
			} catch (@Pc(58) Throwable local58) {
				local52 = new Class215();
				local52.anInt5791 = 2;
				return local52;
			}
		} else if (arg0 == 2) {
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg1), "_blank");
				local52 = new Class215();
				local52.anInt5791 = 1;
				return local52;
			} catch (@Pc(94) Exception local94) {
				local52 = new Class215();
				local52.anInt5791 = 2;
				return local52;
			}
		} else if (arg0 == 3) {
			try {
				Static460.method3422("loggedout", arg2.anApplet1);
			} catch (@Pc(116) Throwable local116) {
			}
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg1), "_top");
				local52 = new Class215();
				local52.anInt5791 = 1;
				return local52;
			} catch (@Pc(138) Exception local138) {
				local52 = new Class215();
				local52.anInt5791 = 2;
				return local52;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)I")
	public static int method4833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static414.method5161(arg1 + 45365, 4, arg0 + 91923) + (Static414.method5161(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static414.method5161(arg1, 1, arg0) - 128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}
}
