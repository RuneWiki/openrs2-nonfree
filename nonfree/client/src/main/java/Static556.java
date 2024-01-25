import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_83 = new Class144(4, 6);

	@OriginalMember(owner = "client!rfa", name = "l", descriptor = "[I")
	public static final int[] anIntArray620 = new int[32];

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ika;I)Lclient!os;")
	public static Class227 method7271(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(7) int local7 = arg0.method2028(-14795);
		@Pc(14) Class223 local14 = Static525.method7024()[arg0.method2048(255)];
		@Pc(28) Class352 local28 = Static588.method7593()[arg0.method2048(255)];
		@Pc(32) int local32 = arg0.method2017();
		@Pc(36) int local36 = arg0.method2017();
		return new Class227(local7, local14, local28, local32, local36);
	}
}
