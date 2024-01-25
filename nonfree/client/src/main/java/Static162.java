import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	public static int anInt3026;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!lq;Z)Z")
	public static boolean method2630(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static105.aClass149Array1 == Static277.aClass149Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5975();
		if (arg0.aShort103 < 0 || arg0.aShort102 < 0 || arg0.aShort100 >= Static132.anInt2639 || arg0.aShort101 >= Static87.anInt1875) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort103; local34 <= arg0.aShort100; local34++) {
			for (local38 = arg0.aShort102; local38 <= arg0.aShort101; local38++) {
				@Pc(45) Class80 local45 = Static317.method4490(arg0.aByte100, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort103) {
						local49++;
					}
					if (local34 < arg0.aShort100) {
						local49 += 4;
					}
					if (local38 > arg0.aShort102) {
						local49 += 8;
					}
					if (local38 < arg0.aShort101) {
						local49 += 2;
					}
					@Pc(74) Class22 local74 = Static150.method2457(arg0, local49);
					@Pc(77) Class22 local77 = local45.aClass22_2;
					if (local77 == null) {
						local45.aClass22_2 = local74;
					} else {
						while (local77.aClass22_1 != null) {
							local77 = local77.aClass22_1;
						}
						local77.aClass22_1 = local74;
					}
					local45.aByte50 = (byte) (local45.aByte50 | local49);
					if (local6 && (Static222.anIntArrayArray41[local34][local38] & 0xFF000000) != 0) {
						local8 = Static222.anIntArrayArray41[local34][local38];
						local10 = Static34.aShortArrayArray1[local34][local38];
						local12 = Static443.aByteArrayArray21[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort103; local38 <= arg0.aShort100; local38++) {
				for (@Pc(150) int local150 = arg0.aShort102; local150 <= arg0.aShort101; local150++) {
					if ((Static222.anIntArrayArray41[local38][local150] & 0xFF000000) == 0) {
						Static222.anIntArrayArray41[local38][local150] = local8;
						Static34.aShortArrayArray1[local38][local150] = local10;
						Static443.aByteArrayArray21[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static429.aClass31_Sub2Array3[Static4.anInt121++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!la;Ljava/lang/String;Lclient!uq;ILclient!lm;IILclient!ma;II)V")
	public static void method2631(@OriginalArg(0) int arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class251 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class151 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class133 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(15) int local15;
		if (Static345.anInt5797 == 4) {
			local15 = (int) Static142.aFloat89 & 0x3FFF;
		} else {
			local15 = Static82.anInt1815 + (int) Static142.aFloat89 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg3.anInt6687 / 2, arg3.anInt6677 / 2) + 10;
		@Pc(42) int local42 = arg4 * arg4 + arg9 * arg9;
		if (local34 * local34 < local42) {
			return;
		}
		@Pc(52) int local52 = Class183.anIntArray433[local15];
		@Pc(56) int local56 = Class183.anIntArray434[local15];
		if (Static345.anInt5797 != 4) {
			local56 = local56 * 256 / (Static119.anInt840 + 256);
			local52 = local52 * 256 / (Static119.anInt840 + 256);
		}
		@Pc(85) int local85 = local56 * arg9 + arg4 * local52 >> 15;
		@Pc(96) int local96 = local56 * arg4 - arg9 * local52 >> 15;
		@Pc(103) int local103 = arg5.method3473(100, null, arg2);
		@Pc(109) int local109 = local85 - local103 / 2;
		@Pc(119) int local119 = arg5.method3474(arg2, null);
		if (-arg3.anInt6687 <= local109 && local109 <= arg3.anInt6687 && local96 >= -arg3.anInt6677 && arg3.anInt6677 >= local96) {
			arg1.method5459(arg10, local103, null, arg2, arg0, arg8, null, 50, arg7, arg3.anInt6687 / 2 + local109 + arg7, -arg6 + arg10 + (arg3.anInt6677 / 2 - local96) - local119, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2632(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub2_Sub6 local13 = Static371.method5808(2, arg1);
		local13.method1778();
		local13.aString18 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;IIBIIII)V")
	public static void method2633(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class4_Sub6 local7 = new Class4_Sub6();
		local7.anInt3839 = arg3;
		local7.anInt3847 = arg1;
		local7.anInt3840 = arg5 + Static378.anInt4244;
		local7.anInt3838 = arg4;
		local7.anInt3845 = arg6;
		local7.aString29 = arg0;
		local7.anInt3844 = arg2;
		Static54.aClass141_3.method3356(local7);
	}
}
