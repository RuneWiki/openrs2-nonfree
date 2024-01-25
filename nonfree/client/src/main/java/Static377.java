import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	public static int anInt6738;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "S")
	public static short aShort68 = 1;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIZI)V")
	public static void method5457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg0);
		@Pc(29) Class1_Sub45 local29 = (Class1_Sub45) Static288.aClass91_22.method2271(local14);
		if (local29 == null) {
			local29 = new Class1_Sub45();
			Static288.aClass91_22.method2269(local14, local29);
		}
		if (arg2 >= local29.anIntArray521.length) {
			@Pc(50) int[] local50 = new int[arg2 + 1];
			@Pc(55) int[] local55 = new int[arg2 + 1];
			for (@Pc(57) int local57 = 0; local57 < local29.anIntArray521.length; local57++) {
				local50[local57] = local29.anIntArray521[local57];
				local55[local57] = local29.anIntArray520[local57];
			}
			for (@Pc(83) int local83 = local29.anIntArray521.length; local83 < arg2; local83++) {
				local50[local83] = -1;
				local55[local83] = 0;
			}
			local29.anIntArray521 = local50;
			local29.anIntArray520 = local55;
		}
		local29.anIntArray521[arg2] = arg4;
		local29.anIntArray520[arg2] = arg1;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public static void method5458() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static253.aClass57Array1[local3] = null;
		}
		Static462.anInt8035 = 0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Canvas;BILclient!fa;)Lclient!r;")
	public static Class78 method5459(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface9 arg2) {
		return new Class78_Sub3(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ[Lclient!in;IIIIIII)V")
	public static void method5460(@OriginalArg(0) int arg0, @OriginalArg(2) Class160[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static31.aClass78_18.da(arg2, arg8, arg6, arg7);
		for (@Pc(18) int local18 = 0; local18 < arg1.length; local18++) {
			@Pc(24) Class160 local24 = arg1[local18];
			if (local24 != null && (arg3 == local24.anInt4224 || arg3 == -1412584499 && Static488.aClass160_36 == local24)) {
				@Pc(71) int local71;
				if (arg4 == -1) {
					Class295.aRectangleArray2[Static231.anInt4302].setBounds(local24.anInt4169 + arg0, local24.anInt4171 + arg5, local24.anInt4182, local24.anInt4156);
					local71 = Static231.anInt4302++;
				} else {
					local71 = arg4;
				}
				local24.anInt4185 = Static518.anInt9331;
				local24.anInt4165 = local71;
				if (!Static67.method1106(local24)) {
					if (local24.anInt4186 != 0) {
						Static96.method1452(local24);
					}
					@Pc(95) int local95 = arg0 + local24.anInt4169;
					@Pc(100) int local100 = arg5 + local24.anInt4171;
					@Pc(103) int local103 = local24.anInt4181;
					if (Static506.aBoolean659 && (Static67.method1098(local24).anInt658 != 0 || local24.anInt4166 == 0) && local103 > 127) {
						local103 = 127;
					}
					@Pc(159) int local159;
					@Pc(163) int local163;
					if (local24 == Static488.aClass160_36) {
						if (arg3 != -1412584499 && (local24.anInt4190 == Static296.anInt5342 || Static47.anInt889 == local24.anInt4190)) {
							Static121.anInt2503 = arg0;
							Static568.anInt8904 = arg5;
							Static319.aClass160Array2 = arg1;
							continue;
						}
						if (Static78.aBoolean97 && Static241.aBoolean321) {
							local159 = Static216.aClass238_1.method5661();
							local163 = Static216.aClass238_1.method5653();
							local163 -= Static41.anInt8212;
							local159 -= Static419.anInt7395;
							if (Static114.anInt1942 > local159) {
								local159 = Static114.anInt1942;
							}
							if (local159 + local24.anInt4182 > Static114.anInt1942 + Static6.aClass160_45.anInt4182) {
								local159 = Static114.anInt1942 + Static6.aClass160_45.anInt4182 - local24.anInt4182;
							}
							if (Static540.anInt9051 > local163) {
								local163 = Static540.anInt9051;
							}
							if (Static540.anInt9051 + Static6.aClass160_45.anInt4156 < local163 - -local24.anInt4156) {
								local163 = Static540.anInt9051 + Static6.aClass160_45.anInt4156 - local24.anInt4156;
							}
							local95 = local159;
							local100 = local163;
						}
						if (local24.anInt4190 == Static47.anInt889) {
							local103 = 128;
						}
					}
					@Pc(287) int local287;
					@Pc(298) int local298;
					@Pc(251) int local251;
					@Pc(256) int local256;
					if (local24.anInt4166 == 2) {
						local287 = arg6;
						local163 = arg8;
						local159 = arg2;
						local298 = arg7;
					} else {
						local251 = local95 + local24.anInt4182;
						local256 = local24.anInt4156 + local100;
						local159 = local95 > arg2 ? local95 : arg2;
						local163 = local100 <= arg8 ? arg8 : local100;
						if (local24.anInt4166 == 9) {
							local251++;
							local256++;
						}
						local287 = arg6 <= local251 ? arg6 : local251;
						local298 = arg7 <= local256 ? arg7 : local256;
					}
					if (local159 < local287 && local298 > local163) {
						@Pc(540) int local540;
						@Pc(553) int local553;
						@Pc(650) int local650;
						@Pc(506) int local506;
						@Pc(538) int local538;
						if (local24.anInt4186 != 0) {
							if (local24.anInt4186 == Static471.anInt8086 || Static30.anInt661 == local24.anInt4186) {
								Static458.method7910(local100, local24.anInt4186 == Static30.anInt661, local24.anInt4156, local95, local24.anInt4182);
								Static73.aBooleanArray6[local71] = true;
								Static31.aClass78_18.da(arg2, arg8, arg6, arg7);
								continue;
							}
							if (Static102.anInt1773 == local24.anInt4186) {
								if (local24.method3361(Static31.aClass78_18) != null) {
									Static275.method4012();
									Static500.method7051(local24, Static31.aClass78_18, local100, local95);
									Static102.aBooleanArray7[local71] = true;
									Static31.aClass78_18.da(arg2, arg8, arg6, arg7);
								}
								continue;
							}
							if (Static321.anInt5861 == local24.anInt4186) {
								if (local24.method3361(Static31.aClass78_18) != null) {
									Static170.method2736(local100, local24, local95);
									Static102.aBooleanArray7[local71] = true;
									Static31.aClass78_18.da(arg2, arg8, arg6, arg7);
								}
								continue;
							}
							if (Static376.anInt1806 == local24.anInt4186) {
								Static425.method6084(Static31.aClass78_18, Static302.anInterface9_12, local24.anInt4156, local24.anInt4182, local100, local95);
								Static73.aBooleanArray6[local71] = true;
								Static31.aClass78_18.da(arg2, arg8, arg6, arg7);
								continue;
							}
							if (local24.anInt4186 == Static16.anInt468) {
								Static234.method3458(local24.anInt4156, local100, local95, local24.anInt4182, Static31.aClass78_18);
								Static73.aBooleanArray6[local71] = true;
								Static31.aClass78_18.da(arg2, arg8, arg6, arg7);
								continue;
							}
							if (local24.anInt4186 == Static449.anInt7908) {
								if (!Static541.aBoolean677 && !Static169.aBoolean233) {
									continue;
								}
								local251 = local95 + local24.anInt4182;
								local256 = local100 + 15;
								if (Static541.aBoolean677) {
									local506 = -256;
									if (Static403.anInt7222 < 20) {
										local506 = -65536;
									}
									Static339.aClass96_9.method7244("Fps:" + Static403.anInt7222, local251, local506, local256, -1);
									local256 += 15;
									@Pc(528) Runtime local528 = Runtime.getRuntime();
									local538 = (int) ((local528.totalMemory() - local528.freeMemory()) / 1024L);
									local540 = -256;
									if (local538 > 98304) {
										local540 = -65536;
										if (Static450.aBoolean599) {
											Static65.method1051();
											for (local553 = 0; local553 < 10; local553++) {
												System.gc();
											}
											local538 = (int) ((local528.totalMemory() - local528.freeMemory()) / 1024L);
											if (local538 > 65536) {
												Static193.method3073("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static339.aClass96_9.method7244("Mem:" + local538 + "k", local251, local540, local256, -1);
									local256 += 15;
									Static339.aClass96_9.method7244("In:" + Static276.anInt5041 + "B/s Out:" + Static216.anInt3942 + "B/s", local251, -256, local256, -1);
									local256 += 15;
									local553 = Static31.aClass78_18.b() / 1024;
									Static339.aClass96_9.method7244("Offheap:" + local553 + "k", local251, local553 <= 65536 ? -256 : -65536, local256, -1);
									local256 += 15;
									local650 = 0;
									@Pc(652) int local652 = 0;
									@Pc(654) int local654 = 0;
									for (@Pc(656) int local656 = 0; local656 < 35; local656++) {
										if (Static578.aClass156_Sub1Array2[local656] != null) {
											local650 += Static578.aClass156_Sub1Array2[local656].method4690();
											local652 += Static578.aClass156_Sub1Array2[local656].method4699();
											local654 += Static578.aClass156_Sub1Array2[local656].method4698();
										}
									}
									@Pc(696) int local696 = local654 * 100 / local650;
									@Pc(702) int local702 = local652 * 10000 / local650;
									@Pc(722) String local722 = "Cache:" + Static370.method5419(2, 0, (long) local702, true) + "% (" + local696 + "%)";
									Static442.aClass96_12.method7244(local722, local251, -256, local256, -1);
									local256 += 12;
								}
								if (Static74.anInt3298 > 0) {
									Static442.aClass96_12.method7244("Particles: " + Static298.anInt5552 + " / " + Static74.anInt3298, local251, -256, local256, -1);
								}
								local256 += 12;
								if (Static169.aBoolean233) {
									Static442.aClass96_12.method7244("Polys: " + Static31.aClass78_18.DA() + " Models: " + Static31.aClass78_18.T(), local251, -256, local256, -1);
									local256 += 12;
									Static442.aClass96_12.method7244("Ls: " + Static225.anInt4130 + " La: " + Static208.anInt8061 + " NPC: " + Static372.anInt6710 + " Pl: " + Static564.anInt9350, local251, -256, local256, -1);
									Static480.method6649();
									local256 += 12;
								}
								Static73.aBooleanArray6[local71] = true;
								continue;
							}
						}
						if (local24.anInt4166 == 0) {
							if (Static52.anInt7864 == local24.anInt4186 && Static31.aClass78_18.method6802()) {
								Static31.aClass78_18.method6783(local95, local100, local24.anInt4182, local24.anInt4156);
							}
							method5460(local95 - local24.anInt4211, arg1, local159, local24.anInt4199, local71, local100 - local24.anInt4218, local287, local298, local163);
							if (local24.aClass160Array1 != null) {
								method5460(local95 - local24.anInt4211, local24.aClass160Array1, local159, local24.anInt4199, local71, local100 - local24.anInt4218, local287, local298, local163);
							}
							@Pc(880) Class1_Sub38 local880 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local24.anInt4199);
							if (local880 != null) {
								Static185.method3005(local163, local100, local298, local95, local71, local287, local159, local880.anInt7676);
							}
							if (local24.anInt4186 == Static52.anInt7864 && Static31.aClass78_18.method6802()) {
								Static31.aClass78_18.method6844();
							}
							Static31.aClass78_18.da(arg2, arg8, arg6, arg7);
						}
						if (Static529.aBooleanArray31[local71] || Static235.anInt4324 > 1) {
							if (local24.anInt4166 == 3) {
								if (local103 == 0) {
									if (local24.aBoolean298) {
										Static31.aClass78_18.J(local95, local100, local24.anInt4182, local24.anInt4156, local24.anInt4225, 0);
									} else {
										Static31.aClass78_18.method6778(local95, local100, local24.anInt4182, local24.anInt4156, local24.anInt4225, 0);
									}
								} else if (local24.aBoolean298) {
									Static31.aClass78_18.J(local95, local100, local24.anInt4182, local24.anInt4156, 255 - (local103 & 0xFF) << 24 | local24.anInt4225 & 0xFFFFFF, 1);
								} else {
									Static31.aClass78_18.method6778(local95, local100, local24.anInt4182, local24.anInt4156, local24.anInt4225 & 0xFFFFFF | 255 - (local103 & 0xFF) << 24, 1);
								}
							} else if (local24.anInt4166 == 4) {
								@Pc(1016) Class96 local1016 = local24.method3359(Static31.aClass78_18);
								if (local1016 != null) {
									local256 = local24.anInt4225;
									@Pc(1031) String local1031 = local24.aString44;
									if (local24.anInt4205 != -1) {
										@Pc(1041) Class222 local1041 = Static230.aClass225_1.method4857(local24.anInt4205);
										local1031 = local1041.aString70;
										if (local1031 == null) {
											local1031 = "null";
										}
										if ((local1041.anInt5916 == 1 || local24.anInt4178 != 1) && local24.anInt4178 != -1) {
											local1031 = "<col=ff9040>" + local1031 + "</col> x" + Static262.method3793(local24.anInt4178);
										}
									}
									if (local24 == Static390.aClass160_43) {
										local1031 = Static375.aClass253_35.method5453(Static161.anInt3095);
										local256 = local24.anInt4225;
									}
									if (Static556.aBoolean690) {
										Static31.aClass78_18.V(local95, local100, local95 + local24.anInt4182, local100 + local24.anInt4156);
									}
									local1016.method7255(local24.anInt4217, local24.anInt4192, Static360.aClass5Array17, local24.aBoolean294 ? 255 - (local103 & 0xFF) << 24 : -1, local24.anInt4149, local256 | 255 - (local103 & 0xFF) << 24, null, local24.anInt4156, null, 0, local100, local1031, local95, local24.anInt4182, local24.anInt4204, 0);
									if (Static556.aBoolean690) {
										Static31.aClass78_18.da(arg2, arg8, arg6, arg7);
									}
								} else if (Static376.aBoolean120) {
									Static415.method5900(local24);
								}
							} else {
								@Pc(1241) int local1241;
								if (local24.anInt4166 == 5) {
									if (local24.anInt4180 < 0) {
										@Pc(1176) Class5 local1176;
										if (local24.anInt4205 == -1) {
											local1176 = local24.method3354(Static31.aClass78_18);
										} else {
											@Pc(1186) Class283 local1186 = local24.aBoolean299 ? Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1 : null;
											local1176 = Static230.aClass225_1.method4868(local24.anInt4178, local24.anInt4167, local24.anInt4157, local24.anInt4205, Static31.aClass78_18, local1186, local24.anInt4208 | 0xFF000000);
										}
										if (local1176 != null) {
											local256 = local1176.A();
											local506 = local1176.ca();
											local1241 = (local24.anInt4225 == 0 ? 16777215 : local24.anInt4225 & 0xFFFFFF) | 255 - (local103 & 0xFF) << 24;
											if (local24.aBoolean307) {
												Static31.aClass78_18.V(local95, local100, local95 + local24.anInt4182, local100 - -local24.anInt4156);
												if (local24.anInt4207 != 0) {
													local538 = (local256 + local24.anInt4182 - 1) / local256;
													local540 = (local506 + local24.anInt4156 - 1) / local506;
													for (local553 = 0; local553 < local538; local553++) {
														for (local650 = 0; local650 < local540; local650++) {
															if (local24.anInt4225 == 0) {
																local1176.method7797((float) (local95 + local256 * local553) + (float) local256 / 2.0F, (float) (local100 + local506 * local650) + (float) local506 / 2.0F, 4096, local24.anInt4207);
															} else {
																local1176.method7803((float) (local95 + local553 * local256) + (float) local256 / 2.0F, (float) (local650 * local506 + local100) + (float) local506 / 2.0F, 4096, local24.anInt4207, local1241);
															}
														}
													}
												} else if (local24.anInt4225 == 0 && local103 == 0) {
													local1176.method7794(local95, local100, local24.anInt4182, local24.anInt4156);
												} else {
													local1176.DA(local95, local100, local24.anInt4182, local24.anInt4156, 0, local1241, 1);
												}
												Static31.aClass78_18.da(arg2, arg8, arg6, arg7);
											} else if (local24.anInt4225 == 0 && local103 == 0) {
												if (local24.anInt4207 != 0) {
													local1176.method7797((float) local95 + (float) local24.anInt4182 / 2.0F, (float) local100 + (float) local24.anInt4156 / 2.0F, local24.anInt4182 * 4096 / local256, local24.anInt4207);
												} else if (local24.anInt4182 == local256 && local506 == local24.anInt4156) {
													local1176.method7795(local95, local100);
												} else {
													local1176.method7801(local95, local100, local24.anInt4182, local24.anInt4156);
												}
											} else if (local24.anInt4207 != 0) {
												local1176.method7803((float) local95 + (float) local24.anInt4182 / 2.0F, (float) local100 + (float) local24.anInt4156 / 2.0F, local24.anInt4182 * 4096 / local256, local24.anInt4207, local1241);
											} else if (local24.anInt4182 == local256 && local506 == local24.anInt4156) {
												local1176.V(local95, local100, 0, local1241, 1);
											} else {
												local1176.method7804(local95, local100, local24.anInt4182, local24.anInt4156, 0, local1241, 1);
											}
										} else if (Static376.aBoolean120) {
											Static415.method5900(local24);
										}
									} else {
										local24.method3365(Static544.aClass237_1, Static40.aClass164_1).method6205(Static31.aClass78_18, local24.anInt4182, local95, local24.anInt4156, local100, local24.anInt4196 << 3, local24.anInt4158 << 3, 0, 0);
									}
								} else if (local24.anInt4166 == 6) {
									Static202.method3099();
									@Pc(1582) Class52 local1582 = null;
									local256 = 0;
									@Pc(1685) Class197 local1685;
									@Pc(1695) Class283 local1695;
									if (local24.anInt4205 != -1) {
										@Pc(1796) Class222 local1796 = Static230.aClass225_1.method4857(local24.anInt4205);
										if (local1796 != null) {
											local1796 = local1796.method4792(local24.anInt4178);
											local1685 = local24.anInt4143 == -1 ? null : Static223.aClass245_1.method5312(local24.anInt4143);
											local1695 = local24.aBoolean299 ? Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1 : null;
											local1582 = local1796.method4783(local24.anInt4222, local24.anInt4148, local24.anInt4154, local1685, 2048, 1, Static31.aClass78_18, local1695);
											if (local1582 == null) {
												Static415.method5900(local24);
											} else {
												local256 = -local1582.J() >> 1;
											}
										}
									} else if (local24.anInt4172 == 5) {
										local506 = local24.anInt4189;
										if (local506 >= 0 && local506 < 2048) {
											@Pc(1733) Class11_Sub1_Sub1_Sub3_Sub1 local1733 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local506];
											@Pc(1745) Class197 local1745 = local24.anInt4143 == -1 ? null : Static223.aClass245_1.method5312(local24.anInt4143);
											if (local1733 != null && (Static310.anInt5693 == local506 || Static515.method7170(local1733.aString35) == local24.anInt4197)) {
												local1582 = local1733.aClass283_1.method6102(0, Static84.aClass242_1, local24.anInt4154, local24.anInt4222, Static390.aClass353_29, Static223.aClass245_1, null, Static230.aClass225_1, 0, null, 2048, -1, local24.anInt4148, Static423.aClass323_1, local1745, 0, null, Static31.aClass78_18, Static241.aClass340_1);
											}
										}
									} else if (local24.anInt4172 == 8 || local24.anInt4172 == 9) {
										@Pc(1673) Class1_Sub45 local1673 = Static365.method5366(local24.anInt4189, false);
										local1685 = local24.anInt4143 == -1 ? null : Static223.aClass245_1.method5312(local24.anInt4143);
										if (local1673 != null) {
											local1695 = local24.aBoolean299 ? Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1 : null;
											local1582 = local1673.method6771(local24.anInt4154, local24.anInt4222, local24.anInt4148, local1695, local24.anInt4172 == 9, local24.anInt4197, local1685, Static31.aClass78_18);
										}
									} else if (local24.anInt4143 == -1) {
										local1582 = local24.method3366(Static31.aClass78_18, 2048, Static230.aClass225_1, -1, Static241.aClass340_1, Static84.aClass242_1, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1, Static423.aClass323_1, 0, -1, null, Static390.aClass353_29, Static223.aClass245_1);
										if (local1582 == null && Static376.aBoolean120) {
											Static415.method5900(local24);
										}
									} else {
										@Pc(1612) Class197 local1612 = Static223.aClass245_1.method5312(local24.anInt4143);
										local1582 = local24.method3366(Static31.aClass78_18, 2048, Static230.aClass225_1, local24.anInt4148, Static241.aClass340_1, Static84.aClass242_1, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1, Static423.aClass323_1, local24.anInt4222, local24.anInt4154, local1612, Static390.aClass353_29, Static223.aClass245_1);
										if (local1582 == null && Static376.aBoolean120) {
											Static415.method5900(local24);
										}
									}
									if (local1582 != null) {
										if (local24.anInt4150 <= 0) {
											local506 = 512;
										} else {
											local506 = (local24.anInt4182 << 9) / local24.anInt4150;
										}
										if (local24.anInt4227 <= 0) {
											local1241 = 512;
										} else {
											local1241 = (local24.anInt4156 << 9) / local24.anInt4227;
										}
										local538 = local24.anInt4182 / 2 + local95;
										local540 = local100 + local24.anInt4156 / 2;
										if (!local24.aBoolean308) {
											local538 += local506 * local24.anInt4139 >> 9;
											local540 += local1241 * local24.anInt4138 >> 9;
										}
										Static160.aClass34_1.Y();
										Static31.aClass78_18.method6812(Static160.aClass34_1);
										Static31.aClass78_18.la(local538, local540, local506, local1241);
										Static31.aClass78_18.ya();
										if (local24.aBoolean304) {
											Static31.aClass78_18.ZA(false);
										}
										if (local24.aBoolean308) {
											Static586.aClass34_6.oa(local24.anInt4179);
											Static586.aClass34_6.ZA(local24.anInt4214);
											Static586.aClass34_6.AA(local24.anInt4175);
											Static586.aClass34_6.U(local24.anInt4139, local24.anInt4138, local24.anInt4191);
										} else {
											local553 = Class85_Sub8.anIntArray426[local24.anInt4179 << 3] * (local24.anInt4209 << 2) >> 14;
											local650 = (local24.anInt4209 << 2) * Class85_Sub8.anIntArray427[local24.anInt4179 << 3] >> 14;
											Static586.aClass34_6.J(-local24.anInt4175 << 3);
											Static586.aClass34_6.ZA(local24.anInt4214 << 3);
											Static586.aClass34_6.U(local24.anInt4212 << 2, local256 + local553 + (local24.anInt4135 << 2), (local24.anInt4135 << 2) + local650);
											Static586.aClass34_6.w(local24.anInt4179 << 3);
										}
										local24.method3368(local1582, Static31.aClass78_18, Static518.anInt9331, Static586.aClass34_6);
										if (Static556.aBoolean690) {
											Static31.aClass78_18.V(local95, local100, local24.anInt4182 + local95, local24.anInt4156 + local100);
										}
										if (local24.aBoolean308) {
											if (local24.aBoolean293) {
												local1582.method7405(Static586.aClass34_6, null, local24.anInt4209, 1);
											} else {
												local1582.method7413(Static586.aClass34_6, null, 1);
												if (local24.aClass11_Sub9_5 != null) {
													Static31.aClass78_18.method6796(local24.aClass11_Sub9_5.method5345());
												}
											}
										} else if (local24.aBoolean293) {
											local1582.method7405(Static586.aClass34_6, null, local24.anInt4209 << 2, 1);
										} else {
											local1582.method7413(Static586.aClass34_6, null, 1);
											if (local24.aClass11_Sub9_5 != null) {
												Static31.aClass78_18.method6796(local24.aClass11_Sub9_5.method5345());
											}
										}
										if (Static556.aBoolean690) {
											Static31.aClass78_18.da(arg2, arg8, arg6, arg7);
										}
										if (local24.aBoolean304) {
											Static31.aClass78_18.ZA(true);
										}
									}
								} else if (local24.anInt4166 == 9) {
									if (local24.aBoolean302) {
										local256 = local24.anInt4156 + local100;
										local1241 = local100;
										local506 = local95 + local24.anInt4182;
									} else {
										local506 = local95 + local24.anInt4182;
										local256 = local100;
										local1241 = local24.anInt4156 + local100;
									}
									if (local24.anInt4160 == 1) {
										Static31.aClass78_18.method6815(local95, local256, local506, local1241, local24.anInt4225, 0);
									} else {
										Static31.aClass78_18.method6805(local95, local256, local506, local1241, local24.anInt4225, local24.anInt4160);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
