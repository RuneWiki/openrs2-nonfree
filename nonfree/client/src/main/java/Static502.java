import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "Lclient!gga;")
	public static Class124 aClass124_105;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "[I")
	public static int[] anIntArray455;

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
	public static final int anInt8977 = 328;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!gga;ILjava/awt/Canvas;ILclient!d;)Lclient!ha;")
	public static Class101 method7892(@OriginalArg(1) Class124 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface3 arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg2 != null) {
			@Pc(20) Dimension local20 = arg2.getSize();
			local5 = local20.width;
			local7 = local20.height;
		}
		return Static208.method8139(arg3, local7, arg1, arg2, arg4, arg0, local5);
	}
}
