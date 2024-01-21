import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "[I")
	public static int[] anIntArray434;

	@OriginalMember(owner = "client!sa", name = "jb", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!sa", name = "ib", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2213 = Static118.method2249("<col=ff0000>");

	@OriginalMember(owner = "client!sa", name = "kb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2214 = Static118.method2249("leuchten2:");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLclient!sd;IIIB)V")
	public static void method2842(@OriginalArg(1) Class60 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static42.anInt1110 = 0;
		Static163.anInt3686 = arg2;
		Static70.aBoolean78 = false;
		Static191.anInt4167 = 1;
		Static16.anInt446 = 10000;
		Static62.aClass60_14 = arg0;
		Static200.anInt4299 = arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg2) {
			Static101.method1914(arg2, arg5, arg4, arg0, arg3, arg1);
		} else if (Static71.anInt1744 <= arg3 - arg2 && arg3 + arg2 <= Static23.anInt685 && Static206.anInt4385 <= arg5 - arg6 && arg5 + arg6 <= Static133.anInt3309) {
			Static91.method1627(arg1, arg3, arg4, arg5, arg0, arg6, arg2);
		} else {
			Static107.method1975(arg3, arg4, arg6, arg5, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BII)I")
	public static int method2845(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = (local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIIIIII)V")
	public static void method2846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class73 local3 = new Class73();
		local3.anInt3472 = arg2 / 128;
		local3.anInt3474 = arg3 / 128;
		local3.anInt3475 = arg4 / 128;
		local3.anInt3464 = arg5 / 128;
		local3.anInt3466 = arg1;
		local3.anInt3463 = arg2;
		local3.anInt3482 = arg3;
		local3.anInt3476 = arg4;
		local3.anInt3473 = arg5;
		local3.anInt3469 = arg6;
		local3.anInt3484 = arg7;
		Static145.aClass73ArrayArray1[arg0][Static145.anIntArray395[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
	public static void method2847() {
		@Pc(3) int local3 = Static145.anIntArray395[Static115.anInt2804];
		@Pc(7) Class73[] local7 = Static145.aClass73ArrayArray1[Static115.anInt2804];
		Static207.anInt4404 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class73 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt3466 == 1) {
				local27 = local16.anInt3472 + Static25.anInt733 - Static60.anInt1554;
				if (local27 >= 0 && local27 <= Static25.anInt733 + Static25.anInt733) {
					local42 = local16.anInt3475 + Static25.anInt733 - Static33.anInt964;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3464 + Static25.anInt733 - Static33.anInt964;
					if (local53 > Static25.anInt733 + Static25.anInt733) {
						local53 = Static25.anInt733 + Static25.anInt733;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static179.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static1.anInt4460 - local16.anInt3463;
						if (local85 > 32) {
							local16.anInt3479 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3479 = 2;
							local85 = -local85;
						}
						local16.anInt3468 = (local16.anInt3476 - Static66.anInt1691 << 8) / local85;
						local16.anInt3467 = (local16.anInt3473 - Static66.anInt1691 << 8) / local85;
						local16.anInt3480 = (local16.anInt3469 - Static100.anInt2513 << 8) / local85;
						local16.anInt3471 = (local16.anInt3484 - Static100.anInt2513 << 8) / local85;
						Static83.aClass73Array1[Static207.anInt4404++] = local16;
					}
				}
			} else if (local16.anInt3466 == 2) {
				local27 = local16.anInt3475 + Static25.anInt733 - Static33.anInt964;
				if (local27 >= 0 && local27 <= Static25.anInt733 + Static25.anInt733) {
					local42 = local16.anInt3472 + Static25.anInt733 - Static60.anInt1554;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3474 + Static25.anInt733 - Static60.anInt1554;
					if (local53 > Static25.anInt733 + Static25.anInt733) {
						local53 = Static25.anInt733 + Static25.anInt733;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static179.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static66.anInt1691 - local16.anInt3476;
						if (local85 > 32) {
							local16.anInt3479 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3479 = 4;
							local85 = -local85;
						}
						local16.anInt3478 = (local16.anInt3463 - Static1.anInt4460 << 8) / local85;
						local16.anInt3470 = (local16.anInt3482 - Static1.anInt4460 << 8) / local85;
						local16.anInt3480 = (local16.anInt3469 - Static100.anInt2513 << 8) / local85;
						local16.anInt3471 = (local16.anInt3484 - Static100.anInt2513 << 8) / local85;
						Static83.aClass73Array1[Static207.anInt4404++] = local16;
					}
				}
			} else if (local16.anInt3466 == 4) {
				local27 = local16.anInt3469 - Static100.anInt2513;
				if (local27 > 128) {
					local42 = local16.anInt3475 + Static25.anInt733 - Static33.anInt964;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3464 + Static25.anInt733 - Static33.anInt964;
					if (local53 > Static25.anInt733 + Static25.anInt733) {
						local53 = Static25.anInt733 + Static25.anInt733;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt3472 + Static25.anInt733 - Static60.anInt1554;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt3474 + Static25.anInt733 - Static60.anInt1554;
						if (local85 > Static25.anInt733 + Static25.anInt733) {
							local85 = Static25.anInt733 + Static25.anInt733;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static179.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt3479 = 5;
							local16.anInt3478 = (local16.anInt3463 - Static1.anInt4460 << 8) / local27;
							local16.anInt3470 = (local16.anInt3482 - Static1.anInt4460 << 8) / local27;
							local16.anInt3468 = (local16.anInt3476 - Static66.anInt1691 << 8) / local27;
							local16.anInt3467 = (local16.anInt3473 - Static66.anInt1691 << 8) / local27;
							Static83.aClass73Array1[Static207.anInt4404++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)V")
	public static void method2848() {
		while (true) {
			if (Static1.aClass1_Sub14_Sub1_43.method1758(Static62.anInt1604) >= 11) {
				@Pc(21) int local21 = Static1.aClass1_Sub14_Sub1_43.method1756(11);
				if (local21 != 2047) {
					@Pc(26) boolean local26 = false;
					if (Static158.aClass6_Sub4_Sub1Array1[local21] == null) {
						local26 = true;
						Static158.aClass6_Sub4_Sub1Array1[local21] = new Class6_Sub4_Sub1();
						if (Static2.aClass1_Sub14Array1[local21] != null) {
							Static158.aClass6_Sub4_Sub1Array1[local21].method378(Static2.aClass1_Sub14Array1[local21]);
						}
					}
					Static138.anIntArray385[Static44.anInt1123++] = local21;
					@Pc(62) Class6_Sub4_Sub1 local62 = Static158.aClass6_Sub4_Sub1Array1[local21];
					local62.anInt3975 = Static174.anInt3887;
					@Pc(70) int local70 = Static1.aClass1_Sub14_Sub1_43.method1756(5);
					if (local70 > 15) {
						local70 -= 32;
					}
					@Pc(81) int local81 = Static142.anIntArray394[Static1.aClass1_Sub14_Sub1_43.method1756(3)];
					if (local26) {
						local62.anInt3965 = local62.anInt3971 = local81;
					}
					@Pc(94) int local94 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
					if (local94 == 1) {
						Static191.anIntArray474[Static95.anInt2376++] = local21;
					}
					@Pc(112) int local112 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
					@Pc(117) int local117 = Static1.aClass1_Sub14_Sub1_43.method1756(5);
					if (local117 > 15) {
						local117 -= 32;
					}
					local62.method2991(Static201.aClass6_Sub4_Sub1_3.anIntArray451[0] + local70, local112 == 1, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0] + local117);
					continue;
				}
			}
			Static1.aClass1_Sub14_Sub1_43.method1755();
			return;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIBII)V")
	public static void method2850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static148.method2651(arg2);
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg2 - arg1;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(21) int local21 = -arg2;
		@Pc(28) int local28 = local14;
		@Pc(30) int local30 = -1;
		@Pc(33) int local33 = -local14;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(69) int local69;
		@Pc(77) int local77;
		if (Static206.anInt4385 <= arg0 && Static133.anInt3309 >= arg0) {
			@Pc(43) int[] local43 = Static40.anIntArrayArray11[arg0];
			local51 = Static100.method1896(Static23.anInt685, arg5 - arg2, Static71.anInt1744);
			local60 = Static100.method1896(Static23.anInt685, arg5 + arg2, Static71.anInt1744);
			local69 = Static100.method1896(Static23.anInt685, arg5 - local14, Static71.anInt1744);
			local77 = Static100.method1896(Static23.anInt685, arg5 + local14, Static71.anInt1744);
			Static51.method893(arg3, local43, local69, local51);
			Static51.method893(arg4, local43, local77, local69);
			Static51.method893(arg3, local43, local60, local77);
		}
		@Pc(97) int local97 = -1;
		while (local10 > local8) {
			local30 += 2;
			local97 += 2;
			local33 += local97;
			if (local33 >= 0 && local28 >= 1) {
				local28--;
				Static90.anIntArray518[local28] = local8;
				local33 -= local28 << 1;
			}
			local8++;
			local21 += local30;
			@Pc(232) int local232;
			@Pc(241) int local241;
			@Pc(248) int[] local248;
			@Pc(144) int local144;
			if (local21 >= 0) {
				local10--;
				local21 -= local10 << 1;
				local144 = arg0 - local10;
				local51 = local10 + arg0;
				if (local51 >= Static206.anInt4385 && local144 <= Static133.anInt3309) {
					if (local14 <= local10) {
						local60 = Static100.method1896(Static23.anInt685, arg5 + local8, Static71.anInt1744);
						local69 = Static100.method1896(Static23.anInt685, arg5 - local8, Static71.anInt1744);
						if (local51 <= Static133.anInt3309) {
							Static51.method893(arg3, Static40.anIntArrayArray11[local51], local60, local69);
						}
						if (local144 >= Static206.anInt4385) {
							Static51.method893(arg3, Static40.anIntArrayArray11[local144], local60, local69);
						}
					} else {
						local60 = Static90.anIntArray518[local10];
						local69 = Static100.method1896(Static23.anInt685, arg5 + local8, Static71.anInt1744);
						local77 = Static100.method1896(Static23.anInt685, arg5 - local8, Static71.anInt1744);
						local232 = Static100.method1896(Static23.anInt685, local60 + arg5, Static71.anInt1744);
						local241 = Static100.method1896(Static23.anInt685, arg5 - local60, Static71.anInt1744);
						if (Static133.anInt3309 >= local51) {
							local248 = Static40.anIntArrayArray11[local51];
							Static51.method893(arg3, local248, local241, local77);
							Static51.method893(arg4, local248, local232, local241);
							Static51.method893(arg3, local248, local69, local232);
						}
						if (Static206.anInt4385 <= local144) {
							local248 = Static40.anIntArrayArray11[local144];
							Static51.method893(arg3, local248, local241, local77);
							Static51.method893(arg4, local248, local232, local241);
							Static51.method893(arg3, local248, local69, local232);
						}
					}
				}
			}
			local144 = arg0 - local8;
			local51 = local8 + arg0;
			if (local51 >= Static206.anInt4385 && Static133.anInt3309 >= local144) {
				local60 = arg5 + local10;
				local69 = arg5 - local10;
				if (local60 >= Static71.anInt1744 && Static23.anInt685 >= local69) {
					local60 = Static100.method1896(Static23.anInt685, local60, Static71.anInt1744);
					local69 = Static100.method1896(Static23.anInt685, local69, Static71.anInt1744);
					if (local8 >= local14) {
						if (local51 <= Static133.anInt3309) {
							Static51.method893(arg3, Static40.anIntArrayArray11[local51], local60, local69);
						}
						if (local144 >= Static206.anInt4385) {
							Static51.method893(arg3, Static40.anIntArrayArray11[local144], local60, local69);
						}
					} else {
						local77 = local8 <= local28 ? local28 : Static90.anIntArray518[local8];
						local232 = Static100.method1896(Static23.anInt685, arg5 + local77, Static71.anInt1744);
						local241 = Static100.method1896(Static23.anInt685, arg5 - local77, Static71.anInt1744);
						if (Static133.anInt3309 >= local51) {
							local248 = Static40.anIntArrayArray11[local51];
							Static51.method893(arg3, local248, local241, local69);
							Static51.method893(arg4, local248, local232, local241);
							Static51.method893(arg3, local248, local60, local232);
						}
						if (local144 >= Static206.anInt4385) {
							local248 = Static40.anIntArrayArray11[local144];
							Static51.method893(arg3, local248, local241, local69);
							Static51.method893(arg4, local248, local232, local241);
							Static51.method893(arg3, local248, local60, local232);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!sd;B)Lclient!l;")
	public static Class1_Sub17 method2851(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1) {
		@Pc(19) byte[] local19 = arg1.method2331(arg0);
		return local19 == null ? null : new Class1_Sub17(local19);
	}
}
