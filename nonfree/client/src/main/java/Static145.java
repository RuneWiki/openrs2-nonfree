import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
	public static int anInt6062;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "Lclient!cj;")
	public static Class27 aClass27_42;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray77;

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
	public static int anInt6067;

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "J")
	public static long aLong236;

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "[I")
	public static int[] anIntArray540;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
	public static int anInt6068;

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "Lclient!ci;")
	public static Class26 aClass26_58 = new Class26();

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "S")
	public static short aShort81 = 32767;

	@OriginalMember(owner = "client!kh", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString432 = "Attack";

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "Z")
	public static boolean aBoolean391 = false;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z")
	public static boolean method4650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static128.aBoolean171) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static34.aClass191ArrayArray1[local13] == null || Static34.aClass191ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class191 local35 = Static34.aClass191ArrayArray1[local13][local17];
		@Pc(49) int local49;
		if (arg1 == -1 && local35.anInt6086 == 0) {
			for (local49 = 0; local49 < Static181.anInt3973; local49++) {
				if (Static86.aShortArray64[local49] == 16 || Static86.aShortArray64[local49] == 1010 || Static86.aShortArray64[local49] == 24 || Static86.aShortArray64[local49] == 43 || Static86.aShortArray64[local49] == 31) {
					for (@Pc(90) Class191 local90 = Static171.method2789(Static256.anIntArray475[local49]); local90 != null; local90 = Static192.method3100(local90)) {
						if (local90.anInt6134 == local35.anInt6134) {
							return true;
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < Static181.anInt3973; local49++) {
				if (Static270.anIntArray485[local49] == arg1 && Static256.anIntArray475[local49] == local35.anInt6134 && (Static86.aShortArray64[local49] == 16 || Static86.aShortArray64[local49] == 1010 || Static86.aShortArray64[local49] == 24 || Static86.aShortArray64[local49] == 43 || Static86.aShortArray64[local49] == 31)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
	public static void method4651() {
		for (@Pc(13) int local13 = 0; local13 < Static168.anInt3772; local13++) {
			@Pc(20) int local20 = Static23.anIntArray55[local13]--;
			if (Static23.anIntArray55[local13] >= -10) {
				@Pc(95) Class172 local95 = Static150.aClass172Array1[local13];
				if (local95 == null) {
					local95 = Static325.method4139(Static281.aClass168_98, Static270.anIntArray486[local13], 0);
					if (local95 == null) {
						continue;
					}
					Static23.anIntArray55[local13] += local95.method4138();
					Static150.aClass172Array1[local13] = local95;
				}
				if (Static23.anIntArray55[local13] < 0) {
					@Pc(139) int local139;
					if (Static39.anIntArray122[local13] == 0) {
						local139 = Static256.anIntArray476[local13] * Static57.anInt6309 >> 8;
					} else {
						@Pc(149) int local149 = (Static39.anIntArray122[local13] & 0xFF) * 128;
						@Pc(157) int local157 = Static39.anIntArray122[local13] >> 16 & 0xFF;
						@Pc(166) int local166 = local157 * 128 + 64 - Static56.aClass2_Sub4_Sub2_1.anInt2846;
						if (local166 < 0) {
							local166 = -local166;
						}
						@Pc(180) int local180 = Static39.anIntArray122[local13] >> 8 & 0xFF;
						@Pc(190) int local190 = local180 * 128 + 64 - Static56.aClass2_Sub4_Sub2_1.anInt2794;
						if (local190 < 0) {
							local190 = -local190;
						}
						@Pc(204) int local204 = local166 + local190 - 128;
						if (local204 > local149) {
							Static23.anIntArray55[local13] = -100;
							continue;
						}
						if (local204 < 0) {
							local204 = 0;
						}
						local139 = Static286.anInt5742 * (local149 - local204) * Static256.anIntArray476[local13] / local149 >> 8;
					}
					if (local139 > 0) {
						@Pc(246) Class1_Sub11_Sub1 local246 = local95.method4136().method1619(Static189.aClass19_1);
						@Pc(251) Class1_Sub10_Sub4 local251 = Static327.method4375(local246, local139);
						local251.method4382(Static277.anIntArray502[local13] - 1);
						Static101.aClass1_Sub10_Sub2_2.method1863(local251);
					}
					Static23.anIntArray55[local13] = -100;
				}
			} else {
				Static168.anInt3772--;
				for (@Pc(34) int local34 = local13; local34 < Static168.anInt3772; local34++) {
					Static270.anIntArray486[local34] = Static270.anIntArray486[local34 + 1];
					Static150.aClass172Array1[local34] = Static150.aClass172Array1[local34 + 1];
					Static277.anIntArray502[local34] = Static277.anIntArray502[local34 + 1];
					Static23.anIntArray55[local34] = Static23.anIntArray55[local34 + 1];
					Static39.anIntArray122[local34] = Static39.anIntArray122[local34 + 1];
					Static256.anIntArray476[local34] = Static256.anIntArray476[local34 + 1];
				}
				local13--;
			}
		}
		if (Static82.aBoolean132 && !Static183.method2969()) {
			if (Static87.anInt2035 != 0 && Static107.anInt1667 != -1) {
				Static88.method1533(Static310.aClass168_209, Static107.anInt1667, Static87.anInt2035);
			}
			Static82.aBoolean132 = false;
		} else if (Static87.anInt2035 != 0 && Static107.anInt1667 != -1 && !Static183.method2969()) {
			Static2.aClass1_Sub14_Sub1_1.method2252(130);
			Static2.aClass1_Sub14_Sub1_1.method2236(Static107.anInt1667);
			Static107.anInt1667 = -1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method4653(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) String local10 = arg1.toLowerCase();
		@Pc(16) int local16 = arg0 ? 32768 : 0;
		@Pc(19) short[] local19 = new short[16];
		@Pc(27) int local27 = (arg0 ? Static17.anInt470 : Static272.anInt5455) + local16;
		for (@Pc(29) int local29 = local16; local29 < local27; local29++) {
			@Pc(36) Class1_Sub3_Sub17 local36 = Static240.method3781(local29);
			if (local36.aBoolean281 && local36.method3304().toLowerCase().indexOf(local10) != -1) {
				if (local7 >= 50) {
					Static11.anInt310 = -1;
					Static174.aShortArray95 = null;
					return;
				}
				if (local19.length <= local7) {
					@Pc(66) short[] local66 = new short[local19.length * 2];
					for (@Pc(68) int local68 = 0; local68 < local7; local68++) {
						local66[local68] = local19[local68];
					}
					local19 = local66;
				}
				local19[local7++] = (short) local29;
			}
		}
		Static195.anInt4269 = 0;
		Static11.anInt310 = local7;
		@Pc(98) String[] local98 = new String[Static11.anInt310];
		Static174.aShortArray95 = local19;
		for (@Pc(107) int local107 = 0; local107 < Static11.anInt310; local107++) {
			local98[local107] = Static240.method3781(local19[local107]).method3304();
		}
		Static275.method4161(Static174.aShortArray95, local98);
	}
}
