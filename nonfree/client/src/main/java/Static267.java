import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_157 = new Class349(97, 4);

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "F")
	public static float aFloat241 = 1.0F;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ha;III[Z)Z")
	public static boolean method7375(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static114.aClass151Array1 != Static320.aClass151Array3) {
			@Pc(12) int local12 = Static261.aClass151Array2[arg1].method7680(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class151 local19 = Static261.aClass151Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7680(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7675(arg0, arg2, local29, arg3);
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
