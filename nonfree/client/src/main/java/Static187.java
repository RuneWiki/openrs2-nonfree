import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gea", name = "bb", descriptor = "Z")
	public static boolean aBoolean315 = true;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!lga;Lclient!d;II)Lclient!ha;")
	public static Class75 method3520(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg0 != null) {
			@Pc(12) Dimension local12 = arg0.getSize();
			local7 = local12.height;
			local5 = local12.width;
		}
		return Static212.method6648(arg3, arg2, arg4, local7, local5, arg0, arg1);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!rfa;)V")
	public static void method3522(@OriginalArg(0) Class60_Sub1 arg0) {
		Static277.aClass75_7.H(arg0.anInt9048, arg0.anInt9051 + (arg0.method7922() >> 1), arg0.anInt9057, Static43.anIntArray41);
		arg0.anInt9050 = Static43.anIntArray41[0];
		arg0.anInt9055 = Static43.anIntArray41[1];
		arg0.anInt9049 = Static43.anIntArray41[2];
	}
}
