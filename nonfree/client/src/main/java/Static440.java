import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static440 {

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(JZ)V")
	public static void method6322(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static416.method6093(arg0 - 1L);
			Static416.method6093(1L);
		} else {
			Static416.method6093(arg0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!nd;Lclient!nd;Lclient!nd;BLclient!nd;)V")
	public static void method6323(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(4) Class238 arg3) {
		Static574.aClass238_266 = arg3;
		Static87.aClass238_49 = arg2;
		Static477.aClass238_220 = arg1;
		Static261.aClass303ArrayArray1 = new Class303[Static477.aClass238_220.method5569()][];
		Static139.aBooleanArray5 = new boolean[Static477.aClass238_220.method5569()];
	}
}
