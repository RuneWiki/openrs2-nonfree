import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!b", name = "W", descriptor = "I")
	public static int anInt668;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ha;III[Z)Z")
	public static boolean method527(@OriginalArg(0) Class3_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static29.aClass139Array6 != Static168.aClass139Array22) {
			@Pc(12) int local12 = Static374.aClass139Array17[arg1].method6890(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class139 local19 = Static374.aClass139Array17[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method6890(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method6881(arg0, arg2, local29, arg3);
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
}
