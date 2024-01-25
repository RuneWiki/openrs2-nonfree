import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	public static int anInt2667;

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
	public static int anInt2671 = -1;

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
	public static int anInt2672 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIII)I")
	public static int method2483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(14) int local14 = arg5;
			arg5 = arg4;
			arg4 = local14;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return 7 + 1 - arg2 - arg5;
		} else if (local7 == 2) {
			return 7 + 1 - arg3 - arg4;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method2484(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) byte[] local9 = new byte[local6];
		for (@Pc(16) int local16 = 0; local16 < local6; local16++) {
			@Pc(21) char local21 = arg0.charAt(local16);
			if (local21 > '\u0000' && local21 < '\u0080' || !(local21 < ' ' || local21 > 'ÿ')) {
				local9[local16] = (byte) local21;
			} else if (local21 == '€') {
				local9[local16] = -128;
			} else if (local21 == '‚') {
				local9[local16] = -126;
			} else if (local21 == 'ƒ') {
				local9[local16] = -125;
			} else if (local21 == '„') {
				local9[local16] = -124;
			} else if (local21 == '…') {
				local9[local16] = -123;
			} else if (local21 == '†') {
				local9[local16] = -122;
			} else if (local21 == '‡') {
				local9[local16] = -121;
			} else if (local21 == 'ˆ') {
				local9[local16] = -120;
			} else if (local21 == '‰') {
				local9[local16] = -119;
			} else if (local21 == 'Š') {
				local9[local16] = -118;
			} else if (local21 == '‹') {
				local9[local16] = -117;
			} else if (local21 == 'Œ') {
				local9[local16] = -116;
			} else if (local21 == 'Ž') {
				local9[local16] = -114;
			} else if (local21 == '‘') {
				local9[local16] = -111;
			} else if (local21 == '’') {
				local9[local16] = -110;
			} else if (local21 == '“') {
				local9[local16] = -109;
			} else if (local21 == '”') {
				local9[local16] = -108;
			} else if (local21 == '•') {
				local9[local16] = -107;
			} else if (local21 == '–') {
				local9[local16] = -106;
			} else if (local21 == '—') {
				local9[local16] = -105;
			} else if (local21 == '˜') {
				local9[local16] = -104;
			} else if (local21 == '™') {
				local9[local16] = -103;
			} else if (local21 == 'š') {
				local9[local16] = -102;
			} else if (local21 == '›') {
				local9[local16] = -101;
			} else if (local21 == 'œ') {
				local9[local16] = -100;
			} else if (local21 == 'ž') {
				local9[local16] = -98;
			} else if (local21 == 'Ÿ') {
				local9[local16] = -97;
			} else {
				local9[local16] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)I")
	public static int method2485(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return (arg0 & 0xFF80) + local22;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[IZ)[I")
	public static int[] method2486(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(20) int[] local20 = new int[1152];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			for (@Pc(28) int local28 = 0; local28 < 36; local28++) {
				@Pc(34) int local34 = arg1[local22];
				if (local34 == 0) {
					if (local28 > 0 && arg1[local22 - 1] != 0) {
						local34 = arg0;
					} else if (local24 > 0 && arg1[local22 - 36] != 0) {
						local34 = arg0;
					} else if (local28 < 35 && arg1[local22 + 1] != 0) {
						local34 = arg0;
					} else if (local24 < 31 && arg1[local22 + 36] != 0) {
						local34 = arg0;
					}
				}
				local20[local22++] = local34;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!cc;III)V")
	public static void method2487(@OriginalArg(0) Class22_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((arg1 & 0x20) != 0) {
			arg0.anInt5078 = Static200.aClass7_Sub3_Sub2_3.method2736();
			arg0.anInt5091 = Static200.aClass7_Sub3_Sub2_3.method2736();
		}
		if ((arg1 & 0x80) != 0) {
			arg0.aString325 = Static200.aClass7_Sub3_Sub2_3.method2782();
			if (arg0.aString325.charAt(0) == '~') {
				arg0.aString325 = arg0.aString325.substring(1);
				Static50.method1093(arg0.method820(), 2, 0, arg0.method818(), arg0.aString325);
			} else if (Static252.aClass22_Sub2_Sub1_Sub1_4 == arg0) {
				Static50.method1093(arg0.method820(), 2, 0, arg0.method818(), arg0.aString325);
			}
			arg0.anInt5125 = 150;
			arg0.anInt5128 = 0;
			arg0.anInt5077 = 0;
		}
		@Pc(95) int local95;
		@Pc(104) int local104;
		if ((arg1 & 0x2) != 0) {
			local95 = Static200.aClass7_Sub3_Sub2_3.method2764();
			if (local95 == 65535) {
				local95 = -1;
			}
			local104 = Static200.aClass7_Sub3_Sub2_3.method2751();
			Static55.method1163(local104, local95, arg0);
		}
		if ((arg1 & 0x8) != 0) {
			local95 = Static200.aClass7_Sub3_Sub2_3.method2751();
			@Pc(120) byte[] local120 = new byte[local95];
			@Pc(125) Class7_Sub3 local125 = new Class7_Sub3(local120);
			Static200.aClass7_Sub3_Sub2_3.method2750(local120, local95);
			Static74.aClass7_Sub3Array1[arg2] = local125;
			arg0.method817(local125);
		}
		if ((arg1 & 0x40) != 0) {
			arg0.anInt5140 = Static200.aClass7_Sub3_Sub2_3.method2784();
			if (arg0.anInt5140 == 65535) {
				arg0.anInt5140 = -1;
			}
		}
		if ((arg1 & 0x800) != 0) {
			local95 = Static200.aClass7_Sub3_Sub2_3.method2736();
			arg0.anInt5102 = Static200.aClass7_Sub3_Sub2_3.method2772();
			arg0.anInt5089 = Static200.aClass7_Sub3_Sub2_3.method2763();
			arg0.anInt5108 = local95 & 0x7FFF;
			arg0.aBoolean375 = (local95 & 0x8000) != 0;
			arg0.anInt5112 = Static212.anInt4234 + arg0.anInt5108 + arg0.anInt5102;
		}
		if ((arg1 & 0x4) != 0) {
			local95 = Static200.aClass7_Sub3_Sub2_3.method2732();
			local104 = Static200.aClass7_Sub3_Sub2_3.method2772();
			arg0.method4404(local95, local104, Static212.anInt4234);
			arg0.anInt5094 = Static212.anInt4234 + 300;
			arg0.anInt5109 = Static200.aClass7_Sub3_Sub2_3.method2751();
		}
		@Pc(289) int local289;
		@Pc(406) int local406;
		if ((arg1 & 0x1000) != 0) {
			local95 = Static200.aClass7_Sub3_Sub2_3.method2739();
			local104 = Static200.aClass7_Sub3_Sub2_3.method2794();
			if (local95 == 65535) {
				local95 = -1;
			}
			@Pc(253) boolean local253 = true;
			@Pc(286) Class170 local286;
			if (local95 != -1 && arg0.anInt5129 != -1) {
				@Pc(273) Class197 local273;
				if (local95 == arg0.anInt5129) {
					local273 = Static10.method162(local95);
					if (local273.aBoolean442 && local273.anInt6076 != -1) {
						local286 = Static261.method4379(local273.anInt6076);
						local289 = local286.anInt4968;
						if (local289 == 0) {
							local253 = false;
						} else if (local289 == 1) {
							local253 = true;
						} else if (local289 == 2) {
							arg0.anInt5120 = 0;
							local253 = false;
						}
					}
				} else {
					local273 = Static10.method162(local95);
					@Pc(321) Class197 local321 = Static10.method162(arg0.anInt5129);
					if (local273.anInt6076 != -1 && local321.anInt6076 != -1) {
						@Pc(334) Class170 local334 = Static261.method4379(local273.anInt6076);
						@Pc(339) Class170 local339 = Static261.method4379(local321.anInt6076);
						if (local339.anInt4963 > local334.anInt4963) {
							local253 = false;
						}
					}
				}
			}
			if (local253) {
				arg0.anInt5127 = 0;
				arg0.anInt5131 = 1;
				arg0.anInt5123 = 0;
				arg0.anInt5090 = local104 >> 16;
				arg0.anInt5092 = (local104 & 0xFFFF) + Static212.anInt4234;
				arg0.anInt5129 = local95;
				if (Static212.anInt4234 < arg0.anInt5092) {
					arg0.anInt5123 = -1;
				}
				if (arg0.anInt5129 != -1 && arg0.anInt5092 == Static212.anInt4234) {
					local406 = Static10.method162(arg0.anInt5129).anInt6076;
					if (local406 != -1) {
						local286 = Static261.method4379(local406);
						if (local286 != null && local286.anIntArray652 != null) {
							Static219.method3870(local286, arg0.anInt5967, arg0 == Static252.aClass22_Sub2_Sub1_Sub1_4, 0, arg0.anInt5973);
						}
					}
				}
			}
		}
		if ((arg1 & 0x100) != 0) {
			arg0.anInt5119 = Static200.aClass7_Sub3_Sub2_3.method2772();
			arg0.anInt5080 = Static200.aClass7_Sub3_Sub2_3.method2772();
			arg0.anInt5082 = Static200.aClass7_Sub3_Sub2_3.method2772();
			arg0.anInt5122 = Static200.aClass7_Sub3_Sub2_3.method2772();
			arg0.anInt5099 = Static200.aClass7_Sub3_Sub2_3.method2739() + Static212.anInt4234;
			arg0.anInt5138 = Static200.aClass7_Sub3_Sub2_3.method2739() + Static212.anInt4234;
			arg0.anInt5113 = Static200.aClass7_Sub3_Sub2_3.method2763();
			arg0.anInt5151 = 1;
			arg0.anInt5144 = 0;
		}
		if ((arg1 & 0x200) != 0) {
			local95 = Static200.aClass7_Sub3_Sub2_3.method2740();
			@Pc(502) int[] local502 = new int[local95];
			@Pc(505) int[] local505 = new int[local95];
			@Pc(508) int[] local508 = new int[local95];
			for (@Pc(510) int local510 = 0; local510 < local95; local510++) {
				local289 = Static200.aClass7_Sub3_Sub2_3.method2764();
				if (local289 == 65535) {
					local289 = -1;
				}
				local502[local510] = local289;
				local505[local510] = Static200.aClass7_Sub3_Sub2_3.method2772();
				local508[local510] = Static200.aClass7_Sub3_Sub2_3.method2739();
			}
			Static203.method3602(arg0, local502, local508, local505);
		}
		if ((arg1 & 0x10) != 0) {
			local95 = Static200.aClass7_Sub3_Sub2_3.method2784();
			local104 = Static200.aClass7_Sub3_Sub2_3.method2772();
			@Pc(568) int local568 = Static200.aClass7_Sub3_Sub2_3.method2772();
			local406 = Static200.aClass7_Sub3_Sub2_3.anInt3005;
			@Pc(579) boolean local579 = (local95 & 0x8000) != 0;
			if (arg0.aString78 != null && arg0.aClass214_1 != null) {
				@Pc(587) boolean local587 = false;
				if (local104 <= 1) {
					if (!local579 && (Static261.aBoolean371 && !Static233.aBoolean343 || Static343.aBoolean474)) {
						local587 = true;
					} else if (Static271.method4521(arg0.aString78)) {
						local587 = true;
					}
				}
				if (!local587 && Static320.anInt6124 == 0) {
					Static54.aClass7_Sub3_2.anInt3005 = 0;
					Static200.aClass7_Sub3_Sub2_3.method2793(local568, Static54.aClass7_Sub3_2.aByteArray33);
					Static54.aClass7_Sub3_2.anInt3005 = 0;
					@Pc(629) int local629 = -1;
					@Pc(648) String local648;
					if (local579) {
						local95 &= 0x7FFF;
						@Pc(639) Class106 local639 = Static155.method3000(Static54.aClass7_Sub3_2);
						local629 = local639.anInt3026;
						local648 = local639.aClass7_Sub1_Sub1_1.method98(Static54.aClass7_Sub3_2);
					} else {
						local648 = Static16.method2771(Static89.method1859(Static235.method4085(Static54.aClass7_Sub3_2)));
					}
					arg0.aString325 = local648.trim();
					arg0.anInt5125 = 150;
					arg0.anInt5077 = local95 >> 8;
					arg0.anInt5128 = local95 & 0xFF;
					@Pc(692) int local692;
					if (local104 == 1 || local104 == 2) {
						local692 = local579 ? 17 : 1;
					} else {
						local692 = local579 ? 17 : 2;
					}
					if (local104 == 2) {
						Static338.method5381("<img=1>" + arg0.method818(), local648, 0, "<img=1>" + arg0.method820(), local692, null, local629);
					} else if (local104 == 1) {
						Static338.method5381("<img=0>" + arg0.method818(), local648, 0, "<img=0>" + arg0.method820(), local692, null, local629);
					} else {
						Static338.method5381(arg0.method818(), local648, 0, arg0.method820(), local692, null, local629);
					}
				}
			}
			Static200.aClass7_Sub3_Sub2_3.anInt3005 = local568 + local406;
		}
		if ((arg1 & 0x400) != 0) {
			local95 = Static200.aClass7_Sub3_Sub2_3.method2732();
			local104 = Static200.aClass7_Sub3_Sub2_3.method2751();
			arg0.method4404(local95, local104, Static212.anInt4234);
		}
	}
}
