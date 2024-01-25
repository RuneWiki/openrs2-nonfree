import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString55 = "";

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Lclient!cj;")
	public static Class40 aClass40_2 = new Class40();

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
	public static int anInt4989 = 0;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
	public static void method3983() {
		Static330.method4350();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)V")
	public static void method3984(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(1, arg0);
		local8.method5523();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z")
	public static boolean method3985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method3986(@OriginalArg(1) Class135 arg0) {
		@Pc(11) int local11 = Static50.anInt816;
		@Pc(13) int local13 = Static328.anInt5318;
		@Pc(15) int local15 = Static128.anInt7338;
		@Pc(17) int local17 = Static30.anInt522;
		arg0.method5394(local15, local11, local17, local13, -10660793);
		arg0.method5394(local15 - 2, local11 - -1, 16, local13 + 1, -16777216);
		arg0.method5369(local11 + 1, local15 - 2, -16777216, local17 - 19, local13 + 18);
		Static49.aClass123_1.method5784(local11 + 3, -10660793, Static236.aClass15_64.method180(Static429.anInt6999), -1, local13 + 14);
		@Pc(76) int local76 = Static455.aClass48_1.method1138();
		@Pc(80) int local80 = Static455.aClass48_1.method1142();
		@Pc(82) int local82 = 0;
		for (@Pc(87) Class4_Sub30 local87 = (Class4_Sub30) Static41.aClass244_2.method5263(); local87 != null; local87 = (Class4_Sub30) Static41.aClass244_2.method5271()) {
			@Pc(102) int local102 = (Static351.anInt5841 - local82 - 1) * 16 + local13 + 31;
			@Pc(104) short local104 = -1;
			if (local11 < local76 && local11 + local15 > local76 && local80 > local102 - 13 && local102 + 3 > local80 && local87.aBoolean345) {
				local104 = -256;
			}
			@Pc(141) int[] local141 = null;
			if (Static176.method2473(local87.anInt4615)) {
				local141 = Static416.aClass64_2.method1372((int) local87.aLong136).anIntArray153;
			} else if (local87.anInt4620 != -1) {
				local141 = Static416.aClass64_2.method1372(local87.anInt4620).anIntArray153;
			} else if (Static418.method5662(local87.anInt4615)) {
				@Pc(206) Class8_Sub3_Sub1_Sub2 local206 = Static367.aClass8_Sub3_Sub1_Sub2Array1[(int) local87.aLong136];
				if (local206 != null) {
					@Pc(211) Class78 local211 = local206.aClass78_1;
					if (local211.anIntArray145 != null) {
						local211 = local211.method1547(Static52.aClass81_1);
					}
					if (local211 != null) {
						local141 = local211.anIntArray146;
					}
				}
			} else if (Static100.method1513(local87.anInt4615)) {
				@Pc(178) Class114 local178;
				if (local87.anInt4615 == 1004) {
					local178 = Static51.aClass151_1.method2917((int) local87.aLong136);
				} else {
					local178 = Static51.aClass151_1.method2917((int) (local87.aLong136 >>> 32 & 0x7FFFFFFFL));
				}
				if (local178.anIntArray235 != null) {
					local178 = local178.method2181(Static52.aClass81_1);
				}
				if (local178 != null) {
					local141 = local178.anIntArray233;
				}
			}
			@Pc(245) String local245 = Static156.method2205(local87);
			if (local141 != null) {
				local245 = local245 + Static24.method335(local141);
			}
			Static49.aClass123_1.method5792(Static226.anIntArray283, Static243.aClass95Array8, local102, local11 + 3, local245, local104);
			if (local87.aBoolean344) {
				Static23.aClass95_23.method5821(local11 + Static363.aClass158_11.method3038(local245) + 5, local102 + -12);
			}
			local82++;
		}
		Static420.method5668(Static50.anInt816, Static128.anInt7338, Static30.anInt522, Static328.anInt5318);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IBZI)I")
	public static int method3987(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class4_Sub25 local13 = Static242.method3222(arg1, arg0);
		if (local13 == null) {
			return 0;
		} else if (arg2 >= 0 && local13.anIntArray344.length > arg2) {
			return local13.anIntArray344[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!vn;Z)Z")
	public static boolean method3989(@OriginalArg(0) Class8_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static278.aClass41Array3 == Static169.aClass41Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5884();
		if (arg0.aShort100 < 0 || arg0.aShort99 < 0 || arg0.aShort101 >= Static81.anInt1606 || arg0.aShort98 >= Static18.anInt297) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort100; local34 <= arg0.aShort101; local34++) {
			for (local38 = arg0.aShort99; local38 <= arg0.aShort98; local38++) {
				@Pc(45) Class75 local45 = Static371.method4772(arg0.aByte99, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort100) {
						local49++;
					}
					if (local34 < arg0.aShort101) {
						local49 += 4;
					}
					if (local38 > arg0.aShort99) {
						local49 += 8;
					}
					if (local38 < arg0.aShort98) {
						local49 += 2;
					}
					@Pc(74) Class251 local74 = Static368.method4862(local49, arg0);
					@Pc(77) Class251 local77 = local45.aClass251_2;
					if (local77 == null) {
						local45.aClass251_2 = local74;
					} else {
						while (local77.aClass251_3 != null) {
							local77 = local77.aClass251_3;
						}
						local77.aClass251_3 = local74;
					}
					local45.aByte25 = (byte) (local45.aByte25 | local49);
					if (local6 && (Static169.anIntArrayArray37[local34][local38] & 0xFF000000) != 0) {
						local8 = Static169.anIntArrayArray37[local34][local38];
						local10 = Static240.aShortArrayArray4[local34][local38];
						local12 = Static436.aByteArrayArray19[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort100; local38 <= arg0.aShort101; local38++) {
				for (@Pc(150) int local150 = arg0.aShort99; local150 <= arg0.aShort98; local150++) {
					if ((Static169.anIntArrayArray37[local38][local150] & 0xFF000000) == 0) {
						Static169.anIntArrayArray37[local38][local150] = local8;
						Static240.aShortArrayArray4[local38][local150] = local10;
						Static436.aByteArrayArray19[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static298.aClass8_Sub3Array3[Static41.anInt669++] = arg0;
		}
		return true;
	}
}
