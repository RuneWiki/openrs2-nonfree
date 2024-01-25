import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "Lclient!qg;")
	public static Class87 aClass87_23;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_45 = new Class44(8);

	@OriginalMember(owner = "client!qs", name = "z", descriptor = "[I")
	public static final int[] anIntArray386 = new int[3];

	@OriginalMember(owner = "client!qs", name = "A", descriptor = "[F")
	public static final float[] aFloatArray19 = new float[4];

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!qn;ILjava/lang/String;)Lclient!it;")
	public static Class122 method4776(@OriginalArg(1) Class209 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method4681(arg2);
		}
		@Pc(49) Class122 local49;
		if (arg1 == 1) {
			try {
				Static456.method3807(arg0.anApplet1, "openjs", new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() });
				local49 = new Class122();
				local49.anInt3557 = 1;
				return local49;
			} catch (@Pc(55) Throwable local55) {
				local49 = new Class122();
				local49.anInt3557 = 2;
				return local49;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local49 = new Class122();
				local49.anInt3557 = 1;
				return local49;
			} catch (@Pc(91) Exception local91) {
				local49 = new Class122();
				local49.anInt3557 = 2;
				return local49;
			}
		} else if (arg1 == 3) {
			try {
				Static456.method3806("loggedout", arg0.anApplet1);
			} catch (@Pc(113) Throwable local113) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local49 = new Class122();
				local49.anInt3557 = 1;
				return local49;
			} catch (@Pc(135) Exception local135) {
				local49 = new Class122();
				local49.anInt3557 = 2;
				return local49;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
