import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "Lclient!ud;")
	public static Class5 aClass5_11;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
	public static int anInt797 = 0;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	public static int anInt798 = 1;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!o;")
	public static Class40 aClass40_246 = Static13.method257("Unable to find ");

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
	public static int anInt799 = 0;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
	public static int anInt804 = 2;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
	public static int anInt805 = 1;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "[Lclient!d;")
	public static Class14[] aClass14Array2 = new Class14[5];

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
	public static int anInt807 = 99;

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
	public static int anInt808 = -1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Lclient!ae;")
	public static Class2_Sub2_Sub1 method621(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub1 local10 = (Class2_Sub2_Sub1) Static20.aClass47_5.method1325((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static66.aClass5_21.method68(arg0, 14);
		local10 = new Class2_Sub2_Sub1();
		if (local20 != null) {
			local10.method121(new Class2_Sub3(local20));
		}
		Static20.aClass47_5.method1332((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
	public static void method622() {
		aClass5_11 = null;
		aClass14Array2 = null;
		aClass40_246 = null;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I")
	public static int method623() {
		return Static58.anInt1497++;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!o;ILclient!eb;)I")
	public static int method624(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		@Pc(11) int local11 = arg1.anInt2546;
		arg1.method1695(arg0.anInt1783);
		arg1.anInt2546 += Static97.aClass42_1.method1213(arg0.aByteArray14, arg0.anInt1783, arg1.aByteArray24, 0, arg1.anInt2546);
		return arg1.anInt2546 - local11;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Z")
	public static boolean method625() {
		@Pc(3) long local3 = System.currentTimeMillis();
		@Pc(13) int local13 = (int) (local3 - Static31.aLong151);
		if (local13 > 200) {
			local13 = 200;
		}
		Static31.aLong151 = local3;
		Static60.anInt1510 += local13;
		if (Static93.anInt2182 == 0 && Static96.anInt2333 == 0 && Static44.anInt1077 == 0 && Static2.anInt34 == 0) {
			return true;
		} else if (Static31.aClass25_48 == null) {
			return false;
		} else {
			try {
				if (Static60.anInt1510 > 30000) {
					throw new IOException();
				}
				@Pc(58) Class2_Sub2_Sub9 local58;
				@Pc(63) Class2_Sub3 local63;
				while (Static96.anInt2333 < 20 && Static2.anInt34 > 0) {
					local58 = (Class2_Sub2_Sub9) Static93.aClass6_6.method184();
					local63 = new Class2_Sub3(4);
					local63.method1703(1);
					local63.method1688((int) local58.aLong152);
					Static31.aClass25_48.method731(local63.aByteArray24, 4);
					Static76.aClass6_5.method195(local58, local58.aLong152);
					Static2.anInt34--;
					Static96.anInt2333++;
				}
				while (Static93.anInt2182 < 20 && Static44.anInt1077 > 0) {
					local58 = (Class2_Sub2_Sub9) Static74.aClass41_1.method1203();
					local63 = new Class2_Sub3(4);
					local63.method1703(0);
					local63.method1688((int) local58.aLong152);
					Static31.aClass25_48.method731(local63.aByteArray24, 4);
					local58.method1637();
					Static36.aClass6_2.method195(local58, local58.aLong152);
					Static44.anInt1077--;
					Static93.anInt2182++;
				}
				for (@Pc(159) int local159 = 0; local159 < 100; local159++) {
					@Pc(165) int local165 = Static31.aClass25_48.method728();
					if (local165 < 0) {
						throw new IOException();
					}
					if (local165 == 0) {
						break;
					}
					Static60.anInt1510 = 0;
					@Pc(180) byte local180 = 0;
					if (Static90.aClass2_Sub2_Sub9_1 == null) {
						local180 = 8;
					} else if (Static11.anInt274 == 0) {
						local180 = 1;
					}
					@Pc(201) int local201;
					@Pc(218) int local218;
					@Pc(272) int local272;
					@Pc(280) int local280;
					if (local180 > 0) {
						local201 = local180 - Static97.aClass2_Sub3_5.anInt2546;
						if (local165 < local201) {
							local201 = local165;
						}
						Static31.aClass25_48.method725(Static97.aClass2_Sub3_5.anInt2546, local201, Static97.aClass2_Sub3_5.aByteArray24);
						if (Static7.aByte1 != 0) {
							for (local218 = 0; local218 < local201; local218++) {
								Static97.aClass2_Sub3_5.aByteArray24[local218 + Static97.aClass2_Sub3_5.anInt2546] ^= Static7.aByte1;
							}
						}
						Static97.aClass2_Sub3_5.anInt2546 += local201;
						if (Static97.aClass2_Sub3_5.anInt2546 < local180) {
							break;
						}
						if (Static90.aClass2_Sub2_Sub9_1 == null) {
							Static97.aClass2_Sub3_5.anInt2546 = 0;
							local218 = Static97.aClass2_Sub3_5.method1708();
							local272 = Static97.aClass2_Sub3_5.method1704();
							@Pc(276) int local276 = Static97.aClass2_Sub3_5.method1708();
							local280 = Static97.aClass2_Sub3_5.method1728();
							@Pc(287) long local287 = (long) ((local218 << 16) + local272);
							@Pc(293) Class2_Sub2_Sub9 local293 = (Class2_Sub2_Sub9) Static76.aClass6_5.method190(local287);
							Static93.aBoolean166 = true;
							if (local293 == null) {
								local293 = (Class2_Sub2_Sub9) Static36.aClass6_2.method190(local287);
								Static93.aBoolean166 = false;
							}
							if (local293 == null) {
								throw new IOException();
							}
							Static90.aClass2_Sub2_Sub9_1 = local293;
							@Pc(322) int local322 = local276 == 0 ? 5 : 9;
							Static29.aClass2_Sub3_2 = new Class2_Sub3(Static90.aClass2_Sub2_Sub9_1.aByte2 + local322 + local280);
							Static29.aClass2_Sub3_2.method1703(local276);
							Static29.aClass2_Sub3_2.method1725(local280);
							Static97.aClass2_Sub3_5.anInt2546 = 0;
							Static11.anInt274 = 8;
						} else if (Static11.anInt274 == 0) {
							if (Static97.aClass2_Sub3_5.aByteArray24[0] == -1) {
								Static11.anInt274 = 1;
								Static97.aClass2_Sub3_5.anInt2546 = 0;
							} else {
								Static90.aClass2_Sub2_Sub9_1 = null;
							}
						}
					} else {
						local201 = Static29.aClass2_Sub3_2.aByteArray24.length - Static90.aClass2_Sub2_Sub9_1.aByte2;
						local218 = 512 - Static11.anInt274;
						if (local218 > local201 - Static29.aClass2_Sub3_2.anInt2546) {
							local218 = local201 - Static29.aClass2_Sub3_2.anInt2546;
						}
						if (local165 < local218) {
							local218 = local165;
						}
						Static31.aClass25_48.method725(Static29.aClass2_Sub3_2.anInt2546, local218, Static29.aClass2_Sub3_2.aByteArray24);
						if (Static7.aByte1 != 0) {
							for (local272 = 0; local272 < local218; local272++) {
								Static29.aClass2_Sub3_2.aByteArray24[local272 + Static29.aClass2_Sub3_2.anInt2546] ^= Static7.aByte1;
							}
						}
						Static29.aClass2_Sub3_2.anInt2546 += local218;
						Static11.anInt274 += local218;
						if (local201 == Static29.aClass2_Sub3_2.anInt2546) {
							if (Static90.aClass2_Sub2_Sub9_1.aLong152 == 16711935L) {
								Static42.aClass2_Sub3_3 = Static29.aClass2_Sub3_2;
								for (local272 = 0; local272 < 256; local272++) {
									@Pc(482) Class5_Sub1 local482 = Static83.aClass5_Sub1Array1[local272];
									if (local482 != null) {
										Static42.aClass2_Sub3_3.anInt2546 = local272 * 4 + 5;
										local280 = Static42.aClass2_Sub3_3.method1728();
										local482.method92(local280);
									}
								}
							} else {
								Static102.aCRC32_2.reset();
								Static102.aCRC32_2.update(Static29.aClass2_Sub3_2.aByteArray24, 0, local201);
								local272 = (int) Static102.aCRC32_2.getValue();
								if (local272 != Static90.aClass2_Sub2_Sub9_1.anInt1013) {
									try {
										Static31.aClass25_48.method730();
									} catch (@Pc(530) Exception local530) {
									}
									Static7.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									Static31.aClass25_48 = null;
									Static72.anInt1792++;
									return false;
								}
								Static72.anInt1792 = 0;
								Static101.anInt2401 = 0;
								Static90.aClass2_Sub2_Sub9_1.aClass5_Sub1_9.method91(Static29.aClass2_Sub3_2.aByteArray24, Static93.aBoolean166, (Static90.aClass2_Sub2_Sub9_1.aLong152 & 0xFF0000L) == 16711680L, (int) (Static90.aClass2_Sub2_Sub9_1.aLong152 & 0xFFFFL));
							}
							Static90.aClass2_Sub2_Sub9_1.method1677();
							Static29.aClass2_Sub3_2 = null;
							Static11.anInt274 = 0;
							Static90.aClass2_Sub2_Sub9_1 = null;
							if (Static93.aBoolean166) {
								Static96.anInt2333--;
							} else {
								Static93.anInt2182--;
							}
						} else {
							if (Static11.anInt274 != 512) {
								break;
							}
							Static11.anInt274 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(602) IOException local602) {
				try {
					Static31.aClass25_48.method730();
				} catch (@Pc(607) Exception local607) {
				}
				Static101.anInt2401++;
				Static31.aClass25_48 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	public static void method626() {
		if (Static67.anInt1672 > 0) {
			Static61.method1039();
		} else {
			Static7.method187(40);
			Static36.aClass25_20 = Static70.aClass25_36;
		}
	}
}
