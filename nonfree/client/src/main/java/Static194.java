import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "F")
	public static float aFloat106;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "Lclient!qh;")
	public static final Class199 aClass199_186 = new Class199(512);

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "Z")
	public static boolean aBoolean809 = false;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!za;Z)V")
	public static void method5859(@OriginalArg(0) Class34 arg0) {
		@Pc(7) int local7 = Static129.anInt2365;
		@Pc(9) int local9 = Static187.anInt3228;
		@Pc(11) int local11 = Static413.anInt6778;
		@Pc(13) int local13 = Static387.anInt6440;
		arg0.method5729(local11, local7, local13, -10660793, local9);
		arg0.method5729(local11 - 2, local7 - -1, 16, -16777216, local9 + 1);
		arg0.method5767(local7 + 1, local13 + -19, local9 + 18, -16777216, -2 + local11);
		Static121.aClass76_2.method4587(-1, local9 + 14, Static420.aClass119_169.method2673(Static394.anInt6582), -10660793, local7 + 3);
		@Pc(72) int local72 = Static62.aClass96_1.method3872();
		@Pc(80) int local80 = Static62.aClass96_1.method3870();
		@Pc(82) int local82 = 0;
		for (@Pc(87) Class1_Sub19 local87 = (Class1_Sub19) Static202.aClass227_21.method4967(); local87 != null; local87 = (Class1_Sub19) Static202.aClass227_21.method4973()) {
			@Pc(102) int local102 = local9 + (-local82 + Static118.anInt2201 + -1) * 16 + 31;
			@Pc(104) short local104 = -1;
			if (local72 > local7 && local72 < local11 + local7 && local102 - 13 < local80 && local102 + 3 > local80 && local87.aBoolean275) {
				local104 = -256;
			}
			@Pc(133) int[] local133 = null;
			if (Static348.method4710(local87.anInt2416)) {
				local133 = Static342.aClass155_2.method3548((int) local87.aLong74).anIntArray301;
			} else if (local87.anInt2417 != -1) {
				local133 = Static342.aClass155_2.method3548(local87.anInt2417).anIntArray301;
			} else if (Static133.method2050(local87.anInt2416)) {
				@Pc(171) Class25_Sub5_Sub1_Sub1 local171 = Static87.aClass25_Sub5_Sub1_Sub1Array6[(int) local87.aLong74];
				if (local171 != null) {
					@Pc(176) Class54 local176 = local171.aClass54_1;
					if (local176.anIntArray67 != null) {
						local176 = local176.method1148(Static320.aClass249_2);
					}
					if (local176 != null) {
						local133 = local176.anIntArray68;
					}
				}
			} else if (Static385.method5050(local87.anInt2416)) {
				@Pc(210) Class68 local210;
				if (local87.anInt2416 == 1002) {
					local210 = Static341.aClass75_4.method1616((int) local87.aLong74);
				} else {
					local210 = Static341.aClass75_4.method1616((int) (local87.aLong74 >>> 32 & 0x7FFFFFFFL));
				}
				if (local210.anIntArray125 != null) {
					local210 = local210.method1535(Static320.aClass249_2);
				}
				if (local210 != null) {
					local133 = local210.anIntArray126;
				}
			}
			@Pc(239) String local239 = Static170.method2397(local87);
			if (local133 != null) {
				local239 = local239 + Static434.method5716(local133);
			}
			Static121.aClass76_2.method4591(Static57.aClass6Array3, local7 + 3, local102, local239, Static299.anIntArray502, local104);
			if (local87.aBoolean274) {
				Static17.aClass6_5.method5894(local7 + Static451.aClass89_10.method1995(local239) + 5, local102 + -12);
			}
			local82++;
		}
		Static87.method5266(Static413.anInt6778, Static187.anInt3228, Static129.anInt2365, Static387.anInt6440);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/lang/String;B)I")
	public static int method5865(@OriginalArg(1) String arg0) {
		return Static126.method2010(16, arg0);
	}
}
