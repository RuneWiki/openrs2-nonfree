import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_455 = new Class305(76, 0);

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "Lclient!pt;")
	public static final Class230 aClass230_49 = new Class230(32);

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_456 = new Class305(61, 0);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIBI)V")
	public static void method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg0 + 1;
		Static313.method5430(arg4, arg3, Static143.anIntArrayArray33[arg0], arg1);
		@Pc(20) int local20 = arg2 - 1;
		Static313.method5430(arg4, arg3, Static143.anIntArrayArray33[arg2], arg1);
		for (@Pc(25) int local25 = local7; local25 <= local20; local25++) {
			@Pc(31) int[] local31 = Static143.anIntArrayArray33[local25];
			local31[arg1] = local31[arg4] = arg3;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!qa;III)V")
	public static void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.N(arg3, arg4, arg3 + arg2, arg4 + arg0);
		arg1.method7162(-16777216, arg2, arg3, arg4, arg0);
		if (Static224.anInt4343 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static335.anInt4938 / (float) Static335.anInt4943;
		@Pc(37) int local37 = arg2;
		@Pc(39) int local39 = arg0;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg2 * local35);
		} else {
			local37 = (int) ((float) arg0 / local35);
		}
		@Pc(66) int local66 = arg4 + (arg0 - local39) / 2;
		@Pc(75) int local75 = arg3 + (arg2 - local37) / 2;
		if (Static452.aClass104_25 == null || Static452.aClass104_25.c() != arg2 || arg0 != Static452.aClass104_25.la()) {
			Static335.method4556(Static335.anInt4941, Static335.anInt4938 + Static335.anInt4935, Static335.anInt4943 + Static335.anInt4941, Static335.anInt4935, local75, local66, local37 + local75, local66 + local39);
			Static335.method4560(arg1);
			Static452.aClass104_25 = arg1.method7199(local75, local66, local37, local39, false);
		}
		Static452.aClass104_25.method7716(local75, local66);
		@Pc(126) int local126 = Static516.anInt9149 * local37 / Static335.anInt4943;
		@Pc(132) int local132 = Static386.anInt8112 * local39 / Static335.anInt4938;
		@Pc(141) int local141 = local75 + local37 * Static468.anInt8080 / Static335.anInt4943;
		@Pc(154) int local154 = local39 + local66 - Static184.anInt3826 * local39 / Static335.anInt4938 - local132;
		@Pc(156) int local156 = -1996554240;
		if (Static116.aClass250_2 == Static332.aClass250_4) {
			local156 = -1996488705;
		}
		arg1.f(local141, local154, local126, local132, local156, 1);
		arg1.method7181(local141, local154, local126, local132, local156, 0);
		if (Static360.anInt6507 <= 0) {
			return;
		}
		@Pc(188) int local188;
		if (Static486.anInt8594 > 50) {
			local188 = (100 - Static486.anInt8594) * 5;
		} else {
			local188 = Static486.anInt8594 * 5;
		}
		for (@Pc(199) Class1_Sub51 local199 = (Class1_Sub51) Static335.aClass295_19.method7543(); local199 != null; local199 = (Class1_Sub51) Static335.aClass295_19.method7540()) {
			@Pc(207) Class65 local207 = Static335.aClass32_4.method1129(local199.anInt9566);
			if (Static208.method3828(local207)) {
				@Pc(236) int local236;
				@Pc(248) int local248;
				if (local199.anInt9566 == Static39.anInt1113) {
					local236 = local199.anInt9571 * local37 / Static335.anInt4943 + local75;
					local248 = local66 + local39 * (Static335.anInt4938 - local199.anInt9569) / Static335.anInt4938;
					arg1.method7162(local188 << 24 | 0xFFFF00, 4, local236 - 2, local248 + -2, 4);
				} else if (Static9.anInt229 != -1 && local207.anInt1915 == Static9.anInt229) {
					local236 = local75 + local199.anInt9571 * local37 / Static335.anInt4943;
					local248 = local66 + (Static335.anInt4938 - local199.anInt9569) * local39 / Static335.anInt4938;
					arg1.method7162(local188 << 24 | 0xFFFF00, 4, local236 - 2, local248 + -2, 4);
				}
			}
		}
	}
}
