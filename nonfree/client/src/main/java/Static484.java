import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
	public static int anInt9501;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_132 = new Class61(54, 7);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIB)V")
	public static void method7809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class4_Sub7_Sub5 local10 = Static218.method3780(12, arg1);
		local10.method3066();
		local10.anInt3348 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!bi;II)Lclient!xa;")
	public static Class13 method7810(@OriginalArg(0) Class31 arg0, @OriginalArg(2) int arg1) {
		return Static359.aBoolean463 ? Static185.aClass66_14.method6799(Static607.method5882(arg0, arg1), true) : Static533.method7418(arg0.method661(arg1));
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZZ)I")
	public static int method7811(@OriginalArg(0) boolean arg0) {
		if (Static61.anIntArray145 == null) {
			return 0;
		} else if (arg0 || Static271.aClass352Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static61.anIntArray145.length; local22++) {
				@Pc(28) int local28 = Static61.anIntArray145[local22];
				if (Static149.aClass31_32.method679(local28)) {
					local20++;
				}
				if (Static433.aClass31_96.method679(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static61.anIntArray145.length * 2;
		}
	}
}
