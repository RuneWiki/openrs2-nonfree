import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "[Lclient!bi;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	public static int anInt9778;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger9 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_142 = new Class200(69, 3);

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "Lclient!qp;")
	public static final Class280 aClass280_45 = new Class280(4);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
	public static void method8377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class3_Sub4_Sub12 local12 = Static556.method8018(4, arg3);
		local12.method3608();
		local12.anInt4062 = arg0;
		local12.anInt4064 = arg1;
		local12.anInt4065 = arg2;
	}
}
