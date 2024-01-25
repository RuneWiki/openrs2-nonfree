import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "S")
	public static short aShort8 = 205;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIILclient!ij;)Lclient!ri;")
	public static Class177 method2236(@OriginalArg(1) int arg0, @OriginalArg(3) Class93 arg1) {
		@Pc(18) byte[] local18 = arg1.method2410(0, arg0);
		return local18 == null ? null : new Class177(local18);
	}
}
