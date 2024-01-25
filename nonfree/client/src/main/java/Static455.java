import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!re", name = "F", descriptor = "I")
	public static int anInt7670 = -1;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)I")
	public static int method6388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(20) int local20 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local20;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!pi;IILjava/lang/String;)Lclient!bp;")
	public static Class39 method6390(@OriginalArg(0) Class258 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method5878(arg2);
		}
		@Pc(41) Class39 local41;
		if (arg1 == 1) {
			try {
				Static600.method2615(new Object[] { (new URL(Static31.anApplet1.getCodeBase(), arg2)).toString() }, Static31.anApplet1, "openjs");
				local41 = new Class39();
				local41.anInt894 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class39();
				local41.anInt894 = 2;
				return local41;
			}
		} else if (arg1 == 2) {
			try {
				Static31.anApplet1.getAppletContext().showDocument(new URL(Static31.anApplet1.getCodeBase(), arg2), "_blank");
				local41 = new Class39();
				local41.anInt894 = 1;
				return local41;
			} catch (@Pc(79) Exception local79) {
				local41 = new Class39();
				local41.anInt894 = 2;
				return local41;
			}
		} else if (arg1 == 3) {
			try {
				Static600.method2617("loggedout", Static31.anApplet1);
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				Static31.anApplet1.getAppletContext().showDocument(new URL(Static31.anApplet1.getCodeBase(), arg2), "_top");
				local41 = new Class39();
				local41.anInt894 = 1;
				return local41;
			} catch (@Pc(120) Exception local120) {
				local41 = new Class39();
				local41.anInt894 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
