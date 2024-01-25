import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!oj;")
	public static Class239 aClass239_3;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "[Lclient!tp;")
	public static Class331[] aClass331Array1;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	public static int anInt8942 = 0;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method7338() {
		Static134.aClass253_10.method6598();
		Static465.aClass302_12.method7322();
		Static557.aClass302_13.method7322();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!d;ILclient!oh;IILjava/awt/Canvas;)Lclient!ha;")
	public static Class16 method7342(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Canvas arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg4 != null) {
			@Pc(12) Dimension local12 = arg4.getSize();
			local5 = local12.width;
			local7 = local12.height;
		}
		return Static190.method6065(arg1, arg2, arg0, local7, arg3, local5, arg4);
	}
}
