import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!iba", name = "yb", descriptor = "I")
	public static int anInt3950;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(CI)Z")
	public static boolean method3447(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!kr;ILclient!kr;)I")
	public static int method3449(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Class171 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method4327(Static11.anInt295)) {
			local5++;
		}
		if (arg1.method4327(Static341.anInt6104)) {
			local5++;
		}
		if (arg1.method4327(Static518.anInt8715)) {
			local5++;
		}
		if (arg0.method4327(Static11.anInt295)) {
			local5++;
		}
		if (arg0.method4327(Static341.anInt6104)) {
			local5++;
		}
		if (arg0.method4327(Static518.anInt8715)) {
			local5++;
		}
		return local5;
	}
}
