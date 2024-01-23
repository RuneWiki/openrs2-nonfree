import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ai", name = "I", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "[I")
	public static int[] anIntArray21 = new int[2000];

	@OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
	public static int anInt226 = 0;

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString15 = null;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)I")
	public static int method239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!km;BI)Lclient!tj;")
	public static Class12_Sub2 method240(@OriginalArg(1) Class91 arg0, @OriginalArg(3) int arg1) {
		return Static240.method3698(0, arg1, arg0) ? Static230.method1568() : null;
	}
}
