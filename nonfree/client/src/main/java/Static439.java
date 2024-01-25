import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "Lclient!am;")
	public static Class13 aClass13_3;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!ha;III[Z)Z")
	public static boolean method6098(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static199.aClass47Array1 != Static557.aClass47Array3) {
			@Pc(12) int local12 = Static216.aClass47Array2[arg1].method7550(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class47 local19 = Static216.aClass47Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7550(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7543(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.E(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6099(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(11) Class1_Sub6_Sub16 local11 = Static212.method3332(2, arg0);
		local11.method6594();
		local11.aString85 = arg1;
	}
}
