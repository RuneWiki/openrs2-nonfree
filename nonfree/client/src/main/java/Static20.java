import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!aq", name = "I", descriptor = "Lclient!ao;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!aq", name = "E", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_5 = new Class45(15, -1);

	@OriginalMember(owner = "client!aq", name = "H", descriptor = "[I")
	public static final int[] anIntArray27 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)[Lclient!hr;")
	public static Class137[] method465() {
		return new Class137[] { Static17.aClass137_1, Static17.aClass137_2, Static17.aClass137_3, Static17.aClass137_4, Static17.aClass137_5, Static17.aClass137_6, Static17.aClass137_7, Static17.aClass137_8, Static17.aClass137_9, Static17.aClass137_10, Static17.aClass137_11, Static17.aClass137_12, Static17.aClass137_13, Static17.aClass137_14 };
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIILclient!qa;IIII[[[BIII)V")
	public static void method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class42 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[][][] arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		if (arg6 == 0 || arg3 == 0) {
			return;
		}
		if (arg6 == 9) {
			arg2 = arg2 + 1 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 10) {
			arg2 = arg2 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg2 = arg2 + 3 & 0x3;
			arg6 = 8;
		}
		arg4.za(arg8, arg0, arg10, arg7, arg1, arg5, arg9[arg6 - 1][arg2], arg3, arg11);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	public static void method467(@OriginalArg(1) int arg0) {
		@Pc(8) Class12_Sub4_Sub1 local8 = Static389.method6156(4, arg0);
		local8.method823();
	}
}
