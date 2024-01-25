import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "Lclient!pc;")
	public static Class188 aClass188_20;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "J")
	public static long aLong36 = 0L;

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "Lclient!ra;")
	public static final Class208 aClass208_2 = new Class208(1, 2, 2, 0);

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	public static void method879() {
		@Pc(9) int local9 = Static426.aClass2_Sub20_Sub1_2.method3737();
		@Pc(18) boolean local18 = Static426.aClass2_Sub20_Sub1_2.method3721() == 1;
		Static200.anInt7590 = Static426.aClass2_Sub20_Sub1_2.method3716();
		@Pc(26) int local26 = Static426.aClass2_Sub20_Sub1_2.method3732();
		@Pc(30) int local30 = Static426.aClass2_Sub20_Sub1_2.method3732();
		Static257.method3907(local9);
		Static426.aClass2_Sub20_Sub1_2.method2499();
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(55) int local55;
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			for (local42 = 0; local42 < Static81.anInt1950 >> 3; local42++) {
				for (local46 = 0; local46 < Static171.anInt3288 >> 3; local46++) {
					local55 = Static426.aClass2_Sub20_Sub1_2.method2505(1);
					if (local55 == 1) {
						Static293.anIntArrayArrayArray13[local38][local42][local46] = Static426.aClass2_Sub20_Sub1_2.method2505(26);
					} else {
						Static293.anIntArrayArrayArray13[local38][local42][local46] = -1;
					}
				}
			}
		}
		Static426.aClass2_Sub20_Sub1_2.method2506();
		local42 = (Static193.anInt3787 - Static426.aClass2_Sub20_Sub1_2.anInt4608) / 16;
		Static257.anIntArrayArray37 = new int[local42][4];
		for (local46 = 0; local46 < local42; local46++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static257.anIntArrayArray37[local46][local55] = Static426.aClass2_Sub20_Sub1_2.method3731();
			}
		}
		Static57.anIntArray69 = new int[local42];
		Static83.anIntArray110 = new int[local42];
		Static312.anIntArray200 = new int[local42];
		Static287.aByteArrayArray16 = new byte[local42][];
		Static280.aByteArrayArray14 = new byte[local42][];
		Static342.aByteArrayArray20 = new byte[local42][];
		Static253.aByteArrayArray12 = null;
		Static420.anIntArray494 = null;
		Static340.aByteArrayArray19 = new byte[local42][];
		Static170.anIntArray218 = new int[local42];
		Static96.anIntArray119 = new int[local42];
		local42 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(188) int local188 = 0; local188 < Static81.anInt1950 >> 3; local188++) {
				for (@Pc(192) int local192 = 0; local192 < Static171.anInt3288 >> 3; local192++) {
					@Pc(202) int local202 = Static293.anIntArrayArrayArray13[local55][local188][local192];
					if (local202 != -1) {
						@Pc(212) int local212 = local202 >> 14 & 0x3FF;
						@Pc(218) int local218 = local202 >> 3 & 0x7FF;
						@Pc(228) int local228 = local218 / 8 + (local212 / 8 << 8);
						for (@Pc(230) int local230 = 0; local230 < local42; local230++) {
							if (local228 == Static96.anIntArray119[local230]) {
								local228 = -1;
								break;
							}
						}
						if (local228 != -1) {
							Static96.anIntArray119[local42] = local228;
							@Pc(263) int local263 = local228 >> 8 & 0xFF;
							@Pc(267) int local267 = local228 & 0xFF;
							Static57.anIntArray69[local42] = Static438.aClass188_126.method4279("m" + local263 + "_" + local267);
							Static83.anIntArray110[local42] = Static438.aClass188_126.method4279("l" + local263 + "_" + local267);
							Static170.anIntArray218[local42] = Static438.aClass188_126.method4279("um" + local263 + "_" + local267);
							Static312.anIntArray200[local42] = Static438.aClass188_126.method4279("ul" + local263 + "_" + local267);
							local42++;
						}
					}
				}
			}
		}
		Static356.method4998(local30, local26, false, local18);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)V")
	public static void method880(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = arg2 + arg4;
		@Pc(18) int local18 = arg1 - arg2;
		for (@Pc(20) int local20 = arg4; local20 < local13; local20++) {
			Static49.method990(Static277.anIntArrayArray40[local20], arg3, arg0, arg5);
		}
		@Pc(42) int local42 = arg0 + arg2;
		for (@Pc(44) int local44 = arg1; local44 > local18; local44--) {
			Static49.method990(Static277.anIntArrayArray40[local44], arg3, arg0, arg5);
		}
		@Pc(62) int local62 = arg3 - arg2;
		for (@Pc(64) int local64 = local13; local64 <= local18; local64++) {
			@Pc(70) int[] local70 = Static277.anIntArrayArray40[local64];
			Static49.method990(local70, local42, arg0, arg5);
			Static49.method990(local70, arg3, local62, arg5);
		}
	}
}
