import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!oj", name = "bb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1153 = Static64.method1101("b12_full");

	@OriginalMember(owner = "client!oj", name = "gb", descriptor = "B")
	public static byte aByte14 = 0;

	@OriginalMember(owner = "client!oj", name = "hb", descriptor = "[S")
	public static short[] aShortArray21 = new short[256];

	@OriginalMember(owner = "client!oj", name = "jb", descriptor = "I")
	public static int anInt3252 = 100;

	@OriginalMember(owner = "client!oj", name = "kb", descriptor = "I")
	public static int anInt3253 = 0;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ia;I)V")
	public static void method2566(@OriginalArg(0) Class51 arg0) {
		if (Static24.anInt604 >= 2) {
			@Pc(17) int local17;
			@Pc(36) int local36;
			if (arg0.method1401(Static113.aClass51_824)) {
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				@Pc(26) Runtime local26 = Runtime.getRuntime();
				local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static164.method2798(0, Static150.method2574(new Class51[] { Static2.aClass51_38, Static27.method511(local36), Static230.aClass51_1662 }), null);
			}
			if (arg0.method1401(Static83.aClass51_618)) {
				Static127.method2209();
			}
			if (arg0.method1401(Static229.aClass51_1658)) {
				Static142.method2482(25);
			}
			if (arg0.method1401(Static152.aClass51_1177)) {
				Static48.aBoolean56 = true;
			}
			if (arg0.method1401(Static105.aClass51_767)) {
				Static48.aBoolean56 = false;
			}
			if (arg0.method1401(Static161.aClass51_1229)) {
				for (local17 = 0; local17 < 4; local17++) {
					for (@Pc(100) int local100 = 1; local100 < 103; local100++) {
						for (local36 = 1; local36 < 103; local36++) {
							Static228.aClass90Array1[local17].anIntArrayArray22[local100][local36] = 0;
						}
					}
				}
			}
			if (arg0.method1393(Static109.aClass51_792) && Static147.anInt3191 != 0) {
				Static104.method1767(arg0.method1394(6).method1428());
			}
			if (arg0.method1401(Static163.aClass51_1235) && Static147.anInt3191 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1393(Static89.aClass51_413)) {
				Static36.anInt871 = arg0.method1394(12).method1436().method1428();
				Static164.method2798(0, Static150.method2574(new Class51[] { Static41.aClass51_281, Static27.method511(Static36.anInt871) }), null);
			}
			if (arg0.method1401(Static70.aClass51_546)) {
				Static135.aBoolean135 = true;
			}
		}
		Static167.aClass1_Sub16_Sub1_2.method3823(235);
		Static167.aClass1_Sub16_Sub1_2.method3765(arg0.method1399() - 1);
		Static167.aClass1_Sub16_Sub1_2.method3810(arg0.method1394(2));
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIILclient!ij;Lclient!ij;IIIIJ)V")
	public static void method2567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class65 local6 = new Class65();
		local6.aLong85 = arg10;
		local6.anInt2432 = arg1 * 128 + 64;
		local6.anInt2434 = arg2 * 128 + 64;
		local6.anInt2425 = arg3;
		local6.aClass5_3 = arg4;
		local6.aClass5_4 = arg5;
		local6.anInt2433 = arg6;
		local6.anInt2431 = arg7;
		local6.anInt2426 = arg8;
		local6.anInt2428 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static22.aClass1_Sub7ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static22.aClass1_Sub7ArrayArrayArray1[local46][arg1][arg2] = new Class1_Sub7(local46, arg1, arg2);
			}
		}
		Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass65_1 = local6;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
	public static void method2569() {
		for (@Pc(11) int local11 = 0; local11 < Static58.anInt1372; local11++) {
			@Pc(17) int local17 = Static202.anIntArray326[local11];
			@Pc(21) Class5_Sub1_Sub2 local21 = Static168.aClass5_Sub1_Sub2Array1[local17];
			if (local21 != null) {
				Static208.method3446(local21, local21.aClass27_1.anInt822);
			}
		}
	}
}
