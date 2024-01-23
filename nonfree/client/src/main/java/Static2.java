import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "Lclient!ak;")
	public static Class7 aClass7_5;

	@OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lclient!nc;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "Lclient!hh;")
	public static Class69 aClass69_1 = new Class69();

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!qi;)I")
	public static int method57(@OriginalArg(1) Class6_Sub6_Sub1 arg0) {
		@Pc(8) Class19 local8 = arg0.aClass19_1;
		if (local8.anIntArray67 != null) {
			local8 = local8.method507();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local8.anInt641;
		@Pc(34) Class79 local34 = arg0.method3503();
		if (arg0.anInt4544 == local34.anInt2197) {
			local30 = local8.anInt672;
		} else if (arg0.anInt4544 == local34.anInt2225 || arg0.anInt4544 == local34.anInt2207 || arg0.anInt4544 == local34.anInt2214 || arg0.anInt4544 == local34.anInt2199) {
			local30 = local8.anInt646;
		} else if (arg0.anInt4544 == local34.anInt2221 || local34.anInt2205 == arg0.anInt4544 || local34.anInt2215 == arg0.anInt4544 || local34.anInt2196 == arg0.anInt4544) {
			local30 = local8.anInt640;
		}
		return local30;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method58(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg2 && arg4 == arg3 && arg1 == arg7 && arg6 == arg8) {
			Static224.method3589(arg2, arg6, arg1, arg3, arg5);
			return;
		}
		@Pc(25) int local25 = arg2;
		@Pc(27) int local27 = arg3;
		@Pc(31) int local31 = arg3 * 3;
		@Pc(35) int local35 = arg2 * 3;
		@Pc(39) int local39 = arg0 * 3;
		@Pc(43) int local43 = arg7 * 3;
		@Pc(54) int local54 = arg1 + local39 - arg2 - local43;
		@Pc(58) int local58 = arg4 * 3;
		@Pc(62) int local62 = arg8 * 3;
		@Pc(72) int local72 = arg6 + local58 - arg3 - local62;
		@Pc(76) int local76 = local39 - local35;
		@Pc(86) int local86 = local43 + local35 - local39 - local39;
		@Pc(97) int local97 = local62 + local31 - local58 - local58;
		@Pc(102) int local102 = local58 - local31;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(115) int local115 = local104 * local104 >> 12;
			@Pc(119) int local119 = local115 * local86;
			@Pc(123) int local123 = local76 * local104;
			@Pc(127) int local127 = local102 * local104;
			@Pc(133) int local133 = local115 * local104 >> 12;
			@Pc(137) int local137 = local133 * local54;
			@Pc(141) int local141 = local97 * local115;
			@Pc(145) int local145 = local133 * local72;
			@Pc(155) int local155 = arg2 + (local123 + local119 + local137 >> 12);
			@Pc(165) int local165 = arg3 + (local127 + local141 + local145 >> 12);
			Static224.method3589(local25, local165, local155, local27, arg5);
			local25 = local155;
			local27 = local165;
		}
	}

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "(I)V")
	public static void method59() {
		@Pc(10) int local10 = Static63.aClass1_Sub18_Sub1_1.method3129(8);
		@Pc(19) int local19;
		if (Static241.anInt4977 > local10) {
			for (local19 = local10; local19 < Static241.anInt4977; local19++) {
				Static246.anIntArray395[Static110.anInt2061++] = Static143.anIntArray331[local19];
			}
		}
		if (Static241.anInt4977 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static241.anInt4977 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(68) int local68 = Static143.anIntArray331[local19];
			@Pc(72) Class6_Sub6_Sub2 local72 = Static77.aClass6_Sub6_Sub2Array1[local68];
			@Pc(77) int local77 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
			if (local77 == 0) {
				Static143.anIntArray331[Static241.anInt4977++] = local68;
				local72.anInt4519 = Static261.anInt5259;
			} else {
				@Pc(99) int local99 = Static63.aClass1_Sub18_Sub1_1.method3129(2);
				if (local99 == 0) {
					Static143.anIntArray331[Static241.anInt4977++] = local68;
					local72.anInt4519 = Static261.anInt5259;
					Static294.anIntArray687[Static101.anInt1926++] = local68;
				} else {
					@Pc(145) int local145;
					@Pc(155) int local155;
					if (local99 == 1) {
						Static143.anIntArray331[Static241.anInt4977++] = local68;
						local72.anInt4519 = Static261.anInt5259;
						local145 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
						local72.method3513(1, local145);
						local155 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
						if (local155 == 1) {
							Static294.anIntArray687[Static101.anInt1926++] = local68;
						}
					} else if (local99 == 2) {
						Static143.anIntArray331[Static241.anInt4977++] = local68;
						local72.anInt4519 = Static261.anInt5259;
						if (Static63.aClass1_Sub18_Sub1_1.method3129(1) == 1) {
							local145 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
							local72.method3513(2, local145);
							local155 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
							local72.method3513(2, local155);
						} else {
							local145 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
							local72.method3513(0, local145);
						}
						local145 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
						if (local145 == 1) {
							Static294.anIntArray687[Static101.anInt1926++] = local68;
						}
					} else if (local99 == 3) {
						Static246.anIntArray395[Static110.anInt2061++] = local68;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(CLjava/lang/String;I)I")
	public static int method60(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) int local6 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local6; local12++) {
			if (arg1.charAt(local12) == arg0) {
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZB)V")
	public static void method62(@OriginalArg(0) boolean arg0) {
		@Pc(15) byte local15;
		@Pc(17) byte[][] local17;
		if (Static240.aBoolean369 && arg0) {
			local15 = 1;
			local17 = Static291.aByteArrayArray14;
		} else {
			local17 = Static242.aByteArrayArray11;
			local15 = 4;
		}
		@Pc(25) int[] local25 = null;
		for (@Pc(27) int local27 = 0; local27 < local15; local27++) {
			Static39.method716();
			for (@Pc(34) int local34 = 0; local34 < 13; local34++) {
				for (@Pc(41) int local41 = 0; local41 < 13; local41++) {
					@Pc(46) boolean local46 = false;
					@Pc(54) int local54 = Static185.anIntArrayArrayArray14[local27][local34][local41];
					if (local54 != -1) {
						@Pc(65) int local65 = local54 >> 24 & 0x3;
						if (!arg0 || local65 == 0) {
							@Pc(76) int local76 = local54 >> 1 & 0x3;
							@Pc(82) int local82 = local54 >> 14 & 0x3FF;
							@Pc(88) int local88 = local54 >> 3 & 0x7FF;
							@Pc(98) int local98 = local88 / 8 + (local82 / 8 << 8);
							for (@Pc(100) int local100 = 0; local100 < Static177.anIntArray389.length; local100++) {
								if (Static177.anIntArray389[local100] == local98 && local17[local100] != null) {
									local46 = true;
									@Pc(139) int[] local139 = Static134.method2139(local41 * 8, local82, local76, local27, Static27.aClass2Array1, local34 * 8, local65, local88, arg0, local17[local100]);
									if (local25 == null && local139 != null) {
										local25 = local139;
									}
									break;
								}
							}
						}
					}
					if (!local46) {
						Static265.method4065(local41 * 8, 8, local27, 8, local34 * 8);
					}
				}
			}
		}
		if (local25 == null) {
			Static139.anInt2613 = -1;
			return;
		}
		Static298.anInt5907 = local25[3];
		Static139.anInt2613 = local25[0];
		Static67.anInt1384 = local25[2];
		Static143.anInt2664 = local25[4];
		Static23.anInt5827 = local25[1];
	}
}
