import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "Lclient!kd;")
	public static Class6 aClass6_22;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "J")
	public static long aLong163 = 20000000L;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(II)V")
	public static void method4690(@OriginalArg(0) int arg0) {
		Static464.anInt8027 = arg0;
		Static495.aClass233_48.method5663();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!wq;[[B)V")
	public static void method4691(@OriginalArg(1) Class45_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(44) int local44;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt10205; local14++) {
			Static77.method1461();
			for (local20 = 0; local20 < Static3.anInt46 >> 3; local20++) {
				for (local24 = 0; local24 < Static270.anInt5194 >> 3; local24++) {
					local34 = Static447.anIntArrayArrayArray10[local14][local20][local24];
					if (local34 != -1) {
						local44 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean755 || local44 == 0) {
							@Pc(58) int local58 = local34 >> 1 & 0x3;
							@Pc(64) int local64 = local34 >> 14 & 0x3FF;
							@Pc(70) int local70 = local34 >> 3 & 0x7FF;
							@Pc(80) int local80 = local70 / 8 + (local64 / 8 << 8);
							for (@Pc(82) int local82 = 0; local82 < Static349.anIntArray395.length; local82++) {
								if (Static349.anIntArray395[local82] == local80 && arg1[local82] != null) {
									@Pc(100) Class2_Sub34 local100 = new Class2_Sub34(arg1[local82]);
									arg0.method8525(Static19.aClass179Array2, local44, local58, local64, local24 * 8, local20 * 8, local100, local70, local14);
									arg0.method8535(local44, local58, Static600.aClass87_15, local14, local20 * 8, local24 * 8, local64, local100, local70, local12[0] == -1 ? local12 : null);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg0.anInt10205; local20++) {
			Static77.method1461();
			for (local24 = 0; local24 < Static3.anInt46 >> 3; local24++) {
				for (local34 = 0; local34 < Static270.anInt5194 >> 3; local34++) {
					local44 = Static447.anIntArrayArrayArray10[local20][local24][local34];
					if (local44 == -1) {
						arg0.method8516(local34 * 8, local20, local24 * 8, 8, 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static587.aClass17_1 = Static571.aClass169_1.method4175(Static576.aClass343_1, local12[0], local12[1], local12[3], local12[2]);
			Static202.anInt4261 = local12[4];
		}
	}
}
