import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cj", name = "Q", descriptor = "Lclient!bf;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!cj", name = "S", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!cj", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static44.anInt996 * 128) {
			arg0 = Static44.anInt996 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static14.anInt369 * 128) {
			arg2 = Static14.anInt369 * 128 - 1;
		}
		Static71.anInt1411 = Class135.anIntArray472[arg3];
		Static295.anInt5859 = Class135.anIntArray474[arg3];
		Static166.anInt3056 = Class135.anIntArray472[arg4];
		Static190.anInt3638 = Class135.anIntArray474[arg4];
		Static3.anInt142 = arg0;
		Static254.anInt5887 = arg1;
		Static12.anInt356 = arg2;
		Static120.anInt2321 = arg0 / 128;
		Static20.anInt458 = arg2 / 128;
		Static104.anInt3085 = Static120.anInt2321 - Static167.anInt3094;
		if (Static104.anInt3085 < 0) {
			Static104.anInt3085 = 0;
		}
		Static97.anInt1857 = Static20.anInt458 - Static167.anInt3094;
		if (Static97.anInt1857 < 0) {
			Static97.anInt1857 = 0;
		}
		Static171.anInt3162 = Static120.anInt2321 + Static167.anInt3094;
		if (Static171.anInt3162 > Static44.anInt996) {
			Static171.anInt3162 = Static44.anInt996;
		}
		Static276.anInt5533 = Static20.anInt458 + Static167.anInt3094;
		if (Static276.anInt5533 > Static14.anInt369) {
			Static276.anInt5533 = Static14.anInt369;
		}
		@Pc(99) short local99;
		if (Static240.aBoolean369) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static167.anInt3094 + Static167.anInt3094 + 2; local104++) {
			for (local113 = 0; local113 < Static167.anInt3094 + Static167.anInt3094 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static167.anInt3094 << 7) - (Static3.anInt142 & 0x7F);
				@Pc(140) int local140 = (local113 - Static167.anInt3094 << 7) - (Static12.anInt356 & 0x7F);
				@Pc(146) int local146 = Static120.anInt2321 + local104 - Static167.anInt3094;
				@Pc(152) int local152 = Static20.anInt458 + local113 - Static167.anInt3094;
				if (local146 >= 0 && local152 >= 0 && local146 < Static44.anInt996 && local152 < Static14.anInt369) {
					@Pc(176) int local176;
					if (Static165.anIntArrayArrayArray13 == null) {
						local176 = Static152.anIntArrayArrayArray11[0][local146][local152] + 128 - Static254.anInt5887;
					} else {
						local176 = Static165.anIntArrayArrayArray13[0][local146][local152] + 128 - Static254.anInt5887;
					}
					@Pc(201) int local201 = Static152.anIntArrayArrayArray11[3][local146][local152] - Static254.anInt5887 - 1000;
					Static37.aBooleanArrayArray7[local104][local113] = Static214.method3389(local130, local201, local176, local140, local99);
				} else {
					Static37.aBooleanArrayArray7[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static167.anInt3094 + Static167.anInt3094 + 1; local104++) {
			for (local113 = 0; local113 < Static167.anInt3094 + Static167.anInt3094 + 1; local113++) {
				Static217.aBooleanArrayArray10[local104][local113] = Static37.aBooleanArrayArray7[local104][local113] || Static37.aBooleanArrayArray7[local104 + 1][local113] || Static37.aBooleanArrayArray7[local104][local113 + 1] || Static37.aBooleanArrayArray7[local104 + 1][local113 + 1];
			}
		}
		Static235.anIntArray574 = arg6;
		Static253.anIntArray601 = arg7;
		Static43.anIntArray128 = arg8;
		Static288.anIntArray677 = arg9;
		Static243.anIntArray587 = arg10;
		Static79.method2432();
		if (Static263.aClass1_Sub19ArrayArrayArray3 != null) {
			Static229.method3658(true);
			Static269.method4138(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static240.aBoolean369) {
				Static292.aBoolean438 = false;
				Static122.method1910(0, 0);
				Static34.method630(null);
				Static194.method2946();
			}
			Static229.method3658(false);
		}
		Static269.method4138(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!jj;)Lclient!ui;")
	public static Class35_Sub4 method747(@OriginalArg(1) Class1_Sub18 arg0) {
		return new Class35_Sub4(arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3109(), arg0.method3109(), arg0.method3122());
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!jj;)V")
	public static void method748(@OriginalArg(1) Class1_Sub18 arg0) {
		if (arg0.aByteArray71.length - arg0.anInt3911 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method3122();
		if (local20 < 0 || local20 > 11) {
			return;
		}
		@Pc(45) byte local45;
		if (local20 == 11) {
			local45 = 33;
		} else if (local20 == 10) {
			local45 = 32;
		} else if (local20 == 9) {
			local45 = 31;
		} else if (local20 == 8) {
			local45 = 30;
		} else if (local20 == 7) {
			local45 = 29;
		} else if (local20 == 6) {
			local45 = 28;
		} else if (local20 == 5) {
			local45 = 28;
		} else if (local20 == 4) {
			local45 = 24;
		} else if (local20 == 3) {
			local45 = 23;
		} else if (local20 == 2) {
			local45 = 22;
		} else if (local20 == 1) {
			local45 = 23;
		} else {
			local45 = 19;
		}
		if (arg0.aByteArray71.length - arg0.anInt3911 < local45) {
			return;
		}
		Static176.anInt3254 = arg0.method3122();
		if (Static176.anInt3254 < 1) {
			Static176.anInt3254 = 1;
		} else if (Static176.anInt3254 > 4) {
			Static176.anInt3254 = 4;
		}
		Static175.method2663(arg0.method3122() == 1);
		Static16.aBoolean33 = arg0.method3122() == 1;
		Static287.aBoolean429 = arg0.method3122() == 1;
		Static160.aBoolean222 = arg0.method3122() == 1;
		Static294.aBoolean443 = arg0.method3122() == 1;
		Static51.aBoolean91 = arg0.method3122() == 1;
		Static282.aBoolean446 = arg0.method3122() == 1;
		Static97.aBoolean136 = arg0.method3122() == 1;
		Static235.anInt4896 = arg0.method3122();
		if (Static235.anInt4896 > 2) {
			Static235.anInt4896 = 2;
		}
		if (local20 >= 2) {
			Static294.aBoolean445 = arg0.method3122() == 1;
		} else {
			Static294.aBoolean445 = arg0.method3122() == 1;
			arg0.method3122();
		}
		Static160.aBoolean223 = arg0.method3122() == 1;
		Static57.aBoolean97 = arg0.method3122() == 1;
		Static286.anInt5079 = arg0.method3122();
		if (Static286.anInt5079 > 2) {
			Static286.anInt5079 = 2;
		}
		Static29.anInt623 = Static286.anInt5079;
		Static99.aBoolean138 = arg0.method3122() == 1;
		Static73.anInt1433 = arg0.method3122();
		if (Static73.anInt1433 > 127) {
			Static73.anInt1433 = 127;
		}
		Static259.anInt5233 = arg0.method3122();
		Static267.anInt5346 = arg0.method3122();
		if (Static267.anInt5346 > 127) {
			Static267.anInt5346 = 127;
		}
		if (local20 >= 1) {
			Static224.anInt4699 = arg0.method3107();
			Static44.anInt997 = arg0.method3107();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method3122();
		}
		if (local20 >= 4) {
			@Pc(381) int local381 = arg0.method3122();
			if (Static47.anInt5868 < 96) {
				local381 = 0;
			}
			Static200.method3047(local381);
		}
		if (local20 >= 5) {
			Static152.anInt2837 = arg0.method3074();
		}
		if (local20 >= 6) {
			Static8.anInt239 = arg0.method3122();
		}
		if (local20 >= 7) {
			Static203.aBoolean299 = arg0.method3122() == 1;
		}
		if (local20 >= 8) {
			Static290.aBoolean436 = arg0.method3122() == 1;
		}
		if (local20 >= 9) {
			Static207.anInt4118 = arg0.method3122();
		}
		if (local20 >= 10) {
			Static41.aBoolean82 = arg0.method3122() != 0;
		}
		if (local20 >= 11) {
			Static273.aBoolean417 = arg0.method3122() != 0;
		}
	}
}
