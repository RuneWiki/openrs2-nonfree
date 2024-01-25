import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!wl", name = "xb", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!wl", name = "Nb", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_102 = new Class194(21, 2);

	@OriginalMember(owner = "client!wl", name = "ic", descriptor = "I")
	public static int anInt6190 = 0;

	@OriginalMember(owner = "client!wl", name = "mc", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_12 = new Class163(3, 7);

	@OriginalMember(owner = "client!wl", name = "pc", descriptor = "I")
	public static int anInt6195 = -1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIII)V")
	public static void method4906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg1; local7++) {
			Static291.method3606(arg4, Static133.anIntArrayArray15[local7], arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V")
	public static void method4907() {
		Static430.aClass177_47 = new Class177();
	}
}
