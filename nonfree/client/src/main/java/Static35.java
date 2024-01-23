import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "[I")
	public static int[] anIntArray54;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "[I")
	public static int[] anIntArray55 = new int[4096];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)V")
	public static void method532(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub16 local12 = (Class3_Sub16) Static49.aClass30_5.method663((long) arg0);
		if (local12 != null) {
			for (@Pc(24) int local24 = 0; local24 < local12.anIntArray294.length; local24++) {
				local12.anIntArray294[local24] = -1;
				local12.anIntArray293[local24] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBIII)V")
	public static void method534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static123.anInt2326; local3++) {
			if (arg3 < Static150.anIntArray329[local3] + Static125.anIntArray288[local3] && arg3 + arg1 > Static150.anIntArray329[local3] && arg2 < Static73.anIntArray134[local3] + Static278.anIntArray540[local3] && arg2 + arg0 > Static73.anIntArray134[local3]) {
				Static292.aBooleanArray129[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIIIIIII[Lclient!rk;[B)V")
	public static void method535(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class153[] arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(13) int local13 = -1;
		@Pc(18) Class3_Sub26 local18 = new Class3_Sub26(arg9);
		while (true) {
			@Pc(22) int local22 = local18.method3942();
			if (local22 == 0) {
				return;
			}
			local13 += local22;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method3904();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(54) int local54 = local35 & 0x3F;
				@Pc(58) int local58 = local35 >> 12;
				@Pc(64) int local64 = local18.method3915();
				@Pc(70) int local70 = local35 >> 6 & 0x3F;
				@Pc(74) int local74 = local64 >> 2;
				@Pc(78) int local78 = local64 & 0x3;
				if (arg1 == local58 && local70 >= arg2 && local70 < arg2 + 8 && local54 >= arg3 && arg3 + 8 > local54) {
					@Pc(101) Class49 local101 = Static175.method2874(local13);
					@Pc(119) int local119 = arg5 + Static111.method1789(local78, local101.anInt1360, local101.anInt1329, local54 & 0x7, local70 & 0x7, arg7);
					@Pc(136) int local136 = Static28.method428(arg7, local54 & 0x7, local101.anInt1329, local70 & 0x7, local101.anInt1360, local78) + arg4;
					if (local119 > 0 && local136 > 0 && local119 < 103 && local136 < 103) {
						@Pc(154) Class153 local154 = null;
						if (!arg0) {
							@Pc(158) int local158 = arg6;
							if ((Static41.aByteArrayArrayArray2[1][local119][local136] & 0x2) == 2) {
								local158 = arg6 - 1;
							}
							if (local158 >= 0) {
								local154 = arg8[local158];
							}
						}
						Static54.method839(local13, local74, !arg0, local136, arg6, arg6, local119, arg0, arg7 + local78 & 0x3, local154);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!fe;I)V")
	public static void method537(@OriginalArg(0) Class3_Sub10 arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0.anInt1471 == 0) {
			local5 = Static148.method2517(arg0.anInt1477, arg0.anInt1465, arg0.anInt1475);
		}
		if (arg0.anInt1471 == 1) {
			local5 = Static272.method2771(arg0.anInt1477, arg0.anInt1465, arg0.anInt1475);
		}
		@Pc(34) int local34 = -1;
		if (arg0.anInt1471 == 2) {
			local5 = Static75.method1163(arg0.anInt1477, arg0.anInt1465, arg0.anInt1475);
		}
		@Pc(50) int local50 = 0;
		if (arg0.anInt1471 == 3) {
			local5 = Static56.method917(arg0.anInt1477, arg0.anInt1465, arg0.anInt1475);
		}
		@Pc(66) int local66 = 0;
		if (local5 != 0L) {
			local66 = (int) local5 >> 14 & 0x1F;
			local34 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
			local50 = (int) local5 >> 20 & 0x3;
		}
		arg0.anInt1470 = local66;
		arg0.anInt1473 = local34;
		arg0.anInt1480 = local50;
	}
}
