import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_28 = new Class45(28, 3);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	public static void method1671() {
		if (Static149.method2947(Static96.anInt2243) || Static109.method2274(Static96.anInt2243)) {
			Static226.method4099(5000, Static368.anInt6832 >> 10, Static6.anInt93 >> 10);
		} else {
			@Pc(24) int local24 = Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray316[0] >> 3;
			@Pc(31) int local31 = Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray317[0] >> 3;
			if (local24 >= 0 && local24 < Static37.anInt7512 >> 3 && local31 >= 0 && local31 < Static329.anInt6247 >> 3) {
				Static226.method4099(5000, local24, local31);
			} else {
				Static226.method4099(0, Static37.anInt7512 >> 4, Static329.anInt6247 >> 4);
			}
		}
		Static73.method1669();
		Static476.method2144();
		Static140.method2819();
		Static187.method3646();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!n;IILclient!qa;II)V")
	public static void method1673(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class42 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static22.anInt9607 < 100) {
			Static291.method4730(arg3, arg1);
		}
		arg3.N(arg0, arg2, arg0 + arg4, arg2 + arg5);
		@Pc(34) int local34;
		@Pc(45) int local45;
		if (Static22.anInt9607 < 100) {
			local34 = arg0 + arg4 / 2;
			local45 = arg2 + arg5 / 2 - 18 - 20;
			arg3.f(arg0, arg2, arg4, arg5, -16777216, 0);
			arg3.method5834(local34 - 152, local45, 304, 34, Static421.aColorArray2[Static406.anInt7661].getRGB(), 0);
			arg3.f(local34 - 150, local45 + 2, Static22.anInt9607 * 3, 30, Static500.aColorArray3[Static406.anInt7661].getRGB(), 0);
			Static12.aClass80_1.method7772(local45 + 20, Static138.aColorArray1[Static406.anInt7661].getRGB(), local34, Static146.aClass88_87.method2391(Static345.anInt6495), -1);
			return;
		}
		@Pc(110) int local110 = Static153.anInt3358 - (int) ((float) arg4 / Static2.aFloat123);
		local34 = (int) ((float) arg5 / Static2.aFloat123) + Static404.anInt7598;
		local45 = Static153.anInt3358 + (int) ((float) arg4 / Static2.aFloat123);
		Static516.anInt9256 = Static153.anInt3358 - (int) ((float) arg4 / Static2.aFloat123);
		Static397.anInt7483 = (int) ((float) (arg4 * 2) / Static2.aFloat123);
		Static540.anInt9596 = Static404.anInt7598 - (int) ((float) arg5 / Static2.aFloat123);
		Static524.anInt6022 = (int) ((float) (arg5 * 2) / Static2.aFloat123);
		@Pc(169) int local169 = Static404.anInt7598 - (int) ((float) arg5 / Static2.aFloat123);
		Static2.method4935(Static2.anInt5916 + local110, Static2.anInt5914 + local34, local45 + Static2.anInt5916, Static2.anInt5914 + local169, arg0, arg2, arg0 + arg4, arg2 + 1 + arg5);
		Static2.method4931(arg3);
		@Pc(197) Class73 local197 = Static2.method4944(arg3);
		Static233.method4141(local197, arg3);
		if (Static247.anInt5085 > 0) {
			Static40.anInt812--;
			if (Static40.anInt812 == 0) {
				Static40.anInt812 = 20;
				Static247.anInt5085--;
			}
		}
		if (!Static191.aBoolean341) {
			return;
		}
		@Pc(229) int local229 = arg0 + arg4 - 5;
		@Pc(235) int local235 = arg5 + arg2 - 8;
		Static56.aClass80_2.method7779(local229, 16776960, local235, "Fps:" + Static159.anInt3566);
		@Pc(250) int local250 = local235 - 15;
		@Pc(252) Runtime local252 = Runtime.getRuntime();
		@Pc(261) int local261 = (int) ((local252.totalMemory() - local252.freeMemory()) / 1024L);
		@Pc(263) int local263 = 16776960;
		if (local261 > 65536) {
			local263 = 16711680;
		}
		Static56.aClass80_2.method7779(local229, local263, local250, "Mem:" + local261 + "k");
		local235 = local250 - 15;
	}
}
