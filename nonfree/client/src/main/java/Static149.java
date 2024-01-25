import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "F")
	public static float aFloat218;

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "Lclient!vj;")
	public static Class15 aClass15_10;

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "I")
	public static int anInt9153 = -1;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IILclient!ha;III)V")
	public static void method7699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class87 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg2.KA(arg4, arg1, arg3 + arg4, arg1 - -arg0);
		arg2.method7898(arg0, arg3, -16777216, arg1, arg4);
		if (Static334.anInt6170 < 100) {
			return;
		}
		@Pc(32) float local32 = (float) Static292.anInt8376 / (float) Static292.anInt8378;
		@Pc(34) int local34 = arg3;
		@Pc(36) int local36 = arg0;
		if (local32 < 1.0F) {
			local36 = (int) ((float) arg3 * local32);
		} else {
			local34 = (int) ((float) arg0 / local32);
		}
		@Pc(61) int local61 = arg4 + (arg3 - local34) / 2;
		@Pc(70) int local70 = arg1 + (arg0 - local36) / 2;
		if (Static119.aClass20_4 == null || Static119.aClass20_4.method4579() != arg3 || arg0 != Static119.aClass20_4.method4595()) {
			Static292.method7041(Static292.anInt8373, Static292.anInt8380 + Static292.anInt8376, Static292.anInt8378 + Static292.anInt8373, Static292.anInt8380, local61, local70, local34 + local61, local70 - -local36);
			Static292.method7032(arg2);
			Static119.aClass20_4 = arg2.method7927(local61, local70, local34, local36, false);
		}
		Static119.aClass20_4.method4582(local61, local70);
		@Pc(118) int local118 = Static296.anInt5545 * local34 / Static292.anInt8378;
		@Pc(124) int local124 = Static336.anInt6225 * local36 / Static292.anInt8376;
		@Pc(137) int local137 = local34 * Static263.anInt5131 / Static292.anInt8378 + local61;
		@Pc(150) int local150 = local70 + local36 - Static41.anInt942 * local36 / Static292.anInt8376 - local124;
		@Pc(152) int local152 = -1996554240;
		if (Static230.aClass63_16 == Static499.aClass63_15) {
			local152 = -1996488705;
		}
		arg2.aa(local137, local150, local118, local124, local152, 1);
		arg2.method7954(local137, local150, local118, local124, local152, 0);
		if (Static347.anInt6415 <= 0) {
			return;
		}
		@Pc(182) int local182;
		if (Static59.anInt1226 <= 50) {
			local182 = Static59.anInt1226 * 5;
		} else {
			local182 = (100 - Static59.anInt1226) * 5;
		}
		for (@Pc(195) Class2_Sub36 local195 = (Class2_Sub36) Static292.aClass238_57.method5833(); local195 != null; local195 = (Class2_Sub36) Static292.aClass238_57.method5838()) {
			@Pc(204) Class105 local204 = Static292.aClass248_4.method6347(local195.anInt6596);
			if (Static252.method4163(local204)) {
				@Pc(232) int local232;
				@Pc(244) int local244;
				if (Static432.anInt7737 == local195.anInt6596) {
					local232 = local195.anInt6587 * local34 / Static292.anInt8378 + local61;
					local244 = local70 + (Static292.anInt8376 - local195.anInt6590) * local36 / Static292.anInt8376;
					arg2.method7898(4, 4, local182 << 24 | 0xFFFF00, local244 - 2, local232 + -2);
				} else if (Static549.anInt9101 != -1 && Static549.anInt9101 == local204.anInt3320) {
					local232 = local195.anInt6587 * local34 / Static292.anInt8378 + local61;
					local244 = local36 * (Static292.anInt8376 - local195.anInt6590) / Static292.anInt8376 + local70;
					arg2.method7898(4, 4, local182 << 24 | 0xFFFF00, local244 - 2, local232 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BLclient!ae;)Lclient!ae;")
	public static Class2_Sub2_Sub1 method7701(@OriginalArg(1) Class2_Sub2_Sub1 arg0) {
		@Pc(19) Class2_Sub2_Sub1 local19 = arg0 == null ? new Class2_Sub2_Sub1() : new Class2_Sub2_Sub1(arg0);
		local19.method189();
		return local19;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IILclient!oea;Ljava/lang/String;)Lclient!pp;")
	public static Class264 method7703(@OriginalArg(2) Class87_Sub2 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static534.anIntArray623, 0);
		if (Static534.anIntArray623[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class264(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
