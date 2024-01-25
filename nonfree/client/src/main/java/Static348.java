import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "Lclient!in;")
	public static Class160 aClass160_23 = null;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!ha;III[Z)Z")
	public static boolean method5196(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static310.aClass129Array5 != Static150.aClass129Array4) {
			@Pc(12) int local12 = Static36.aClass129Array7[arg1].method6480(arg3, arg2);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class129 local19 = Static36.aClass129Array7[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method6480(arg3, arg2);
					if (arg4 != null) {
						arg4[local14] = local19.method6474(arg0, arg2, local29, arg3);
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
