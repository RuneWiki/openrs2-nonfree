import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	public static int anInt5946;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[[Lclient!kd;")
	public static Class1_Sub20[][] aClass1_Sub20ArrayArray3;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
	public static int[] anIntArray596 = new int[2];

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public static int anInt5947 = 0;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[S")
	public static short[] aShortArray91 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method4609(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			try {
				Static301.method406("loggedout", Static43.aClass66_1.anApplet1);
			} catch (@Pc(13) Throwable local13) {
			}
			try {
				Static289.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static289.anApplet_Sub1_1.getCodeBase(), arg0), "_top");
			} catch (@Pc(25) Exception local25) {
			}
			return;
		}
		if (Static296.aBoolean335 && Static11.aBoolean150) {
			try {
				Static301.method405("openjs", Static43.aClass66_1.anApplet1, new Object[] { (new URL(Static289.anApplet_Sub1_1.getCodeBase(), arg0)).toString() });
				return;
			} catch (@Pc(51) Throwable local51) {
			}
		}
		try {
			Static289.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static289.anApplet_Sub1_1.getCodeBase(), arg0), "_blank");
		} catch (@Pc(63) Exception local63) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)I")
	public static int method4610() {
		if (Static158.aFrame2 != null) {
			return 3;
		} else if (Static296.aBoolean335 && Static148.aBoolean175) {
			return 2;
		} else if (Static296.aBoolean335 && !Static148.aBoolean175) {
			return 1;
		} else {
			return 0;
		}
	}
}
