import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "Lclient!ufa;")
	public static Class4 aClass4_34;

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
	public static int anInt10682;

	@OriginalMember(owner = "client!wk", name = "y", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
	public static int anInt10683;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "[I")
	public static final int[] anIntArray570 = new int[250];

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_68 = new Class94(8);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!d;ILclient!ni;)Lclient!ha;")
	public static Class5 method8714(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class223 arg4) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		if (arg1 != null) {
			@Pc(17) Dimension local17 = arg1.getSize();
			local10 = local17.width;
			local12 = local17.height;
		}
		return Static201.method6105(arg0, arg1, arg2, local10, arg4, arg3, local12);
	}
}
