import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!r", name = "d", descriptor = "I")
	public static int anInt2199;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "[I")
	public static int[] anIntArray246;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	public static int anInt2204;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!r", name = "q", descriptor = "Lclient!va;")
	public static Class61 aClass61_880 = Static88.method1421("backright2");

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!va;")
	public static Class61 aClass61_881 = Static88.method1421(":0");

	@OriginalMember(owner = "client!r", name = "B", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public static void method1281() {
		for (@Pc(15) Class10_Sub1_Sub5_Sub3 local15 = (Class10_Sub1_Sub5_Sub3) Static89.aClass9_9.method72(); local15 != null; local15 = (Class10_Sub1_Sub5_Sub3) Static89.aClass9_9.method81()) {
			if (Static101.anInt2582 != local15.anInt1291 || local15.anInt1286 < Static95.anInt2442) {
				local15.method1654();
			} else if (Static95.anInt2442 >= local15.anInt1293) {
				if (local15.anInt1296 > 0) {
					@Pc(59) Class10_Sub1_Sub5_Sub2_Sub1 local59 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local15.anInt1296 - 1];
					if (local59 != null && local59.anInt1654 >= 0 && local59.anInt1654 < 13312 && local59.anInt1649 >= 0 && local59.anInt1649 < 13312) {
						local15.method737(Static39.method230(local59.anInt1654, local15.anInt1291, local59.anInt1649) - local15.anInt1292, local59.anInt1649, local59.anInt1654, Static95.anInt2442);
					}
				}
				if (local15.anInt1296 < 0) {
					@Pc(109) int local109 = -local15.anInt1296 - 1;
					@Pc(118) Class10_Sub1_Sub5_Sub2_Sub2 local118;
					if (Static83.anInt2226 == local109) {
						local118 = Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1;
					} else {
						local118 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local109];
					}
					if (local118 != null && local118.anInt1654 >= 0 && local118.anInt1654 < 13312 && local118.anInt1649 >= 0 && local118.anInt1649 < 13312) {
						local15.method737(Static39.method230(local118.anInt1654, local15.anInt1291, local118.anInt1649) - local15.anInt1292, local118.anInt1649, local118.anInt1654, Static95.anInt2442);
					}
				}
				local15.method734(Static106.anInt2692);
				Static48.aClass54_1.method1354(Static101.anInt2582, (int) local15.aDouble8, (int) local15.aDouble9, (int) local15.aDouble2, 60, local15, local15.anInt1274, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIILclient!tc;)V")
	public static void method1282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class10_Sub10 arg6) {
		@Pc(34) int local34;
		if (arg5 < 0 || arg5 >= 104 || arg1 < 0 || arg1 >= 104) {
			while (true) {
				local34 = arg6.method1111();
				if (local34 == 0) {
					break;
				}
				if (local34 == 1) {
					arg6.method1111();
					break;
				}
				if (local34 <= 49) {
					arg6.method1111();
				}
			}
			return;
		}
		Static21.aByteArrayArrayArray4[arg3][arg5][arg1] = 0;
		while (true) {
			local34 = arg6.method1111();
			if (local34 == 0) {
				if (arg3 == 0) {
					Static37.anIntArrayArrayArray1[0][arg5][arg1] = -Static60.method902(arg0 + arg1 + 556238, 932731 - -arg5 + arg4) * 8;
				} else {
					Static37.anIntArrayArrayArray1[arg3][arg5][arg1] = Static37.anIntArrayArrayArray1[arg3 - 1][arg5][arg1] - 240;
				}
				break;
			}
			if (local34 == 1) {
				@Pc(90) int local90 = arg6.method1111();
				if (local90 == 1) {
					local90 = 0;
				}
				if (arg3 == 0) {
					Static37.anIntArrayArrayArray1[0][arg5][arg1] = -local90 * 8;
				} else {
					Static37.anIntArrayArrayArray1[arg3][arg5][arg1] = Static37.anIntArrayArrayArray1[arg3 - 1][arg5][arg1] - local90 * 8;
				}
				break;
			}
			if (local34 <= 49) {
				Static40.aByteArrayArrayArray7[arg3][arg5][arg1] = arg6.method1131();
				Static95.aByteArrayArrayArray9[arg3][arg5][arg1] = (byte) ((local34 - 2) / 4);
				Static27.aByteArrayArrayArray5[arg3][arg5][arg1] = (byte) (local34 + arg2 - 2 & 0x3);
			} else if (local34 <= 81) {
				Static21.aByteArrayArrayArray4[arg3][arg5][arg1] = (byte) (local34 - 49);
			} else {
				Static33.aByteArrayArrayArray6[arg3][arg5][arg1] = (byte) (local34 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public static void method1283() {
		aClass61_881 = null;
		aBigInteger2 = null;
		aClass61_880 = null;
		anIntArray246 = null;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	public static void method1284() {
		@Pc(7) int local7 = Static75.anInt2014;
		@Pc(9) int local9 = Static32.anInt942;
		@Pc(11) int local11 = Static80.anInt2153;
		@Pc(13) int local13 = Static67.anInt1771;
		Static45.method1531(local7, local9, local11, local13, 6116423);
		Static45.method1531(local7 + 1, local9 - -1, local11 - 2, 16, 0);
		Static45.method1523(local7 + 1, local9 - -18, local11 - 2, local13 - 19, 0);
		Static50.aClass10_Sub1_Sub1_Sub4_3.method1548(Static38.aClass61_449, local7 + 3, local9 + 14, 6116423);
		@Pc(59) int local59 = Static28.anInt889;
		@Pc(61) int local61 = Static17.anInt597;
		if (Static10.anInt311 == 0) {
			local61 -= 4;
			local59 -= 4;
		}
		if (Static10.anInt311 == 1) {
			local59 -= 553;
			local61 -= 205;
		}
		if (Static10.anInt311 == 2) {
			local59 -= 17;
			local61 -= 357;
		}
		for (@Pc(84) int local84 = 0; local84 < Static23.anInt747; local84++) {
			@Pc(98) int local98 = (Static23.anInt747 - local84 - 1) * 15 + local9 + 31;
			@Pc(100) int local100 = 16777215;
			if (local7 < local59 && local11 + local7 > local59 && local61 > local98 - 13 && local98 + 3 > local61) {
				local100 = 16776960;
			}
			Static50.aClass10_Sub1_Sub1_Sub4_3.method1554(Static19.aClass61Array7[local84], local7 + 3, local98, local100, true);
		}
	}
}
