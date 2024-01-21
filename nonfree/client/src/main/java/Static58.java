import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_5;

	@OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
	public static int anInt1874;

	@OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
	public static int anInt1865 = -1;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
	public static int anInt1870 = 1;

	@OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
	public static int anInt1875 = 1;

	@OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
	public static int anInt1876 = 0;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	public static void method1418() {
		aClass76_Sub1_5 = null;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)I")
	public static int method1419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(50) int local50 = Static68.method1568(arg0 + 91923, arg1 + 45365, 4) + (Static68.method1568(arg0 + 37821, arg1 + 10294, 2) - 128 >> 1) + (Static68.method1568(arg0, arg1, 1) - 128 >> 2) - 128;
		local50 = (int) ((double) local50 * 0.3D) + 35;
		if (local50 < 10) {
			local50 = 10;
		} else if (local50 > 60) {
			local50 = 60;
		}
		return local50;
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)Z")
	public static boolean method1420() {
		@Pc(8) long local8 = Static143.method2807();
		@Pc(14) int local14 = (int) (local8 - Static137.aLong118);
		Static137.aLong118 = local8;
		if (local14 > 200) {
			local14 = 200;
		}
		Static33.anInt1072 += local14;
		if (Static82.anInt2516 == 0 && Static38.anInt1331 == 0 && Static147.anInt3874 == 0 && Static98.anInt2846 == 0) {
			return true;
		} else if (Static176.aClass43_44 == null) {
			return false;
		} else {
			try {
				if (Static33.anInt1072 > 30000) {
					throw new IOException();
				}
				@Pc(68) Class1_Sub1_Sub5 local68;
				@Pc(73) Class1_Sub9 local73;
				while (Static38.anInt1331 < 20 && Static98.anInt2846 > 0) {
					local68 = (Class1_Sub1_Sub5) Static94.aClass30_9.method1470();
					local73 = new Class1_Sub9(4);
					local73.method1260(1);
					local73.method1226((int) local68.aLong147);
					Static176.aClass43_44.method2045(local73.aByteArray25, 4);
					Static173.aClass30_15.method1464(local68, local68.aLong147);
					Static38.anInt1331++;
					Static98.anInt2846--;
				}
				while (Static82.anInt2516 < 20 && Static147.anInt3874 > 0) {
					local68 = (Class1_Sub1_Sub5) Static130.aClass27_2.method1339();
					local73 = new Class1_Sub9(4);
					local73.method1260(0);
					local73.method1226((int) local68.aLong147);
					Static176.aClass43_44.method2045(local73.aByteArray25, 4);
					local68.method3503();
					Static121.aClass30_11.method1464(local68, local68.aLong147);
					Static82.anInt2516++;
					Static147.anInt3874--;
				}
				for (@Pc(173) int local173 = 0; local173 < 100; local173++) {
					@Pc(181) int local181 = Static176.aClass43_44.method2041();
					if (local181 < 0) {
						throw new IOException();
					}
					if (local181 == 0) {
						break;
					}
					Static33.anInt1072 = 0;
					@Pc(196) byte local196 = 0;
					if (Static139.aClass1_Sub1_Sub5_1 == null) {
						local196 = 8;
					} else if (Static60.anInt1938 == 0) {
						local196 = 1;
					}
					@Pc(220) int local220;
					@Pc(244) int local244;
					@Pc(296) int local296;
					@Pc(313) int local313;
					if (local196 > 0) {
						local220 = local196 - Static118.aClass1_Sub9_1.anInt1592;
						if (local181 < local220) {
							local220 = local181;
						}
						Static176.aClass43_44.method2047(Static118.aClass1_Sub9_1.anInt1592, local220, Static118.aClass1_Sub9_1.aByteArray25);
						if (Static148.aByte7 != 0) {
							for (local244 = 0; local244 < local220; local244++) {
								Static118.aClass1_Sub9_1.aByteArray25[local244 + Static118.aClass1_Sub9_1.anInt1592] ^= Static148.aByte7;
							}
						}
						Static118.aClass1_Sub9_1.anInt1592 += local220;
						if (Static118.aClass1_Sub9_1.anInt1592 < local196) {
							break;
						}
						if (Static139.aClass1_Sub1_Sub5_1 == null) {
							Static118.aClass1_Sub9_1.anInt1592 = 0;
							local244 = Static118.aClass1_Sub9_1.method1234();
							local296 = Static118.aClass1_Sub9_1.method1280();
							@Pc(302) int local302 = Static118.aClass1_Sub9_1.method1234();
							@Pc(309) long local309 = (long) ((local244 << 16) + local296);
							local313 = Static118.aClass1_Sub9_1.method1273();
							@Pc(319) Class1_Sub1_Sub5 local319 = (Class1_Sub1_Sub5) Static173.aClass30_15.method1467(local309);
							Static64.aBoolean41 = true;
							if (local319 == null) {
								local319 = (Class1_Sub1_Sub5) Static121.aClass30_11.method1467(local309);
								Static64.aBoolean41 = false;
							}
							if (local319 == null) {
								throw new IOException();
							}
							Static139.aClass1_Sub1_Sub5_1 = local319;
							@Pc(345) int local345 = local302 == 0 ? 5 : 9;
							Static173.aClass1_Sub9_3 = new Class1_Sub9(Static139.aClass1_Sub1_Sub5_1.aByte2 + local313 + local345);
							Static173.aClass1_Sub9_3.method1260(local302);
							Static173.aClass1_Sub9_3.method1259(local313);
							Static60.anInt1938 = 8;
							Static118.aClass1_Sub9_1.anInt1592 = 0;
						} else if (Static60.anInt1938 == 0) {
							if (Static118.aClass1_Sub9_1.aByteArray25[0] == -1) {
								Static118.aClass1_Sub9_1.anInt1592 = 0;
								Static60.anInt1938 = 1;
							} else {
								Static139.aClass1_Sub1_Sub5_1 = null;
							}
						}
					} else {
						local220 = Static173.aClass1_Sub9_3.aByteArray25.length - Static139.aClass1_Sub1_Sub5_1.aByte2;
						local244 = 512 - Static60.anInt1938;
						if (local244 > local220 - Static173.aClass1_Sub9_3.anInt1592) {
							local244 = local220 - Static173.aClass1_Sub9_3.anInt1592;
						}
						if (local181 < local244) {
							local244 = local181;
						}
						Static176.aClass43_44.method2047(Static173.aClass1_Sub9_3.anInt1592, local244, Static173.aClass1_Sub9_3.aByteArray25);
						if (Static148.aByte7 != 0) {
							for (local296 = 0; local296 < local244; local296++) {
								Static173.aClass1_Sub9_3.aByteArray25[local296 + Static173.aClass1_Sub9_3.anInt1592] ^= Static148.aByte7;
							}
						}
						Static173.aClass1_Sub9_3.anInt1592 += local244;
						Static60.anInt1938 += local244;
						if (Static173.aClass1_Sub9_3.anInt1592 == local220) {
							if (Static139.aClass1_Sub1_Sub5_1.aLong147 == 16711935L) {
								Static119.aClass1_Sub9_2 = Static173.aClass1_Sub9_3;
								for (local296 = 0; local296 < 256; local296++) {
									@Pc(495) Class76_Sub1 local495 = Static103.aClass76_Sub1Array1[local296];
									if (local495 != null) {
										Static119.aClass1_Sub9_2.anInt1592 = local296 * 8 + 5;
										local313 = Static119.aClass1_Sub9_2.method1273();
										@Pc(512) int local512 = Static119.aClass1_Sub9_2.method1273();
										local495.method3337(local512, local313);
									}
								}
							} else {
								Static7.aCRC32_1.reset();
								Static7.aCRC32_1.update(Static173.aClass1_Sub9_3.aByteArray25, 0, local220);
								local296 = (int) Static7.aCRC32_1.getValue();
								if (local296 != Static139.aClass1_Sub1_Sub5_1.anInt1330) {
									try {
										Static176.aClass43_44.method2042();
									} catch (@Pc(548) Exception local548) {
									}
									Static148.aByte7 = (byte) (Math.random() * 255.0D + 1.0D);
									Static150.anInt3975++;
									Static176.aClass43_44 = null;
									return false;
								}
								Static102.anInt2886 = 0;
								Static150.anInt3975 = 0;
								Static139.aClass1_Sub1_Sub5_1.aClass76_Sub1_2.method3335((int) (Static139.aClass1_Sub1_Sub5_1.aLong147 & 0xFFFFL), Static64.aBoolean41, Static173.aClass1_Sub9_3.aByteArray25, (Static139.aClass1_Sub1_Sub5_1.aLong147 & 0xFF0000L) == 16711680L);
							}
							Static139.aClass1_Sub1_Sub5_1.method3499();
							if (Static64.aBoolean41) {
								Static38.anInt1331--;
							} else {
								Static82.anInt2516--;
							}
							Static173.aClass1_Sub9_3 = null;
							Static139.aClass1_Sub1_Sub5_1 = null;
							Static60.anInt1938 = 0;
						} else {
							if (Static60.anInt1938 != 512) {
								break;
							}
							Static60.anInt1938 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(629) IOException local629) {
				try {
					Static176.aClass43_44.method2042();
				} catch (@Pc(634) Exception local634) {
				}
				Static176.aClass43_44 = null;
				Static102.anInt2886++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(SJIILclient!rf;BLclient!rf;)V")
	public static void method1422(@OriginalArg(0) short arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class70 arg4, @OriginalArg(6) Class70 arg5) {
		if (Static32.aBoolean47 || Static162.anInt4331 >= 500) {
			return;
		}
		Static30.aClass70Array6[Static162.anInt4331] = arg4;
		Static174.aClass70Array23[Static162.anInt4331] = arg5;
		Static20.aShortArray7[Static162.anInt4331] = arg0;
		Static166.aLongArray9[Static162.anInt4331] = arg1;
		Static170.anIntArray420[Static162.anInt4331] = arg2;
		Static80.anIntArray241[Static162.anInt4331] = arg3;
		Static162.anInt4331++;
	}
}
