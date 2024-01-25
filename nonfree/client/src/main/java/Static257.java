import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Lclient!rg;")
	public static Class275 aClass275_9;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZILclient!faa;I)V")
	public static void method5659(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = arg2.anInt2690;
		@Pc(17) int local17 = arg2.anInt2670;
		if (arg2.aByte27 == 0) {
			arg2.anInt2690 = arg2.anInt2616;
		} else if (arg2.aByte27 == 1) {
			arg2.anInt2690 = arg1 - arg2.anInt2616;
		} else if (arg2.aByte27 == 2) {
			arg2.anInt2690 = arg2.anInt2616 * arg1 >> 14;
		}
		if (arg2.aByte30 == 0) {
			arg2.anInt2670 = arg2.anInt2646;
		} else if (arg2.aByte30 == 1) {
			arg2.anInt2670 = arg3 - arg2.anInt2646;
		} else if (arg2.aByte30 == 2) {
			arg2.anInt2670 = arg3 * arg2.anInt2646 >> 14;
		}
		if (arg2.aByte27 == 4) {
			arg2.anInt2690 = arg2.anInt2670 * arg2.anInt2666 / arg2.anInt2628;
		}
		if (arg2.aByte30 == 4) {
			arg2.anInt2670 = arg2.anInt2628 * arg2.anInt2690 / arg2.anInt2666;
		}
		if (Static37.aBoolean48 && (Static74.method1044(arg2).anInt7305 != 0 || arg2.anInt2637 == 0)) {
			if (arg2.anInt2670 < 5 && arg2.anInt2690 < 5) {
				arg2.anInt2690 = 5;
				arg2.anInt2670 = 5;
			} else {
				if (arg2.anInt2670 <= 0) {
					arg2.anInt2670 = 5;
				}
				if (arg2.anInt2690 <= 0) {
					arg2.anInt2690 = 5;
				}
			}
		}
		if (Static44.anInt827 == arg2.anInt2625) {
			Static264.aClass97_13 = arg2;
		}
		if (arg0 && arg2.anObjectArray17 != null && (local14 != arg2.anInt2690 || local17 != arg2.anInt2670)) {
			@Pc(193) Class6_Sub1 local193 = new Class6_Sub1();
			local193.aClass97_2 = arg2;
			local193.anObjectArray1 = arg2.anObjectArray17;
			Static534.aClass298_190.method6812(local193);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5660(@OriginalArg(1) String arg0) {
		if (Static415.aStringArray33 == null) {
			Static189.method3217();
		}
		@Pc(14) String[] local14 = Static395.method5728(arg0, '\n');
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(22) int local22 = Static112.anInt1887; local22 > 0; local22--) {
				Static415.aStringArray33[local22] = Static415.aStringArray33[local22 - 1];
			}
			Static415.aStringArray33[0] = local14[local16];
			if (Static415.aStringArray33.length - 1 > Static112.anInt1887) {
				Static112.anInt1887++;
				if (Static446.anInt7893 > 0) {
					Static446.anInt7893++;
				}
			}
		}
	}
}
