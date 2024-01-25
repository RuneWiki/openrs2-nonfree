import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray41;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_203 = new Class214(2, 6);

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!so;")
	public static final Class224 aClass224_22 = new Class224(9, 7);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method4344() {
		Static131.aClass254_13 = new Class254();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(FFIF)F")
	public static float method4345(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg0 + arg2 * (arg1 - arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjava/lang/Object;I)[B")
	public static byte[] method4348(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static48.method715(arg0, local13);
		} else if (arg1 instanceof Class83) {
			@Pc(25) Class83 local25 = (Class83) arg1;
			return local25.method3898(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
