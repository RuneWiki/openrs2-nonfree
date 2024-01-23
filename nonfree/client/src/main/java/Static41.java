import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!pl;")
	public static Class139 aClass139_1;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	public static int anInt683 = 0;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "[I")
	public static int[] anIntArray62 = new int[500];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[[II[[I[[F[[FZIIIIII[[FILclient!mi;FI)I")
	public static int method566(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class3_Sub21 arg14, @OriginalArg(16) float arg15, @OriginalArg(17) int arg16) {
		@Pc(23) int local23;
		if (arg0 == 1) {
			local23 = arg11;
			arg11 = arg8;
			arg8 = 128 - local23;
		} else if (arg0 == 2) {
			arg8 = 128 - arg8;
			arg11 = 128 - arg11;
		} else if (arg0 == 3) {
			local23 = arg11;
			arg11 = 128 - arg8;
			arg8 = local23;
		}
		@Pc(72) float local72;
		@Pc(66) float local66;
		@Pc(74) int local74;
		@Pc(80) float local80;
		if (arg11 == 0 && arg8 == 0) {
			local66 = arg12[arg7][arg10];
			local72 = arg5[arg7][arg10];
			local74 = arg16;
			local80 = arg4[arg7][arg10];
		} else if (arg11 == 128 && arg8 == 0) {
			local66 = arg12[arg7 + 1][arg10];
			local74 = arg9;
			local72 = arg5[arg7 + 1][arg10];
			local80 = arg4[arg7 + 1][arg10];
		} else if (arg11 == 128 && arg8 == 128) {
			local66 = arg12[arg7 + 1][arg10 + 1];
			local80 = arg4[arg7 + 1][arg10 + 1];
			local72 = arg5[arg7 + 1][arg10 + 1];
			local74 = arg13;
		} else if (arg11 == 0 && arg8 == 128) {
			local80 = arg4[arg7][arg10 + 1];
			local72 = arg5[arg7][arg10 + 1];
			local66 = arg12[arg7][arg10 + 1];
			local74 = arg2;
		} else {
			local72 = arg5[arg7][arg10];
			local66 = arg12[arg7][arg10];
			@Pc(146) float local146 = (float) arg11 / 128.0F;
			@Pc(154) float local154 = arg4[arg7][arg10 + 1];
			@Pc(169) float local169 = local66 + (arg12[arg7 + 1][arg10] - local66) * local146;
			@Pc(183) float local183 = local72 + local146 * (arg5[arg7 + 1][arg10] - local72);
			@Pc(188) float local188 = (float) arg8 / 128.0F;
			@Pc(205) float local205 = local154 + local146 * (arg4[arg7 + 1][arg10 + 1] - local154);
			local80 = arg4[arg7][arg10];
			@Pc(225) float local225 = local80 + local146 * (arg4[arg7 + 1][arg10] - local80);
			local80 = local225 + local188 * (local205 - local225);
			@Pc(241) float local241 = arg12[arg7][arg10 + 1];
			@Pc(249) float local249 = arg5[arg7][arg10 + 1];
			@Pc(266) float local266 = local241 + (arg12[arg7 + 1][arg10 + 1] - local241) * local146;
			@Pc(283) float local283 = local249 + (arg5[arg7 + 1][arg10 + 1] - local249) * local146;
			local72 = local183 + local188 * (local283 - local183);
			local66 = local169 + local188 * (local266 - local169);
			@Pc(306) int local306 = Static9.method150(arg9, arg16, arg11);
			@Pc(312) int local312 = Static9.method150(arg13, arg2, arg11);
			local74 = Static9.method150(local312, local306, arg8);
		}
		@Pc(387) int local387 = (arg7 << 7) + arg11;
		@Pc(393) int local393 = arg8 + (arg10 << 7);
		@Pc(401) int local401 = Static285.method4733(arg7, arg11, arg8, arg10, arg3);
		return arg14.method2856(local387, local401, local393, local80, local72, local66, arg6 ? local74 & 0xFFFFFF00 : local74, arg1 == null ? 0.0F : (float) (local401 - Static285.method4733(arg7, arg11, arg8, arg10, arg1)) / arg15);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([BI)V")
	public static void method568(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub26 local10 = new Class3_Sub26(arg0);
		local10.anInt4615 = arg0.length - 2;
		Static28.anInt494 = local10.method3948();
		Static281.aByteArrayArray106 = new byte[Static28.anInt494][];
		Static314.aByteArrayArray130 = new byte[Static28.anInt494][];
		Static306.anIntArray618 = new int[Static28.anInt494];
		Static93.anIntArray162 = new int[Static28.anInt494];
		Static35.anIntArray54 = new int[Static28.anInt494];
		Static314.aBooleanArray138 = new boolean[Static28.anInt494];
		Static101.anIntArray185 = new int[Static28.anInt494];
		local10.anInt4615 = arg0.length - Static28.anInt494 * 8 - 7;
		Static148.anInt2816 = local10.method3948();
		Static43.anInt812 = local10.method3948();
		@Pc(67) int local67 = (local10.method3915() & 0xFF) + 1;
		@Pc(81) int local81;
		for (local81 = 0; local81 < Static28.anInt494; local81++) {
			Static93.anIntArray162[local81] = local10.method3948();
		}
		for (local81 = 0; local81 < Static28.anInt494; local81++) {
			Static35.anIntArray54[local81] = local10.method3948();
		}
		for (local81 = 0; local81 < Static28.anInt494; local81++) {
			Static101.anIntArray185[local81] = local10.method3948();
		}
		for (local81 = 0; local81 < Static28.anInt494; local81++) {
			Static306.anIntArray618[local81] = local10.method3948();
		}
		local10.anInt4615 = arg0.length - Static28.anInt494 * 8 - (local67 - 1) * 3 - 7;
		Static299.anIntArray611 = new int[local67];
		for (local81 = 1; local81 < local67; local81++) {
			Static299.anIntArray611[local81] = local10.method3899();
			if (Static299.anIntArray611[local81] == 0) {
				Static299.anIntArray611[local81] = 1;
			}
		}
		local10.anInt4615 = 0;
		for (local81 = 0; local81 < Static28.anInt494; local81++) {
			@Pc(209) int local209 = Static101.anIntArray185[local81];
			@Pc(213) int local213 = Static306.anIntArray618[local81];
			@Pc(217) int local217 = local213 * local209;
			@Pc(220) byte[] local220 = new byte[local217];
			@Pc(223) byte[] local223 = new byte[local217];
			@Pc(225) boolean local225 = false;
			Static314.aByteArrayArray130[local81] = local220;
			Static281.aByteArrayArray106[local81] = local223;
			@Pc(239) int local239 = local10.method3915();
			@Pc(246) int local246;
			if ((local239 & 0x1) == 0) {
				for (local246 = 0; local246 < local217; local246++) {
					local220[local246] = local10.method3920();
				}
				if ((local239 & 0x2) != 0) {
					for (local246 = 0; local246 < local217; local246++) {
						@Pc(283) byte local283 = local223[local246] = local10.method3920();
						local225 |= local283 != -1;
					}
				}
			} else {
				local246 = 0;
				label98: while (true) {
					@Pc(309) int local309;
					if (local209 <= local246) {
						if ((local239 & 0x2) == 0) {
							break;
						}
						local246 = 0;
						while (true) {
							if (local246 >= local209) {
								break label98;
							}
							for (local309 = 0; local309 < local213; local309++) {
								@Pc(362) byte local362 = local223[local309 * local209 + local246] = local10.method3920();
								local225 |= local362 != -1;
							}
							local246++;
						}
					}
					for (local309 = 0; local309 < local213; local309++) {
						local220[local246 + local309 * local209] = local10.method3920();
					}
					local246++;
				}
			}
			Static314.aBooleanArray138[local81] = local225;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
	public static void method569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class3_Sub25 local30 = Static146.aClass3_Sub25ArrayArrayArray7[local9][arg0][arg1] = Static146.aClass3_Sub25ArrayArrayArray7[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt4485--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt4483; local40++) {
					@Pc(49) Class85 local49 = local30.aClass85Array3[local40];
					if ((local49.aLong107 >> 29 & 0x3L) == 2L && local49.anInt2482 == arg0 && local49.anInt2480 == arg1) {
						local49.anInt2483--;
					}
				}
			}
		}
		if (Static146.aClass3_Sub25ArrayArrayArray7[0][arg0][arg1] == null) {
			Static146.aClass3_Sub25ArrayArrayArray7[0][arg0][arg1] = new Class3_Sub25(0, arg0, arg1);
		}
		Static146.aClass3_Sub25ArrayArrayArray7[0][arg0][arg1].aClass3_Sub25_1 = local7;
		Static146.aClass3_Sub25ArrayArrayArray7[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!qk;Lclient!rn;ZILclient!rn;)V")
	public static void method570(@OriginalArg(0) Class3_Sub4_Sub2_Sub2 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(4) Class155 arg2) {
		Static289.aBoolean414 = true;
		Static173.aClass155_66 = arg1;
		Static313.aClass155_124 = arg2;
		@Pc(15) int local15 = Static173.aClass155_66.method4119() - 1;
		Static300.anInt5928 = local15 * 256 + Static173.aClass155_66.method4131(local15);
		Static151.aStringArray23 = new String[] { null, null, null, null, Static253.aString184 };
		Static219.aStringArray29 = new String[] { null, null, Static304.aString228, null, null };
		Static259.aClass3_Sub4_Sub2_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	public static void method571() {
		Static28.aClass98_5.method2572();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(JJ)J")
	public static long method572(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZLclient!rg;I)V")
	public static void method573(@OriginalArg(0) int arg0, @OriginalArg(2) Class151 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte25 == 0) {
			arg1.anInt4756 = arg1.anInt4738;
		} else if (arg1.aByte25 == 1) {
			arg1.anInt4756 = arg1.anInt4738 + (arg0 - arg1.anInt4773) / 2;
		} else if (arg1.aByte25 == 2) {
			arg1.anInt4756 = arg0 - arg1.anInt4738 - arg1.anInt4773;
		} else if (arg1.aByte25 == 3) {
			arg1.anInt4756 = arg1.anInt4738 * arg0 >> 14;
		} else if (arg1.aByte25 == 4) {
			arg1.anInt4756 = (arg0 - arg1.anInt4773) / 2 + (arg1.anInt4738 * arg0 >> 14);
		} else {
			arg1.anInt4756 = arg0 - (arg1.anInt4738 * arg0 >> 14) - arg1.anInt4773;
		}
		if (arg1.aByte28 == 0) {
			arg1.anInt4730 = arg1.anInt4753;
		} else if (arg1.aByte28 == 1) {
			arg1.anInt4730 = (arg2 - arg1.anInt4751) / 2 + arg1.anInt4753;
		} else if (arg1.aByte28 == 2) {
			arg1.anInt4730 = arg2 - arg1.anInt4751 - arg1.anInt4753;
		} else if (arg1.aByte28 == 3) {
			arg1.anInt4730 = arg2 * arg1.anInt4753 >> 14;
		} else if (arg1.aByte28 == 4) {
			arg1.anInt4730 = (arg2 * arg1.anInt4753 >> 14) + (arg2 - arg1.anInt4751) / 2;
		} else {
			arg1.anInt4730 = arg2 - arg1.anInt4751 - (arg2 * arg1.anInt4753 >> 14);
		}
		if (!Static244.aBoolean346 || Static42.method612(arg1).anInt5831 == 0 && arg1.anInt4721 != 0) {
			return;
		}
		if (arg1.anInt4756 < 0) {
			arg1.anInt4756 = 0;
		} else if (arg1.anInt4756 + arg1.anInt4773 > arg0) {
			arg1.anInt4756 = arg0 - arg1.anInt4773;
		}
		if (arg1.anInt4730 < 0) {
			arg1.anInt4730 = 0;
		} else if (arg2 < arg1.anInt4730 + arg1.anInt4751) {
			arg1.anInt4730 = arg2 - arg1.anInt4751;
		}
	}
}
