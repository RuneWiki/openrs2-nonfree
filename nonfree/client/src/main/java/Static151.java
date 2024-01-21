import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!se", name = "K", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_103;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!se", name = "M", descriptor = "I")
	public static int anInt3386;

	@OriginalMember(owner = "client!se", name = "V", descriptor = "I")
	public static int anInt3389;

	@OriginalMember(owner = "client!se", name = "W", descriptor = "I")
	public static int anInt3390;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "Lclient!le;")
	public static Class2_Sub2_Sub1 aClass2_Sub2_Sub1_3 = new Class2_Sub2_Sub1(5000);

	@OriginalMember(owner = "client!se", name = "R", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1984 = Static107.method1838(" from your friend list first)3");

	@OriginalMember(owner = "client!se", name = "O", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1983 = aClass28_1984;

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "[Lclient!gg;")
	public static Class28[] aClass28Array50 = new Class28[8];

	@OriginalMember(owner = "client!se", name = "S", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1985 = Static107.method1838("Passwort: ");

	@OriginalMember(owner = "client!se", name = "U", descriptor = "Lclient!id;")
	public static Class35 aClass35_40 = new Class35(512);

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
	public static int anInt3392 = -1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
	public static void method2332(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class2_Sub10 local14 = (Class2_Sub10) aClass35_40.method1359(); local14 != null; local14 = (Class2_Sub10) aClass35_40.method1361()) {
			if ((long) arg0 == (local14.aLong145 >> 48 & 0xFFFFL)) {
				local14.method2888();
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BII)V")
	public static void method2333(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) long local6 = (long) (arg0 + (arg1 << 16));
		@Pc(24) Class2_Sub4_Sub13 local24 = (Class2_Sub4_Sub13) Static146.aClass35_38.method1354(local6);
		if (local24 != null) {
			Static122.aClass4_2.method322(local24);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method2334() {
		aClass35_40 = null;
		aClass2_Sub2_Sub1_3 = null;
		aClass28_1984 = null;
		anIntArray321 = null;
		aClass28_1983 = null;
		aClass28_1985 = null;
		aClass40_Sub1_103 = null;
		aClass28Array50 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method2335() {
		if (Static45.aClass59_1 != null) {
			@Pc(3) Class59 local3 = Static45.aClass59_1;
			synchronized (Static45.aClass59_1) {
				Static45.aClass59_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!ff;III)V")
	public static void method2336(@OriginalArg(1) Class24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static19.anInt890 < 3) {
			Static130.aClass2_Sub4_Sub3_Sub4_7.method2825(arg2, arg3, arg0.anInt1357, arg0.anInt1427, Static130.aClass2_Sub4_Sub3_Sub4_7.anInt3981 / 2, Static130.aClass2_Sub4_Sub3_Sub4_7.anInt3985 / 2, Static66.anInt1789, arg0.anIntArray127, arg0.anIntArray118);
		} else {
			Static161.method2800(arg2, arg3, arg0.anIntArray127, arg0.anIntArray118);
		}
		Static59.aBooleanArray11[arg1] = true;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Z")
	public static boolean method2337() {
		@Pc(8) long local8 = Static177.method2758();
		@Pc(14) int local14 = (int) (local8 - Static112.aLong99);
		if (local14 > 200) {
			local14 = 200;
		}
		Static54.anInt1392 += local14;
		Static112.aLong99 = local8;
		if (Static172.anInt3842 == 0 && Static104.anInt2597 == 0 && Static45.anInt1213 == 0 && Static178.anInt3955 == 0) {
			return true;
		} else if (Static142.aClass22_3 == null) {
			return false;
		} else {
			try {
				if (Static54.anInt1392 > 30000) {
					throw new IOException();
				}
				@Pc(58) Class2_Sub4_Sub13 local58;
				@Pc(63) Class2_Sub2 local63;
				while (Static104.anInt2597 < 20 && Static178.anInt3955 > 0) {
					local58 = (Class2_Sub4_Sub13) Static152.aClass35_41.method1359();
					local63 = new Class2_Sub2(4);
					local63.method1700(1);
					local63.method1691((int) local58.aLong145);
					Static142.aClass22_3.method965(4, local63.aByteArray35);
					Static118.aClass35_47.method1362(local58, local58.aLong145);
					Static178.anInt3955--;
					Static104.anInt2597++;
				}
				while (Static172.anInt3842 < 20 && Static45.anInt1213 > 0) {
					local58 = (Class2_Sub4_Sub13) Static122.aClass4_2.method326();
					local63 = new Class2_Sub2(4);
					local63.method1700(0);
					local63.method1691((int) local58.aLong145);
					Static142.aClass22_3.method965(4, local63.aByteArray35);
					local58.method2853();
					Static58.aClass35_22.method1362(local58, local58.aLong145);
					Static45.anInt1213--;
					Static172.anInt3842++;
				}
				for (@Pc(159) int local159 = 0; local159 < 100; local159++) {
					@Pc(165) int local165 = Static142.aClass22_3.method963();
					if (local165 < 0) {
						throw new IOException();
					}
					if (local165 == 0) {
						break;
					}
					Static54.anInt1392 = 0;
					@Pc(180) byte local180 = 0;
					if (Static90.aClass2_Sub4_Sub13_1 == null) {
						local180 = 8;
					} else if (Static11.anInt537 == 0) {
						local180 = 1;
					}
					@Pc(201) int local201;
					@Pc(218) int local218;
					@Pc(268) int local268;
					@Pc(276) int local276;
					if (local180 > 0) {
						local201 = local180 - Static84.aClass2_Sub2_4.anInt2385;
						if (local201 > local165) {
							local201 = local165;
						}
						Static142.aClass22_3.method967(Static84.aClass2_Sub2_4.anInt2385, local201, Static84.aClass2_Sub2_4.aByteArray35);
						if (Static6.aByte1 != 0) {
							for (local218 = 0; local218 < local201; local218++) {
								Static84.aClass2_Sub2_4.aByteArray35[local218 + Static84.aClass2_Sub2_4.anInt2385] ^= Static6.aByte1;
							}
						}
						Static84.aClass2_Sub2_4.anInt2385 += local201;
						if (local180 > Static84.aClass2_Sub2_4.anInt2385) {
							break;
						}
						if (Static90.aClass2_Sub4_Sub13_1 == null) {
							Static84.aClass2_Sub2_4.anInt2385 = 0;
							local218 = Static84.aClass2_Sub2_4.method1698();
							local268 = Static84.aClass2_Sub2_4.method1680();
							@Pc(272) int local272 = Static84.aClass2_Sub2_4.method1698();
							local276 = Static84.aClass2_Sub2_4.method1690();
							@Pc(283) long local283 = (long) (local268 + (local218 << 16));
							@Pc(289) Class2_Sub4_Sub13 local289 = (Class2_Sub4_Sub13) Static118.aClass35_47.method1354(local283);
							Static33.aBoolean37 = true;
							if (local289 == null) {
								local289 = (Class2_Sub4_Sub13) Static58.aClass35_22.method1354(local283);
								Static33.aBoolean37 = false;
							}
							if (local289 == null) {
								throw new IOException();
							}
							Static90.aClass2_Sub4_Sub13_1 = local289;
							@Pc(318) int local318 = local272 == 0 ? 5 : 9;
							Static17.aClass2_Sub2_2 = new Class2_Sub2(local276 + local318 + Static90.aClass2_Sub4_Sub13_1.aByte5);
							Static17.aClass2_Sub2_2.method1700(local272);
							Static17.aClass2_Sub2_2.method1710(local276);
							Static84.aClass2_Sub2_4.anInt2385 = 0;
							Static11.anInt537 = 8;
						} else if (Static11.anInt537 == 0) {
							if (Static84.aClass2_Sub2_4.aByteArray35[0] == -1) {
								Static11.anInt537 = 1;
								Static84.aClass2_Sub2_4.anInt2385 = 0;
							} else {
								Static90.aClass2_Sub4_Sub13_1 = null;
							}
						}
					} else {
						local218 = 512 - Static11.anInt537;
						local201 = Static17.aClass2_Sub2_2.aByteArray35.length - Static90.aClass2_Sub4_Sub13_1.aByte5;
						if (local201 - Static17.aClass2_Sub2_2.anInt2385 < local218) {
							local218 = local201 - Static17.aClass2_Sub2_2.anInt2385;
						}
						if (local218 > local165) {
							local218 = local165;
						}
						Static142.aClass22_3.method967(Static17.aClass2_Sub2_2.anInt2385, local218, Static17.aClass2_Sub2_2.aByteArray35);
						if (Static6.aByte1 != 0) {
							for (local268 = 0; local268 < local218; local268++) {
								Static17.aClass2_Sub2_2.aByteArray35[local268 + Static17.aClass2_Sub2_2.anInt2385] ^= Static6.aByte1;
							}
						}
						Static11.anInt537 += local218;
						Static17.aClass2_Sub2_2.anInt2385 += local218;
						if (Static17.aClass2_Sub2_2.anInt2385 == local201) {
							if (Static90.aClass2_Sub4_Sub13_1.aLong145 == 16711935L) {
								Static46.aClass2_Sub2_3 = Static17.aClass2_Sub2_2;
								for (local268 = 0; local268 < 256; local268++) {
									@Pc(480) Class40_Sub1 local480 = Static83.aClass40_Sub1Array1[local268];
									if (local480 != null) {
										Static46.aClass2_Sub2_3.anInt2385 = local268 * 8 + 5;
										local276 = Static46.aClass2_Sub2_3.method1690();
										@Pc(497) int local497 = Static46.aClass2_Sub2_3.method1690();
										local480.method1796(local497, local276);
									}
								}
							} else {
								Static101.aCRC32_2.reset();
								Static101.aCRC32_2.update(Static17.aClass2_Sub2_2.aByteArray35, 0, local201);
								local268 = (int) Static101.aCRC32_2.getValue();
								if (local268 != Static90.aClass2_Sub4_Sub13_1.anInt2567) {
									try {
										Static142.aClass22_3.method962();
									} catch (@Pc(533) Exception local533) {
									}
									Static142.aClass22_3 = null;
									Static6.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									Static100.anInt2510++;
									return false;
								}
								Static100.anInt2510 = 0;
								Static157.anInt3497 = 0;
								Static90.aClass2_Sub4_Sub13_1.aClass40_Sub1_76.method1792(Static17.aClass2_Sub2_2.aByteArray35, (int) (Static90.aClass2_Sub4_Sub13_1.aLong145 & 0xFFFFL), Static33.aBoolean37, (Static90.aClass2_Sub4_Sub13_1.aLong145 & 0xFF0000L) == 16711680L);
							}
							Static90.aClass2_Sub4_Sub13_1.method2888();
							if (Static33.aBoolean37) {
								Static104.anInt2597--;
							} else {
								Static172.anInt3842--;
							}
							Static11.anInt537 = 0;
							Static17.aClass2_Sub2_2 = null;
							Static90.aClass2_Sub4_Sub13_1 = null;
						} else {
							if (Static11.anInt537 != 512) {
								break;
							}
							Static11.anInt537 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(605) IOException local605) {
				try {
					Static142.aClass22_3.method962();
				} catch (@Pc(610) Exception local610) {
				}
				Static142.aClass22_3 = null;
				Static157.anInt3497++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIILclient!d;J)V")
	public static void method2338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub4_Sub1 arg4, @OriginalArg(5) long arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class19 local6 = new Class19();
		local6.aClass2_Sub4_Sub1_1 = arg4;
		local6.anInt1088 = arg1 * 128 + 64;
		local6.anInt1093 = arg2 * 128 + 64;
		local6.anInt1092 = arg3;
		local6.aLong36 = arg5;
		if (Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub14(arg0, arg1, arg2);
		}
		Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass19_1 = local6;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)Lclient!dg;")
	public static Class2_Sub4_Sub6 method2339(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub4_Sub6 local6 = (Class2_Sub4_Sub6) Static159.aClass14_207.method603((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static87.aClass40_25.method1771(6, arg0);
		local6 = new Class2_Sub4_Sub6();
		local6.anInt1048 = arg0;
		if (local20 != null) {
			local6.method706(new Class2_Sub2(local20));
		}
		local6.method719();
		if (local6.aBoolean42) {
			local6.anInt1027 = 0;
			local6.aBoolean44 = false;
		}
		Static159.aClass14_207.method607((long) arg0, local6);
		return local6;
	}
}
