import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
	public static int anInt7845 = 0;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "Z")
	public static boolean aBoolean525 = false;

	@OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
	public static int anInt7858 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLclient!ha;II)Lclient!da;")
	public static Class50 method6750(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class52 local14 = Static270.method4795(arg2, arg0, arg1);
		return local14 == null ? null : local14.aClass50_3;
	}
}
