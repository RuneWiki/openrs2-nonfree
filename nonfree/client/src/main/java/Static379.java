import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static379 {

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Lclient!ra;")
	public static Class67 aClass67_13;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	public static int anInt8819 = -1;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "[B")
	public static final byte[] aByteArray123 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Lclient!paa;")
	public static final Class229 aClass229_30 = new Class229(14, 4);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "[I")
	public static final int[] anIntArray822 = new int[5];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILjava/awt/Canvas;ZLclient!kr;Lclient!n;)Lclient!qa;")
	public static synchronized Class122 method7208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Class171 arg3, @OriginalArg(5) Interface8 arg4) {
		if (arg0 == 0) {
			return Static4.method239(arg4, arg2, false);
		} else if (arg0 == 2) {
			return Static313.method4909(arg4, arg2);
		} else if (arg0 == 4) {
			return Static4.method239(arg4, arg2, true);
		} else if (arg0 == 1) {
			return Static405.method7493(arg4, arg1, arg2);
		} else if (arg0 == 5) {
			return Static170.method2589(arg4, arg3, arg2, arg1);
		} else if (arg0 == 3) {
			return Static548.method2371(arg4, arg3, arg1, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7243(@OriginalArg(1) String arg0) {
		System.exit(1);
	}
}
