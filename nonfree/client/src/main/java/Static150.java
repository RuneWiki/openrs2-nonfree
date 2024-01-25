import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!ela", name = "g", descriptor = "Lclient!tfa;")
	public static final Class352 aClass352_4 = new Class352();

	@OriginalMember(owner = "client!ela", name = "a", descriptor = "(BLclient!d;Ljava/awt/Canvas;IILclient!nca;)Lclient!ha;")
	public static Class145 method2167(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class254 arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg1 != null) {
			@Pc(18) Dimension local18 = arg1.getSize();
			local5 = local18.width;
			local7 = local18.height;
		}
		return Static224.method9685(arg4, arg2, arg1, arg3, local5, local7, arg0);
	}
}
