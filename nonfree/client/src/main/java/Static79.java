import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "Lclient!wu;")
	public static Class384 aClass384_111;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "Lclient!ht;")
	public static final Class148 aClass148_28 = new Class148(11, 4);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZIIBII)V")
	public static void method6908(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) long local18 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg3);
		@Pc(24) Class5_Sub37 local24 = (Class5_Sub37) Static97.aClass81_14.method1599(local18);
		if (local24 == null) {
			local24 = new Class5_Sub37();
			Static97.aClass81_14.method1607(local24, local18);
		}
		if (local24.anIntArray552.length <= arg1) {
			@Pc(51) int[] local51 = new int[arg1 + 1];
			@Pc(56) int[] local56 = new int[arg1 + 1];
			for (@Pc(58) int local58 = 0; local58 < local24.anIntArray552.length; local58++) {
				local51[local58] = local24.anIntArray552[local58];
				local56[local58] = local24.anIntArray553[local58];
			}
			for (@Pc(84) int local84 = local24.anIntArray552.length; local84 < arg1; local84++) {
				local51[local84] = -1;
				local56[local84] = 0;
			}
			local24.anIntArray552 = local51;
			local24.anIntArray553 = local56;
		}
		local24.anIntArray552[arg1] = arg4;
		local24.anIntArray553[arg1] = arg2;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)Z")
	public static boolean method6909() {
		if (Static297.aBoolean391) {
			try {
				Static652.method1918("showVideoAd", Static270.anApplet5);
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}
}
