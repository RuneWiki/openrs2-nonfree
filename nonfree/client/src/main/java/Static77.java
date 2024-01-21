import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ne", name = "Z", descriptor = "Lclient!lb;")
	public static Class2_Sub5_Sub1 aClass2_Sub5_Sub1_1;

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lclient!kc;")
	public static Class2_Sub13 aClass2_Sub13_12;

	@OriginalMember(owner = "client!ne", name = "ib", descriptor = "Lclient!fd;")
	public static Class24 aClass24_23;

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "Lclient!je;")
	private static Class40 aClass40_1022 = Static69.method1231("flash1:");

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "Lclient!je;")
	public static Class40 aClass40_1021 = aClass40_1022;

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
	public static int anInt2023 = 0;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "Lclient!je;")
	public static Class40 aClass40_1023 = aClass40_1022;

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "[S")
	public static short[] aShortArray10 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
	public static final int anInt2028 = 20;

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1024 = Static69.method1231("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "[I")
	public static int[] anIntArray216 = new int[1000];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZII)Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4 method1339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(19) long local19 = ((long) arg4 << 40) + ((long) arg0 << 38) + ((long) arg1 << 16) + (long) arg2;
		@Pc(31) Class2_Sub1_Sub2_Sub4 local31;
		if (!arg3) {
			local31 = (Class2_Sub1_Sub2_Sub4) Static110.aClass55_49.method1410(local19);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class2_Sub1_Sub10 local39 = Static102.method1800(arg2);
		if (arg1 > 1 && local39.anIntArray247 != null) {
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
				if (local39.anIntArray248[local49] <= arg1 && local39.anIntArray248[local49] != 0) {
					local47 = local39.anIntArray247[local49];
				}
			}
			if (local47 != -1) {
				local39 = Static102.method1800(local47);
			}
		}
		@Pc(93) Class2_Sub1_Sub1_Sub2 local93 = local39.method1578(1);
		if (local93 == null) {
			return null;
		}
		@Pc(99) Class2_Sub1_Sub2_Sub4 local99 = null;
		if (local39.anInt2215 != -1) {
			local99 = method1339(1, 10, local39.anInt2253, true, 0);
			if (local99 == null) {
				return null;
			}
		}
		@Pc(119) int[] local119 = Static6.anIntArray258;
		@Pc(121) int local121 = Static6.anInt2381;
		@Pc(128) int local128 = Static6.anInt2382;
		@Pc(131) int[] local131 = new int[4];
		Static6.method1688(local131);
		local31 = new Class2_Sub1_Sub2_Sub4(36, 32);
		Static6.method1698(local31.anIntArray259, 36, 32);
		Static6.method1701();
		Static78.method1390();
		Static78.method1385(16, 16);
		Static78.aBoolean158 = false;
		@Pc(154) int local154 = local39.anInt2239;
		if (arg3) {
			local154 = (int) ((double) local154 * 1.5D);
		} else if (arg0 == 2) {
			local154 = (int) ((double) local154 * 1.04D);
		}
		@Pc(182) int local182 = local154 * Class2_Sub1_Sub2_Sub2.anIntArray219[local39.anInt2248] >> 16;
		@Pc(191) int local191 = local154 * Class2_Sub1_Sub2_Sub2.anIntArray221[local39.anInt2248] >> 16;
		local93.method117();
		local93.method114(local39.anInt2240, local39.anInt2222, local39.anInt2248, local39.anInt2224, local182 + local93.anInt3029 / 2 + local39.anInt2218, local39.anInt2218 + local191);
		if (arg0 >= 1) {
			local31.method1714(1);
		}
		if (arg0 >= 2) {
			local31.method1714(16777215);
		}
		if (arg4 != 0) {
			local31.method1725(arg4);
		}
		Static6.method1698(local31.anIntArray259, 36, 32);
		if (local39.anInt2215 != -1) {
			local99.method1722(0, 0);
		}
		if (!arg3 && (local39.anInt2258 == 1 || arg1 != 1) && arg1 != -1) {
			Static17.aClass2_Sub1_Sub2_Sub3_Sub1_1.method1549(Static34.method521(arg1), 0, 9, 16776960, 1);
		}
		if (!arg3) {
			Static110.aClass55_49.method1411(local19, local31);
		}
		Static6.method1698(local119, local128, local121);
		Static6.method1692(local131);
		Static78.method1390();
		Static78.aBoolean158 = true;
		return local31;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
	public static void method1341() {
		Static34.method522(false);
		@Pc(12) boolean local12 = true;
		Static83.anInt2152 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static95.aByteArrayArray7.length; local16++) {
			if (Static19.anIntArray71[local16] != -1 && Static95.aByteArrayArray7[local16] == null) {
				Static95.aByteArrayArray7[local16] = Static80.aClass24_Sub1_13.method1931(0, Static19.anIntArray71[local16]);
				if (Static95.aByteArrayArray7[local16] == null) {
					Static83.anInt2152++;
					local12 = false;
				}
			}
			if (Static55.anIntArray144[local16] != -1 && Static127.aByteArrayArray10[local16] == null) {
				Static127.aByteArrayArray10[local16] = Static80.aClass24_Sub1_13.method1909(Static55.anIntArray144[local16], Static118.anIntArrayArray27[local16], 0);
				if (Static127.aByteArrayArray10[local16] == null) {
					local12 = false;
					Static83.anInt2152++;
				}
			}
		}
		if (!local12) {
			Static95.anInt2421 = 1;
			return;
		}
		local12 = true;
		Static21.anInt644 = 0;
		@Pc(121) int local121;
		@Pc(131) int local131;
		for (@Pc(102) int local102 = 0; local102 < Static95.aByteArrayArray7.length; local102++) {
			@Pc(108) byte[] local108 = Static127.aByteArrayArray10[local102];
			if (local108 != null) {
				local121 = (Static35.anIntArray95[local102] >> 8) * 64 - Static107.anInt2546;
				local131 = (Static35.anIntArray95[local102] & 0xFF) * 64 - Static29.anInt720;
				if (Static63.aBoolean34) {
					local121 = 10;
					local131 = 10;
				}
				local12 &= Static107.method1836(local121, local108, local131);
			}
		}
		if (!local12) {
			Static95.anInt2421 = 2;
			return;
		}
		if (Static95.anInt2421 != 0) {
			Static5.method130(true, Static40.method722(new Class40[] { Static32.aClass40_456, Static27.aClass40_396 }));
		}
		Static55.method990();
		Static120.method2023();
		Static55.method990();
		Static111.aClass30_1.method762();
		Static55.method990();
		System.gc();
		for (@Pc(196) int local196 = 0; local196 < 4; local196++) {
			Static70.aClass20Array1[local196].method446();
		}
		@Pc(217) int local217;
		for (local121 = 0; local121 < 4; local121++) {
			for (local131 = 0; local131 < 104; local131++) {
				for (local217 = 0; local217 < 104; local217++) {
					Static66.aByteArrayArrayArray10[local121][local131][local217] = 0;
				}
			}
		}
		Static55.method990();
		Static38.method682();
		local131 = Static95.aByteArrayArray7.length;
		Static13.method211();
		Static34.method522(true);
		@Pc(274) int local274;
		@Pc(285) int local285;
		@Pc(390) int local390;
		@Pc(330) int local330;
		@Pc(401) int local401;
		if (!Static63.aBoolean34) {
			@Pc(289) byte[] local289;
			for (local217 = 0; local217 < local131; local217++) {
				local274 = (Static35.anIntArray95[local217] >> 8) * 64 - Static107.anInt2546;
				local285 = (Static35.anIntArray95[local217] & 0xFF) * 64 - Static29.anInt720;
				local289 = Static95.aByteArrayArray7[local217];
				if (local289 != null) {
					Static55.method990();
					Static35.method533(local285, local274, local289, Static134.anInt1646 * 8 - 48, Static70.aClass20Array1, (Static134.anInt1648 - 6) * 8);
				}
			}
			for (local274 = 0; local274 < local131; local274++) {
				local330 = (Static35.anIntArray95[local274] & 0xFF) * 64 - Static29.anInt720;
				local285 = (Static35.anIntArray95[local274] >> 8) * 64 - Static107.anInt2546;
				@Pc(345) byte[] local345 = Static95.aByteArrayArray7[local274];
				if (local345 == null && Static134.anInt1648 < 800) {
					Static55.method990();
					Static46.method824(local330, local285, 64, 64);
				}
			}
			Static34.method522(true);
			for (local285 = 0; local285 < local131; local285++) {
				local289 = Static127.aByteArrayArray10[local285];
				if (local289 != null) {
					local390 = (Static35.anIntArray95[local285] & 0xFF) * 64 - Static29.anInt720;
					local401 = (Static35.anIntArray95[local285] >> 8) * 64 - Static107.anInt2546;
					Static55.method990();
					Static92.method1668(Static111.aClass30_1, Static70.aClass20Array1, local390, local401, local289);
				}
			}
		}
		@Pc(464) int local464;
		@Pc(458) int local458;
		if (Static63.aBoolean34) {
			@Pc(470) int local470;
			@Pc(480) int local480;
			@Pc(482) int local482;
			for (local217 = 0; local217 < 4; local217++) {
				Static55.method990();
				for (local274 = 0; local274 < 13; local274++) {
					for (local285 = 0; local285 < 13; local285++) {
						@Pc(434) boolean local434 = false;
						local401 = Static123.anIntArrayArrayArray7[local217][local274][local285];
						if (local401 != -1) {
							local390 = local401 >> 24 & 0x3;
							local458 = local401 >> 14 & 0x3FF;
							local464 = local401 >> 1 & 0x3;
							local470 = local401 >> 3 & 0x7FF;
							local480 = local470 / 8 + (local458 / 8 << 8);
							for (local482 = 0; local482 < Static35.anIntArray95.length; local482++) {
								if (Static35.anIntArray95[local482] == local480 && Static95.aByteArrayArray7[local482] != null) {
									Static101.method1798(local217, (local458 & 0x7) * 8, local285 * 8, local390, Static70.aClass20Array1, local274 * 8, Static95.aByteArrayArray7[local482], local464, (local470 & 0x7) * 8);
									local434 = true;
									break;
								}
							}
						}
						if (!local434) {
							Static133.method2221(local217, local274 * 8, local285 * 8);
						}
					}
				}
			}
			for (local274 = 0; local274 < 13; local274++) {
				for (local285 = 0; local285 < 13; local285++) {
					local330 = Static123.anIntArrayArrayArray7[0][local274][local285];
					if (local330 == -1) {
						Static46.method824(local285 * 8, local274 * 8, 8, 8);
					}
				}
			}
			Static34.method522(true);
			for (local285 = 0; local285 < 4; local285++) {
				Static55.method990();
				for (local330 = 0; local330 < 13; local330++) {
					for (local401 = 0; local401 < 13; local401++) {
						local390 = Static123.anIntArrayArrayArray7[local285][local330][local401];
						if (local390 != -1) {
							local458 = local390 >> 1 & 0x3;
							local470 = local390 >> 14 & 0x3FF;
							local480 = local390 >> 3 & 0x7FF;
							local482 = (local470 / 8 << 8) + local480 / 8;
							local464 = local390 >> 24 & 0x3;
							for (@Pc(655) int local655 = 0; local655 < Static35.anIntArray95.length; local655++) {
								if (Static35.anIntArray95[local655] == local482 && Static127.aByteArrayArray10[local655] != null) {
									Static105.method1826((local470 & 0x7) * 8, local285, Static127.aByteArrayArray10[local655], Static111.aClass30_1, local458, local330 * 8, Static70.aClass20Array1, local401 * 8, local464, (local480 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static34.method522(true);
		Static120.method2023();
		Static55.method990();
		Static17.method317(Static70.aClass20Array1, Static111.aClass30_1);
		Static34.method522(true);
		local217 = Static1.anInt13;
		if (Static105.anInt2531 < local217) {
			local217 = Static105.anInt2531;
		}
		if (Static105.anInt2531 - 1 > local217) {
		}
		if (Static34.aBoolean60) {
			Static111.aClass30_1.method780(Static1.anInt13);
		} else {
			Static111.aClass30_1.method780(0);
		}
		for (local274 = 0; local274 < 104; local274++) {
			for (local285 = 0; local285 < 104; local285++) {
				Static83.method1495(local274, local285);
			}
		}
		Static55.method990();
		Static133.method2224();
		Static88.aClass55_70.method1413();
		if (Static21.aFrame1 != null) {
			Static57.aClass2_Sub9_Sub1_2.method673(192);
			Static57.aClass2_Sub9_Sub1_2.method620(1057001181);
		}
		if (!Static63.aBoolean34) {
			local330 = (Static134.anInt1646 + 6) / 8;
			local285 = (Static134.anInt1646 - 6) / 8;
			local401 = (Static134.anInt1648 - 6) / 8;
			local390 = (Static134.anInt1648 + 6) / 8;
			for (local464 = local285 - 1; local464 <= local330 + 1; local464++) {
				for (local458 = local401 - 1; local458 <= local390 + 1; local458++) {
					if (local285 > local464 || local330 < local464 || local401 > local458 || local458 > local390) {
						Static80.aClass24_Sub1_13.method1917(Static40.method722(new Class40[] { Static43.aClass40_573, Static49.method886(local464), Static28.aClass40_400, Static49.method886(local458) }));
						Static80.aClass24_Sub1_13.method1917(Static40.method722(new Class40[] { Static33.aClass40_1449, Static49.method886(local464), Static28.aClass40_400, Static49.method886(local458) }));
					}
				}
			}
		}
		Static21.method402(30);
		Static55.method990();
		Static79.method1396();
		Static57.aClass2_Sub9_Sub1_2.method673(6);
		Static45.method812();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!fd;Z)V")
	public static void method1342(@OriginalArg(0) Class24 arg0) {
		Static50.aClass24_13 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
	public static void method1343() {
		aShortArray10 = null;
		aClass40_1023 = null;
		aClass40_1022 = null;
		aClass40_1024 = null;
		aClass2_Sub13_12 = null;
		aClass24_23 = null;
		anIntArray216 = null;
		aClass2_Sub5_Sub1_1 = null;
		aClass40_1021 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILclient!ga;)V")
	public static void method1345(@OriginalArg(2) Class2_Sub9_Sub1 arg0) {
		while (true) {
			@Pc(21) Class2_Sub10 local21 = (Class2_Sub10) Static88.aClass3_14.method82();
			if (local21 == null) {
				return;
			}
			@Pc(26) boolean local26 = false;
			for (@Pc(28) int local28 = 0; local28 < local21.anInt1205; local28++) {
				if (local21.aClass26Array2[local28] != null) {
					if (local21.aClass26Array2[local28].anInt831 == 2) {
						local21.anIntArray130[local28] = -5;
					}
					if (local21.aClass26Array2[local28].anInt831 == 0) {
						local26 = true;
					}
				}
				if (local21.aClass26Array1[local28] != null) {
					if (local21.aClass26Array1[local28].anInt831 == 2) {
						local21.anIntArray130[local28] = -6;
					}
					if (local21.aClass26Array1[local28].anInt831 == 0) {
						local26 = true;
					}
				}
			}
			if (local26) {
				return;
			}
			arg0.method673(166);
			arg0.method644(0);
			@Pc(107) int local107 = arg0.anInt976;
			arg0.method620(local21.anInt1210);
			for (@Pc(114) int local114 = 0; local114 < local21.anInt1205; local114++) {
				if (local21.anIntArray130[local114] == 0) {
					try {
						@Pc(135) int local135 = local21.anIntArray134[local114];
						@Pc(155) Field local155;
						@Pc(158) int local158;
						if (local135 == 0) {
							local155 = (Field) local21.aClass26Array2[local114].anObject2;
							local158 = local155.getInt(null);
							arg0.method644(0);
							arg0.method620(local158);
						} else if (local135 == 1) {
							local155 = (Field) local21.aClass26Array2[local114].anObject2;
							local155.setInt(null, local21.anIntArray133[local114]);
							arg0.method644(0);
						} else if (local135 == 2) {
							local155 = (Field) local21.aClass26Array2[local114].anObject2;
							local158 = local155.getModifiers();
							arg0.method644(0);
							arg0.method620(local158);
						}
						@Pc(224) Method local224;
						if (local135 == 3) {
							local224 = (Method) local21.aClass26Array1[local114].anObject2;
							@Pc(251) byte[][] local251 = local21.aByteArrayArrayArray7[local114];
							@Pc(255) Object[] local255 = new Object[local251.length];
							for (@Pc(257) int local257 = 0; local257 < local251.length; local257++) {
								@Pc(269) ObjectInputStream local269 = new ObjectInputStream(new ByteArrayInputStream(local251[local257]));
								local255[local257] = local269.readObject();
							}
							@Pc(288) Object local288 = local224.invoke(null, local255);
							if (local288 == null) {
								arg0.method644(0);
							} else if (local288 instanceof Number) {
								arg0.method644(1);
								arg0.method647(((Number) local288).longValue());
							} else if (local288 instanceof Class40) {
								arg0.method644(2);
								arg0.method664((Class40) local288);
							} else {
								arg0.method644(4);
							}
						} else if (local135 == 4) {
							local224 = (Method) local21.aClass26Array1[local114].anObject2;
							local158 = local224.getModifiers();
							arg0.method644(0);
							arg0.method620(local158);
						}
					} catch (@Pc(331) ClassNotFoundException local331) {
						arg0.method644(-10);
					} catch (@Pc(339) InvalidClassException local339) {
						arg0.method644(-11);
					} catch (@Pc(347) StreamCorruptedException local347) {
						arg0.method644(-12);
					} catch (@Pc(353) OptionalDataException local353) {
						arg0.method644(-13);
					} catch (@Pc(359) IllegalAccessException local359) {
						arg0.method644(-14);
					} catch (@Pc(365) IllegalArgumentException local365) {
						arg0.method644(-15);
					} catch (@Pc(371) InvocationTargetException local371) {
						arg0.method644(-16);
					} catch (@Pc(377) SecurityException local377) {
						arg0.method644(-17);
					} catch (@Pc(383) IOException local383) {
						arg0.method644(-18);
					} catch (@Pc(389) NullPointerException local389) {
						arg0.method644(-19);
					} catch (@Pc(395) Exception local395) {
						arg0.method644(-20);
					} catch (@Pc(403) Throwable local403) {
						arg0.method644(-21);
					}
				} else {
					arg0.method644(local21.anIntArray130[local114]);
				}
			}
			arg0.method663(local107);
			arg0.method608(arg0.anInt976 - local107);
			local21.method2209();
		}
	}
}
