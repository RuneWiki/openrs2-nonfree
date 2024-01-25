import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "[Lclient!ff;")
	public static Class80[] aClass80Array2;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public static int anInt2905 = 0;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "[I")
	public static final int[] anIntArray308 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "[B")
	public static final byte[] aByteArray37 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public static void method2517() {
		Static186.aClass139_39.method3083(5);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZII)I")
	public static int method2519(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!b;I)V")
	public static void method2520(@OriginalArg(0) Class20 arg0) {
		Static126.anInt2390 = arg0.method230("p11_full");
		Static98.anInt1954 = arg0.method230("p12_full");
		Static120.anInt2264 = arg0.method230("b12_full");
		Static382.anInt6412 = arg0.method230("hitmarks");
		Static139.anInt2632 = arg0.method230("hitbar_default");
		Static92.anInt1898 = arg0.method230("timerbar_default");
		Static389.anInt6459 = arg0.method230("headicons_pk");
		Static50.anInt1073 = arg0.method230("headicons_prayer");
		Static229.anInt4044 = arg0.method230("hint_headicons");
		Static308.anInt5327 = arg0.method230("hint_mapmarkers");
		Static83.anInt1724 = arg0.method230("mapflag");
		Static308.anInt5330 = arg0.method230("cross");
		Static318.anInt2155 = arg0.method230("mapdots");
		Static316.anInt5435 = arg0.method230("scrollbar");
		Static289.anInt5034 = arg0.method230("name_icons");
		Static251.anInt4502 = arg0.method230("floorshadows");
		Static8.anInt6463 = arg0.method230("compass");
		Static366.anInt4864 = arg0.method230("otherlevel");
		Static199.anInt3570 = arg0.method230("hint_mapedge");
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
	public static void method2521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class48 local28 = Static69.aClass48ArrayArrayArray1[local9][arg0][arg1] = Static69.aClass48ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte12--;
				for (@Pc(40) Class50 local40 = local28.aClass50_1; local40 != null; local40 = local40.aClass50_2) {
					@Pc(44) Class28_Sub1 local44 = local40.aClass28_Sub1_1;
					if (local44.aShort89 == arg0 && local44.aShort87 == arg1) {
						local44.aByte73--;
					}
				}
			}
		}
		if (Static69.aClass48ArrayArrayArray1[0][arg0][arg1] == null) {
			Static69.aClass48ArrayArrayArray1[0][arg0][arg1] = new Class48(0, arg0, arg1);
			Static69.aClass48ArrayArrayArray1[0][arg0][arg1].aByte14 = 1;
		}
		Static69.aClass48ArrayArrayArray1[0][arg0][arg1].aClass48_1 = local7;
		Static69.aClass48ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ck;)V")
	public static void method2522(@OriginalArg(1) Class3_Sub5_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method854();
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static366.anInt4870; local12++) {
			local18 = Static3.anIntArray9[local12];
			if ((Static268.aByteArray60[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static268.aByteArray60[local18] = (byte) (Static268.aByteArray60[local18] | 0x2);
					local7--;
				} else {
					local43 = arg0.method859(1);
					if (local43 == 0) {
						local7 = Static169.method2614(arg0);
						Static268.aByteArray60[local18] = (byte) (Static268.aByteArray60[local18] | 0x2);
					} else {
						Static270.method5279(arg0, local18);
					}
				}
			}
		}
		arg0.method860();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method854();
		@Pc(124) int local124;
		for (local18 = 0; local18 < Static366.anInt4870; local18++) {
			local43 = Static3.anIntArray9[local18];
			if ((Static268.aByteArray60[local43] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static268.aByteArray60[local43] = (byte) (Static268.aByteArray60[local43] | 0x2);
				} else {
					local124 = arg0.method859(1);
					if (local124 == 0) {
						local7 = Static169.method2614(arg0);
						Static268.aByteArray60[local43] = (byte) (Static268.aByteArray60[local43] | 0x2);
					} else {
						Static270.method5279(arg0, local43);
					}
				}
			}
		}
		arg0.method860();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method854();
		@Pc(204) int local204;
		for (local43 = 0; local43 < Static259.anInt3006; local43++) {
			local124 = Static102.anIntArray202[local43];
			if ((Static268.aByteArray60[local124] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static268.aByteArray60[local124] = (byte) (Static268.aByteArray60[local124] | 0x2);
				} else {
					local204 = arg0.method859(1);
					if (local204 == 0) {
						local7 = Static169.method2614(arg0);
						Static268.aByteArray60[local124] = (byte) (Static268.aByteArray60[local124] | 0x2);
					} else if (Static207.method1893(arg0, local124)) {
						Static268.aByteArray60[local124] = (byte) (Static268.aByteArray60[local124] | 0x2);
					}
				}
			}
		}
		arg0.method860();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method854();
		for (local124 = 0; local124 < Static259.anInt3006; local124++) {
			local204 = Static102.anIntArray202[local124];
			if ((Static268.aByteArray60[local204] & 0x1) == 0) {
				if (local7 > 0) {
					Static268.aByteArray60[local204] = (byte) (Static268.aByteArray60[local204] | 0x2);
					local7--;
				} else {
					@Pc(291) int local291 = arg0.method859(1);
					if (local291 == 0) {
						local7 = Static169.method2614(arg0);
						Static268.aByteArray60[local204] = (byte) (Static268.aByteArray60[local204] | 0x2);
					} else if (Static207.method1893(arg0, local204)) {
						Static268.aByteArray60[local204] = (byte) (Static268.aByteArray60[local204] | 0x2);
					}
				}
			}
		}
		arg0.method860();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static366.anInt4870 = 0;
		Static259.anInt3006 = 0;
		for (local204 = 1; local204 < 2048; local204++) {
			Static268.aByteArray60[local204] = (byte) (Static268.aByteArray60[local204] >> 1);
			@Pc(359) Class28_Sub1_Sub1_Sub2 local359 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local204];
			if (local359 == null) {
				Static102.anIntArray202[Static259.anInt3006++] = local204;
			} else {
				Static3.anIntArray9[Static366.anInt4870++] = local204;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIZIIIIII)Z")
	public static boolean method2523(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray491[0];
		@Pc(13) int local13 = Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray490[0];
		if (local8 < 0 || local8 >= Static12.anInt161 || local13 < 0 || Static44.anInt787 <= local13) {
			return false;
		} else if (arg6 >= 0 && Static12.anInt161 > arg6 && arg4 >= 0 && Static44.anInt787 > arg4) {
			@Pc(62) int local62 = Static34.method529(arg0, arg6, arg2, Static151.anIntArray298, local8, arg3, arg4, Static271.anIntArray696, arg7, arg5, Static226.aClass28_Sub1_Sub1_Sub2_2.method4009(), arg1, Static160.aClass67Array3[Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73], local13);
			if (local62 < 1) {
				return false;
			}
			Static361.anInt6050 = Static151.anIntArray298[local62 - 1];
			Static109.anInt2145 = Static271.anIntArray696[local62 - 1];
			Static66.aBoolean72 = false;
			Static329.method5024();
			return true;
		} else {
			return false;
		}
	}
}
