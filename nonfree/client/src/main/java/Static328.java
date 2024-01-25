import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "Lclient!q;")
	public static Class109 aClass109_5;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "[I")
	public static final int[] anIntArray455 = new int[14];

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
	public static int anInt5890 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)I")
	public static int method5090(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}
}
