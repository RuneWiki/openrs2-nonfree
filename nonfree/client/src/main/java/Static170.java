import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
	public static int anInt4398;

	@OriginalMember(owner = "client!v", name = "hb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1483 = Static49.method1293("Use");

	@OriginalMember(owner = "client!v", name = "T", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1480 = aClass70_1483;

	@OriginalMember(owner = "client!v", name = "U", descriptor = "[I")
	public static int[] anIntArray420 = new int[500];

	@OriginalMember(owner = "client!v", name = "V", descriptor = "I")
	public static int anInt4392 = 0;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1481 = Static49.method1293("headicons_pk");

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
	public static int anInt4396 = 0;

	@OriginalMember(owner = "client!v", name = "eb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1482 = Static49.method1293("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	public static void method3377() {
		aClass70_1481 = null;
		anIntArray420 = null;
		aClass70_1483 = null;
		aClass70_1482 = null;
		aClass70_1480 = null;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(II)V")
	public static void method3378(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static60.aClass1_Sub1_Sub1_Sub4_7.anIntArray374;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 1;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		for (@Pc(38) int local38 = 1; local38 < 103; local38++) {
			local51 = (103 - local38) * 4 * 512 + 24628;
			for (local53 = 1; local53 < 103; local53++) {
				if ((Static20.aByteArrayArrayArray1[arg0][local53][local38] & 0x18) == 0) {
					Static48.method1233(local8, local51, arg0, local53, local38);
				}
				if (arg0 < 3 && (Static20.aByteArrayArrayArray1[arg0 + 1][local53][local38] & 0x8) != 0) {
					Static48.method1233(local8, local51, arg0 + 1, local53, local38);
				}
				local51 += 4;
			}
		}
		local51 = (int) (Math.random() * 20.0D) + (228 - -((int) (Math.random() * 20.0D)) << 16) + (238 - (-((int) (Math.random() * 20.0D)) - -10) << 8) + 238 - 10;
		Static60.aClass1_Sub1_Sub1_Sub4_7.method3026();
		local53 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(162) int local162;
		for (@Pc(158) int local158 = 1; local158 < 103; local158++) {
			for (local162 = 1; local162 < 103; local162++) {
				if ((Static20.aByteArrayArrayArray1[arg0][local162][local158] & 0x18) == 0) {
					Static45.method1104(arg0, local53, local162, local51, local158);
				}
				if (arg0 < 3 && (Static20.aByteArrayArrayArray1[arg0 + 1][local162][local158] & 0x8) != 0) {
					Static45.method1104(arg0 + 1, local53, local162, local51, local158);
				}
			}
		}
		Static110.anInt3089 = 0;
		for (local162 = 0; local162 < 104; local162++) {
			for (@Pc(228) int local228 = 0; local228 < 104; local228++) {
				@Pc(235) long local235 = Static44.method1099(Static56.anInt1784, local162, local228);
				if (local235 != 0L) {
					@Pc(251) int local251 = Static176.method3433(Integer.MAX_VALUE & (int) (local235 >>> 32)).anInt1835;
					if (local251 >= 0) {
						@Pc(255) int local255 = local162;
						@Pc(257) int local257 = local228;
						if (local251 != 22 && local251 != 29 && local251 != 34 && local251 != 36 && local251 != 46 && local251 != 47 && local251 != 48) {
							@Pc(289) int[][] local289 = Static96.aClass59Array1[Static56.anInt1784].anIntArrayArray27;
							for (@Pc(291) int local291 = 0; local291 < 10; local291++) {
								@Pc(298) int local298 = (int) (Math.random() * 4.0D);
								if (local298 == 0 && local255 > 0 && local255 > local162 - 3 && (local289[local255 - 1][local257] & 0x12C0108) == 0) {
									local255--;
								}
								if (local298 == 1 && local255 < 103 && local255 < local162 + 3 && (local289[local255 + 1][local257] & 0x12C0180) == 0) {
									local255++;
								}
								if (local298 == 2 && local257 > 0 && local228 - 3 < local257 && (local289[local255][local257 - 1] & 0x12C0102) == 0) {
									local257--;
								}
								if (local298 == 3 && local257 < 103 && local257 < local228 + 3 && (local289[local255][local257 + 1] & 0x12C0120) == 0) {
									local257++;
								}
							}
						}
						Static114.aClass1_Sub1_Sub1_Sub4Array7[Static110.anInt3089] = Static40.aClass1_Sub1_Sub1_Sub4Array1[local251];
						Static41.anIntArray131[Static110.anInt3089] = local255;
						Static28.anIntArray54[Static110.anInt3089] = local257;
						Static110.anInt3089++;
					}
				}
			}
		}
		Static31.aClass14_1.method3223();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method3379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass34_1 != null && local7.aClass34_1.aLong59 == arg3) {
			return true;
		} else if (local7.aClass54_1 != null && local7.aClass54_1.aLong100 == arg3) {
			return true;
		} else if (local7.aClass7_1 != null && local7.aClass7_1.aLong15 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt2953; local46++) {
				if (local7.aClass53Array2[local46].aLong99 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
