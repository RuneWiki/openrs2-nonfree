import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!pha", name = "d", descriptor = "[Lclient!mi;")
	public static Class46[] aClass46Array13;

	@OriginalMember(owner = "client!pha", name = "e", descriptor = "[Lclient!hi;")
	public static Class132[] aClass132Array1;

	@OriginalMember(owner = "client!pha", name = "h", descriptor = "I")
	public static int anInt8027 = 0;

	@OriginalMember(owner = "client!pha", name = "i", descriptor = "I")
	public static final int anInt8028 = Static627.method7088(1600);

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method6848(@OriginalArg(0) Class2_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static9.aClass65Array1 == Static103.aClass65Array3) {
			return;
		}
		@Pc(10) int local10 = Static40.aClass65Array2[arg1].method7999(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class65 local23 = Static40.aClass65Array2[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7999(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
