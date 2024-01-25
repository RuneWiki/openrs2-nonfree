import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!kaa", name = "B", descriptor = "Lclient!ok;")
	public static Class249 aClass249_2;

	@OriginalMember(owner = "client!kaa", name = "E", descriptor = "F")
	public static float aFloat124;

	@OriginalMember(owner = "client!kaa", name = "m", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_80 = new Class90(38, -2);

	@OriginalMember(owner = "client!kaa", name = "x", descriptor = "Lclient!mo;")
	public static final Class221 aClass221_16 = new Class221(32);

	@OriginalMember(owner = "client!kaa", name = "D", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_39 = new Class344(49, 1);

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "([BIIIZII)Z")
	public static boolean method4093(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(20) int local20;
		if (local9 == 0) {
			local20 = 0;
		} else {
			local20 = 8 - local9;
		}
		@Pc(33) int local33 = -((arg3 + 8 - 1) / 8);
		@Pc(42) int local42 = -((arg2 + 7) / 8);
		for (@Pc(44) int local44 = local33; local44 < 0; local44++) {
			for (@Pc(48) int local48 = local42; local48 < 0; local48++) {
				if (arg0[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local20;
			if (arg0[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[FIIIIFIII)V")
	public static void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg0 - arg6;
		@Pc(9) int local9 = arg3 - arg2;
		@Pc(17) int local17 = arg7 - arg4;
		@Pc(38) float local38 = (float) local9 * arg1[2] + arg1[0] * (float) local17 + (float) local5 * arg1[1];
		@Pc(59) float local59 = (float) local17 * arg1[3] + (float) local5 * arg1[4] + arg1[5] * (float) local9;
		@Pc(85) float local85 = (float) local5 * arg1[7] + (float) local17 * arg1[6] + arg1[8] * (float) local9;
		@Pc(100) float local100 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local85 * local85));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local59 / local100)) / 3.1415927F + arg5 + 0.5F;
		@Pc(129) float local129;
		if (arg8 == 1) {
			local129 = local111;
			local111 = -local124;
			local124 = local129;
		} else if (arg8 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg8 == 3) {
			local129 = local111;
			local111 = local124;
			local124 = -local129;
		}
		Static181.aFloat82 = local111;
		aFloat124 = local124;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIIIBII)V")
	public static void method4096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == arg0) {
			Static236.method3844(arg5, arg2, arg0, arg6, arg1, arg3);
		} else if (Static292.anInt5983 <= arg5 - arg0 && arg0 + arg5 <= Static61.anInt1627 && Static289.anInt5872 <= arg1 - arg4 && arg4 + arg1 <= Static160.anInt3347) {
			Static458.method6738(arg3, arg2, arg6, arg0, arg1, arg4, arg5);
		} else {
			Static466.method6802(arg2, arg3, arg0, arg6, arg1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(B)V")
	public static void method4099() {
		Static278.method4469(Static455.aClass4_Sub35_Sub1_1.anInt9923);
		@Pc(18) int local18 = (Static534.anInt9775 >> 12) + (Static242.anInt10133 >> 3);
		Static352.anInt6764 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 = 0;
		@Pc(32) int local32 = (Static114.anInt2613 >> 12) + (Static157.anInt3323 >> 3);
		Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3346(8, 8);
		Static559.anIntArray589 = new int[18];
		Static106.aByteArrayArray10 = new byte[18][];
		Static72.aByteArrayArray7 = new byte[18][];
		Static238.anIntArray272 = new int[18];
		Static466.aByteArrayArray26 = new byte[18][];
		Static154.anIntArray163 = new int[18];
		Static322.anIntArray351 = new int[18];
		Static33.aByteArrayArray1 = new byte[18][];
		Static366.anIntArrayArray36 = new int[18][4];
		Static151.anIntArray158 = new int[18];
		Static286.aByteArrayArray21 = new byte[18][];
		Static470.anIntArray520 = new int[18];
		@Pc(78) int local78 = 0;
		@Pc(98) int local98;
		for (@Pc(87) int local87 = (local18 - (Static338.anInt6508 >> 4)) / 8; local87 <= (local18 + (Static338.anInt6508 >> 4)) / 8; local87++) {
			for (local98 = (local32 - (Static390.anInt7654 >> 4)) / 8; local98 <= ((Static390.anInt7654 >> 4) + local32) / 8; local98++) {
				@Pc(107) int local107 = (local87 << 8) + local98;
				Static322.anIntArray351[local78] = local107;
				Static151.anIntArray158[local78] = Static46.aClass348_22.method7966("m" + local87 + "_" + local98);
				Static154.anIntArray163[local78] = Static46.aClass348_22.method7966("l" + local87 + "_" + local98);
				Static238.anIntArray272[local78] = Static46.aClass348_22.method7966("n" + local87 + "_" + local98);
				Static559.anIntArray589[local78] = Static46.aClass348_22.method7966("um" + local87 + "_" + local98);
				Static470.anIntArray520[local78] = Static46.aClass348_22.method7966("ul" + local87 + "_" + local98);
				if (Static238.anIntArray272[local78] == -1) {
					Static151.anIntArray158[local78] = -1;
					Static154.anIntArray163[local78] = -1;
					Static559.anIntArray589[local78] = -1;
					Static470.anIntArray520[local78] = -1;
				}
				local78++;
			}
		}
		for (local98 = local78; local98 < Static238.anIntArray272.length; local98++) {
			Static238.anIntArray272[local98] = -1;
			Static151.anIntArray158[local98] = -1;
			Static154.anIntArray163[local98] = -1;
			Static559.anIntArray589[local98] = -1;
			Static470.anIntArray520[local98] = -1;
		}
		@Pc(277) byte local277;
		if (Static9.anInt758 == 3) {
			local277 = 4;
		} else {
			local277 = 8;
		}
		Static564.method7994(local277, false, local32, local18);
	}
}
