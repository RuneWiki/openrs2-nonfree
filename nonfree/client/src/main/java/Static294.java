import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!md", name = "w", descriptor = "[Lclient!kq;")
	public static Class4_Sub3_Sub1_Sub1[] aClass4_Sub3_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "Lclient!ta;")
	public static Class59 aClass59_2;

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Z")
	public static boolean aBoolean383 = false;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)[Lclient!oo;")
	public static Class221[] method4929() {
		return new Class221[] { Static270.aClass221_3, Static22.aClass221_4, Static5.aClass221_1 };
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!qf;Lclient!oa;II)V")
	public static void method4930(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3) {
		@Pc(19) Class10 local19 = arg1.method6006(arg2);
		if (local19 == null) {
			return;
		}
		arg2.ca(arg0, arg3, arg0 + arg1.anInt7249, arg3 - -arg1.anInt7229);
		if (Static262.anInt5487 == 2 || Static262.anInt5487 == 5 || Static388.aClass119_28 == null) {
			arg2.L(-16777216, local19, arg0, arg3);
			return;
		}
		@Pc(56) int local56;
		@Pc(74) int local74;
		@Pc(64) int local64;
		@Pc(71) int local71;
		if (Static305.anInt5998 == 4) {
			local74 = Static157.anInt3699;
			local71 = 4096;
			local64 = (int) -Static487.aFloat258 & 0x3FFF;
			local56 = Static40.anInt1002;
		} else {
			local56 = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811;
			local64 = (int) -Static487.aFloat258 + Static262.anInt5488 & 0x3FFF;
			local71 = 4096 - Static509.anInt8869 * 16;
			local74 = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813;
		}
		@Pc(101) int local101 = local56 / 128 + 48 + 208 - Static118.anInt2527 * 2;
		@Pc(118) int local118 = Static549.anInt9482 * 4 + 208 + 48 - Static549.anInt9482 * 2 - local74 / 128;
		Static388.aClass119_28.method6676((float) arg0 + (float) arg1.anInt7249 / 2.0F, (float) arg1.anInt7229 / 2.0F + (float) arg3, (float) local101, (float) local118, local71, local64 << 2, local19, arg0, arg3);
		@Pc(169) int local169;
		@Pc(179) int local179;
		@Pc(189) int local189;
		@Pc(200) int local200;
		for (@Pc(152) Class3_Sub47 local152 = (Class3_Sub47) Static449.aClass71_62.method2089(); local152 != null; local152 = (Class3_Sub47) Static449.aClass71_62.method2086()) {
			@Pc(157) int local157 = local152.anInt8701;
			local169 = (Static267.aClass82_3.anIntArray262[local157] >> 14 & 0x3FFF) - Static223.anInt4827;
			local179 = (Static267.aClass82_3.anIntArray262[local157] & 0x3FFF) - Static150.anInt3027;
			local189 = local169 * 4 + 2 - local56 / 128;
			local200 = local179 * 4 + 2 - local74 / 128;
			Static191.method3678(arg0, arg2, Static267.aClass82_3.anIntArray263[local157], local200, arg3, arg1, local189, local19);
		}
		for (local169 = 0; local169 < Static418.anInt7809; local169++) {
			local179 = Static464.anIntArray712[local169] * 4 + 2 - local56 / 128;
			local189 = Static306.anIntArray536[local169] * 4 + 2 - local74 / 128;
			@Pc(257) Class242 local257 = Static454.aClass298_3.method7185(Static331.anIntArray548[local169]);
			if (local257.anIntArray632 != null) {
				local257 = local257.method5975(Static127.aClass215_1);
				if (local257 == null || local257.anInt7208 == -1) {
					continue;
				}
			}
			Static191.method3678(arg0, arg2, local257.anInt7208, local189, arg3, arg1, local179, local19);
		}
		@Pc(345) int local345;
		@Pc(356) int local356;
		for (@Pc(302) Class3_Sub12 local302 = (Class3_Sub12) Static476.aClass267_37.method6643(); local302 != null; local302 = (Class3_Sub12) Static476.aClass267_37.method6650()) {
			local189 = (int) (local302.aLong285 >> 28 & 0x3L);
			if (local189 == Static228.anInt4893) {
				local200 = (int) (local302.aLong285 & 0x3FFFL) - Static223.anInt4827;
				@Pc(334) int local334 = (int) (local302.aLong285 >> 14 & 0x3FFFL) - Static150.anInt3027;
				local345 = local200 * 4 + 2 - local56 / 128;
				local356 = local334 * 4 + 2 - local74 / 128;
				Static344.method5465(arg3, local356, local345, arg0, arg1, local19, Static411.aClass119Array14[0]);
			}
		}
		@Pc(448) int local448;
		for (local189 = 0; local189 < Static221.anInt4798; local189++) {
			@Pc(389) Class3_Sub3 local389 = (Class3_Sub3) Static240.aClass267_20.method6644((long) Static3.anIntArray80[local189]);
			if (local389 != null) {
				@Pc(394) Class6_Sub1_Sub2_Sub2 local394 = local389.aClass6_Sub1_Sub2_Sub2_1;
				if (local394.method7095() && Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 == local394.aByte100) {
					@Pc(410) Class230 local410 = local394.aClass230_1;
					if (local410 != null && local410.anIntArray627 != null) {
						local410 = local410.method5898(Static127.aClass215_1);
					}
					if (local410 != null && local410.aBoolean454 && local410.aBoolean452) {
						local356 = local394.anInt8811 / 128 - local56 / 128;
						local448 = local394.anInt8813 / 128 - local74 / 128;
						if (local410.anInt7043 == -1) {
							Static344.method5465(arg3, local448, local356, arg0, arg1, local19, Static411.aClass119Array14[1]);
						} else {
							Static191.method3678(arg0, arg2, local410.anInt7043, local448, arg3, arg1, local356, local19);
						}
					}
				}
			}
		}
		local200 = Static235.anInt2721;
		@Pc(489) int[] local489 = Static130.anIntArray267;
		@Pc(539) int local539;
		@Pc(543) int local543;
		@Pc(568) int local568;
		for (local345 = 0; local345 < local200; local345++) {
			@Pc(499) Class6_Sub1_Sub2_Sub1 local499 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local489[local345]];
			if (local499 != null && local499.method2048() && local499 != Static111.aClass6_Sub1_Sub2_Sub1_3 && local499.aByte100 == Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100) {
				local448 = local499.anInt8811 / 128 - local56 / 128;
				local539 = local499.anInt8813 / 128 - local74 / 128;
				@Pc(541) boolean local541 = false;
				for (local543 = 0; local543 < Static178.anInt4133; local543++) {
					if (local499.aString27.equals(Static520.aStringArray49[local543]) && Static463.anIntArray711[local543] != 0) {
						local541 = true;
						break;
					}
				}
				@Pc(566) boolean local566 = false;
				for (local568 = 0; local568 < Static476.anInt7744; local568++) {
					if (local499.aString27.equals(Static468.aClass47Array1[local568].aString11)) {
						local566 = true;
						break;
					}
				}
				@Pc(588) boolean local588 = false;
				if (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2318 != 0 && local499.anInt2318 != 0 && local499.anInt2318 == Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2318) {
					local588 = true;
				}
				if (local499.aBoolean165) {
					Static344.method5465(arg3, local539, local448, arg0, arg1, local19, Static411.aClass119Array14[6]);
				} else if (local541) {
					Static344.method5465(arg3, local539, local448, arg0, arg1, local19, Static411.aClass119Array14[3]);
				} else if (local566) {
					Static344.method5465(arg3, local539, local448, arg0, arg1, local19, Static411.aClass119Array14[5]);
				} else if (local588) {
					Static344.method5465(arg3, local539, local448, arg0, arg1, local19, Static411.aClass119Array14[4]);
				} else {
					Static344.method5465(arg3, local539, local448, arg0, arg1, local19, Static411.aClass119Array14[2]);
				}
			}
		}
		@Pc(692) Class296[] local692 = Static518.aClass296Array2;
		@Pc(778) int local778;
		for (local448 = 0; local448 < local692.length; local448++) {
			@Pc(700) Class296 local700 = local692[local448];
			if (local700 != null && local700.anInt8744 != 0 && Static223.anInt4829 % 20 < 10) {
				@Pc(742) int local742;
				if (local700.anInt8744 == 1) {
					@Pc(727) Class3_Sub3 local727 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local700.anInt8745);
					if (local727 != null) {
						@Pc(732) Class6_Sub1_Sub2_Sub2 local732 = local727.aClass6_Sub1_Sub2_Sub2_1;
						local742 = local732.anInt8811 / 128 - local56 / 128;
						local568 = local732.anInt8813 / 128 - local74 / 128;
						Static95.method1857(local19, arg0, 360000L, arg1, local700.anInt8747, local568, local742, arg3);
					}
				}
				if (local700.anInt8744 == 2) {
					local778 = local700.anInt8743 / 128 - local56 / 128;
					local543 = local700.anInt8739 / 128 - local74 / 128;
					@Pc(793) long local793 = (long) (local700.anInt8741 << 7);
					@Pc(797) long local797 = local793 * local793;
					Static95.method1857(local19, arg0, local797, arg1, local700.anInt8747, local543, local778, arg3);
				}
				if (local700.anInt8744 == 10 && local700.anInt8745 >= 0 && Static498.aClass6_Sub1_Sub2_Sub1Array1.length > local700.anInt8745) {
					@Pc(834) Class6_Sub1_Sub2_Sub1 local834 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local700.anInt8745];
					if (local834 != null) {
						local543 = local834.anInt8811 / 128 - local56 / 128;
						local742 = local834.anInt8813 / 128 - local74 / 128;
						Static95.method1857(local19, arg0, 360000L, arg1, local700.anInt8747, local742, local543, arg3);
					}
				}
			}
		}
		if (Static305.anInt5998 == 4) {
			return;
		}
		if (Static407.anInt7473 != 0) {
			local539 = Static407.anInt7473 * 4 + (Static111.aClass6_Sub1_Sub2_Sub1_3.method7083() + -1) * 2 + 2 - local56 / 128;
			local778 = Static303.anInt5982 * 4 + Static111.aClass6_Sub1_Sub2_Sub1_3.method7083() * 2 + 2 - local74 / 128 - 2;
			Static344.method5465(arg3, local778, local539, arg0, arg1, local19, Static123.aClass119Array7[Static392.aBoolean493 ? 1 : 0]);
		}
		arg2.method7459(3, arg1.anInt7229 / 2 + arg3 - 1, -1, 3, arg1.anInt7249 / 2 + arg0 - 1);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)V")
	public static void method4932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class324 local3 = new Class324();
		local3.anInt9478 = arg1 >> Static33.anInt880;
		local3.anInt9473 = arg2 >> Static33.anInt880;
		local3.anInt9464 = arg3 >> Static33.anInt880;
		local3.anInt9474 = arg4 >> Static33.anInt880;
		local3.anInt9480 = arg0;
		local3.anInt9472 = arg1;
		local3.anInt9477 = arg2;
		local3.anInt9467 = arg3;
		local3.anInt9479 = arg4;
		local3.anInt9468 = arg5;
		local3.anInt9469 = arg6;
		Static410.aClass324Array2[Static400.anInt7398++] = local3;
	}

	@OriginalMember(owner = "client!md", name = "h", descriptor = "(I)V")
	public static void method4933() {
		if (Static118.anInt2530 != 0) {
			Static167.anInt3861 -= Static118.anInt2530 * 5;
			if (Static504.anInt9379 <= Static167.anInt3861) {
				Static167.anInt3861 = Static504.anInt9379 - 1;
			}
			Static118.anInt2530 = 0;
			if (Static167.anInt3861 < 0) {
				Static167.anInt3861 = 0;
			}
		}
		if (Static506.anInt8840 < 102) {
			Static506.anInt8840 += 6;
		}
		for (@Pc(47) int local47 = 0; local47 < Static372.anInt6997; local47++) {
			@Pc(53) Interface2 local53 = Static373.anInterface2Array1[local47];
			@Pc(57) int local57 = local53.method4017();
			@Pc(61) char local61 = local53.method4020();
			@Pc(65) int local65 = local53.method4019();
			if (local57 == 84) {
				Static34.method835(false);
			}
			if (local57 == 80) {
				Static34.method835(true);
			} else if (local57 == 66 && (local65 & 0x4) != 0) {
				if (Static65.aClipboard1 != null) {
					@Pc(359) String local359 = "";
					for (@Pc(364) int local364 = Static305.aStringArray37.length - 1; local364 >= 0; local364--) {
						if (Static305.aStringArray37[local364] != null && Static305.aStringArray37[local364].length() > 0) {
							local359 = local359 + Static305.aStringArray37[local364] + '\n';
						}
					}
					Static65.aClipboard1.setContents(new StringSelection(local359), null);
				}
			} else if (local57 == 67 && (local65 & 0x4) != 0) {
				if (Static65.aClipboard1 != null) {
					@Pc(106) Transferable local106 = Static65.aClipboard1.getContents(null);
					if (local106 != null) {
						try {
							@Pc(113) String local113 = (String) local106.getTransferData(DataFlavor.stringFlavor);
							if (local113 != null) {
								@Pc(120) String[] local120 = Static439.method6626('\n', local113);
								if (local120.length > 1) {
									for (@Pc(126) int local126 = 0; local126 < local120.length; local126++) {
										Static27.aString7 = local120[local126];
										Static34.method835(false);
									}
								} else {
									Static27.aString7 = Static27.aString7 + local113;
								}
							}
						} catch (@Pc(153) Exception local153) {
						}
					}
				}
			} else if (local57 == 85 && Static149.anInt2987 > 0) {
				Static27.aString7 = Static27.aString7.substring(0, Static149.anInt2987 - 1) + Static27.aString7.substring(Static149.anInt2987);
				Static149.anInt2987--;
			} else if (local57 == 101 && Static149.anInt2987 < Static27.aString7.length()) {
				Static27.aString7 = Static27.aString7.substring(0, Static149.anInt2987) + Static27.aString7.substring(Static149.anInt2987 + 1);
			} else if (local57 == 96 && Static149.anInt2987 > 0) {
				Static149.anInt2987--;
			} else if (local57 == 97 && Static149.anInt2987 < Static27.aString7.length()) {
				Static149.anInt2987++;
			} else if (local57 == 102) {
				Static149.anInt2987 = 0;
			} else if (local57 == 103) {
				Static149.anInt2987 = Static27.aString7.length();
			} else if (local57 == 104 && Static305.aStringArray37.length > Static103.anInt2281) {
				Static103.anInt2281++;
				Static156.method3089();
				Static149.anInt2987 = Static27.aString7.length();
			} else if (local57 == 105 && Static103.anInt2281 > 0) {
				Static103.anInt2281--;
				Static156.method3089();
				Static149.anInt2987 = Static27.aString7.length();
			} else if (Static369.method5831(local61) || local61 == ':' || local61 == ',' || local61 == ' ' || local61 == '_' || local61 == '-' || local61 == '+' || local61 == '[' || local61 == ']') {
				Static27.aString7 = Static27.aString7.substring(0, Static149.anInt2987) + Static373.anInterface2Array1[local47].method4020() + Static27.aString7.substring(Static149.anInt2987);
				Static149.anInt2987++;
			}
		}
		Static372.anInt6997 = 0;
		Static403.method6133();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4934(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static49.anInt1109 = arg4;
		Static192.anInt4400 = arg3;
		Static205.anInt4557 = arg5;
		Static346.anInt6595 = arg1;
		Static400.anInt7395 = arg2;
		if (arg0 && Static205.anInt4557 >= 100) {
			Static329.anInt6297 = Static346.anInt6595 * 512 + 256;
			Static311.anInt6050 = Static192.anInt4400 * 512 + 256;
			Static347.anInt6620 = Static58.method1166(Static329.anInt6297, Static311.anInt6050, Static420.anInt7829) - Static400.anInt7395;
		}
		Static305.anInt5998 = 2;
	}
}
