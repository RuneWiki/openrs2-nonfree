import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "[[Lclient!aq;")
	public static Class12[][] aClass12ArrayArray1;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "Lclient!wo;")
	public static Class216 aClass216_97;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "Z")
	public static boolean aBoolean657 = true;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_193 = new Class34("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!nh;B)V")
	public static void method5579(@OriginalArg(0) Class143 arg0) {
		@Pc(7) Class90 local7 = null;
		try {
			@Pc(11) Class162 local11 = arg0.method3899();
			while (local11.anInt4801 == 0) {
				Static190.method3690(1L);
			}
			if (local11.anInt4801 == 1) {
				local7 = (Class90) local11.anObject5;
				@Pc(38) Class1_Sub8 local38 = Static238.method4348();
				local7.method2564(local38.anInt5182, 0, local38.aByteArray81);
			}
		} catch (@Pc(48) Exception local48) {
		}
		try {
			if (local7 != null) {
				local7.method2565();
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!wo;)V")
	public static void method5580(@OriginalArg(1) Class216 arg0) {
		Class17_Sub1_Sub2.lb = arg0.method5660("titlebg");
		Static126.anInt2821 = arg0.method5660("logo");
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII)I")
	public static int method5582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (arg2 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!uo;ILclient!ip;[[I[[BILclient!ip;I[[B[[B[[BZI)V")
	public static void method5583(@OriginalArg(0) Class32 arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class53 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11) {
		for (@Pc(3) int local3 = 0; local3 < arg6; local3++) {
			for (@Pc(7) int local7 = 0; local7 < arg11; local7++) {
				if (Static40.method953() || Static106.method2323(local7, local3, Static141.anInt6334, arg4)) {
					@Pc(27) byte local27 = arg8[local3][local7];
					@Pc(33) byte local33 = arg9[local3][local7];
					@Pc(41) int local41 = arg7[local3][local7] & 0xFF;
					@Pc(49) int local49 = arg3[local3][local7] & 0xFF;
					@Pc(59) Class108 local59 = local41 == 0 ? null : Static2.method65(local41 - 1);
					@Pc(72) Class181 local72 = local49 == 0 ? null : Static269.method4742(local49 - 1);
					@Pc(74) int local74 = 0;
					@Pc(76) int local76 = 0;
					if (local27 != 0) {
						local76 = local59 == null ? 0 : Static51.anIntArray120[local27];
						local74 = local72 == null ? 0 : Static46.anIntArray117[local27];
					} else if (local59 != null) {
						local76 = Static51.anIntArray120[local27];
					} else if (local72 != null) {
						local74 = Static51.anIntArray120[local27];
					}
					@Pc(117) int local117 = local74 + local76;
					@Pc(119) int local119 = 0;
					if (local117 != 0) {
						@Pc(124) int[] local124 = new int[local117];
						@Pc(127) int[] local127 = new int[local117];
						@Pc(130) int[] local130 = new int[local117];
						@Pc(133) int[] local133 = new int[local117];
						@Pc(135) boolean local135 = false;
						@Pc(154) int local154;
						@Pc(186) int local186;
						if (local59 == null || local59.anInt3153 == -1 && local59.anInt3155 == -1 && local59.anInt3150 == -1) {
							for (local154 = 0; local154 < local76; local154++) {
								local124[local119] = -1;
								local119++;
							}
						} else {
							local154 = arg0.method2178() ? local59.anInt3150 : local59.anInt3158;
							if (!Static336.aBoolean628) {
								local154 = -1;
							}
							for (local186 = 0; local186 < local76; local186++) {
								local130[local119] = local154;
								local133[local119] = local59.anInt3156;
								if (local59.anInt3153 == -1) {
									local124[local119] = -1;
								} else {
									local124[local119] = local59.anInt3153;
								}
								if (local59.anInt3155 == -1) {
									local127[local119] = -1;
								} else {
									local127[local119] = local59.anInt3155;
									local135 = true;
								}
								local119++;
							}
							if (!arg10 && arg4 == 0) {
								Static179.method3547(local3, local7, local59.anInt3157, local59.anInt3149 * 8);
							}
						}
						if (!local135) {
							local127 = null;
						}
						if (local72 == null) {
							for (local154 = 0; local154 < local74; local154++) {
								local124[local119] = -1;
								local119++;
							}
						} else {
							local154 = local72.anInt5618;
							if (!Static336.aBoolean628) {
								local154 = -1;
							}
							for (local186 = 0; local186 < local74; local186++) {
								local130[local119] = local154;
								local133[local119] = local72.anInt5616;
								local124[local119] = arg2[local3][local7];
								if (local127 != null) {
									local127[local119] = -1;
								}
								local119++;
							}
						}
						local154 = Static309.anIntArray497.length;
						@Pc(330) int[] local330 = arg10 ? new int[local154] : null;
						@Pc(333) int[] local333 = new int[local154];
						@Pc(336) int[] local336 = new int[local154];
						@Pc(344) int local344;
						@Pc(348) int local348;
						@Pc(430) int local430;
						@Pc(438) int local438;
						for (@Pc(338) int local338 = 0; local338 < local154; local338++) {
							local344 = Static309.anIntArray497[local338];
							local348 = Static121.anIntArray250[local338];
							if (local33 == 0) {
								local333[local338] = local344;
								local336[local338] = local348;
							} else if (local33 == 1) {
								local333[local338] = local348;
								local336[local338] = 128 - local344;
							} else if (local33 == 2) {
								local333[local338] = 128 - local344;
								local336[local338] = 128 - local348;
							} else if (local33 == 3) {
								local333[local338] = 128 - local348;
								local336[local338] = local344;
							}
							if (arg10 && Static240.aBooleanArrayArray3[local27][local338]) {
								local430 = local333[local338] + (local3 << 7);
								local438 = local336[local338] + (local7 << 7);
								local330[local338] = arg5.method2792(local430, local438) - arg1.method2792(local430, local438);
							}
						}
						local344 = arg1.method2785(local3, local7);
						local348 = arg1.method2785(local3 + 1, local7);
						local430 = arg1.method2785(local3 + 1, local7 + 1);
						local438 = arg1.method2785(local3, local7 + 1);
						if (arg4 > 0) {
							@Pc(490) boolean local490 = true;
							if (local49 == 0 && local27 != 0) {
								local490 = false;
							}
							if (local41 > 0 && local59 != null && !local59.aBoolean301) {
								local490 = false;
							}
							if (local490 && local344 == local348 && local344 == local430 && local438 == local344) {
								Static64.aByteArrayArrayArray2[arg4][local3][local7] = (byte) (Static64.aByteArrayArrayArray2[arg4][local3][local7] | 0x4);
							}
						}
						@Pc(542) int local542 = 0;
						@Pc(544) int local544 = 0;
						if (arg10) {
							local542 = Static296.method4975(local3, local7);
							local544 = Static57.method1494(local3, local7);
						}
						arg1.method2794(local3, local7, local333, local330, local336, Static341.anIntArrayArray64[local27], Static156.anIntArrayArray38[local27], Static128.anIntArrayArray66[local27], local124, local127, local130, local133, local542, local544);
						Static269.method4738(arg4, local3, local7);
					}
				}
			}
		}
	}
}
