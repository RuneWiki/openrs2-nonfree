import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "Lclient!c;")
	public static Class41 aClass41_5;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "Lclient!ql;")
	public static final Class6_Sub12_Sub2 aClass6_Sub12_Sub2_2 = new Class6_Sub12_Sub2(7500);

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
	public static int anInt7650 = 0;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6103(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(17) int local17 = arg2.indexOf(arg0); local17 != -1; local17 = arg2.indexOf(arg0, arg1.length() + local17)) {
			arg2 = arg2.substring(0, local17) + arg1 + arg2.substring(arg0.length() + local17);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIIZB)Lclient!pj;")
	public static Class248 method6104(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class109 local10 = null;
		if (Static139.aClass193_1 != null) {
			local10 = new Class109(arg1, Static139.aClass193_1, Static349.aClass193Array1[arg1], 1000000);
		}
		Static355.aClass58_Sub1Array2[arg1] = Static452.aClass54_1.method985(local10, arg1, Static120.aClass109_3);
		if (arg0) {
			Static355.aClass58_Sub1Array2[arg1].method1075();
		}
		return new Class248(Static355.aClass58_Sub1Array2[arg1], arg2, 1);
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(III)Z")
	public static boolean method6105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
