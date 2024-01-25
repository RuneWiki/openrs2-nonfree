import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V")
	public static void method2611() {
		if (Static417.aByteArray79 != null) {
			Static396.method5816();
		} else if (Static564.anInt8912 == -1) {
			Static40.method758(Static357.aString67, Static514.aString92);
		} else {
			Static325.method4956();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2613(@OriginalArg(0) String arg0) {
		if (!Static421.aBoolean472 || (Static326.anInt4132 & 0x18) == 0) {
			return;
		}
		@Pc(20) boolean local20 = false;
		@Pc(32) int local32 = Static274.anInt4921;
		@Pc(34) int[] local34 = Static605.anIntArray544;
		for (@Pc(36) int local36 = 0; local36 < local32; local36++) {
			@Pc(44) Class4_Sub1_Sub1_Sub2_Sub1 local44 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local34[local36]];
			if (local44.aString44 != null && local44.aString44.equalsIgnoreCase(arg0) && (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 == local44 && (Static326.anInt4132 & 0x10) != 0 || local44 != null && (Static326.anInt4132 & 0x8) != 0)) {
				@Pc(85) Class5_Sub41 local85 = Static647.method8905(Static519.aClass381_215, Static4.aClass389_17.aClass393_2);
				local85.aClass5_Sub36_Sub2_1.method7293(0);
				local85.aClass5_Sub36_Sub2_1.method7326(Static14.anInt171);
				local85.aClass5_Sub36_Sub2_1.method7296(local34[local36]);
				local85.aClass5_Sub36_Sub2_1.method7286(Static268.anInt4795);
				local85.aClass5_Sub36_Sub2_1.method7277(Static516.anInt8202);
				Static4.aClass389_17.method9079(local85);
				Static467.method6578(0, local44.anIntArray404[0], local44.anIntArray405[0], local44.method5932(), local44.method5932(), 0, true, -2);
				local20 = true;
				break;
			}
		}
		if (!local20) {
			Static218.method3476(Static184.aClass131_22.method3168(Static375.anInt7800) + arg0);
		}
		if (Static421.aBoolean472) {
			Static55.method973();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!ha;IZI)V")
	public static void method2619(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static641.anInt10427 == 0 || Static547.anInt8692 == 0) {
			return;
		}
		@Pc(49) Class10 local49;
		@Pc(40) int local40;
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(59) int local59;
		@Pc(64) int local64;
		if (Static377.aBoolean419) {
			Static440.method6336(false);
			local49 = arg0.method8595();
			@Pc(75) int[] local75 = arg0.Y();
			local40 = local75[0];
			local34 = local75[1];
			local36 = local75[2];
			local38 = local75[3];
			local59 = arg1 + Static292.method4641(false);
			local64 = arg2 + Static89.method1391(false);
		} else {
			arg0.DA(Static448.anInt7323, Static596.anInt9609, Static641.anInt10427, Static547.anInt8692);
			local34 = Static596.anInt9609;
			local36 = Static641.anInt10427;
			local38 = Static547.anInt8692;
			local40 = Static448.anInt7323;
			arg0.KA(Static260.anInt4664, Static670.anInt6249, Static641.anInt10427, Static547.anInt8692);
			local49 = arg0.method8623();
			local49.method4220(Static322.anInt5500, Static519.anInt8235, Static81.anInt1431, Static392.anInt6626, Static116.anInt8663, Static433.anInt7170);
			local59 = arg1;
			arg0.method8590(local49);
			local64 = arg2;
		}
		Static529.method7243(true);
		if (local38 == 0) {
			local38 = 1;
		}
		if (local36 == 0) {
			local36 = 1;
		}
		@Pc(139) int local139;
		@Pc(150) int local150;
		@Pc(177) int local177;
		@Pc(278) int local278;
		@Pc(286) int local286;
		@Pc(297) int local297;
		@Pc(308) int local308;
		@Pc(131) int local131;
		@Pc(355) int local355;
		if (Static668.aClass84Array4 != null && (!Static421.aBoolean472 || (Static326.anInt4132 & 0x40) != 0)) {
			local131 = -1;
			@Pc(133) int local133 = -1;
			@Pc(136) int local136 = arg0.i();
			local139 = arg0.XA();
			@Pc(168) int local168;
			@Pc(159) int local159;
			if (Static305.aBoolean339) {
				local150 = local159 = Static216.anInt1170 * (local59 - local40) / local36;
				local168 = local177 = Static216.anInt1170 * (local64 - local34) / local38;
			} else {
				local150 = local136 * (local59 - local40) / local36;
				local159 = (local59 - local40) * local139 / local36;
				local168 = local136 * (local64 - local34) / local38;
				local177 = local139 * (local64 - local34) / local38;
			}
			@Pc(216) int[] local216 = new int[] { local150, local168, local136 };
			@Pc(231) int[] local231 = new int[] { local159, local177, local139 };
			local49.method4211(local216);
			local49.method4211(local231);
			@Pc(265) float local265 = Static90.method1398((float) local216[2], (float) local216[0], (float) local231[2], (float) local216[1], (float) local231[0], (float) local231[1], 4);
			if (local265 > 0.0F) {
				local278 = local231[0] - local216[0];
				local286 = local231[2] - local216[2];
				local297 = (int) (local265 * (float) local278 + (float) local216[0]);
				local308 = (int) (local265 * (float) local286 + (float) local216[2]);
				local131 = (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method5932() - 1 << 8) + local297 >> 9;
				local133 = local308 + (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method5932() - 1 << 8) >> 9;
				@Pc(335) byte local335 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139;
				if (local335 < 3 && (Static172.aByteArrayArrayArray23[1][local297 >> 9][local308 >> 9] & 0x2) != 0) {
					local355 = local335 + 1;
				}
			}
			if (local131 != -1 && local133 != -1) {
				if (Static421.aBoolean472 && (Static326.anInt4132 & 0x40) != 0) {
					@Pc(384) Class238 local384 = Static333.method5035(Static516.anInt8202, Static14.anInt171);
					if (local384 == null) {
						Static55.method973();
					} else {
						Static467.method6573(local131, 15, -1, Static462.anInt7482, " ->", Static570.aString102, 0L, (long) (local133 | local131 << 0), local133, true, false, true);
					}
				} else {
					if (Static617.aBoolean697) {
						Static467.method6573(local131, 51, -1, -1, "", Static184.aClass131_28.method3168(Static375.anInt7800), 0L, (long) (local131 << 0 | local133), local133, true, false, true);
					}
					Static467.method6573(local131, 10, -1, Static363.anInt5922, "", Static422.aString82, 0L, (long) (local131 << 0 | local133), local133, true, false, true);
				}
			}
		}
		if (Static377.aBoolean419) {
			Static492.method6896(-5);
		}
		for (local131 = 0; local131 < (Static377.aBoolean419 ? 2 : 1); local131++) {
			@Pc(487) boolean local487 = local131 == 0;
			@Pc(494) Class321 local494 = local487 ? Static605.aClass321_3 : Static590.aClass321_1;
			local139 = arg1;
			local150 = arg2;
			if (Static377.aBoolean419) {
				Static440.method6336(local487);
				local139 = arg1 + Static292.method4641(local487);
				local150 = arg2 + Static89.method1391(local487);
			}
			@Pc(518) Class387 local518 = local494.aClass387_5;
			for (@Pc(523) Class4_Sub6 local523 = (Class4_Sub6) local518.method9018(); local523 != null; local523 = (Class4_Sub6) local518.method9016()) {
				if ((Static587.aBoolean665 || local523.aClass4_Sub1_13.aByte139 == Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139) && local523.method4839(local139, local150, arg0)) {
					@Pc(563) int local563;
					if (local523.aClass4_Sub1_13 instanceof Class4_Sub1_Sub1) {
						local563 = ((Class4_Sub1_Sub1) local523.aClass4_Sub1_13).aShort105;
						local177 = ((Class4_Sub1_Sub1) local523.aClass4_Sub1_13).aShort104;
					} else {
						local563 = local523.aClass4_Sub1_13.anInt9803 >> 9;
						local177 = local523.aClass4_Sub1_13.anInt9805 >> 9;
					}
					@Pc(716) int local716;
					@Pc(728) int local728;
					@Pc(860) int local860;
					@Pc(599) int local599;
					if (local523.aClass4_Sub1_13 instanceof Class4_Sub1_Sub1_Sub2_Sub1) {
						@Pc(590) Class4_Sub1_Sub1_Sub2_Sub1 local590 = (Class4_Sub1_Sub1_Sub2_Sub1) local523.aClass4_Sub1_13;
						local599 = local590.method5932();
						if ((local599 & 0x1) == 0 && (local590.anInt9805 & 0x1FF) == 0 && (local590.anInt9803 & 0x1FF) == 0 || (local599 & 0x1) == 1 && (local590.anInt9805 & 0x1FF) == 256 && (local590.anInt9803 & 0x1FF) == 256) {
							local278 = local590.anInt9805 - (local590.method5932() - 1 << 8);
							local286 = local590.anInt9803 - (local590.method5932() - 1 << 8);
							for (local297 = 0; local297 < Static438.anInt7239; local297++) {
								@Pc(682) Class5_Sub9 local682 = (Class5_Sub9) Static677.aClass306_37.method6943((long) Static558.anIntArray500[local297]);
								if (local682 != null) {
									@Pc(687) Class4_Sub1_Sub1_Sub2_Sub2 local687 = local682.aClass4_Sub1_Sub1_Sub2_Sub2_1;
									if (Static565.anInt8921 != local687.anInt6891 && local687.aBoolean455) {
										local716 = local687.anInt9805 - (local687.aClass105_1.anInt2811 - 1 << 8);
										local728 = local687.anInt9803 - (local687.aClass105_1.anInt2811 - 1 << 8);
										if (local278 <= local716 && local687.aClass105_1.anInt2811 <= local590.method5932() - (local716 - local278 >> 9) && local728 >= local286 && local687.aClass105_1.anInt2811 <= local590.method5932() - (local728 - local286 >> 9)) {
											Static76.method1267(local687, local523.aClass4_Sub1_13.aByte139 != Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139);
											local687.anInt6891 = Static565.anInt8921;
										}
									}
								}
							}
							local308 = Static274.anInt4921;
							@Pc(813) int[] local813 = Static605.anIntArray544;
							for (local716 = 0; local716 < local308; local716++) {
								@Pc(823) Class4_Sub1_Sub1_Sub2_Sub1 local823 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local813[local716]];
								if (local823 != null && local823.anInt6891 != Static565.anInt8921 && local823 != local590 && local823.aBoolean455) {
									local860 = local823.anInt9805 - (local823.method5932() - 1 << 8);
									@Pc(876) int local876 = local823.anInt9803 - (local823.method5932() - 1 << 8);
									if (local278 <= local860 && local823.method5932() <= local590.method5932() - (local860 - local278 >> 9) && local286 <= local876 && local823.method5932() <= local590.method5932() - (local876 - local286 >> 9)) {
										Static367.method5342(local823, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 != local523.aClass4_Sub1_13.aByte139);
										local823.anInt6891 = Static565.anInt8921;
									}
								}
							}
						}
						if (local590.anInt6891 == Static565.anInt8921) {
							continue;
						}
						Static367.method5342(local590, local523.aClass4_Sub1_13.aByte139 != Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139);
						local590.anInt6891 = Static565.anInt8921;
					}
					if (local523.aClass4_Sub1_13 instanceof Class4_Sub1_Sub1_Sub2_Sub2) {
						@Pc(988) Class4_Sub1_Sub1_Sub2_Sub2 local988 = (Class4_Sub1_Sub1_Sub2_Sub2) local523.aClass4_Sub1_13;
						if (local988.aClass105_1 != null) {
							if ((local988.aClass105_1.anInt2811 & 0x1) == 0 && (local988.anInt9805 & 0x1FF) == 0 && (local988.anInt9803 & 0x1FF) == 0 || (local988.aClass105_1.anInt2811 & 0x1) == 1 && (local988.anInt9805 & 0x1FF) == 256 && (local988.anInt9803 & 0x1FF) == 256) {
								local599 = local988.anInt9805 - (local988.aClass105_1.anInt2811 - 1 << 8);
								local278 = local988.anInt9803 - (local988.aClass105_1.anInt2811 - 1 << 8);
								for (local286 = 0; local286 < Static438.anInt7239; local286++) {
									@Pc(1080) Class5_Sub9 local1080 = (Class5_Sub9) Static677.aClass306_37.method6943((long) Static558.anIntArray500[local286]);
									if (local1080 != null) {
										@Pc(1085) Class4_Sub1_Sub1_Sub2_Sub2 local1085 = local1080.aClass4_Sub1_Sub1_Sub2_Sub2_1;
										if (Static565.anInt8921 != local1085.anInt6891 && local1085 != local988 && local1085.aBoolean455) {
											local355 = local1085.anInt9805 - (local1085.aClass105_1.anInt2811 - 1 << 8);
											local716 = local1085.anInt9803 - (local1085.aClass105_1.anInt2811 - 1 << 8);
											if (local355 >= local599 && local988.aClass105_1.anInt2811 - (local355 - local599 >> 9) >= local1085.aClass105_1.anInt2811 && local278 <= local716 && local1085.aClass105_1.anInt2811 <= local988.aClass105_1.anInt2811 - (local716 - local278 >> 9)) {
												Static76.method1267(local1085, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 != local523.aClass4_Sub1_13.aByte139);
												local1085.anInt6891 = Static565.anInt8921;
											}
										}
									}
								}
								local297 = Static274.anInt4921;
								@Pc(1201) int[] local1201 = Static605.anIntArray544;
								for (local355 = 0; local355 < local297; local355++) {
									@Pc(1211) Class4_Sub1_Sub1_Sub2_Sub1 local1211 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local1201[local355]];
									if (local1211 != null && Static565.anInt8921 != local1211.anInt6891 && local1211.aBoolean455) {
										local728 = local1211.anInt9805 - (local1211.method5932() - 1 << 8);
										local860 = local1211.anInt9803 - (local1211.method5932() - 1 << 8);
										if (local728 >= local599 && local1211.method5932() <= local988.aClass105_1.anInt2811 - (local728 - local599 >> 9) && local278 <= local860 && local1211.method5932() <= local988.aClass105_1.anInt2811 - (local860 - local278 >> 9)) {
											Static367.method5342(local1211, local523.aClass4_Sub1_13.aByte139 != Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139);
											local1211.anInt6891 = Static565.anInt8921;
										}
									}
								}
							}
							if (local988.anInt6891 == Static565.anInt8921) {
								continue;
							}
							Static76.method1267(local988, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 != local523.aClass4_Sub1_13.aByte139);
							local988.anInt6891 = Static565.anInt8921;
						}
					}
					if (local523.aClass4_Sub1_13 instanceof Class4_Sub1_Sub4_Sub1) {
						@Pc(1367) int local1367 = local177 + Static315.anInt5380;
						local599 = local563 + Static290.anInt5128;
						@Pc(1388) Class5_Sub53 local1388 = (Class5_Sub53) Static248.aClass306_18.method6943((long) (local1367 | local599 << 14 | local523.aClass4_Sub1_13.aByte139 << 28));
						if (local1388 != null) {
							local286 = 0;
							@Pc(1398) Class5_Sub2 local1398 = (Class5_Sub2) local1388.aClass20_72.method379();
							while (local1398 != null) {
								@Pc(1406) Class246 local1406 = Static82.aClass134_1.method3191(local1398.anInt118);
								if (Static421.aBoolean472 && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 == local523.aClass4_Sub1_13.aByte139) {
									@Pc(1430) Class22 local1430 = Static110.anInt9539 == -1 ? null : Static612.aClass380_2.method8839(Static110.anInt9539);
									if ((Static326.anInt4132 & 0x1) != 0 && (local1430 == null || local1406.method5691(local1430.anInt336, Static110.anInt9539) != local1430.anInt336)) {
										Static467.method6573(local177, 52, -1, Static462.anInt7482, Static47.aString9 + " -> <col=ff9040>" + local1406.aString77, Static570.aString102, (long) local1398.anInt118, (long) local286, local563, false, false, true);
									}
								}
								if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 == local523.aClass4_Sub1_13.aByte139) {
									@Pc(1497) String[] local1497 = local1406.aStringArray30;
									for (local716 = 4; local716 >= 0; local716--) {
										if (local1497 != null && local1497[local716] != null) {
											@Pc(1513) byte local1513 = 0;
											if (local716 == 0) {
												local1513 = 20;
											}
											local860 = Static61.anInt1040;
											if (local716 == 1) {
												local1513 = 11;
											}
											if (local716 == 2) {
												local1513 = 60;
											}
											if (local716 == 3) {
												local1513 = 17;
											}
											if (local716 == 4) {
												local1513 = 2;
											}
											if (local1406.anInt6476 == local716) {
												local860 = local1406.anInt6465;
											}
											if (local1406.anInt6504 == local716) {
												local860 = local1406.anInt6485;
											}
											Static467.method6573(local177, local1513, -1, local860, "<col=ff9040>" + local1406.aString77, local1497[local716], (long) local1398.anInt118, (long) local286, local563, false, false, true);
										}
									}
								}
								Static467.method6573(local177, 1003, -1, Static1.anInt8120, "<col=ff9040>" + local1406.aString77, Static184.aClass131_23.method3168(Static375.anInt7800), (long) local1398.anInt118, (long) local286, local563, false, local523.aClass4_Sub1_13.aByte139 != Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139, true);
								local1398 = (Class5_Sub2) local1388.aClass20_72.method377();
								local286++;
							}
						}
					}
					if (local523.aClass4_Sub1_13 instanceof Interface9) {
						@Pc(1665) Interface9 local1665 = (Interface9) local523.aClass4_Sub1_13;
						@Pc(1672) Class354 local1672 = Static528.aClass243_3.method5556(local1665.method8364());
						if (local1672.anIntArray526 != null) {
							local1672 = local1672.method8024(Static23.aClass247_1);
						}
						if (local1672 != null) {
							if (Static421.aBoolean472 && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 == local523.aClass4_Sub1_13.aByte139) {
								@Pc(1707) Class22 local1707 = Static110.anInt9539 == -1 ? null : Static612.aClass380_2.method8839(Static110.anInt9539);
								if ((Static326.anInt4132 & 0x4) != 0 && (local1707 == null || local1672.method8029(Static110.anInt9539, local1707.anInt336) != local1707.anInt336)) {
									Static467.method6573(local177, 45, -1, Static462.anInt7482, Static47.aString9 + " -> <col=00ffff>" + local1672.aString113, Static570.aString102, Static379.method5607(local1665, local177, local563), (long) local1665.hashCode(), local563, false, false, true);
								}
							}
							if (local523.aClass4_Sub1_13.aByte139 == Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139) {
								@Pc(1776) String[] local1776 = local1672.aStringArray39;
								if (local1776 != null) {
									for (local286 = 4; local286 >= 0; local286--) {
										if (local1776[local286] != null) {
											@Pc(1790) short local1790 = 0;
											local308 = Static61.anInt1040;
											if (local286 == 0) {
												local1790 = 50;
											}
											if (local286 == 1) {
												local1790 = 23;
											}
											if (local286 == 2) {
												local1790 = 44;
											}
											if (local286 == 3) {
												local1790 = 25;
											}
											if (local1672.anInt9393 == local286) {
												local308 = local1672.anInt9420;
											}
											if (local286 == 4) {
												local1790 = 1009;
											}
											if (local286 == local1672.anInt9417) {
												local308 = local1672.anInt9414;
											}
											Static467.method6573(local177, local1790, -1, local308, "<col=00ffff>" + local1672.aString113, local1776[local286], Static379.method5607(local1665, local177, local563), (long) local1665.hashCode(), local563, false, false, true);
										}
									}
								}
								Static467.method6573(local177, 1001, -1, Static1.anInt8120, "<col=00ffff>" + local1672.aString113, Static184.aClass131_23.method3168(Static375.anInt7800), (long) local1672.anInt9392, (long) local1665.hashCode(), local563, false, local523.aClass4_Sub1_13.aByte139 != Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139, true);
							}
						}
					}
				}
			}
			if (Static377.aBoolean419) {
				Static492.method6896(-5);
			}
		}
		Static529.method7243(false);
	}
}
