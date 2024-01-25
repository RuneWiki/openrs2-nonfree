import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "I")
	public static int anInt9401;

	@OriginalMember(owner = "client!tka", name = "d", descriptor = "[I")
	public static final int[] anIntArray611 = new int[2048];

	@OriginalMember(owner = "client!tka", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[100];

	@OriginalMember(owner = "client!tka", name = "c", descriptor = "I")
	public static int anInt9403 = -1;

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(ZI)Z")
	public static boolean method8211(@OriginalArg(0) boolean arg0) {
		@Pc(18) boolean local18 = Static202.aClass75_5.method6705();
		if (arg0 == local18) {
			return true;
		}
		if (!arg0) {
			Static202.aClass75_5.method6663();
		} else if (!Static202.aClass75_5.method6664()) {
			arg0 = false;
		}
		if (arg0 == local18) {
			return false;
		} else {
			Static687.aClass6_Sub44_33.method7080(arg0 ? 1 : 0, Static687.aClass6_Sub44_33.aClass7_Sub17_1);
			Static392.method6007();
			return true;
		}
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;Lclient!ft;)Lclient!vn;")
	public static Class380 method8212(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class122 arg3) {
		if (arg1 == 0) {
			return arg3.method3350(arg0);
		}
		@Pc(62) Class380 local62;
		if (arg1 == 1) {
			try {
				@Pc(41) Object local41 = Static692.method2496(Static371.anApplet1, new Object[] { (new URL(Static371.anApplet1.getCodeBase(), arg0)).toString() }, arg2);
				if (local41 == null) {
					throw new RuntimeException();
				}
				@Pc(52) Class380 local52 = new Class380();
				local52.anInt10067 = 1;
				return local52;
			} catch (@Pc(58) Throwable local58) {
				local62 = new Class380();
				local62.anInt10067 = 2;
				return local62;
			}
		} else if (arg1 == 2) {
			try {
				Static371.anApplet1.getAppletContext().showDocument(new URL(Static371.anApplet1.getCodeBase(), arg0), "_blank");
				local62 = new Class380();
				local62.anInt10067 = 1;
				return local62;
			} catch (@Pc(92) Exception local92) {
				local62 = new Class380();
				local62.anInt10067 = 2;
				return local62;
			}
		} else if (arg1 == 3) {
			try {
				Static692.method2495("loggedout", Static371.anApplet1);
			} catch (@Pc(113) Throwable local113) {
			}
			try {
				Static371.anApplet1.getAppletContext().showDocument(new URL(Static371.anApplet1.getCodeBase(), arg0), "_top");
				local62 = new Class380();
				local62.anInt10067 = 1;
				return local62;
			} catch (@Pc(135) Exception local135) {
				local62 = new Class380();
				local62.anInt10067 = 2;
				return local62;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
	public static boolean method8213(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg3.equals(arg1);
		}
	}
}
