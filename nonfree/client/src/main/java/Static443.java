import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILclient!de;)V")
	public static void method6121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub3_Sub3_Sub1_Sub1 arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static598.method1171(local6, 0, local6.length, arg1);
		Static290.method4092(arg0, arg2, local6);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Z")
	public static boolean method6122(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Lclient!ws;")
	public static Class364 method6123() {
		return Static583.method7799();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ha;III[Z)V")
	public static void method6124(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static199.aClass47Array1 == Static557.aClass47Array3) {
			return;
		}
		@Pc(10) int local10 = Static216.aClass47Array2[arg1].method7550(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class47 local23 = Static216.aClass47Array2[local12];
				if (local23 != null) {
					local23.DA(arg0, arg2, local10 - local23.method7550(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
