import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
	public static int anInt3792;

	@OriginalMember(owner = "client!mi", name = "db", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!mi", name = "R", descriptor = "I")
	public static int anInt3787 = 0;

	@OriginalMember(owner = "client!mi", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17 = new String[500];

	@OriginalMember(owner = "client!mi", name = "W", descriptor = "[I")
	public static int[] anIntArray341 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "J")
	public static long aLong133 = 0L;

	@OriginalMember(owner = "client!mi", name = "Z", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!mi", name = "ab", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!mi", name = "eb", descriptor = "[I")
	public static int[] anIntArray342 = new int[1000];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIZ)I")
	public static int method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub28 local12 = (Class1_Sub28) Static84.aClass117_6.method3438((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < local12.anIntArray499.length; local32++) {
				if (local12.anIntArray500[local32] == arg1) {
					local30 += local12.anIntArray499[local32];
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILclient!sa;I)V")
	public static void method3077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class143 arg3) {
		if (Static111.anInt2398 >= 400) {
			return;
		}
		if (arg3.anIntArray535 != null) {
			arg3 = arg3.method4065();
		}
		if (arg3 == null || !arg3.aBoolean282) {
			return;
		}
		@Pc(30) String local30 = arg3.aString164;
		if (arg3.anInt5164 != 0) {
			@Pc(44) String local44 = Static230.anInt5101 == 1 ? Static234.aString163 : Static226.aString155;
			local30 = local30 + Static53.method1079(arg3.anInt5164, Static239.aClass25_Sub1_Sub1_2.anInt715) + " (" + local44 + arg3.anInt5164 + ")";
		}
		if (Static272.anInt5854 == 1) {
			Static106.method1718(Static180.anInt4069, (short) 26, arg0, arg1, Static95.aString70 + " -> <col=ffff00>" + local30, Static5.aString3, (long) arg2);
		} else if (Static16.aBoolean22) {
			@Pc(362) Class1_Sub2_Sub19 local362 = Static27.anInt755 == -1 ? null : Static114.method1863(Static27.anInt755);
			if ((Static177.anInt3986 & 0x2) != 0 && (local362 == null || arg3.method4073(local362.anInt5556, Static27.anInt755) != local362.anInt5556)) {
				Static106.method1718(Static266.anInt5785, (short) 40, arg0, arg1, Static128.aString80 + " -> <col=ffff00>" + local30, Static280.aString193, (long) arg2);
			}
		} else {
			@Pc(104) String[] local104 = arg3.aStringArray28;
			if (Static208.aBoolean246) {
				local104 = Static40.method1451(local104);
			}
			@Pc(116) int local116;
			if (local104 != null) {
				for (local116 = 4; local116 >= 0; local116--) {
					if (local104[local116] != null && (Static230.anInt5101 != 0 || !local104[local116].equalsIgnoreCase(Static167.aString111))) {
						@Pc(141) int local141 = -1;
						@Pc(143) byte local143 = 0;
						if (local116 == arg3.anInt5172) {
							local141 = arg3.anInt5178;
						}
						if (local116 == 0) {
							local143 = 12;
						}
						if (local116 == 1) {
							local143 = 42;
						}
						if (local116 == 2) {
							local143 = 15;
						}
						if (local116 == 3) {
							local143 = 14;
						}
						if (local116 == 4) {
							local143 = 13;
						}
						if (local116 == arg3.anInt5174) {
							local141 = arg3.anInt5159;
						}
						Static106.method1718(local141, local143, arg0, arg1, "<col=ffff00>" + local30, local104[local116], (long) arg2);
					}
				}
			}
			if (Static230.anInt5101 == 0 && local104 != null) {
				for (local116 = 4; local116 >= 0; local116--) {
					if (local104[local116] != null && local104[local116].equalsIgnoreCase(Static167.aString111)) {
						@Pc(249) short local249 = 0;
						if (Static239.aClass25_Sub1_Sub1_2.anInt715 < arg3.anInt5164) {
							local249 = 2000;
						}
						@Pc(262) short local262 = 0;
						if (local116 == 0) {
							local262 = 12;
						}
						if (local116 == 1) {
							local262 = 42;
						}
						if (local116 == 2) {
							local262 = 15;
						}
						if (local116 == 3) {
							local262 = 14;
						}
						if (local116 == 4) {
							local262 = 13;
						}
						if (local262 != 0) {
							local262 += local249;
						}
						Static106.method1718(arg3.anInt5171, local262, arg0, arg1, "<col=ffff00>" + local30, local104[local116], (long) arg2);
					}
				}
			}
			Static106.method1718(Static204.anInt4559, (short) 1004, arg0, arg1, "<col=ffff00>" + local30, Static140.aString92, (long) arg2);
		}
	}
}
