import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_10 = new Class216(8, 3);

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "[Lclient!fv;")
	public static final Class6_Sub1_Sub7[] aClass6_Sub1_Sub7Array1 = new Class6_Sub1_Sub7[14];

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "[I")
	public static final int[] anIntArray469 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Z")
	public static boolean method4230() throws IOException {
		if (Static225.aClass71_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static244.aClass40_99 == null) {
			if (Static40.aBoolean23) {
				if (!Static225.aClass71_1.method5964(1)) {
					return false;
				}
				Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 1, 0);
				Static40.aBoolean23 = false;
				Static418.anInt7398 = 0;
				Static337.anInt5990++;
			}
			Static420.aClass6_Sub14_Sub2_2.anInt7244 = 0;
			if (Static420.aClass6_Sub14_Sub2_2.method6044()) {
				if (!Static225.aClass71_1.method5964(1)) {
					return false;
				}
				Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 1, 1);
				Static337.anInt5990++;
				Static418.anInt7398 = 0;
			}
			Static40.aBoolean23 = true;
			@Pc(69) Class40[] local69 = Static258.method3635();
			local73 = Static420.aClass6_Sub14_Sub2_2.method6048();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static420.aClass6_Sub14_Sub2_2.anInt7244);
			}
			Static244.aClass40_99 = local69[local73];
			Static567.anInt9502 = Static244.aClass40_99.anInt858;
		}
		if (Static567.anInt9502 == -1) {
			if (!Static225.aClass71_1.method5964(1)) {
				return false;
			}
			Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 1, 0);
			Static418.anInt7398 = 0;
			Static567.anInt9502 = Static420.aClass6_Sub14_Sub2_2.aByteArray88[0] & 0xFF;
			Static337.anInt5990++;
		}
		if (Static567.anInt9502 == -2) {
			if (!Static225.aClass71_1.method5964(2)) {
				return false;
			}
			Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 2, 0);
			Static420.aClass6_Sub14_Sub2_2.anInt7244 = 0;
			Static567.anInt9502 = Static420.aClass6_Sub14_Sub2_2.method6006();
			Static418.anInt7398 = 0;
			Static337.anInt5990 += 2;
		}
		if (Static567.anInt9502 > 0) {
			if (!Static225.aClass71_1.method5964(Static567.anInt9502)) {
				return false;
			}
			Static420.aClass6_Sub14_Sub2_2.anInt7244 = 0;
			Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, Static567.anInt9502, 0);
			Static418.anInt7398 = 0;
			Static337.anInt5990 += Static567.anInt9502;
		}
		Static163.aClass40_71 = Static142.aClass40_65;
		Static142.aClass40_65 = Static218.aClass40_86;
		Static218.aClass40_86 = Static244.aClass40_99;
		@Pc(216) int local216;
		if (Static244.aClass40_99 == Static516.aClass40_184) {
			local216 = Static420.aClass6_Sub14_Sub2_2.method6013();
			local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
			Static505.aClass30_1.method501(local73, local216);
			Static244.aClass40_99 = null;
			return true;
		}
		@Pc(251) int local251;
		if (Static244.aClass40_99 == Static101.aClass40_48) {
			local216 = Static420.aClass6_Sub14_Sub2_2.method6032();
			local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
			if (local73 == 65535) {
				local73 = -1;
			}
			local251 = Static420.aClass6_Sub14_Sub2_2.method6013();
			if (Static407.method5938(local216)) {
				Static270.method2048(-1, 1, local73, local251);
			}
			Static244.aClass40_99 = null;
			return true;
		} else if (Static244.aClass40_99 == Static178.aClass40_158) {
			local216 = Static420.aClass6_Sub14_Sub2_2.method6027();
			Static386.aClass278_7 = Static152.aClass57_4.method925(local216);
			Static244.aClass40_99 = null;
			return true;
		} else if (Static559.aClass40_194 == Static244.aClass40_99) {
			if (Static487.anInt8139 != -1) {
				Static529.method7376(0, Static487.anInt8139);
			}
			Static244.aClass40_99 = null;
			return true;
		} else {
			@Pc(333) int local333;
			if (Static146.aClass40_66 == Static244.aClass40_99) {
				local216 = Static420.aClass6_Sub14_Sub2_2.method6006();
				local73 = Static420.aClass6_Sub14_Sub2_2.method6020();
				local251 = Static420.aClass6_Sub14_Sub2_2.method6006();
				if (Static407.method5938(local216)) {
					if (local73 == 2) {
						Static228.method3370();
					}
					Static487.anInt8139 = local251;
					Static274.method2853(local251);
					Static59.method46(false);
					Static100.method1629(Static487.anInt8139);
					for (local333 = 0; local333 < 100; local333++) {
						Static258.aBooleanArray27[local333] = true;
					}
				}
				Static244.aClass40_99 = null;
				return true;
			} else if (Static244.aClass40_98 == Static244.aClass40_99) {
				local216 = Static420.aClass6_Sub14_Sub2_2.method6041();
				if (Static420.aClass6_Sub14_Sub2_2.method6041() == 0) {
					Static434.aClass49Array1[local216] = new Class49();
				} else {
					Static420.aClass6_Sub14_Sub2_2.anInt7244--;
					Static434.aClass49Array1[local216] = new Class49(Static420.aClass6_Sub14_Sub2_2);
				}
				Static503.anInt1076 = Static48.anInt821;
				Static244.aClass40_99 = null;
				return true;
			} else {
				@Pc(399) String local399;
				if (Static244.aClass40_99 == Static67.aClass40_29) {
					local216 = Static420.aClass6_Sub14_Sub2_2.method6028();
					local399 = Static420.aClass6_Sub14_Sub2_2.method5991();
					local251 = Static420.aClass6_Sub14_Sub2_2.method6032();
					if (Static407.method5938(local251)) {
						Static557.method7620(local399, local216);
					}
					Static244.aClass40_99 = null;
					return true;
				}
				@Pc(445) Class6_Sub31 local445;
				if (Static316.aClass40_132 == Static244.aClass40_99) {
					local216 = Static420.aClass6_Sub14_Sub2_2.method6014();
					local73 = Static420.aClass6_Sub14_Sub2_2.method5982();
					local251 = Static420.aClass6_Sub14_Sub2_2.method6026();
					local333 = Static420.aClass6_Sub14_Sub2_2.method6006();
					if (Static407.method5938(local73)) {
						local445 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local216);
						if (local445 != null) {
							Static160.method2336(local333 != local445.anInt4563, false, local445);
						}
						Static381.method5558(local251, local216, local333, false);
					}
					Static244.aClass40_99 = null;
					return true;
				} else if (Static223.aClass40_88 == Static244.aClass40_99) {
					Static383.anInt6691 = Static420.aClass6_Sub14_Sub2_2.method6041();
					for (local216 = 0; local216 < Static383.anInt6691; local216++) {
						Static353.aStringArray23[local216] = Static420.aClass6_Sub14_Sub2_2.method5991();
						Static521.aStringArray32[local216] = Static420.aClass6_Sub14_Sub2_2.method5991();
						if (Static521.aStringArray32[local216].equals("")) {
							Static521.aStringArray32[local216] = Static353.aStringArray23[local216];
						}
						Static129.aStringArray10[local216] = Static420.aClass6_Sub14_Sub2_2.method5991();
						Static195.aStringArray14[local216] = Static420.aClass6_Sub14_Sub2_2.method5991();
						if (Static195.aStringArray14[local216].equals("")) {
							Static195.aStringArray14[local216] = Static129.aStringArray10[local216];
						}
						Static354.aBooleanArray34[local216] = false;
					}
					Static244.aClass40_99 = null;
					Static350.anInt6167 = Static48.anInt821;
					return true;
				} else if (Static377.aClass40_154 == Static244.aClass40_99) {
					Static287.method7858(Static123.aClass216_5);
					Static244.aClass40_99 = null;
					return true;
				} else if (Static244.aClass40_99 == Static544.aClass40_188) {
					local216 = Static420.aClass6_Sub14_Sub2_2.method6032();
					local73 = Static420.aClass6_Sub14_Sub2_2.method5996();
					if (local73 == 65535) {
						local73 = -1;
					}
					local251 = Static420.aClass6_Sub14_Sub2_2.method6028();
					if (Static407.method5938(local216)) {
						Static501.method6908(local251, local73);
					}
					Static244.aClass40_99 = null;
					return true;
				} else if (Static244.aClass40_99 == Static171.aClass40_73) {
					local216 = Static420.aClass6_Sub14_Sub2_2.method6028();
					local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
					local251 = Static420.aClass6_Sub14_Sub2_2.method6017();
					if (Static407.method5938(local73)) {
						Static532.method7404(local216, local251);
					}
					Static244.aClass40_99 = null;
					return true;
				} else if (Static83.aClass40_35 == Static244.aClass40_99) {
					Static567.method7777();
					Static244.aClass40_99 = null;
					return false;
				} else if (Static244.aClass40_99 == Static187.aClass40_77) {
					local216 = Static420.aClass6_Sub14_Sub2_2.method6032();
					local73 = Static420.aClass6_Sub14_Sub2_2.method5982();
					local251 = Static420.aClass6_Sub14_Sub2_2.method6012();
					@Pc(648) Class6_Sub28 local648 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local73);
					if (local648 != null) {
						Static41.method568(local216, local648.aClass29_Sub2_Sub1_Sub1_2, local251);
					}
					Static244.aClass40_99 = null;
					return true;
				} else if (Static137.aClass40_60 == Static244.aClass40_99) {
					local216 = Static420.aClass6_Sub14_Sub2_2.method6014();
					local73 = Static420.aClass6_Sub14_Sub2_2.method5996();
					local251 = Static420.aClass6_Sub14_Sub2_2.method6032();
					if (Static407.method5938(local251)) {
						Static504.method6936(local73, local216);
					}
					Static244.aClass40_99 = null;
					return true;
				} else if (Static253.aClass40_100 == Static244.aClass40_99) {
					local216 = Static420.aClass6_Sub14_Sub2_2.method6017();
					local73 = Static420.aClass6_Sub14_Sub2_2.method5982();
					local251 = Static420.aClass6_Sub14_Sub2_2.method6028();
					local333 = Static420.aClass6_Sub14_Sub2_2.method6008();
					if (Static407.method5938(local73)) {
						Static507.method6979(local333, local251, local216);
					}
					Static244.aClass40_99 = null;
					return true;
				} else {
					@Pc(731) boolean local731;
					if (Static244.aClass40_99 == Static48.aClass40_24) {
						local731 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
						@Pc(736) byte[] local736 = new byte[Static567.anInt9502 - 1];
						Static420.aClass6_Sub14_Sub2_2.method6018(Static567.anInt9502 - 1, local736);
						Static360.method5339(local736, local731);
						Static244.aClass40_99 = null;
						return true;
					}
					@Pc(786) int local786;
					@Pc(802) int local802;
					@Pc(775) int local775;
					@Pc(792) int local792;
					@Pc(798) int local798;
					if (Static244.aClass40_99 == Static12.aClass40_4) {
						local216 = Static420.aClass6_Sub14_Sub2_2.method6020();
						local73 = local216 >> 2;
						local251 = local216 & 0x3;
						local333 = Static242.anIntArray431[local73];
						local775 = Static420.aClass6_Sub14_Sub2_2.method5982();
						if (local775 == 65535) {
							local775 = -1;
						}
						local786 = Static420.aClass6_Sub14_Sub2_2.method6027();
						local792 = local786 >> 28 & 0x3;
						local798 = local786 >> 14 & 0x3FFF;
						local802 = local786 & 0x3FFF;
						local798 -= Static218.anInt3718;
						local802 -= Static167.anInt3048;
						Static147.method2191(local775, local798, local251, local802, local792, local333, local73);
						Static244.aClass40_99 = null;
						return true;
					} else if (Static481.aClass40_173 == Static244.aClass40_99) {
						Static330.method5152();
						Static244.aClass40_99 = null;
						return false;
					} else if (Static244.aClass40_99 == Static301.aClass40_119) {
						Static287.method7858(Static320.aClass216_9);
						Static244.aClass40_99 = null;
						return true;
					} else {
						@Pc(932) int local932;
						@Pc(849) String local849;
						@Pc(880) boolean local880;
						@Pc(893) String local893;
						@Pc(860) boolean local860;
						if (Static330.aClass40_144 == Static244.aClass40_99) {
							local849 = Static420.aClass6_Sub14_Sub2_2.method5991();
							local860 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
							if (local860) {
								local399 = Static420.aClass6_Sub14_Sub2_2.method5991();
							} else {
								local399 = local849;
							}
							local333 = Static420.aClass6_Sub14_Sub2_2.method6006();
							@Pc(878) byte local878 = Static420.aClass6_Sub14_Sub2_2.method6034();
							local880 = false;
							if (local878 == -128) {
								local880 = true;
							}
							if (local880) {
								if (Static469.anInt7945 == 0) {
									Static244.aClass40_99 = null;
									return true;
								}
								for (local792 = 0; local792 < Static469.anInt7945 && (!Static296.aClass153Array3[local792].aString57.equals(local399) || Static296.aClass153Array3[local792].anInt3802 != local333); local792++) {
								}
								if (Static469.anInt7945 > local792) {
									while (local792 < Static469.anInt7945 - 1) {
										Static296.aClass153Array3[local792] = Static296.aClass153Array3[local792 + 1];
										local792++;
									}
									Static469.anInt7945--;
									Static296.aClass153Array3[Static469.anInt7945] = null;
								}
							} else {
								local893 = Static420.aClass6_Sub14_Sub2_2.method5991();
								@Pc(897) Class153 local897 = new Class153();
								local897.aString57 = local399;
								local897.aString60 = local849;
								local897.aString58 = Static502.method6919(local897.aString57);
								local897.anInt3802 = local333;
								local897.aByte52 = local878;
								local897.aString59 = local893;
								for (local802 = Static469.anInt7945 - 1; local802 >= 0; local802--) {
									local932 = Static296.aClass153Array3[local802].aString58.compareTo(local897.aString58);
									if (local932 == 0) {
										Static296.aClass153Array3[local802].anInt3802 = local333;
										Static296.aClass153Array3[local802].aByte52 = local878;
										Static296.aClass153Array3[local802].aString59 = local893;
										if (local399.equals(Static426.aClass29_Sub2_Sub1_Sub2_2.aString108)) {
											Static6.aByte40 = local878;
										}
										Static158.anInt2782 = Static48.anInt821;
										Static244.aClass40_99 = null;
										return true;
									}
									if (local932 < 0) {
										break;
									}
								}
								if (Static296.aClass153Array3.length <= Static469.anInt7945) {
									Static244.aClass40_99 = null;
									return true;
								}
								for (local932 = Static469.anInt7945 - 1; local932 > local802; local932--) {
									Static296.aClass153Array3[local932 + 1] = Static296.aClass153Array3[local932];
								}
								if (Static469.anInt7945 == 0) {
									Static296.aClass153Array3 = new Class153[100];
								}
								Static296.aClass153Array3[local802 + 1] = local897;
								Static469.anInt7945++;
								if (local399.equals(Static426.aClass29_Sub2_Sub1_Sub2_2.aString108)) {
									Static6.aByte40 = local878;
								}
							}
							Static244.aClass40_99 = null;
							Static158.anInt2782 = Static48.anInt821;
							return true;
						} else if (Static244.aClass40_99 == Static478.aClass40_172) {
							local216 = Static420.aClass6_Sub14_Sub2_2.method6041();
							local73 = local216 >> 5;
							local251 = local216 & 0x1F;
							if (local251 == 0) {
								Static34.aClass129Array4[local73] = null;
								Static244.aClass40_99 = null;
								return true;
							}
							@Pc(1133) Class129 local1133 = new Class129();
							local1133.anInt3170 = local251;
							local1133.anInt3171 = Static420.aClass6_Sub14_Sub2_2.method6041();
							if (local1133.anInt3171 >= 0 && local1133.anInt3171 < Static248.aClass4Array9.length) {
								if (local1133.anInt3170 == 1 || local1133.anInt3170 == 10) {
									local1133.anInt3177 = Static420.aClass6_Sub14_Sub2_2.method6006();
									Static420.aClass6_Sub14_Sub2_2.anInt7244 += 6;
								} else if (local1133.anInt3170 >= 2 && local1133.anInt3170 <= 6) {
									if (local1133.anInt3170 == 2) {
										local1133.anInt3176 = 256;
										local1133.anInt3169 = 256;
									}
									if (local1133.anInt3170 == 3) {
										local1133.anInt3169 = 0;
										local1133.anInt3176 = 256;
									}
									if (local1133.anInt3170 == 4) {
										local1133.anInt3176 = 256;
										local1133.anInt3169 = 512;
									}
									if (local1133.anInt3170 == 5) {
										local1133.anInt3169 = 256;
										local1133.anInt3176 = 0;
									}
									if (local1133.anInt3170 == 6) {
										local1133.anInt3176 = 512;
										local1133.anInt3169 = 256;
									}
									local1133.anInt3170 = 2;
									local1133.anInt3172 = Static420.aClass6_Sub14_Sub2_2.method6041();
									local1133.anInt3169 += Static420.aClass6_Sub14_Sub2_2.method6006() - Static218.anInt3718 << 9;
									local1133.anInt3176 += Static420.aClass6_Sub14_Sub2_2.method6006() - Static167.anInt3048 << 9;
									local1133.anInt3174 = Static420.aClass6_Sub14_Sub2_2.method6041() << 2;
									local1133.anInt3173 = Static420.aClass6_Sub14_Sub2_2.method6006();
								}
								local1133.anInt3179 = Static420.aClass6_Sub14_Sub2_2.method6006();
								if (local1133.anInt3179 == 65535) {
									local1133.anInt3179 = -1;
								}
								Static34.aClass129Array4[local73] = local1133;
							}
							Static244.aClass40_99 = null;
							return true;
						} else {
							@Pc(1325) String local1325;
							@Pc(1356) long local1356;
							@Pc(1358) boolean local1358;
							@Pc(1360) int local1360;
							@Pc(1415) String local1415;
							if (Static244.aClass40_99 == Static457.aClass40_97) {
								local731 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
								local399 = Static420.aClass6_Sub14_Sub2_2.method5991();
								local1325 = local399;
								if (local731) {
									local1325 = Static420.aClass6_Sub14_Sub2_2.method5991();
								}
								@Pc(1335) long local1335 = Static420.aClass6_Sub14_Sub2_2.method6033();
								@Pc(1340) long local1340 = (long) Static420.aClass6_Sub14_Sub2_2.method6006();
								@Pc(1345) long local1345 = (long) Static420.aClass6_Sub14_Sub2_2.method5988();
								local932 = Static420.aClass6_Sub14_Sub2_2.method6041();
								local1356 = (local1340 << 32) + local1345;
								local1358 = false;
								local1360 = 0;
								while (true) {
									if (local1360 >= 100) {
										if (local932 <= 1) {
											if (Static451.aBoolean532 && !Static558.aBoolean654 || Static475.aBoolean548) {
												local1358 = true;
											} else if (Static322.method4981(local1325)) {
												local1358 = true;
											}
										}
										break;
									}
									if (local1356 == Static511.aLongArray14[local1360]) {
										local1358 = true;
										break;
									}
									local1360++;
								}
								if (!local1358 && Static133.anInt4720 == 0) {
									Static511.aLongArray14[Static319.anInt5786] = local1356;
									Static319.anInt5786 = (Static319.anInt5786 + 1) % 100;
									local1415 = Static263.method3732(Static375.method5497(Static420.aClass6_Sub14_Sub2_2));
									if (local932 == 2 || local932 == 3) {
										Static253.method3574(-1, Static537.method7461(local1335), 9, local1415, local399, "<img=1>" + local1325, 0, "<img=1>" + local399);
									} else if (local932 == 1) {
										Static253.method3574(-1, Static537.method7461(local1335), 9, local1415, local399, "<img=0>" + local1325, 0, "<img=0>" + local399);
									} else {
										Static253.method3574(-1, Static537.method7461(local1335), 9, local1415, local399, local1325, 0, local399);
									}
								}
								Static244.aClass40_99 = null;
								return true;
							} else if (Static244.aClass40_99 == Static99.aClass40_43) {
								local216 = Static420.aClass6_Sub14_Sub2_2.method6032();
								local73 = Static420.aClass6_Sub14_Sub2_2.method6014();
								local251 = Static420.aClass6_Sub14_Sub2_2.method6032();
								if (Static407.method5938(local216)) {
									Static184.method2753(local251, local73);
								}
								Static244.aClass40_99 = null;
								return true;
							} else if (Static244.aClass40_99 == Static314.aClass40_131) {
								local216 = Static420.aClass6_Sub14_Sub2_2.method5982();
								local73 = Static420.aClass6_Sub14_Sub2_2.method5982();
								local251 = Static420.aClass6_Sub14_Sub2_2.method6027();
								if (Static407.method5938(local216)) {
									Static506.method6956(local251, local73);
								}
								Static244.aClass40_99 = null;
								return true;
							} else {
								@Pc(1565) String local1565;
								@Pc(1567) String local1567;
								@Pc(1594) String local1594;
								if (Static276.aClass40_110 == Static244.aClass40_99) {
									local216 = Static420.aClass6_Sub14_Sub2_2.method5998();
									local73 = Static420.aClass6_Sub14_Sub2_2.method6027();
									local251 = Static420.aClass6_Sub14_Sub2_2.method6041();
									local1565 = "";
									local1567 = local1565;
									if ((local251 & 0x1) != 0) {
										local1565 = Static420.aClass6_Sub14_Sub2_2.method5991();
										if ((local251 & 0x2) == 0) {
											local1567 = local1565;
										} else {
											local1567 = Static420.aClass6_Sub14_Sub2_2.method5991();
										}
									}
									local1594 = Static420.aClass6_Sub14_Sub2_2.method5991();
									if (local216 == 99) {
										Static555.method7074(local1594);
									} else if (local1567.equals("") || !Static322.method4981(local1567)) {
										Static164.method2396(local1567, local216, local1565, local1594, local73, local1565);
									} else {
										Static244.aClass40_99 = null;
										return true;
									}
									Static244.aClass40_99 = null;
									return true;
								} else if (Static244.aClass40_99 == Static59.aClass40_2) {
									local216 = Static420.aClass6_Sub14_Sub2_2.method6006();
									local73 = Static420.aClass6_Sub14_Sub2_2.method6041();
									local860 = (local73 & 0x1) == 1;
									Static18.method282(local216, local860);
									local333 = Static420.aClass6_Sub14_Sub2_2.method6006();
									for (local775 = 0; local775 < local333; local775++) {
										local786 = Static420.aClass6_Sub14_Sub2_2.method6012();
										if (local786 == 255) {
											local786 = Static420.aClass6_Sub14_Sub2_2.method6027();
										}
										local792 = Static420.aClass6_Sub14_Sub2_2.method6006();
										Static274.method2852(local786, local216, local860, local775, local792 - 1);
									}
									Static508.anIntArray662[Static265.anInt4387++ & 0x1F] = local216;
									Static244.aClass40_99 = null;
									return true;
								} else if (Static403.aClass40_191 == Static244.aClass40_99) {
									local849 = Static420.aClass6_Sub14_Sub2_2.method5991();
									local73 = Static420.aClass6_Sub14_Sub2_2.method6032();
									local251 = Static420.aClass6_Sub14_Sub2_2.method5982();
									if (Static407.method5938(local251)) {
										Static290.method4077(local73, local849);
									}
									Static244.aClass40_99 = null;
									return true;
								} else if (Static92.aClass40_159 == Static244.aClass40_99) {
									Static493.aClass24_3 = Static305.method4681(Static420.aClass6_Sub14_Sub2_2.method6041());
									Static244.aClass40_99 = null;
									return true;
								} else if (Static277.aClass40_111 == Static244.aClass40_99) {
									Static434.method6272();
									Static244.aClass40_99 = null;
									return true;
								} else if (Static413.aClass40_160 == Static244.aClass40_99) {
									local216 = Static420.aClass6_Sub14_Sub2_2.method5996();
									local399 = Static420.aClass6_Sub14_Sub2_2.method5991();
									local251 = Static420.aClass6_Sub14_Sub2_2.method6006();
									if (Static407.method5938(local251)) {
										Static290.method4077(local216, local399);
									}
									Static244.aClass40_99 = null;
									return true;
								} else if (Static340.aClass40_143 == Static244.aClass40_99) {
									Static573.anInt9601 = Static420.aClass6_Sub14_Sub2_2.method6041();
									Static244.aClass40_99 = null;
									return true;
								} else if (Static244.aClass40_99 == Static139.aClass40_64) {
									local849 = Static420.aClass6_Sub14_Sub2_2.method5991();
									local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
									local1325 = Static283.aClass44_4.method690(local73).method202(Static420.aClass6_Sub14_Sub2_2);
									Static253.method3574(local73, null, 19, local1325, local849, local849, 0, local849);
									Static244.aClass40_99 = null;
									return true;
								} else if (Static244.aClass40_99 == Static290.aClass40_113) {
									Static185.method2757(false);
									Static244.aClass40_99 = null;
									return true;
								} else if (Static244.aClass40_99 == Static40.aClass40_17) {
									local216 = Static420.aClass6_Sub14_Sub2_2.method6006();
									local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
									local251 = Static420.aClass6_Sub14_Sub2_2.method6006();
									local333 = Static420.aClass6_Sub14_Sub2_2.method6006();
									if (Static407.method5938(local216) && Static375.aClass97ArrayArray1[local73] != null) {
										for (local775 = local251; local775 < local333; local775++) {
											local786 = Static420.aClass6_Sub14_Sub2_2.method5988();
											if (Static375.aClass97ArrayArray1[local73].length > local775 && Static375.aClass97ArrayArray1[local73][local775] != null) {
												Static375.aClass97ArrayArray1[local73][local775].anInt2302 = local786;
											}
										}
									}
									Static244.aClass40_99 = null;
									return true;
								} else {
									@Pc(1938) boolean local1938;
									@Pc(1992) boolean local1992;
									if (Static244.aClass40_99 == Static213.aClass40_11) {
										while (Static420.aClass6_Sub14_Sub2_2.anInt7244 < Static567.anInt9502) {
											local731 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
											local399 = Static420.aClass6_Sub14_Sub2_2.method5991();
											local1325 = Static420.aClass6_Sub14_Sub2_2.method5991();
											local333 = Static420.aClass6_Sub14_Sub2_2.method6006();
											local775 = Static420.aClass6_Sub14_Sub2_2.method6041();
											local1594 = "";
											local1938 = false;
											if (local333 > 0) {
												local1594 = Static420.aClass6_Sub14_Sub2_2.method5991();
												local1938 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
											}
											for (local798 = 0; local798 < Static300.anInt4872; local798++) {
												if (local731) {
													if (local1325.equals(Static489.aStringArray30[local798])) {
														Static489.aStringArray30[local798] = local399;
														local399 = null;
														Static478.aStringArray28[local798] = local1325;
														break;
													}
												} else if (local399.equals(Static489.aStringArray30[local798])) {
													if (Static58.anIntArray63[local798] != local333) {
														local1992 = true;
														for (@Pc(1997) Class102_Sub1_Sub2 local1997 = (Class102_Sub1_Sub2) Static468.aClass249_6.method5817(); local1997 != null; local1997 = (Class102_Sub1_Sub2) Static468.aClass249_6.method5815()) {
															if (local1997.aString101.equals(local399)) {
																if (local333 != 0 && local1997.aShort111 == 0) {
																	local1992 = false;
																	local1997.method7587();
																} else if (local333 == 0 && local1997.aShort111 != 0) {
																	local1997.method7587();
																	local1992 = false;
																}
															}
														}
														if (local1992) {
															Static468.aClass249_6.method5809(new Class102_Sub1_Sub2(local399, local333));
														}
														Static58.anIntArray63[local798] = local333;
													}
													Static478.aStringArray28[local798] = local1325;
													Static279.aStringArray19[local798] = local1594;
													Static413.anIntArray578[local798] = local775;
													Static215.aBooleanArray22[local798] = local1938;
													local399 = null;
													break;
												}
											}
											if (local399 != null && Static300.anInt4872 < 200) {
												Static489.aStringArray30[Static300.anInt4872] = local399;
												Static478.aStringArray28[Static300.anInt4872] = local1325;
												Static58.anIntArray63[Static300.anInt4872] = local333;
												Static279.aStringArray19[Static300.anInt4872] = local1594;
												Static413.anIntArray578[Static300.anInt4872] = local775;
												Static215.aBooleanArray22[Static300.anInt4872] = local1938;
												Static300.anInt4872++;
											}
										}
										Static350.anInt6167 = Static48.anInt821;
										Static163.anInt2861 = 2;
										local73 = Static300.anInt4872;
										while (local73 > 0) {
											local73--;
											local731 = true;
											for (local251 = 0; local251 < local73; local251++) {
												if (Static271.aClass147_2.anInt3691 != Static58.anIntArray63[local251] && Static58.anIntArray63[local251 + 1] == Static271.aClass147_2.anInt3691 || Static58.anIntArray63[local251] == 0 && Static58.anIntArray63[local251 + 1] != 0) {
													local333 = Static58.anIntArray63[local251];
													Static58.anIntArray63[local251] = Static58.anIntArray63[local251 + 1];
													Static58.anIntArray63[local251 + 1] = local333;
													local1567 = Static279.aStringArray19[local251];
													Static279.aStringArray19[local251] = Static279.aStringArray19[local251 + 1];
													Static279.aStringArray19[local251 + 1] = local1567;
													local1594 = Static489.aStringArray30[local251];
													Static489.aStringArray30[local251] = Static489.aStringArray30[local251 + 1];
													Static489.aStringArray30[local251 + 1] = local1594;
													local893 = Static478.aStringArray28[local251];
													Static478.aStringArray28[local251] = Static478.aStringArray28[local251 + 1];
													Static478.aStringArray28[local251 + 1] = local893;
													local798 = Static413.anIntArray578[local251];
													Static413.anIntArray578[local251] = Static413.anIntArray578[local251 + 1];
													Static413.anIntArray578[local251 + 1] = local798;
													local1992 = Static215.aBooleanArray22[local251];
													Static215.aBooleanArray22[local251] = Static215.aBooleanArray22[local251 + 1];
													Static215.aBooleanArray22[local251 + 1] = local1992;
													local731 = false;
												}
											}
											if (local731) {
												break;
											}
										}
										Static244.aClass40_99 = null;
										return true;
									} else if (Static244.aClass40_99 == Static292.aClass40_115) {
										local216 = Static420.aClass6_Sub14_Sub2_2.method6032();
										local73 = Static420.aClass6_Sub14_Sub2_2.method6013();
										local251 = Static420.aClass6_Sub14_Sub2_2.method6013();
										local333 = Static420.aClass6_Sub14_Sub2_2.method5982();
										if (local333 == 65535) {
											local333 = -1;
										}
										if (Static407.method5938(local216)) {
											Static282.method4032(local73, local251, local333);
											@Pc(2323) Class110 local2323 = Static295.aClass256_2.method5924(local333);
											Static199.method2984(local2323.anInt2628, local2323.anInt2655, local2323.anInt2621, local251);
											Static254.method3586(local2323.anInt2611, local2323.anInt2667, local251, local2323.anInt2669);
										}
										Static244.aClass40_99 = null;
										return true;
									} else if (Static244.aClass40_99 == Static477.aClass40_182) {
										Static287.method7858(Static359.aClass216_13);
										Static244.aClass40_99 = null;
										return true;
									} else {
										@Pc(2902) int local2902;
										@Pc(2599) int local2599;
										@Pc(2476) int local2476;
										if (Static244.aClass40_99 == Static180.aClass40_189) {
											local216 = Static420.aClass6_Sub14_Sub2_2.method6006();
											local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
											local251 = Static420.aClass6_Sub14_Sub2_2.method6006();
											local333 = Static420.aClass6_Sub14_Sub2_2.method6041();
											local775 = Static420.aClass6_Sub14_Sub2_2.method6013();
											local880 = (local333 & 0x80) != 0;
											if (local775 >> 30 == 0) {
												@Pc(2506) Class237 local2506;
												@Pc(2528) Class108 local2528;
												@Pc(2522) Class108 local2522;
												if (local775 >> 29 != 0) {
													local792 = local775 & 0xFFFF;
													@Pc(2730) Class6_Sub28 local2730 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local792);
													if (local2730 != null) {
														@Pc(2735) Class29_Sub2_Sub1_Sub1 local2735 = local2730.aClass29_Sub2_Sub1_Sub1_2;
														if (local216 == 65535) {
															local216 = -1;
														}
														@Pc(2744) boolean local2744 = true;
														local2599 = local880 ? local2735.anInt8534 : local2735.anInt8525;
														if (local216 != -1 && local2599 != -1) {
															if (local216 == local2599) {
																local2506 = Static448.aClass117_2.method2317(local216);
																if (local2506.aBoolean443 && local2506.anInt6458 != -1) {
																	local2522 = Static31.aClass345_1.method7798(local2506.anInt6458);
																	local1360 = local2522.anInt2591;
																	if (local1360 == 0 || local1360 == 2) {
																		local2744 = false;
																	} else if (local1360 == 1) {
																		local2744 = true;
																	}
																}
															} else {
																local2506 = Static448.aClass117_2.method2317(local216);
																@Pc(2775) Class237 local2775 = Static448.aClass117_2.method2317(local2599);
																if (local2506.anInt6458 != -1 && local2775.anInt6458 != -1) {
																	local2528 = Static31.aClass345_1.method7798(local2506.anInt6458);
																	@Pc(2795) Class108 local2795 = Static31.aClass345_1.method7798(local2775.anInt6458);
																	if (local2528.anInt2604 < local2795.anInt2604) {
																		local2744 = false;
																	}
																}
															}
														}
														if (local2744) {
															if (local880) {
																local2735.anInt8543 = Static358.anInt6263 + local73;
																local2735.anInt8534 = local216;
																local2735.anInt8550 = 1;
																local2735.anInt8555 = 0;
																local2735.anInt8523 = local251;
																local2735.anInt8526 = local333 & 0x7;
																local2735.anInt8512 = 0;
																if (Static358.anInt6263 < local2735.anInt8543) {
																	local2735.anInt8555 = -1;
																}
																if (local2735.anInt8534 != -1 && Static358.anInt6263 == local2735.anInt8543) {
																	local2902 = Static448.aClass117_2.method2317(local2735.anInt8534).anInt6458;
																	if (local2902 != -1) {
																		local2522 = Static31.aClass345_1.method7798(local2902);
																		if (local2522 != null && local2522.anIntArray312 != null) {
																			Static294.method4111(0, local2735.anInt9218, false, local2735.anInt9222, local2522, local2735.aByte103);
																		}
																	}
																}
															} else {
																local2735.anInt8542 = 0;
																local2735.anInt8519 = local251;
																local2735.anInt8561 = 0;
																local2735.anInt8530 = local333 & 0x7;
																local2735.anInt8548 = Static358.anInt6263 + local73;
																local2735.anInt8525 = local216;
																local2735.anInt8529 = 1;
																if (Static358.anInt6263 < local2735.anInt8548) {
																	local2735.anInt8542 = -1;
																}
																if (local2735.anInt8525 != -1 && local2735.anInt8548 == Static358.anInt6263) {
																	local2902 = Static448.aClass117_2.method2317(local2735.anInt8525).anInt6458;
																	if (local2902 != -1) {
																		local2522 = Static31.aClass345_1.method7798(local2902);
																		if (local2522 != null && local2522.anIntArray312 != null) {
																			Static294.method4111(0, local2735.anInt9218, false, local2735.anInt9222, local2522, local2735.aByte103);
																		}
																	}
																}
															}
														}
													}
												} else if (local775 >> 28 != 0) {
													local792 = local775 & 0xFFFF;
													@Pc(2420) Class29_Sub2_Sub1_Sub2 local2420;
													if (local792 == Static44.anInt711) {
														local2420 = Static426.aClass29_Sub2_Sub1_Sub2_2;
													} else {
														local2420 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local792];
													}
													if (local2420 != null) {
														if (local216 == 65535) {
															local216 = -1;
														}
														local1992 = true;
														local932 = local880 ? local2420.anInt8534 : local2420.anInt8525;
														@Pc(2473) Class108 local2473;
														if (local216 != -1 && local932 != -1) {
															@Pc(2460) Class237 local2460;
															if (local932 == local216) {
																local2460 = Static448.aClass117_2.method2317(local216);
																if (local2460.aBoolean443 && local2460.anInt6458 != -1) {
																	local2473 = Static31.aClass345_1.method7798(local2460.anInt6458);
																	local2476 = local2473.anInt2591;
																	if (local2476 == 0 || local2476 == 2) {
																		local1992 = false;
																	} else if (local2476 == 1) {
																		local1992 = true;
																	}
																}
															} else {
																local2460 = Static448.aClass117_2.method2317(local216);
																local2506 = Static448.aClass117_2.method2317(local932);
																if (local2460.anInt6458 != -1 && local2506.anInt6458 != -1) {
																	local2522 = Static31.aClass345_1.method7798(local2460.anInt6458);
																	local2528 = Static31.aClass345_1.method7798(local2506.anInt6458);
																	if (local2528.anInt2604 > local2522.anInt2604) {
																		local1992 = false;
																	}
																}
															}
														}
														if (local1992) {
															if (local880) {
																local2420.anInt8543 = Static358.anInt6263 + local73;
																local2420.anInt8526 = local333 & 0x7;
																local2420.anInt8555 = 0;
																local2420.anInt8512 = 0;
																local2420.anInt8534 = local216;
																local2420.anInt8523 = local251;
																local2420.anInt8550 = 1;
																if (local2420.anInt8543 > Static358.anInt6263) {
																	local2420.anInt8555 = -1;
																}
																if (local2420.anInt8534 == 65535) {
																	local2420.anInt8534 = -1;
																}
																if (local2420.anInt8534 != -1 && local2420.anInt8543 == Static358.anInt6263) {
																	local2599 = Static448.aClass117_2.method2317(local2420.anInt8534).anInt6458;
																	if (local2599 != -1) {
																		local2473 = Static31.aClass345_1.method7798(local2599);
																		if (local2473 != null && local2473.anIntArray312 != null) {
																			Static294.method4111(0, local2420.anInt9218, Static426.aClass29_Sub2_Sub1_Sub2_2 == local2420, local2420.anInt9222, local2473, local2420.aByte103);
																		}
																	}
																}
															} else {
																local2420.anInt8525 = local216;
																local2420.anInt8530 = local333 & 0x7;
																local2420.anInt8519 = local251;
																local2420.anInt8561 = 0;
																local2420.anInt8542 = 0;
																local2420.anInt8529 = 1;
																local2420.anInt8548 = Static358.anInt6263 + local73;
																if (local2420.anInt8548 > Static358.anInt6263) {
																	local2420.anInt8542 = -1;
																}
																if (local2420.anInt8525 == 65535) {
																	local2420.anInt8525 = -1;
																}
																if (local2420.anInt8525 != -1 && local2420.anInt8548 == Static358.anInt6263) {
																	local2599 = Static448.aClass117_2.method2317(local2420.anInt8525).anInt6458;
																	if (local2599 != -1) {
																		local2473 = Static31.aClass345_1.method7798(local2599);
																		if (local2473 != null && local2473.anIntArray312 != null) {
																			Static294.method4111(0, local2420.anInt9218, local2420 == Static426.aClass29_Sub2_Sub1_Sub2_2, local2420.anInt9222, local2473, local2420.aByte103);
																		}
																	}
																}
															}
														}
													}
												}
											} else {
												local792 = local775 >> 28 & 0x3;
												local798 = (local775 >> 14 & 0x3FFF) - Static218.anInt3718;
												local802 = (local775 & 0x3FFF) - Static167.anInt3048;
												if (local798 >= 0 && local802 >= 0 && Static301.anInt4912 > local798 && local802 < Static473.anInt7969) {
													local932 = local798 * 512 + 256;
													local2599 = local802 * 512 + 256;
													local2902 = local792;
													if (local792 < 3 && Static26.method401(local802, local798)) {
														local2902 = local792 + 1;
													}
													@Pc(3092) Class29_Sub2_Sub2 local3092 = new Class29_Sub2_Sub2(local216, 0, Static358.anInt6263, local792, local2902, local932, Static490.method6768(local932, local792, local2599) - local251, local2599, local798, local798, local802, local802, local333 & 0x7);
													Static463.aClass275_203.method6370(new Class6_Sub1_Sub11(local3092));
												}
											}
											Static244.aClass40_99 = null;
											return true;
										} else if (Static46.aClass40_23 == Static244.aClass40_99) {
											Static392.anInt6964 = Static420.aClass6_Sub14_Sub2_2.method6020();
											Static463.anInt9619 = Static420.aClass6_Sub14_Sub2_2.method5983() << 3;
											Static479.anInt9649 = Static420.aClass6_Sub14_Sub2_2.method6034() << 3;
											Static244.aClass40_99 = null;
											return true;
										} else if (Static11.aClass40_3 == Static244.aClass40_99) {
											local216 = Static420.aClass6_Sub14_Sub2_2.method6006();
											local73 = Static420.aClass6_Sub14_Sub2_2.method6041();
											Static505.aClass30_1.method501(local216, local73);
											Static244.aClass40_99 = null;
											return true;
										} else if (Static244.aClass40_99 == Static507.aClass40_177) {
											local216 = Static420.aClass6_Sub14_Sub2_2.method6020();
											local73 = Static420.aClass6_Sub14_Sub2_2.method5996();
											local860 = (local216 & 0x1) == 1;
											Static40.method565(local73, local860);
											Static508.anIntArray662[Static265.anInt4387++ & 0x1F] = local73;
											Static244.aClass40_99 = null;
											return true;
										} else if (Static333.aClass40_142 == Static244.aClass40_99) {
											local216 = Static420.aClass6_Sub14_Sub2_2.method6006();
											@Pc(3202) Class29_Sub2_Sub1_Sub2 local3202;
											if (Static44.anInt711 == local216) {
												local3202 = Static426.aClass29_Sub2_Sub1_Sub2_2;
											} else {
												local3202 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local216];
											}
											if (local3202 == null) {
												Static244.aClass40_99 = null;
												return true;
											}
											local251 = Static420.aClass6_Sub14_Sub2_2.method6006();
											local333 = Static420.aClass6_Sub14_Sub2_2.method6041();
											@Pc(3230) boolean local3230 = (local251 & 0x8000) != 0;
											if (local3202.aString108 != null && local3202.aClass246_1 != null) {
												local880 = false;
												if (local333 <= 1) {
													if (!local3230 && (Static451.aBoolean532 && !Static558.aBoolean654 || Static475.aBoolean548)) {
														local880 = true;
													} else if (Static322.method4981(local3202.aString108)) {
														local880 = true;
													}
												}
												if (!local880 && Static133.anInt4720 == 0) {
													local798 = -1;
													if (local3230) {
														local251 &= 0x7FFF;
														@Pc(3286) Class192 local3286 = Static269.method3820(Static420.aClass6_Sub14_Sub2_2);
														local798 = local3286.anInt4838;
														local893 = local3286.aClass6_Sub1_Sub2_1.method202(Static420.aClass6_Sub14_Sub2_2);
													} else {
														local893 = Static263.method3732(Static375.method5497(Static420.aClass6_Sub14_Sub2_2));
													}
													local3202.aString106 = local893.trim();
													local3202.anInt8521 = local251 & 0xFF;
													local3202.anInt8533 = local251 >> 8;
													local3202.anInt8524 = 150;
													if (local333 == 1 || local333 == 2) {
														local802 = local3230 ? 17 : 1;
													} else {
														local802 = local3230 ? 17 : 2;
													}
													if (local333 == 2) {
														Static253.method3574(local798, null, local802, local893, local3202.aString107, "<img=1>" + local3202.method7017(), 0, "<img=1>" + local3202.method7018());
													} else if (local333 == 1) {
														Static253.method3574(local798, null, local802, local893, local3202.aString107, "<img=0>" + local3202.method7017(), 0, "<img=0>" + local3202.method7018());
													} else {
														Static253.method3574(local798, null, local802, local893, local3202.aString107, local3202.method7017(), 0, local3202.method7018());
													}
												}
											}
											Static244.aClass40_99 = null;
											return true;
										} else if (Static210.aClass40_84 == Static244.aClass40_99) {
											Static155.method2280(false);
											Static244.aClass40_99 = null;
											return false;
										} else if (Static244.aClass40_99 == Static194.aClass40_79) {
											local216 = Static420.aClass6_Sub14_Sub2_2.method6041();
											local73 = Static420.aClass6_Sub14_Sub2_2.method6032();
											if (local73 == 65535) {
												local73 = -1;
											}
											local1325 = Static420.aClass6_Sub14_Sub2_2.method5991();
											local333 = Static420.aClass6_Sub14_Sub2_2.method6041();
											if (local216 >= 1 && local216 <= 8) {
												if (local1325.equalsIgnoreCase("null")) {
													local1325 = null;
												}
												Static293.aStringArray20[local216 - 1] = local1325;
												Static556.anIntArray698[local216 - 1] = local73;
												Static24.aBooleanArray28[local216 - 1] = local333 == 0;
											}
											Static244.aClass40_99 = null;
											return true;
										} else if (Static237.aClass40_94 == Static244.aClass40_99) {
											local216 = Static420.aClass6_Sub14_Sub2_2.method5982();
											local73 = Static420.aClass6_Sub14_Sub2_2.method5996();
											local251 = Static420.aClass6_Sub14_Sub2_2.method6013();
											local333 = Static420.aClass6_Sub14_Sub2_2.method5982();
											if (Static407.method5938(local333)) {
												Static313.method4860((local73 << 16) + local216, local251);
											}
											Static244.aClass40_99 = null;
											return true;
										} else if (Static371.aClass40_153 == Static244.aClass40_99) {
											if (Static147.aFrame1 != null) {
												Static111.method1753(-1, -1, Static480.aClass6_Sub37_Sub1_1.anInt6045, false);
											}
											@Pc(3550) byte[] local3550 = new byte[Static567.anInt9502];
											Static420.aClass6_Sub14_Sub2_2.method6046(local3550, Static567.anInt9502);
											local399 = Static196.method2960(Static567.anInt9502, local3550, 0);
											Static577.method5079(Static152.aClass57_4, Static567.anInt9503 == 1, local399, true);
											Static244.aClass40_99 = null;
											return true;
										} else if (Static244.aClass40_99 == Static224.aClass40_90) {
											Static188.anInt3276 = Static420.aClass6_Sub14_Sub2_2.method5994();
											Static451.aBoolean532 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
											Static244.aClass40_99 = null;
											return true;
										} else if (Static259.aClass40_102 == Static244.aClass40_99) {
											Static287.method7858(Static336.aClass216_12);
											Static244.aClass40_99 = null;
											return true;
										} else if (Static244.aClass40_99 == Static469.aClass40_169) {
											local216 = Static420.aClass6_Sub14_Sub2_2.method6032();
											local73 = Static420.aClass6_Sub14_Sub2_2.method6028();
											local251 = Static420.aClass6_Sub14_Sub2_2.method6032();
											local333 = Static420.aClass6_Sub14_Sub2_2.method5982();
											local775 = Static420.aClass6_Sub14_Sub2_2.method6032();
											if (Static407.method5938(local216)) {
												Static199.method2984(local333, local251, local775, local73);
											}
											Static244.aClass40_99 = null;
											return true;
										} else if (Static244.aClass40_99 == Static267.aClass40_105) {
											Static155.method2280(Static466.aBoolean539);
											Static244.aClass40_99 = null;
											return false;
										} else if (Static244.aClass40_99 == Static430.aClass40_129) {
											local216 = Static420.aClass6_Sub14_Sub2_2.method6028();
											local73 = Static420.aClass6_Sub14_Sub2_2.method6032();
											Static505.aClass30_1.method500(local73, local216);
											Static244.aClass40_99 = null;
											return true;
										} else if (Static244.aClass40_99 == Static126.aClass40_55) {
											Static392.anInt6964 = Static420.aClass6_Sub14_Sub2_2.method6026();
											Static479.anInt9649 = Static420.aClass6_Sub14_Sub2_2.method5987() << 3;
											Static463.anInt9619 = Static420.aClass6_Sub14_Sub2_2.method5983() << 3;
											for (@Pc(3700) Class6_Sub32 local3700 = (Class6_Sub32) Static303.aClass212_22.method5099(); local3700 != null; local3700 = (Class6_Sub32) Static303.aClass212_22.method5103()) {
												local73 = (int) (local3700.aLong249 >> 28 & 0x3L);
												local251 = (int) (local3700.aLong249 & 0x3FFFL);
												local333 = local251 - Static218.anInt3718;
												local775 = (int) (local3700.aLong249 >> 14 & 0x3FFFL);
												local786 = local775 - Static167.anInt3048;
												if (Static392.anInt6964 == local73 && local333 >= Static479.anInt9649 && Static479.anInt9649 + 8 > local333 && Static463.anInt9619 <= local786 && local786 < Static463.anInt9619 + 8) {
													local3700.method7849();
													if (local333 >= 0 && local786 >= 0 && Static301.anInt4912 > local333 && Static473.anInt7969 > local786) {
														Static20.method287(Static392.anInt6964, local333, local786);
													}
												}
											}
											for (@Pc(3802) Class6_Sub51 local3802 = (Class6_Sub51) Static419.aClass275_193.method6366(); local3802 != null; local3802 = (Class6_Sub51) Static419.aClass275_193.method6364()) {
												if (local3802.anInt9518 >= Static479.anInt9649 && local3802.anInt9518 < Static479.anInt9649 + 8 && Static463.anInt9619 <= local3802.anInt9513 && Static463.anInt9619 + 8 > local3802.anInt9513 && Static392.anInt6964 == local3802.anInt9521) {
													local3802.anInt9529 = 0;
												}
											}
											Static244.aClass40_99 = null;
											return true;
										} else {
											@Pc(3897) long local3897;
											@Pc(3915) Class6_Sub44 local3915;
											@Pc(3903) Class6_Sub44 local3903;
											if (Static65.aClass40_27 == Static244.aClass40_99) {
												local216 = Static420.aClass6_Sub14_Sub2_2.method6032();
												local73 = Static420.aClass6_Sub14_Sub2_2.method6032();
												if (local73 == 65535) {
													local73 = -1;
												}
												local251 = Static420.aClass6_Sub14_Sub2_2.method6014();
												local333 = Static420.aClass6_Sub14_Sub2_2.method5982();
												local775 = Static420.aClass6_Sub14_Sub2_2.method6032();
												if (local775 == 65535) {
													local775 = -1;
												}
												if (Static407.method5938(local333)) {
													for (local786 = local775; local786 <= local73; local786++) {
														local3897 = ((long) local251 << 32) + (long) local786;
														local3903 = (Class6_Sub44) Static575.aClass212_41.method5106(local3897);
														if (local3903 != null) {
															local3915 = new Class6_Sub44(local3903.anInt7805, local216);
															local3903.method7849();
														} else if (local786 == -1) {
															local3915 = new Class6_Sub44(Static133.method4068(local251).aClass6_Sub44_1.anInt7805, local216);
														} else {
															local3915 = new Class6_Sub44(0, local216);
														}
														Static575.aClass212_41.method5104(local3897, local3915);
													}
												}
												Static244.aClass40_99 = null;
												return true;
											}
											@Pc(3974) boolean local3974;
											if (Static244.aClass40_99 == Static438.aClass40_166) {
												local216 = Static420.aClass6_Sub14_Sub2_2.method6041();
												local3974 = (local216 & 0x1) == 1;
												local1325 = Static420.aClass6_Sub14_Sub2_2.method5991();
												local1565 = Static420.aClass6_Sub14_Sub2_2.method5991();
												if (local1565.equals("")) {
													local1565 = local1325;
												}
												local1567 = Static420.aClass6_Sub14_Sub2_2.method5991();
												local1594 = Static420.aClass6_Sub14_Sub2_2.method5991();
												if (local1594.equals("")) {
													local1594 = local1567;
												}
												if (local3974) {
													for (local792 = 0; local792 < Static383.anInt6691; local792++) {
														if (Static521.aStringArray32[local792].equals(local1594)) {
															Static353.aStringArray23[local792] = local1325;
															Static521.aStringArray32[local792] = local1565;
															Static129.aStringArray10[local792] = local1567;
															Static195.aStringArray14[local792] = local1594;
															break;
														}
													}
												} else {
													Static353.aStringArray23[Static383.anInt6691] = local1325;
													Static521.aStringArray32[Static383.anInt6691] = local1565;
													Static129.aStringArray10[Static383.anInt6691] = local1567;
													Static195.aStringArray14[Static383.anInt6691] = local1594;
													Static354.aBooleanArray34[Static383.anInt6691] = (local216 & 0x2) == 2;
													Static383.anInt6691++;
												}
												Static244.aClass40_99 = null;
												Static350.anInt6167 = Static48.anInt821;
												return true;
											} else if (Static292.aClass40_114 == Static244.aClass40_99) {
												Static479.anInt9649 = Static420.aClass6_Sub14_Sub2_2.method5983() << 3;
												Static392.anInt6964 = Static420.aClass6_Sub14_Sub2_2.method6041();
												Static463.anInt9619 = Static420.aClass6_Sub14_Sub2_2.method5983() << 3;
												while (Static420.aClass6_Sub14_Sub2_2.anInt7244 < Static567.anInt9502) {
													@Pc(4105) Class216 local4105 = Static162.method2376()[Static420.aClass6_Sub14_Sub2_2.method6041()];
													Static287.method7858(local4105);
												}
												Static244.aClass40_99 = null;
												return true;
											} else if (Static274.aClass40_78 == Static244.aClass40_99) {
												Static287.aString122 = Static567.anInt9502 > 2 ? Static420.aClass6_Sub14_Sub2_2.method5991() : Static141.aClass104_71.method2145(Static470.anInt7957);
												Static132.anInt2327 = Static567.anInt9502 <= 0 ? -1 : Static420.aClass6_Sub14_Sub2_2.method6006();
												Static244.aClass40_99 = null;
												if (Static132.anInt2327 == 65535) {
													Static132.anInt2327 = -1;
												}
												return true;
											} else if (Static318.aClass40_134 == Static244.aClass40_99) {
												Static350.anInt6167 = Static48.anInt821;
												Static244.aClass40_99 = null;
												Static163.anInt2861 = 1;
												return true;
											} else if (Static244.aClass40_99 == Static284.aClass40_112) {
												Static287.method7858(Static20.aClass216_2);
												Static244.aClass40_99 = null;
												return true;
											} else if (Static244.aClass40_99 == Static507.aClass40_178) {
												local849 = Static420.aClass6_Sub14_Sub2_2.method5991();
												local399 = Static263.method3732(Static375.method5497(Static420.aClass6_Sub14_Sub2_2));
												Static164.method2396(local849, 6, local849, local399, 0, local849);
												Static244.aClass40_99 = null;
												return true;
											} else if (Static125.aClass40_53 == Static244.aClass40_99) {
												Static287.method7858(Static53.aClass216_4);
												Static244.aClass40_99 = null;
												return true;
											} else if (Static481.aClass40_174 == Static244.aClass40_99) {
												Static287.method7858(Static467.aClass216_15);
												Static244.aClass40_99 = null;
												return true;
											} else if (Static244.aClass40_99 == Static538.aClass40_186) {
												local216 = Static420.aClass6_Sub14_Sub2_2.method6006();
												local73 = Static420.aClass6_Sub14_Sub2_2.method6041();
												local860 = (local73 & 0x1) == 1;
												while (Static567.anInt9502 > Static420.aClass6_Sub14_Sub2_2.anInt7244) {
													local333 = Static420.aClass6_Sub14_Sub2_2.method5998();
													local775 = Static420.aClass6_Sub14_Sub2_2.method6006();
													local786 = 0;
													if (local775 != 0) {
														local786 = Static420.aClass6_Sub14_Sub2_2.method6041();
														if (local786 == 255) {
															local786 = Static420.aClass6_Sub14_Sub2_2.method6027();
														}
													}
													Static274.method2852(local786, local216, local860, local333, local775 - 1);
												}
												Static508.anIntArray662[Static265.anInt4387++ & 0x1F] = local216;
												Static244.aClass40_99 = null;
												return true;
											} else if (Static65.aClass40_28 == Static244.aClass40_99) {
												local216 = Static420.aClass6_Sub14_Sub2_2.method6006();
												local73 = Static420.aClass6_Sub14_Sub2_2.method6027();
												if (Static407.method5938(local216)) {
													@Pc(4324) Class6_Sub31 local4324 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local73);
													if (local4324 != null) {
														Static160.method2336(true, false, local4324);
													}
													if (Static473.aClass97_13 != null) {
														Static390.method5794(Static473.aClass97_13);
														Static473.aClass97_13 = null;
													}
												}
												Static244.aClass40_99 = null;
												return true;
											} else if (Static435.aClass40_165 == Static244.aClass40_99) {
												local216 = Static420.aClass6_Sub14_Sub2_2.method6027();
												local73 = Static420.aClass6_Sub14_Sub2_2.method6027();
												local251 = Static420.aClass6_Sub14_Sub2_2.method5996();
												if (Static407.method5938(local251)) {
													@Pc(4368) Class6_Sub31 local4368 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local216);
													local445 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local73);
													if (local445 != null) {
														Static160.method2336(local4368 == null || local4368.anInt4563 != local445.anInt4563, false, local445);
													}
													if (local4368 != null) {
														local4368.method7849();
														Static564.aClass212_39.method5104((long) local73, local4368);
													}
													@Pc(4410) Class97 local4410 = Static133.method4068(local216);
													if (local4410 != null) {
														Static390.method5794(local4410);
													}
													local4410 = Static133.method4068(local73);
													if (local4410 != null) {
														Static390.method5794(local4410);
														Static443.method6362(true, local4410);
													}
													if (Static487.anInt8139 != -1) {
														Static529.method7376(1, Static487.anInt8139);
													}
												}
												Static244.aClass40_99 = null;
												return true;
											} else if (Static244.aClass40_99 == Static278.aClass40_155) {
												local216 = Static420.aClass6_Sub14_Sub2_2.method6026();
												local73 = Static420.aClass6_Sub14_Sub2_2.method6041();
												if (local216 == 255) {
													local73 = -1;
													local216 = -1;
												}
												Static143.method6495(local216, local73);
												Static244.aClass40_99 = null;
												return true;
											} else if (Static276.aClass40_108 == Static244.aClass40_99) {
												Static287.method7858(Static255.aClass216_6);
												Static244.aClass40_99 = null;
												return true;
											} else if (Static244.aClass40_99 == Static167.aClass40_72) {
												local216 = Static420.aClass6_Sub14_Sub2_2.method6014();
												local73 = Static420.aClass6_Sub14_Sub2_2.method6013();
												local251 = Static420.aClass6_Sub14_Sub2_2.method6032();
												local333 = Static420.aClass6_Sub14_Sub2_2.method6006();
												if (Static407.method5938(local333)) {
													Static270.method2048(local73, 5, local251, local216);
												}
												Static244.aClass40_99 = null;
												return true;
											} else if (Static358.aClass40_149 == Static244.aClass40_99) {
												local216 = Static420.aClass6_Sub14_Sub2_2.method5982();
												if (local216 == 65535) {
													local216 = -1;
												}
												local73 = Static420.aClass6_Sub14_Sub2_2.method6014();
												local251 = Static420.aClass6_Sub14_Sub2_2.method5982();
												local333 = Static420.aClass6_Sub14_Sub2_2.method6032();
												if (local333 == 65535) {
													local333 = -1;
												}
												local775 = Static420.aClass6_Sub14_Sub2_2.method6028();
												if (Static407.method5938(local251)) {
													for (local786 = local333; local786 <= local216; local786++) {
														local3897 = ((long) local73 << 32) + ((long) local786);
														local3903 = (Class6_Sub44) Static575.aClass212_41.method5106(local3897);
														if (local3903 != null) {
															local3915 = new Class6_Sub44(local775, local3903.anInt7804);
															local3903.method7849();
														} else if (local786 == -1) {
															local3915 = new Class6_Sub44(local775, Static133.method4068(local73).aClass6_Sub44_1.anInt7804);
														} else {
															local3915 = new Class6_Sub44(local775, -1);
														}
														Static575.aClass212_41.method5104(local3897, local3915);
													}
												}
												Static244.aClass40_99 = null;
												return true;
											} else if (Static244.aClass40_99 == Static122.aClass40_52) {
												local216 = Static420.aClass6_Sub14_Sub2_2.method6006();
												local73 = Static420.aClass6_Sub14_Sub2_2.method6041();
												local251 = Static420.aClass6_Sub14_Sub2_2.method6041();
												local333 = Static420.aClass6_Sub14_Sub2_2.method6006() << 2;
												local775 = Static420.aClass6_Sub14_Sub2_2.method6041();
												local786 = Static420.aClass6_Sub14_Sub2_2.method6041();
												if (Static407.method5938(local216)) {
													Static495.method6814(local786, local775, local333, local251, local73, true);
												}
												Static244.aClass40_99 = null;
												return true;
											} else if (Static244.aClass40_99 == Static452.aClass40_168) {
												Static93.anInt1565 = Static420.aClass6_Sub14_Sub2_2.method6008();
												Static244.aClass40_99 = null;
												Static555.anInt8692 = Static48.anInt821;
												return true;
											} else if (Static244.aClass40_99 == Static364.aClass40_151) {
												Static505.aClass30_1.method499();
												Static244.aClass40_99 = null;
												Static20.anInt365 += 32;
												return true;
											} else if (Static244.aClass40_99 == Static35.aClass40_13) {
												local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
												local251 = Static420.aClass6_Sub14_Sub2_2.method6027();
												local333 = Static420.aClass6_Sub14_Sub2_2.method6032();
												if (Static407.method5938(local333)) {
													Static165.method2588(local251, local73);
												}
												Static244.aClass40_99 = null;
												return true;
											} else if (Static244.aClass40_99 == Static96.aClass40_39) {
												Static287.method7858(Static321.aClass216_11);
												Static244.aClass40_99 = null;
												return true;
											} else if (Static477.aClass40_183 == Static244.aClass40_99) {
												local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
												local251 = Static420.aClass6_Sub14_Sub2_2.method6014();
												if (Static407.method5938(local73)) {
													Static270.method2048(0, 5, Static44.anInt711, local251);
												}
												Static244.aClass40_99 = null;
												return true;
											} else if (Static244.aClass40_99 == Static553.aClass40_190) {
												local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
												if (Static407.method5938(local73)) {
													Static498.method6884();
												}
												Static244.aClass40_99 = null;
												return true;
											} else if (Static244.aClass40_99 == Static565.aClass40_196) {
												local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
												if (local73 == 65535) {
													local73 = -1;
												}
												local251 = Static420.aClass6_Sub14_Sub2_2.method6041();
												local333 = Static420.aClass6_Sub14_Sub2_2.method6006();
												local775 = Static420.aClass6_Sub14_Sub2_2.method6041();
												Static533.method7409(local775, local73, local251, local333);
												Static244.aClass40_99 = null;
												return true;
											} else if (Static205.aClass40_82 == Static244.aClass40_99) {
												local73 = Static420.aClass6_Sub14_Sub2_2.method6032();
												local251 = Static420.aClass6_Sub14_Sub2_2.method6013();
												local333 = Static420.aClass6_Sub14_Sub2_2.method6006();
												local775 = Static420.aClass6_Sub14_Sub2_2.method6006();
												local786 = Static420.aClass6_Sub14_Sub2_2.method5996();
												if (Static407.method5938(local333)) {
													Static270.method2048(local786, 7, local775 << 16 | local73, local251);
												}
												Static244.aClass40_99 = null;
												return true;
											} else if (Static261.aClass40_103 == Static244.aClass40_99) {
												local73 = Static420.aClass6_Sub14_Sub2_2.method6041();
												local251 = Static420.aClass6_Sub14_Sub2_2.method6032();
												if (local251 == 65535) {
													local251 = -1;
												}
												local333 = Static420.aClass6_Sub14_Sub2_2.method6041();
												Static5.method122(local251, local333, local73);
												Static244.aClass40_99 = null;
												return true;
											} else if (Static38.aClass40_16 == Static244.aClass40_99) {
												local73 = Static420.aClass6_Sub14_Sub2_2.method6019();
												local251 = Static420.aClass6_Sub14_Sub2_2.method6006();
												if (local251 == 65535) {
													local251 = -1;
												}
												local333 = Static420.aClass6_Sub14_Sub2_2.method6026();
												Static299.method4154(local251, local333, local73);
												Static244.aClass40_99 = null;
												return true;
											} else if (Static244.aClass40_99 == Static58.aClass40_25) {
												local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
												local1325 = Static420.aClass6_Sub14_Sub2_2.method5991();
												@Pc(4929) Object[] local4929 = new Object[local1325.length() + 1];
												for (local775 = local1325.length() - 1; local775 >= 0; local775--) {
													if (local1325.charAt(local775) == 's') {
														local4929[local775 + 1] = Static420.aClass6_Sub14_Sub2_2.method5991();
													} else {
														local4929[local775 + 1] = Integer.valueOf(Static420.aClass6_Sub14_Sub2_2.method6027());
													}
												}
												local4929[0] = Integer.valueOf(Static420.aClass6_Sub14_Sub2_2.method6027());
												if (Static407.method5938(local73)) {
													@Pc(4985) Class6_Sub36 local4985 = new Class6_Sub36();
													local4985.anObjectArray34 = local4929;
													Static100.method1639(local4985);
												}
												Static244.aClass40_99 = null;
												return true;
											} else {
												@Pc(5005) byte local5005;
												if (Static324.aClass40_137 == Static244.aClass40_99) {
													local73 = Static420.aClass6_Sub14_Sub2_2.method6032();
													local5005 = Static420.aClass6_Sub14_Sub2_2.method5987();
													Static505.aClass30_1.method500(local73, local5005);
													Static244.aClass40_99 = null;
													return true;
												} else if (Static139.aClass40_63 == Static244.aClass40_99) {
													if (Static21.method291(Static146.anInt2581)) {
														Static105.anInt1967 = (int) ((float) Static420.aClass6_Sub14_Sub2_2.method6006() * 2.5F);
													} else {
														Static105.anInt1967 = Static420.aClass6_Sub14_Sub2_2.method6006() * 30;
													}
													Static555.anInt8692 = Static48.anInt821;
													Static244.aClass40_99 = null;
													return true;
												} else if (Static418.aClass40_162 == Static244.aClass40_99) {
													for (local73 = 0; local73 < Static346.aClass29_Sub2_Sub1_Sub2Array1.length; local73++) {
														if (Static346.aClass29_Sub2_Sub1_Sub2Array1[local73] != null) {
															Static346.aClass29_Sub2_Sub1_Sub2Array1[local73].anInt8538 = -1;
														}
													}
													for (local251 = 0; local251 < Static505.anInt8419; local251++) {
														Static354.aClass6_Sub28Array1[local251].aClass29_Sub2_Sub1_Sub1_2.anInt8538 = -1;
													}
													Static244.aClass40_99 = null;
													return true;
												} else if (Static244.aClass40_99 == Static219.aClass40_87) {
													local73 = Static420.aClass6_Sub14_Sub2_2.method6026();
													local251 = Static420.aClass6_Sub14_Sub2_2.method5982();
													if (Static407.method5938(local251)) {
														Static176.anInt3154 = local73;
													}
													Static244.aClass40_99 = null;
													return true;
												} else {
													@Pc(5142) long local5142;
													if (Static24.aClass40_124 == Static244.aClass40_99) {
														local3974 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
														local1325 = Static420.aClass6_Sub14_Sub2_2.method5991();
														local1565 = local1325;
														if (local3974) {
															local1565 = Static420.aClass6_Sub14_Sub2_2.method5991();
														}
														local5142 = Static420.aClass6_Sub14_Sub2_2.method6006();
														local3897 = Static420.aClass6_Sub14_Sub2_2.method5988();
														local802 = Static420.aClass6_Sub14_Sub2_2.method6041();
														@Pc(5157) long local5157 = local3897 + (local5142 << 32);
														@Pc(5159) boolean local5159 = false;
														local2476 = 0;
														while (true) {
															if (local2476 >= 100) {
																if (local802 <= 1) {
																	if (Static451.aBoolean532 && !Static558.aBoolean654 || Static475.aBoolean548) {
																		local5159 = true;
																	} else if (Static322.method4981(local1565)) {
																		local5159 = true;
																	}
																}
																break;
															}
															if (local5157 == Static511.aLongArray14[local2476]) {
																local5159 = true;
																break;
															}
															local2476++;
														}
														if (!local5159 && Static133.anInt4720 == 0) {
															Static511.aLongArray14[Static319.anInt5786] = local5157;
															Static319.anInt5786 = (Static319.anInt5786 + 1) % 100;
															@Pc(5216) String local5216 = Static263.method3732(Static375.method5497(Static420.aClass6_Sub14_Sub2_2));
															if (local802 == 2) {
																Static253.method3574(-1, null, 7, local5216, local1325, "<img=1>" + local1565, 0, "<img=1>" + local1325);
															} else if (local802 == 1) {
																Static253.method3574(-1, null, 7, local5216, local1325, "<img=0>" + local1565, 0, "<img=0>" + local1325);
															} else {
																Static253.method3574(-1, null, 3, local5216, local1325, local1565, 0, local1325);
															}
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static62.aClass40_26) {
														local73 = Static420.aClass6_Sub14_Sub2_2.method6027();
														local251 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local333 = Static420.aClass6_Sub14_Sub2_2.method6020();
														Static498.anIntArray641[local333] = local73;
														Static138.anIntArray303[local333] = local251;
														Static109.anIntArray696[local333] = 1;
														local775 = Static268.anIntArray441[local333] - 1;
														for (local786 = 0; local786 < local775; local786++) {
															if (Class3.anIntArray5[local786] <= local73) {
																Static109.anIntArray696[local333] = local786 + 2;
															}
														}
														Static475.anIntArray627[Static376.anInt6487++ & 0x1F] = local333;
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static271.aClass40_107) {
														Static226.anInt3836 = Static420.aClass6_Sub14_Sub2_2.method6041();
														Static244.aClass40_99 = null;
														Static555.anInt8692 = Static48.anInt821;
														return true;
													} else if (Static244.aClass40_99 == Static358.aClass40_148) {
														Static420.aClass6_Sub14_Sub2_2.anInt7244 += 28;
														if (Static420.aClass6_Sub14_Sub2_2.method6024()) {
															Static232.method3410(Static420.aClass6_Sub14_Sub2_2, Static420.aClass6_Sub14_Sub2_2.anInt7244 - 28);
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static509.aClass40_180) {
														Static287.method7858(Static576.aClass216_17);
														Static244.aClass40_99 = null;
														return true;
													} else if (Static292.aClass40_116 == Static244.aClass40_99) {
														local3974 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
														local1325 = Static420.aClass6_Sub14_Sub2_2.method5991();
														local1565 = local1325;
														if (local3974) {
															local1565 = Static420.aClass6_Sub14_Sub2_2.method5991();
														}
														local775 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local880 = false;
														if (local775 <= 1) {
															if (Static451.aBoolean532 && !Static558.aBoolean654 || Static475.aBoolean548) {
																local880 = true;
															} else if (local775 <= 1 && Static322.method4981(local1565)) {
																local880 = true;
															}
														}
														if (!local880 && Static133.anInt4720 == 0) {
															local893 = Static263.method3732(Static375.method5497(Static420.aClass6_Sub14_Sub2_2));
															if (local775 == 2) {
																Static253.method3574(-1, null, 24, local893, local1325, "<img=1>" + local1565, 0, "<img=1>" + local1325);
															} else if (local775 == 1) {
																Static253.method3574(-1, null, 24, local893, local1325, "<img=0>" + local1565, 0, "<img=0>" + local1325);
															} else {
																Static253.method3574(-1, null, 24, local893, local1325, local1565, 0, local1325);
															}
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static579.aClass40_200) {
														local3974 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
														local1325 = Static420.aClass6_Sub14_Sub2_2.method5991();
														local1565 = local1325;
														if (local3974) {
															local1565 = Static420.aClass6_Sub14_Sub2_2.method5991();
														}
														local775 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local786 = Static420.aClass6_Sub14_Sub2_2.method6006();
														local1938 = false;
														if (local775 <= 1 && Static322.method4981(local1565)) {
															local1938 = true;
														}
														if (!local1938 && Static133.anInt4720 == 0) {
															@Pc(5594) String local5594 = Static283.aClass44_4.method690(local786).method202(Static420.aClass6_Sub14_Sub2_2);
															if (local775 == 2) {
																Static253.method3574(local786, null, 25, local5594, local1325, "<img=1>" + local1565, 0, "<img=1>" + local1325);
															} else if (local775 == 1) {
																Static253.method3574(local786, null, 25, local5594, local1325, "<img=0>" + local1565, 0, "<img=0>" + local1325);
															} else {
																Static253.method3574(local786, null, 25, local5594, local1325, local1565, 0, local1325);
															}
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static16.aClass40_7) {
														Static92.anInt7190 = Static420.aClass6_Sub14_Sub2_2.method6020();
														Static25.anInt481 = Static420.aClass6_Sub14_Sub2_2.method6012();
														Static244.aClass40_99 = null;
														return true;
													} else if (Static324.aClass40_138 == Static244.aClass40_99) {
														Static287.method7858(Static565.aClass216_16);
														Static244.aClass40_99 = null;
														return true;
													} else if (Static84.aClass40_37 == Static244.aClass40_99) {
														local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
														local251 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local333 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local775 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local786 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local792 = Static420.aClass6_Sub14_Sub2_2.method6006();
														if (Static407.method5938(local73)) {
															Static99.aBooleanArray16[local251] = true;
															Static71.anIntArray86[local251] = local333;
															Static490.anIntArray635[local251] = local775;
															Static417.anIntArray581[local251] = local786;
															Static5.anIntArray10[local251] = local792;
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static409.aClass40_45 == Static244.aClass40_99) {
														local73 = Static420.aClass6_Sub14_Sub2_2.method5982();
														local251 = Static420.aClass6_Sub14_Sub2_2.method5996();
														if (local251 == 65535) {
															local251 = -1;
														}
														local333 = Static420.aClass6_Sub14_Sub2_2.method6013();
														if (Static407.method5938(local73)) {
															Static270.method2048(-1, 2, local251, local333);
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static17.aClass40_8 == Static244.aClass40_99) {
														Static287.method7858(Static39.aClass216_3);
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static313.aClass40_130) {
														Static72.method952(Static152.aClass57_4, Static567.anInt9502, Static420.aClass6_Sub14_Sub2_2);
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static570.aClass40_198) {
														Static365.method5386(Static567.anInt9502, Static420.aClass6_Sub14_Sub2_2);
														Static244.aClass40_99 = null;
														return true;
													} else if (Static311.aClass40_127 == Static244.aClass40_99) {
														local73 = Static420.aClass6_Sub14_Sub2_2.method5996();
														local5005 = Static420.aClass6_Sub14_Sub2_2.method5983();
														local333 = Static420.aClass6_Sub14_Sub2_2.method6032();
														if (Static407.method5938(local73)) {
															Static506.method6956(local5005, local333);
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static239.aClass40_136) {
														Static244.aClass40_99 = null;
														return false;
													} else if (Static244.aClass40_99 == Static33.aClass40_12) {
														local73 = Static420.aClass6_Sub14_Sub2_2.method5982();
														local251 = Static420.aClass6_Sub14_Sub2_2.method6027();
														if (Static407.method5938(local73)) {
															Static270.method2048(-1, 3, -1, local251);
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static102.aClass40_49 == Static244.aClass40_99) {
														Static158.anInt2782 = Static48.anInt821;
														if (Static567.anInt9502 == 0) {
															Static296.aClass153Array3 = null;
															Static244.aClass40_99 = null;
															Static483.aString100 = null;
															Static78.aString20 = null;
															Static469.anInt7945 = 0;
															return true;
														}
														Static78.aString20 = Static420.aClass6_Sub14_Sub2_2.method5991();
														local3974 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
														if (local3974) {
															Static420.aClass6_Sub14_Sub2_2.method5991();
														}
														@Pc(5917) long local5917 = Static420.aClass6_Sub14_Sub2_2.method6033();
														Static483.aString100 = Static88.method1427(local5917);
														Static279.aByte58 = Static420.aClass6_Sub14_Sub2_2.method6034();
														local775 = Static420.aClass6_Sub14_Sub2_2.method6041();
														if (local775 == 255) {
															Static244.aClass40_99 = null;
															return true;
														}
														Static469.anInt7945 = local775;
														@Pc(5943) Class153[] local5943 = new Class153[100];
														for (local792 = 0; local792 < Static469.anInt7945; local792++) {
															local5943[local792] = new Class153();
															local5943[local792].aString60 = Static420.aClass6_Sub14_Sub2_2.method5991();
															local3974 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
															if (local3974) {
																local5943[local792].aString57 = Static420.aClass6_Sub14_Sub2_2.method5991();
															} else {
																local5943[local792].aString57 = local5943[local792].aString60;
															}
															local5943[local792].aString58 = Static502.method6919(local5943[local792].aString57);
															local5943[local792].anInt3802 = Static420.aClass6_Sub14_Sub2_2.method6006();
															local5943[local792].aByte52 = Static420.aClass6_Sub14_Sub2_2.method6034();
															local5943[local792].aString59 = Static420.aClass6_Sub14_Sub2_2.method5991();
															if (local5943[local792].aString57.equals(Static426.aClass29_Sub2_Sub1_Sub2_2.aString108)) {
																Static6.aByte40 = local5943[local792].aByte52;
															}
														}
														local932 = Static469.anInt7945;
														while (local932 > 0) {
															@Pc(6050) boolean local6050 = true;
															local932--;
															for (local2599 = 0; local2599 < local932; local2599++) {
																if (local5943[local2599].aString58.compareTo(local5943[local2599 + 1].aString58) > 0) {
																	@Pc(6071) Class153 local6071 = local5943[local2599];
																	local5943[local2599] = local5943[local2599 + 1];
																	local6050 = false;
																	local5943[local2599 + 1] = local6071;
																}
															}
															if (local6050) {
																break;
															}
														}
														Static296.aClass153Array3 = local5943;
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static135.aClass40_57) {
														local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
														if (Static407.method5938(local73)) {
															Static361.method5344();
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static173.aClass40_75 == Static244.aClass40_99) {
														local3974 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
														local1325 = Static420.aClass6_Sub14_Sub2_2.method5991();
														local1565 = local1325;
														if (local3974) {
															local1565 = Static420.aClass6_Sub14_Sub2_2.method5991();
														}
														local5142 = Static420.aClass6_Sub14_Sub2_2.method6033();
														local3897 = Static420.aClass6_Sub14_Sub2_2.method6006();
														@Pc(6162) long local6162 = (long) Static420.aClass6_Sub14_Sub2_2.method5988();
														local2599 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local2902 = Static420.aClass6_Sub14_Sub2_2.method6006();
														@Pc(6176) long local6176 = local6162 + (local3897 << 32);
														@Pc(6178) boolean local6178 = false;
														@Pc(6180) int local6180 = 0;
														while (true) {
															if (local6180 >= 100) {
																if (local2599 <= 1 && Static322.method4981(local1565)) {
																	local6178 = true;
																}
																break;
															}
															if (Static511.aLongArray14[local6180] == local6176) {
																local6178 = true;
																break;
															}
															local6180++;
														}
														if (!local6178 && Static133.anInt4720 == 0) {
															Static511.aLongArray14[Static319.anInt5786] = local6176;
															Static319.anInt5786 = (Static319.anInt5786 + 1) % 100;
															@Pc(6236) String local6236 = Static283.aClass44_4.method690(local2902).method202(Static420.aClass6_Sub14_Sub2_2);
															if (local2599 == 2) {
																Static253.method3574(local2902, Static537.method7461(local5142), 20, local6236, local1325, "<img=1>" + local1565, 0, "<img=1>" + local1325);
															} else if (local2599 == 1) {
																Static253.method3574(local2902, Static537.method7461(local5142), 20, local6236, local1325, "<img=0>" + local1565, 0, "<img=0>" + local1325);
															} else {
																Static253.method3574(local2902, Static537.method7461(local5142), 20, local6236, local1325, local1565, 0, local1325);
															}
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static433.aClass40_164 == Static244.aClass40_99) {
														local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
														local251 = Static420.aClass6_Sub14_Sub2_2.method6013();
														local333 = Static420.aClass6_Sub14_Sub2_2.method6012();
														if (Static407.method5938(local73)) {
															Static538.method7464(local333, local251);
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static514.aClass40_181) {
														Static287.method7858(Static9.aClass216_1);
														Static244.aClass40_99 = null;
														return true;
													} else if (Static134.aClass40_56 == Static244.aClass40_99) {
														local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
														local251 = Static420.aClass6_Sub14_Sub2_2.method6032();
														local333 = Static420.aClass6_Sub14_Sub2_2.method6006();
														if (Static407.method5938(local251)) {
															Static145.method2163(local73, local333);
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static388.aClass40_156) {
														local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
														local251 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local333 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local775 = Static420.aClass6_Sub14_Sub2_2.method6006() << 2;
														local786 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local792 = Static420.aClass6_Sub14_Sub2_2.method6041();
														if (Static407.method5938(local73)) {
															Static575.method7841(local792, local251, local333, local786, local775);
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static125.aClass40_54) {
														local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
														if (local73 == 65535) {
															local73 = -1;
														}
														local251 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local333 = Static420.aClass6_Sub14_Sub2_2.method6006();
														local775 = Static420.aClass6_Sub14_Sub2_2.method6041();
														Static370.method5428(local73, false, local333, local775, local251);
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static355.aClass40_147) {
														Static271.method3832(Static420.aClass6_Sub14_Sub2_2.method5991());
														Static244.aClass40_99 = null;
														return true;
													} else if (Static276.aClass40_109 == Static244.aClass40_99) {
														Static287.method7858(aClass216_10);
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static157.aClass40_68) {
														local73 = Static420.aClass6_Sub14_Sub2_2.method6006();
														if (local73 == 65535) {
															local73 = -1;
														}
														local251 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local333 = Static420.aClass6_Sub14_Sub2_2.method6006();
														local775 = Static420.aClass6_Sub14_Sub2_2.method6041();
														Static370.method5428(local73, true, local333, local775, local251);
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static41.aClass40_18) {
														Static185.method2757(true);
														Static244.aClass40_99 = null;
														return true;
													} else if (Static244.aClass40_99 == Static320.aClass40_118) {
														Static287.method7858(Static276.aClass216_7);
														Static244.aClass40_99 = null;
														return true;
													} else if (Static547.aClass40_199 == Static244.aClass40_99) {
														local3974 = Static420.aClass6_Sub14_Sub2_2.method6041() == 1;
														local1325 = Static420.aClass6_Sub14_Sub2_2.method5991();
														local1565 = local1325;
														if (local3974) {
															local1565 = Static420.aClass6_Sub14_Sub2_2.method5991();
														}
														local5142 = Static420.aClass6_Sub14_Sub2_2.method6006();
														local3897 = Static420.aClass6_Sub14_Sub2_2.method5988();
														local802 = Static420.aClass6_Sub14_Sub2_2.method6041();
														local932 = Static420.aClass6_Sub14_Sub2_2.method6006();
														local1356 = local3897 + (local5142 << 32);
														local1358 = false;
														local1360 = 0;
														while (true) {
															if (local1360 >= 100) {
																if (local802 <= 1 && Static322.method4981(local1565)) {
																	local1358 = true;
																}
																break;
															}
															if (Static511.aLongArray14[local1360] == local1356) {
																local1358 = true;
																break;
															}
															local1360++;
														}
														if (!local1358 && Static133.anInt4720 == 0) {
															Static511.aLongArray14[Static319.anInt5786] = local1356;
															Static319.anInt5786 = (Static319.anInt5786 + 1) % 100;
															local1415 = Static283.aClass44_4.method690(local932).method202(Static420.aClass6_Sub14_Sub2_2);
															if (local802 == 2) {
																Static253.method3574(local932, null, 18, local1415, local1325, "<img=1>" + local1565, 0, "<img=1>" + local1325);
															} else if (local802 == 1) {
																Static253.method3574(local932, null, 18, local1415, local1325, "<img=0>" + local1565, 0, "<img=0>" + local1325);
															} else {
																Static253.method3574(local932, null, 18, local1415, local1325, local1565, 0, local1325);
															}
														}
														Static244.aClass40_99 = null;
														return true;
													} else if (Static138.aClass40_61 == Static244.aClass40_99) {
														Static287.method7858(Static431.aClass216_14);
														Static244.aClass40_99 = null;
														return true;
													} else {
														Static169.method2641("T1 - " + (Static244.aClass40_99 == null ? -1 : Static244.aClass40_99.method683()) + "," + (Static142.aClass40_65 == null ? -1 : Static142.aClass40_65.method683()) + "," + (Static163.aClass40_71 == null ? -1 : Static163.aClass40_71.method683()) + " - " + Static567.anInt9502, null);
														Static155.method2280(false);
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

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIZIBIF)[I")
	public static int[] method4231(@OriginalArg(7) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class6_Sub3_Sub30 local15 = new Class6_Sub3_Sub30();
		local15.anInt7734 = 8;
		local15.anInt7738 = 35;
		local15.anInt7727 = 4;
		local15.aBoolean527 = true;
		local15.anInt7733 = 8;
		local15.anInt7726 = (int) (arg0 * 4096.0F);
		local15.method7832();
		Static261.method3651(2048, 1);
		local15.method6388(local11, 0);
		return local11;
	}
}
