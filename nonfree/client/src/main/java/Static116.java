import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString96 = "K";

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	public static int anInt2558 = 0;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	public static int anInt2565 = 0;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "[I")
	public static final int[] anIntArray227 = new int[250];

	@OriginalMember(owner = "client!he", name = "y", descriptor = "Z")
	public static volatile boolean aBoolean180 = true;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2445(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static221.method3972("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIIBILclient!mo;)V")
	public static void method2446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class143 arg2) {
		Static99.aBoolean159 = false;
		Static106.anInt2365 = 1;
		Static285.aClass143_100 = arg2;
		Static355.anInt6755 = arg0;
		Static185.anInt3817 = 10000;
		Static104.anInt2321 = 0;
		Static270.anInt5151 = arg1;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BIIIIII)V")
	public static void method2454(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class113[] local7 = Static27.aClass113Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class113 local15 = local7[local9];
			if (local15 != null && local15.anInt3406 == 2) {
				Static279.method4728(arg1 >> 1, (local15.anInt3408 - Static151.anInt3234 << 7) + local15.anInt3417, arg3 >> 1, local15.anInt3418 * 2, (local15.anInt3413 - Static251.anInt3170 << 7) + local15.anInt3404);
				if (Static316.anIntArray309[0] > -1 && Static153.anInt3257 % 20 < 10) {
					Static257.aClass2Array12[local15.anInt3414].method2642(Static316.anIntArray309[0] + arg2 - 12, Static316.anIntArray309[1] + -28 + arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBIILclient!e;)V")
	public static void method2456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class46 arg4) {
		arg4.method5172(arg3, arg1, arg3 + arg0, arg2 + arg1);
		arg4.method5108(arg0, arg3, arg2, -16777216, arg1);
		if (Static315.anInt6452 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static241.anInt5680 / (float) Static241.anInt5687;
		@Pc(41) int local41 = arg0;
		@Pc(43) int local43 = arg2;
		if (local35 < 1.0F) {
			local43 = (int) (local35 * (float) arg0);
		} else {
			local41 = (int) ((float) arg2 / local35);
		}
		@Pc(70) int local70 = arg1 + (arg2 - local43) / 2;
		@Pc(78) int local78 = arg3 + (arg0 - local41) / 2;
		if (Static68.aClass2_3 == null || arg0 != Static68.aClass2_3.method2639() || Static68.aClass2_3.method2640() != arg2) {
			Static241.method5062(Static241.anInt5683, Static241.anInt5684 + Static241.anInt5680, Static241.anInt5687 + Static241.anInt5683, Static241.anInt5684, local78, local70, local41 + local78, local43 + local70);
			Static241.method5050(arg4);
			Static68.aClass2_3 = arg4.method5182(local78, local70, local41, local43, false);
		}
		Static68.aClass2_3.method2642(local78, local70);
		@Pc(133) int local133 = Static258.anInt4910 * local41 / Static241.anInt5687;
		@Pc(139) int local139 = local43 * Static331.anInt6401 / Static241.anInt5680;
		@Pc(148) int local148 = local78 + Static330.anInt6364 * local41 / Static241.anInt5687;
		@Pc(161) int local161 = local70 + local43 - local43 * Static107.anInt2397 / Static241.anInt5680 - local139;
		@Pc(163) int local163 = -1996554240;
		if (Static45.anInt1136 == 1) {
			local163 = -1996488705;
		}
		arg4.method5110(local148, local161, local133, local139, local163, 1);
		arg4.method5143(local148, local161, local133, local139, local163, 0);
		if (Static28.anInt659 <= 0) {
			return;
		}
		@Pc(198) int local198;
		if (Static331.anInt6398 <= 50) {
			local198 = Static331.anInt6398 * 5;
		} else {
			local198 = 500 - Static331.anInt6398 * 5;
		}
		for (@Pc(212) Class14_Sub5 local212 = (Class14_Sub5) Static241.aClass18_35.method459(); local212 != null; local212 = (Class14_Sub5) Static241.aClass18_35.method453()) {
			@Pc(219) Class52 local219 = Static247.method4306(local212.anInt725);
			if (Static32.method785(local219)) {
				@Pc(247) int local247;
				@Pc(259) int local259;
				if (Static118.anInt2594 == local212.anInt725) {
					local247 = local78 + local212.anInt736 * local41 / Static241.anInt5687;
					local259 = local70 + local43 * (Static241.anInt5680 - local212.anInt729) / Static241.anInt5680;
					arg4.method5108(4, local247 - 2, 4, local198 << 24 | 0xFFFF00, local259 - 2);
				} else if (Static17.anInt347 != -1 && Static17.anInt347 == local219.anInt1756) {
					local247 = local78 + local41 * local212.anInt736 / Static241.anInt5687;
					local259 = local70 + (Static241.anInt5680 - local212.anInt729) * local43 / Static241.anInt5680;
					arg4.method5108(4, local247 - 2, 4, local198 << 24 | 0xFFFF00, local259 - 2);
				}
			}
		}
	}
}
