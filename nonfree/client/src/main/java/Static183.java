import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "Lclient!hs;")
	public static Class78 aClass78_4;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "Lclient!wg;")
	public static Class216 aClass216_1;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "[Lclient!wp;")
	public static final Class219[] aClass219Array1 = new Class219[4];

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method3233(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static253.method4540(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0.charAt(local25) != arg1; local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!va;")
	public static Class10_Sub1 method3234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class59 local14 = local7.aClass59_2; local14 != null; local14 = local14.aClass59_1) {
			@Pc(18) Class10_Sub1 local18 = local14.aClass10_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort94 == arg1 && local18.aShort91 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
