import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!oca", name = "l", descriptor = "Lclient!vs;")
	public static Class311 aClass311_2;

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_48 = new Class277(4);

	@OriginalMember(owner = "client!oca", name = "k", descriptor = "[I")
	public static final int[] anIntArray614 = new int[500];

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;CB)[Ljava/lang/String;")
	public static String[] method5715(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static500.method7680(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local19; arg0.charAt(local33) != arg1; local33++) {
			}
			local15[local17++] = arg0.substring(local19, local33);
			local19 = local33 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)Z")
	public static boolean method5717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)V")
	public static void method5718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static263.aClass64ArrayArrayArray3[0][arg1][arg2] != null && Static263.aClass64ArrayArrayArray3[0][arg1][arg2].aClass64_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static263.aClass64ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class64 local46 = Static263.aClass64ArrayArrayArray3[local22][arg1][arg2] = new Class64(local22, arg1, arg2);
				if (local20) {
					local46.aByte27++;
				}
			}
		}
	}
}
