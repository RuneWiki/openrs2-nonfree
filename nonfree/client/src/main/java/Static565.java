import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "Lclient!gk;")
	public static Class112 aClass112_71;

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
	public static int anInt9225;

	@OriginalMember(owner = "client!vr", name = "E", descriptor = "Lclient!lj;")
	public static Class12 aClass12_4;

	@OriginalMember(owner = "client!vr", name = "I", descriptor = "I")
	public static int anInt9228 = 0;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ)I")
	public static int method7622(@OriginalArg(0) int arg0) {
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
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}
}
