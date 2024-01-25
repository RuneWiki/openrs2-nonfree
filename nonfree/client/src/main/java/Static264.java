import java.awt.Canvas;
import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!f;")
	public static Class22 aClass22_26;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("8b2d20d561427fb823752476ff6ef68ff7141b4965073811be394d04baa93819fe158867f5f03aa6d8207a4d44593a7e7e521408af5e5363932a065ce569e11d", 16);

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!gm;")
	public static final Class125 aClass125_7 = new Class125();

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!fa;)Lclient!r;")
	public static Class134 method3790(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Interface7 arg1) {
		return new l(arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method3792() {
		Static584.method7804();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!tk;FFIBIFFIFI)[B")
	public static byte[] method3793(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static247.method3677(arg1, 0, arg5, arg2, arg4, arg3, local15, arg0);
		return local15;
	}
}
