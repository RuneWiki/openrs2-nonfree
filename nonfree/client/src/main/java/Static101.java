import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
	public static int anInt2284 = 0;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)Lclient!bg;")
	public static Class20 method2251(@OriginalArg(1) int arg0) {
		@Pc(10) Class20 local10 = (Class20) Static313.aClass11_130.method209((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static170.aClass143_70.method3745(30, arg0);
		local10 = new Class20();
		if (local20 != null) {
			local10.method504(new Class14_Sub4(local20), arg0);
		}
		Static313.aClass11_130.method219((long) arg0, local10);
		return local10;
	}
}
