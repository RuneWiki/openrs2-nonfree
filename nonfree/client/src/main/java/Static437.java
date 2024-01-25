import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!qga", name = "I", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!qga", name = "L", descriptor = "I")
	public static int anInt7021;

	@OriginalMember(owner = "client!qga", name = "J", descriptor = "Lclient!rf;")
	public static final Class297 aClass297_1 = new Class297();

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I[IIII)V")
	public static void method5735(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0--;
		@Pc(14) int local14 = arg2 - 1;
		@Pc(17) int local17 = local14 - 7;
		while (arg0 < local17) {
			@Pc(21) int local21 = arg0 + 1;
			arg1[local21] = arg3;
			@Pc(26) int local26 = local21 + 1;
			arg1[local26] = arg3;
			@Pc(31) int local31 = local26 + 1;
			arg1[local31] = arg3;
			@Pc(36) int local36 = local31 + 1;
			arg1[local36] = arg3;
			@Pc(41) int local41 = local36 + 1;
			arg1[local41] = arg3;
			@Pc(46) int local46 = local41 + 1;
			arg1[local46] = arg3;
			@Pc(51) int local51 = local46 + 1;
			arg1[local51] = arg3;
			arg0 = local51 + 1;
			arg1[arg0] = arg3;
		}
		while (local14 > arg0) {
			arg0++;
			arg1[arg0] = arg3;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IILclient!r;)V")
	public static void method5736(@OriginalArg(1) int arg0, @OriginalArg(2) Class162 arg1) {
		if (!Static431.aBoolean567) {
			Static475.anInt5125 = 0;
			return;
		}
		if (Static210.aBoolean221) {
			Static369.aLong270 = Static539.aClass139_1.method7431();
		}
		Static471.anInt7543 = 0;
		Static583.anInt9471 = 0;
		Static5.anInt96 = 0;
		@Pc(25) int[] local25 = arg1.v();
		Static491.anInt7778 = (int) ((float) local25[2] / 3.0F);
		Static249.anInt4134 = (int) ((float) local25[3] / 3.0F);
		arg1.method6811(Static580.anIntArray597);
		if ((int) ((float) Static580.anIntArray597[0] / 3.0F) != Static457.anInt7352 || Static197.anInt2876 != (int) ((float) Static580.anIntArray597[1] / 3.0F)) {
			Static457.anInt7352 = (int) ((float) Static580.anIntArray597[0] / 3.0F);
			Static197.anInt2876 = (int) ((float) Static580.anIntArray597[1] / 3.0F);
			Static519.anInt1794 = Static457.anInt7352 >> 1;
			Static394.anInt6526 = Static197.anInt2876 >> 1;
			Static390.anIntArray412 = new int[Static197.anInt2876 * Static457.anInt7352];
		}
		Static313.aClass25_5 = arg1.method6844();
		Static475.anInt5125 = 0;
		for (@Pc(102) int local102 = 0; local102 < Static211.anInt3064; local102++) {
			Static219.method2679(Static261.aClass91Array2[local102], arg1, arg0);
		}
		for (@Pc(123) int local123 = 0; local123 < Static540.anInt8911; local123++) {
			Static219.method2679(Static82.aClass91Array1[local123], arg1, arg0);
		}
		for (@Pc(138) int local138 = 0; local138 < Static397.anInt6548; local138++) {
			Static219.method2679(Static302.aClass91Array3[local138], arg1, arg0);
		}
		Static427.anInt6937 = 0;
		if (Static475.anInt5125 > 0) {
			@Pc(165) int local165 = Static390.anIntArray412.length;
			@Pc(171) int local171 = local165 - local165 & 0x7;
			@Pc(173) int local173 = 0;
			while (local171 > local173) {
				Static390.anIntArray412[local173++] = Integer.MAX_VALUE;
				Static390.anIntArray412[local173++] = Integer.MAX_VALUE;
				Static390.anIntArray412[local173++] = Integer.MAX_VALUE;
				Static390.anIntArray412[local173++] = Integer.MAX_VALUE;
				Static390.anIntArray412[local173++] = Integer.MAX_VALUE;
				Static390.anIntArray412[local173++] = Integer.MAX_VALUE;
				Static390.anIntArray412[local173++] = Integer.MAX_VALUE;
				Static390.anIntArray412[local173++] = Integer.MAX_VALUE;
			}
			while (local165 > local173) {
				Static390.anIntArray412[local173++] = Integer.MAX_VALUE;
			}
			Static487.anInt7739 = 1;
			for (@Pc(232) int local232 = 0; local232 < Static475.anInt5125; local232++) {
				@Pc(238) Class91 local238 = Static370.aClass91Array4[local232];
				Static183.method2352(local238.aShortArray57[1], local238.aShortArray56[1], local238.aShortArray57[3], local238.aShortArray56[3], local238.aShortArray57[0], local238.aShortArray55[0], local238.aShortArray56[0], local238.aShortArray55[3], local238.aShortArray55[1]);
				Static183.method2352(local238.aShortArray57[2], local238.aShortArray56[2], local238.aShortArray57[3], local238.aShortArray56[3], local238.aShortArray57[1], local238.aShortArray55[1], local238.aShortArray56[1], local238.aShortArray55[3], local238.aShortArray55[2]);
			}
			Static487.anInt7739 = 2;
		}
		if (Static210.aBoolean221) {
			Static43.aLong28 = Static539.aClass139_1.method7431() - Static369.aLong270;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILclient!pca;)I")
	public static int method5737(@OriginalArg(1) Class263 arg0) {
		if (arg0 == Static191.aClass263_2) {
			return 5890;
		} else if (Static491.aClass263_3 == arg0) {
			return 34167;
		} else if (Static64.aClass263_1 == arg0) {
			return 34168;
		} else if (Static504.aClass263_4 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
