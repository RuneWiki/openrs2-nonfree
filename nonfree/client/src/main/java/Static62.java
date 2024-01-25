import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Lclient!ws;")
	public static Class393 aClass393_1;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "Lclient!th;")
	public static Class336 aClass336_1;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "I")
	public static int anInt952 = 0;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	public static final int[] anIntArray48 = new int[13];

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method837() {
		Static648.aClass345ArrayArray2 = new Class345[Static113.aClass390_22.method8918()][];
		Static212.aClass345ArrayArray1 = new Class345[Static113.aClass390_22.method8918()][];
		Static593.aBooleanArray38 = new boolean[Static113.aClass390_22.method8918()];
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	public static int method838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local5 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local5;
		} else {
			return local5;
		}
	}
}
