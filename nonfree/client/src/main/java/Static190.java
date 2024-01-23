import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "[I")
	public static int[] anIntArray355;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "Lclient!jd;")
	public static Class84 aClass84_90;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString216 = "shake:";

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "[C")
	public static char[] aCharArray6 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIILclient!fc;JLclient!fc;Lclient!fc;)V")
	public static void method3489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class36 arg6, @OriginalArg(7) Class36 arg7) {
		@Pc(3) Class72 local3 = new Class72();
		local3.aClass36_7 = arg4;
		local3.anInt2193 = arg1 * 128 + 64;
		local3.anInt2190 = arg2 * 128 + 64;
		local3.anInt2191 = arg3;
		local3.aLong109 = arg5;
		local3.aClass36_8 = arg6;
		local3.aClass36_6 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class2_Sub31 local42 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt5708; local46++) {
				@Pc(55) Class34 local55 = local42.aClass34Array2[local46];
				if ((local55.aLong49 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass36_1.method4881();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt2192 = -local34;
		if (Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2] = new Class2_Sub31(arg0, arg1, arg2);
		}
		Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2].aClass72_1 = local3;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!mn;IIB)V")
	public static void method3490(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt3498 == 1) {
			Static32.method642((short) 10, arg0.anInt3552, 0L, -1, 0, "", arg0.aString170);
		}
		@Pc(41) String local41;
		if (arg0.anInt3498 == 2 && !Static133.aBoolean219) {
			local41 = Static17.method361(arg0);
			if (local41 != null) {
				Static32.method642((short) 31, arg0.anInt3552, 0L, -1, -1, "<col=00ff00>" + arg0.aString176, local41);
			}
		}
		if (arg0.anInt3498 == 3) {
			Static32.method642((short) 45, arg0.anInt3552, 0L, -1, 0, "", Static91.aString102);
		}
		if (arg0.anInt3498 == 4) {
			Static32.method642((short) 48, arg0.anInt3552, 0L, -1, 0, "", arg0.aString170);
		}
		if (arg0.anInt3498 == 5) {
			Static32.method642((short) 50, arg0.anInt3552, 0L, -1, 0, "", arg0.aString170);
		}
		if (arg0.anInt3498 == 6 && Static50.aClass115_6 == null) {
			Static32.method642((short) 51, arg0.anInt3552, 0L, -1, -1, "", arg0.aString170);
		}
		@Pc(176) int local176;
		@Pc(174) int local174;
		if (arg0.anInt3538 == 2) {
			local174 = 0;
			for (local176 = 0; local176 < arg0.anInt3475; local176++) {
				for (@Pc(186) int local186 = 0; local186 < arg0.anInt3530; local186++) {
					@Pc(197) int local197 = local186 * (arg0.anInt3489 + 32);
					@Pc(205) int local205 = (arg0.anInt3492 + 32) * local176;
					if (local174 < 20) {
						local205 += arg0.anIntArray273[local174];
						local197 += arg0.anIntArray278[local174];
					}
					if (arg2 >= local197 && local205 <= arg1 && arg2 < local197 + 32 && arg1 < local205 + 32) {
						Static43.aClass115_5 = arg0;
						Static222.anInt4609 = local174;
						if (arg0.anIntArray271[local174] > 0) {
							@Pc(272) Class2_Sub11 local272 = Static35.method708(arg0);
							@Pc(281) Class155 local281 = Static152.method2616(arg0.anIntArray271[local174] - 1);
							if (Static106.anInt2305 == 1 && local272.method1325()) {
								if (Static15.anInt352 != arg0.anInt3552 || Static183.anInt3887 != local174) {
									Static32.method642((short) 21, arg0.anInt3552, (long) local281.anInt4832, -1, local174, Static8.aString13 + " -> <col=ff9040>" + local281.aString239, Static212.aString224);
								}
							} else if (Static133.aBoolean219 && local272.method1325()) {
								@Pc(589) Class2_Sub3_Sub8 local589 = Static251.anInt5008 == -1 ? null : Static268.method4459(Static251.anInt5008);
								if ((Static212.anInt4455 & 0x10) != 0 && (local589 == null || local281.method3928(Static251.anInt5008, local589.anInt2217) != local589.anInt2217)) {
									Static32.method642((short) 16, arg0.anInt3552, (long) local281.anInt4832, Static112.anInt2421, local174, Static150.aString153 + " -> <col=ff9040>" + local281.aString239, Static296.aString299);
								}
							} else {
								@Pc(303) String[] local303 = local281.aStringArray27;
								if (Static92.aBoolean156) {
									local303 = Static171.method2955(local303);
								}
								@Pc(315) int local315;
								@Pc(334) byte local334;
								if (local272.method1325()) {
									for (local315 = 4; local315 >= 3; local315--) {
										if (local303 != null && local303[local315] != null) {
											if (local315 == 3) {
												local334 = 30;
											} else {
												local334 = 23;
											}
											Static32.method642(local334, arg0.anInt3552, (long) local281.anInt4832, -1, local174, "<col=ff9040>" + local281.aString239, local303[local315]);
										}
									}
								}
								if (local272.method1326()) {
									Static32.method642((short) 47, arg0.anInt3552, (long) local281.anInt4832, Static124.anInt2629, local174, "<col=ff9040>" + local281.aString239, Static212.aString224);
								}
								if (local272.method1325() && local303 != null) {
									for (local315 = 2; local315 >= 0; local315--) {
										if (local303[local315] != null) {
											local334 = 0;
											if (local315 == 0) {
												local334 = 40;
											}
											if (local315 == 1) {
												local334 = 4;
											}
											if (local315 == 2) {
												local334 = 2;
											}
											Static32.method642(local334, arg0.anInt3552, (long) local281.anInt4832, -1, local174, "<col=ff9040>" + local281.aString239, local303[local315]);
										}
									}
								}
								local303 = arg0.aStringArray18;
								if (Static92.aBoolean156) {
									local303 = Static171.method2955(local303);
								}
								if (local303 != null) {
									for (local315 = 4; local315 >= 0; local315--) {
										if (local303[local315] != null) {
											local334 = 0;
											if (local315 == 0) {
												local334 = 57;
											}
											if (local315 == 1) {
												local334 = 18;
											}
											if (local315 == 2) {
												local334 = 33;
											}
											if (local315 == 3) {
												local334 = 49;
											}
											if (local315 == 4) {
												local334 = 7;
											}
											Static32.method642(local334, arg0.anInt3552, (long) local281.anInt4832, -1, local174, "<col=ff9040>" + local281.aString239, local303[local315]);
										}
									}
								}
								Static32.method642((short) 1003, arg0.anInt3552, (long) local281.anInt4832, Static188.anInt3950, local174, "<col=ff9040>" + local281.aString239, Static30.aString43);
							}
						}
					}
					local174++;
				}
			}
		}
		if (!arg0.aBoolean291) {
			return;
		}
		if (!Static133.aBoolean219) {
			for (local174 = 9; local174 >= 5; local174--) {
				@Pc(743) String local743 = Static294.method4873(arg0, local174);
				if (local743 != null) {
					Static32.method642((short) 1007, arg0.anInt3552, (long) (local174 + 1), Static254.method4106(arg0, local174), arg0.anInt3499, arg0.aString173, local743);
				}
			}
			local41 = Static17.method361(arg0);
			if (local41 != null) {
				Static32.method642((short) 31, arg0.anInt3552, 0L, -1, arg0.anInt3499, arg0.aString173, local41);
			}
			for (local176 = 4; local176 >= 0; local176--) {
				@Pc(810) String local810 = Static294.method4873(arg0, local176);
				if (local810 != null) {
					Static32.method642((short) 29, arg0.anInt3552, (long) (local176 + 1), Static254.method4106(arg0, local176), arg0.anInt3499, arg0.aString173, local810);
				}
			}
			if (Static35.method708(arg0).method1313()) {
				if (arg0.aString172 == null) {
					Static32.method642((short) 51, arg0.anInt3552, 0L, -1, arg0.anInt3499, "", Static212.aString223);
				} else {
					Static32.method642((short) 51, arg0.anInt3552, 0L, -1, arg0.anInt3499, "", arg0.aString172);
				}
			}
		} else if (Static35.method708(arg0).method1311() && (Static212.anInt4455 & 0x20) != 0) {
			Static32.method642((short) 34, arg0.anInt3552, 0L, Static112.anInt2421, arg0.anInt3499, Static150.aString153 + " -> " + arg0.aString173, Static296.aString299);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)I")
	public static int method3491() {
		return Static70.aClass46_7.method1080();
	}

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "(II)Lclient!ve;")
	public static Class2_Sub3_Sub22 method3493(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub3_Sub22 local10 = (Class2_Sub3_Sub22) Static164.aClass53_3.method1254((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31;
		if (arg0 < 32768) {
			local31 = Static296.aClass84_134.method2127(arg0, 1);
		} else {
			local31 = Static203.aClass84_86.method2127(arg0 & 0x7FFF, 1);
		}
		local10 = new Class2_Sub3_Sub22();
		if (local31 != null) {
			local10.method4617(new Class2_Sub26(local31));
		}
		if (arg0 >= 32768) {
			local10.method4623();
		}
		Static164.aClass53_3.method1258((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIZI)V")
	public static void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static89.aLong100 = 0L;
		@Pc(4) int local4 = Static293.method4858();
		@Pc(10) boolean local10 = false;
		if (arg1 == 3 || local4 == 3) {
			arg2 = true;
		}
		if (arg1 <= 0 == local4 > 0) {
			local10 = true;
		}
		if (Static282.aString285.startsWith("mac") && arg1 > 0) {
			arg2 = true;
		}
		if (arg2 && arg1 > 0) {
			local10 = true;
		}
		Static176.method3064(arg2, arg0, arg3, local4, local10, arg1);
	}
}
