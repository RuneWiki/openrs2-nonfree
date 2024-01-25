import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!sja", name = "f", descriptor = "I")
	public static int anInt9003;

	@OriginalMember(owner = "client!sja", name = "g", descriptor = "Lclient!aj;")
	public static Class15 aClass15_138;

	@OriginalMember(owner = "client!sja", name = "e", descriptor = "[I")
	public static int[] anIntArray762 = new int[1];

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(ILclient!aj;Lclient!d;BILjava/awt/Canvas;)Lclient!ha;")
	public static Class13 method7865(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Canvas arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg4 != null) {
			@Pc(12) Dimension local12 = arg4.getSize();
			local7 = local12.height;
			local5 = local12.width;
		}
		return Static212.method8453(arg3, local5, arg4, arg0, arg2, local7, arg1);
	}
}
