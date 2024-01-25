import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!kka", name = "P", descriptor = "Lclient!eq;")
	public static Class93 aClass93_2;

	@OriginalMember(owner = "client!kka", name = "S", descriptor = "Lclient!lo;")
	public static Class212 aClass212_2;

	@OriginalMember(owner = "client!kka", name = "U", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!kka", name = "V", descriptor = "Lclient!ae;")
	public static Class8 aClass8_122;

	@OriginalMember(owner = "client!kka", name = "I", descriptor = "Z")
	public static volatile boolean aBoolean579 = true;

	@OriginalMember(owner = "client!kka", name = "N", descriptor = "I")
	public static int anInt8379 = -1;

	@OriginalMember(owner = "client!kka", name = "R", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_294 = new Class179(131, 0);

	@OriginalMember(owner = "client!kka", name = "T", descriptor = "[I")
	public static final int[] anIntArray541 = new int[8];

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method7136(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static289.aClass12Array3 != Static68.aClass12Array2) {
			@Pc(12) int local12 = Static64.aClass12Array1[arg1].method7854(arg3, arg2);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class12 local19 = Static64.aClass12Array1[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7854(arg3, arg2);
					if (arg4 != null) {
						arg4[local14] = local19.method7852(arg0, arg2, local29, arg3);
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
