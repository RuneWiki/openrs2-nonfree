import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Lclient!xa;")
	public static Class58 aClass58_39;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "F")
	public static float aFloat159 = 1.0F;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method6108() {
		@Pc(1) Class136 local1 = Static579.aClass136_107;
		synchronized (Static579.aClass136_107) {
			Static579.aClass136_107.method3476();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	public static void method6109() {
		Static269.aBoolean366 = true;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIF[FFII)V")
	public static void method6110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg0 - arg1;
		@Pc(13) int local13 = arg9 - arg2;
		@Pc(17) int local17 = arg8 - arg3;
		@Pc(38) float local38 = (float) local17 * arg6[0] + (float) local13 * arg6[1] + (float) local9 * arg6[2];
		@Pc(59) float local59 = arg6[5] * (float) local9 + arg6[3] * (float) local17 + (float) local13 * arg6[4];
		@Pc(80) float local80 = (float) local9 * arg6[8] + arg6[7] * (float) local13 + arg6[6] * (float) local17;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local91 *= arg5;
		}
		@Pc(105) float local105 = local59 + arg7 + 0.5F;
		@Pc(126) float local126;
		if (arg4 == 1) {
			local126 = local91;
			local91 = -local105;
			local105 = local126;
		} else if (arg4 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg4 == 3) {
			local126 = local91;
			local91 = local105;
			local105 = -local126;
		}
		Static195.aFloat81 = local105;
		Static66.aFloat18 = local91;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method6111() {
		for (@Pc(6) Class6_Sub16 local6 = (Class6_Sub16) Static1.aClass361_67.method7838(); local6 != null; local6 = (Class6_Sub16) Static1.aClass361_67.method7845()) {
			if (local6.aBoolean151) {
				local6.method2013();
			}
		}
		for (@Pc(30) Class6_Sub16 local30 = (Class6_Sub16) Static427.aClass361_54.method7838(); local30 != null; local30 = (Class6_Sub16) Static427.aClass361_54.method7845()) {
			if (local30.aBoolean151) {
				local30.method2013();
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!oa;IILclient!rr;I)V")
	public static void method6112(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class292 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class86 local10 = arg2.method6463(arg0);
		if (local10 == null) {
			return;
		}
		arg0.ca(arg1, arg3, arg1 + arg2.anInt7963, arg3 - -arg2.anInt7912);
		if (Static113.anInt2183 == 2 || Static113.anInt2183 == 5 || Static398.aClass58_37 == null) {
			arg0.L(-16777216, local10, arg1, arg3);
			return;
		}
		@Pc(58) int local58;
		@Pc(56) int local56;
		@Pc(54) int local54;
		@Pc(60) int local60;
		if (Static346.anInt6215 == 4) {
			local54 = (int) -Static428.aFloat160 & 0x3FFF;
			local56 = Static220.anInt4550;
			local58 = Static157.anInt3359;
			local60 = 4096;
		} else {
			local60 = 4096 - Static291.anInt5446 * 16;
			local56 = Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540;
			local58 = Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542;
			local54 = Static185.anInt3860 + (int) -Static428.aFloat160 & 0x3FFF;
		}
		@Pc(95) int local95 = local58 / 128 + 48 - (Static473.anInt8075 - 104) * 2;
		@Pc(113) int local113 = Static165.anInt6749 * 4 + 48 - (Static165.anInt6749 - 104) * 2 - local56 / 128;
		Static398.aClass58_37.method7659((float) arg2.anInt7963 / 2.0F + (float) arg1, (float) arg3 + (float) arg2.anInt7912 / 2.0F, (float) local95, (float) local113, local60, local54 << 2, local10, arg1, arg3);
		@Pc(163) int local163;
		@Pc(173) int local173;
		@Pc(184) int local184;
		@Pc(195) int local195;
		for (@Pc(147) Class6_Sub35 local147 = (Class6_Sub35) Static295.aClass361_45.method7838(); local147 != null; local147 = (Class6_Sub35) Static295.aClass361_45.method7845()) {
			@Pc(152) int local152 = local147.anInt6119;
			local163 = (Static216.aClass303_3.anIntArray596[local152] >> 14 & 0x3FFF) - Static39.anInt4952;
			local173 = (Static216.aClass303_3.anIntArray596[local152] & 0x3FFF) - Static138.anInt3088;
			local184 = local163 * 4 + 2 - local58 / 128;
			local195 = local173 * 4 + 2 - local56 / 128;
			Static400.method5852(arg2, Static216.aClass303_3.anIntArray597[local152], local195, arg0, arg3, local184, local10, arg1);
		}
		for (local163 = 0; local163 < Static546.anInt9056; local163++) {
			local173 = Static66.anIntArray127[local163] * 4 + 2 - local58 / 128;
			local184 = Static392.anIntArray582[local163] * 4 + 2 - local56 / 128;
			@Pc(252) Class252 local252 = Static412.aClass307_4.method6636(Static410.anIntArray528[local163]);
			if (local252.anIntArray506 != null) {
				local252 = local252.method5799(Static498.aClass101_1);
				if (local252 == null || local252.anInt6921 == -1) {
					continue;
				}
			}
			Static400.method5852(arg2, local252.anInt6921, local184, arg0, arg3, local173, local10, arg1);
		}
		@Pc(335) int local335;
		@Pc(346) int local346;
		for (@Pc(291) Class6_Sub51 local291 = (Class6_Sub51) Static478.aClass128_40.method3265(); local291 != null; local291 = (Class6_Sub51) Static478.aClass128_40.method3273()) {
			local184 = (int) (local291.aLong263 >> 28 & 0x3L);
			if (local184 == Static296.anInt5524) {
				local195 = (int) (local291.aLong263 & 0x3FFFL) - Static39.anInt4952;
				@Pc(324) int local324 = (int) (local291.aLong263 >> 14 & 0x3FFFL) - Static138.anInt3088;
				local335 = local195 * 4 + 2 - local58 / 128;
				local346 = local324 * 4 + 2 - local56 / 128;
				Static368.method5525(local335, Static552.aClass58Array21[0], local346, arg3, arg1, local10, arg2);
			}
		}
		@Pc(433) int local433;
		for (local184 = 0; local184 < Static464.anInt7995; local184++) {
			@Pc(377) Class6_Sub34 local377 = (Class6_Sub34) Static593.aClass128_43.method3263((long) Static291.anIntArray405[local184]);
			if (local377 != null) {
				@Pc(382) Class4_Sub1_Sub1_Sub1 local382 = local377.aClass4_Sub1_Sub1_Sub1_2;
				if (local382.method155() && Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 == local382.aByte108) {
					@Pc(394) Class273 local394 = local382.aClass273_1;
					if (local394 != null && local394.anIntArray537 != null) {
						local394 = local394.method6159(Static498.aClass101_1);
					}
					if (local394 != null && local394.aBoolean520 && local394.aBoolean521) {
						local346 = local382.anInt9542 / 128 - local58 / 128;
						local433 = local382.anInt9540 / 128 - local56 / 128;
						if (local394.anInt7465 == -1) {
							Static368.method5525(local346, Static552.aClass58Array21[1], local433, arg3, arg1, local10, arg2);
						} else {
							Static400.method5852(arg2, local394.anInt7465, local433, arg0, arg3, local346, local10, arg1);
						}
					}
				}
			}
		}
		local195 = Static231.anInt4727;
		@Pc(469) int[] local469 = Static249.anIntArray372;
		@Pc(516) int local516;
		@Pc(520) int local520;
		@Pc(545) int local545;
		for (local335 = 0; local335 < local195; local335++) {
			@Pc(479) Class4_Sub1_Sub1_Sub2 local479 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local469[local335]];
			if (local479 != null && local479.method5920() && local479 != Static328.aClass4_Sub1_Sub1_Sub2_2 && local479.aByte108 == Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108) {
				local433 = local479.anInt9542 / 128 - local58 / 128;
				local516 = local479.anInt9540 / 128 - local56 / 128;
				@Pc(518) boolean local518 = false;
				for (local520 = 0; local520 < Static574.anInt9426; local520++) {
					if (local479.aString63.equals(Static398.aStringArray29[local520]) && Static300.anIntArray409[local520] != 0) {
						local518 = true;
						break;
					}
				}
				@Pc(543) boolean local543 = false;
				for (local545 = 0; local545 < Static324.anInt7486; local545++) {
					if (local479.aString63.equals(Static198.aClass234Array1[local545].aString56)) {
						local543 = true;
						break;
					}
				}
				@Pc(565) boolean local565 = false;
				if (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7137 != 0 && local479.anInt7137 != 0 && local479.anInt7137 == Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7137) {
					local565 = true;
				}
				if (local479.aBoolean498) {
					Static368.method5525(local433, Static552.aClass58Array21[6], local516, arg3, arg1, local10, arg2);
				} else if (local518) {
					Static368.method5525(local433, Static552.aClass58Array21[3], local516, arg3, arg1, local10, arg2);
				} else if (local543) {
					Static368.method5525(local433, Static552.aClass58Array21[5], local516, arg3, arg1, local10, arg2);
				} else if (local565) {
					Static368.method5525(local433, Static552.aClass58Array21[4], local516, arg3, arg1, local10, arg2);
				} else {
					Static368.method5525(local433, Static552.aClass58Array21[2], local516, arg3, arg1, local10, arg2);
				}
			}
		}
		@Pc(663) Class262[] local663 = Static434.aClass262Array1;
		@Pc(746) int local746;
		for (local433 = 0; local433 < local663.length; local433++) {
			@Pc(671) Class262 local671 = local663[local433];
			if (local671 != null && local671.anInt7229 != 0 && Static312.anInt5688 % 20 < 10) {
				@Pc(712) int local712;
				if (local671.anInt7229 == 1) {
					@Pc(698) Class6_Sub34 local698 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local671.anInt7228);
					if (local698 != null) {
						@Pc(703) Class4_Sub1_Sub1_Sub1 local703 = local698.aClass4_Sub1_Sub1_Sub1_2;
						local712 = local703.anInt9542 / 128 - local58 / 128;
						local545 = local703.anInt9540 / 128 - local56 / 128;
						Static479.method6615(arg3, local10, arg2, arg1, local712, local671.anInt7227, 360000L, local545);
					}
				}
				if (local671.anInt7229 == 2) {
					local746 = local671.anInt7232 / 128 - local58 / 128;
					local520 = local671.anInt7231 / 128 - local56 / 128;
					@Pc(762) long local762 = (long) (local671.anInt7230 << 7);
					@Pc(766) long local766 = local762 * local762;
					Static479.method6615(arg3, local10, arg2, arg1, local746, local671.anInt7227, local766, local520);
				}
				if (local671.anInt7229 == 10 && local671.anInt7228 >= 0 && Static588.aClass4_Sub1_Sub1_Sub2Array3.length > local671.anInt7228) {
					@Pc(798) Class4_Sub1_Sub1_Sub2 local798 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local671.anInt7228];
					if (local798 != null) {
						local520 = local798.anInt9542 / 128 - local58 / 128;
						local712 = local798.anInt9540 / 128 - local56 / 128;
						Static479.method6615(arg3, local10, arg2, arg1, local520, local671.anInt7227, 360000L, local712);
					}
				}
			}
		}
		if (Static346.anInt6215 == 4) {
			return;
		}
		if (Static530.anInt8828 != 0) {
			local516 = Static530.anInt8828 * 4 + Static328.aClass4_Sub1_Sub1_Sub2_2.method5892() * 2 + 2 - local58 / 128 - 2;
			local746 = Static210.anInt4254 * 4 + Static328.aClass4_Sub1_Sub1_Sub2_2.method5892() * 2 + 2 - local56 / 128 - 2;
			Static368.method5525(local516, Static421.aClass58Array18[Static71.aBoolean107 ? 1 : 0], local746, arg3, arg1, local10, arg2);
		}
		arg0.method6859(3, arg2.anInt7912 / 2 + arg3 - 1, arg1 - -(arg2.anInt7963 / 2) + -1, -1, 3);
		return;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Z")
	public static boolean method6113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
