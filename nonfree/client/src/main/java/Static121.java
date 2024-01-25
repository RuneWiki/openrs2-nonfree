import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!gda;IILclient!d;I)Lclient!ha;")
	public static Class100 method1790(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface7 arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg0 != null) {
			@Pc(12) Dimension local12 = arg0.getSize();
			local5 = local12.width;
			local7 = local12.height;
		}
		return Static202.method8585(arg1, local5, arg0, arg4, arg2, arg3, local7);
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(III)Z")
	public static boolean method1820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
