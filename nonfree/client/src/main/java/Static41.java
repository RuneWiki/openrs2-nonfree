import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;BLclient!qg;I)Lclient!sq;")
	public static Class319 method926(@OriginalArg(0) String arg0, @OriginalArg(2) Class286 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method6583(arg0);
		}
		@Pc(41) Class319 local41;
		if (arg2 == 1) {
			try {
				Static655.method4697(new Object[] { (new URL(Static107.anApplet1.getCodeBase(), arg0)).toString() }, "openjs", Static107.anApplet1);
				local41 = new Class319();
				local41.anInt8562 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class319();
				local41.anInt8562 = 2;
				return local41;
			}
		} else if (arg2 == 2) {
			try {
				Static107.anApplet1.getAppletContext().showDocument(new URL(Static107.anApplet1.getCodeBase(), arg0), "_blank");
				local41 = new Class319();
				local41.anInt8562 = 1;
				return local41;
			} catch (@Pc(81) Exception local81) {
				local41 = new Class319();
				local41.anInt8562 = 2;
				return local41;
			}
		} else if (arg2 == 3) {
			try {
				Static655.method4698("loggedout", Static107.anApplet1);
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				Static107.anApplet1.getAppletContext().showDocument(new URL(Static107.anApplet1.getCodeBase(), arg0), "_top");
				local41 = new Class319();
				local41.anInt8562 = 1;
				return local41;
			} catch (@Pc(120) Exception local120) {
				local41 = new Class319();
				local41.anInt8562 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
