import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!lca", name = "T", descriptor = "I")
	public static int anInt5563;

	@OriginalMember(owner = "client!lca", name = "U", descriptor = "I")
	public static int anInt5564;

	@OriginalMember(owner = "client!lca", name = "V", descriptor = "Lclient!qf;")
	public static Class245 aClass245_10;

	@OriginalMember(owner = "client!lca", name = "X", descriptor = "Lclient!faa;")
	public static Class82 aClass82_3;

	@OriginalMember(owner = "client!lca", name = "W", descriptor = "[I")
	public static final int[] anIntArray473 = new int[5];

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(B)V")
	public static void method4686() {
		for (@Pc(3) int local3 = 0; local3 < Static329.anInt6289; local3++) {
			@Pc(9) int local9 = Static102.anIntArray528[local3];
			@Pc(17) Class6_Sub1_Sub2_Sub2 local17 = ((Class3_Sub3) Static240.aClass267_20.method6644((long) local9)).aClass6_Sub1_Sub2_Sub2_1;
			@Pc(21) int local21 = Static90.aClass3_Sub27_Sub1_1.method7548();
			if ((local21 & 0x8) != 0) {
				local21 += Static90.aClass3_Sub27_Sub1_1.method7548() << 8;
			}
			@Pc(49) int local49;
			@Pc(53) int local53;
			if ((local21 & 0x40) != 0) {
				local49 = Static90.aClass3_Sub27_Sub1_1.method7547();
				local53 = Static90.aClass3_Sub27_Sub1_1.method7548();
				local17.method7086(Static223.anInt4829, local49, local53);
				local17.anInt8553 = Static223.anInt4829 + 300;
				local17.anInt8585 = Static90.aClass3_Sub27_Sub1_1.method7597();
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt8604 = Static90.aClass3_Sub27_Sub1_1.method7566();
				local17.anInt8602 = Static90.aClass3_Sub27_Sub1_1.method7568();
			}
			if ((local21 & 0x4) != 0) {
				local17.anInt8563 = Static90.aClass3_Sub27_Sub1_1.method7566();
				if (local17.anInt8563 == 65535) {
					local17.anInt8563 = -1;
				}
			}
			if ((local21 & 0x20) != 0) {
				if (local17.aClass230_1.method5894()) {
					Static299.method4967(local17);
				}
				local17.method7096(Static345.aClass154_1.method4157(Static90.aClass3_Sub27_Sub1_1.method7591()));
				local17.method7087(local17.aClass230_1.anInt7040);
				local17.anInt8594 = local17.aClass230_1.anInt7057 << 3;
				if (local17.aClass230_1.method5894()) {
					Static100.method1935(local17.aByte100, null, local17.anIntArray733[0], local17.anIntArray734[0], 0, local17, null);
				}
			}
			if ((local21 & 0x400) != 0) {
				local49 = Static90.aClass3_Sub27_Sub1_1.method7597();
				@Pc(181) int[] local181 = new int[local49];
				@Pc(184) int[] local184 = new int[local49];
				@Pc(187) int[] local187 = new int[local49];
				for (@Pc(189) int local189 = 0; local189 < local49; local189++) {
					@Pc(195) int local195 = Static90.aClass3_Sub27_Sub1_1.method7591();
					if (local195 == 65535) {
						local195 = -1;
					}
					local181[local189] = local195;
					local184[local189] = Static90.aClass3_Sub27_Sub1_1.method7597();
					local187[local189] = Static90.aClass3_Sub27_Sub1_1.method7568();
				}
				Static383.method4808(local184, local181, local17, local187);
			}
			if ((local21 & 0x800) != 0) {
				local17.anInt8561 = Static90.aClass3_Sub27_Sub1_1.method7557();
				local17.anInt8532 = Static90.aClass3_Sub27_Sub1_1.method7584();
				local17.anInt8559 = Static90.aClass3_Sub27_Sub1_1.method7586();
				local17.anInt8557 = Static90.aClass3_Sub27_Sub1_1.method7586();
				local17.anInt8555 = Static90.aClass3_Sub27_Sub1_1.method7591() + Static223.anInt4829;
				local17.anInt8589 = Static90.aClass3_Sub27_Sub1_1.method7591() + Static223.anInt4829;
				local17.anInt8541 = Static90.aClass3_Sub27_Sub1_1.method7580();
				local17.anInt8559 += local17.anIntArray733[0];
				local17.anInt8600 = 0;
				local17.anInt8561 += local17.anIntArray733[0];
				local17.anInt8557 += local17.anIntArray734[0];
				local17.anInt8599 = 1;
				local17.anInt8532 += local17.anIntArray734[0];
			}
			if ((local21 & 0x100) != 0) {
				local17.aByte90 = Static90.aClass3_Sub27_Sub1_1.method7557();
				local17.aByte91 = Static90.aClass3_Sub27_Sub1_1.method7557();
				local17.aByte89 = Static90.aClass3_Sub27_Sub1_1.method7557();
				local17.aByte92 = (byte) Static90.aClass3_Sub27_Sub1_1.method7561();
				local17.anInt8547 = Static223.anInt4829 + Static90.aClass3_Sub27_Sub1_1.method7610();
				local17.anInt8523 = Static223.anInt4829 + Static90.aClass3_Sub27_Sub1_1.method7568();
			}
			if ((local21 & 0x10) != 0) {
				local49 = Static90.aClass3_Sub27_Sub1_1.method7591();
				if (local49 == 65535) {
					local49 = -1;
				}
				local53 = Static90.aClass3_Sub27_Sub1_1.method7597();
				Static314.method5089(local49, local17, local53);
			}
			if ((local21 & 0x1) != 0) {
				local17.aString80 = Static90.aClass3_Sub27_Sub1_1.method7589();
				local17.anInt8567 = 100;
			}
			@Pc(425) int local425;
			if ((local21 & 0x80) != 0) {
				local49 = Static90.aClass3_Sub27_Sub1_1.method7568();
				local53 = Static90.aClass3_Sub27_Sub1_1.method7549();
				if (local49 == 65535) {
					local49 = -1;
				}
				local425 = Static90.aClass3_Sub27_Sub1_1.method7580();
				local17.method7080(false, local425, local49, local53);
			}
			if ((local21 & 0x1000) != 0) {
				local49 = Static90.aClass3_Sub27_Sub1_1.method7591();
				if (local49 == 65535) {
					local49 = -1;
				}
				local53 = Static90.aClass3_Sub27_Sub1_1.method7549();
				local425 = Static90.aClass3_Sub27_Sub1_1.method7580();
				local17.method7080(true, local425, local49, local53);
			}
			if ((local21 & 0x200) != 0) {
				local49 = Static90.aClass3_Sub27_Sub1_1.method7610();
				local17.anInt8577 = Static90.aClass3_Sub27_Sub1_1.method7597();
				local17.anInt8573 = Static90.aClass3_Sub27_Sub1_1.method7580();
				local17.anInt8591 = local49 & 0x7FFF;
				local17.aBoolean629 = (local49 & 0x8000) != 0;
				local17.anInt8538 = Static223.anInt4829 + local17.anInt8591 + local17.anInt8577;
			}
			if ((local21 & 0x2000) != 0) {
				local49 = Static90.aClass3_Sub27_Sub1_1.method7547();
				local53 = Static90.aClass3_Sub27_Sub1_1.method7548();
				local17.method7086(Static223.anInt4829, local49, local53);
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method4687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg7 && arg3 == arg8 && arg1 == arg5 && arg6 == arg0) {
			Static39.method945(arg1, arg6, arg2, arg4, arg3);
			return;
		}
		@Pc(27) int local27 = arg4;
		@Pc(29) int local29 = arg3;
		@Pc(33) int local33 = arg4 * 3;
		@Pc(37) int local37 = arg3 * 3;
		@Pc(41) int local41 = arg7 * 3;
		@Pc(45) int local45 = arg8 * 3;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(53) int local53 = arg0 * 3;
		@Pc(63) int local63 = local41 + arg1 - arg4 - local49;
		@Pc(74) int local74 = arg6 + local45 - arg3 - local53;
		@Pc(85) int local85 = local49 + local33 - local41 - local41;
		@Pc(95) int local95 = local53 + local37 - local45 - local45;
		@Pc(100) int local100 = local41 - local33;
		@Pc(105) int local105 = local45 - local37;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(115) int local115 = local107 * local107 >> 12;
			@Pc(121) int local121 = local115 * local107 >> 12;
			@Pc(125) int local125 = local121 * local63;
			@Pc(129) int local129 = local121 * local74;
			@Pc(133) int local133 = local115 * local85;
			@Pc(137) int local137 = local115 * local95;
			@Pc(141) int local141 = local100 * local107;
			@Pc(145) int local145 = local107 * local105;
			@Pc(155) int local155 = arg4 + (local141 + local125 + local133 >> 12);
			@Pc(166) int local166 = arg3 + (local145 + local137 + local129 >> 12);
			Static39.method945(local155, local166, arg2, local27, local29);
			local29 = local166;
			local27 = local155;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IBIZLclient!eca;)V")
	public static void method4688(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class6_Sub1_Sub2_Sub1 arg2) {
		@Pc(10) int local10 = arg2.anIntArray733[0];
		@Pc(15) int local15 = arg2.anIntArray734[0];
		if (local10 < 0 || local10 >= Static118.anInt2527 || local15 < 0 || local15 >= Static549.anInt9482 || (arg1 < 0 || arg1 >= Static118.anInt2527 || arg0 < 0 || arg0 >= Static549.anInt9482)) {
			return;
		}
		@Pc(73) int local73 = Static165.method3200(0, local15, 0, arg2.method7083(), Static333.anIntArray549, Static95.aClass306Array1[arg2.aByte100], Static80.anIntArray199, true, 0, 0, -4, local10, arg0, arg1);
		if (local73 >= 1 && local73 <= 3) {
			for (@Pc(85) int local85 = 0; local85 < local73 - 1; local85++) {
				arg2.method2055((byte) 2, Static333.anIntArray549[local85], Static80.anIntArray199[local85]);
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ljava/lang/String;III[BB)I")
	public static int method4690(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(9) int local9 = arg1;
		for (@Pc(19) int local19 = 0; local19 < local9; local19++) {
			@Pc(27) char local27 = arg0.charAt(local19);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				arg3[local19 + arg2] = (byte) local27;
			} else if (local27 == '€') {
				arg3[arg2 + local19] = -128;
			} else if (local27 == '‚') {
				arg3[arg2 + local19] = -126;
			} else if (local27 == 'ƒ') {
				arg3[local19 + arg2] = -125;
			} else if (local27 == '„') {
				arg3[local19 + arg2] = -124;
			} else if (local27 == '…') {
				arg3[arg2 + local19] = -123;
			} else if (local27 == '†') {
				arg3[local19 + arg2] = -122;
			} else if (local27 == '‡') {
				arg3[local19 + arg2] = -121;
			} else if (local27 == 'ˆ') {
				arg3[arg2 + local19] = -120;
			} else if (local27 == '‰') {
				arg3[local19 + arg2] = -119;
			} else if (local27 == 'Š') {
				arg3[arg2 + local19] = -118;
			} else if (local27 == '‹') {
				arg3[arg2 + local19] = -117;
			} else if (local27 == 'Œ') {
				arg3[arg2 + local19] = -116;
			} else if (local27 == 'Ž') {
				arg3[arg2 + local19] = -114;
			} else if (local27 == '‘') {
				arg3[local19 + arg2] = -111;
			} else if (local27 == '’') {
				arg3[arg2 + local19] = -110;
			} else if (local27 == '“') {
				arg3[local19 + arg2] = -109;
			} else if (local27 == '”') {
				arg3[arg2 + local19] = -108;
			} else if (local27 == '•') {
				arg3[arg2 + local19] = -107;
			} else if (local27 == '–') {
				arg3[local19 + arg2] = -106;
			} else if (local27 == '—') {
				arg3[local19 + arg2] = -105;
			} else if (local27 == '˜') {
				arg3[arg2 + local19] = -104;
			} else if (local27 == '™') {
				arg3[local19 + arg2] = -103;
			} else if (local27 == 'š') {
				arg3[arg2 + local19] = -102;
			} else if (local27 == '›') {
				arg3[local19 + arg2] = -101;
			} else if (local27 == 'œ') {
				arg3[local19 + arg2] = -100;
			} else if (local27 == 'ž') {
				arg3[local19 + arg2] = -98;
			} else if (local27 == 'Ÿ') {
				arg3[arg2 + local19] = -97;
			} else {
				arg3[local19 + arg2] = 63;
			}
		}
		return local9;
	}
}
