import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!vh", name = "I", descriptor = "Lclient!e;")
	public static Class38 aClass38_5;

	@OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
	public static int anInt5372;

	@OriginalMember(owner = "client!vh", name = "Q", descriptor = "[I")
	public static int[] anIntArray589;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V")
	public static void method4466() {
		@Pc(6) Class13 local6 = Static184.aClass13_1;
		synchronized (Static184.aClass13_1) {
			Static3.anInt114 = Static241.anInt4478;
			Static112.anInt5355++;
			Static89.anInt1899 = Static276.anInt5076;
			Static14.anInt309 = Static24.anInt491;
			Static235.anInt4408 = Static56.anInt1205;
			Static186.anInt3549 = Static269.anInt4964;
			Static45.anInt1043 = Static178.anInt3546;
			Static279.aLong196 = Static267.aLong191;
			Static56.anInt1205 = 0;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIIII)V")
	public static void method4467(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class1_Sub5_Sub21 local9 = Static278.method4266(8, arg3);
		local9.method4062();
		local9.anInt4864 = arg0;
		local9.anInt4863 = arg2;
		local9.anInt4862 = arg1;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V")
	public static void method4469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class1_Sub16 local30 = Static254.aClass1_Sub16ArrayArrayArray3[local9][arg0][arg1] = Static254.aClass1_Sub16ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt2570--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt2573; local40++) {
					@Pc(49) Class45 local49 = local30.aClass45Array2[local40];
					if ((local49.aLong56 >> 29 & 0x3L) == 2L && local49.anInt1360 == arg0 && local49.anInt1359 == arg1) {
						local49.anInt1363--;
					}
				}
			}
		}
		if (Static254.aClass1_Sub16ArrayArrayArray3[0][arg0][arg1] == null) {
			Static254.aClass1_Sub16ArrayArrayArray3[0][arg0][arg1] = new Class1_Sub16(0, arg0, arg1);
		}
		Static254.aClass1_Sub16ArrayArrayArray3[0][arg0][arg1].aClass1_Sub16_1 = local7;
		Static254.aClass1_Sub16ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(B)V")
	public static void method4470() {
		if (Static115.method2108() || Static132.anInt2608 == Static247.anInt1590) {
			Static302.method4511();
			if (Static132.anInt2608 != Static259.anInt4815) {
				Static28.method513();
			}
		} else {
			Static131.method2287(Static132.anInt2608, Static130.anInt2581, false, Static138.aClass11_Sub4_Sub1_3.anIntArray406[0], false, Static133.anInt2638, Static138.aClass11_Sub4_Sub1_3.anIntArray407[0]);
		}
	}
}
