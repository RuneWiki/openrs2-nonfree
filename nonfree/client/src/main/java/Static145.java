import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!mda;")
	public static Class188 aClass188_2;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_27 = new Class200(25, 1);

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method2663(@OriginalArg(0) Class3_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static364.aClass51Array3 != Static2.aClass51Array1) {
			@Pc(12) int local12 = Static559.aClass51Array4[arg1].method7839(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class51 local19 = Static559.aClass51Array4[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7839(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7831(arg0, arg2, local29, arg3);
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

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z")
	public static boolean method2664(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
