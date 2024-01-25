import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "Lclient!si;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILjava/lang/String;Lclient!bd;)Lclient!id;")
	public static Class99 method1090(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class21 arg2) {
		if (arg0 == 0) {
			return arg2.method390(arg1);
		}
		@Pc(41) Class99 local41;
		if (arg0 == 1) {
			try {
				Static362.method3352(arg2.anApplet1, new Object[] { (new URL(arg2.anApplet1.getCodeBase(), arg1)).toString() }, "openjs");
				local41 = new Class99();
				local41.anInt2836 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class99();
				local41.anInt2836 = 2;
				return local41;
			}
		} else if (arg0 == 2) {
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg1), "_blank");
				local41 = new Class99();
				local41.anInt2836 = 1;
				return local41;
			} catch (@Pc(81) Exception local81) {
				local41 = new Class99();
				local41.anInt2836 = 2;
				return local41;
			}
		} else if (arg0 == 3) {
			try {
				Static362.method3353("loggedout", arg2.anApplet1);
			} catch (@Pc(101) Throwable local101) {
			}
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg1), "_top");
				local41 = new Class99();
				local41.anInt2836 = 1;
				return local41;
			} catch (@Pc(123) Exception local123) {
				local41 = new Class99();
				local41.anInt2836 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)V")
	public static void method1091(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static306.aFloat50 = 3.0F;
		} else if (arg0 == 50) {
			Static306.aFloat50 = 4.0F;
		} else if (arg0 == 75) {
			Static306.aFloat50 = 6.0F;
		} else if (arg0 == 100) {
			Static306.aFloat50 = 8.0F;
		} else if (arg0 == 200) {
			Static306.aFloat50 = 16.0F;
		}
		Static142.anInt3109 = -1;
		Static142.anInt3109 = -1;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)I")
	public static int method1092(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;ZLjava/lang/String;)V")
	public static void method1093(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4) {
		Static338.method5381(arg3, arg4, arg2, arg0, arg1, null, -1);
	}
}
