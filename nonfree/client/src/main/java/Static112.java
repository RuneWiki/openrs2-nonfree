import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!oh;")
	public static Class237 aClass237_30;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	public static int anInt2926 = 0;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "[I")
	public static int[] anIntArray150 = new int[1];

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)[Lclient!sn;")
	public static Class313[] method2536() {
		return new Class313[] { Static101.aClass313_5, Static190.aClass313_12, Static141.aClass313_6, Static78.aClass313_4, Static253.aClass313_8, Static501.aClass313_13 };
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)I")
	public static int method2537(@OriginalArg(0) int arg0) {
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
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}
}
