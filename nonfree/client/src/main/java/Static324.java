import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
	public static int anInt7225;

	@OriginalMember(owner = "client!qd", name = "U", descriptor = "J")
	public static long aLong206;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "[Lclient!lb;")
	public static final Class1_Sub27[] aClass1_Sub27Array2 = new Class1_Sub27[1024];

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "S")
	public static short aShort97 = 32767;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!qs;I)I")
	public static int method5502(@OriginalArg(0) Class211 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4761(Static64.anInt1738)) {
			local5++;
		}
		if (arg0.method4761(Static265.anInt5129)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZI)I")
	public static int method5503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static176.method2983(arg1 - 1, arg0 + -1) + Static176.method2983(arg1 + 1, arg0 + -1) + Static176.method2983(arg1 + -1, arg0 + 1) + Static176.method2983(arg1 + 1, arg0 + 1);
		@Pc(69) int local69 = Static176.method2983(arg1 - 1, arg0) + Static176.method2983(arg1 + 1, arg0) + Static176.method2983(arg1, arg0 - 1) + Static176.method2983(arg1, arg0 + 1);
		@Pc(79) int local79 = Static176.method2983(arg1, arg0);
		return local79 / 4 + local40 / 16 + local69 / 8;
	}
}
