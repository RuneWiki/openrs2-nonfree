import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "[I")
	public static int[] anIntArray129;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_39 = new Class44(82, -2);

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "Lclient!saa;")
	public static final Class310 aClass310_2 = new Class310(2, 2);

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "Z")
	public static final boolean aBoolean141 = false;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZII)Z")
	public static boolean method1488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static504.method7376(arg1, arg0) | Static563.method8117(arg0, arg1) | Static313.method7483(arg1, arg0)) & Static652.method9072(arg0, arg1);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method1495(@OriginalArg(0) Class14_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static576.aClass51Array3 != Static473.aClass51Array2) {
			@Pc(12) int local12 = Static343.aClass51Array1[arg1].method7866(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class51 local19 = Static343.aClass51Array1[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7866(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7858(arg0, arg2, local29, arg3);
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
