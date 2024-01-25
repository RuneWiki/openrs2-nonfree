import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "J")
	public static long aLong37;

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "Lclient!jn;")
	public static Class176 aClass176_25;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method1095(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static231.anInt4192;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(29) Class125 local29 = Static517.aClass144_1.method3378(arg0[local13]);
			if (local29.anInt3517 != -1) {
				@Pc(42) Class78 local42 = (Class78) Static148.aClass223_65.method5388((long) local29.anInt3517);
				if (local42 == null) {
					@Pc(50) Class261 local50 = Static598.method6312(Static281.aClass176_74, local29.anInt3517, 0);
					if (local50 != null) {
						local42 = Static440.aClass44_12.method5018(local50, true);
						Static148.aClass223_65.method5394(local42, (long) local29.anInt3517);
					}
				}
				if (local42 != null) {
					Static500.aClass78Array18[local11] = local42;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
