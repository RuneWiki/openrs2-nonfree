import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!ft", name = "N", descriptor = "I")
	public int anInt2164 = 99;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(IIIZ)V")
	public Class26_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static351.aClass79_4, Static74.aClass12_2);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ya;I)V")
	public void method1714(@OriginalArg(0) Class135 arg0) {
		Static351.method4658(arg0);
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (super.anInt2142 > 1) {
			for (local17 = 0; super.anInt2144 > local17; local17++) {
				for (local21 = 0; super.anInt2140 > local21; local21++) {
					if ((Static4.aByteArrayArrayArray1[1][local17][local21] & 0x2) == 2) {
						Static299.method3893(local17, local21);
					}
				}
			}
		}
		for (local17 = 0; local17 < super.anInt2142; local17++) {
			for (local21 = 0; super.anInt2140 >= local21; local21++) {
				for (@Pc(61) int local61 = 0; local61 <= super.anInt2144; local61++) {
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(83) int local83;
					@Pc(108) int local108;
					@Pc(130) int local130;
					@Pc(225) int local225;
					@Pc(234) int local234;
					@Pc(254) int local254;
					@Pc(258) int local258;
					if ((super.aByteArrayArrayArray9[local17][local61][local21] & 0x1) != 0) {
						local79 = local21;
						local81 = local21;
						local83 = local17;
						while (local81 < super.anInt2140 && (super.aByteArrayArrayArray9[local17][local61][local81 + 1] & 0x1) != 0) {
							local81++;
						}
						local108 = local17;
						while (local79 > 0 && (super.aByteArrayArrayArray9[local17][local61][local79 - 1] & 0x1) != 0) {
							local79--;
						}
						label164: while (local83 > 0) {
							for (local130 = local79; local130 <= local81; local130++) {
								if ((super.aByteArrayArrayArray9[local83 - 1][local61][local130] & 0x1) == 0) {
									break label164;
								}
							}
							local83--;
						}
						label153: while (local108 < 3) {
							for (local130 = local79; local130 <= local81; local130++) {
								if ((super.aByteArrayArrayArray9[local108 + 1][local61][local130] & 0x1) == 0) {
									break label153;
								}
							}
							local108++;
						}
						local130 = (local108 + 1 - local83) * (local81 + 1 - local79);
						if (local130 >= 2) {
							local225 = super.anIntArrayArrayArray2[local108][local61][local79] - 240;
							local234 = super.anIntArrayArrayArray2[local83][local61][local79];
							Static281.method3696(1, local61 << 7, local61 << 7, local79 << 7, (local81 << 7) + 128, local225, local234);
							for (local254 = local83; local254 <= local108; local254++) {
								for (local258 = local79; local258 <= local81; local258++) {
									super.aByteArrayArrayArray9[local254][local61][local258] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray9[local17][local61][local21] & 0x2) != 0) {
						local79 = local61;
						local81 = local61;
						local83 = local17;
						local108 = local17;
						while (super.anInt2144 > local81 && (super.aByteArrayArrayArray9[local17][local81 + 1][local21] & 0x2) != 0) {
							local81++;
						}
						while (local79 > 0 && (super.aByteArrayArrayArray9[local17][local79 - 1][local21] & 0x2) != 0) {
							local79--;
						}
						label218: while (local83 > 0) {
							for (local130 = local79; local130 <= local81; local130++) {
								if ((super.aByteArrayArrayArray9[local83 - 1][local130][local21] & 0x2) == 0) {
									break label218;
								}
							}
							local83--;
						}
						label207: while (local108 < 3) {
							for (local130 = local79; local130 <= local81; local130++) {
								if ((super.aByteArrayArrayArray9[local108 + 1][local130][local21] & 0x2) == 0) {
									break label207;
								}
							}
							local108++;
						}
						local130 = (local108 + 1 - local83) * (local81 + 1 - local79);
						if (local130 >= 2) {
							local225 = super.anIntArrayArrayArray2[local108][local79][local21] - 240;
							local234 = super.anIntArrayArrayArray2[local83][local79][local21];
							Static281.method3696(2, local79 << 7, (local81 << 7) + 128, local21 << 7, local21 << 7, local225, local234);
							for (local254 = local83; local254 <= local108; local254++) {
								for (local258 = local79; local258 <= local81; local258++) {
									super.aByteArrayArrayArray9[local254][local258][local21] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray9[local17][local61][local21] & 0x4) != 0) {
						local79 = local61;
						local81 = local61;
						for (local83 = local21; local83 > 0 && (super.aByteArrayArrayArray9[local17][local61][local83 - 1] & 0x4) != 0; local83--) {
						}
						for (local108 = local21; local108 < super.anInt2140 && (super.aByteArrayArrayArray9[local17][local61][local108 + 1] & 0x4) != 0; local108++) {
						}
						label271: while (local79 > 0) {
							for (local130 = local83; local130 <= local108; local130++) {
								if ((super.aByteArrayArrayArray9[local17][local79 - 1][local130] & 0x4) == 0) {
									break label271;
								}
							}
							local79--;
						}
						label260: while (local81 < super.anInt2144) {
							for (local130 = local83; local130 <= local108; local130++) {
								if ((super.aByteArrayArrayArray9[local17][local81 + 1][local130] & 0x4) == 0) {
									break label260;
								}
							}
							local81++;
						}
						if ((local81 + 1 - local79) * (-local83 + local108 + 1) >= 4) {
							local130 = super.anIntArrayArrayArray2[local17][local79][local83];
							Static281.method3696(4, local79 << 7, (local81 << 7) + 128, local83 << 7, (local108 << 7) + 128, local130, local130);
							for (@Pc(707) int local707 = local79; local707 <= local81; local707++) {
								for (local225 = local83; local225 <= local108; local225++) {
									super.aByteArrayArrayArray9[local17][local707][local225] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray9 = null;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II[Lclient!is;BLclient!ya;II[BIII)V")
	public void method1715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128[] arg2, @OriginalArg(4) Class135 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class4_Sub9 local10 = new Class4_Sub9(arg6);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(32) int local32 = local10.method4995();
			if (local32 == 0) {
				return;
			}
			local28 += local32;
			@Pc(43) int local43 = 0;
			while (true) {
				@Pc(47) int local47 = local10.method5033();
				if (local47 == 0) {
					break;
				}
				local43 += local47 - 1;
				@Pc(59) int local59 = local43 & 0x3F;
				@Pc(65) int local65 = local43 >> 6 & 0x3F;
				@Pc(69) int local69 = local43 >> 12;
				@Pc(73) int local73 = local10.method5007();
				@Pc(77) int local77 = local73 >> 2;
				@Pc(81) int local81 = local73 & 0x3;
				if (arg5 == local69 && arg1 <= local65 && arg1 + 8 > local65 && arg0 <= local59 && arg0 + 8 > local59) {
					@Pc(113) Class114 local113 = Static51.aClass151_1.method2917(local28);
					@Pc(130) int local130 = Static33.method447(local81, local65 & 0x7, local59 & 0x7, local113.anInt2851, local113.anInt2857, arg4) + arg7;
					@Pc(147) int local147 = arg8 + Static392.method5200(local81, local65 & 0x7, local113.anInt2857, local113.anInt2851, local59 & 0x7, arg4);
					if (local130 > 0 && local147 > 0 && local130 < super.anInt2144 - 1 && local147 < super.anInt2140 - 1) {
						@Pc(176) Class128 local176 = null;
						if (!super.aBoolean148) {
							@Pc(181) int local181 = arg9;
							if ((Static4.aByteArrayArrayArray1[1][local130][local147] & 0x2) == 2) {
								local181 = arg9 - 1;
							}
							if (local181 >= 0) {
								local176 = arg2[local181];
							}
						}
						this.method1716(local81 + arg4 & 0x3, local147, local77, local28, arg9, local176, arg3, arg9, -1, local130);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIILclient!is;Lclient!ya;IIII)V")
	public void method1716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class128 arg5, @OriginalArg(6) Class135 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (!Static413.aClass49_Sub1_1.method2485(Static341.anInt5549) && !Static376.method4953(arg7, arg9, Static163.anInt3008, arg1)) {
			return;
		}
		if (this.anInt2164 > arg4) {
			this.anInt2164 = arg4;
		}
		@Pc(30) Class114 local30 = Static51.aClass151_1.method2917(arg3);
		if (arg6.method5390() && Static413.aClass49_Sub1_1.aBoolean237 && local30.aBoolean206) {
			return;
		}
		@Pc(51) int local51;
		@Pc(54) int local54;
		if (arg0 == 1 || arg0 == 3) {
			local51 = local30.anInt2857;
			local54 = local30.anInt2851;
		} else {
			local54 = local30.anInt2857;
			local51 = local30.anInt2851;
		}
		@Pc(75) int local75;
		@Pc(83) int local83;
		if (arg9 + local51 <= super.anInt2144) {
			local75 = (local51 >> 1) + arg9;
			local83 = arg9 + (local51 + 1 >> 1);
		} else {
			local75 = arg9;
			local83 = arg9 + 1;
		}
		@Pc(103) int local103;
		@Pc(101) int local101;
		if (super.anInt2140 < local54 + arg1) {
			local101 = arg1 + 1;
			local103 = arg1;
		} else {
			local103 = arg1 + (local54 >> 1);
			local101 = (local54 + 1 >> 1) + arg1;
		}
		@Pc(124) Class41 local124 = Static278.aClass41Array3[arg7];
		@Pc(148) int local148 = local124.l(local75, local103) + local124.l(local83, local103) + local124.l(local75, local101) + local124.l(local83, local101) >> 2;
		@Pc(157) int local157 = (arg9 << 7) + (local51 << 6);
		@Pc(165) int local165 = (arg1 << 7) + (local54 << 6);
		@Pc(177) boolean local177 = Static82.aBoolean108 && !super.aBoolean148 && local30.aBoolean211;
		if (local30.method2183()) {
			Static353.method4676(local30, arg1, arg0, null, arg9, arg4, null);
		}
		@Pc(210) boolean local210 = arg8 == -1 && local30.anInt2837 == -1 && local30.anIntArray234 == null && local30.anIntArray235 == null && !local30.aBoolean208;
		if (Static417.aBoolean498 && (Static83.method4112(arg2) && local30.anInt2843 != 1 || !(!Static248.method3592(arg2) || local30.anInt2843 != 0))) {
			return;
		}
		if (arg2 != 22) {
			@Pc(376) Class8_Sub3 local376;
			@Pc(339) Class8_Sub3_Sub2 local339;
			@Pc(374) int local374;
			if (arg2 == 10 || arg2 == 11) {
				local339 = null;
				if (local210) {
					@Pc(370) Class8_Sub3_Sub2 local370 = new Class8_Sub3_Sub2(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg9, local51 + arg9 - 1, arg1, arg1 + local54 - 1, arg2, arg0, local177);
					local374 = local370.method852();
					local376 = local370;
					local339 = local370;
				} else {
					local376 = new Class8_Sub3_Sub6(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg9, local51 + arg9 - 1, arg1, local54 + arg1 - 1, arg2, arg0, arg8);
					local374 = 15;
				}
				@Pc(422) Class8_Sub3 local422 = Static64.method926(arg4, arg9, arg1, fw.class);
				@Pc(424) boolean local424 = false;
				if (local422 instanceof Class8_Sub3_Sub3 && arg9 == local422.aShort100 && arg1 == local422.aShort99) {
					((Class8_Sub3_Sub3) local422).aClass8_Sub3_1 = local376;
					local424 = true;
				}
				if (local424 || Static160.method3989(local376, false)) {
					if (local339 != null && local339.method5602()) {
						local339.method5601(arg6);
					}
					if (local30.aBoolean212 && Static82.aBoolean108) {
						if (local374 > 30) {
							local374 = 30;
						}
						for (@Pc(471) int local471 = 0; local471 <= local51; local471++) {
							for (@Pc(475) int local475 = 0; local475 <= local54; local475++) {
								local124.i(arg9 + local471, local475 + arg1, local374);
							}
						}
					}
				}
				if (local30.anInt2833 != 0 && arg5 != null) {
					arg5.method2465(local30.aBoolean202, arg1, local51, !local30.aBoolean205, arg9, local54);
				}
			} else {
				@Pc(623) Class8_Sub3 local623;
				if (arg2 >= 12 && arg2 <= 17 || arg2 >= 18 && arg2 <= 21) {
					if (local210) {
						local339 = new Class8_Sub3_Sub2(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg9, local51 + arg9 - 1, arg1, local54 + arg1 - 1, arg2, arg0, local177);
						local376 = local339;
						if (local339.method5602()) {
							local339.method5601(arg6);
						}
					} else {
						local376 = new Class8_Sub3_Sub6(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg9, arg9 + local51 - 1, arg1, arg1 + local54 - 1, arg2, arg0, arg8);
					}
					local623 = Static64.method926(arg4, arg9, arg1, fw.class);
					if (local623 instanceof Class8_Sub3_Sub3 && arg9 == local623.aShort100 && local623.aShort99 == arg1) {
						((Class8_Sub3_Sub3) local623).aClass8_Sub3_1 = local376;
					} else {
						Static160.method3989(local376, false);
					}
					if (Static82.aBoolean108 && !super.aBoolean148 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg4 > 0 && local30.anInt2843 != 0) {
						super.aByteArrayArrayArray9[arg4][arg9][arg1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9][arg1] | 0x4);
					}
					if (local30.anInt2833 != 0 && arg5 != null) {
						arg5.method2465(local30.aBoolean202, arg1, local51, !local30.aBoolean205, arg9, local54);
					}
				} else {
					@Pc(753) Class8_Sub2 local753;
					if (arg2 == 0) {
						@Pc(717) int local717 = local30.anInt2843;
						if (Static318.aBoolean371 && local30.anInt2843 == -1) {
							local717 = 1;
						}
						if (local210) {
							@Pc(743) Class8_Sub2_Sub1 local743 = new Class8_Sub2_Sub1(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, arg2, arg0, local177);
							if (local743.method5602()) {
								local743.method5601(arg6);
							}
							local753 = local743;
						} else {
							local753 = new Class8_Sub2_Sub2(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg2, arg0, arg8);
						}
						@Pc(776) Class8_Sub2 local776 = Static14.method170(arg4, arg9, arg1);
						if (local776 instanceof Class8_Sub2_Sub3) {
							((Class8_Sub2_Sub3) local776).aClass8_Sub2_3 = local753;
						} else {
							Static380.method4987(arg4, arg9, arg1, local753, null);
						}
						if (Static82.aBoolean108) {
							if (arg0 == 0) {
								if (local30.aBoolean212) {
									local124.i(arg9, arg1, 50);
									local124.i(arg9, arg1 + 1, 50);
								}
								if (local717 == 1 && !super.aBoolean148) {
									super.aByteArrayArrayArray9[arg4][arg9][arg1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9][arg1] | 0x1);
								}
							} else if (arg0 == 1) {
								if (local30.aBoolean212) {
									local124.i(arg9, arg1 + 1, 50);
									local124.i(arg9 + 1, arg1 - -1, 50);
								}
								if (local717 == 1 && !super.aBoolean148) {
									super.aByteArrayArrayArray9[arg4][arg9][arg1 + 1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9][arg1 + 1] | 0x2);
								}
							} else if (arg0 == 2) {
								if (local30.aBoolean212) {
									local124.i(arg9 + 1, arg1, 50);
									local124.i(arg9 + 1, arg1 - -1, 50);
								}
								if (local717 == 1 && !super.aBoolean148) {
									super.aByteArrayArrayArray9[arg4][arg9 + 1][arg1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9 + 1][arg1] | 0x1);
								}
							} else if (arg0 == 3) {
								if (local30.aBoolean212) {
									local124.i(arg9, arg1, 50);
									local124.i(arg9 + 1, arg1, 50);
								}
								if (local717 == 1 && !super.aBoolean148) {
									super.aByteArrayArrayArray9[arg4][arg9][arg1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9][arg1] | 0x2);
								}
							}
						}
						if (local30.anInt2833 != 0 && arg5 != null) {
							arg5.method2452(arg9, !local30.aBoolean205, arg2, local30.aBoolean202, arg0, arg1);
						}
						if (local30.anInt2842 != 16) {
							Static107.method1596(arg4, arg9, arg1, local30.anInt2842);
						}
					} else {
						@Pc(1061) Class8_Sub2_Sub1 local1061;
						@Pc(1044) Class8_Sub2 local1044;
						if (arg2 == 1) {
							if (local210) {
								local1061 = new Class8_Sub2_Sub1(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, arg2, arg0, local177);
								if (local1061.method5602()) {
									local1061.method5601(arg6);
								}
								local1044 = local1061;
							} else {
								local1044 = new Class8_Sub2_Sub2(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg2, arg0, arg8);
							}
							local753 = Static14.method170(arg4, arg9, arg1);
							if (local753 instanceof Class8_Sub2_Sub3) {
								((Class8_Sub2_Sub3) local753).aClass8_Sub2_3 = local1044;
							} else {
								Static380.method4987(arg4, arg9, arg1, local1044, null);
							}
							if (local30.aBoolean212 && Static82.aBoolean108) {
								if (arg0 == 0) {
									local124.i(arg9, arg1 + 1, 50);
								} else if (arg0 == 1) {
									local124.i(arg9 + 1, arg1 + 1, 50);
								} else if (arg0 == 2) {
									local124.i(arg9 + 1, arg1, 50);
								} else if (arg0 == 3) {
									local124.i(arg9, arg1, 50);
								}
							}
							if (local30.anInt2833 != 0 && arg5 != null) {
								arg5.method2452(arg9, !local30.aBoolean205, arg2, local30.aBoolean202, arg0, arg1);
							}
						} else if (arg2 == 2) {
							local374 = arg0 + 1 & 0x3;
							if (local210) {
								@Pc(1200) Class8_Sub2_Sub1 local1200 = new Class8_Sub2_Sub1(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, arg2, arg0 + 4, local177);
								@Pc(1215) Class8_Sub2_Sub1 local1215 = new Class8_Sub2_Sub1(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, arg2, local374, local177);
								if (local1200.method5602()) {
									local1200.method5601(arg6);
								}
								local753 = local1215;
								local1044 = local1200;
								if (local1215.method5602()) {
									local1215.method5601(arg6);
								}
							} else {
								local1044 = new Class8_Sub2_Sub2(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg2, arg0 + 4, arg8);
								local753 = new Class8_Sub2_Sub2(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg2, local374, arg8);
							}
							Static380.method4987(arg4, arg9, arg1, local1044, local753);
							if (local30.anInt2843 == 1 && Static82.aBoolean108 && !super.aBoolean148) {
								if (arg0 == 0) {
									super.aByteArrayArrayArray9[arg4][arg9][arg1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9][arg1] | 0x1);
									super.aByteArrayArrayArray9[arg4][arg9][arg1 + 1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9][arg1 + 1] | 0x2);
								} else if (arg0 == 1) {
									super.aByteArrayArrayArray9[arg4][arg9][arg1 + 1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9][arg1 + 1] | 0x2);
									super.aByteArrayArrayArray9[arg4][arg9 + 1][arg1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9 + 1][arg1] | 0x1);
								} else if (arg0 == 2) {
									super.aByteArrayArrayArray9[arg4][arg9 + 1][arg1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9 + 1][arg1] | 0x1);
									super.aByteArrayArrayArray9[arg4][arg9][arg1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9][arg1] | 0x2);
								} else if (arg0 == 3) {
									super.aByteArrayArrayArray9[arg4][arg9][arg1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9][arg1] | 0x2);
									super.aByteArrayArrayArray9[arg4][arg9][arg1] = (byte) (super.aByteArrayArrayArray9[arg4][arg9][arg1] | 0x1);
								}
							}
							if (local30.anInt2833 != 0 && arg5 != null) {
								arg5.method2452(arg9, !local30.aBoolean205, arg2, local30.aBoolean202, arg0, arg1);
							}
							if (local30.anInt2842 != 16) {
								Static107.method1596(arg4, arg9, arg1, local30.anInt2842);
							}
						} else if (arg2 == 3) {
							if (local210) {
								local1061 = new Class8_Sub2_Sub1(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, arg2, arg0, local177);
								local1044 = local1061;
								if (local1061.method5602()) {
									local1061.method5601(arg6);
								}
							} else {
								local1044 = new Class8_Sub2_Sub2(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg2, arg0, arg8);
							}
							local753 = Static14.method170(arg4, arg9, arg1);
							if (local753 instanceof Class8_Sub2_Sub3) {
								((Class8_Sub2_Sub3) local753).aClass8_Sub2_3 = local1044;
							} else {
								Static380.method4987(arg4, arg9, arg1, local1044, null);
							}
							if (local30.aBoolean212 && Static82.aBoolean108) {
								if (arg0 == 0) {
									local124.i(arg9, arg1 + 1, 50);
								} else if (arg0 == 1) {
									local124.i(arg9 + 1, arg1 + 1, 50);
								} else if (arg0 == 2) {
									local124.i(arg9 + 1, arg1, 50);
								} else if (arg0 == 3) {
									local124.i(arg9, arg1, 50);
								}
							}
							if (local30.anInt2833 != 0 && arg5 != null) {
								arg5.method2452(arg9, !local30.aBoolean205, arg2, local30.aBoolean202, arg0, arg1);
							}
						} else if (arg2 == 9) {
							if (local210) {
								local339 = new Class8_Sub3_Sub2(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg9, arg9, arg1, arg1, arg2, arg0, local177);
								if (local339.method5602()) {
									local339.method5601(arg6);
								}
								local376 = local339;
							} else {
								local376 = new Class8_Sub3_Sub6(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg9, arg9 + local51 - 1, arg1, local54 + arg1 - 1, arg2, arg0, arg8);
							}
							local623 = Static64.method926(arg4, arg9, arg1, fw.class);
							if (local623 instanceof Class8_Sub3_Sub3 && arg9 == local623.aShort100 && arg1 == local623.aShort99) {
								((Class8_Sub3_Sub3) local623).aClass8_Sub3_1 = local376;
							} else {
								Static160.method3989(local376, false);
							}
							if (local30.anInt2833 != 0 && arg5 != null) {
								arg5.method2465(local30.aBoolean202, arg1, local51, !local30.aBoolean205, arg9, local54);
							}
							if (local30.anInt2842 != 16) {
								Static107.method1596(arg4, arg9, arg1, local30.anInt2842);
							}
						} else {
							@Pc(1825) Class8_Sub5 local1825;
							if (arg2 == 4) {
								if (local210) {
									@Pc(1815) Class8_Sub5_Sub2 local1815 = new Class8_Sub5_Sub2(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, 0, 0, 0, arg2, arg0);
									if (local1815.method5602()) {
										local1815.method5601(arg6);
									}
									local1825 = local1815;
								} else {
									local1825 = new Class8_Sub5_Sub3(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, 0, 0, 0, arg2, arg0, arg8);
								}
								@Pc(1851) Class8_Sub5 local1851 = Static169.method2325(arg4, arg9, arg1);
								if (local1851 instanceof Class8_Sub5_Sub1) {
									((Class8_Sub5_Sub1) local1851).aClass8_Sub5_3 = local1825;
								} else {
									Static3.method36(arg4, arg9, arg1, local1825, null);
								}
							} else {
								@Pc(1873) int local1873;
								@Pc(1879) Interface4 local1879;
								@Pc(1947) Class8_Sub5_Sub2 local1947;
								@Pc(1962) Class8_Sub5 local1962;
								if (arg2 == 5) {
									local1873 = 17;
									local1879 = (Interface4) Static14.method170(arg4, arg9, arg1);
									if (local1879 != null) {
										local1873 = Static51.aClass151_1.method2917(local1879.method5603()).anInt2842 + 1;
									}
									if (local210) {
										local1947 = new Class8_Sub5_Sub2(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, 0, Static312.anIntArray408[arg0] * local1873, Static380.anIntArray496[arg0] * local1873, arg2, arg0);
										if (local1947.method5602()) {
											local1947.method5601(arg6);
										}
										local1825 = local1947;
									} else {
										local1825 = new Class8_Sub5_Sub3(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, 0, Static312.anIntArray408[arg0] * local1873, local1873 * Static380.anIntArray496[arg0], arg2, arg0, arg8);
									}
									local1962 = Static169.method2325(arg4, arg9, arg1);
									if (local1962 instanceof Class8_Sub5_Sub1) {
										((Class8_Sub5_Sub1) local1962).aClass8_Sub5_3 = local1825;
									} else {
										Static3.method36(arg4, arg9, arg1, local1825, null);
									}
								} else if (arg2 == 6) {
									local1873 = 9;
									local1879 = (Interface4) Static14.method170(arg4, arg9, arg1);
									if (local1879 != null) {
										local1873 = Static51.aClass151_1.method2917(local1879.method5603()).anInt2842 / 2 + 1;
									}
									if (local210) {
										local1947 = new Class8_Sub5_Sub2(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, arg0, Static312.anIntArray408[arg0] * local1873, local1873 * Static380.anIntArray496[arg0], arg2, arg0 + 4);
										if (local1947.method5602()) {
											local1947.method5601(arg6);
										}
										local1825 = local1947;
									} else {
										local1825 = new Class8_Sub5_Sub3(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg0, local1873 * Static2.anIntArray1[arg0], local1873 * Static213.anIntArray58[arg0], arg2, arg0 + 4, arg8);
									}
									local1962 = Static169.method2325(arg4, arg9, arg1);
									if (local1962 instanceof Class8_Sub5_Sub1) {
										((Class8_Sub5_Sub1) local1962).aClass8_Sub5_3 = local1825;
									} else {
										Static3.method36(arg4, arg9, arg1, local1825, null);
									}
								} else if (arg2 == 7) {
									local1873 = arg0 + 2 & 0x3;
									if (local210) {
										@Pc(2124) Class8_Sub5_Sub2 local2124 = new Class8_Sub5_Sub2(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, local1873, 0, 0, arg2, local1873 + 4);
										if (local2124.method5602()) {
											local2124.method5601(arg6);
										}
										local1825 = local2124;
									} else {
										local1825 = new Class8_Sub5_Sub3(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, local1873, 0, 0, arg2, local1873 + 4, arg8);
									}
									@Pc(2162) Class8_Sub5 local2162 = Static169.method2325(arg4, arg9, arg1);
									if (local2162 instanceof Class8_Sub5_Sub1) {
										((Class8_Sub5_Sub1) local2162).aClass8_Sub5_3 = local1825;
									} else {
										Static3.method36(arg4, arg9, arg1, local1825, null);
									}
								} else if (arg2 == 8) {
									local374 = arg0 + 2 & 0x3;
									@Pc(2190) int local2190 = 9;
									@Pc(2196) Interface4 local2196 = (Interface4) Static14.method170(arg4, arg9, arg1);
									if (local2196 != null) {
										local2190 = Static51.aClass151_1.method2917(local2196.method5603()).anInt2842 / 2 + 1;
									}
									@Pc(2241) Class8_Sub5 local2241;
									@Pc(2262) Class8_Sub5 local2262;
									if (local210) {
										local2241 = new Class8_Sub5_Sub2(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, arg0, Static2.anIntArray1[arg0] * local2190, local2190 * Static213.anIntArray58[arg0], arg2, arg0 + 4);
										local2262 = new Class8_Sub5_Sub2(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, arg0, 0, 0, arg2, local374 + 4);
										if (local2241.method5602()) {
											local2241.method5601(arg6);
										}
										if (local2262.method5602()) {
											local2262.method5601(arg6);
										}
									} else {
										local2241 = new Class8_Sub5_Sub3(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg0, local2190 * Static2.anIntArray1[arg0], Static213.anIntArray58[arg0] * local2190, arg2, arg0 + 4, arg8);
										local2262 = new Class8_Sub5_Sub3(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg0, 0, 0, arg2, local374 + 4, arg8);
									}
									Static3.method36(arg4, arg9, arg1, local2241, local2262);
								}
							}
						}
					}
				}
			}
		} else if (Static413.aClass49_Sub1_1.aBoolean233 || local30.anInt2871 != 0 || local30.anInt2833 == 1 || local30.aBoolean209) {
			@Pc(273) Class8_Sub4 local273;
			if (local210) {
				@Pc(271) Class8_Sub4_Sub1 local271 = new Class8_Sub4_Sub1(arg6, local30, arg7, local157, local148, local165, super.aBoolean148, arg0, local177);
				local273 = local271;
				if (local271.method5602()) {
					local271.method5601(arg6);
				}
			} else {
				local273 = new Class8_Sub4_Sub3(arg6, local30, arg4, arg7, local157, local148, local165, super.aBoolean148, arg0, arg8);
			}
			@Pc(303) Class8_Sub4 local303 = Static190.method2771(arg4, arg9, arg1);
			if (local303 instanceof Class8_Sub4_Sub2) {
				((Class8_Sub4_Sub2) local303).aClass8_Sub4_2 = local273;
			} else {
				Static276.method3664(arg4, arg9, arg1, local273);
			}
			if (local30.anInt2833 == 1 && arg5 != null) {
				arg5.method2462(arg1, arg9);
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIILclient!ya;Lclient!is;I)V")
	public void method1718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class135 arg3, @OriginalArg(5) Class128 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface4 local7 = null;
		if (arg0 == 0) {
			local7 = (Interface4) Static14.method170(arg2, arg5, arg1);
		}
		if (arg0 == 1) {
			local7 = (Interface4) Static169.method2325(arg2, arg5, arg1);
		}
		if (arg0 == 2) {
			local7 = (Interface4) Static64.method926(arg2, arg5, arg1, fw.class);
		}
		if (arg0 == 3) {
			local7 = (Interface4) Static190.method2771(arg2, arg5, arg1);
		}
		if (local7 == null) {
			return;
		}
		@Pc(70) Class114 local70 = Static51.aClass151_1.method2917(local7.method5603());
		@Pc(74) int local74 = local7.method5606();
		@Pc(78) int local78 = local7.method5600();
		if (local70.method2183()) {
			Static307.method4006(arg1, arg5, arg2, local70);
		}
		if (local7.method5602()) {
			local7.method5605(arg3);
		}
		if (arg0 == 0) {
			@Pc(105) Class8_Sub2 local105 = Static14.method170(arg2, arg5, arg1);
			if (local105 instanceof Class8_Sub2_Sub3) {
				((Class8_Sub2_Sub3) local105).aClass8_Sub2_3 = null;
			} else {
				Static72.method1176(arg2, arg5, arg1);
			}
			if (local70.anInt2833 != 0) {
				arg4.method2458(arg1, local78, arg5, !local70.aBoolean205, local74, local70.aBoolean202);
				return;
			}
		} else if (arg0 == 1) {
			@Pc(286) Class8_Sub5 local286 = Static169.method2325(arg2, arg5, arg1);
			if (!(local286 instanceof Class8_Sub5_Sub1)) {
				Static44.method583(arg2, arg5, arg1);
				return;
			}
			((Class8_Sub5_Sub1) local286).aClass8_Sub5_3 = null;
		} else {
			if (arg0 == 2) {
				@Pc(161) Class8_Sub3 local161 = Static64.method926(arg2, arg5, arg1, fw.class);
				if (local161 instanceof Class8_Sub3_Sub3 && local161.aShort100 == arg5 && arg1 == local161.aShort99) {
					((Class8_Sub3_Sub3) local161).aClass8_Sub3_1 = null;
				} else {
					Static218.method2968(arg2, arg5, arg1, fw.class);
				}
				if (local70.anInt2833 != 0 && arg5 + local70.anInt2851 < super.anInt2144 && super.anInt2140 > arg1 + local70.anInt2851 && arg5 + local70.anInt2857 < super.anInt2144 && local70.anInt2857 + arg1 < super.anInt2140) {
					arg4.method2457(local70.anInt2857, !local70.aBoolean205, arg5, local78, arg1, local70.aBoolean202, local70.anInt2851);
					return;
				}
			} else if (arg0 == 3) {
				@Pc(256) Class8_Sub4 local256 = Static190.method2771(arg2, arg5, arg1);
				if (local256 instanceof Class8_Sub4_Sub2) {
					((Class8_Sub4_Sub2) local256).aClass8_Sub4_2 = null;
				} else {
					Static426.method3626(arg2, arg5, arg1);
				}
				if (local70.anInt2833 != 1) {
					return;
				}
				arg4.method2455(arg5, arg1);
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!fh;II[IIILclient!ya;III)V")
	public void method1719(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class135 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean148) {
			return;
		}
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(19) Class206 local19 = null;
		@Pc(25) int local25 = (arg0 & 0x7) * 8;
		@Pc(31) int local31 = (arg5 & 0x7) * 8;
		while (true) {
			@Pc(63) int local63;
			@Pc(125) int local125;
			@Pc(167) int local167;
			@Pc(191) int local191;
			@Pc(70) int local70;
			@Pc(117) int local117;
			label235: do {
				while (true) {
					@Pc(52) int local52;
					@Pc(335) int local335;
					while (arg1.anInt6207 < arg1.aByteArray81.length) {
						local52 = arg1.method5007();
						if (local52 == 0) {
							local19 = new Class206(arg1);
						} else {
							if (local52 == 1) {
								local63 = arg1.method5007();
								continue label235;
							}
							if (local52 == 2) {
								if (local19 == null) {
									local19 = new Class206();
								}
								local19.method4234(arg1);
							} else if (local52 != 128) {
								if (local52 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray10 == null) {
									super.aByteArrayArrayArray10 = new byte[4][][];
								}
								for (local63 = 0; local63 < 4; local63++) {
									@Pc(323) byte local323 = arg1.method5063();
									@Pc(339) int local339;
									if (local323 == 0 && super.aByteArrayArrayArray10[arg9] != null) {
										if (local63 <= arg2) {
											local335 = arg6;
											local339 = arg6 + 7;
											local117 = arg8;
											local125 = arg8 + 7;
											if (arg8 < 0) {
												local117 = 0;
											} else if (arg8 >= super.anInt2140) {
												local117 = super.anInt2140;
											}
											if (arg6 < 0) {
												local335 = 0;
											} else if (super.anInt2144 <= arg6) {
												local335 = super.anInt2144;
											}
											if (local339 < 0) {
												local339 = 0;
											} else if (super.anInt2144 <= local339) {
												local339 = super.anInt2144;
											}
											if (local125 < 0) {
												local125 = 0;
											} else if (local125 >= super.anInt2140) {
												local125 = super.anInt2140;
											}
											while (local339 > local335) {
												while (local125 > local117) {
													super.aByteArrayArrayArray10[arg9][local335][local117] = 0;
													local117++;
												}
												local335++;
											}
										}
									} else if (local323 == 1) {
										if (super.aByteArrayArrayArray10[arg9] == null) {
											super.aByteArrayArrayArray10[arg9] = new byte[super.anInt2144 + 1][super.anInt2140 + 1];
										}
										for (local335 = 0; local335 < 64; local335 += 4) {
											for (local339 = 0; local339 < 64; local339 += 4) {
												@Pc(474) byte local474 = arg1.method5063();
												if (arg2 >= local63) {
													for (local125 = local335; local125 < local335 + 4; local125++) {
														for (local167 = local339; local167 < local339 + 4; local167++) {
															if (local25 <= local125 && local25 + 8 > local125 && local31 <= local167 && local31 < local31 + 8) {
																local191 = Static81.method1307(local125 & 0x7, arg3, local167 & 0x7) + arg6;
																@Pc(542) int local542 = arg8 + Static289.method3775(local125 & 0x7, local167 & 0x7, arg3);
																if (local191 >= 0 && local191 < super.anInt2144 && local542 >= 0 && local542 < super.anInt2140) {
																	super.aByteArrayArrayArray10[arg9][local191][local542] = local474;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg4 == null) {
								arg1.anInt6207 += 10;
							} else {
								arg4[0] = arg1.method5028();
								arg4[1] = arg1.method5061();
								arg4[2] = arg1.method5061();
								arg4[3] = arg1.method5061();
								arg4[4] = arg1.method5028();
							}
						}
					}
					if (local19 != null) {
						Static297.method3870(local19, arg6 >> 3, arg8 >> 3);
					}
					if (super.aByteArrayArrayArray10 != null && super.aByteArrayArrayArray10[arg9] != null) {
						local52 = arg6 + 7;
						local63 = arg8 + 7;
						for (local70 = arg6; local70 < local52; local70++) {
							for (local335 = arg8; local335 < local63; local335++) {
								super.aByteArrayArrayArray10[arg9][local70][local335] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local63 <= 0);
			for (local70 = 0; local70 < local63; local70++) {
				@Pc(79) Class154 local79 = new Class154(arg7, arg1, 0);
				if (local79.anInt3699 == 31) {
					@Pc(92) Class189 local92 = Static458.aClass31_4.method505(arg1.method5028());
					local79.method2942(local92.anInt4640, local92.anInt4642, local92.anInt4641, local92.anInt4643);
				}
				if (arg7.method5362() > 0) {
					@Pc(111) Class4_Sub7 local111 = local79.aClass4_Sub7_1;
					local117 = local111.method4451() >> 7;
					local125 = local111.method4449() >> 7;
					if (arg2 == local79.anInt3704 && local25 <= local117 && local25 + 8 > local117 && local125 >= local31 && local125 < local31 + 8) {
						local167 = Static337.method4457(arg3, local111.method4449() & 0x3FF, local111.method4451() & 0x3FF) + (arg6 << 7);
						local117 = local167 >> 7;
						local191 = Static321.method4249(local111.method4449() & 0x3FF, local111.method4451() & 0x3FF, arg3) + (arg8 << 7);
						local125 = local191 >> 7;
						if (local117 >= 0 && local125 >= 0 && super.anInt2144 > local117 && super.anInt2140 > local125) {
							local111.method4444(local191, super.anIntArrayArrayArray2[arg2][local117][local125] - local111.method4448(), local167);
							if (arg7.method5362() > 0) {
								Static320.method4235(local79);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ya;II[B[Lclient!is;I)V")
	public void method1720(@OriginalArg(0) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class128[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class4_Sub9 local10 = new Class4_Sub9(arg2);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method4995();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method5033();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local10.method5007();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = arg4 + local53;
				@Pc(77) int local77 = local47 + arg1;
				if (local73 > 0 && local77 > 0 && local73 < super.anInt2144 - 1 && super.anInt2140 - 1 > local77) {
					@Pc(102) Class128 local102 = null;
					if (!super.aBoolean148) {
						@Pc(107) int local107 = local57;
						if ((Static4.aByteArrayArrayArray1[1][local73][local77] & 0x2) == 2) {
							local107 = local57 - 1;
						}
						if (local107 >= 0) {
							local102 = arg3[local107];
						}
					}
					this.method1716(local69, local77, local65, local16, local57, local102, arg0, local57, -1, local73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!fh;I[ILclient!ya;ZI)V")
	public void method1721(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class135 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean148) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class206 local13 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		while (true) {
			@Pc(33) int local33;
			@Pc(94) int local94;
			@Pc(98) int local98;
			@Pc(40) int local40;
			@Pc(85) int local85;
			label308: do {
				while (true) {
					@Pc(24) int local24;
					@Pc(250) int local250;
					@Pc(254) int local254;
					while (arg0.anInt6207 < arg0.aByteArray81.length) {
						local24 = arg0.method5007();
						if (local24 == 0) {
							local13 = new Class206(arg0);
						} else {
							if (local24 == 1) {
								local33 = arg0.method5007();
								continue label308;
							}
							if (local24 == 2) {
								if (local13 == null) {
									local13 = new Class206();
								}
								local13.method4234(arg0);
							} else if (local24 != 128) {
								if (local24 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray10 == null) {
									super.aByteArrayArrayArray10 = new byte[4][][];
								}
								local11 = true;
								for (local33 = 0; local33 < 4; local33++) {
									@Pc(238) byte local238 = arg0.method5063();
									if (local238 == 0 && super.aByteArrayArrayArray10[local33] != null) {
										local250 = arg1;
										local254 = arg1 + 64;
										local85 = arg4;
										if (local254 < 0) {
											local254 = 0;
										} else if (local254 >= super.anInt2144) {
											local254 = super.anInt2144;
										}
										if (arg1 < 0) {
											local250 = 0;
										} else if (super.anInt2144 <= arg1) {
											local250 = super.anInt2144;
										}
										local94 = arg4 + 64;
										if (arg4 < 0) {
											local85 = 0;
										} else if (super.anInt2140 <= arg4) {
											local85 = super.anInt2140;
										}
										if (local94 < 0) {
											local94 = 0;
										} else if (super.anInt2140 <= local94) {
											local94 = super.anInt2140;
										}
										while (local250 < local254) {
											while (local85 < local94) {
												super.aByteArrayArrayArray10[local33][local250][local85] = 0;
												local85++;
											}
											local250++;
										}
									} else if (local238 == 1) {
										if (super.aByteArrayArrayArray10[local33] == null) {
											super.aByteArrayArrayArray10[local33] = new byte[super.anInt2144 + 1][super.anInt2140 + 1];
										}
										for (local250 = 0; local250 < 64; local250 += 4) {
											for (local254 = 0; local254 < 64; local254 += 4) {
												@Pc(522) byte local522 = arg0.method5063();
												for (local94 = arg1 + local250; local94 < local250 + arg1 + 4; local94++) {
													for (local98 = local254 + arg4; local98 < arg4 + local254 + 4; local98++) {
														if (local94 >= 0 && super.anInt2144 > local94 && local98 >= 0 && super.anInt2140 > local98) {
															super.aByteArrayArrayArray10[local33][local94][local98] = local522;
														}
													}
												}
											}
										}
									} else if (local238 == 2) {
										if (super.aByteArrayArrayArray10[local33] == null) {
											super.aByteArrayArrayArray10[local33] = new byte[super.anInt2144 + 1][super.anInt2140 + 1];
										}
										if (local33 > 0) {
											local250 = arg1;
											local254 = arg1 + 64;
											local85 = arg4;
											if (local254 < 0) {
												local254 = 0;
											} else if (local254 >= super.anInt2144) {
												local254 = super.anInt2144;
											}
											if (arg4 < 0) {
												local85 = 0;
											} else if (super.anInt2140 <= arg4) {
												local85 = super.anInt2140;
											}
											local94 = arg4 + 64;
											if (arg1 < 0) {
												local250 = 0;
											} else if (super.anInt2144 <= arg1) {
												local250 = super.anInt2144;
											}
											if (local94 < 0) {
												local94 = 0;
											} else if (local94 >= super.anInt2140) {
												local94 = super.anInt2140;
											}
											while (local254 > local250) {
												while (local85 < local94) {
													super.aByteArrayArrayArray10[local33][local250][local85] = super.aByteArrayArrayArray10[local33 - 1][local250][local85];
													local85++;
												}
												local250++;
											}
										}
									}
								}
							} else if (arg2 == null) {
								arg0.anInt6207 += 10;
							} else {
								arg2[0] = arg0.method5028();
								arg2[1] = arg0.method5061();
								arg2[2] = arg0.method5061();
								arg2[3] = arg0.method5061();
								arg2[4] = arg0.method5028();
							}
						}
					}
					if (local13 != null) {
						for (local24 = 0; local24 < 8; local24++) {
							for (local33 = 0; local33 < 8; local33++) {
								local40 = local24 + (arg1 >> 3);
								local250 = local33 + (arg4 >> 3);
								if (local40 >= 0 && local40 < super.anInt2144 >> 3 && local250 >= 0 && super.anInt2140 >> 3 > local250) {
									Static297.method3870(local13, local40, local250);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray10 != null) {
						for (local24 = 0; local24 < 4; local24++) {
							if (super.aByteArrayArrayArray10[local24] != null) {
								for (local33 = 0; local33 < 16; local33++) {
									for (local40 = 0; local40 < 16; local40++) {
										local250 = local33 + (arg1 >> 2);
										local254 = (arg4 >> 2) + local40;
										if (local250 >= 0 && local250 < 26 && local254 >= 0 && local254 < 26) {
											super.aByteArrayArrayArray10[local24][local250][local254] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local33 <= 0);
			for (local40 = 0; local40 < local33; local40++) {
				@Pc(49) Class154 local49 = new Class154(arg3, arg0, 0);
				if (local49.anInt3699 == 31) {
					@Pc(60) Class189 local60 = Static458.aClass31_4.method505(arg0.method5028());
					local49.method2942(local60.anInt4640, local60.anInt4642, local60.anInt4641, local60.anInt4643);
				}
				if (arg3.method5362() > 0) {
					@Pc(77) Class4_Sub7 local77 = local49.aClass4_Sub7_1;
					local85 = local77.method4451() + (arg1 << 7);
					local94 = local77.method4449() + (arg4 << 7);
					local98 = local85 >> 7;
					@Pc(102) int local102 = local94 >> 7;
					if (local98 >= 0 && local102 >= 0 && super.anInt2144 > local98 && super.anInt2140 > local102) {
						local77.method4444(local94, super.anIntArrayArrayArray2[local49.anInt3704][local98][local102] - local77.method4448(), local85);
						if (arg3.method5362() > 0) {
							Static320.method4235(local49);
						}
					}
				}
			}
		}
	}
}
