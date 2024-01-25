import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
	public static int anInt4336;

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "[[Lclient!pq;")
	public static Class196[][] aClass196ArrayArray1;

	@OriginalMember(owner = "client!ng", name = "E", descriptor = "F")
	public static float aFloat109 = 0.25F;

	@OriginalMember(owner = "client!ng", name = "F", descriptor = "[F")
	public static final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!ng", name = "H", descriptor = "[Lclient!ck;")
	public static final Class5_Sub7[] aClass5_Sub7Array1 = new Class5_Sub7[1024];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ks;Z[[B)V")
	public static void method3445(@OriginalArg(0) Class113_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt3751; local11++) {
			Static341.method4427();
			for (@Pc(17) int local17 = 0; local17 < Static433.anInt7210 >> 3; local17++) {
				for (@Pc(21) int local21 = 0; local21 < Static418.anInt6969 >> 3; local21++) {
					@Pc(31) int local31 = Static403.anIntArrayArrayArray16[local11][local17][local21];
					if (local31 != -1) {
						@Pc(40) int local40 = local31 >> 24 & 0x3;
						if (!arg0.aBoolean242 || local40 == 0) {
							@Pc(54) int local54 = local31 >> 1 & 0x3;
							@Pc(60) int local60 = local31 >> 14 & 0x3FF;
							@Pc(66) int local66 = local31 >> 3 & 0x7FF;
							@Pc(76) int local76 = local66 / 8 + (local60 / 8 << 8);
							for (@Pc(78) int local78 = 0; local78 < Static362.anIntArray418.length; local78++) {
								if (local76 == Static362.anIntArray418[local78] && arg1[local78] != null) {
									arg0.method2984(arg1[local78], Static407.aClass200_9, local11, local21 * 8, (local66 & 0x7) * 8, local40, (local60 & 0x7) * 8, local17 * 8, local54, Static163.aClass240Array1);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BIILclient!fi;)V")
	public static void method3449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class76 arg2) {
		Static170.anInt2907 = arg1;
		Static223.anInt3726 = arg0;
		Static442.aClass76_15 = arg2;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIB)V")
	public static void method3452(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static226.anInt3761 = 3;
		Static93.anInt1623 = arg1;
		Static74.method1085(Static104.aClass165_2.aString50, Static104.aClass165_2.anInt4240);
		if (arg0) {
			Static157.method2214("", "");
		} else {
			Static59.method949();
			Static157.method2214(Static294.aString53, Static256.aString45);
		}
	}
}
