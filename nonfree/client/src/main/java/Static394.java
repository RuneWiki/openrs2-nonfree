import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!oba", name = "o", descriptor = "Lclient!uu;")
	public static Class343 aClass343_188;

	@OriginalMember(owner = "client!oba", name = "q", descriptor = "I")
	public static int anInt7055;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)V")
	public static void method6217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static214.method3762(local7.aClass9_Sub2_Sub5_1);
		Static214.method3762(local7.aClass9_Sub2_Sub5_2);
		if (local7.aClass9_Sub2_Sub5_1 != null) {
			local7.aClass9_Sub2_Sub5_1 = null;
		}
		if (local7.aClass9_Sub2_Sub5_2 != null) {
			local7.aClass9_Sub2_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIII[B)V")
	public static void method6218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(20) int local20 = arg1 - arg2 >> 2;
		arg0 += arg2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg1 - arg2 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
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

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BII)Z")
	public static boolean method6219(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
