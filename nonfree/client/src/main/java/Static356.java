import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!wp", name = "K", descriptor = "Lclient!r;")
	public static Class171 aClass171_4;

	@OriginalMember(owner = "client!wp", name = "F", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_54 = new Class16();

	@OriginalMember(owner = "client!wp", name = "J", descriptor = "[Lclient!km;")
	public static final Class67_Sub3_Sub3_Sub1[] aClass67_Sub3_Sub3_Sub1Array1 = new Class67_Sub3_Sub3_Sub1[32768];

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
	public static Object method5717(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static44.aBoolean54) {
			try {
				@Pc(23) Class162 local23 = (Class162) Class.forName("Class162_Sub1").getDeclaredConstructor().newInstance();
				local23.method4443(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static44.aBoolean54 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILclient!uo;I)V")
	public static void method5718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class129 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static164.anInt3089 == 0 || Static66.anInt2106 == 0) {
			return;
		}
		arg2.method4996(Static169.anInt6316, Static348.anInt6642, Static164.anInt3089, Static66.anInt2106);
		arg2.method4952(Static162.anInt3053, Static97.anInt1767, Static164.anInt3089, Static66.anInt2106);
		@Pc(32) Class61 local32 = arg2.method4983();
		local32.method3668(Static328.anInt6298, Static63.anInt1169, Static165.anInt3296, Static177.anInt3491, Static195.anInt4513, Static355.anInt6751);
		arg2.method4971(local32);
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(73) int local73;
		@Pc(82) int local82;
		@Pc(91) int local91;
		if (Static129.aClass77Array3 != null) {
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			@Pc(52) int local52 = arg2.method4976();
			local61 = local52 * (arg0 - Static169.anInt6316) / Static164.anInt3089;
			local70 = (arg1 - Static348.anInt6642) * local52 / Static66.anInt2106;
			local73 = arg2.method5016();
			local82 = (arg0 - Static169.anInt6316) * local73 / Static164.anInt3089;
			local91 = local73 * (arg1 - Static348.anInt6642) / Static66.anInt2106;
			@Pc(106) int[] local106 = new int[] { local61, local70, local52 };
			local32.method3661(local106);
			@Pc(124) int[] local124 = new int[] { local82, local91, local73 };
			local32.method3661(local124);
			@Pc(129) float local129 = 0.0F;
			@Pc(138) int local138 = local124[0] - local106[0];
			@Pc(147) int local147 = local124[1] - local106[1];
			@Pc(156) int local156 = local124[2] - local106[2];
			while (local129 < 1.0F) {
				@Pc(169) int local169 = (int) ((float) local106[0] + (float) local138 * local129);
				@Pc(173) int local173 = local169 >> 7;
				@Pc(184) int local184 = (int) ((float) local106[2] + local129 * (float) local156);
				@Pc(188) int local188 = local184 >> 7;
				if (local173 > 0 && local188 > 0 && Static24.anInt454 > local173 && local188 < Static240.anInt4832) {
					@Pc(207) int local207 = Static322.anInt6250;
					if (local207 < 3 && (Static1.aByteArrayArrayArray1[1][local173][local188] & 0x2) != 0) {
						local207++;
					}
					if ((float) Static129.aClass77Array3[local207].method4133(local169, local184) < (float) local106[1] + local129 * (float) local147) {
						local47 = Static156.aClass67_Sub3_Sub3_Sub2_2.method4368() * 64 + local169 - 64 >> 7;
						local49 = local184 + Static156.aClass67_Sub3_Sub3_Sub2_2.method4368() * 64 - 64 >> 7;
						break;
					}
				}
				local129 = (float) ((double) local129 + 0.01D);
			}
			if (local47 != -1 && local49 != -1) {
				if (Static103.aBoolean118 && (Static335.anInt6393 & 0x40) != 0) {
					@Pc(301) Class137 local301 = Static188.method3467(Static219.anInt4454, Static122.anInt2282);
					if (local301 == null) {
						Static129.method1989();
					} else {
						Static87.method1252(local49, local47, 50, " ->", Static320.anInt6202, 0L, Static110.aString39);
					}
				} else {
					if (Static68.anInt1264 == 1) {
						Static87.method1252(local49, local47, 3, "", -1, 0L, Static58.aClass117_21.method2684(Static230.anInt4634));
					}
					Static87.method1252(local49, local47, 23, "", -1, 0L, Static282.aString55);
				}
			}
		}
		@Pc(350) Class210 local350 = Static33.aClass210_2;
		for (@Pc(355) Class10_Sub1 local355 = (Class10_Sub1) local350.method5608(); local355 != null; local355 = (Class10_Sub1) local350.method5615()) {
			if (local355.method62(arg0, arg1, arg2) && Static322.anInt6250 == local355.anInt69) {
				@Pc(476) int local476;
				@Pc(488) int local488;
				if (local355.aClass67_1 instanceof Class67_Sub3_Sub3_Sub2) {
					@Pc(376) Class67_Sub3_Sub3_Sub2 local376 = (Class67_Sub3_Sub3_Sub2) local355.aClass67_1;
					local61 = local376.method4368();
					if ((local61 & 0x1) == 0 && (local376.anInt6308 & 0x7F) == 0 && (local376.anInt6310 & 0x7F) == 0 || (local61 & 0x1) == 1 && (local376.anInt6308 & 0x7F) == 64 && (local376.anInt6310 & 0x7F) == 64) {
						local70 = local376.anInt6308 - (local376.method4368() - 1) * 64;
						local73 = local376.anInt6310 - (local376.method4368() - 1) * 64;
						for (local82 = 0; local82 < Static141.anInt2601; local82++) {
							@Pc(453) Class67_Sub3_Sub3_Sub1 local453 = aClass67_Sub3_Sub3_Sub1Array1[Static4.anIntArray4[local82]];
							if (local453 != null && Static293.anInt5807 != local453.anInt5049 && local453.aBoolean330) {
								local476 = local453.anInt6308 + 64 - local453.aClass82_1.anInt1871 * 64;
								local488 = local453.anInt6310 - (local453.aClass82_1.anInt1871 - 1) * 64;
								if (local70 <= local476 && local453.aClass82_1.anInt1871 <= local376.method4368() - (local476 - local70 >> 7) && local488 >= local73 && local453.aClass82_1.anInt1871 <= local376.method4368() - (local488 - local73 >> 7)) {
									Static344.method5606(local453);
									local453.anInt5049 = Static293.anInt5807;
								}
							}
						}
						for (local91 = 0; local91 < Static331.anInt6366; local91++) {
							@Pc(551) Class67_Sub3_Sub3_Sub2 local551 = Static105.aClass67_Sub3_Sub3_Sub2Array1[Static87.anIntArray104[local91]];
							if (local551 != null && local551.anInt5049 != Static293.anInt5807 && local376 != local551 && local551.aBoolean330) {
								local488 = local551.anInt6308 + 64 - local551.method4368() * 64;
								@Pc(593) int local593 = local551.anInt6310 - (local551.method4368() - 1) * 64;
								if (local488 >= local70 && local551.method4368() <= local376.method4368() - (local488 - local70 >> 7) && local73 <= local593 && local551.method4368() <= local376.method4368() - (local593 - local73 >> 7)) {
									Static128.method1985(local551);
									local551.anInt5049 = Static293.anInt5807;
								}
							}
						}
					}
					if (local376.anInt5049 == Static293.anInt5807) {
						continue;
					}
					Static128.method1985(local376);
					local376.anInt5049 = Static293.anInt5807;
				}
				if (local355.aClass67_1 instanceof Class67_Sub3_Sub3_Sub1) {
					@Pc(672) Class67_Sub3_Sub3_Sub1 local672 = (Class67_Sub3_Sub3_Sub1) local355.aClass67_1;
					if (local672.aClass82_1 != null) {
						if ((local672.aClass82_1.anInt1871 & 0x1) == 0 && (local672.anInt6308 & 0x7F) == 0 && (local672.anInt6310 & 0x7F) == 0 || (local672.aClass82_1.anInt1871 & 0x1) == 1 && (local672.anInt6308 & 0x7F) == 64 && (local672.anInt6310 & 0x7F) == 64) {
							local61 = local672.anInt6308 - (local672.aClass82_1.anInt1871 - 1) * 64;
							local70 = local672.anInt6310 - (local672.aClass82_1.anInt1871 - 1) * 64;
							for (local73 = 0; local73 < Static141.anInt2601; local73++) {
								@Pc(759) Class67_Sub3_Sub3_Sub1 local759 = aClass67_Sub3_Sub3_Sub1Array1[Static4.anIntArray4[local73]];
								if (local759 != null && local759.anInt5049 != Static293.anInt5807 && local672 != local759 && local759.aBoolean330) {
									local91 = local759.anInt6308 + 64 - local759.aClass82_1.anInt1871 * 64;
									local476 = local759.anInt6310 - (local759.aClass82_1.anInt1871 - 1) * 64;
									if (local91 >= local61 && local759.aClass82_1.anInt1871 <= local672.aClass82_1.anInt1871 - (local91 - local61 >> 7) && local70 <= local476 && local672.aClass82_1.anInt1871 - (local476 - local70 >> 7) >= local759.aClass82_1.anInt1871) {
										Static344.method5606(local759);
										local759.anInt5049 = Static293.anInt5807;
									}
								}
							}
							for (local82 = 0; local82 < Static331.anInt6366; local82++) {
								@Pc(857) Class67_Sub3_Sub3_Sub2 local857 = Static105.aClass67_Sub3_Sub3_Sub2Array1[Static87.anIntArray104[local82]];
								if (local857 != null && local857.anInt5049 != Static293.anInt5807 && local857.aBoolean330) {
									local476 = local857.anInt6308 + 64 - local857.method4368() * 64;
									local488 = local857.anInt6310 + 64 - local857.method4368() * 64;
									if (local61 <= local476 && local857.method4368() <= local672.aClass82_1.anInt1871 - (local476 - local61 >> 7) && local70 <= local488 && local857.method4368() <= local672.aClass82_1.anInt1871 - (local488 - local70 >> 7)) {
										Static128.method1985(local857);
										local857.anInt5049 = Static293.anInt5807;
									}
								}
							}
						}
						if (local672.anInt5049 == Static293.anInt5807) {
							continue;
						}
						Static344.method5606(local672);
						local672.anInt5049 = Static293.anInt5807;
					}
				}
				if (local355.aClass67_1 instanceof Class67_Sub5_Sub1) {
					@Pc(982) Class11_Sub40 local982 = (Class11_Sub40) Static301.aClass58_35.method1009((long) (local355.anInt68 << 14 | local355.anInt69 << 28 | local355.anInt70));
					if (local982 != null) {
						for (@Pc(990) Class11_Sub29 local990 = (Class11_Sub29) local982.aClass16_53.method181(); local990 != null; local990 = (Class11_Sub29) local982.aClass16_53.method192()) {
							@Pc(997) Class170 local997 = Static283.method4717(local990.anInt4569);
							if (Static103.aBoolean118) {
								@Pc(1008) Class11_Sub4_Sub6 local1008 = Static307.anInt4796 == -1 ? null : Static286.method4771(Static307.anInt4796);
								if ((Static335.anInt6393 & 0x1) != 0 && (local1008 == null || local997.method4537(Static307.anInt4796, local1008.anInt1448) != local1008.anInt1448)) {
									Static87.method1252(local355.anInt68, local355.anInt70, 60, Static63.aString10 + " -> <col=ff9040>" + local997.aString53, Static320.anInt6202, (long) local990.anInt4569, Static110.aString39);
								}
							} else {
								@Pc(1059) String[] local1059 = local997.aStringArray43;
								for (local82 = 4; local82 >= 0; local82--) {
									if (local1059 != null && local1059[local82] != null) {
										@Pc(1071) byte local1071 = 0;
										local476 = Static85.anInt1528;
										if (local82 == 0) {
											local1071 = 25;
										}
										if (local82 == 1) {
											local1071 = 48;
										}
										if (local82 == 2) {
											local1071 = 57;
										}
										if (local82 == 3) {
											local1071 = 51;
										}
										if (local82 == local997.anInt5295) {
											local476 = local997.anInt5300;
										}
										if (local82 == 4) {
											local1071 = 59;
										}
										if (local82 == local997.anInt5297) {
											local476 = local997.anInt5309;
										}
										Static87.method1252(local355.anInt68, local355.anInt70, local1071, "<col=ff9040>" + local997.aString53, local476, (long) local990.anInt4569, local1059[local82]);
									}
								}
								Static87.method1252(local355.anInt68, local355.anInt70, 1004, "<col=ff9040>" + local997.aString53, Static282.anInt5589, (long) local990.anInt4569, Static16.aClass117_7.method2684(Static230.anInt4634));
							}
						}
					}
				}
				if (local355.aClass67_1 instanceof Interface7) {
					@Pc(1198) Interface7 local1198 = (Interface7) local355.aClass67_1;
					@Pc(1204) Class84 local1204 = Static108.method1650(local1198.method5410());
					if (local1204.anIntArray142 != null) {
						local1204 = local1204.method1635();
					}
					if (local1204 != null) {
						if (Static103.aBoolean118) {
							@Pc(1224) Class11_Sub4_Sub6 local1224 = Static307.anInt4796 == -1 ? null : Static286.method4771(Static307.anInt4796);
							if ((Static335.anInt6393 & 0x4) != 0 && (local1224 == null || local1204.method1640(local1224.anInt1448, Static307.anInt4796) != local1224.anInt1448)) {
								Static87.method1252(local355.anInt68, local355.anInt70, 17, Static63.aString10 + " -> <col=00ffff>" + local1204.aString21, Static320.anInt6202, Static130.method4120(local355.anInt70, local355.anInt68, local1198), Static110.aString39);
							}
						} else {
							@Pc(1279) String[] local1279 = local1204.aStringArray18;
							if (local1279 != null) {
								for (local73 = 4; local73 >= 0; local73--) {
									if (local1279[local73] != null) {
										@Pc(1291) short local1291 = 0;
										local91 = Static85.anInt1528;
										if (local73 == 0) {
											local1291 = 44;
										}
										if (local73 == 1) {
											local1291 = 12;
										}
										if (local73 == 2) {
											local1291 = 10;
										}
										if (local73 == 3) {
											local1291 = 49;
										}
										if (local73 == local1204.anInt1998) {
											local91 = local1204.anInt2003;
										}
										if (local73 == 4) {
											local1291 = 1011;
										}
										if (local1204.anInt1994 == local73) {
											local91 = local1204.anInt2018;
										}
										Static87.method1252(local355.anInt68, local355.anInt70, local1291, "<col=00ffff>" + local1204.aString21, local91, Static130.method4120(local355.anInt70, local355.anInt68, local1198), local1279[local73]);
									}
								}
							}
							Static87.method1252(local355.anInt68, local355.anInt70, 1003, "<col=00ffff>" + local1204.aString21, Static282.anInt5589, (long) local1204.anInt2012, Static16.aClass117_7.method2684(Static230.anInt4634));
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([[[BIIIIIILclient!uo;IIBII)V")
	public static void method5719(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class129 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg10 == 0 || arg11 == 0) {
			return;
		}
		if (arg10 == 9) {
			arg10 = 1;
			arg2 = arg2 + 1 & 0x3;
		}
		if (arg10 == 10) {
			arg2 = arg2 + 3 & 0x3;
			arg10 = 1;
		}
		if (arg10 == 11) {
			arg10 = 8;
			arg2 = arg2 + 3 & 0x3;
		}
		arg7.method4988(arg6, arg4, arg1, arg9, arg3, arg5, arg0[arg10 - 1][arg2], arg11, arg8);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static257.method4460(arg0)) {
			Static259.method4513(arg5, arg2, Static188.aClass137ArrayArray1[arg0], -1, arg3, arg6, arg1, arg7, arg4);
		} else if (arg5 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static292.aBooleanArray22[local15] = true;
			}
		} else {
			Static292.aBooleanArray22[arg5] = true;
		}
	}
}
