import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!um", name = "e", descriptor = "I")
	public static int anInt7160;

	@OriginalMember(owner = "client!um", name = "i", descriptor = "Lclient!rt;")
	public static Class302 aClass302_7;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
	public static void method5754() {
		if (Static2.anInt65 < 0) {
			return;
		}
		@Pc(13) long local13 = Static480.method6650();
		Static2.anInt65 = (int) ((long) Static2.anInt65 + Static350.aLong157 - local13);
		if (Static2.anInt65 <= 0) {
			Static100.anInt1766 = Static516.aClass130_2.anInt3688;
			Static360.aFloat209 = Static516.aClass130_2.aFloat98;
			Static382.aFloat244 = Static516.aClass130_2.aFloat95;
			Static180.aFloat239 = Static516.aClass130_2.aFloat99;
			Static387.aFloat184 = Static516.aClass130_2.aFloat96;
			Static14.aClass209_1 = Static516.aClass130_2.aClass209_2;
			Static258.anInt4718 = Static516.aClass130_2.anInt3692;
			Static194.aFloat101 = Static516.aClass130_2.aFloat100;
			Static379.anInt6760 = Static516.aClass130_2.anInt3685;
			Static354.aFloat177 = Static516.aClass130_2.aFloat97;
			Static2.anInt65 = -1;
		} else {
			@Pc(63) int local63 = (Static2.anInt65 << 8) / Static394.anInt6985;
			@Pc(68) int local68 = 255 - local63;
			@Pc(73) float local73 = (float) local63 / 255.0F;
			@Pc(78) float local78 = 1.0F - local73;
			Static258.anInt4718 = ((Static516.aClass130_2.anInt3692 & 0xFF00FF) * local68 + local63 * (Static523.anInt7894 & 0xFF00FF) & 0xFF00FF00) + (local68 * (Static516.aClass130_2.anInt3692 & 0xFF00) + (Static523.anInt7894 & 0xFF00) * local63 & 0xFF0000) >>> 8;
			Static180.aFloat239 = Static138.aFloat81 + (Static516.aClass130_2.aFloat99 - Static138.aFloat81) * local78;
			Static379.anInt6760 = Static265.anInt4872 * local63 + local68 * Static516.aClass130_2.anInt3685 >> 8;
			Static382.aFloat244 = (Static516.aClass130_2.aFloat95 - Static580.aFloat242) * local78 + Static580.aFloat242;
			Static100.anInt1766 = ((Static516.aClass130_2.anInt3688 & 0xFF00) * local68 + (Static281.anInt5188 & 0xFF00) * local63 & 0xFF0000) + (local63 * (Static281.anInt5188 & 0xFF00FF) + (Static516.aClass130_2.anInt3688 & 0xFF00FF) * local68 & 0xFF00FF00) >>> 8;
			Static387.aFloat184 = Static169.aFloat89 + local78 * (Static516.aClass130_2.aFloat96 - Static169.aFloat89);
			Static354.aFloat177 = Static349.aFloat176 + (Static516.aClass130_2.aFloat97 - Static349.aFloat176) * local78;
			Static360.aFloat209 = (Static516.aClass130_2.aFloat98 - Static412.aFloat187) * local78 + Static412.aFloat187;
			Static194.aFloat101 = Static563.aFloat236 + local78 * (Static516.aClass130_2.aFloat100 - Static563.aFloat236);
			if (Static516.aClass130_2.aClass209_2 != Static367.aClass209_5) {
				Static14.aClass209_1 = Static432.aClass78_112.method6811(Static367.aClass209_5, Static516.aClass130_2.aClass209_2, local78, Static14.aClass209_1);
			}
		}
		Static350.aLong157 = local13;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(B)Lclient!wp;")
	public static Class1_Sub51 method5755() {
		if (Static287.aClass111_18 == null || Static17.aClass265_1 == null) {
			return null;
		}
		for (@Pc(21) Class1_Sub51 local21 = (Class1_Sub51) Static17.aClass265_1.method5636(); local21 != null; local21 = (Class1_Sub51) Static17.aClass265_1.method5636()) {
			@Pc(29) Class345 local29 = Static287.aClass113_3.method2595(local21.anInt9675);
			if (local29 != null && local29.aBoolean686 && local29.method7486(Static287.anInterface17_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static67.method1102(arg1)) {
			return;
		}
		if (Static549.aClass160ArrayArray2[arg1] == null) {
			Static67.method1104(Static115.aClass160ArrayArray1[arg1], -1, arg2, arg3, arg5, arg8, arg4, arg0, arg7, arg6);
		} else {
			Static67.method1104(Static549.aClass160ArrayArray2[arg1], -1, arg2, arg3, arg5, arg8, arg4, arg0, arg7, arg6);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)I")
	public static int method5759(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
