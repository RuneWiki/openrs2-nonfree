import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	// $FF: synthetic field
	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/Class;")
	public static Class aClass5;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZLclient!qo;)V")
	public static void method1058(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class60_Sub1_Sub1_Sub3 arg1) {
		@Pc(9) Class396 local9 = arg1.method4417(27750);
		if (arg1.anInt4879 == 0) {
			Static245.anInt4707 = 0;
			arg1.anInt4881 = 0;
			Static380.anInt6621 = -1;
			return;
		}
		if (arg1.aClass104_8.method9030() && !arg1.aClass104_8.method9021()) {
			@Pc(48) Class212 local48 = arg1.aClass104_8.method9041();
			if (arg1.anInt4880 > 0 && local48.anInt5527 == 0) {
				Static245.anInt4707 = 0;
				Static380.anInt6621 = -1;
				arg1.anInt4881++;
				return;
			}
			if (arg1.anInt4880 <= 0 && local48.anInt5524 == 0) {
				Static245.anInt4707 = 0;
				Static380.anInt6621 = -1;
				arg1.anInt4881++;
				return;
			}
		}
		for (@Pc(99) int local99 = 0; local99 < arg1.aClass40Array3.length; local99++) {
			if (arg1.aClass40Array3[local99].anInt571 != -1 && arg1.aClass40Array3[local99].aClass104_1.method9021()) {
				@Pc(130) Class17 local130 = Static655.aClass172_2.method4449(arg1.aClass40Array3[local99].anInt571);
				if (local130.aBoolean21 && local130.anInt251 != -1) {
					@Pc(145) Class212 local145 = Static444.aClass68_3.method1286(local130.anInt251);
					if (arg1.anInt4880 > 0 && local145.anInt5527 == 0) {
						Static245.anInt4707 = 0;
						Static380.anInt6621 = -1;
						arg1.anInt4881++;
						return;
					}
					if (arg1.anInt4880 <= 0 && local145.anInt5524 == 0) {
						Static380.anInt6621 = -1;
						arg1.anInt4881++;
						Static245.anInt4707 = 0;
						return;
					}
				}
			}
		}
		@Pc(201) int local201 = arg1.anInt9048;
		@Pc(204) int local204 = arg1.anInt9057;
		@Pc(221) int local221 = arg1.anIntArray263[arg1.anInt4879 - 1] * 512 + arg1.method4424((byte) -28) * 256;
		@Pc(237) int local237 = arg1.anIntArray264[arg1.anInt4879 - 1] * 512 + arg1.method4424((byte) -28) * 256;
		if (local221 <= local201) {
			if (local201 <= local221) {
				if (local204 < local237) {
					arg1.method4419(8192);
				} else if (local204 > local237) {
					arg1.method4419(0);
				}
			} else if (local204 < local237) {
				arg1.method4419(6144);
			} else if (local204 <= local237) {
				arg1.method4419(4096);
			} else {
				arg1.method4419(2048);
			}
		} else if (local237 > local204) {
			arg1.method4419(10240);
		} else if (local204 <= local237) {
			arg1.method4419(12288);
		} else {
			arg1.method4419(14336);
		}
		@Pc(359) byte local359 = arg1.aByteArray36[arg1.anInt4879 - 1];
		if (!arg0 && (local221 - local201 > 1024 || local221 - local201 < -1024 || local237 - local204 > 1024 || local237 - local204 < -1024)) {
			arg1.anInt9048 = local221;
			arg1.anInt9057 = local237;
			arg1.method4423(false, arg1.anInt4868);
			Static380.anInt6621 = -1;
			arg1.anInt4879--;
			if (arg1.anInt4880 > 0) {
				arg1.anInt4880--;
			}
			Static245.anInt4707 = 0;
			return;
		}
		@Pc(438) int local438 = 16;
		@Pc(440) boolean local440 = true;
		if (arg1 instanceof Class60_Sub1_Sub1_Sub3_Sub2) {
			local440 = ((Class60_Sub1_Sub1_Sub3_Sub2) arg1).aClass294_1.aBoolean613;
		}
		@Pc(458) int local458;
		if (local440) {
			local458 = arg1.anInt4868 - arg1.aClass258_7.anInt7153;
			if (local458 != 0 && arg1.anInt4858 == -1 && arg1.anInt4865 != 0) {
				local438 = 8;
			}
			if (!arg0 && arg1.anInt4879 > 2) {
				local438 = 24;
			}
			if (!arg0 && arg1.anInt4879 > 3) {
				local438 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt4879 > 1) {
				local438 = 24;
			}
			if (!arg0 && arg1.anInt4879 > 2) {
				local438 = 32;
			}
		}
		if (arg1.anInt4881 > 0 && arg1.anInt4879 > 1) {
			local438 = 32;
			arg1.anInt4881--;
		}
		if (local359 == 2) {
			local438 <<= 0x1;
		} else if (local359 == 0) {
			local438 >>= 0x1;
		}
		Static245.anInt4707 = 0;
		if (local9.anInt10412 != -1) {
			local438 <<= 0x9;
			if (arg1.anInt4879 == 1) {
				local458 = arg1.anInt4878 * arg1.anInt4878;
				@Pc(617) int local617 = (arg1.anInt9048 > local221 ? arg1.anInt9048 - local221 : -arg1.anInt9048 + local221) << 9;
				@Pc(638) int local638 = (arg1.anInt9057 > local237 ? arg1.anInt9057 - local237 : local237 - arg1.anInt9057) << 9;
				@Pc(650) int local650 = local638 >= local617 ? local638 : local617;
				@Pc(657) int local657 = local9.anInt10412 * 2 * local650;
				if (local657 < local458) {
					arg1.anInt4878 /= 2;
				} else if (local458 / 2 > local650) {
					arg1.anInt4878 -= local9.anInt10412;
					if (arg1.anInt4878 < 0) {
						arg1.anInt4878 = 0;
					}
				} else if (local438 > arg1.anInt4878) {
					arg1.anInt4878 += local9.anInt10412;
					if (local438 < arg1.anInt4878) {
						arg1.anInt4878 = local438;
					}
				}
			} else if (local438 > arg1.anInt4878) {
				arg1.anInt4878 += local9.anInt10412;
				if (local438 < arg1.anInt4878) {
					arg1.anInt4878 = local438;
				}
			} else if (arg1.anInt4878 > 0) {
				arg1.anInt4878 -= local9.anInt10412;
				if (arg1.anInt4878 < 0) {
					arg1.anInt4878 = 0;
				}
			}
			local438 = arg1.anInt4878 >> 9;
			if (local438 < 1) {
				local438 = 1;
			}
		}
		if (local201 == local221 && local237 == local204) {
			Static380.anInt6621 = -1;
		} else {
			if (local201 < local221) {
				Static245.anInt4707 |= 0x4;
				arg1.anInt9048 += local438;
				if (arg1.anInt9048 > local221) {
					arg1.anInt9048 = local221;
				}
			} else if (local201 > local221) {
				Static245.anInt4707 |= 0x8;
				arg1.anInt9048 -= local438;
				if (local221 > arg1.anInt9048) {
					arg1.anInt9048 = local221;
				}
			}
			if (local438 >= 32) {
				Static380.anInt6621 = 2;
			} else {
				Static380.anInt6621 = local359;
			}
			if (local204 < local237) {
				arg1.anInt9057 += local438;
				Static245.anInt4707 |= 0x1;
				if (arg1.anInt9057 > local237) {
					arg1.anInt9057 = local237;
				}
			} else if (local237 < local204) {
				arg1.anInt9057 -= local438;
				Static245.anInt4707 |= 0x2;
				if (local237 > arg1.anInt9057) {
					arg1.anInt9057 = local237;
				}
			}
		}
		if (arg1.anInt9048 == local221 && arg1.anInt9057 == local237) {
			if (arg1.anInt4880 > 0) {
				arg1.anInt4880--;
			}
			arg1.anInt4879--;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1059() {
		for (@Pc(1) int local1 = 0; local1 < Static29.anInt380; local1++) {
			@Pc(6) int[] local6 = Static20.anIntArrayArray2[local1];
			for (@Pc(8) int local8 = 0; local8 < Static327.anInt5650; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!vo;)Lclient!le;")
	public static Class6_Sub32 method1061(@OriginalArg(0) Class381 arg0) {
		@Pc(13) Class6_Sub32 local13 = (Class6_Sub32) Static497.aClass74_58.method1401(((long) arg0.anInt10089 << 32) + (long) arg0.anInt10112);
		return local13 == null ? arg0.aClass6_Sub32_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1062() {
		Static275.anInt5075 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static201.anInt4069; local3++) {
			@Pc(14) Class60_Sub1_Sub1_Sub3_Sub2 local14 = ((Class6_Sub11) Static419.aClass74_45.method1401((long) Static531.anIntArray580[local3])).aClass60_Sub1_Sub1_Sub3_Sub2_1;
			if (local14.aBoolean370 && local14.method4430() != -1) {
				@Pc(34) int local34 = (local14.method4424((byte) -28) - 1) * 256 + 252;
				@Pc(41) int local41 = local14.anInt9048 - local34 >> 9;
				@Pc(48) int local48 = local14.anInt9057 - local34 >> 9;
				@Pc(55) Class60_Sub1_Sub1_Sub3 local55 = Static491.method7289(local48, local41, local14.aByte135);
				if (local55 != null) {
					@Pc(60) int local60 = local55.anInt4845;
					if (local55 instanceof Class60_Sub1_Sub1_Sub3_Sub2) {
						local60 += 2048;
					}
					if (local55.anInt4839 == 0 && local55.method4430() != -1) {
						Static558.anIntArray592[Static275.anInt5075] = local60;
						Static312.anIntArray313[Static275.anInt5075] = local60;
						Static275.anInt5075++;
						local55.anInt4839++;
					}
					Static558.anIntArray592[Static275.anInt5075] = local60;
					Static312.anIntArray313[Static275.anInt5075] = local14.anInt4845 + 2048;
					Static275.anInt5075++;
					local55.anInt4839++;
				}
			}
		}
		Static567.method7973(Static312.anIntArray313, Static275.anInt5075 - 1, Static558.anIntArray592, 0);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1063(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static661.anInt10532;
		@Pc(3) int[] local3 = Static591.anIntArray611;
		@Pc(12) int local12 = Static185.aBoolean308 ? local1 : local1 + Static201.anInt4069;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(24) Class60_Sub1_Sub1_Sub3 local24;
			if (local14 < local1) {
				local24 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local3[local14]];
			} else {
				local24 = ((Class6_Sub11) Static419.aClass74_45.method1401((long) Static531.anIntArray580[local14 - local1])).aClass60_Sub1_Sub1_Sub3_Sub2_1;
			}
			if (local24.aByte135 == arg0) {
				local24.anInt4839 = 0;
				if (local24.anInt4825 < 0) {
					local24.aBoolean370 = false;
				} else {
					@Pc(58) int local58 = local24.method4424((byte) -28);
					if ((local58 & 0x1) == 0) {
						if ((local24.anInt9048 & 0x1FF) != 0 || (local24.anInt9057 & 0x1FF) != 0) {
							local24.aBoolean370 = false;
							continue;
						}
					} else if ((local24.anInt9048 & 0x1FF) != 256 || (local24.anInt9057 & 0x1FF) != 256) {
						local24.aBoolean370 = false;
						continue;
					}
					@Pc(108) int local108;
					@Pc(113) int local113;
					@Pc(139) int local139;
					if (local58 == 1) {
						local108 = local24.anInt9048 >> 9;
						local113 = local24.anInt9057 >> 9;
						if (local24.anInt4825 != Static20.anIntArrayArray2[local108][local113]) {
							local24.aBoolean370 = true;
							continue;
						}
						if (Static511.anIntArrayArray43[local108][local113] > 1) {
							local139 = Static511.anIntArrayArray43[local108][local113]--;
							local24.aBoolean370 = true;
							continue;
						}
					} else {
						local108 = (local58 - 1) * 256 + 252;
						local113 = local24.anInt9048 - local108 >> 9;
						@Pc(169) int local169 = local24.anInt9057 - local108 >> 9;
						@Pc(176) int local176 = local24.anInt9048 + local108 >> 9;
						@Pc(183) int local183 = local24.anInt9057 + local108 >> 9;
						if (!Static241.method4232(local24.anInt4825, local176, local183, local113, local169)) {
							for (@Pc(194) int local194 = local113; local194 <= local176; local194++) {
								for (@Pc(197) int local197 = local169; local197 <= local183; local197++) {
									if (local24.anInt4825 == Static20.anIntArrayArray2[local194][local197]) {
										local139 = Static511.anIntArrayArray43[local194][local197]--;
									}
								}
							}
							local24.aBoolean370 = true;
							continue;
						}
					}
					local24.aBoolean370 = false;
					local24.anInt9051 = Static248.method4318(local24.anInt9057, local24.aByte135, local24.anInt9048);
					Static610.method8414(local24, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lga;I)I")
	public static int method1065(@OriginalArg(0) Class223 arg0) {
		@Pc(12) int local12 = 0;
		if (arg0.method5285(Static41.anInt541)) {
			local12++;
		}
		if (arg0.method5285(Static543.anInt8811)) {
			local12++;
		}
		if (arg0.method5285(Static568.anInt10057)) {
			local12++;
		}
		if (arg0.method5285(Static149.anInt3121)) {
			local12++;
		}
		if (arg0.method5285(Static18.anInt252)) {
			local12++;
		}
		if (arg0.method5285(Static394.anInt6801)) {
			local12++;
		}
		if (arg0.method5285(Static414.anInt7189)) {
			local12++;
		}
		if (arg0.method5285(Static343.anInt5857)) {
			local12++;
		}
		if (arg0.method5285(Static188.anInt3781)) {
			local12++;
		}
		if (arg0.method5285(Static225.anInt4391)) {
			local12++;
		}
		if (arg0.method5285(Static453.anInt7811)) {
			local12++;
		}
		if (arg0.method5285(Static678.anInt10369)) {
			local12++;
		}
		if (arg0.method5285(Static395.anInt6853)) {
			local12++;
		}
		if (arg0.method5285(Static521.anInt9053)) {
			local12++;
		}
		if (arg0.method5285(Static233.anInt4507)) {
			local12++;
		}
		if (arg0.method5285(Static302.anInt5298)) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!vo;IIIIIIIIIII)V")
	public static void method1066(@OriginalArg(0) Class381[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label850: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class381 local6 = arg0[local1];
			if (local6 != null && local6.anInt10079 == arg1) {
				@Pc(19) int local19 = local6.anInt10155 + arg6;
				@Pc(24) int local24 = local6.anInt10116 + arg7;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(36) int local36;
				@Pc(42) int local42;
				@Pc(47) int local47;
				if (local6.anInt10156 == 2) {
					local30 = arg2;
					local32 = arg3;
					local34 = arg4;
					local36 = arg5;
				} else {
					local42 = local19 + local6.anInt10159;
					local47 = local24 + local6.anInt10131;
					if (local6.anInt10156 == 9) {
						local42++;
						local47++;
					}
					local30 = local19 > arg2 ? local19 : arg2;
					local32 = local24 > arg3 ? local24 : arg3;
					local34 = local42 < arg4 ? local42 : arg4;
					local36 = local47 < arg5 ? local47 : arg5;
				}
				if (local6.anInt10156 == 0 || local6.aBoolean742 || method1061(local6).anInt5776 != 0 || local6 == Static220.aClass381_4 || local6.anInt10117 == Static70.anInt928 || local6.anInt10117 == Static546.anInt8853) {
					if (!method1076(local6)) {
						local42 = 0;
						local47 = 0;
						if (Static93.aBoolean113) {
							local42 = Static24.method290();
							local47 = Static488.method7227();
						}
						if (local6 == Static637.aClass381_13 && Static206.method3808(Static637.aClass381_13) != null) {
							Static486.aBoolean632 = true;
							Static186.anInt3733 = local19;
							Static419.anInt7216 = local24;
						}
						if (local6.aBoolean755 || local30 < local34 && local32 < local36) {
							if (local6.aBoolean752 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								for (@Pc(208) Class6_Sub53 local208 = (Class6_Sub53) Static131.aClass340_20.method8124(); local208 != null; local208 = (Class6_Sub53) Static131.aClass340_20.method8134()) {
									if (local208.aBoolean731) {
										local208.method9051();
										local208.aClass381_11.aBoolean743 = false;
									}
								}
								if (Static323.anInt5579 == 0) {
									Static637.aClass381_13 = null;
									Static220.aClass381_4 = null;
								}
								Static102.anInt2058 = 0;
								Static316.aBoolean463 = false;
								Static236.aBoolean354 = false;
								if (!Static484.aBoolean623) {
									Static67.method816();
								}
							}
							@Pc(286) boolean local286;
							if (Static331.aClass42_8.method6019() + local42 >= local30 && Static331.aClass42_8.method6014() + local47 >= local32 && Static331.aClass42_8.method6019() + local42 < local34 && Static331.aClass42_8.method6014() + local47 < local36) {
								local286 = true;
							} else {
								local286 = false;
							}
							if (!Static162.aBoolean266 && local286) {
								if (local6.anInt10072 >= 0) {
									Static475.anInt8093 = local6.anInt10072;
								} else if (local6.aBoolean752) {
									Static475.anInt8093 = -1;
								}
							}
							if (!Static484.aBoolean623 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								Static624.method8542(local6, arg11 - local24, arg10 - local19);
							}
							@Pc(347) boolean local347 = false;
							if (Static331.aClass42_8.method6016() && local286) {
								local347 = true;
							}
							@Pc(359) boolean local359 = false;
							@Pc(364) Class6_Sub9 local364 = (Class6_Sub9) Static518.aClass340_65.method8124();
							if (local364 != null && local364.method7140() == 0 && local364.method7137() + local42 >= local30 && local364.method7139() + local47 >= local32 && local364.method7137() + local42 < local34 && local364.method7139() + local47 < local36) {
								local359 = true;
							}
							@Pc(420) int local420;
							@Pc(586) int local586;
							if (local6.aByteArray108 != null && !Static290.method8799()) {
								for (local420 = 0; local420 < local6.aByteArray108.length; local420++) {
									if (Static435.aClass148_1.method3952(local6.aByteArray108[local420])) {
										if (local6.anIntArray667 == null || Static141.anInt8737 >= local6.anIntArray667[local420]) {
											@Pc(457) byte local457 = local6.aByteArray109[local420];
											if (local457 == 0 || ((local457 & 0x8) == 0 || !Static435.aClass148_1.method3952(86) && !Static435.aClass148_1.method3952(82) && !Static435.aClass148_1.method3952(81)) && ((local457 & 0x2) == 0 || Static435.aClass148_1.method3952(86)) && ((local457 & 0x1) == 0 || Static435.aClass148_1.method3952(82)) && ((local457 & 0x4) == 0 || Static435.aClass148_1.method3952(81))) {
												if (local420 < 10) {
													Static252.method8468(local420 + 1, "", -1, local6.anInt10089);
												} else if (local420 == 10) {
													Static565.method7967();
													@Pc(549) Class6_Sub32 local549 = method1061(local6);
													Static154.method3074(local549.method5217(), local6, local549.anInt5779);
													Static185.aString41 = Static346.method5315(local6);
													if (Static185.aString41 == null) {
														Static185.aString41 = "Null";
													}
													Static6.aString5 = local6.aString121 + "<col=ffffff>";
												}
												local586 = local6.anIntArray664[local420];
												if (local6.anIntArray667 == null) {
													local6.anIntArray667 = new int[local6.aByteArray108.length];
												}
												if (local586 == 0) {
													local6.anIntArray667[local420] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray667[local420] = Static141.anInt8737 + local586;
												}
											}
										}
									} else if (local6.anIntArray667 != null) {
										local6.anIntArray667[local420] = 0;
									}
								}
							}
							if (local359) {
								Static437.method6612(local6, local47 + local364.method7139() - local24, local42 + local364.method7137() - local19);
							}
							if (Static637.aClass381_13 != null && Static637.aClass381_13 != local6 && local286 && method1061(local6).method5213()) {
								Static340.aClass381_9 = local6;
							}
							if (local6 == Static220.aClass381_4) {
								Static636.aBoolean732 = true;
								Static22.anInt5053 = local19;
								Static603.anInt9534 = local24;
							}
							if (local6.aBoolean742 || local6.anInt10117 != 0) {
								@Pc(700) Class6_Sub53 local700;
								if (local286 && Static79.anInt1140 != 0 && local6.anObjectArray15 != null) {
									local700 = new Class6_Sub53();
									local700.aBoolean731 = true;
									local700.aClass381_11 = local6;
									local700.anInt9916 = Static79.anInt1140;
									local700.anObjectArray3 = local6.anObjectArray15;
									Static131.aClass340_20.method8131(local700);
								}
								if (Static637.aClass381_13 != null || Static484.aBoolean623 || local6.anInt10117 != Static605.anInt9563 && Static102.anInt2058 > 0) {
									local359 = false;
									local347 = false;
									local286 = false;
								}
								@Pc(903) int local903;
								if (local6.anInt10117 != 0) {
									if (local6.anInt10117 == Static557.anInt9010 || local6.anInt10117 == Static175.anInt3559) {
										Static493.aClass381_10 = local6;
										if (Static372.aClass277_7 != null) {
											Static372.aClass277_7.method6944(local6.anInt10131, Static202.aClass75_5, Static687.aClass6_Sub44_33.aClass7_Sub11_1.method2916());
										}
										if (local6.anInt10117 == Static557.anInt9010) {
											if (Static484.aBoolean623 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
												continue;
											}
											Static114.method2151(arg9, arg8, Static202.aClass75_5);
											@Pc(811) Class60_Sub6 local811 = (Class60_Sub6) Static219.aClass385_2.method8778();
											while (true) {
												if (local811 == null) {
													continue label850;
												}
												if (arg10 >= local811.anInt5746 && arg10 < local811.anInt5748 && arg11 >= local811.anInt5749 && arg11 < local811.anInt5747) {
													Static67.method816();
													Static105.method2018(local811.aClass60_Sub1_Sub1_Sub3_1);
												}
												local811 = (Class60_Sub6) Static219.aClass385_2.method8773();
											}
										}
									}
									@Pc(945) int local945;
									if (local6.anInt10117 == Static70.anInt928) {
										if (local6.method8751(Static202.aClass75_5) == null || Static378.anInt6595 != 0 && Static378.anInt6595 != 3 || Static484.aBoolean623 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
											continue;
										}
										local420 = arg10 - local19;
										local903 = arg11 - local24;
										local586 = local6.anIntArray662[local903];
										if (local420 < local586 || local420 > local586 + local6.anIntArray668[local903]) {
											continue;
										}
										local420 -= local6.anInt10159 / 2;
										local903 -= local6.anInt10131 / 2;
										if (Static526.anInt8626 == 4) {
											local945 = (int) Static409.aFloat135 & 0x3FFF;
										} else {
											local945 = (int) Static409.aFloat135 + Static51.anInt622 & 0x3FFF;
										}
										@Pc(957) int local957 = Class6_Sub2_Sub12.anIntArray293[local945];
										@Pc(961) int local961 = Class6_Sub2_Sub12.anIntArray292[local945];
										if (Static526.anInt8626 != 4) {
											local957 = local957 * (Static41.anInt542 + 256) >> 8;
											local961 = local961 * (Static41.anInt542 + 256) >> 8;
										}
										@Pc(990) int local990 = local903 * local957 + local420 * local961 >> 14;
										@Pc(1000) int local1000 = local903 * local961 - local420 * local957 >> 14;
										@Pc(1011) int local1011;
										@Pc(1019) int local1019;
										if (Static526.anInt8626 == 4) {
											local1011 = (Static492.anInt3485 >> 9) + (local990 >> 2);
											local1019 = (Static553.anInt8968 >> 9) - (local1000 >> 2);
										} else {
											@Pc(1028) int local1028 = (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method4424((byte) -28) - 1) * 256;
											local1011 = (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 - local1028 >> 9) + (local990 >> 2);
											local1019 = (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 - local1028 >> 9) - (local1000 >> 2);
										}
										if (Static162.aBoolean266 && (Static109.anInt2151 & 0x40) != 0) {
											@Pc(1063) Class381 local1063 = Static347.method5333(Static607.anInt9574, Static227.anInt4416);
											if (local1063 == null) {
												Static565.method7967();
											} else {
												Static541.method8078(Static607.anInt9573, " ->", local1011, (long) (local6.anInt10112 << 0 | local6.anInt10089), true, Static185.aString41, local6.anInt10149, true, local1019, false, 44, 1L);
											}
											continue;
										}
										if (Static129.aClass121_1 == Static567.aClass121_9) {
											Static541.method8078(-1, "", local1011, 0L, true, Static50.aClass43_26.method596(Static601.anInt9518), -1, true, local1019, false, 49, 1L);
										}
										Static541.method8078(Static631.anInt9892, "", local1011, 0L, true, Static324.aString64, -1, true, local1019, false, 17, 1L);
										continue;
									}
									if (local6.anInt10117 == Static605.anInt9563) {
										Static88.aClass381_2 = local6;
										if (local286) {
											Static316.aBoolean463 = true;
										}
										if (local359) {
											local420 = (int) ((double) (local42 + local364.method7137() - local19 - local6.anInt10159 / 2) * 2.0D / (double) Static627.aFloat139);
											local903 = (int) -((double) (local47 + local364.method7139() - local24 - local6.anInt10131 / 2) * 2.0D / (double) Static627.aFloat139);
											local586 = Static91.anInt1364 + local420 + Static627.anInt7264;
											local945 = Static488.anInt8263 + local903 + Static627.anInt7268;
											@Pc(1203) Class6_Sub2_Sub9 local1203 = Static388.method5971();
											if (local1203 == null) {
												continue;
											}
											@Pc(1208) int[] local1208 = new int[3];
											local1203.method4380(local1208, local586, local945);
											if (local1208 != null) {
												if (Static435.aClass148_1.method3952(82) && Static679.anInt6104 > 0) {
													Static86.method1253(local1208[0], local1208[1], local1208[2]);
													continue;
												}
												Static236.aBoolean354 = true;
												Static43.anInt550 = local1208[0];
												Static665.anInt10253 = local1208[1];
												Static375.anInt6308 = local1208[2];
											}
											Static102.anInt2058 = 1;
											Static123.aBoolean200 = false;
											Static75.anInt1038 = Static331.aClass42_8.method6019();
											Static231.anInt4491 = Static331.aClass42_8.method6014();
											continue;
										}
										if (local347 && Static102.anInt2058 > 0) {
											if (Static102.anInt2058 == 1 && (Static75.anInt1038 != Static331.aClass42_8.method6019() || Static231.anInt4491 != Static331.aClass42_8.method6014())) {
												Static106.anInt2115 = Static91.anInt1364;
												Static193.anInt9226 = Static488.anInt8263;
												Static102.anInt2058 = 2;
											}
											if (Static102.anInt2058 == 2) {
												Static123.aBoolean200 = true;
												Static497.method7322(Static106.anInt2115 + (int) ((double) (Static75.anInt1038 - Static331.aClass42_8.method6019()) * 2.0D / (double) Static627.aFloat140));
												Static348.method5336(Static193.anInt9226 - (int) ((double) (Static231.anInt4491 - Static331.aClass42_8.method6014()) * 2.0D / (double) Static627.aFloat140));
											}
											continue;
										}
										if (Static102.anInt2058 > 0 && !Static123.aBoolean200) {
											if ((Static76.anInt1069 == 1 || Static144.method7095()) && Static539.anInt8776 > 2) {
												Static107.method2041(Static231.anInt4491, Static75.anInt1038);
											} else if (Static37.method488()) {
												Static107.method2041(Static231.anInt4491, Static75.anInt1038);
											}
										}
										Static102.anInt2058 = 0;
										continue;
									}
									if (local6.anInt10117 == Static339.anInt5791) {
										if (local347) {
											Static377.method5767(local6.anInt10159, local6.anInt10131, local42 + Static331.aClass42_8.method6019() - local19, local47 + Static331.aClass42_8.method6014() - local24);
										}
										continue;
									}
									if (local6.anInt10117 == Static546.anInt8853) {
										Static581.method8106(local6, local19, local24);
										continue;
									}
								}
								if (!local6.aBoolean751 && local359) {
									local6.aBoolean751 = true;
									if (local6.anObjectArray7 != null) {
										local700 = new Class6_Sub53();
										local700.aBoolean731 = true;
										local700.aClass381_11 = local6;
										local700.anInt9918 = local42 + local364.method7137() - local19;
										local700.anInt9916 = local47 + local364.method7139() - local24;
										local700.anObjectArray3 = local6.anObjectArray7;
										Static131.aClass340_20.method8131(local700);
									}
								}
								if (local6.aBoolean751 && local347 && local6.anObjectArray35 != null) {
									local700 = new Class6_Sub53();
									local700.aBoolean731 = true;
									local700.aClass381_11 = local6;
									local700.anInt9918 = local42 + Static331.aClass42_8.method6019() - local19;
									local700.anInt9916 = local47 + Static331.aClass42_8.method6014() - local24;
									local700.anObjectArray3 = local6.anObjectArray35;
									Static131.aClass340_20.method8131(local700);
								}
								if (local6.aBoolean751 && !local347) {
									local6.aBoolean751 = false;
									if (local6.anObjectArray13 != null) {
										local700 = new Class6_Sub53();
										local700.aBoolean731 = true;
										local700.aClass381_11 = local6;
										local700.anInt9918 = local42 + Static331.aClass42_8.method6019() - local19;
										local700.anInt9916 = local47 + Static331.aClass42_8.method6014() - local24;
										local700.anObjectArray3 = local6.anObjectArray13;
										Static471.aClass340_61.method8131(local700);
									}
								}
								if (local347 && local6.anObjectArray26 != null) {
									local700 = new Class6_Sub53();
									local700.aBoolean731 = true;
									local700.aClass381_11 = local6;
									local700.anInt9918 = local42 + Static331.aClass42_8.method6019() - local19;
									local700.anInt9916 = local47 + Static331.aClass42_8.method6014() - local24;
									local700.anObjectArray3 = local6.anObjectArray26;
									Static131.aClass340_20.method8131(local700);
								}
								if (!local6.aBoolean743 && local286) {
									local6.aBoolean743 = true;
									if (local6.anObjectArray33 != null) {
										local700 = new Class6_Sub53();
										local700.aBoolean731 = true;
										local700.aClass381_11 = local6;
										local700.anInt9918 = local42 + Static331.aClass42_8.method6019() - local19;
										local700.anInt9916 = local47 + Static331.aClass42_8.method6014() - local24;
										local700.anObjectArray3 = local6.anObjectArray33;
										Static131.aClass340_20.method8131(local700);
									}
								}
								if (local6.aBoolean743 && local286 && local6.anObjectArray12 != null) {
									local700 = new Class6_Sub53();
									local700.aBoolean731 = true;
									local700.aClass381_11 = local6;
									local700.anInt9918 = local42 + Static331.aClass42_8.method6019() - local19;
									local700.anInt9916 = local47 + Static331.aClass42_8.method6014() - local24;
									local700.anObjectArray3 = local6.anObjectArray12;
									Static131.aClass340_20.method8131(local700);
								}
								if (local6.aBoolean743 && !local286) {
									local6.aBoolean743 = false;
									if (local6.anObjectArray36 != null) {
										local700 = new Class6_Sub53();
										local700.aBoolean731 = true;
										local700.aClass381_11 = local6;
										local700.anInt9918 = local42 + Static331.aClass42_8.method6019() - local19;
										local700.anInt9916 = local47 + Static331.aClass42_8.method6014() - local24;
										local700.anObjectArray3 = local6.anObjectArray36;
										Static471.aClass340_61.method8131(local700);
									}
								}
								if (local6.anObjectArray5 != null) {
									local700 = new Class6_Sub53();
									local700.aClass381_11 = local6;
									local700.anObjectArray3 = local6.anObjectArray5;
									Static157.aClass340_23.method8131(local700);
								}
								@Pc(1842) Class6_Sub53 local1842;
								if (local6.anObjectArray18 != null && Static89.anInt1348 > local6.anInt10081) {
									if (local6.anIntArray665 == null || Static89.anInt1348 - local6.anInt10081 > 32) {
										local700 = new Class6_Sub53();
										local700.aClass381_11 = local6;
										local700.anObjectArray3 = local6.anObjectArray18;
										Static131.aClass340_20.method8131(local700);
									} else {
										label737: for (local420 = local6.anInt10081; local420 < Static89.anInt1348; local420++) {
											local903 = Static73.anIntArray175[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray665.length; local586++) {
												if (local6.anIntArray665[local586] == local903) {
													local1842 = new Class6_Sub53();
													local1842.aClass381_11 = local6;
													local1842.anObjectArray3 = local6.anObjectArray18;
													Static131.aClass340_20.method8131(local1842);
													break label737;
												}
											}
										}
									}
									local6.anInt10081 = Static89.anInt1348;
								}
								if (local6.anObjectArray32 != null && Static391.anInt6745 > local6.anInt10157) {
									if (local6.anIntArray669 == null || Static391.anInt6745 - local6.anInt10157 > 32) {
										local700 = new Class6_Sub53();
										local700.aClass381_11 = local6;
										local700.anObjectArray3 = local6.anObjectArray32;
										Static131.aClass340_20.method8131(local700);
									} else {
										label713: for (local420 = local6.anInt10157; local420 < Static391.anInt6745; local420++) {
											local903 = Static212.anIntArray482[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray669.length; local586++) {
												if (local6.anIntArray669[local586] == local903) {
													local1842 = new Class6_Sub53();
													local1842.aClass381_11 = local6;
													local1842.anObjectArray3 = local6.anObjectArray32;
													Static131.aClass340_20.method8131(local1842);
													break label713;
												}
											}
										}
									}
									local6.anInt10157 = Static391.anInt6745;
								}
								if (local6.anObjectArray4 != null && Static521.anInt9056 > local6.anInt10103) {
									if (local6.anIntArray663 == null || Static521.anInt9056 - local6.anInt10103 > 32) {
										local700 = new Class6_Sub53();
										local700.aClass381_11 = local6;
										local700.anObjectArray3 = local6.anObjectArray4;
										Static131.aClass340_20.method8131(local700);
									} else {
										label689: for (local420 = local6.anInt10103; local420 < Static521.anInt9056; local420++) {
											local903 = Static566.anIntArray531[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray663.length; local586++) {
												if (local6.anIntArray663[local586] == local903) {
													local1842 = new Class6_Sub53();
													local1842.aClass381_11 = local6;
													local1842.anObjectArray3 = local6.anObjectArray4;
													Static131.aClass340_20.method8131(local1842);
													break label689;
												}
											}
										}
									}
									local6.anInt10103 = Static521.anInt9056;
								}
								if (local6.anObjectArray21 != null && Static674.anInt10346 > local6.anInt10134) {
									if (local6.anIntArray670 == null || Static674.anInt10346 - local6.anInt10134 > 32) {
										local700 = new Class6_Sub53();
										local700.aClass381_11 = local6;
										local700.anObjectArray3 = local6.anObjectArray21;
										Static131.aClass340_20.method8131(local700);
									} else {
										label665: for (local420 = local6.anInt10134; local420 < Static674.anInt10346; local420++) {
											local903 = Static257.anIntArray268[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray670.length; local586++) {
												if (local6.anIntArray670[local586] == local903) {
													local1842 = new Class6_Sub53();
													local1842.aClass381_11 = local6;
													local1842.anObjectArray3 = local6.anObjectArray21;
													Static131.aClass340_20.method8131(local1842);
													break label665;
												}
											}
										}
									}
									local6.anInt10134 = Static674.anInt10346;
								}
								if (local6.anObjectArray19 != null && Static337.anInt5768 > local6.anInt10070) {
									if (local6.anIntArray661 == null || Static337.anInt5768 - local6.anInt10070 > 32) {
										local700 = new Class6_Sub53();
										local700.aClass381_11 = local6;
										local700.anObjectArray3 = local6.anObjectArray19;
										Static131.aClass340_20.method8131(local700);
									} else {
										label641: for (local420 = local6.anInt10070; local420 < Static337.anInt5768; local420++) {
											local903 = Static379.anIntArray375[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray661.length; local586++) {
												if (local6.anIntArray661[local586] == local903) {
													local1842 = new Class6_Sub53();
													local1842.aClass381_11 = local6;
													local1842.anObjectArray3 = local6.anObjectArray19;
													Static131.aClass340_20.method8131(local1842);
													break label641;
												}
											}
										}
									}
									local6.anInt10070 = Static337.anInt5768;
								}
								if (local6.lb != null && Static331.anInt8307 > local6.anInt10122) {
									if (local6.anIntArray671 == null || Static331.anInt8307 - local6.anInt10122 > 32) {
										local700 = new Class6_Sub53();
										local700.aClass381_11 = local6;
										local700.anObjectArray3 = local6.lb;
										Static131.aClass340_20.method8131(local700);
									} else {
										label617: for (local420 = local6.anInt10122; local420 < Static331.anInt8307; local420++) {
											local903 = Static209.anIntArray215[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray671.length; local586++) {
												if (local6.anIntArray671[local586] == local903) {
													local1842 = new Class6_Sub53();
													local1842.aClass381_11 = local6;
													local1842.anObjectArray3 = local6.lb;
													Static131.aClass340_20.method8131(local1842);
													break label617;
												}
											}
										}
									}
									local6.anInt10122 = Static331.anInt8307;
								}
								if (Static623.anInt9826 > local6.anInt10123 && local6.anObjectArray6 != null) {
									local700 = new Class6_Sub53();
									local700.aClass381_11 = local6;
									local700.anObjectArray3 = local6.anObjectArray6;
									Static131.aClass340_20.method8131(local700);
								}
								if (Static535.anInt4136 > local6.anInt10123 && local6.anObjectArray23 != null) {
									local700 = new Class6_Sub53();
									local700.aClass381_11 = local6;
									local700.anObjectArray3 = local6.anObjectArray23;
									Static131.aClass340_20.method8131(local700);
								}
								if (Static305.anInt6023 > local6.anInt10123 && local6.anObjectArray27 != null) {
									local700 = new Class6_Sub53();
									local700.aClass381_11 = local6;
									local700.anObjectArray3 = local6.anObjectArray27;
									Static131.aClass340_20.method8131(local700);
								}
								if (Static349.anInt5933 > local6.anInt10123 && local6.anObjectArray25 != null) {
									local700 = new Class6_Sub53();
									local700.aClass381_11 = local6;
									local700.anObjectArray3 = local6.anObjectArray25;
									Static131.aClass340_20.method8131(local700);
								}
								if (Static140.anInt2884 > local6.anInt10123 && local6.anObjectArray24 != null) {
									local700 = new Class6_Sub53();
									local700.aClass381_11 = local6;
									local700.anObjectArray3 = local6.anObjectArray24;
									Static131.aClass340_20.method8131(local700);
								}
								if (Static414.anInt7187 > local6.anInt10123 && local6.anObjectArray30 != null) {
									local700 = new Class6_Sub53();
									local700.aClass381_11 = local6;
									local700.anObjectArray3 = local6.anObjectArray30;
									Static131.aClass340_20.method8131(local700);
								}
								if (Static128.anInt2539 > local6.anInt10123 && local6.anObjectArray31 != null) {
									local700 = new Class6_Sub53();
									local700.aClass381_11 = local6;
									local700.anObjectArray3 = local6.anObjectArray31;
									Static131.aClass340_20.method8131(local700);
								}
								local6.anInt10123 = Static633.anInt8242;
								if (local6.anObjectArray22 != null) {
									for (local420 = 0; local420 < Static686.anInt10489; local420++) {
										@Pc(2502) Class6_Sub53 local2502 = new Class6_Sub53();
										local2502.aClass381_11 = local6;
										local2502.anInt9917 = Static350.anInterface17Array2[local420].method8950();
										local2502.anInt9919 = Static350.anInterface17Array2[local420].method8951();
										local2502.anObjectArray3 = local6.anObjectArray22;
										Static131.aClass340_20.method8131(local2502);
									}
								}
								if (Static28.aBoolean28 && local6.anObjectArray10 != null) {
									local700 = new Class6_Sub53();
									local700.aClass381_11 = local6;
									local700.anObjectArray3 = local6.anObjectArray10;
									Static131.aClass340_20.method8131(local700);
								}
							}
							if (local6.anInt10156 == 5 && local6.anInt10147 != -1) {
								local6.method8748(Static276.aClass350_1, Static227.aClass298_1).method6944(local6.anInt10131, Static202.aClass75_5, Static687.aClass6_Sub44_33.aClass7_Sub11_1.method2916());
							}
							Static48.method6015(local6);
							if (local6.anInt10156 == 0) {
								method1066(arg0, local6.anInt10089, local30, local32, local34, local36, local19 - local6.anInt10136, local24 - local6.anInt10141, arg8, arg9, arg10, arg11);
								if (local6.aClass381Array2 != null) {
									method1066(local6.aClass381Array2, local6.anInt10089, local30, local32, local34, local36, local19 - local6.anInt10136, local24 - local6.anInt10141, arg8, arg9, arg10, arg11);
								}
								@Pc(2644) Class6_Sub25 local2644 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local6.anInt10089);
								if (local2644 != null) {
									if (Static129.aClass121_1 == Static517.aClass121_8 && local2644.anInt5008 == 0 && !Static484.aBoolean623 && local286 && !Static628.aBoolean728) {
										Static67.method816();
									}
									Static298.method4809(local2644.anInt5007, local24, local19, arg9, local34, arg11, local36, arg8, local30, arg10, local32);
								}
							}
						}
					}
				} else if (local30 < local34 && local32 < local36) {
					Static48.method6015(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)V")
	public static void method1067(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static605.anInt9561 <= arg2 && Static223.anInt4380 >= arg2) {
			@Pc(17) int local17 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3);
			@Pc(23) int local23 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg1);
			Static153.method3053(local23, local17, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!vo;)Lclient!vo;")
	public static Class381 method1071(@OriginalArg(0) Class381 arg0) {
		@Pc(4) int local4 = method1061(arg0).method5214();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4; local11++) {
			arg0 = Static69.method899(arg0.anInt10079);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1072() {
		@Pc(1) int local1 = Static661.anInt10532;
		@Pc(3) int[] local3 = Static591.anIntArray611;
		@Pc(8) int local8 = Static687.aClass6_Sub44_33.aClass7_Sub27_1.method7953();
		@Pc(30) boolean local30 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(103) int local103;
		for (@Pc(32) int local32 = 0; local32 < local1; local32++) {
			@Pc(39) Class60_Sub1_Sub1_Sub3_Sub1 local39 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local3[local32]];
			if (!local39.method2710()) {
				local39.anInt4825 = -1;
			} else if (local39.aBoolean229) {
				local39.anInt4825 = -1;
			} else {
				local39.method7280();
				if (local39.aShort100 >= 0 && local39.aShort102 >= 0 && local39.aShort101 < Static29.anInt380 && local39.aShort99 < Static327.anInt5650) {
					local39.aBoolean230 = local39.aBoolean369 ? local30 : false;
					if (local39 == Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1) {
						local39.anInt4825 = Integer.MAX_VALUE;
					} else {
						local103 = 0;
						if (!local39.aBoolean370) {
							local103++;
						}
						if (local39.anInt4853 > Static141.anInt8737) {
							local103 += 2;
						}
						local103 += 5 - local39.method4424((byte) -28) << 2;
						if (local39.aBoolean226 || local39.aBoolean227) {
							local103 += 512;
						} else {
							if (Static679.anInt6106 == 0) {
								local103 += 32;
							} else {
								local103 += 128;
							}
							local103 += 256;
						}
						local39.anInt4825 = local103 + 1;
					}
				} else {
					local39.anInt4825 = -1;
				}
			}
		}
		for (@Pc(155) int local155 = 0; local155 < Static201.anInt4069; local155++) {
			@Pc(166) Class60_Sub1_Sub1_Sub3_Sub2 local166 = ((Class6_Sub11) Static419.aClass74_45.method1401((long) Static531.anIntArray580[local155])).aClass60_Sub1_Sub1_Sub3_Sub2_1;
			if (local166.method4439() && local166.aClass294_1.method7167(Static303.aClass55_2)) {
				local166.method7280();
				if (local166.aShort100 >= 0 && local166.aShort102 >= 0 && local166.aShort101 < Static29.anInt380 && local166.aShort99 < Static327.anInt5650) {
					@Pc(213) int local213 = 0;
					if (!local166.aBoolean370) {
						local213++;
					}
					if (local166.anInt4853 > Static141.anInt8737) {
						local213 += 2;
					}
					local213 += 5 - local166.method4424((byte) -28) << 2;
					if (Static679.anInt6106 == 0) {
						if (local166.aClass294_1.aBoolean614) {
							local213 += 64;
						} else {
							local213 += 128;
						}
					} else if (Static679.anInt6106 == 1) {
						if (local166.aClass294_1.aBoolean614) {
							local213 += 32;
						} else {
							local213 += 64;
						}
					}
					if (local166.aClass294_1.aBoolean617) {
						local213 += 1024;
					} else if (!local166.aClass294_1.aBoolean616) {
						local213 += 256;
					}
					local166.anInt4825 = local213 + 1;
				} else {
					local166.anInt4825 = -1;
				}
			} else {
				local166.anInt4825 = -1;
			}
		}
		for (local103 = 0; local103 < Static236.aClass232Array1.length; local103++) {
			@Pc(292) Class232 local292 = Static236.aClass232Array1[local103];
			if (local292 != null) {
				if (local292.anInt6164 == 1) {
					@Pc(308) Class6_Sub11 local308 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local292.anInt6165);
					if (local308 != null) {
						@Pc(313) Class60_Sub1_Sub1_Sub3_Sub2 local313 = local308.aClass60_Sub1_Sub1_Sub3_Sub2_1;
						if (local313.anInt4825 >= 0) {
							local313.anInt4825 += 2048;
						}
					}
				} else if (local292.anInt6164 == 10) {
					@Pc(333) Class60_Sub1_Sub1_Sub3_Sub1 local333 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local292.anInt6165];
					if (local333 != null && local333 != Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 && local333.anInt4825 >= 0) {
						local333.anInt4825 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1075() {
		@Pc(1) int local1 = Static661.anInt10532;
		@Pc(3) int[] local3 = Static591.anIntArray611;
		@Pc(12) int local12 = Static185.aBoolean308 ? local1 : local1 + Static201.anInt4069;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(24) Class60_Sub1_Sub1_Sub3 local24;
			if (local14 < local1) {
				local24 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local3[local14]];
			} else {
				local24 = ((Class6_Sub11) Static419.aClass74_45.method1401((long) Static531.anIntArray580[local14 - local1])).aClass60_Sub1_Sub1_Sub3_Sub2_1;
			}
			if (local24.anInt4825 >= 0) {
				@Pc(44) int local44 = local24.method4424((byte) -28);
				if ((local44 & 0x1) == 0) {
					if ((local24.anInt9048 & 0x1FF) == 0 && (local24.anInt9057 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local24.anInt9048 & 0x1FF) == 256 && (local24.anInt9057 & 0x1FF) == 256) {
					continue;
				}
				local24.anInt9051 = Static248.method4318(local24.anInt9057, local24.aByte135, local24.anInt9048);
				Static610.method8414(local24, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!vo;)Z")
	public static boolean method1076(@OriginalArg(0) Class381 arg0) {
		if (Static628.aBoolean728) {
			if (method1061(arg0).anInt5776 != 0) {
				return false;
			}
			if (arg0.anInt10156 == 0) {
				return false;
			}
		}
		return arg0.aBoolean749;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1077(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static661.anInt10532;
		@Pc(3) int[] local3 = Static591.anIntArray611;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static201.anInt4069; local5++) {
			@Pc(15) Class60_Sub1_Sub1_Sub3 local15;
			if (local5 < local1) {
				local15 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class6_Sub11) Static419.aClass74_45.method1401((long) Static531.anIntArray580[local5 - local1])).aClass60_Sub1_Sub1_Sub3_Sub2_1;
			}
			if (local15.aByte135 == arg0 && local15.anInt4825 >= 0) {
				@Pc(41) int local41 = local15.method4424((byte) -28);
				if ((local41 & 0x1) == 0) {
					if ((local15.anInt9048 & 0x1FF) != 0 || (local15.anInt9057 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9048 & 0x1FF) != 256 || (local15.anInt9057 & 0x1FF) != 256) {
					continue;
				}
				@Pc(85) int local85;
				@Pc(90) int local90;
				@Pc(127) int local127;
				if (local41 == 1) {
					local85 = local15.anInt9048 >> 9;
					local90 = local15.anInt9057 >> 9;
					if (local15.anInt4825 > Static20.anIntArrayArray2[local85][local90]) {
						Static20.anIntArrayArray2[local85][local90] = local15.anInt4825;
						Static511.anIntArrayArray43[local85][local90] = 1;
					} else if (local15.anInt4825 == Static20.anIntArrayArray2[local85][local90]) {
						local127 = Static511.anIntArrayArray43[local85][local90]++;
					}
				} else {
					local85 = (local41 - 1) * 256 + 60;
					local90 = local15.anInt9048 - local85 >> 9;
					@Pc(154) int local154 = local15.anInt9057 - local85 >> 9;
					@Pc(161) int local161 = local15.anInt9048 + local85 >> 9;
					@Pc(168) int local168 = local15.anInt9057 + local85 >> 9;
					for (@Pc(170) int local170 = local90; local170 <= local161; local170++) {
						for (@Pc(173) int local173 = local154; local173 <= local168; local173++) {
							if (local15.anInt4825 > Static20.anIntArrayArray2[local170][local173]) {
								Static20.anIntArrayArray2[local170][local173] = local15.anInt4825;
								Static511.anIntArrayArray43[local170][local173] = 1;
							} else if (local15.anInt4825 == Static20.anIntArrayArray2[local170][local173]) {
								local127 = Static511.anIntArrayArray43[local170][local173]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1078() {
		Static472.anInt8073 = -2;
		Static597.anInt9453 = 0;
		Static513.anInt8474 = -2;
	}
}
