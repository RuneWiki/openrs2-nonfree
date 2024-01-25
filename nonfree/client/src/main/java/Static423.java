import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
	public static int anInt7984;

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "Lclient!sj;")
	public static Class316 aClass316_4 = null;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "Lclient!ks;")
	public static final Class182 aClass182_3 = new Class182(true);

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "Lclient!kn;")
	public static final Class181 aClass181_12 = new Class181(0, 3);

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIB)Z")
	public static boolean method6817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static622.method9059(arg0, arg1)) {
			return Static145.method3218(arg0, arg1) | (arg0 & 0x9000) != 0 | Static554.method8265(arg1, arg0) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | Static588.method8686(arg0, arg1) | Static480.method5982(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)Z")
	public static boolean method6818() throws IOException {
		if (Static272.aClass116_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static138.aClass215_57 == null) {
			if (Static354.aBoolean508) {
				if (!Static272.aClass116_1.method3745(1)) {
					return false;
				}
				Static272.aClass116_1.method3741(1, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
				Static85.anInt2575 = 0;
				Static354.aBoolean508 = false;
				Static18.anInt303++;
			}
			Static627.aClass2_Sub11_Sub2_6.anInt10066 = 0;
			if (Static627.aClass2_Sub11_Sub2_6.method8394()) {
				if (!Static272.aClass116_1.method3745(1)) {
					return false;
				}
				Static272.aClass116_1.method3741(1, 1, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
				Static18.anInt303++;
				Static85.anInt2575 = 0;
			}
			Static354.aBoolean508 = true;
			@Pc(69) Class215[] local69 = Static447.method7045();
			local73 = Static627.aClass2_Sub11_Sub2_6.method8397();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static627.aClass2_Sub11_Sub2_6.anInt10066);
			}
			Static138.aClass215_57 = local69[local73];
			Static541.anInt9723 = Static138.aClass215_57.anInt7115;
		}
		if (Static541.anInt9723 == -1) {
			if (!Static272.aClass116_1.method3745(1)) {
				return false;
			}
			Static272.aClass116_1.method3741(1, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
			Static541.anInt9723 = Static627.aClass2_Sub11_Sub2_6.aByteArray128[0] & 0xFF;
			Static18.anInt303++;
			Static85.anInt2575 = 0;
		}
		if (Static541.anInt9723 == -2) {
			if (!Static272.aClass116_1.method3745(2)) {
				return false;
			}
			Static272.aClass116_1.method3741(2, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
			Static627.aClass2_Sub11_Sub2_6.anInt10066 = 0;
			Static541.anInt9723 = Static627.aClass2_Sub11_Sub2_6.method8326();
			Static18.anInt303 += 2;
			Static85.anInt2575 = 0;
		}
		if (Static541.anInt9723 > 0) {
			if (!Static272.aClass116_1.method3745(Static541.anInt9723)) {
				return false;
			}
			Static627.aClass2_Sub11_Sub2_6.anInt10066 = 0;
			Static272.aClass116_1.method3741(Static541.anInt9723, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
			Static18.anInt303 += Static541.anInt9723;
			Static85.anInt2575 = 0;
		}
		Static106.aClass215_42 = Static527.aClass215_250;
		Static527.aClass215_250 = Static525.aClass215_85;
		Static525.aClass215_85 = Static138.aClass215_57;
		if (Static197.aClass215_90 == Static138.aClass215_57) {
			Static242.method4502(Static627.aClass2_Sub11_Sub2_6.method8373());
			Static138.aClass215_57 = null;
			return true;
		}
		@Pc(233) String local233;
		@Pc(220) int local220;
		@Pc(247) String local247;
		@Pc(261) int local261;
		@Pc(251) String local251;
		@Pc(237) String local237;
		if (Static138.aClass215_57 == Static328.aClass215_129) {
			local220 = Static627.aClass2_Sub11_Sub2_6.method8383();
			@Pc(229) boolean local229 = (local220 & 0x1) == 1;
			local233 = Static627.aClass2_Sub11_Sub2_6.method8373();
			local237 = Static627.aClass2_Sub11_Sub2_6.method8373();
			if (local237.equals("")) {
				local237 = local233;
			}
			local247 = Static627.aClass2_Sub11_Sub2_6.method8373();
			local251 = Static627.aClass2_Sub11_Sub2_6.method8373();
			if (local251.equals("")) {
				local251 = local247;
			}
			if (local229) {
				for (local261 = 0; local261 < Static89.anInt2628; local261++) {
					if (Static370.aStringArray34[local261].equals(local251)) {
						Static251.aStringArray20[local261] = local233;
						Static370.aStringArray34[local261] = local237;
						Static496.aStringArray38[local261] = local247;
						Static331.aStringArray30[local261] = local251;
						break;
					}
				}
			} else {
				Static251.aStringArray20[Static89.anInt2628] = local233;
				Static370.aStringArray34[Static89.anInt2628] = local237;
				Static496.aStringArray38[Static89.anInt2628] = local247;
				Static331.aStringArray30[Static89.anInt2628] = local251;
				Static537.aBooleanArray24[Static89.anInt2628] = (local220 & 0x2) == 2;
				Static89.anInt2628++;
			}
			Static373.anInt7362 = Static7.anInt132;
			Static138.aClass215_57 = null;
			return true;
		} else if (Static138.aClass215_57 == Static464.aClass215_195) {
			Static512.method7834(Static350.aClass181_10);
			Static138.aClass215_57 = null;
			return true;
		} else if (Static134.aClass215_56 == Static138.aClass215_57) {
			@Pc(351) byte local351 = Static627.aClass2_Sub11_Sub2_6.method8384();
			local73 = Static627.aClass2_Sub11_Sub2_6.method8354();
			Static504.method7787();
			Static202.method4066(local73, local351);
			Static138.aClass215_57 = null;
			return true;
		} else {
			@Pc(394) Class2_Sub48 local394;
			if (Static274.aClass215_106 == Static138.aClass215_57) {
				local220 = Static627.aClass2_Sub11_Sub2_6.method8360();
				local73 = Static627.aClass2_Sub11_Sub2_6.method8381();
				Static504.method7787();
				@Pc(387) Class2_Sub48 local387 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local73);
				local394 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local220);
				if (local394 != null) {
					Static133.method3047(local387 == null || local387.anInt10125 != local394.anInt10125, false, local394);
				}
				if (local387 != null) {
					local387.method9253();
					Static372.aClass99_51.method3059((long) local220, local387);
				}
				@Pc(429) Class24 local429 = Static87.method8101(local73);
				if (local429 != null) {
					Static553.method8248(local429);
				}
				local429 = Static87.method8101(local220);
				if (local429 != null) {
					Static553.method8248(local429);
					Static553.method8245(true, local429);
				}
				if (Static475.anInt10143 != -1) {
					Static26.method659(Static475.anInt10143, 1);
				}
				Static138.aClass215_57 = null;
				return true;
			} else if (Static138.aClass215_57 == Static362.aClass215_145) {
				Static282.aString60 = Static541.anInt9723 > 2 ? Static627.aClass2_Sub11_Sub2_6.method8373() : Static588.aClass351_28.method8691(Static476.anInt8915);
				Static10.anInt160 = Static541.anInt9723 <= 0 ? -1 : Static627.aClass2_Sub11_Sub2_6.method8326();
				if (Static10.anInt160 == 65535) {
					Static10.anInt160 = -1;
				}
				Static138.aClass215_57 = null;
				return true;
			} else if (Static527.aClass215_248 == Static138.aClass215_57) {
				local220 = Static627.aClass2_Sub11_Sub2_6.method8389();
				local73 = Static627.aClass2_Sub11_Sub2_6.method8360();
				Static504.method7787();
				Static245.method4531(local220, local73);
				Static138.aClass215_57 = null;
				return true;
			} else {
				@Pc(543) int local543;
				@Pc(539) int local539;
				if (Static138.aClass215_57 == Static213.aClass215_98) {
					local220 = Static627.aClass2_Sub11_Sub2_6.method8342();
					local73 = Static627.aClass2_Sub11_Sub2_6.method8369();
					local539 = Static627.aClass2_Sub11_Sub2_6.method8351();
					local543 = Static627.aClass2_Sub11_Sub2_6.method8369();
					Static504.method7787();
					Static525.method3743(7, local220, local539 << 16 | local543, local73);
					Static138.aClass215_57 = null;
					return true;
				} else if (Static417.aClass215_165 == Static138.aClass215_57) {
					Static376.anInt7386 = Static627.aClass2_Sub11_Sub2_6.method8368();
					Static138.aClass215_57 = null;
					Static62.anInt2039 = Static7.anInt132;
					return true;
				} else if (Static138.aClass215_57 == Static97.aClass215_33) {
					Static512.method7834(Static37.aClass181_2);
					Static138.aClass215_57 = null;
					return true;
				} else if (Static138.aClass215_57 == Static434.aClass215_175) {
					local220 = Static627.aClass2_Sub11_Sub2_6.method8339();
					Static504.method7787();
					Static525.method3743(3, local220, -1, -1);
					Static138.aClass215_57 = null;
					return true;
				} else {
					@Pc(645) int local645;
					@Pc(615) boolean local615;
					@Pc(619) String local619;
					@Pc(631) long local631;
					@Pc(636) long local636;
					@Pc(641) long local641;
					@Pc(655) int local655;
					if (Static138.aClass215_57 == Static215.aClass215_100) {
						local615 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
						local619 = Static627.aClass2_Sub11_Sub2_6.method8373();
						local233 = local619;
						if (local615) {
							local233 = Static627.aClass2_Sub11_Sub2_6.method8373();
						}
						local631 = Static627.aClass2_Sub11_Sub2_6.method8361();
						local636 = Static627.aClass2_Sub11_Sub2_6.method8326();
						local641 = Static627.aClass2_Sub11_Sub2_6.method8347();
						local645 = Static627.aClass2_Sub11_Sub2_6.method8383();
						@Pc(651) long local651 = local641 + (local636 << 32);
						@Pc(653) boolean local653 = false;
						local655 = 0;
						while (true) {
							if (local655 >= 100) {
								if (local645 <= 1) {
									if (Static209.aBoolean352 && !Static381.aBoolean540 || Static180.aBoolean322) {
										local653 = true;
									} else if (Static127.method3003(local233)) {
										local653 = true;
									}
								}
								break;
							}
							if (local651 == Static136.aLongArray6[local655]) {
								local653 = true;
								break;
							}
							local655++;
						}
						if (!local653 && Static548.anInt9815 == 0) {
							Static136.aLongArray6[Static30.anInt645] = local651;
							Static30.anInt645 = (Static30.anInt645 + 1) % 100;
							@Pc(712) String local712 = Static621.method9056(Static629.method9131(Static627.aClass2_Sub11_Sub2_6));
							if (local645 == 2 || local645 == 3) {
								Static550.method8230("<img=1>" + local233, local712, -1, "<img=1>" + local619, Static506.method7807(local631), 9, 0, local619);
							} else if (local645 == 1) {
								Static550.method8230("<img=0>" + local233, local712, -1, "<img=0>" + local619, Static506.method7807(local631), 9, 0, local619);
							} else {
								Static550.method8230(local233, local712, -1, local619, Static506.method7807(local631), 9, 0, local619);
							}
						}
						Static138.aClass215_57 = null;
						return true;
					} else if (Static138.aClass215_57 == Static619.aClass215_247) {
						local220 = Static627.aClass2_Sub11_Sub2_6.method8369();
						Static504.method7787();
						Static394.method6488(local220);
						Static138.aClass215_57 = null;
						return true;
					} else if (Static138.aClass215_57 == Static512.aClass215_207) {
						Static512.method7834(Static238.aClass181_6);
						Static138.aClass215_57 = null;
						return true;
					} else {
						@Pc(845) int local845;
						if (Static138.aClass215_57 == Static298.aClass215_122) {
							local220 = Static627.aClass2_Sub11_Sub2_6.method8389();
							local73 = Static627.aClass2_Sub11_Sub2_6.method8325();
							local539 = Static627.aClass2_Sub11_Sub2_6.method8351();
							local543 = Static627.aClass2_Sub11_Sub2_6.method8338();
							local845 = Static627.aClass2_Sub11_Sub2_6.method8325();
							Static504.method7787();
							Static446.aBooleanArray21[local73] = true;
							Static590.anIntArray672[local73] = local220;
							Static561.anIntArray651[local73] = local543;
							Static113.anIntArray152[local73] = local845;
							Static579.anIntArray664[local73] = local539;
							Static138.aClass215_57 = null;
							return true;
						} else if (Static138.aClass215_57 == Static90.aClass215_32) {
							Static298.anInt6266 = Static627.aClass2_Sub11_Sub2_6.method8357() << 3;
							Static27.anInt575 = Static627.aClass2_Sub11_Sub2_6.method8389();
							Static594.anInt10471 = Static627.aClass2_Sub11_Sub2_6.method8337() << 3;
							Static138.aClass215_57 = null;
							return true;
						} else if (Static138.aClass215_57 == Static212.aClass215_96) {
							Static32.method771();
							Static138.aClass215_57 = null;
							return false;
						} else if (Static121.aClass215_212 == Static138.aClass215_57) {
							local220 = Static627.aClass2_Sub11_Sub2_6.method8389();
							Static504.method7787();
							Static235.anInt5132 = local220;
							Static138.aClass215_57 = null;
							return true;
						} else if (Static410.aClass215_159 == Static138.aClass215_57) {
							Static512.method7834(Static174.aClass181_5);
							Static138.aClass215_57 = null;
							return true;
						} else if (Static138.aClass215_57 == Static556.aClass215_226) {
							local220 = Static627.aClass2_Sub11_Sub2_6.method8354();
							local73 = Static627.aClass2_Sub11_Sub2_6.method8351();
							Static504.method7787();
							Static3.method8620(local220, local73);
							Static138.aClass215_57 = null;
							return true;
						} else if (Static8.aClass215_3 == Static138.aClass215_57) {
							local220 = Static627.aClass2_Sub11_Sub2_6.method8369();
							if (local220 == 65535) {
								local220 = -1;
							}
							local73 = Static627.aClass2_Sub11_Sub2_6.method8342();
							local539 = Static627.aClass2_Sub11_Sub2_6.method8381();
							Static504.method7787();
							Static289.method5238(local539, local220, local73);
							@Pc(986) Class301 local986 = Static635.aClass336_2.method8424(local220);
							Static370.method6239(local986.anInt9223, local986.anInt9191, local986.anInt9187, local73);
							Static232.method4417(local986.anInt9185, local986.anInt9224, local73, local986.anInt9211);
							Static138.aClass215_57 = null;
							return true;
						} else {
							@Pc(1046) int local1046;
							@Pc(1030) boolean local1030;
							if (Static381.aClass215_152 == Static138.aClass215_57) {
								local220 = Static627.aClass2_Sub11_Sub2_6.method8326();
								local73 = Static627.aClass2_Sub11_Sub2_6.method8383();
								local1030 = (local73 & 0x1) == 1;
								Static457.method7120(local220, local1030);
								local543 = Static627.aClass2_Sub11_Sub2_6.method8326();
								for (local845 = 0; local845 < local543; local845++) {
									local1046 = Static627.aClass2_Sub11_Sub2_6.method8389();
									if (local1046 == 255) {
										local1046 = Static627.aClass2_Sub11_Sub2_6.method8339();
									}
									local261 = Static627.aClass2_Sub11_Sub2_6.method8351();
									Static599.method8794(local220, local1030, local845, local1046, local261 - 1);
								}
								Static478.anIntArray575[Static349.anInt6960++ & 0x1F] = local220;
								Static138.aClass215_57 = null;
								return true;
							} else if (Static138.aClass215_57 == Static622.aClass215_254) {
								Static68.method2104(false);
								Static138.aClass215_57 = null;
								return false;
							} else if (Static138.aClass215_57 == Static624.aClass215_255) {
								local220 = Static627.aClass2_Sub11_Sub2_6.method8342();
								local73 = Static627.aClass2_Sub11_Sub2_6.method8351();
								Static286.aClass263_3.method6862(local220, local73);
								Static138.aClass215_57 = null;
								return true;
							} else {
								@Pc(1184) int local1184;
								@Pc(1778) int local1778;
								@Pc(1205) boolean local1205;
								@Pc(1213) int local1213;
								@Pc(1572) int local1572;
								@Pc(1152) boolean local1152;
								@Pc(1162) int local1162;
								@Pc(1489) boolean local1489;
								@Pc(1497) int local1497;
								if (Static138.aClass215_57 == Static592.aClass215_239) {
									local220 = Static627.aClass2_Sub11_Sub2_6.method8338();
									local73 = Static627.aClass2_Sub11_Sub2_6.method8351();
									local539 = Static627.aClass2_Sub11_Sub2_6.method8351();
									local543 = Static627.aClass2_Sub11_Sub2_6.method8326();
									local845 = Static627.aClass2_Sub11_Sub2_6.method8339();
									local1152 = (local220 & 0x80) != 0;
									local261 = local220 & 0x7;
									local1162 = local220 >> 3 & 0xF;
									if (local1162 == 15) {
										local1162 = -1;
									}
									if (local845 >> 30 == 0) {
										@Pc(1296) Class130 local1296;
										@Pc(1233) Class109 local1233;
										@Pc(1247) Class130 local1247;
										if (local845 >> 29 != 0) {
											local1184 = local845 & 0xFFFF;
											@Pc(1191) Class2_Sub33 local1191 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local1184);
											if (local1191 != null) {
												@Pc(1196) Class3_Sub1_Sub3_Sub3_Sub1 local1196 = local1191.aClass3_Sub1_Sub3_Sub3_Sub1_2;
												if (local539 == 65535) {
													local539 = -1;
												}
												local1205 = true;
												local1213 = local1152 ? local1196.anInt6084 : local1196.anInt6065;
												if (local539 != -1 && local1213 != -1) {
													if (local539 == local1213) {
														local1233 = Static459.aClass62_2.method2250(local539);
														if (local1233.aBoolean296 && local1233.anInt3971 != -1) {
															local1247 = Static195.aClass193_1.method5573(local1233.anInt3971);
															@Pc(1250) int local1250 = local1247.anInt4705;
															if (local1250 == 0 || local1250 == 2) {
																local1205 = false;
															} else if (local1250 == 1) {
																local1205 = true;
															}
														}
													} else {
														local1233 = Static459.aClass62_2.method2250(local539);
														@Pc(1281) Class109 local1281 = Static459.aClass62_2.method2250(local1213);
														if (local1233.anInt3971 != -1 && local1281.anInt3971 != -1) {
															local1296 = Static195.aClass193_1.method5573(local1233.anInt3971);
															@Pc(1302) Class130 local1302 = Static195.aClass193_1.method5573(local1281.anInt3971);
															if (local1296.anInt4699 < local1302.anInt4699) {
																local1205 = false;
															}
														}
													}
												}
												if (local1205) {
													if (local1152) {
														local1196.anInt6024 = local543 + Static407.anInt7704;
														local1196.anInt6057 = local73;
														local1196.anInt6084 = local539;
														local1196.anInt6082 = local1162;
														local1196.anInt6018 = local261;
														local1196.anInt6068 = 0;
														local1196.anInt6071 = 1;
														local1196.anInt6031 = 0;
														if (local1196.anInt6024 > Static407.anInt7704) {
															local1196.anInt6031 = -1;
														}
														if (local1196.anInt6084 != -1 && Static407.anInt7704 == local1196.anInt6024) {
															local655 = Static459.aClass62_2.method2250(local1196.anInt6084).anInt3971;
															if (local655 != -1) {
																local1247 = Static195.aClass193_1.method5573(local655);
																if (local1247 != null && local1247.anIntArray237 != null && !local1196.aBoolean454) {
																	Static609.method8918(local1196, 0, local1247);
																}
															}
														}
													} else {
														local1196.anInt6045 = 0;
														local1196.lb = local73;
														local1196.anInt6065 = local539;
														local1196.anInt6043 = 0;
														local1196.anInt6073 = local1162;
														local1196.anInt6032 = Static407.anInt7704 + local543;
														local1196.anInt6041 = local261;
														local1196.anInt6077 = 1;
														if (local1196.anInt6032 > Static407.anInt7704) {
															local1196.anInt6043 = -1;
														}
														if (local1196.anInt6065 != -1 && local1196.anInt6032 == Static407.anInt7704) {
															local655 = Static459.aClass62_2.method2250(local1196.anInt6065).anInt3971;
															if (local655 != -1) {
																local1247 = Static195.aClass193_1.method5573(local655);
																if (local1247 != null && local1247.anIntArray237 != null && !local1196.aBoolean454) {
																	Static609.method8918(local1196, 0, local1247);
																}
															}
														}
													}
												}
											}
										} else if (local845 >> 28 != 0) {
											local1184 = local845 & 0xFFFF;
											@Pc(1476) Class3_Sub1_Sub3_Sub3_Sub2 local1476;
											if (Static569.anInt10211 == local1184) {
												local1476 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2;
											} else {
												local1476 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local1184];
											}
											if (local1476 != null) {
												if (local539 == 65535) {
													local539 = -1;
												}
												local1489 = true;
												local1497 = local1152 ? local1476.anInt6084 : local1476.anInt6065;
												@Pc(1569) Class130 local1569;
												if (local539 != -1 && local1497 != -1) {
													@Pc(1516) Class109 local1516;
													if (local1497 == local539) {
														local1516 = Static459.aClass62_2.method2250(local539);
														if (local1516.aBoolean296 && local1516.anInt3971 != -1) {
															local1569 = Static195.aClass193_1.method5573(local1516.anInt3971);
															local1572 = local1569.anInt4705;
															if (local1572 == 0 || local1572 == 2) {
																local1489 = false;
															} else if (local1572 == 1) {
																local1489 = true;
															}
														}
													} else {
														local1516 = Static459.aClass62_2.method2250(local539);
														local1233 = Static459.aClass62_2.method2250(local1497);
														if (local1516.anInt3971 != -1 && local1233.anInt3971 != -1) {
															local1247 = Static195.aClass193_1.method5573(local1516.anInt3971);
															local1296 = Static195.aClass193_1.method5573(local1233.anInt3971);
															if (local1247.anInt4699 < local1296.anInt4699) {
																local1489 = false;
															}
														}
													}
												}
												if (local1489) {
													if (local1152) {
														local1476.anInt6031 = 0;
														local1476.anInt6057 = local73;
														local1476.anInt6082 = local1162;
														local1476.anInt6068 = 0;
														local1476.anInt6071 = 1;
														local1476.anInt6084 = local539;
														local1476.anInt6024 = local543 + Static407.anInt7704;
														local1476.anInt6018 = local261;
														if (local1476.anInt6024 > Static407.anInt7704) {
															local1476.anInt6031 = -1;
														}
														if (local1476.anInt6084 == 65535) {
															local1476.anInt6084 = -1;
														}
														if (local1476.anInt6084 != -1 && Static407.anInt7704 == local1476.anInt6024) {
															local1213 = Static459.aClass62_2.method2250(local1476.anInt6084).anInt3971;
															if (local1213 != -1) {
																local1569 = Static195.aClass193_1.method5573(local1213);
																if (local1569 != null && local1569.anIntArray237 != null && !local1476.aBoolean454) {
																	Static609.method8918(local1476, 0, local1569);
																}
															}
														}
													} else {
														local1476.anInt6065 = local539;
														local1476.anInt6045 = 0;
														local1476.lb = local73;
														local1476.anInt6043 = 0;
														local1476.anInt6073 = local1162;
														local1476.anInt6041 = local261;
														local1476.anInt6077 = 1;
														local1476.anInt6032 = local543 + Static407.anInt7704;
														if (local1476.anInt6065 == 65535) {
															local1476.anInt6065 = -1;
														}
														if (Static407.anInt7704 < local1476.anInt6032) {
															local1476.anInt6043 = -1;
														}
														if (local1476.anInt6065 != -1 && Static407.anInt7704 == local1476.anInt6032) {
															local1213 = Static459.aClass62_2.method2250(local1476.anInt6065).anInt3971;
															if (local1213 != -1) {
																local1569 = Static195.aClass193_1.method5573(local1213);
																if (local1569 != null && local1569.anIntArray237 != null && !local1476.aBoolean454) {
																	Static609.method8918(local1476, 0, local1569);
																}
															}
														}
													}
												}
											}
										}
									} else {
										local1184 = local845 >> 28 & 0x3;
										local645 = (local845 >> 14 & 0x3FFF) - Static84.anInt2565;
										local1778 = (local845 & 0x3FFF) - Static32.anInt723;
										if (local645 >= 0 && local1778 >= 0 && Static47.anInt1794 > local645 && Static209.anInt4742 > local1778) {
											local1497 = local645 * 512 + 256;
											local1213 = local1778 * 512 + 256;
											local655 = local1184;
											if (local1184 < 3 && Static30.method735(local1778, local645)) {
												local655 = local1184 + 1;
											}
											@Pc(1843) Class3_Sub1_Sub3_Sub4 local1843 = new Class3_Sub1_Sub3_Sub4(local539, local543, Static407.anInt7704, local1184, local655, local1497, Static590.method8716(local1497, local1184, local1213) - local73, local1213, local645, local645, local1778, local1778, local261);
											Static563.aClass341_65.method8528(new Class2_Sub6_Sub17(local1843));
										}
									}
									Static138.aClass215_57 = null;
									return true;
								} else if (Static138.aClass215_57 == Static278.aClass215_108) {
									local220 = Static627.aClass2_Sub11_Sub2_6.method8354();
									local619 = Static627.aClass2_Sub11_Sub2_6.method8373();
									Static504.method7787();
									Static41.method1585(local619, local220);
									Static138.aClass215_57 = null;
									return true;
								} else if (Static138.aClass215_57 == Static301.aClass215_124) {
									Static20.anInt389 = Static627.aClass2_Sub11_Sub2_6.method8365();
									Static209.aBoolean352 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
									Static138.aClass215_57 = null;
									return true;
								} else {
									@Pc(2017) Class132 local2017;
									@Pc(2013) String local2013;
									@Pc(1903) String local1903;
									if (Static129.aClass215_53 == Static138.aClass215_57) {
										local1903 = Static627.aClass2_Sub11_Sub2_6.method8373();
										local1030 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
										if (local1030) {
											local619 = Static627.aClass2_Sub11_Sub2_6.method8373();
										} else {
											local619 = local1903;
										}
										local543 = Static627.aClass2_Sub11_Sub2_6.method8326();
										@Pc(1930) byte local1930 = Static627.aClass2_Sub11_Sub2_6.method8384();
										local1152 = false;
										if (local1930 == -128) {
											local1152 = true;
										}
										if (local1152) {
											if (Static235.anInt5133 == 0) {
												Static138.aClass215_57 = null;
												return true;
											}
											for (local261 = 0; Static235.anInt5133 > local261 && (!Static427.aClass132Array1[local261].aString43.equals(local619) || local543 != Static427.aClass132Array1[local261].anInt4830); local261++) {
											}
											if (local261 < Static235.anInt5133) {
												while (local261 < Static235.anInt5133 - 1) {
													Static427.aClass132Array1[local261] = Static427.aClass132Array1[local261 + 1];
													local261++;
												}
												Static235.anInt5133--;
												Static427.aClass132Array1[Static235.anInt5133] = null;
											}
										} else {
											local2013 = Static627.aClass2_Sub11_Sub2_6.method8373();
											local2017 = new Class132();
											local2017.aString43 = local619;
											local2017.aString46 = local1903;
											local2017.aString44 = Static31.method765(local2017.aString43);
											local2017.aString45 = local2013;
											local2017.anInt4830 = local543;
											local2017.aByte80 = local1930;
											for (local1184 = Static235.anInt5133 - 1; local1184 >= 0; local1184--) {
												local645 = Static427.aClass132Array1[local1184].aString44.compareTo(local2017.aString44);
												if (local645 == 0) {
													Static427.aClass132Array1[local1184].anInt4830 = local543;
													Static427.aClass132Array1[local1184].aByte80 = local1930;
													Static427.aClass132Array1[local1184].aString45 = local2013;
													if (local619.equals(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString64)) {
														Static86.aByte29 = local1930;
													}
													Static518.anInt9446 = Static7.anInt132;
													Static138.aClass215_57 = null;
													return true;
												}
												if (local645 < 0) {
													break;
												}
											}
											if (Static427.aClass132Array1.length <= Static235.anInt5133) {
												Static138.aClass215_57 = null;
												return true;
											}
											for (local645 = Static235.anInt5133 - 1; local645 > local1184; local645--) {
												Static427.aClass132Array1[local645 + 1] = Static427.aClass132Array1[local645];
											}
											if (Static235.anInt5133 == 0) {
												Static427.aClass132Array1 = new Class132[100];
											}
											Static427.aClass132Array1[local1184 + 1] = local2017;
											Static235.anInt5133++;
											if (local619.equals(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString64)) {
												Static86.aByte29 = local1930;
											}
										}
										Static518.anInt9446 = Static7.anInt132;
										Static138.aClass215_57 = null;
										return true;
									} else if (Static416.aClass215_163 == Static138.aClass215_57) {
										local220 = Static627.aClass2_Sub11_Sub2_6.method8383();
										local73 = local220 >> 5;
										local539 = local220 & 0x1F;
										if (local539 == 0) {
											Static351.aClass373Array1[local73] = null;
											Static138.aClass215_57 = null;
											return true;
										}
										@Pc(2182) Class373 local2182 = new Class373();
										local2182.anInt11021 = local539;
										local2182.anInt11012 = Static627.aClass2_Sub11_Sub2_6.method8383();
										if (local2182.anInt11012 >= 0 && local2182.anInt11012 < Static352.aClass46Array11.length) {
											if (local2182.anInt11021 == 1 || local2182.anInt11021 == 10) {
												local2182.anInt11014 = Static627.aClass2_Sub11_Sub2_6.method8326();
												Static627.aClass2_Sub11_Sub2_6.anInt10066 += 6;
											} else if (local2182.anInt11021 >= 2 && local2182.anInt11021 <= 6) {
												if (local2182.anInt11021 == 2) {
													local2182.anInt11013 = 256;
													local2182.anInt11016 = 256;
												}
												if (local2182.anInt11021 == 3) {
													local2182.anInt11016 = 0;
													local2182.anInt11013 = 256;
												}
												if (local2182.anInt11021 == 4) {
													local2182.anInt11016 = 512;
													local2182.anInt11013 = 256;
												}
												if (local2182.anInt11021 == 5) {
													local2182.anInt11016 = 256;
													local2182.anInt11013 = 0;
												}
												if (local2182.anInt11021 == 6) {
													local2182.anInt11016 = 256;
													local2182.anInt11013 = 512;
												}
												local2182.anInt11021 = 2;
												local2182.anInt11019 = Static627.aClass2_Sub11_Sub2_6.method8383();
												local2182.anInt11016 += Static627.aClass2_Sub11_Sub2_6.method8326() - Static84.anInt2565 << 9;
												local2182.anInt11013 += Static627.aClass2_Sub11_Sub2_6.method8326() - Static32.anInt723 << 9;
												local2182.anInt11020 = Static627.aClass2_Sub11_Sub2_6.method8383() << 2;
												local2182.anInt11018 = Static627.aClass2_Sub11_Sub2_6.method8326();
											}
											local2182.anInt11015 = Static627.aClass2_Sub11_Sub2_6.method8326();
											if (local2182.anInt11015 == 65535) {
												local2182.anInt11015 = -1;
											}
											Static351.aClass373Array1[local73] = local2182;
										}
										Static138.aClass215_57 = null;
										return true;
									} else if (Static433.aClass215_174 == Static138.aClass215_57) {
										Static68.method2104(Static5.aBoolean7);
										Static138.aClass215_57 = null;
										return false;
									} else if (Static47.aClass215_16 == Static138.aClass215_57) {
										Static37.method864(Static627.aClass2_Sub11_Sub2_6, Static541.anInt9723);
										Static138.aClass215_57 = null;
										return true;
									} else if (Static138.aClass215_57 == Static145.aClass215_62) {
										local220 = Static627.aClass2_Sub11_Sub2_6.method8351();
										local73 = Static627.aClass2_Sub11_Sub2_6.method8360();
										Static504.method7787();
										Static325.method5604(local220, local73);
										Static138.aClass215_57 = null;
										return true;
									} else if (Static573.aClass215_232 == Static138.aClass215_57) {
										Static512.method7834(Static528.aClass181_14);
										Static138.aClass215_57 = null;
										return true;
									} else if (Static138.aClass215_57 == Static47.aClass215_17) {
										local220 = Static627.aClass2_Sub11_Sub2_6.method8381();
										local73 = Static627.aClass2_Sub11_Sub2_6.method8354();
										local539 = Static627.aClass2_Sub11_Sub2_6.method8351();
										Static504.method7787();
										Static495.method7670(local220, local73 + (local539 << 16));
										Static138.aClass215_57 = null;
										return true;
									} else if (Static138.aClass215_57 == Static147.aClass215_63) {
										Static286.aClass263_3.method6863();
										Static609.anInt10690 += 32;
										Static138.aClass215_57 = null;
										return true;
									} else if (Static138.aClass215_57 == Static637.aClass215_258) {
										local220 = Static627.aClass2_Sub11_Sub2_6.method8342();
										Static504.method7787();
										Static525.method3743(5, local220, Static569.anInt10211, 0);
										Static138.aClass215_57 = null;
										return true;
									} else if (Static598.aClass215_241 == Static138.aClass215_57) {
										local220 = Static627.aClass2_Sub11_Sub2_6.method8351();
										Static504.method7787();
										Static415.method6712(local220);
										Static138.aClass215_57 = null;
										return true;
									} else {
										@Pc(2518) boolean local2518;
										if (Static327.aClass215_128 == Static138.aClass215_57) {
											local615 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
											local619 = Static627.aClass2_Sub11_Sub2_6.method8373();
											local233 = local619;
											if (local615) {
												local233 = Static627.aClass2_Sub11_Sub2_6.method8373();
											}
											local543 = Static627.aClass2_Sub11_Sub2_6.method8383();
											local2518 = false;
											if (local543 <= 1) {
												if (Static209.aBoolean352 && !Static381.aBoolean540 || Static180.aBoolean322) {
													local2518 = true;
												} else if (local543 <= 1 && Static127.method3003(local233)) {
													local2518 = true;
												}
											}
											if (!local2518 && Static548.anInt9815 == 0) {
												local251 = Static621.method9056(Static629.method9131(Static627.aClass2_Sub11_Sub2_6));
												if (local543 == 2) {
													Static550.method8230("<img=1>" + local233, local251, -1, "<img=1>" + local619, null, 24, 0, local619);
												} else if (local543 == 1) {
													Static550.method8230("<img=0>" + local233, local251, -1, "<img=0>" + local619, null, 24, 0, local619);
												} else {
													Static550.method8230(local233, local251, -1, local619, null, 24, 0, local619);
												}
											}
											Static138.aClass215_57 = null;
											return true;
										} else if (Static205.aClass215_92 == Static138.aClass215_57) {
											Static512.method7834(Static19.aClass181_1);
											Static138.aClass215_57 = null;
											return true;
										} else if (Static138.aClass215_57 == Static200.aClass215_91) {
											local220 = Static627.aClass2_Sub11_Sub2_6.method8338();
											local73 = Static627.aClass2_Sub11_Sub2_6.method8338();
											local539 = Static627.aClass2_Sub11_Sub2_6.method8325();
											local543 = Static627.aClass2_Sub11_Sub2_6.method8325();
											local845 = Static627.aClass2_Sub11_Sub2_6.method8351() << 2;
											Static504.method7787();
											Static164.method3543(local73, local539, true, local845, local543, local220);
											Static138.aClass215_57 = null;
											return true;
										} else if (Static138.aClass215_57 == Static357.aClass215_144) {
											local1903 = Static627.aClass2_Sub11_Sub2_6.method8373();
											@Pc(2694) Object[] local2694 = new Object[local1903.length() + 1];
											for (local539 = local1903.length() - 1; local539 >= 0; local539--) {
												if (local1903.charAt(local539) == 's') {
													local2694[local539 + 1] = Static627.aClass2_Sub11_Sub2_6.method8373();
												} else {
													local2694[local539 + 1] = Integer.valueOf(Static627.aClass2_Sub11_Sub2_6.method8381());
												}
											}
											local2694[0] = Integer.valueOf(Static627.aClass2_Sub11_Sub2_6.method8381());
											Static504.method7787();
											@Pc(2746) Class2_Sub44 local2746 = new Class2_Sub44();
											local2746.anObjectArray32 = local2694;
											Static284.method5153(local2746);
											Static138.aClass215_57 = null;
											return true;
										} else if (Static620.aClass215_251 == Static138.aClass215_57) {
											Static504.method7787();
											Static167.method3600();
											Static138.aClass215_57 = null;
											return true;
										} else if (Static138.aClass215_57 == Static562.aClass215_229) {
											local220 = Static627.aClass2_Sub11_Sub2_6.method8360();
											local73 = Static627.aClass2_Sub11_Sub2_6.method8351();
											if (local73 == 65535) {
												local73 = -1;
											}
											Static504.method7787();
											Static525.method3743(2, local220, local73, -1);
											Static138.aClass215_57 = null;
											return true;
										} else if (Static138.aClass215_57 == Static573.aClass215_231) {
											local220 = Static627.aClass2_Sub11_Sub2_6.method8381();
											Static504.method7787();
											@Pc(2815) Class2_Sub48 local2815 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local220);
											if (local2815 != null) {
												Static133.method3047(true, false, local2815);
											}
											if (Static249.aClass24_10 != null) {
												Static553.method8248(Static249.aClass24_10);
												Static249.aClass24_10 = null;
											}
											Static138.aClass215_57 = null;
											return true;
										} else if (Static128.aClass215_52 == Static138.aClass215_57) {
											local220 = Static627.aClass2_Sub11_Sub2_6.method8351();
											local73 = Static627.aClass2_Sub11_Sub2_6.method8342();
											Static504.method7787();
											Static25.method8262(local73, local220);
											Static138.aClass215_57 = null;
											return true;
										} else if (Static69.aClass215_25 == Static138.aClass215_57) {
											Static512.method7834(aClass181_12);
											Static138.aClass215_57 = null;
											return true;
										} else if (Static138.aClass215_57 == Static516.aClass215_208) {
											local220 = Static627.aClass2_Sub11_Sub2_6.method8381();
											Static374.aClass240_10 = Static268.aClass370_3.method9067(local220);
											Static138.aClass215_57 = null;
											return true;
										} else if (Static138.aClass215_57 == Static379.aClass215_150) {
											local220 = Static627.aClass2_Sub11_Sub2_6.method8326();
											@Pc(2895) Class3_Sub1_Sub3_Sub3_Sub2 local2895;
											if (local220 == Static569.anInt10211) {
												local2895 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2;
											} else {
												local2895 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local220];
											}
											if (local2895 == null) {
												Static138.aClass215_57 = null;
												return true;
											}
											local539 = Static627.aClass2_Sub11_Sub2_6.method8326();
											local543 = Static627.aClass2_Sub11_Sub2_6.method8383();
											local2518 = (local539 & 0x8000) != 0;
											if (local2895.aString64 != null && local2895.aClass249_1 != null) {
												local1152 = false;
												if (local543 <= 1) {
													if (!local2518 && (Static209.aBoolean352 && !Static381.aBoolean540 || Static180.aBoolean322)) {
														local1152 = true;
													} else if (Static127.method3003(local2895.aString64)) {
														local1152 = true;
													}
												}
												if (!local1152 && Static548.anInt9815 == 0) {
													local1162 = -1;
													if (local2518) {
														local539 &= 0x7FFF;
														@Pc(2978) Class154 local2978 = Static255.method4692(Static627.aClass2_Sub11_Sub2_6);
														local1162 = local2978.anInt5253;
														local2013 = local2978.aClass2_Sub6_Sub19_1.method8042(Static627.aClass2_Sub11_Sub2_6);
													} else {
														local2013 = Static621.method9056(Static629.method9131(Static627.aClass2_Sub11_Sub2_6));
													}
													local2895.aString62 = local2013.trim();
													local2895.anInt6017 = local539 >> 8;
													local2895.anInt6039 = local539 & 0xFF;
													local2895.anInt6061 = 150;
													if (local543 == 1 || local543 == 2) {
														local1184 = local2518 ? 17 : 1;
													} else {
														local1184 = local2518 ? 17 : 2;
													}
													if (local543 == 2) {
														Static550.method8230("<img=1>" + local2895.method5220(), local2013, local1162, "<img=1>" + local2895.method5226(), null, local1184, 0, local2895.aString63);
													} else if (local543 == 1) {
														Static550.method8230("<img=0>" + local2895.method5220(), local2013, local1162, "<img=0>" + local2895.method5226(), null, local1184, 0, local2895.aString63);
													} else {
														Static550.method8230(local2895.method5220(), local2013, local1162, local2895.method5226(), null, local1184, 0, local2895.aString63);
													}
												}
											}
											Static138.aClass215_57 = null;
											return true;
										} else if (Static278.aClass215_109 == Static138.aClass215_57) {
											local615 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
											local619 = Static627.aClass2_Sub11_Sub2_6.method8373();
											local233 = local619;
											if (local615) {
												local233 = Static627.aClass2_Sub11_Sub2_6.method8373();
											}
											local631 = Static627.aClass2_Sub11_Sub2_6.method8326();
											local636 = Static627.aClass2_Sub11_Sub2_6.method8347();
											local1162 = Static627.aClass2_Sub11_Sub2_6.method8383();
											@Pc(3166) long local3166 = (local631 << 32) + local636;
											local1489 = false;
											local1497 = 0;
											while (true) {
												if (local1497 >= 100) {
													if (local1162 <= 1) {
														if (Static209.aBoolean352 && !Static381.aBoolean540 || Static180.aBoolean322) {
															local1489 = true;
														} else if (Static127.method3003(local233)) {
															local1489 = true;
														}
													}
													break;
												}
												if (Static136.aLongArray6[local1497] == local3166) {
													local1489 = true;
													break;
												}
												local1497++;
											}
											if (!local1489 && Static548.anInt9815 == 0) {
												Static136.aLongArray6[Static30.anInt645] = local3166;
												Static30.anInt645 = (Static30.anInt645 + 1) % 100;
												@Pc(3231) String local3231 = Static621.method9056(Static629.method9131(Static627.aClass2_Sub11_Sub2_6));
												if (local1162 == 2) {
													Static550.method8230("<img=1>" + local233, local3231, -1, "<img=1>" + local619, null, 7, 0, local619);
												} else if (local1162 == 1) {
													Static550.method8230("<img=0>" + local233, local3231, -1, "<img=0>" + local619, null, 7, 0, local619);
												} else {
													Static550.method8230(local233, local3231, -1, local619, null, 3, 0, local619);
												}
											}
											Static138.aClass215_57 = null;
											return true;
										} else if (Static461.aClass215_168 == Static138.aClass215_57) {
											if (Static475.anInt10143 != -1) {
												Static26.method659(Static475.anInt10143, 0);
											}
											Static138.aClass215_57 = null;
											return true;
										} else if (Static50.aClass215_21 == Static138.aClass215_57) {
											local220 = Static627.aClass2_Sub11_Sub2_6.method8383();
											local73 = Static627.aClass2_Sub11_Sub2_6.method8338();
											local539 = Static627.aClass2_Sub11_Sub2_6.method8383();
											local543 = Static627.aClass2_Sub11_Sub2_6.method8369() << 2;
											local845 = Static627.aClass2_Sub11_Sub2_6.method8325();
											Static504.method7787();
											Static89.method2480(local73, local220, local543, local845, local539);
											Static138.aClass215_57 = null;
											return true;
										} else if (Static138.aClass215_57 == Static633.aClass215_256) {
											Static138.aClass215_57 = null;
											return false;
										} else if (Static580.aClass215_234 == Static138.aClass215_57) {
											Static356.method5899(Static541.anInt9723, Static627.aClass2_Sub11_Sub2_6, Static268.aClass370_3);
											Static138.aClass215_57 = null;
											return true;
										} else if (Static462.aClass215_194 == Static138.aClass215_57) {
											local615 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
											@Pc(3394) byte[] local3394 = new byte[Static541.anInt9723 - 1];
											Static627.aClass2_Sub11_Sub2_6.method8385(0, Static541.anInt9723 - 1, local3394);
											Static453.method7109(local615, local3394);
											Static138.aClass215_57 = null;
											return true;
										} else {
											@Pc(3421) byte local3421;
											if (Static138.aClass215_57 == Static560.aClass215_227) {
												local220 = Static627.aClass2_Sub11_Sub2_6.method8383();
												local3421 = Static627.aClass2_Sub11_Sub2_6.method8337();
												Static504.method7787();
												Static96.method2564(local3421, local220);
												Static138.aClass215_57 = null;
												return true;
											} else if (Static561.aClass215_228 == Static138.aClass215_57) {
												Static594.anInt10471 = Static627.aClass2_Sub11_Sub2_6.method8357() << 3;
												Static27.anInt575 = Static627.aClass2_Sub11_Sub2_6.method8338();
												Static298.anInt6266 = Static627.aClass2_Sub11_Sub2_6.method8341() << 3;
												while (Static541.anInt9723 > Static627.aClass2_Sub11_Sub2_6.anInt10066) {
													@Pc(3460) Class181 local3460 = Static561.method8413()[Static627.aClass2_Sub11_Sub2_6.method8383()];
													Static512.method7834(local3460);
												}
												Static138.aClass215_57 = null;
												return true;
											} else if (Static583.aClass215_235 == Static138.aClass215_57) {
												local220 = Static627.aClass2_Sub11_Sub2_6.method8368();
												local73 = Static627.aClass2_Sub11_Sub2_6.method8381();
												local539 = Static627.aClass2_Sub11_Sub2_6.method8371();
												Static504.method7787();
												Static368.method6234(local539, local220, local73);
												Static138.aClass215_57 = null;
												return true;
											} else if (Static444.aClass215_190 == Static138.aClass215_57) {
												local1903 = Static627.aClass2_Sub11_Sub2_6.method8373();
												local73 = Static627.aClass2_Sub11_Sub2_6.method8351();
												Static504.method7787();
												Static41.method1585(local1903, local73);
												Static138.aClass215_57 = null;
												return true;
											} else if (Static138.aClass215_57 == Static442.aClass215_189) {
												local220 = Static627.aClass2_Sub11_Sub2_6.method8354();
												local73 = Static627.aClass2_Sub11_Sub2_6.method8381();
												Static504.method7787();
												Static417.method6750(local220, local73);
												Static138.aClass215_57 = null;
												return true;
											} else if (Static425.aClass215_170 == Static138.aClass215_57) {
												local615 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
												local619 = Static627.aClass2_Sub11_Sub2_6.method8373();
												local233 = local619;
												if (local615) {
													local233 = Static627.aClass2_Sub11_Sub2_6.method8373();
												}
												local631 = Static627.aClass2_Sub11_Sub2_6.method8361();
												local636 = Static627.aClass2_Sub11_Sub2_6.method8326();
												local641 = Static627.aClass2_Sub11_Sub2_6.method8347();
												local645 = Static627.aClass2_Sub11_Sub2_6.method8383();
												local1778 = Static627.aClass2_Sub11_Sub2_6.method8326();
												@Pc(3599) long local3599 = (local636 << 32) + local641;
												@Pc(3601) boolean local3601 = false;
												local1572 = 0;
												while (true) {
													if (local1572 >= 100) {
														if (local645 <= 1 && Static127.method3003(local233)) {
															local3601 = true;
														}
														break;
													}
													if (local3599 == Static136.aLongArray6[local1572]) {
														local3601 = true;
														break;
													}
													local1572++;
												}
												if (!local3601 && Static548.anInt9815 == 0) {
													Static136.aLongArray6[Static30.anInt645] = local3599;
													Static30.anInt645 = (Static30.anInt645 + 1) % 100;
													@Pc(3658) String local3658 = Static296.aClass13_1.method226(local1778).method8042(Static627.aClass2_Sub11_Sub2_6);
													if (local645 == 2) {
														Static550.method8230("<img=1>" + local233, local3658, local1778, "<img=1>" + local619, Static506.method7807(local631), 20, 0, local619);
													} else if (local645 == 1) {
														Static550.method8230("<img=0>" + local233, local3658, local1778, "<img=0>" + local619, Static506.method7807(local631), 20, 0, local619);
													} else {
														Static550.method8230(local233, local3658, local1778, local619, Static506.method7807(local631), 20, 0, local619);
													}
												}
												Static138.aClass215_57 = null;
												return true;
											} else if (Static634.aClass215_257 == Static138.aClass215_57) {
												local220 = Static627.aClass2_Sub11_Sub2_6.method8342();
												Static504.method7787();
												if (local220 == -1) {
													Static194.anInt4508 = -1;
													Static442.anInt8212 = -1;
												} else {
													local73 = local220 >> 14 & 0x3FFF;
													local73 -= Static84.anInt2565;
													local539 = local220 & 0x3FFF;
													local539 -= Static32.anInt723;
													if (local73 < 0) {
														local73 = 0;
													} else if (Static47.anInt1794 <= local73) {
														local73 = Static47.anInt1794;
													}
													Static194.anInt4508 = (local73 << 9) + 256;
													if (local539 < 0) {
														local539 = 0;
													} else if (local539 >= Static209.anInt4742) {
														local539 = Static209.anInt4742;
													}
													Static442.anInt8212 = (local539 << 9) + 256;
												}
												Static138.aClass215_57 = null;
												return true;
											} else if (Static138.aClass215_57 == Static472.aClass215_196) {
												local220 = Static627.aClass2_Sub11_Sub2_6.method8389();
												local73 = Static627.aClass2_Sub11_Sub2_6.method8369();
												Static286.aClass263_3.method6865(local73, local220);
												Static138.aClass215_57 = null;
												return true;
											} else if (Static381.aClass215_151 == Static138.aClass215_57) {
												Static512.method7834(Static155.aClass181_4);
												Static138.aClass215_57 = null;
												return true;
											} else if (Static138.aClass215_57 == Static616.aClass215_246) {
												local220 = Static627.aClass2_Sub11_Sub2_6.method8354();
												if (local220 == 65535) {
													local220 = -1;
												}
												local73 = Static627.aClass2_Sub11_Sub2_6.method8389();
												local539 = local73 >> 2;
												local543 = local73 & 0x3;
												local845 = Static234.anIntArray261[local539];
												local1046 = Static627.aClass2_Sub11_Sub2_6.method8342();
												local261 = local1046 >> 28 & 0x3;
												local1162 = local1046 >> 14 & 0x3FFF;
												local1184 = local1046 & 0x3FFF;
												local1162 -= Static84.anInt2565;
												local1184 -= Static32.anInt723;
												Static626.method1458(local1184, local220, local539, local1162, local543, local261, local845);
												Static138.aClass215_57 = null;
												return true;
											} else if (Static138.aClass215_57 == Static50.aClass215_22) {
												local1903 = Static627.aClass2_Sub11_Sub2_6.method8373();
												local73 = Static627.aClass2_Sub11_Sub2_6.method8326();
												local233 = Static296.aClass13_1.method226(local73).method8042(Static627.aClass2_Sub11_Sub2_6);
												Static550.method8230(local1903, local233, local73, local1903, null, 19, 0, local1903);
												Static138.aClass215_57 = null;
												return true;
											} else if (Static138.aClass215_57 == Static461.aClass215_167) {
												Static512.method7834(Static93.aClass181_3);
												Static138.aClass215_57 = null;
												return true;
											} else if (Static482.aClass215_198 == Static138.aClass215_57) {
												for (local220 = 0; local220 < Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1.length; local220++) {
													if (Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local220] != null) {
														Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local220].anIntArray349 = null;
														Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local220].anInt6079 = -1;
													}
												}
												for (local73 = 0; local73 < Static474.anInt8881; local73++) {
													Static62.aClass2_Sub33Array1[local73].aClass3_Sub1_Sub3_Sub3_Sub1_2.anIntArray349 = null;
													Static62.aClass2_Sub33Array1[local73].aClass3_Sub1_Sub3_Sub3_Sub1_2.anInt6079 = -1;
												}
												Static138.aClass215_57 = null;
												return true;
											} else if (Static156.aClass215_71 == Static138.aClass215_57) {
												local220 = Static627.aClass2_Sub11_Sub2_6.method8342();
												local73 = Static627.aClass2_Sub11_Sub2_6.method8326();
												local539 = Static627.aClass2_Sub11_Sub2_6.method8354();
												local543 = Static627.aClass2_Sub11_Sub2_6.method8351();
												Static504.method7787();
												Static370.method6239(local543, local73, local539, local220);
												Static138.aClass215_57 = null;
												return true;
											} else if (Static337.aClass215_131 == Static138.aClass215_57) {
												Static28.aClass313_1 = Static237.method4454(Static627.aClass2_Sub11_Sub2_6.method8383());
												Static138.aClass215_57 = null;
												return true;
											} else if (Static613.aClass215_245 == Static138.aClass215_57) {
												Static512.method7834(Static456.aClass181_8);
												Static138.aClass215_57 = null;
												return true;
											} else if (Static439.aClass215_185 == Static138.aClass215_57) {
												Static89.anInt2628 = Static627.aClass2_Sub11_Sub2_6.method8383();
												for (local220 = 0; local220 < Static89.anInt2628; local220++) {
													Static251.aStringArray20[local220] = Static627.aClass2_Sub11_Sub2_6.method8373();
													Static370.aStringArray34[local220] = Static627.aClass2_Sub11_Sub2_6.method8373();
													if (Static370.aStringArray34[local220].equals("")) {
														Static370.aStringArray34[local220] = Static251.aStringArray20[local220];
													}
													Static496.aStringArray38[local220] = Static627.aClass2_Sub11_Sub2_6.method8373();
													Static331.aStringArray30[local220] = Static627.aClass2_Sub11_Sub2_6.method8373();
													if (Static331.aStringArray30[local220].equals("")) {
														Static331.aStringArray30[local220] = Static496.aStringArray38[local220];
													}
													Static537.aBooleanArray24[local220] = false;
												}
												Static373.anInt7362 = Static7.anInt132;
												Static138.aClass215_57 = null;
												return true;
											} else if (Static138.aClass215_57 == Static424.aClass215_169) {
												local220 = Static627.aClass2_Sub11_Sub2_6.method8354();
												if (local220 == 65535) {
													local220 = -1;
												}
												local619 = Static627.aClass2_Sub11_Sub2_6.method8373();
												local539 = Static627.aClass2_Sub11_Sub2_6.method8338();
												local543 = Static627.aClass2_Sub11_Sub2_6.method8389();
												if (local539 >= 1 && local539 <= 8) {
													if (local619.equalsIgnoreCase("null")) {
														local619 = null;
													}
													Static355.aStringArray32[local539 - 1] = local619;
													Static599.anIntArray680[local539 - 1] = local220;
													Static292.aBooleanArray15[local539 - 1] = local543 == 0;
												}
												Static138.aClass215_57 = null;
												return true;
											} else if (Static376.aClass215_147 == Static138.aClass215_57) {
												local220 = Static627.aClass2_Sub11_Sub2_6.method8378();
												local73 = Static627.aClass2_Sub11_Sub2_6.method8381();
												local539 = Static627.aClass2_Sub11_Sub2_6.method8383();
												local237 = "";
												local247 = local237;
												if ((local539 & 0x1) != 0) {
													local237 = Static627.aClass2_Sub11_Sub2_6.method8373();
													if ((local539 & 0x2) == 0) {
														local247 = local237;
													} else {
														local247 = Static627.aClass2_Sub11_Sub2_6.method8373();
													}
												}
												local251 = Static627.aClass2_Sub11_Sub2_6.method8373();
												if (local220 == 99) {
													Static300.method2224(local251);
												} else if (local247.equals("") || !Static127.method3003(local247)) {
													Static101.method2658(local247, local220, local73, local251, local237, local237);
												} else {
													Static138.aClass215_57 = null;
													return true;
												}
												Static138.aClass215_57 = null;
												return true;
											} else if (Static138.aClass215_57 == Static55.aClass215_191) {
												local220 = Static627.aClass2_Sub11_Sub2_6.method8383();
												if (Static627.aClass2_Sub11_Sub2_6.method8383() == 0) {
													Static145.aClass164Array1[local220] = new Class164();
												} else {
													Static627.aClass2_Sub11_Sub2_6.anInt10066--;
													Static145.aClass164Array1[local220] = new Class164(Static627.aClass2_Sub11_Sub2_6);
												}
												Static138.aClass215_57 = null;
												Static462.anInt8469 = Static7.anInt132;
												return true;
											} else if (Static138.aClass215_57 == Static356.aClass215_136) {
												local220 = Static627.aClass2_Sub11_Sub2_6.method8368();
												local73 = Static627.aClass2_Sub11_Sub2_6.method8339();
												Static504.method7787();
												Static434.method6894(local220, local73);
												Static138.aClass215_57 = null;
												return true;
											} else {
												@Pc(4419) Class2_Sub50 local4419;
												@Pc(4403) Class2_Sub50 local4403;
												if (Static138.aClass215_57 == Static185.aClass215_89) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8339();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8326();
													local539 = Static627.aClass2_Sub11_Sub2_6.method8326();
													if (local539 == 65535) {
														local539 = -1;
													}
													local543 = Static627.aClass2_Sub11_Sub2_6.method8351();
													Static504.method7787();
													if (local543 == 65535) {
														local543 = -1;
													}
													for (local845 = local543; local845 <= local539; local845++) {
														local636 = ((long) local220 << 32) + ((long) local845);
														local4403 = (Class2_Sub50) Static514.aClass99_71.method3056(local636);
														if (local4403 != null) {
															local4419 = new Class2_Sub50(local4403.anInt10800, local73);
															local4403.method9253();
														} else if (local845 == -1) {
															local4419 = new Class2_Sub50(Static87.method8101(local220).aClass2_Sub50_1.anInt10800, local73);
														} else {
															local4419 = new Class2_Sub50(0, local73);
														}
														Static514.aClass99_71.method3059(local636, local4419);
													}
													Static138.aClass215_57 = null;
													return true;
												}
												@Pc(4486) boolean local4486;
												if (Static138.aClass215_57 == Static55.aClass215_192) {
													@Pc(4520) boolean local4520;
													while (Static627.aClass2_Sub11_Sub2_6.anInt10066 < Static541.anInt9723) {
														local615 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
														local619 = Static627.aClass2_Sub11_Sub2_6.method8373();
														local233 = Static627.aClass2_Sub11_Sub2_6.method8373();
														local543 = Static627.aClass2_Sub11_Sub2_6.method8326();
														local845 = Static627.aClass2_Sub11_Sub2_6.method8383();
														local251 = "";
														local4486 = false;
														if (local543 > 0) {
															local251 = Static627.aClass2_Sub11_Sub2_6.method8373();
															local4486 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
														}
														for (local1162 = 0; local1162 < Static604.anInt10620; local1162++) {
															if (local615) {
																if (local233.equals(Static314.aStringArray29[local1162])) {
																	Static314.aStringArray29[local1162] = local619;
																	Static101.aStringArray15[local1162] = local233;
																	local619 = null;
																	break;
																}
															} else if (local619.equals(Static314.aStringArray29[local1162])) {
																if (local543 != Static199.anIntArray558[local1162]) {
																	local4520 = true;
																	for (@Pc(4525) Class3_Sub2_Sub1 local4525 = (Class3_Sub2_Sub1) Static96.aClass325_2.method8016(); local4525 != null; local4525 = (Class3_Sub2_Sub1) Static96.aClass325_2.method8022()) {
																		if (local4525.aString28.equals(local619)) {
																			if (local543 != 0 && local4525.aShort33 == 0) {
																				local4520 = false;
																				local4525.method8909();
																			} else if (local543 == 0 && local4525.aShort33 != 0) {
																				local4520 = false;
																				local4525.method8909();
																			}
																		}
																	}
																	if (local4520) {
																		Static96.aClass325_2.method8013(new Class3_Sub2_Sub1(local619, local543));
																	}
																	Static199.anIntArray558[local1162] = local543;
																}
																Static101.aStringArray15[local1162] = local233;
																Static603.aStringArray33[local1162] = local251;
																Static433.anIntArray535[local1162] = local845;
																local619 = null;
																Static370.aBooleanArray17[local1162] = local4486;
																break;
															}
														}
														if (local619 != null && Static604.anInt10620 < 200) {
															Static314.aStringArray29[Static604.anInt10620] = local619;
															Static101.aStringArray15[Static604.anInt10620] = local233;
															Static199.anIntArray558[Static604.anInt10620] = local543;
															Static603.aStringArray33[Static604.anInt10620] = local251;
															Static433.anIntArray535[Static604.anInt10620] = local845;
															Static370.aBooleanArray17[Static604.anInt10620] = local4486;
															Static604.anInt10620++;
														}
													}
													Static372.anInt7359 = 2;
													Static373.anInt7362 = Static7.anInt132;
													local73 = Static604.anInt10620;
													while (local73 > 0) {
														local73--;
														local615 = true;
														for (local539 = 0; local539 < local73; local539++) {
															if (Static185.aClass255_2.anInt7912 != Static199.anIntArray558[local539] && Static185.aClass255_2.anInt7912 == Static199.anIntArray558[local539 + 1] || Static199.anIntArray558[local539] == 0 && Static199.anIntArray558[local539 + 1] != 0) {
																local543 = Static199.anIntArray558[local539];
																Static199.anIntArray558[local539] = Static199.anIntArray558[local539 + 1];
																Static199.anIntArray558[local539 + 1] = local543;
																local247 = Static603.aStringArray33[local539];
																Static603.aStringArray33[local539] = Static603.aStringArray33[local539 + 1];
																Static603.aStringArray33[local539 + 1] = local247;
																local251 = Static314.aStringArray29[local539];
																Static314.aStringArray29[local539] = Static314.aStringArray29[local539 + 1];
																Static314.aStringArray29[local539 + 1] = local251;
																local2013 = Static101.aStringArray15[local539];
																Static101.aStringArray15[local539] = Static101.aStringArray15[local539 + 1];
																Static101.aStringArray15[local539 + 1] = local2013;
																local1162 = Static433.anIntArray535[local539];
																Static433.anIntArray535[local539] = Static433.anIntArray535[local539 + 1];
																Static433.anIntArray535[local539 + 1] = local1162;
																local4520 = Static370.aBooleanArray17[local539];
																Static370.aBooleanArray17[local539] = Static370.aBooleanArray17[local539 + 1];
																local615 = false;
																Static370.aBooleanArray17[local539 + 1] = local4520;
															}
														}
														if (local615) {
															break;
														}
													}
													Static138.aClass215_57 = null;
													return true;
												} else if (Static621.aClass215_253 == Static138.aClass215_57) {
													if (Static232.aFrame1 != null) {
														Static317.method5514(Static74.aClass2_Sub13_5.aClass14_Sub16_1.method5919(), -1, false, -1);
													}
													@Pc(4856) byte[] local4856 = new byte[Static541.anInt9723];
													Static627.aClass2_Sub11_Sub2_6.method8399(Static541.anInt9723, local4856);
													local619 = Static299.method5335(local4856, Static541.anInt9723, 0);
													Static51.method1762(local619, Static268.aClass370_3, Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() == 1, true);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static299.aClass215_123 == Static138.aClass215_57) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8326();
													if (local220 == 65535) {
														local220 = -1;
													}
													local73 = Static627.aClass2_Sub11_Sub2_6.method8383();
													local539 = Static627.aClass2_Sub11_Sub2_6.method8326();
													local543 = Static627.aClass2_Sub11_Sub2_6.method8383();
													local845 = Static627.aClass2_Sub11_Sub2_6.method8326();
													Static269.method4946(local543, local220, local73, local539, local845);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static527.aClass215_249) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8326();
													local3421 = Static627.aClass2_Sub11_Sub2_6.method8384();
													Static286.aClass263_3.method6862(local3421, local220);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static253.aClass215_222) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8369();
													if (local220 == 65535) {
														local220 = -1;
													}
													local73 = Static627.aClass2_Sub11_Sub2_6.method8342();
													Static504.method7787();
													Static221.method4260(local220, local73);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static595.aClass215_240) {
													Static512.method7834(Static489.aClass181_13);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static501.aClass215_201) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8326();
													if (local220 == 65535) {
														local220 = -1;
													}
													local73 = Static627.aClass2_Sub11_Sub2_6.method8383();
													local539 = Static627.aClass2_Sub11_Sub2_6.method8326();
													local543 = Static627.aClass2_Sub11_Sub2_6.method8383();
													local845 = Static627.aClass2_Sub11_Sub2_6.method8326();
													Static61.method7220(local73, local845, false, local543, local539, local220);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static213.aClass215_99) {
													Static567.method8486();
													Static138.aClass215_57 = null;
													return false;
												} else if (Static138.aClass215_57 == Static121.aClass215_213) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8351();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8383();
													Static504.method7787();
													Static448.method7067(local73, true, local220);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static485.aClass215_199 == Static138.aClass215_57) {
													local615 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
													local619 = Static627.aClass2_Sub11_Sub2_6.method8373();
													local233 = local619;
													if (local615) {
														local233 = Static627.aClass2_Sub11_Sub2_6.method8373();
													}
													local631 = Static627.aClass2_Sub11_Sub2_6.method8326();
													local636 = Static627.aClass2_Sub11_Sub2_6.method8347();
													local1162 = Static627.aClass2_Sub11_Sub2_6.method8383();
													local1184 = Static627.aClass2_Sub11_Sub2_6.method8326();
													@Pc(5108) long local5108 = local636 + (local631 << 32);
													local1205 = false;
													local1213 = 0;
													while (true) {
														if (local1213 >= 100) {
															if (local1162 <= 1 && Static127.method3003(local233)) {
																local1205 = true;
															}
															break;
														}
														if (local5108 == Static136.aLongArray6[local1213]) {
															local1205 = true;
															break;
														}
														local1213++;
													}
													if (!local1205 && Static548.anInt9815 == 0) {
														Static136.aLongArray6[Static30.anInt645] = local5108;
														Static30.anInt645 = (Static30.anInt645 + 1) % 100;
														@Pc(5161) String local5161 = Static296.aClass13_1.method226(local1184).method8042(Static627.aClass2_Sub11_Sub2_6);
														if (local1162 == 2) {
															Static550.method8230("<img=1>" + local233, local5161, local1184, "<img=1>" + local619, null, 18, 0, local619);
														} else if (local1162 == 1) {
															Static550.method8230("<img=0>" + local233, local5161, local1184, "<img=0>" + local619, null, 18, 0, local619);
														} else {
															Static550.method8230(local233, local5161, local1184, local619, null, 18, 0, local619);
														}
													}
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static302.aClass215_125) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8369();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8360();
													local539 = Static627.aClass2_Sub11_Sub2_6.method8389();
													Static504.method7787();
													local394 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local73);
													if (local394 != null) {
														Static133.method3047(local394.anInt10125 != local220, false, local394);
													}
													Static113.method2840(local220, local73, local539, false);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static133.aClass215_54) {
													Static138.aClass215_57 = null;
													Static372.anInt7359 = 1;
													Static373.anInt7362 = Static7.anInt132;
													return true;
												} else if (Static138.aClass215_57 == Static439.aClass215_186) {
													Static504.method7787();
													Static376.method6271();
													Static138.aClass215_57 = null;
													return true;
												} else if (Static18.aClass215_10 == Static138.aClass215_57) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8326();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8326();
													local539 = Static627.aClass2_Sub11_Sub2_6.method8326();
													Static504.method7787();
													if (Static631.aClass24ArrayArray2[local220] != null) {
														for (local543 = local73; local543 < local539; local543++) {
															local845 = Static627.aClass2_Sub11_Sub2_6.method8347();
															if (local543 < Static631.aClass24ArrayArray2[local220].length && Static631.aClass24ArrayArray2[local220][local543] != null) {
																Static631.aClass24ArrayArray2[local220][local543].anInt457 = local845;
															}
														}
													}
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static436.aClass215_180) {
													Static512.method7834(Static576.aClass181_15);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static511.aClass215_206 == Static138.aClass215_57) {
													Static27.anInt575 = Static627.aClass2_Sub11_Sub2_6.method8389();
													Static298.anInt6266 = Static627.aClass2_Sub11_Sub2_6.method8357() << 3;
													Static594.anInt10471 = Static627.aClass2_Sub11_Sub2_6.method8357() << 3;
													for (@Pc(5400) Class2_Sub45 local5400 = (Class2_Sub45) Static378.aClass99_26.method3060(); local5400 != null; local5400 = (Class2_Sub45) Static378.aClass99_26.method3058()) {
														local73 = (int) (local5400.aLong278 >> 28 & 0x3L);
														local539 = (int) (local5400.aLong278 & 0x3FFFL);
														local543 = local539 - Static84.anInt2565;
														local845 = (int) (local5400.aLong278 >> 14 & 0x3FFFL);
														local1046 = local845 - Static32.anInt723;
														if (local73 == Static27.anInt575 && local543 >= Static594.anInt10471 && local543 < Static594.anInt10471 + 8 && local1046 >= Static298.anInt6266 && Static298.anInt6266 + 8 > local1046) {
															local5400.method9253();
															if (local543 >= 0 && local1046 >= 0 && local543 < Static47.anInt1794 && Static209.anInt4742 > local1046) {
																Static483.method7529(local1046, local543, Static27.anInt575);
															}
														}
													}
													for (@Pc(5505) Class2_Sub37 local5505 = (Class2_Sub37) Static270.aClass341_41.method8524(); local5505 != null; local5505 = (Class2_Sub37) Static270.aClass341_41.method8519()) {
														if (local5505.anInt6994 >= Static594.anInt10471 && Static594.anInt10471 + 8 > local5505.anInt6994 && Static298.anInt6266 <= local5505.anInt6987 && local5505.anInt6987 < Static298.anInt6266 + 8 && local5505.anInt6988 == Static27.anInt575) {
															local5505.anInt6984 = 0;
														}
													}
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static438.aClass215_184) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8325();
													@Pc(5567) int[] local5567 = new int[4];
													for (local539 = 0; local539 < 4; local539++) {
														local5567[local539] = Static627.aClass2_Sub11_Sub2_6.method8326();
													}
													local543 = Static627.aClass2_Sub11_Sub2_6.method8369();
													@Pc(5592) Class2_Sub33 local5592 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local543);
													if (local5592 != null) {
														Static259.method4752(local220, local5567, local5592.aClass3_Sub1_Sub3_Sub3_Sub1_2);
													}
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static520.aClass215_209) {
													Static566.anInt10156 = Static627.aClass2_Sub11_Sub2_6.method8383();
													Static138.aClass215_57 = null;
													return true;
												} else if (Static526.aClass215_210 == Static138.aClass215_57) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8338();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8338();
													local539 = Static627.aClass2_Sub11_Sub2_6.method8354();
													if (local539 == 65535) {
														local539 = -1;
													}
													Static402.method6562(local73, local539, local220);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static81.aClass215_28 == Static138.aClass215_57) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8359();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8354();
													if (local73 == 65535) {
														local73 = -1;
													}
													local539 = Static627.aClass2_Sub11_Sub2_6.method8325();
													Static440.method6960(local73, local539, local220);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static27.aClass215_14 == Static138.aClass215_57) {
													local1903 = Static627.aClass2_Sub11_Sub2_6.method8373();
													local619 = Static621.method9056(Static629.method9131(Static627.aClass2_Sub11_Sub2_6));
													Static101.method2658(local1903, 6, 0, local619, local1903, local1903);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static133.aClass215_55) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8360();
													local619 = Static627.aClass2_Sub11_Sub2_6.method8373();
													Static504.method7787();
													Static555.method8281(local220, local619);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static435.aClass215_176) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8339();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8342();
													local539 = Static627.aClass2_Sub11_Sub2_6.method8369();
													Static504.method7787();
													Static525.method3743(5, local220, local539, local73);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static158.aClass215_72 == Static138.aClass215_57) {
													local615 = Static627.aClass2_Sub11_Sub2_6.method8325() == 1;
													Static504.method7787();
													Static370.aBoolean536 = local615;
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static271.aClass215_252) {
													Static60.method1923();
													Static138.aClass215_57 = null;
													return true;
												} else if (Static98.aClass215_34 == Static138.aClass215_57) {
													Static645.anInt11095 = Static627.aClass2_Sub11_Sub2_6.method8338();
													Static63.anInt2057 = Static627.aClass2_Sub11_Sub2_6.method8389();
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static472.aClass215_197) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8325();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8351();
													Static504.method7787();
													if (local220 == 2) {
														Static21.method596();
													}
													Static475.anInt10143 = local73;
													Static176.method3672(local73);
													Static527.method9032(false);
													Static284.method5151(Static475.anInt10143);
													for (local539 = 0; local539 < 100; local539++) {
														Static403.aBooleanArray18[local539] = true;
													}
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static568.aClass215_230) {
													if (Static115.method2851(Static529.anInt9623)) {
														Static612.anInt10717 = (int) ((float) Static627.aClass2_Sub11_Sub2_6.method8326() * 2.5F);
													} else {
														Static612.anInt10717 = Static627.aClass2_Sub11_Sub2_6.method8326() * 30;
													}
													Static62.anInt2039 = Static7.anInt132;
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static170.aClass215_233) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8326();
													if (local220 == 65535) {
														local220 = -1;
													}
													local73 = Static627.aClass2_Sub11_Sub2_6.method8383();
													local539 = Static627.aClass2_Sub11_Sub2_6.method8326();
													local543 = Static627.aClass2_Sub11_Sub2_6.method8383();
													Static61.method7220(local73, 256, true, local543, local539, local220);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static442.aClass215_188 == Static138.aClass215_57) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8351();
													if (local220 == 65535) {
														local220 = -1;
													}
													local73 = Static627.aClass2_Sub11_Sub2_6.method8339();
													Static504.method7787();
													Static525.method3743(1, local73, local220, -1);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static247.aClass215_146) {
													Static512.method7834(Static325.aClass181_9);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static282.aClass215_113) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8351();
													if (local220 == 65535) {
														local220 = -1;
													}
													local73 = Static627.aClass2_Sub11_Sub2_6.method8369();
													if (local73 == 65535) {
														local73 = -1;
													}
													local539 = Static627.aClass2_Sub11_Sub2_6.method8381();
													local543 = Static627.aClass2_Sub11_Sub2_6.method8342();
													Static504.method7787();
													for (local845 = local73; local845 <= local220; local845++) {
														local636 = (long) local845 + ((long) local539 << 32);
														local4403 = (Class2_Sub50) Static514.aClass99_71.method3056(local636);
														if (local4403 != null) {
															local4419 = new Class2_Sub50(local543, local4403.anInt10795);
															local4403.method9253();
														} else if (local845 == -1) {
															local4419 = new Class2_Sub50(local543, Static87.method8101(local539).aClass2_Sub50_1.anInt10795);
														} else {
															local4419 = new Class2_Sub50(local543, -1);
														}
														Static514.aClass99_71.method3059(local636, local4419);
													}
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static402.aClass215_157) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8351();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8342();
													Static286.aClass263_3.method6865(local220, local73);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static46.aClass215_15) {
													Static627.aClass2_Sub11_Sub2_6.anInt10066 += 28;
													if (Static627.aClass2_Sub11_Sub2_6.method8348()) {
														Static51.method1767(Static627.aClass2_Sub11_Sub2_6.anInt10066 - 28, Static627.aClass2_Sub11_Sub2_6);
													}
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static208.aClass215_93) {
													Static67.anInt2178 = Static627.aClass2_Sub11_Sub2_6.method8383();
													Static62.anInt2039 = Static7.anInt132;
													Static138.aClass215_57 = null;
													return true;
												} else if (Static454.aClass215_193 == Static138.aClass215_57) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8338();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8325();
													local539 = Static627.aClass2_Sub11_Sub2_6.method8339();
													Static456.anIntArray376[local73] = local539;
													Static418.anIntArray505[local73] = local220;
													Static564.anIntArray655[local73] = 1;
													local543 = Static507.anIntArray607[local73] - 1;
													for (local845 = 0; local845 < local543; local845++) {
														if (Class74_Sub2_Sub2.anIntArray629[local845] <= local539) {
															Static564.anIntArray655[local73] = local845 + 2;
														}
													}
													Static478.anIntArray574[Static91.anInt2652++ & 0x1F] = local73;
													Static138.aClass215_57 = null;
													return true;
												} else if (Static212.aClass215_97 == Static138.aClass215_57) {
													Static512.method7834(Static419.aClass181_11);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static225.aClass215_101 == Static138.aClass215_57) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8351();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8338();
													local1030 = (local73 & 0x1) == 1;
													Static209.method4122(local1030, local220);
													Static478.anIntArray575[Static349.anInt6960++ & 0x1F] = local220;
													Static138.aClass215_57 = null;
													return true;
												} else if (Static420.aClass215_166 == Static138.aClass215_57) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8326();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8383();
													local1030 = (local73 & 0x1) == 1;
													while (Static627.aClass2_Sub11_Sub2_6.anInt10066 < Static541.anInt9723) {
														local543 = Static627.aClass2_Sub11_Sub2_6.method8378();
														local845 = Static627.aClass2_Sub11_Sub2_6.method8326();
														local1046 = 0;
														if (local845 != 0) {
															local1046 = Static627.aClass2_Sub11_Sub2_6.method8383();
															if (local1046 == 255) {
																local1046 = Static627.aClass2_Sub11_Sub2_6.method8381();
															}
														}
														Static599.method8794(local220, local1030, local543, local1046, local845 - 1);
													}
													Static478.anIntArray575[Static349.anInt6960++ & 0x1F] = local220;
													Static138.aClass215_57 = null;
													return true;
												} else if (Static416.aClass215_164 == Static138.aClass215_57) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8338();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8389();
													if (local220 == 255) {
														local73 = -1;
														local220 = -1;
													}
													Static120.method2941(local73, local220);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static407.aClass215_158 == Static138.aClass215_57) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8360();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8369();
													Static504.method7787();
													Static202.method4066(local73, local220);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static490.aClass215_200 == Static138.aClass215_57) {
													Static325.method5605();
													Static138.aClass215_57 = null;
													return true;
												} else if (Static537.aClass215_214 == Static138.aClass215_57) {
													local615 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
													local619 = Static627.aClass2_Sub11_Sub2_6.method8373();
													local233 = local619;
													if (local615) {
														local233 = Static627.aClass2_Sub11_Sub2_6.method8373();
													}
													local543 = Static627.aClass2_Sub11_Sub2_6.method8383();
													local845 = Static627.aClass2_Sub11_Sub2_6.method8326();
													local1152 = false;
													if (local543 <= 1 && Static127.method3003(local233)) {
														local1152 = true;
													}
													if (!local1152 && Static548.anInt9815 == 0) {
														local2013 = Static296.aClass13_1.method226(local845).method8042(Static627.aClass2_Sub11_Sub2_6);
														if (local543 == 2) {
															Static550.method8230("<img=1>" + local233, local2013, local845, "<img=1>" + local619, null, 25, 0, local619);
														} else if (local543 == 1) {
															Static550.method8230("<img=0>" + local233, local2013, local845, "<img=0>" + local619, null, 25, 0, local619);
														} else {
															Static550.method8230(local233, local2013, local845, local619, null, 25, 0, local619);
														}
													}
													Static138.aClass215_57 = null;
													return true;
												} else if (Static390.aClass215_153 == Static138.aClass215_57) {
													local220 = Static627.aClass2_Sub11_Sub2_6.method8342();
													local73 = Static627.aClass2_Sub11_Sub2_6.method8351();
													Static504.method7787();
													Static559.method8401(local220, local73);
													Static138.aClass215_57 = null;
													return true;
												} else if (Static138.aClass215_57 == Static141.aClass215_58) {
													Static518.anInt9446 = Static7.anInt132;
													if (Static541.anInt9723 == 0) {
														Static235.anInt5133 = 0;
														Static250.aString81 = null;
														Static427.aClass132Array1 = null;
														Static322.aString70 = null;
														Static138.aClass215_57 = null;
														return true;
													}
													Static322.aString70 = Static627.aClass2_Sub11_Sub2_6.method8373();
													local615 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
													if (local615) {
														Static627.aClass2_Sub11_Sub2_6.method8373();
													}
													@Pc(6550) long local6550 = Static627.aClass2_Sub11_Sub2_6.method8361();
													Static250.aString81 = Static224.method4292(local6550);
													Static505.aByte124 = Static627.aClass2_Sub11_Sub2_6.method8384();
													local543 = Static627.aClass2_Sub11_Sub2_6.method8383();
													if (local543 == 255) {
														Static138.aClass215_57 = null;
														return true;
													}
													Static235.anInt5133 = local543;
													@Pc(6574) Class132[] local6574 = new Class132[100];
													for (local1046 = 0; local1046 < Static235.anInt5133; local1046++) {
														local6574[local1046] = new Class132();
														local6574[local1046].aString46 = Static627.aClass2_Sub11_Sub2_6.method8373();
														local615 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
														if (local615) {
															local6574[local1046].aString43 = Static627.aClass2_Sub11_Sub2_6.method8373();
														} else {
															local6574[local1046].aString43 = local6574[local1046].aString46;
														}
														local6574[local1046].aString44 = Static31.method765(local6574[local1046].aString43);
														local6574[local1046].anInt4830 = Static627.aClass2_Sub11_Sub2_6.method8326();
														local6574[local1046].aByte80 = Static627.aClass2_Sub11_Sub2_6.method8384();
														local6574[local1046].aString45 = Static627.aClass2_Sub11_Sub2_6.method8373();
														if (local6574[local1046].aString43.equals(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString64)) {
															Static86.aByte29 = local6574[local1046].aByte80;
														}
													}
													local1184 = Static235.anInt5133;
													while (local1184 > 0) {
														local1184--;
														local4486 = true;
														for (local645 = 0; local645 < local1184; local645++) {
															if (local6574[local645].aString44.compareTo(local6574[local645 + 1].aString44) > 0) {
																local2017 = local6574[local645];
																local6574[local645] = local6574[local645 + 1];
																local6574[local645 + 1] = local2017;
																local4486 = false;
															}
														}
														if (local4486) {
															break;
														}
													}
													Static427.aClass132Array1 = local6574;
													Static138.aClass215_57 = null;
													return true;
												} else {
													Static408.method6625("T1 - " + (Static138.aClass215_57 == null ? -1 : Static138.aClass215_57.method6064()) + "," + (Static527.aClass215_250 == null ? -1 : Static527.aClass215_250.method6064()) + "," + (Static106.aClass215_42 == null ? -1 : Static106.aClass215_42.method6064()) + " - " + Static541.anInt9723, null);
													Static68.method2104(false);
													return true;
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
		}
	}
}
