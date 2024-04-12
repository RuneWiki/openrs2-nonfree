import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "Lclient!ud;")
	public static Class5 aClass5_11;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Lclient!ae;", line = 29)
	public static Class2_Sub2_Sub1 method621(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub1 local10 = (Class2_Sub2_Sub1) Class18_Sub1.aClass47_5.method1325((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static61.aClass5_21.method68(arg0, 14);
		local10 = new Class2_Sub2_Sub1();
		if (local20 != null) {
			local10.method121(new Class2_Sub3(local20));
		}
		Class18_Sub1.aClass47_5.method1332((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 56)
	public static void method622() {
		aClass5_11 = null;
		Class2_Sub6.aClass14Array2 = null;
		Class2_Sub6.aClass40_246 = null;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I", line = 68)
	public static int method623() {
		return Class2_Sub2_Sub12_Sub3.anInt1497++;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!o;ILclient!eb;)I", line = 80)
	public static int method624(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		@Pc(11) int local11 = arg1.anInt2546;
		arg1.method1695(arg0.anInt1783);
		arg1.anInt2546 += Static89.aClass42_1.method1213(arg0.aByteArray14, arg0.anInt1783, arg1.aByteArray24, 0, arg1.anInt2546);
		return arg1.anInt2546 - local11;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Z", line = 97)
	public static boolean method625() {
		@Pc(3) long local3 = System.currentTimeMillis();
		@Pc(13) int local13 = (int) (local3 - Static29.aLong151);
		if (local13 > 200) {
			local13 = 200;
		}
		Static29.aLong151 = local3;
		Class33.anInt1510 += local13;
		if (Class58.anInt2182 == 0 && Class2_Sub2_Sub12_Sub1_Sub2.anInt2333 == 0 && Class2_Sub2_Sub11.anInt1077 == 0 && Class3.anInt34 == 0) {
			return true;
		} else if (Static29.aClass25_48 == null) {
			return false;
		} else {
			try {
				if (Class33.anInt1510 > 30000) {
					throw new IOException();
				}
				@Pc(58) Class2_Sub2_Sub9 local58;
				@Pc(63) Class2_Sub3 local63;
				while (Class2_Sub2_Sub12_Sub1_Sub2.anInt2333 < 20 && Class3.anInt34 > 0) {
					local58 = (Class2_Sub2_Sub9) Class58.aClass6_6.method184();
					local63 = new Class2_Sub3(4);
					local63.method1703(1);
					local63.method1688((int) local58.aLong152);
					Static29.aClass25_48.method731(local63.aByteArray24, 4);
					Class45.aClass6_5.method195(local58, local58.aLong152);
					Class3.anInt34--;
					Class2_Sub2_Sub12_Sub1_Sub2.anInt2333++;
				}
				while (Class58.anInt2182 < 20 && Class2_Sub2_Sub11.anInt1077 > 0) {
					local58 = (Class2_Sub2_Sub9) Class42.aClass41_1.method1203();
					local63 = new Class2_Sub3(4);
					local63.method1703(0);
					local63.method1688((int) local58.aLong152);
					Static29.aClass25_48.method731(local63.aByteArray24, 4);
					local58.method1637();
					Class23.aClass6_2.method195(local58, local58.aLong152);
					Class2_Sub2_Sub11.anInt1077--;
					Class58.anInt2182++;
				}
				for (@Pc(159) int local159 = 0; local159 < 100; local159++) {
					@Pc(165) int local165 = Static29.aClass25_48.method728();
					if (local165 < 0) {
						throw new IOException();
					}
					if (local165 == 0) {
						break;
					}
					Class33.anInt1510 = 0;
					@Pc(180) byte local180 = 0;
					if (Static82.aClass2_Sub2_Sub9_1 == null) {
						local180 = 8;
					} else if (Class10.anInt274 == 0) {
						local180 = 1;
					}
					@Pc(201) int local201;
					@Pc(218) int local218;
					@Pc(272) int local272;
					@Pc(280) int local280;
					if (local180 > 0) {
						local201 = local180 - Class2_Sub12.aClass2_Sub3_5.anInt2546;
						if (local165 < local201) {
							local201 = local165;
						}
						Static29.aClass25_48.method725(Class2_Sub12.aClass2_Sub3_5.anInt2546, local201, Class2_Sub12.aClass2_Sub3_5.aByteArray24);
						if (Class6.aByte1 != 0) {
							for (local218 = 0; local218 < local201; local218++) {
								Class2_Sub12.aClass2_Sub3_5.aByteArray24[local218 + Class2_Sub12.aClass2_Sub3_5.anInt2546] ^= Class6.aByte1;
							}
						}
						Class2_Sub12.aClass2_Sub3_5.anInt2546 += local201;
						if (Class2_Sub12.aClass2_Sub3_5.anInt2546 < local180) {
							break;
						}
						if (Static82.aClass2_Sub2_Sub9_1 == null) {
							Class2_Sub12.aClass2_Sub3_5.anInt2546 = 0;
							local218 = Class2_Sub12.aClass2_Sub3_5.method1708();
							local272 = Class2_Sub12.aClass2_Sub3_5.method1704();
							@Pc(276) int local276 = Class2_Sub12.aClass2_Sub3_5.method1708();
							local280 = Class2_Sub12.aClass2_Sub3_5.method1728();
							@Pc(287) long local287 = (long) ((local218 << 16) + local272);
							@Pc(293) Class2_Sub2_Sub9 local293 = (Class2_Sub2_Sub9) Class45.aClass6_5.method190(local287);
							Static85.aBoolean166 = true;
							if (local293 == null) {
								local293 = (Class2_Sub2_Sub9) Class23.aClass6_2.method190(local287);
								Static85.aBoolean166 = false;
							}
							if (local293 == null) {
								throw new IOException();
							}
							Static82.aClass2_Sub2_Sub9_1 = local293;
							@Pc(322) int local322 = local276 == 0 ? 5 : 9;
							Static27.aClass2_Sub3_2 = new Class2_Sub3(Static82.aClass2_Sub2_Sub9_1.aByte2 + local322 + local280);
							Static27.aClass2_Sub3_2.method1703(local276);
							Static27.aClass2_Sub3_2.method1725(local280);
							Class2_Sub12.aClass2_Sub3_5.anInt2546 = 0;
							Class10.anInt274 = 8;
						} else if (Class10.anInt274 == 0) {
							if (Class2_Sub12.aClass2_Sub3_5.aByteArray24[0] == -1) {
								Class10.anInt274 = 1;
								Class2_Sub12.aClass2_Sub3_5.anInt2546 = 0;
							} else {
								Static82.aClass2_Sub2_Sub9_1 = null;
							}
						}
					} else {
						local201 = Static27.aClass2_Sub3_2.aByteArray24.length - Static82.aClass2_Sub2_Sub9_1.aByte2;
						local218 = 512 - Class10.anInt274;
						if (local218 > local201 - Static27.aClass2_Sub3_2.anInt2546) {
							local218 = local201 - Static27.aClass2_Sub3_2.anInt2546;
						}
						if (local165 < local218) {
							local218 = local165;
						}
						Static29.aClass25_48.method725(Static27.aClass2_Sub3_2.anInt2546, local218, Static27.aClass2_Sub3_2.aByteArray24);
						if (Class6.aByte1 != 0) {
							for (local272 = 0; local272 < local218; local272++) {
								Static27.aClass2_Sub3_2.aByteArray24[local272 + Static27.aClass2_Sub3_2.anInt2546] ^= Class6.aByte1;
							}
						}
						Static27.aClass2_Sub3_2.anInt2546 += local218;
						Class10.anInt274 += local218;
						if (local201 == Static27.aClass2_Sub3_2.anInt2546) {
							if (Static82.aClass2_Sub2_Sub9_1.aLong152 == 16711935L) {
								Static39.aClass2_Sub3_3 = Static27.aClass2_Sub3_2;
								for (local272 = 0; local272 < 256; local272++) {
									@Pc(482) Class5_Sub1 local482 = Class51.aClass5_Sub1Array1[local272];
									if (local482 != null) {
										Static39.aClass2_Sub3_3.anInt2546 = local272 * 4 + 5;
										local280 = Static39.aClass2_Sub3_3.method1728();
										local482.method92(local280);
									}
								}
							} else {
								Class2_Sub2_Sub16.aCRC32_2.reset();
								Class2_Sub2_Sub16.aCRC32_2.update(Static27.aClass2_Sub3_2.aByteArray24, 0, local201);
								local272 = (int) Class2_Sub2_Sub16.aCRC32_2.getValue();
								if (local272 != Static82.aClass2_Sub2_Sub9_1.anInt1013) {
									try {
										Static29.aClass25_48.method730();
									} catch (@Pc(530) Exception local530) {
									}
									Class6.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									Static29.aClass25_48 = null;
									Class40.anInt1792++;
									return false;
								}
								Class40.anInt1792 = 0;
								Class61.anInt2401 = 0;
								Static82.aClass2_Sub2_Sub9_1.aClass5_Sub1_9.method91(Static27.aClass2_Sub3_2.aByteArray24, Static85.aBoolean166, (Static82.aClass2_Sub2_Sub9_1.aLong152 & 0xFF0000L) == 16711680L, (int) (Static82.aClass2_Sub2_Sub9_1.aLong152 & 0xFFFFL));
							}
							Static82.aClass2_Sub2_Sub9_1.method1677();
							Static27.aClass2_Sub3_2 = null;
							Class10.anInt274 = 0;
							Static82.aClass2_Sub2_Sub9_1 = null;
							if (Static85.aBoolean166) {
								Class2_Sub2_Sub12_Sub1_Sub2.anInt2333--;
							} else {
								Class58.anInt2182--;
							}
						} else {
							if (Class10.anInt274 != 512) {
								break;
							}
							Class10.anInt274 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(602) IOException local602) {
				try {
					Static29.aClass25_48.method730();
				} catch (@Pc(607) Exception local607) {
				}
				Class61.anInt2401++;
				Static29.aClass25_48 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V", line = 402)
	public static void method626() {
		if (Class38.anInt1672 > 0) {
			Static56.method1039();
		} else {
			Static7.method187(40);
			Static34.aClass25_20 = Static64.aClass25_36;
		}
	}
}
