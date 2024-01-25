import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "Lclient!hg;")
	public static Class157 aClass157_1;

	@OriginalMember(owner = "client!jia", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString61 = null;

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(B)V")
	public static void method4583() {
		Static502.anInt8004 = 0;
		@Pc(13) int local13 = (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 >> 9) + Static291.anInt4448;
		@Pc(20) int local20 = Static189.anInt3243 + (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 >> 9);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static502.anInt8004 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static502.anInt8004 = 1;
		}
		if (Static502.anInt8004 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static502.anInt8004 = 0;
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIIIII[B)Z")
	public static boolean method4584(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(16) int local16 = arg3 % 8;
		@Pc(23) int local23;
		if (local16 == 0) {
			local23 = 0;
		} else {
			local23 = 8 - local16;
		}
		@Pc(37) int local37 = -((arg1 + 8 - 1) / 8);
		@Pc(47) int local47 = -((arg3 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local37; local49 < 0; local49++) {
			for (@Pc(55) int local55 = local47; local55 < 0; local55++) {
				if (arg4[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local23;
			if (arg4[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIIII)V")
	public static void method4585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) Class3_Sub7_Sub21 local23 = Static136.method2378((long) arg2, 10);
		local23.method9256();
		local23.anInt10899 = arg1;
		local23.anInt10896 = arg0;
		local23.anInt10897 = arg3;
	}
}
