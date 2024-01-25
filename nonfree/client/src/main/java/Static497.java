import java.applet.Applet;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!tba", name = "j", descriptor = "F")
	public static float aFloat165;

	@OriginalMember(owner = "client!tba", name = "x", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!tba", name = "u", descriptor = "I")
	public static int anInt8315 = 0;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!qj;IIIII)Ljava/awt/Frame;")
	public static Frame method6751(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method6118()) {
			return null;
		}
		@Pc(17) Class71[] local17 = Static570.method7638(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg1 == local17[local25].anInt1785 && local17[local25].anInt1784 == arg2 && (!local23 || local17[local25].anInt1788 > arg3)) {
				local23 = true;
				arg3 = local17[local25].anInt1788;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(90) Class331 local90 = arg0.method6127(arg3, arg2, arg1);
		while (local90.anInt8818 == 0) {
			Static318.method4952(10L);
		}
		@Pc(105) Frame local105 = (Frame) local90.anObject18;
		if (local105 == null) {
			return null;
		} else if (local90.anInt8818 == 2) {
			Static449.method6347(arg0, local105);
			return null;
		} else {
			return local105;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)Lclient!uj;")
	public static Class335 method6752() {
		return Static211.method3731();
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)V")
	public static void method6753() {
		Static34.aClass6_Sub45_1 = new Class6_Sub45(Static230.aClass156_3.method4065(Static25.anInt769), "", Static245.anInt4901, 1006, -1, 0L, 0, 0, true, false);
	}
}
