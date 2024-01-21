import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
	public static int anInt1762 = 1;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "Lclient!rf;")
	private static Class70 aClass70_558 = Static49.method1293("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
	public static int[] anIntArray179 = new int[5];

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "Lclient!rf;")
	public static Class70 aClass70_559 = Static49.method1293(":trade:");

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "Lclient!rf;")
	public static Class70 aClass70_560 = Static49.method1293("compass");

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "Lclient!rf;")
	public static Class70 aClass70_561 = aClass70_558;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public static void method1369() {
		aClass70_558 = null;
		aClass70_560 = null;
		aClass70_559 = null;
		aClass70_561 = null;
		anIntArray179 = null;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public static void method1370(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static100.aBoolean115) {
			Static44.method1102();
		} else if (arg0 != -1 && (arg0 != Static96.anInt2801 || !Static174.method3429()) && Static134.anInt3479 != 0 && !Static100.aBoolean115) {
			Static36.method922(0, Static124.aClass76_Sub1_12, Static134.anInt3479, arg0);
		}
		Static96.anInt2801 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
	public static void method1371() {
		if (Static121.aClass63_1 != null) {
			@Pc(11) Class63 local11 = Static121.aClass63_1;
			synchronized (Static121.aClass63_1) {
				Static121.aClass63_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	public static void method1372() {
		if (!Static25.aBoolean28) {
			return;
		}
		Static54.aClass1_Sub1_Sub1_Sub4_6 = null;
		Static2.aClass1_Sub1_Sub1_Sub3Array1 = null;
		Static168.aClass1_Sub1_Sub1_Sub4_8 = null;
		Static12.anIntArray27 = null;
		Static54.aClass1_Sub1_Sub1_Sub4Array2 = null;
		Static101.anIntArray271 = null;
		Static5.aClass1_Sub1_Sub1_Sub4_1 = null;
		Static106.aClass1_Sub1_Sub1_Sub3Array7 = null;
		Static24.anIntArray40 = null;
		Static37.aClass1_Sub1_Sub1_Sub4_4 = null;
		Static151.aClass1_Sub1_Sub1_Sub3Array10 = null;
		Static182.anIntArray433 = null;
		Static100.aClass1_Sub1_Sub1_Sub3_3 = null;
		Static75.aClass1_Sub1_Sub1_Sub3_2 = null;
		Static57.anIntArray187 = null;
		Static44.anIntArray149 = null;
		Static66.aClass1_Sub1_Sub1_Sub3_1 = null;
		Static51.aClass1_Sub1_Sub1_Sub3Array4 = null;
		Static137.anIntArray345 = null;
		Static88.aClass1_Sub1_Sub1_Sub3Array6 = null;
		Static116.aClass1_Sub1_Sub1_Sub3_4 = null;
		Static41.anIntArray132 = null;
		Static8.method246();
		Static89.method1932(true);
		Static25.aBoolean28 = false;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ei;IIIII)V")
	public static void method1373(@OriginalArg(0) Class1_Sub1_Sub4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static40.anInt1398) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static73.anInt2250) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static85.anInt2550 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class1_Sub17 local62 = Static90.aClass1_Sub17ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static92.anIntArrayArrayArray7[local17][local23][local32] + Static92.anIntArrayArrayArray7[local17][local23 + 1][local32] + Static92.anIntArrayArrayArray7[local17][local23][local32 + 1] + Static92.anIntArrayArrayArray7[local17][local23 + 1][local32 + 1]) / 4 - (Static92.anIntArrayArrayArray7[arg1][arg2][arg3] + Static92.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + Static92.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + Static92.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class34 local151 = local62.aClass34_1;
									if (local151 != null) {
										@Pc(161) Class1_Sub1_Sub4_Sub3 local161;
										if (local151.aClass1_Sub1_Sub4_2 instanceof Class1_Sub1_Sub4_Sub3) {
											local161 = (Class1_Sub1_Sub4_Sub3) local151.aClass1_Sub1_Sub4_2;
											Static46.method1142(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass1_Sub1_Sub4_3 instanceof Class1_Sub1_Sub4_Sub3) {
											local161 = (Class1_Sub1_Sub4_Sub3) local151.aClass1_Sub1_Sub4_3;
											Static46.method1142(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(225) int local225 = 0; local225 < local62.anInt2953; local225++) {
										@Pc(231) Class53 local231 = local62.aClass53Array2[local225];
										if (local231 != null && local231.aClass1_Sub1_Sub4_4 instanceof Class1_Sub1_Sub4_Sub3) {
											@Pc(241) Class1_Sub1_Sub4_Sub3 local241 = (Class1_Sub1_Sub4_Sub3) local231.aClass1_Sub1_Sub4_4;
											@Pc(249) int local249 = local231.anInt3111 + 1 - local231.anInt3109;
											@Pc(257) int local257 = local231.anInt3101 + 1 - local231.anInt3107;
											Static46.method1142(arg0, local241, (local231.anInt3109 - arg2) * 128 + (local249 - arg4) * 64, local148, (local231.anInt3107 - arg3) * 128 + (local257 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
