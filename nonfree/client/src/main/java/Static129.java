import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Z")
	public static boolean aBoolean168;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILclient!ha;I)V")
	public static void method2317(@OriginalArg(1) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static139.anInt10520 == 0 || Static661.anInt9641 == 0) {
			return;
		}
		@Pc(31) Class92 local31;
		@Pc(38) int local38;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(42) int local42;
		@Pc(56) int local56;
		@Pc(63) int local63;
		if (Static423.aBoolean517) {
			Static117.method2151(false);
			local31 = arg1.method8076();
			@Pc(34) int[] local34 = arg1.Y();
			local38 = local34[0];
			local42 = local34[3];
			local46 = local34[1];
			local50 = local34[2];
			local56 = Static558.method7419(false) + arg2;
			local63 = arg0 + Static211.method8988(false);
		} else {
			arg1.DA(Static538.anInt8328, Static309.anInt4819, Static139.anInt10520, Static661.anInt9641);
			local50 = Static139.anInt10520;
			local42 = Static661.anInt9641;
			local38 = Static538.anInt8328;
			local46 = Static309.anInt4819;
			arg1.KA(Static678.anInt10617, Static24.anInt563, Static139.anInt10520, Static661.anInt9641);
			local31 = arg1.method8118();
			local31.method3863(Static119.anInt2267, Static513.anInt8005, Static446.anInt6959, Static653.anInt10298, Static420.anInt6622, Static81.anInt1714);
			local63 = arg0;
			local56 = arg2;
			arg1.method8133(local31);
		}
		if (local42 == 0) {
			local42 = 1;
		}
		if (local50 == 0) {
			local50 = 1;
		}
		Static679.method9005(true);
		@Pc(135) int local135;
		@Pc(148) int local148;
		@Pc(158) int local158;
		@Pc(273) int local273;
		@Pc(282) int local282;
		@Pc(293) int local293;
		@Pc(304) int local304;
		@Pc(127) int local127;
		@Pc(356) int local356;
		if (Static655.aClass42Array5 != null && (!Static463.aBoolean582 || (Static25.anInt576 & 0x40) != 0)) {
			local127 = -1;
			@Pc(129) int local129 = -1;
			@Pc(132) int local132 = arg1.i();
			local135 = arg1.XA();
			@Pc(159) int local159;
			@Pc(147) int local147;
			if (Static499.aBoolean608) {
				local148 = local147 = Static140.anInt8126 * (local56 - local38) / local50;
				local159 = local158 = Static140.anInt8126 * (local63 - local46) / local42;
			} else {
				local159 = local132 * (local63 - local46) / local42;
				local147 = (local56 - local38) * local135 / local50;
				local148 = local132 * (local56 - local38) / local50;
				local158 = local135 * (local63 - local46) / local42;
			}
			@Pc(211) int[] local211 = new int[] { local148, local159, local132 };
			local31.method3869(local211);
			@Pc(229) int[] local229 = new int[] { local147, local158, local135 };
			local31.method3869(local229);
			@Pc(260) float local260 = Static284.method4096((float) local211[2], (float) local229[2], 4, (float) local211[1], (float) local211[0], (float) local229[1], (float) local229[0]);
			if (local260 > 0.0F) {
				local273 = local229[0] - local211[0];
				local282 = local229[2] - local211[2];
				local293 = (int) (local260 * (float) local273 + (float) local211[0]);
				local304 = (int) ((float) local282 * local260 + (float) local211[2]);
				local127 = (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method8514() - 1 << 8) + local293 >> 9;
				local129 = local304 + (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method8514() - 1 << 8) >> 9;
				@Pc(333) byte local333 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141;
				if (local333 < 3 && (Static47.aByteArrayArrayArray3[1][local293 >> 9][local304 >> 9] & 0x2) != 0) {
					local356 = local333 + 1;
				}
			}
			if (local127 != -1 && local129 != -1) {
				if (Static463.aBoolean582 && (Static25.anInt576 & 0x40) != 0) {
					@Pc(429) Class199 local429 = Static203.method3070(Static292.anInt4612, Static169.anInt3012);
					if (local429 == null) {
						Static124.method2204();
					} else {
						Static321.method4431((long) (local127 << 0 | local129), -1, true, " ->", Static111.anInt2192, 0L, false, local129, 8, local127, Static384.aString73, true);
					}
				} else {
					if (Static258.aBoolean313) {
						Static321.method4431((long) (local129 | local127 << 0), -1, true, "", -1, 0L, false, local129, 4, local127, Static279.aClass179_27.method4066(Static164.anInt2984), true);
					}
					Static321.method4431((long) (local129 | local127 << 0), -1, true, "", Static520.anInt8066, 0L, false, local129, 60, local127, Static331.aString59, true);
				}
			}
		}
		if (Static423.aBoolean517) {
			Static479.method6585();
		}
		for (local127 = 0; (Static423.aBoolean517 ? 2 : 1) > local127; local127++) {
			@Pc(480) boolean local480 = local127 == 0;
			@Pc(486) Class223 local486 = local480 ? Static419.aClass223_4 : Static395.aClass223_2;
			local135 = arg2;
			local148 = arg0;
			if (Static423.aBoolean517) {
				Static117.method2151(local480);
				local135 = arg2 + Static558.method7419(local480);
				local148 = arg0 + Static211.method8988(local480);
			}
			@Pc(510) Class236 local510 = local486.aClass236_5;
			for (@Pc(515) Class3_Sub6 local515 = (Class3_Sub6) local510.method4958(); local515 != null; local515 = (Class3_Sub6) local510.method4950()) {
				if ((Static162.aBoolean198 || local515.aClass3_Sub1_21.aByte141 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141) && local515.method7042(local135, arg1, local148)) {
					@Pc(550) int local550;
					if (local515.aClass3_Sub1_21 instanceof Class3_Sub1_Sub2) {
						local158 = ((Class3_Sub1_Sub2) local515.aClass3_Sub1_21).aShort124;
						local550 = ((Class3_Sub1_Sub2) local515.aClass3_Sub1_21).aShort125;
					} else {
						local550 = local515.aClass3_Sub1_21.anInt9917 >> 9;
						local158 = local515.aClass3_Sub1_21.anInt9925 >> 9;
					}
					@Pc(679) int local679;
					@Pc(691) int local691;
					@Pc(800) int local800;
					@Pc(578) int local578;
					if (local515.aClass3_Sub1_21 instanceof Class3_Sub1_Sub2_Sub2_Sub1) {
						@Pc(572) Class3_Sub1_Sub2_Sub2_Sub1 local572 = (Class3_Sub1_Sub2_Sub2_Sub1) local515.aClass3_Sub1_21;
						local578 = local572.method8514();
						if ((local578 & 0x1) == 0 && (local572.anInt9925 & 0x1FF) == 0 && (local572.anInt9917 & 0x1FF) == 0 || (local578 & 0x1) == 1 && (local572.anInt9925 & 0x1FF) == 256 && (local572.anInt9917 & 0x1FF) == 256) {
							local273 = local572.anInt9925 - (local572.method8514() - 1 << 8);
							local282 = local572.anInt9917 - (local572.method8514() - 1 << 8);
							for (local293 = 0; local293 < Static105.anInt2131; local293++) {
								@Pc(653) Class4_Sub45 local653 = (Class4_Sub45) Static597.aClass66_41.method1994((long) Static526.anIntArray558[local293]);
								if (local653 != null) {
									@Pc(658) Class3_Sub1_Sub2_Sub2_Sub2 local658 = local653.aClass3_Sub1_Sub2_Sub2_Sub2_2;
									if (local658.anInt9955 != Static177.anInt3088 && local658.aBoolean773) {
										local679 = local658.anInt9925 - (local658.aClass345_1.anInt8812 - 1 << 8);
										local691 = local658.anInt9917 - (local658.aClass345_1.anInt8812 - 1 << 8);
										if (local273 <= local679 && local658.aClass345_1.anInt8812 <= local572.method8514() - (local679 - local273 >> 9) && local691 >= local282 && local658.aClass345_1.anInt8812 <= local572.method8514() - (local691 - local282 >> 9)) {
											Static152.method2629(local658, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 != local515.aClass3_Sub1_21.aByte141);
											local658.anInt9955 = Static177.anInt3088;
										}
									}
								}
							}
							local304 = Static518.anInt10290;
							@Pc(764) int[] local764 = Static489.anIntArray519;
							for (local679 = 0; local679 < local304; local679++) {
								@Pc(774) Class3_Sub1_Sub2_Sub2_Sub1 local774 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local764[local679]];
								if (local774 != null && Static177.anInt3088 != local774.anInt9955 && local572 != local774 && local774.aBoolean773) {
									local800 = local774.anInt9925 - (local774.method8514() - 1 << 8);
									@Pc(813) int local813 = local774.anInt9917 - (local774.method8514() - 1 << 8);
									if (local273 <= local800 && local774.method8514() <= local572.method8514() - (local800 - local273 >> 9) && local282 <= local813 && local774.method8514() <= local572.method8514() - (local813 - local282 >> 9)) {
										Static76.method1619(local774, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 != local515.aClass3_Sub1_21.aByte141);
										local774.anInt9955 = Static177.anInt3088;
									}
								}
							}
						}
						if (local572.anInt9955 == Static177.anInt3088) {
							continue;
						}
						Static76.method1619(local572, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 != local515.aClass3_Sub1_21.aByte141);
						local572.anInt9955 = Static177.anInt3088;
					}
					if (local515.aClass3_Sub1_21 instanceof Class3_Sub1_Sub2_Sub2_Sub2) {
						@Pc(917) Class3_Sub1_Sub2_Sub2_Sub2 local917 = (Class3_Sub1_Sub2_Sub2_Sub2) local515.aClass3_Sub1_21;
						if (local917.aClass345_1 != null) {
							if ((local917.aClass345_1.anInt8812 & 0x1) == 0 && (local917.anInt9925 & 0x1FF) == 0 && (local917.anInt9917 & 0x1FF) == 0 || (local917.aClass345_1.anInt8812 & 0x1) == 1 && (local917.anInt9925 & 0x1FF) == 256 && (local917.anInt9917 & 0x1FF) == 256) {
								local578 = local917.anInt9925 - (local917.aClass345_1.anInt8812 - 1 << 8);
								local273 = local917.anInt9917 - (local917.aClass345_1.anInt8812 - 1 << 8);
								for (local282 = 0; local282 < Static105.anInt2131; local282++) {
									@Pc(999) Class4_Sub45 local999 = (Class4_Sub45) Static597.aClass66_41.method1994((long) Static526.anIntArray558[local282]);
									if (local999 != null) {
										@Pc(1004) Class3_Sub1_Sub2_Sub2_Sub2 local1004 = local999.aClass3_Sub1_Sub2_Sub2_Sub2_2;
										if (local1004.anInt9955 != Static177.anInt3088 && local917 != local1004 && local1004.aBoolean773) {
											local356 = local1004.anInt9925 - (local1004.aClass345_1.anInt8812 - 1 << 8);
											local679 = local1004.anInt9917 - (local1004.aClass345_1.anInt8812 - 1 << 8);
											if (local578 <= local356 && local1004.aClass345_1.anInt8812 <= local917.aClass345_1.anInt8812 - (local356 - local578 >> 9) && local273 <= local679 && local1004.aClass345_1.anInt8812 <= local917.aClass345_1.anInt8812 - (local679 - local273 >> 9)) {
												Static152.method2629(local1004, local515.aClass3_Sub1_21.aByte141 != Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141);
												local1004.anInt9955 = Static177.anInt3088;
											}
										}
									}
								}
								local293 = Static518.anInt10290;
								@Pc(1122) int[] local1122 = Static489.anIntArray519;
								for (local356 = 0; local356 < local293; local356++) {
									@Pc(1132) Class3_Sub1_Sub2_Sub2_Sub1 local1132 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local1122[local356]];
									if (local1132 != null && Static177.anInt3088 != local1132.anInt9955 && local1132.aBoolean773) {
										local691 = local1132.anInt9925 - (local1132.method8514() - 1 << 8);
										local800 = local1132.anInt9917 - (local1132.method8514() - 1 << 8);
										if (local578 <= local691 && local1132.method8514() <= local917.aClass345_1.anInt8812 - (local691 - local578 >> 9) && local800 >= local273 && local1132.method8514() <= local917.aClass345_1.anInt8812 - (local800 - local273 >> 9)) {
											Static76.method1619(local1132, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 != local515.aClass3_Sub1_21.aByte141);
											local1132.anInt9955 = Static177.anInt3088;
										}
									}
								}
							}
							if (local917.anInt9955 == Static177.anInt3088) {
								continue;
							}
							Static152.method2629(local917, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 != local515.aClass3_Sub1_21.aByte141);
							local917.anInt9955 = Static177.anInt3088;
						}
					}
					if (local515.aClass3_Sub1_21 instanceof Class3_Sub1_Sub1_Sub1) {
						@Pc(1266) int local1266 = local158 + Static445.anInt6949;
						local578 = local550 + Static321.anInt5000;
						@Pc(1288) Class4_Sub7 local1288 = (Class4_Sub7) Static406.aClass66_28.method1994((long) (local515.aClass3_Sub1_21.aByte141 << 28 | local578 << 14 | local1266));
						if (local1288 != null) {
							local282 = 0;
							for (@Pc(1298) Class4_Sub33 local1298 = (Class4_Sub33) local1288.aClass163_8.method3648(); local1298 != null; local1298 = (Class4_Sub33) local1288.aClass163_8.method3651()) {
								@Pc(1306) Class110 local1306 = Static532.aClass255_2.method5210(local1298.anInt5595);
								if (Static463.aBoolean582 && local515.aClass3_Sub1_21.aByte141 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141) {
									@Pc(1328) Class257 local1328 = Static231.anInt8415 == -1 ? null : Static482.aClass84_2.method2152(Static231.anInt8415);
									if ((Static25.anInt576 & 0x1) != 0 && (local1328 == null || local1306.method2611(local1328.anInt6617, Static231.anInt8415) != local1328.anInt6617)) {
										Static321.method4431((long) local282, -1, false, Static203.aString30 + " -> <col=ff9040>" + local1306.aString24, Static111.anInt2192, (long) local1298.anInt5595, false, local550, 30, local158, Static384.aString73, true);
									}
								}
								if (local515.aClass3_Sub1_21.aByte141 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141) {
									@Pc(1390) String[] local1390 = local1306.aStringArray14;
									for (local679 = 4; local679 >= 0; local679--) {
										if (local1390 != null && local1390[local679] != null) {
											@Pc(1402) byte local1402 = 0;
											if (local679 == 0) {
												local1402 = 20;
											}
											local800 = Static232.anInt3661;
											if (local679 == 1) {
												local1402 = 11;
											}
											if (local679 == 2) {
												local1402 = 15;
											}
											if (local679 == 3) {
												local1402 = 16;
											}
											if (local679 == 4) {
												local1402 = 22;
											}
											if (local679 == local1306.anInt2787) {
												local800 = local1306.anInt2805;
											}
											if (local1306.anInt2760 == local679) {
												local800 = local1306.anInt2744;
											}
											Static321.method4431((long) local282, -1, false, "<col=ff9040>" + local1306.aString24, local800, (long) local1298.anInt5595, false, local550, local1402, local158, local1390[local679], true);
										}
									}
								}
								Static321.method4431((long) local282, -1, false, "<col=ff9040>" + local1306.aString24, Static431.anInt6801, (long) local1298.anInt5595, local515.aClass3_Sub1_21.aByte141 != Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141, local550, 1012, local158, Static279.aClass179_22.method4066(Static164.anInt2984), true);
								local282++;
							}
						}
					}
					if (local515.aClass3_Sub1_21 instanceof Interface20) {
						@Pc(1549) Interface20 local1549 = (Interface20) local515.aClass3_Sub1_21;
						@Pc(1558) Class342 local1558 = Static441.aClass74_169.method2075(local1549.method7087());
						if (local1558.anIntArray620 != null) {
							local1558 = local1558.method7495(Static526.aClass293_1);
						}
						if (local1558 != null) {
							if (Static463.aBoolean582 && local515.aClass3_Sub1_21.aByte141 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141) {
								@Pc(1587) Class257 local1587 = Static231.anInt8415 == -1 ? null : Static482.aClass84_2.method2152(Static231.anInt8415);
								if ((Static25.anInt576 & 0x4) != 0 && (local1587 == null || local1558.method7504(Static231.anInt8415, local1587.anInt6617) != local1587.anInt6617)) {
									Static321.method4431((long) local1549.hashCode(), -1, false, Static203.aString30 + " -> <col=00ffff>" + local1558.aString105, Static111.anInt2192, Static505.method5113(local158, local550, local1549), false, local550, 51, local158, Static384.aString73, true);
								}
							}
							if (local515.aClass3_Sub1_21.aByte141 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141) {
								@Pc(1658) String[] local1658 = local1558.aStringArray42;
								if (local1658 != null) {
									for (local282 = 4; local282 >= 0; local282--) {
										if (local1658[local282] != null) {
											@Pc(1670) short local1670 = 0;
											local304 = Static232.anInt3661;
											if (local282 == 0) {
												local1670 = 9;
											}
											if (local282 == 1) {
												local1670 = 19;
											}
											if (local282 == 2) {
												local1670 = 3;
											}
											if (local282 == 3) {
												local1670 = 2;
											}
											if (local282 == 4) {
												local1670 = 1007;
											}
											if (local282 == local1558.anInt8745) {
												local304 = local1558.anInt8717;
											}
											if (local282 == local1558.anInt8704) {
												local304 = local1558.anInt8698;
											}
											Static321.method4431((long) local1549.hashCode(), -1, false, "<col=00ffff>" + local1558.aString105, local304, Static505.method5113(local158, local550, local1549), false, local550, local1670, local158, local1658[local282], true);
										}
									}
								}
								Static321.method4431((long) local1549.hashCode(), -1, false, "<col=00ffff>" + local1558.aString105, Static431.anInt6801, (long) local1558.anInt8738, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 != local515.aClass3_Sub1_21.aByte141, local550, 1011, local158, Static279.aClass179_22.method4066(Static164.anInt2984), true);
							}
						}
					}
				}
			}
			if (Static423.aBoolean517) {
				Static479.method6585();
			}
		}
		Static679.method9005(false);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public static void method2318() {
		if (Static618.anInt9708 == 0 || Static618.anInt9708 == 10) {
			return;
		}
		try {
			@Pc(18) short local18;
			if (Static50.anInt1093 == 0) {
				local18 = 250;
			} else {
				local18 = 2000;
			}
			if (Static315.aBoolean370 && Static618.anInt9708 >= 6) {
				local18 = 6000;
			}
			if (local18 < ++Static361.anInt5460) {
				if (Static375.aClass192_2 != null) {
					Static375.aClass192_2.method7791();
					Static375.aClass192_2 = null;
				}
				if (Static50.anInt1093 >= 3) {
					Static618.anInt9708 = 0;
					Static97.method1973(-5);
					return;
				}
				if (Static306.anInt4811 == 2) {
					Static653.aClass382_5.method8696();
				} else {
					Static121.aClass382_1.method8696();
				}
				Static618.anInt9708 = 1;
				Static361.anInt5460 = 0;
				Static50.anInt1093++;
			}
			if (Static618.anInt9708 == 1) {
				if (Static306.anInt4811 == 2) {
					Static400.aClass281_3 = Static653.aClass382_5.method8694(Static239.aClass207_2);
				} else {
					Static400.aClass281_3 = Static121.aClass382_1.method8694(Static239.aClass207_2);
				}
				Static618.anInt9708 = 2;
			}
			@Pc(140) Class4_Sub48 local140;
			@Pc(157) int local157;
			@Pc(199) int local199;
			if (Static618.anInt9708 == 2) {
				if (Static400.aClass281_3.anInt7338 == 2) {
					throw new IOException();
				}
				if (Static400.aClass281_3.anInt7338 != 1) {
					return;
				}
				Static375.aClass192_2 = Static252.method3669((Socket) Static400.aClass281_3.anObject17);
				Static400.aClass281_3 = null;
				Static419.method5754();
				local140 = Static623.method8371();
				if (Static315.aBoolean370) {
					local140.aClass4_Sub11_Sub1_2.method8822(Static51.aClass164_12.anInt4099);
					local140.aClass4_Sub11_Sub1_2.method8838(0);
					local157 = local140.aClass4_Sub11_Sub1_2.anInt10466;
					local140.aClass4_Sub11_Sub1_2.method8860(648);
					if (Static306.anInt4811 == 2) {
						local140.aClass4_Sub11_Sub1_2.method8822(Static656.anInt10356 == 13 ? 1 : 0);
					}
					@Pc(178) Class4_Sub11 local178 = Static445.method6120();
					local178.method8822(Static53.anInt1190);
					local178.method8838((int) (Math.random() * 9.9999999E7D));
					local178.method8822(Static164.anInt2984);
					local178.method8860(Static461.anInt7416);
					for (local199 = 0; local199 < 6; local199++) {
						local178.method8860((int) (Math.random() * 9.9999999E7D));
					}
					local178.method8873(Static291.aLong137);
					local178.method8822(Static333.aClass234_5.anInt5621);
					local178.method8822((int) (Math.random() * 9.9999999E7D));
					local178.method8878(Static271.aBigInteger4, Static522.aBigInteger9);
					local140.aClass4_Sub11_Sub1_2.method8824(local178.aByteArray107, local178.anInt10466, 0);
					local140.aClass4_Sub11_Sub1_2.method8885(local140.aClass4_Sub11_Sub1_2.anInt10466 - local157);
				} else {
					local140.aClass4_Sub11_Sub1_2.method8822(Static51.aClass164_1.anInt4099);
				}
				Static410.method5170(local140);
				Static460.method6417();
				Static618.anInt9708 = 3;
			}
			@Pc(293) int local293;
			if (Static618.anInt9708 == 3) {
				if (!Static375.aClass192_2.method7787(1)) {
					return;
				}
				Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 1);
				local293 = Static159.aClass4_Sub11_Sub1_1.aByteArray107[0] & 0xFF;
				if (local293 != 0) {
					Static618.anInt9708 = 0;
					Static97.method1973(local293);
					Static375.aClass192_2.method7791();
					Static375.aClass192_2 = null;
					Static256.method3700();
					return;
				}
				if (Static315.aBoolean370) {
					Static618.anInt9708 = 4;
				} else {
					Static618.anInt9708 = 8;
				}
			}
			if (Static618.anInt9708 == 4) {
				if (!Static375.aClass192_2.method7787(2)) {
					return;
				}
				Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 2);
				Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
				Static159.aClass4_Sub11_Sub1_1.anInt10466 = Static159.aClass4_Sub11_Sub1_1.method8859();
				Static618.anInt9708 = 5;
			}
			if (Static618.anInt9708 == 5) {
				if (!Static375.aClass192_2.method7787(Static159.aClass4_Sub11_Sub1_1.anInt10466)) {
					return;
				}
				Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, Static159.aClass4_Sub11_Sub1_1.anInt10466);
				Static159.aClass4_Sub11_Sub1_1.method8829(Static445.anIntArray481);
				Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
				@Pc(376) String local376 = Static159.aClass4_Sub11_Sub1_1.method8844();
				Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
				@Pc(381) String local381 = "opensn";
				if (!Static278.aBoolean340 || Static195.method3023(Static239.aClass207_2, local381, 1, local376).anInt7338 == 2) {
					Static306.method4297(true, Static239.aClass207_2, local381, local376, Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() == 1);
				}
				Static618.anInt9708 = 6;
			}
			if (Static618.anInt9708 == 6) {
				if (!Static375.aClass192_2.method7787(1)) {
					return;
				}
				Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 1);
				if ((Static159.aClass4_Sub11_Sub1_1.aByteArray107[0] & 0xFF) == 1) {
					Static618.anInt9708 = 7;
				}
			}
			if (Static618.anInt9708 == 7) {
				if (!Static375.aClass192_2.method7787(16)) {
					return;
				}
				Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 16);
				Static159.aClass4_Sub11_Sub1_1.anInt10466 = 16;
				Static159.aClass4_Sub11_Sub1_1.method8829(Static445.anIntArray481);
				Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
				Static163.aString26 = Static1.aString83 = Static414.method5217(Static159.aClass4_Sub11_Sub1_1.method8830());
				Static238.aLong116 = Static159.aClass4_Sub11_Sub1_1.method8830();
				Static618.anInt9708 = 8;
			}
			@Pc(497) Class4_Sub11_Sub1 local497;
			if (Static618.anInt9708 == 8) {
				Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
				Static419.method5754();
				local140 = Static623.method8371();
				local497 = local140.aClass4_Sub11_Sub1_2;
				@Pc(523) int local523;
				@Pc(532) Class4_Sub11 local532;
				@Pc(504) Class164 local504;
				if (Static306.anInt4811 == 2) {
					if (Static315.aBoolean370) {
						local504 = Static51.aClass164_13;
					} else {
						local504 = Static51.aClass164_3;
					}
					local497.method8822(local504.anInt4099);
					local497.method8838(0);
					local199 = local497.anInt10466;
					local523 = local497.anInt10466;
					if (!Static315.aBoolean370) {
						local497.method8860(648);
						local497.method8822(Static656.anInt10356 == 13 ? 1 : 0);
						local523 = local497.anInt10466;
						local532 = Static328.method4513();
						local497.method8824(local532.aByteArray107, local532.anInt10466, 0);
						local523 = local497.anInt10466;
						local497.method8857(Static163.aString26);
					}
					local497.method8822(Static141.anInt2583);
					local497.method8822(Static324.method4462());
					local497.method8838(Static632.anInt9867);
					local497.method8838(Static357.anInt5421);
					local497.method8822(Static124.aClass4_Sub20_4.aClass8_Sub27_2.method7983());
					Static466.method6476(local497);
					local497.method8857(Static264.aString40);
					local497.method8860(Static461.anInt7416);
					local532 = Static124.aClass4_Sub20_4.method3146();
					local497.method8822(local532.anInt10466);
					local497.method8824(local532.aByteArray107, local532.anInt10466, 0);
					Static391.aBoolean438 = true;
					@Pc(709) Class4_Sub11 local709 = new Class4_Sub11(Static566.aClass4_Sub41_1.method6547());
					Static566.aClass4_Sub41_1.method6548(local709);
					local497.method8824(local709.aByteArray107, local709.aByteArray107.length, 0);
					local497.method8838(Static209.anInt3391);
					local497.method8873(Static278.aLong133);
					local497.method8822(Static567.aString106 == null ? 0 : 1);
					if (Static567.aString106 != null) {
						local497.method8857(Static567.aString106);
					}
					local497.method8822(Static571.method7587("jagtheora") ? 1 : 0);
					local497.method8822(Static278.aBoolean340 ? 1 : 0);
					Static483.method6620(local497);
					local497.method8854(local523, local497.anInt10466, Static445.anIntArray481);
					local497.method8885(local497.anInt10466 - local199);
				} else {
					if (Static315.aBoolean370) {
						local504 = Static51.aClass164_13;
					} else {
						local504 = Static51.aClass164_5;
					}
					local497.method8822(local504.anInt4099);
					local497.method8838(0);
					local199 = local497.anInt10466;
					local523 = local497.anInt10466;
					if (!Static315.aBoolean370) {
						local497.method8860(648);
						local532 = Static328.method4513();
						local497.method8824(local532.aByteArray107, local532.anInt10466, 0);
						local523 = local497.anInt10466;
						local497.method8857(Static163.aString26);
					}
					local497.method8822(Static333.aClass234_5.anInt5621);
					local497.method8822(Static164.anInt2984);
					Static466.method6476(local497);
					local497.method8857(Static264.aString40);
					local497.method8860(Static461.anInt7416);
					Static483.method6620(local497);
					local497.method8854(local523, local497.anInt10466, Static445.anIntArray481);
					local497.method8885(local497.anInt10466 - local199);
				}
				Static410.method5170(local140);
				Static460.method6417();
				Static669.aClass196_2 = new Class196(Static445.anIntArray481);
				for (@Pc(791) int local791 = 0; local791 < 4; local791++) {
					Static445.anIntArray481[local791] += 50;
				}
				Static159.aClass4_Sub11_Sub1_1.method985(Static445.anIntArray481);
				Static445.anIntArray481 = null;
				Static618.anInt9708 = 9;
			}
			if (Static618.anInt9708 == 9) {
				if (!Static375.aClass192_2.method7787(1)) {
					return;
				}
				Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 1);
				local293 = Static159.aClass4_Sub11_Sub1_1.aByteArray107[0] & 0xFF;
				if (local293 == 21) {
					Static618.anInt9708 = 12;
				} else if (local293 == 29) {
					Static618.anInt9708 = 18;
				} else if (local293 == 1) {
					Static618.anInt9708 = 10;
					Static97.method1973(local293);
					return;
				} else if (local293 == 2) {
					Static618.anInt9708 = 13;
				} else if (local293 == 15) {
					Static618.anInt9708 = 19;
					Static583.anInt8992 = -2;
				} else if (local293 == 23 && Static50.anInt1093 < 3) {
					Static618.anInt9708 = 1;
					Static361.anInt5460 = 0;
					Static50.anInt1093++;
					Static375.aClass192_2.method7791();
					Static375.aClass192_2 = null;
					return;
				} else if (!Static603.aBoolean725 || Static315.aBoolean370 || Static53.anInt1190 == -1 || local293 != 35) {
					Static618.anInt9708 = 0;
					Static97.method1973(local293);
					Static375.aClass192_2.method7791();
					Static375.aClass192_2 = null;
					Static256.method3700();
					return;
				} else {
					Static361.anInt5460 = 0;
					Static618.anInt9708 = 1;
					Static315.aBoolean370 = true;
					Static375.aClass192_2.method7791();
					Static375.aClass192_2 = null;
					return;
				}
			}
			if (Static618.anInt9708 == 11) {
				Static419.method5754();
				local140 = Static623.method8371();
				local497 = local140.aClass4_Sub11_Sub1_2;
				local497.method987(Static669.aClass196_2);
				local497.method996(Static51.aClass164_9.anInt4099);
				Static410.method5170(local140);
				Static460.method6417();
				Static618.anInt9708 = 9;
			} else if (Static618.anInt9708 == 12) {
				if (Static375.aClass192_2.method7787(1)) {
					Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 1);
					local293 = Static159.aClass4_Sub11_Sub1_1.aByteArray107[0] & 0xFF;
					Static18.anInt6907 = local293 * 50;
					Static618.anInt9708 = 0;
					Static97.method1973(21);
					Static375.aClass192_2.method7791();
					Static375.aClass192_2 = null;
					Static256.method3700();
				}
			} else if (Static618.anInt9708 == 18) {
				if (Static375.aClass192_2.method7787(1)) {
					Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 1);
					Static618.anInt9708 = 0;
					Static80.anInt1713 = Static159.aClass4_Sub11_Sub1_1.aByteArray107[0] & 0xFF;
					Static97.method1973(29);
					Static375.aClass192_2.method7791();
					Static375.aClass192_2 = null;
					Static256.method3700();
				}
			} else if (Static618.anInt9708 != 13) {
				@Pc(1082) Class4_Sub11_Sub1 local1082;
				if (Static618.anInt9708 == 14) {
					local1082 = Static159.aClass4_Sub11_Sub1_1;
					if (Static306.anInt4811 == 2) {
						if (!Static375.aClass192_2.method7787(Static162.anInt2720)) {
							return;
						}
						Static375.aClass192_2.method7792(local1082.aByteArray107, 0, Static162.anInt2720);
						local1082.anInt10466 = 0;
						Static279.anInt4498 = local1082.method8865();
						Static595.anInt9154 = local1082.method8865();
						Static197.aBoolean408 = local1082.method8865() == 1;
						Static263.aBoolean317 = local1082.method8865() == 1;
						Static604.aBoolean726 = local1082.method8865() == 1;
						Static42.aBoolean75 = local1082.method8865() == 1;
						Static184.anInt3149 = local1082.method8859();
						Static54.aBoolean83 = local1082.method8865() == 1;
						Static34.anInt9717 = local1082.method8856();
						Static307.aBoolean718 = local1082.method8865() == 1;
						Static441.aClass74_169.method2074(Static307.aBoolean718);
						Static532.aClass255_2.method5206(Static307.aBoolean718);
						Static255.aClass380_1.method8594(Static307.aBoolean718);
					} else if (Static375.aClass192_2.method7787(Static162.anInt2720)) {
						Static375.aClass192_2.method7792(local1082.aByteArray107, 0, Static162.anInt2720);
						local1082.anInt10466 = 0;
						Static279.anInt4498 = local1082.method8865();
						Static595.anInt9154 = local1082.method8865();
						Static197.aBoolean408 = local1082.method8865() == 1;
						Static263.aBoolean317 = local1082.method8865() == 1;
						Static604.aBoolean726 = local1082.method8865() == 1;
						Static127.aLong83 = local1082.method8830();
						Static419.aLong192 = Static127.aLong83 - Static429.method5935() - local1082.method8832();
						local157 = local1082.method8865();
						Static54.aBoolean83 = (local157 & 0x1) != 0;
						Static664.aBoolean795 = (local157 & 0x2) != 0;
						Static235.anInt5515 = local1082.method8850();
						Static394.anInt5899 = local1082.method8859();
						Static223.anInt3551 = local1082.method8859();
						Static393.anInt5780 = local1082.method8859();
						Static135.anInt2516 = local1082.method8850();
						Static431.aClass281_4 = Static239.aClass207_2.method4586(Static135.anInt2516);
						Static209.anInt3390 = local1082.method8865();
						Static100.anInt2071 = local1082.method8859();
						Static430.anInt6773 = local1082.method8859();
						Static472.aBoolean588 = local1082.method8865() == 1;
						Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString37 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString36 = Static603.aString116 = local1082.method8844();
						Static208.anInt3381 = local1082.method8865();
						Static310.anInt4841 = local1082.method8850();
						Static56.aBoolean84 = local1082.method8865() == 1;
						Static203.aClass382_2 = new Class382();
						Static203.aClass382_2.anInt10282 = local1082.method8859();
						if (Static203.aClass382_2.anInt10282 == 65535) {
							Static203.aClass382_2.anInt10282 = -1;
						}
						Static203.aClass382_2.aString122 = local1082.method8844();
						if (Static215.aClass60_4 != Static181.aClass60_3) {
							Static203.aClass382_2.anInt10280 = Static203.aClass382_2.anInt10282 + 40000;
							Static203.aClass382_2.anInt10279 = Static203.aClass382_2.anInt10282 + 50000;
						}
						if (Static181.aClass60_3 != Static238.aClass60_5 && (Static181.aClass60_3 != Static342.aClass60_10 || Static279.anInt4498 < 2) && (Static653.aClass382_5.method8697(Static375.aClass382_3) || Static653.aClass382_5.method8697(Static484.aClass382_4))) {
							Static221.method3264();
						}
					} else {
						return;
					}
					if (Static197.aBoolean408 && !Static604.aBoolean726 || Static54.aBoolean83) {
						try {
							Static684.method6376("zap", Static649.anApplet2);
						} catch (@Pc(1447) Throwable local1447) {
							if (Static640.aBoolean781) {
								try {
									Static649.anApplet2.getAppletContext().showDocument(new URL(Static649.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1461) Exception local1461) {
								}
							}
						}
					} else {
						try {
							Static684.method6376("unzap", Static649.anApplet2);
						} catch (@Pc(1438) Throwable local1438) {
						}
					}
					if (Static215.aClass60_4 == Static181.aClass60_3) {
						try {
							Static684.method6376("loggedin", Static649.anApplet2);
						} catch (@Pc(1472) Throwable local1472) {
						}
					}
					if (Static306.anInt4811 != 2) {
						Static618.anInt9708 = 0;
						Static97.method1973(2);
						Static280.method8741();
						Static53.method1256(7);
						Static58.aClass151_23 = null;
						return;
					}
					Static618.anInt9708 = 16;
				}
				if (Static618.anInt9708 == 16) {
					if (!Static375.aClass192_2.method7787(3)) {
						return;
					}
					Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 3);
					Static618.anInt9708 = 17;
				}
				if (Static618.anInt9708 == 17) {
					local1082 = Static159.aClass4_Sub11_Sub1_1;
					local1082.anInt10466 = 0;
					if (local1082.method990()) {
						if (!Static375.aClass192_2.method7787(1)) {
							return;
						}
						Static375.aClass192_2.method7792(local1082.aByteArray107, 3, 1);
					}
					Static58.aClass151_23 = Static277.method4050()[local1082.method993()];
					Static583.anInt8992 = local1082.method8859();
					Static618.anInt9708 = 15;
				}
				if (Static618.anInt9708 == 15) {
					if (Static375.aClass192_2.method7787(Static583.anInt8992)) {
						Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, Static583.anInt8992);
						Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
						Static618.anInt9708 = 0;
						local293 = Static583.anInt8992;
						Static97.method1973(2);
						Static88.method1787();
						Static162.method2591(Static159.aClass4_Sub11_Sub1_1);
						Static564.anInt8658 = -1;
						if (Static58.aClass151_23 == Static472.aClass151_159) {
							Static69.method1475();
						} else {
							Static205.method3086();
						}
						if (Static159.aClass4_Sub11_Sub1_1.anInt10466 != local293) {
							throw new RuntimeException("lswp pos:" + Static159.aClass4_Sub11_Sub1_1.anInt10466 + " psize:" + local293);
						}
						Static58.aClass151_23 = null;
					}
				} else if (Static618.anInt9708 == 19) {
					if (Static583.anInt8992 == -2) {
						if (!Static375.aClass192_2.method7787(2)) {
							return;
						}
						Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 2);
						Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
						Static583.anInt8992 = Static159.aClass4_Sub11_Sub1_1.method8859();
					}
					if (Static375.aClass192_2.method7787(Static583.anInt8992)) {
						Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, Static583.anInt8992);
						Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
						local293 = Static583.anInt8992;
						Static618.anInt9708 = 0;
						Static97.method1973(15);
						Static28.method642();
						Static162.method2591(Static159.aClass4_Sub11_Sub1_1);
						if (local293 != Static159.aClass4_Sub11_Sub1_1.anInt10466) {
							throw new RuntimeException("lswpr pos:" + Static159.aClass4_Sub11_Sub1_1.anInt10466 + " psize:" + local293);
						}
						Static58.aClass151_23 = null;
					}
				}
			} else if (Static375.aClass192_2.method7787(1)) {
				Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 1);
				Static162.anInt2720 = Static159.aClass4_Sub11_Sub1_1.aByteArray107[0] & 0xFF;
				Static618.anInt9708 = 14;
			}
		} catch (@Pc(1705) IOException local1705) {
			if (Static375.aClass192_2 != null) {
				Static375.aClass192_2.method7791();
				Static375.aClass192_2 = null;
			}
			if (Static50.anInt1093 < 3) {
				if (Static306.anInt4811 == 2) {
					Static653.aClass382_5.method8696();
				} else {
					Static121.aClass382_1.method8696();
				}
				Static361.anInt5460 = 0;
				Static50.anInt1093++;
				Static618.anInt9708 = 1;
			} else {
				Static618.anInt9708 = 0;
				Static97.method1973(-4);
				Static256.method3700();
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ha;IIILclient!tba;I)V")
	public static void method2319(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class342 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class318 local9 = Static623.aClass132_4.method2915(arg3.anInt8713);
		if (local9.anInt8100 == -1) {
			return;
		}
		if (arg3.aBoolean678) {
			@Pc(23) int local23 = arg2 + arg3.anInt8737;
			arg2 = local23 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(44) Class17 local44 = local9.method7053(arg0, arg3.aBoolean681, arg2);
		if (local44 == null) {
			return;
		}
		@Pc(50) int local50 = arg3.anInt8716;
		@Pc(53) int local53 = arg3.anInt8728;
		if ((arg2 & 0x1) == 1) {
			local53 = arg3.anInt8716;
			local50 = arg3.anInt8728;
		}
		@Pc(67) int local67 = local44.method5256();
		@Pc(70) int local70 = local44.method5251();
		if (local9.aBoolean634) {
			local67 = local50 * 4;
			local70 = local53 * 4;
		}
		if (local9.anInt8102 == 0) {
			local44.method5245(arg1, arg4 + 4 - local53 * 4, local67, local70);
		} else {
			local44.method5259(arg1, arg4 - (local53 - 1) * 4, local67, local70, 0, local9.anInt8102 | 0xFF000000, 1);
		}
	}
}
