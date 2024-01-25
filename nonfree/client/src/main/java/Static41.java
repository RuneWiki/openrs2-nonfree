import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
	public static int anInt661;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIII[FI)V")
	public static void method622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static409.method687(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static409.method687(arg0)) {
			@Pc(35) int local35 = Static368.method6275(6408);
			@Pc(37) int local37 = 0;
			@Pc(48) int local48 = arg1 < arg0 ? arg1 : arg0;
			@Pc(52) int local52 = arg1 >> 1;
			@Pc(56) int local56 = arg0 >> 1;
			@Pc(58) float[] local58 = arg4;
			@Pc(65) float[] local65 = new float[local35 * local52 * local56];
			while (true) {
				OpenGL.glTexImage2Df(3553, local37, 34842, arg1, arg0, 0, 6408, 5126, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(84) int local84 = arg1 * local35;
				for (@Pc(86) int local86 = 0; local86 < local35; local86++) {
					@Pc(90) int local90 = local86;
					@Pc(92) int local92 = local86;
					@Pc(96) int local96 = local86 + local84;
					for (@Pc(98) int local98 = 0; local98 < local56; local98++) {
						for (@Pc(102) int local102 = 0; local102 < local52; local102++) {
							@Pc(108) float local108 = local58[local92];
							local92 += local35;
							@Pc(118) float local118 = local108 + local58[local92];
							@Pc(124) float local124 = local118 + local58[local96];
							local92 += local35;
							local96 += local35;
							@Pc(138) float local138 = local124 + local58[local96];
							local96 += local35;
							local65[local90] = local138 * 0.25F;
							local90 += local35;
						}
						local92 += local84;
						local96 += local84;
					}
				}
				@Pc(178) float[] local178 = local65;
				local65 = local58;
				local58 = local178;
				arg0 = local56;
				arg1 = local52;
				local56 >>= 0x1;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLclient!za;)V")
	public static void method623(@OriginalArg(1) Class75 arg0) {
		if (Static377.anInt6585 < 2 && !Static11.aBoolean7 || Static125.aClass93_11 != null) {
			return;
		}
		@Pc(36) String local36;
		if (Static11.aBoolean7 && Static377.anInt6585 < 2) {
			local36 = Static88.aString38 + Static401.aClass231_114.method5261(Static80.anInt6195) + Static359.aString66 + " ->";
		} else if (Static111.aBoolean107 && Static161.aClass115_1.method2374(81) && Static377.anInt6585 > 2) {
			local36 = Static48.method741((Class2_Sub35) Static93.aClass181_7.aClass2_156.aClass2_267.aClass2_267);
		} else {
			@Pc(65) Class2_Sub35 local65 = (Class2_Sub35) Static93.aClass181_7.aClass2_156.aClass2_267;
			local36 = Static48.method741(local65);
			@Pc(71) int[] local71 = null;
			if (Static315.method4489(local65.anInt5875)) {
				local71 = Static413.aClass271_2.method6193((int) local65.aLong299).anIntArray521;
			} else if (local65.anInt5878 != -1) {
				local71 = Static413.aClass271_2.method6193(local65.anInt5878).anIntArray521;
			} else if (Static188.method5359(local65.anInt5875)) {
				@Pc(146) Class2_Sub34 local146 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local65.aLong299);
				if (local146 != null) {
					@Pc(151) Class11_Sub5_Sub2_Sub2 local151 = local146.aClass11_Sub5_Sub2_Sub2_2;
					@Pc(154) Class82 local154 = local151.aClass82_1;
					if (local154.anIntArray149 != null) {
						local154 = local154.method1888(Static63.aClass120_2);
					}
					if (local154 != null) {
						local71 = local154.anIntArray151;
					}
				}
			} else if (Static459.method6243(local65.anInt5875)) {
				@Pc(111) Class192 local111;
				if (local65.anInt5875 == 1007) {
					local111 = Static249.aClass39_2.method748((int) local65.aLong299);
				} else {
					local111 = Static249.aClass39_2.method748((int) (local65.aLong299 >>> 32 & 0x7FFFFFFFL));
				}
				if (local111.anIntArray462 != null) {
					local111 = local111.method4323(Static63.aClass120_2);
				}
				if (local111 != null) {
					local71 = local111.anIntArray460;
				}
			}
			if (local71 != null) {
				local36 = local36 + Static148.method2251(local71);
			}
		}
		if (Static377.anInt6585 > 2) {
			local36 = local36 + "<col=ffffff> / " + (Static377.anInt6585 - 2) + Static394.aClass231_131.method5261(Static80.anInt6195);
		}
		if (Static338.aClass93_13 != null) {
			@Pc(259) Class14 local259 = Static338.aClass93_13.method2128(arg0);
			if (local259 == null) {
				local259 = Static143.aClass14_2;
			}
			local259.method4893(Static338.aClass93_13.anInt2436, Static338.aClass93_13.anInt2506, Static338.aClass93_13.anInt2439, Static243.aClass41Array8, Static269.anInt2102, Static338.aClass93_13.anInt2427, local36, Static338.aClass93_13.anInt2473, Static112.anIntArray145, Static338.aClass93_13.anInt2495, Static320.anIntArray482, Static385.aRandom1, Static134.anInt2522, Static104.anInt1681);
			Static437.method5911(Static320.anIntArray482[2], Static320.anIntArray482[1], Static320.anIntArray482[3], Static320.anIntArray482[0]);
		} else if (Static252.aClass93_15 != null && Static10.aClass200_1 == Static183.aClass200_3) {
			@Pc(240) int local240 = Static143.aClass14_2.method4899(Static385.aRandom1, Static134.anInt2522, Static243.aClass41Array8, Static112.anIntArray145, Static127.anInt2133 + 16, local36, Static305.anInt167 + 4);
			Static437.method5911(local240 + Static9.aClass15_9.method320(local36), Static127.anInt2133, 16, Static305.anInt167 + 4);
			return;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	public static void method624() {
		Static352.aClass14_3 = null;
		Static233.aClass41Array6 = null;
		Static179.aClass41Array3 = null;
		Static202.aClass41Array4 = null;
		Static239.aClass41Array7 = null;
		Static417.aClass41Array13 = null;
		Static420.aClass41Array14 = null;
		Static440.aClass41Array15 = null;
		Static321.aClass41Array10 = null;
		Static230.aClass41Array5 = null;
		Static143.aClass14_2 = null;
		Static170.aClass41Array2 = null;
		Static392.aClass41Array12 = null;
		Static446.aClass41_19 = null;
		Static157.aClass41Array1 = null;
		Static255.aClass41Array9 = null;
		Static11.aClass14_1 = null;
		Static54.aClass41_2 = null;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "()V")
	public static void method626() {
		Static186.anInt3290 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static461.anInt7751; local3++) {
			@Pc(8) Class160 local8 = Static123.aClass160Array1[local3];
			@Pc(12) int local12;
			if (Static136.anIntArray210 != null) {
				for (local12 = 0; local12 < Static136.anIntArray210.length; local12++) {
					if (Static136.anIntArray210[local12] != -1000000 && (local8.anInt3929 <= Static136.anIntArray210[local12] || local8.anInt3946 <= Static136.anIntArray210[local12]) && (local8.anInt3945 <= Static421.anIntArray582[local12] || local8.anInt3940 <= Static421.anIntArray582[local12]) && (local8.anInt3945 >= Static96.anIntArray108[local12] || local8.anInt3940 >= Static96.anIntArray108[local12]) && (local8.anInt3943 <= Static183.anIntArray266[local12] || local8.anInt3937 <= Static183.anIntArray266[local12]) && (local8.anInt3943 >= Static160.anIntArray251[local12] || local8.anInt3937 >= Static160.anIntArray251[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt3935 == 1) {
				local12 = local8.anInt3931 + Static30.anInt535 - Static308.anInt5540;
				if (local12 >= 0 && local12 <= Static30.anInt535 + Static30.anInt535) {
					local110 = local8.anInt3936 + Static30.anInt535 - Static109.anInt1838;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static30.anInt535 + Static30.anInt535) {
						continue;
					}
					local128 = local8.anInt3933 + Static30.anInt535 - Static109.anInt1838;
					if (local128 > Static30.anInt535 + Static30.anInt535) {
						local128 = Static30.anInt535 + Static30.anInt535;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static409.aBooleanArrayArray5[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static268.anInt4658 - local8.anInt3945;
						if (local164 > Static187.anInt3296) {
							local8.anInt3942 = 1;
						} else {
							if (local164 >= -Static187.anInt3296) {
								continue;
							}
							local8.anInt3942 = 2;
							local164 = -local164;
						}
						local8.anInt3941 = (local8.anInt3943 - Static171.anInt5502 << 8) / local164;
						local8.anInt3932 = (local8.anInt3937 - Static171.anInt5502 << 8) / local164;
						local8.anInt3947 = (local8.anInt3929 - Static22.anInt425 << 8) / local164;
						local8.anInt3944 = (local8.anInt3946 - Static22.anInt425 << 8) / local164;
						Static417.aClass160Array2[Static186.anInt3290++] = local8;
					}
				}
			} else if (local8.anInt3935 == 2) {
				local12 = local8.anInt3936 + Static30.anInt535 - Static109.anInt1838;
				if (local12 >= 0 && local12 <= Static30.anInt535 + Static30.anInt535) {
					local110 = local8.anInt3931 + Static30.anInt535 - Static308.anInt5540;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static30.anInt535 + Static30.anInt535) {
						continue;
					}
					local128 = local8.anInt3938 + Static30.anInt535 - Static308.anInt5540;
					if (local128 > Static30.anInt535 + Static30.anInt535) {
						local128 = Static30.anInt535 + Static30.anInt535;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static409.aBooleanArrayArray5[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static171.anInt5502 - local8.anInt3943;
						if (local164 > Static187.anInt3296) {
							local8.anInt3942 = 3;
						} else {
							if (local164 >= -Static187.anInt3296) {
								continue;
							}
							local8.anInt3942 = 4;
							local164 = -local164;
						}
						local8.anInt3934 = (local8.anInt3945 - Static268.anInt4658 << 8) / local164;
						local8.anInt3930 = (local8.anInt3940 - Static268.anInt4658 << 8) / local164;
						local8.anInt3947 = (local8.anInt3929 - Static22.anInt425 << 8) / local164;
						local8.anInt3944 = (local8.anInt3946 - Static22.anInt425 << 8) / local164;
						Static417.aClass160Array2[Static186.anInt3290++] = local8;
					}
				}
			} else if (local8.anInt3935 == 4) {
				local12 = local8.anInt3929 - Static22.anInt425;
				if (local12 > Static195.anInt3386) {
					local110 = local8.anInt3936 + Static30.anInt535 - Static109.anInt1838;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static30.anInt535 + Static30.anInt535) {
						continue;
					}
					local128 = local8.anInt3933 + Static30.anInt535 - Static109.anInt1838;
					if (local128 > Static30.anInt535 + Static30.anInt535) {
						local128 = Static30.anInt535 + Static30.anInt535;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt3931 + Static30.anInt535 - Static308.anInt5540;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static30.anInt535 + Static30.anInt535) {
						continue;
					}
					local164 = local8.anInt3938 + Static30.anInt535 - Static308.anInt5540;
					if (local164 > Static30.anInt535 + Static30.anInt535) {
						local164 = Static30.anInt535 + Static30.anInt535;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static409.aBooleanArrayArray5[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt3942 = 5;
						local8.anInt3934 = (local8.anInt3945 - Static268.anInt4658 << 8) / local12;
						local8.anInt3930 = (local8.anInt3940 - Static268.anInt4658 << 8) / local12;
						local8.anInt3941 = (local8.anInt3943 - Static171.anInt5502 << 8) / local12;
						local8.anInt3932 = (local8.anInt3937 - Static171.anInt5502 << 8) / local12;
						Static417.aClass160Array2[Static186.anInt3290++] = local8;
					}
				}
			}
		}
	}
}
