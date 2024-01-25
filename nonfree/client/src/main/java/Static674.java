import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static674 {

	@OriginalMember(owner = "client!wga", name = "i", descriptor = "I")
	public static int anInt11000;

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "I")
	public static int anInt11001;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)V")
	public static void method9335() {
		Static269.method8966();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method9338(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static258.aClass159Array1 != Static346.aClass159Array2) {
			@Pc(12) int local12 = Static445.aClass159Array3[arg1].method8209(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class159 local19 = Static445.aClass159Array3[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8209(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method8198(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
