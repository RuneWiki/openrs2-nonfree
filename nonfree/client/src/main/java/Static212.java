import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static212 {

	@OriginalMember(owner = "client!gja", name = "G", descriptor = "[Lclient!kw;")
	public static Class178[] aClass178Array8;

	@OriginalMember(owner = "client!gja", name = "C", descriptor = "I")
	public static int anInt3495;

	@OriginalMember(owner = "client!gja", name = "D", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_12 = new Class320(11);

	@OriginalMember(owner = "client!gja", name = "H", descriptor = "I")
	public static int anInt3494 = 0;

	@OriginalMember(owner = "client!gja", name = "F", descriptor = "[I")
	public static final int[] anIntArray243 = new int[25];

	@OriginalMember(owner = "client!gja", name = "c", descriptor = "(III)B")
	public static byte method3173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
