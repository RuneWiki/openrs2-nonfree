import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public static int anInt8488;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "Z")
	public static boolean aBoolean612 = true;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_88 = new Class236(41, 16);

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
	public static int anInt8489 = 503;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII[B)V")
	public static void method6853(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		arg0 += arg2;
		@Pc(24) int local24 = arg1 - arg2 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg1 - arg2 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg3[arg0++] = 1;
				}
			}
			@Pc(29) int local29 = arg0 + 1;
			arg3[arg0] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg0 = local39 + 1;
			arg3[local39] = 1;
		}
	}
}
