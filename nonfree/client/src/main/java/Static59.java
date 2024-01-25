import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
	public static int anInt1473 = 0;

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_52 = new Class217(73, 6);

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!ct;Lclient!ct;)I")
	public static int method1446(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Class30 arg1) {
		@Pc(10) int local10 = 0;
		if (arg1.method1154(Static144.anInt3081)) {
			local10++;
		}
		if (arg1.method1154(Static31.anInt788)) {
			local10++;
		}
		if (arg1.method1154(Static78.anInt1753)) {
			local10++;
		}
		if (arg0.method1154(Static144.anInt3081)) {
			local10++;
		}
		if (arg0.method1154(Static31.anInt788)) {
			local10++;
		}
		if (arg0.method1154(Static78.anInt1753)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIZI)V")
	public static void method1447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg0 | (arg3 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class1_Sub26 local20 = (Class1_Sub26) Static143.aClass38_12.method1475(local14);
		if (local20 == null) {
			local20 = new Class1_Sub26();
			Static143.aClass38_12.method1472(local20, local14);
		}
		if (local20.anIntArray255.length <= arg2) {
			@Pc(41) int[] local41 = new int[arg2 + 1];
			@Pc(46) int[] local46 = new int[arg2 + 1];
			for (@Pc(48) int local48 = 0; local48 < local20.anIntArray255.length; local48++) {
				local41[local48] = local20.anIntArray255[local48];
				local46[local48] = local20.anIntArray256[local48];
			}
			for (@Pc(74) int local74 = local20.anIntArray255.length; local74 < arg2; local74++) {
				local41[local74] = -1;
				local46[local74] = 0;
			}
			local20.anIntArray256 = local46;
			local20.anIntArray255 = local41;
		}
		local20.anIntArray255[arg2] = arg4;
		local20.anIntArray256[arg2] = arg1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[Lclient!th;Lclient!fp;IZII[BIII)[I")
	public static int[] method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196[] arg2, @OriginalArg(3) Class63 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11 = (arg10 & 0x7) * 8;
		@Pc(17) int local17 = (arg8 & 0x7) * 8;
		@Pc(25) int local25;
		@Pc(29) int local29;
		if (!arg5) {
			@Pc(23) Class196 local23 = arg2[arg4];
			for (local25 = 0; local25 < 8; local25++) {
				for (local29 = 0; local29 < 8; local29++) {
					@Pc(43) int local43 = Static171.method3206(local29 & 0x7, arg6, local25 & 0x7) + arg9;
					@Pc(55) int local55 = Static320.method4038(local29 & 0x7, local25 & 0x7, arg6) + arg0;
					if (local43 > 0 && local43 < Static311.anInt5653 - 1 && local55 > 0 && local55 < Static189.anInt3820 - 1) {
						local23.method5322(local43, local55);
					}
				}
			}
		}
		@Pc(93) byte local93;
		if (arg5) {
			local93 = 1;
		} else {
			local93 = 4;
		}
		@Pc(102) Class1_Sub7 local102 = new Class1_Sub7(arg7);
		local25 = (arg10 & 0xFFFFFFF8) << 3;
		local29 = (arg8 & 0x1FFFFFF8) << 3;
		@Pc(116) byte local116 = 0;
		@Pc(118) byte local118 = 0;
		if (arg6 == 1) {
			local118 = 1;
		} else if (arg6 == 2) {
			local118 = 1;
			local116 = 1;
		} else if (arg6 == 3) {
			local116 = 1;
		}
		@Pc(203) int local203;
		@Pc(211) int local211;
		@Pc(356) int local356;
		@Pc(365) int local365;
		@Pc(374) int local374;
		@Pc(382) int local382;
		for (@Pc(143) int local143 = 0; local143 < local93; local143++) {
			for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
				for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
					if (arg1 != local143 || local147 < local11 || local11 + 8 < local147 || local151 < local17 || local17 + 8 < local151) {
						Static72.method1604(-1, 0, false, 0, arg5, 0, local102, 0, -1, 0, 0);
					} else if (local11 + 8 == local147 || local151 == local17 + 8) {
						if (arg6 == 0) {
							local203 = arg9 + local147 - local11;
							local211 = local151 + arg0 - local17;
						} else if (arg6 == 1) {
							local211 = local11 + arg0 + 8 - local147;
							local203 = local151 + arg9 - local17;
						} else if (arg6 == 2) {
							local211 = local17 + arg0 + 8 - local151;
							local203 = local11 + arg9 + 8 - local147;
						} else {
							local211 = local147 + arg0 - local11;
							local203 = local17 + arg9 + 8 - local151;
						}
						Static72.method1604(local211, 0, true, local29 + local151, arg5, 0, local102, local147 + local25, local203, 0, arg4);
					} else {
						local203 = arg9 + Static171.method3206(local151 & 0x7, arg6, local147 & 0x7);
						local211 = Static320.method4038(local151 & 0x7, local147 & 0x7, arg6) + arg0;
						Static72.method1604(local211, local116, false, local151 + local29, arg5, arg6, local102, local25 + local147, local203, local118, arg4);
						if (local147 == 63 || local151 == 63) {
							local356 = local147 == 63 ? 64 : local147;
							local365 = local151 == 63 ? 64 : local151;
							if (arg6 == 0) {
								local374 = local356 + arg9 - local11;
								local382 = local365 + arg0 - local17;
							} else if (arg6 == 1) {
								local382 = local11 + arg0 + 8 - local356;
								local374 = arg9 + local365 - local17;
							} else if (arg6 == 2) {
								local374 = local11 + arg9 + 8 - local356;
								local382 = local17 + arg0 + 8 - local365;
							} else {
								local382 = arg0 + local356 - local11;
								local374 = arg9 + local17 + 8 - local365;
							}
							if (local374 >= 0 && local374 < Static311.anInt5653 && local382 >= 0 && Static189.anInt3820 > local382) {
								Static102.anIntArrayArrayArray134[arg4][local374][local382] = Static102.anIntArrayArrayArray134[arg4][local116 + local203][local118 + local211];
							}
						}
					}
				}
			}
		}
		@Pc(520) boolean local520 = false;
		@Pc(615) int local615;
		@Pc(744) int local744;
		@Pc(782) int local782;
		while (local102.anInt2219 < local102.aByteArray41.length) {
			local203 = local102.method2132();
			if (local203 == 128) {
				Static69.anIntArray136[0] = local102.method2161();
				Static69.anIntArray136[1] = local102.method2141();
				Static69.anIntArray136[2] = local102.method2141();
				Static69.anIntArray136[3] = local102.method2141();
				local520 = true;
				Static69.anIntArray136[4] = local102.method2161();
			} else {
				if (local203 != 129) {
					local102.anInt2219--;
					break;
				}
				if (Static243.aByteArrayArrayArray6 == null) {
					Static243.aByteArrayArrayArray6 = new byte[4][][];
				}
				for (local211 = 0; local211 < 4; local211++) {
					@Pc(591) byte local591 = local102.method2122();
					if (local591 == 0 && Static243.aByteArrayArrayArray6[arg4] != null) {
						if (local211 <= arg1) {
							local365 = arg9;
							local374 = arg9 + 7;
							local382 = arg0;
							local615 = arg0 + 7;
							if (local374 < 0) {
								local374 = 0;
							} else if (local374 >= Static311.anInt5653) {
								local374 = Static311.anInt5653;
							}
							if (arg0 < 0) {
								local382 = 0;
							} else if (Static189.anInt3820 <= arg0) {
								local382 = Static189.anInt3820;
							}
							if (arg9 < 0) {
								local365 = 0;
							} else if (arg9 >= Static311.anInt5653) {
								local365 = Static311.anInt5653;
							}
							if (local615 < 0) {
								local615 = 0;
							} else if (local615 >= Static189.anInt3820) {
								local615 = Static189.anInt3820;
							}
							while (local374 > local365) {
								while (local615 > local382) {
									Static243.aByteArrayArrayArray6[arg4][local365][local382] = 0;
									local382++;
								}
								local365++;
							}
						}
					} else if (local591 == 1) {
						if (Static243.aByteArrayArrayArray6[arg4] == null) {
							Static243.aByteArrayArrayArray6[arg4] = new byte[Static311.anInt5653 + 1][Static189.anInt3820 + 1];
						}
						for (local365 = 0; local365 < 64; local365 += 4) {
							for (local374 = 0; local374 < 64; local374 += 4) {
								@Pc(731) byte local731 = local102.method2122();
								if (local211 <= arg1) {
									for (local615 = local365; local615 < local365 + 4; local615++) {
										for (local744 = local374; local744 < local374 + 4; local744++) {
											if (local11 <= local615 && local11 + 8 > local615 && local744 >= local17 && local17 + 8 > local17) {
												local782 = Static171.method3206(local744 & 0x7, arg6, local615 & 0x7) + arg9;
												@Pc(794) int local794 = Static320.method4038(local744 & 0x7, local615 & 0x7, arg6) + arg0;
												if (local782 >= 0 && local782 < Static311.anInt5653 && local794 >= 0 && Static189.anInt3820 > local794) {
													Static243.aByteArrayArrayArray6[arg4][local782][local794] = local731;
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
		if (!arg5) {
			@Pc(862) Class54 local862 = null;
			label279: while (true) {
				label272: do {
					while (true) {
						while (local102.anInt2219 < local102.aByteArray41.length) {
							local211 = local102.method2132();
							if (local211 == 0) {
								local862 = new Class54(local102);
							} else {
								if (local211 == 1) {
									local356 = local102.method2132();
									continue label272;
								}
								if (local211 != 2) {
									throw new IllegalStateException();
								}
								if (local862 == null) {
									local862 = new Class54();
								}
								local862.method1784(local102);
							}
						}
						if (local862 != null) {
							Static340.method5698(local862, arg0 >> 3, arg9 >> 3);
						}
						break label279;
					}
				} while (local356 <= 0);
				for (local365 = 0; local365 < local356; local365++) {
					@Pc(895) Class1_Sub5_Sub1 local895 = new Class1_Sub5_Sub1(local102);
					if (local895.anInt4975 == 31) {
						@Pc(907) Class212 local907 = Static36.method908(local102.method2161());
						local895.method4541(local907.anInt6449, local907.anInt6445, local907.anInt6447, local907.anInt6450);
					}
					local382 = local895.anInt4966 >> 7;
					local615 = local895.anInt4965 >> 7;
					if (arg1 == local895.anInt4976 && local11 <= local382 && local382 < local11 + 8 && local17 <= local615 && local615 < local17 + 8) {
						local744 = (arg9 << 7) + Static315.method5395(local895.anInt4966 & 0x3FF, local895.anInt4965 & 0x3FF, arg6);
						local782 = (arg0 << 7) + Static3.method129(arg6, local895.anInt4966 & 0x3FF, local895.anInt4965 & 0x3FF);
						local895.anInt4965 = local782;
						local895.anInt4966 = local744;
						local382 = local895.anInt4966 >> 7;
						local615 = local895.anInt4965 >> 7;
						if (local382 >= 0 && local615 >= 0 && Static311.anInt5653 > local382 && Static189.anInt3820 > local615) {
							local895.anInt4967 = Static102.anIntArrayArrayArray134[arg1][local382][local615] - local895.anInt4967;
							if (arg3.method4592() > 0) {
								Static129.method2664(local895);
							}
						}
					}
				}
			}
		}
		if (Static243.aByteArrayArrayArray6 != null && Static243.aByteArrayArrayArray6[arg4] != null) {
			local203 = arg9 + 7;
			local211 = arg0 + 7;
			for (local356 = arg9; local356 < local203; local356++) {
				for (local365 = arg0; local365 < local211; local365++) {
					Static243.aByteArrayArrayArray6[arg4][local356][local365] = 0;
				}
			}
		}
		if (local520) {
			return Static69.anIntArray136;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public static void method1449() {
		Static272.method4848((long) Static51.anInt1301, Static9.aClass63_1);
		if (Static336.anInt6389 != -1) {
			Static367.method6082(Static336.anInt6389);
		}
		for (@Pc(27) int local27 = 0; local27 < Static77.anInt1698; local27++) {
			if (Static207.aBooleanArray21[local27]) {
				Static149.aBooleanArray16[local27] = true;
			}
			Static240.aBooleanArray26[local27] = Static207.aBooleanArray21[local27];
			Static207.aBooleanArray21[local27] = false;
		}
		Static185.anInt1930 = Static51.anInt1301;
		if (Static9.aClass63_1.method4598()) {
			Static165.aBoolean242 = true;
		}
		if (Static336.anInt6389 != -1) {
			Static77.anInt1698 = 0;
			Static297.method5179();
		}
		Static9.aClass63_1.method4651();
		Static290.method5227(Static235.anInt4746);
		Static217.anInt4314 = 0;
	}
}
