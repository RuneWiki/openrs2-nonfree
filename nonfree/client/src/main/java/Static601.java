import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!uea", name = "o", descriptor = "I")
	public static int anInt9245;

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_138 = new Class216(55, 3);

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZZLclient!kaa;B)V")
	public static void method7899(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class4_Sub28 arg2) {
		@Pc(8) int local8 = arg2.anInt4697;
		@Pc(12) int local12 = (int) arg2.aLong307;
		arg2.method9000();
		if (arg0) {
			Static342.method7464(local8);
		}
		Static350.method4699(local8);
		@Pc(32) Class199 local32 = Static569.method7534(local12);
		if (local32 != null) {
			Static331.method4565(local32);
		}
		Static258.method3731();
		if (!arg1 && Static77.anInt1630 != -1) {
			Static135.method2426(Static77.anInt1630, 1);
		}
		@Pc(54) Class181 local54 = new Class181(Static242.aClass66_17);
		for (@Pc(59) Class4_Sub28 local59 = (Class4_Sub28) local54.method4072(); local59 != null; local59 = (Class4_Sub28) local54.method4071()) {
			if (!local59.method9002()) {
				local59 = (Class4_Sub28) local54.method4072();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt4696 == 3) {
				@Pc(83) int local83 = (int) local59.aLong307;
				if (local8 == local83 >>> 16) {
					method7899(true, arg1, local59);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)Z")
	public static boolean method7900(@OriginalArg(0) int arg0) {
		return arg0 == 49 || arg0 == 5 || arg0 == 1003 || arg0 == 45 || arg0 == 17;
	}
}
