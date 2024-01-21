import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!df", name = "E", descriptor = "Lclient!ka;")
	public static Class44 aClass44_1;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "[S")
	public static short[] aShortArray1 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Lclient!ai;")
	public static Class6 aClass6_209 = Static38.method685("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!df", name = "F", descriptor = "[I")
	public static int[] anIntArray34 = new int[500];

	@OriginalMember(owner = "client!df", name = "K", descriptor = "Lclient!ai;")
	public static Class6 aClass6_210 = Static38.method685("null");

	@OriginalMember(owner = "client!df", name = "O", descriptor = "I")
	public static int anInt763 = -1;

	@OriginalMember(owner = "client!df", name = "P", descriptor = "Lclient!ai;")
	public static Class6 aClass6_211 = Static38.method685("Fallen lassen");

	@OriginalMember(owner = "client!df", name = "V", descriptor = "I")
	public static int anInt768 = 128;

	@OriginalMember(owner = "client!df", name = "W", descriptor = "Lclient!ai;")
	private static Class6 aClass6_212 = Static38.method685("Examine");

	@OriginalMember(owner = "client!df", name = "Y", descriptor = "Lclient!ai;")
	public static Class6 aClass6_213 = aClass6_212;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)V")
	public static void method531(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static53.method2493(arg3, arg2, arg0 + arg3, arg1 + arg2);
		Static100.method1680();
		Static106.anInt4182++;
		Static170.method2689(true);
		Static85.method1461(true);
		Static170.method2689(false);
		Static85.method1461(false);
		Static159.method2552();
		Static7.method80();
		@Pc(39) int local39;
		@Pc(75) int local75;
		if (!Static115.aBoolean113) {
			local39 = anInt768;
			if (local39 < Static72.anInt1756 / 256) {
				local39 = Static72.anInt1756 / 256;
			}
			if (Static117.aBooleanArray8[4] && Static115.anIntArray235[4] + 128 > local39) {
				local39 = Static115.anIntArray235[4] + 128;
			}
			local75 = Static154.anInt3559 + Static137.anInt3191 & 0x7FF;
			Static140.method2162(Static131.method2041(Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672, Static36.anInt1020) - 50, local39 * 3 + 600, local39, Static68.anInt1725, local75, Static101.anInt2155);
		}
		if (Static115.aBoolean113) {
			local39 = Static14.method300();
		} else {
			local39 = Static2.method45();
		}
		@Pc(107) int local107 = Static12.anInt313;
		local75 = Static106.anInt4184;
		@Pc(111) int local111 = Static182.anInt4201;
		@Pc(113) int local113 = Static107.anInt2560;
		@Pc(115) int local115 = Static28.anInt722;
		@Pc(159) int local159;
		for (@Pc(117) int local117 = 0; local117 < 5; local117++) {
			if (Static117.aBooleanArray8[local117]) {
				local159 = (int) ((double) -Static15.anIntArray19[local117] + Math.random() * (double) (Static15.anIntArray19[local117] * 2 + 1) + Math.sin((double) Static68.anIntArray115[local117] * ((double) Static7.anIntArray5[local117] / 100.0D)) * (double) Static115.anIntArray235[local117]);
				if (local117 == 3) {
					Static182.anInt4201 = Static182.anInt4201 + local159 & 0x7FF;
				}
				if (local117 == 4) {
					Static107.anInt2560 += local159;
					if (Static107.anInt2560 < 128) {
						Static107.anInt2560 = 128;
					}
					if (Static107.anInt2560 > 383) {
						Static107.anInt2560 = 383;
					}
				}
				if (local117 == 2) {
					Static28.anInt722 += local159;
				}
				if (local117 == 0) {
					Static106.anInt4184 += local159;
				}
				if (local117 == 1) {
					Static12.anInt313 += local159;
				}
			}
		}
		local159 = Static69.anInt1736;
		@Pc(227) int local227 = Static77.anInt1906;
		if (arg3 <= local159 && arg0 + arg3 > local159 && local227 >= arg2 && local227 < arg2 + arg1) {
			Static147.anInt3492 = 0;
			Static147.anInt3496 = Static77.anInt1906 - arg2;
			Static147.aBoolean143 = true;
			Static147.anInt3493 = Static69.anInt1736 - arg3;
		} else {
			Static147.anInt3492 = 0;
			Static147.aBoolean143 = false;
		}
		Static58.method957();
		Static53.method2496(arg3, arg2, arg0, arg1, 0);
		Static58.method957();
		aClass44_1.method1262(Static106.anInt4184, Static12.anInt313, Static28.anInt722, Static107.anInt2560, Static182.anInt4201, local39);
		Static58.method957();
		aClass44_1.method1254();
		Static28.method516(arg2, arg3, arg0, arg1);
		Static92.method1500(arg2, arg3);
		((Class56) Static100.anInterface1_2).method1720(Static131.anInt3038);
		Static55.method936(arg1, arg3, arg0, arg2);
		Static107.anInt2560 = local113;
		Static12.anInt313 = local107;
		Static28.anInt722 = local115;
		Static106.anInt4184 = local75;
		Static182.anInt4201 = local111;
		if (Static118.aBoolean115 && Static59.method977() == 0) {
			Static118.aBoolean115 = false;
		}
		if (Static118.aBoolean115) {
			Static53.method2496(arg3, arg2, arg0, arg1, 0);
			Static59.method978(false, Static117.aClass6_801);
		}
		if (!Static118.aBoolean115 && !Static160.aBoolean24 && local159 >= arg3 && local159 < arg0 + arg3 && arg2 <= local227 && local227 < arg1 + arg2) {
			Static22.method389(local159, arg2, arg3, local227);
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
	public static void method536() {
		anIntArray34 = null;
		aClass6_213 = null;
		aClass6_211 = null;
		aClass44_1 = null;
		aClass6_210 = null;
		aShortArray1 = null;
		aClass6_209 = null;
		aClass6_212 = null;
	}
}
