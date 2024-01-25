import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!vo;")
	public static Class381 aClass381_4 = null;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	public static void method4009(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static562.anInt9088;
		@Pc(7) int local7 = Static610.anInt9637;
		if (arg0 && Static490.aBoolean634) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static202.aClass75_5.f(local7, local5);
	}
}
