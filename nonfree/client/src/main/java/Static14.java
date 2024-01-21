import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "[I")
	public static int[] anIntArray51;

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "Lclient!uf;")
	public static Class77 aClass77_3 = new Class77(4096);

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "Lclient!je;")
	public static Class40 aClass40_219 = Static69.method1231("mod_icons");

	@OriginalMember(owner = "client!cc", name = "gb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!cc", name = "hb", descriptor = "Lclient!je;")
	public static Class40 aClass40_220 = Static69.method1231(" loggt sich ein)3");

	@OriginalMember(owner = "client!cc", name = "ib", descriptor = "Lclient!ob;")
	public static Class55 aClass55_15 = new Class55(128);

	@OriginalMember(owner = "client!cc", name = "jb", descriptor = "I")
	public static int anInt279 = 0;

	@OriginalMember(owner = "client!cc", name = "kb", descriptor = "Lclient!je;")
	public static Class40 aClass40_221 = Static69.method1231("(Y");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!je;Lclient!je;Lclient!fd;)[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] method229(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class24 arg2) {
		@Pc(14) int local14 = arg2.method1915(arg0);
		@Pc(20) int local20 = arg2.method1918(arg1, local14);
		return Static10.method2129(local20, arg2, local14);
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)V")
	public static void method232() {
		aClass40_219 = null;
		aClass55_15 = null;
		aClass40_220 = null;
		aBigInteger1 = null;
		anIntArray51 = null;
		aClass77_3 = null;
		aClass40_221 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZI)V")
	public static void method233(@OriginalArg(2) boolean arg0) {
		Static68.anInt1863 = 22050;
		Static34.aBoolean59 = arg0;
		Static16.anInt408 = 2;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)Z")
	public static boolean method235() {
		@Pc(8) long local8 = Static125.method2075();
		@Pc(19) int local19 = (int) (local8 - Static5.aLong6);
		Static5.aLong6 = local8;
		if (local19 > 200) {
			local19 = 200;
		}
		Static126.anInt2911 += local19;
		if (Static52.anInt1394 == 0 && Static47.anInt1280 == 0 && Static121.anInt2842 == 0 && Static79.anInt2064 == 0) {
			return true;
		} else if (Static11.aClass57_1 == null) {
			return false;
		} else {
			try {
				if (Static126.anInt2911 > 30000) {
					throw new IOException();
				}
				@Pc(56) Class2_Sub1_Sub12 local56;
				@Pc(61) Class2_Sub9 local61;
				while (Static47.anInt1280 < 20 && Static79.anInt2064 > 0) {
					local56 = (Class2_Sub1_Sub12) Static68.aClass77_7.method2031();
					local61 = new Class2_Sub9(4);
					local61.method644(1);
					local61.method638((int) local56.aLong100);
					Static11.aClass57_1.method1591(local61.aByteArray16, 4);
					Static97.aClass77_10.method2030(local56.aLong100, local56);
					Static47.anInt1280++;
					Static79.anInt2064--;
				}
				while (Static52.anInt1394 < 20 && Static121.anInt2842 > 0) {
					local56 = (Class2_Sub1_Sub12) Static72.aClass56_1.method1585();
					local61 = new Class2_Sub9(4);
					local61.method644(0);
					local61.method638((int) local56.aLong100);
					Static11.aClass57_1.method1591(local61.aByteArray16, 4);
					local56.method2211();
					aClass77_3.method2030(local56.aLong100, local56);
					Static121.anInt2842--;
					Static52.anInt1394++;
				}
				for (@Pc(153) int local153 = 0; local153 < 100; local153++) {
					@Pc(159) int local159 = Static11.aClass57_1.method1597();
					if (local159 < 0) {
						throw new IOException();
					}
					if (local159 == 0) {
						break;
					}
					@Pc(172) byte local172 = 0;
					if (Static120.aClass2_Sub1_Sub12_1 == null) {
						local172 = 8;
					} else if (Static49.anInt1311 == 0) {
						local172 = 1;
					}
					Static126.anInt2911 = 0;
					@Pc(200) int local200;
					@Pc(205) int local205;
					@Pc(246) int local246;
					@Pc(328) int local328;
					if (local172 <= 0) {
						local200 = Static1.aClass2_Sub9_1.aByteArray16.length - Static120.aClass2_Sub1_Sub12_1.aByte6;
						local205 = 512 - Static49.anInt1311;
						if (local200 - Static1.aClass2_Sub9_1.anInt976 < local205) {
							local205 = local200 - Static1.aClass2_Sub9_1.anInt976;
						}
						if (local159 < local205) {
							local205 = local159;
						}
						Static11.aClass57_1.method1592(Static1.aClass2_Sub9_1.aByteArray16, local205, Static1.aClass2_Sub9_1.anInt976);
						if (Static133.aByte8 != 0) {
							for (local246 = 0; local246 < local205; local246++) {
								Static1.aClass2_Sub9_1.aByteArray16[local246 + Static1.aClass2_Sub9_1.anInt976] ^= Static133.aByte8;
							}
						}
						Static1.aClass2_Sub9_1.anInt976 += local205;
						Static49.anInt1311 += local205;
						if (local200 == Static1.aClass2_Sub9_1.anInt976) {
							if (Static120.aClass2_Sub1_Sub12_1.aLong100 == 16711935L) {
								Static19.aClass2_Sub9_2 = Static1.aClass2_Sub9_1;
								for (local246 = 0; local246 < 256; local246++) {
									@Pc(315) Class24_Sub1 local315 = Static79.aClass24_Sub1Array1[local246];
									if (local315 != null) {
										Static19.aClass2_Sub9_2.anInt976 = local246 * 8 + 5;
										local328 = Static19.aClass2_Sub9_2.method622();
										@Pc(332) int local332 = Static19.aClass2_Sub9_2.method622();
										local315.method1946(local328, local332);
									}
								}
							} else {
								Static79.aCRC32_1.reset();
								Static79.aCRC32_1.update(Static1.aClass2_Sub9_1.aByteArray16, 0, local200);
								local246 = (int) Static79.aCRC32_1.getValue();
								if (local246 != Static120.aClass2_Sub1_Sub12_1.anInt2468) {
									try {
										Static11.aClass57_1.method1596();
									} catch (@Pc(366) Exception local366) {
									}
									Static11.aClass57_1 = null;
									Static74.anInt950++;
									Static133.aByte8 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static74.anInt950 = 0;
								Static15.anInt299 = 0;
								Static120.aClass2_Sub1_Sub12_1.aClass24_Sub1_16.method1937((int) (Static120.aClass2_Sub1_Sub12_1.aLong100 & 0xFFFFL), (Static120.aClass2_Sub1_Sub12_1.aLong100 & 0xFF0000L) == 16711680L, Static83.aBoolean165, Static1.aClass2_Sub9_1.aByteArray16);
							}
							Static120.aClass2_Sub1_Sub12_1.method2209();
							Static49.anInt1311 = 0;
							Static1.aClass2_Sub9_1 = null;
							if (Static83.aBoolean165) {
								Static47.anInt1280--;
							} else {
								Static52.anInt1394--;
							}
							Static120.aClass2_Sub1_Sub12_1 = null;
						} else {
							if (Static49.anInt1311 != 512) {
								break;
							}
							Static49.anInt1311 = 0;
						}
					} else {
						local200 = local172 - Static76.aClass2_Sub9_4.anInt976;
						if (local159 < local200) {
							local200 = local159;
						}
						Static11.aClass57_1.method1592(Static76.aClass2_Sub9_4.aByteArray16, local200, Static76.aClass2_Sub9_4.anInt976);
						if (Static133.aByte8 != 0) {
							for (local205 = 0; local205 < local200; local205++) {
								Static76.aClass2_Sub9_4.aByteArray16[Static76.aClass2_Sub9_4.anInt976 + local205] ^= Static133.aByte8;
							}
						}
						Static76.aClass2_Sub9_4.anInt976 += local200;
						if (Static76.aClass2_Sub9_4.anInt976 < local172) {
							break;
						}
						if (Static120.aClass2_Sub1_Sub12_1 == null) {
							Static76.aClass2_Sub9_4.anInt976 = 0;
							local205 = Static76.aClass2_Sub9_4.method640();
							local246 = Static76.aClass2_Sub9_4.method632();
							@Pc(513) int local513 = Static76.aClass2_Sub9_4.method640();
							local328 = Static76.aClass2_Sub9_4.method622();
							@Pc(524) long local524 = (long) (local246 + (local205 << 16));
							@Pc(530) Class2_Sub1_Sub12 local530 = (Class2_Sub1_Sub12) Static97.aClass77_10.method2034(local524);
							Static83.aBoolean165 = true;
							if (local530 == null) {
								local530 = (Class2_Sub1_Sub12) aClass77_3.method2034(local524);
								Static83.aBoolean165 = false;
							}
							if (local530 == null) {
								throw new IOException();
							}
							Static120.aClass2_Sub1_Sub12_1 = local530;
							@Pc(556) int local556 = local513 == 0 ? 5 : 9;
							Static1.aClass2_Sub9_1 = new Class2_Sub9(local556 + local328 + Static120.aClass2_Sub1_Sub12_1.aByte6);
							Static1.aClass2_Sub9_1.method644(local513);
							Static1.aClass2_Sub9_1.method620(local328);
							Static76.aClass2_Sub9_4.anInt976 = 0;
							Static49.anInt1311 = 8;
						} else if (Static49.anInt1311 == 0) {
							if (Static76.aClass2_Sub9_4.aByteArray16[0] == -1) {
								Static76.aClass2_Sub9_4.anInt976 = 0;
								Static49.anInt1311 = 1;
							} else {
								Static120.aClass2_Sub1_Sub12_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(612) IOException local612) {
				try {
					Static11.aClass57_1.method1596();
				} catch (@Pc(617) Exception local617) {
				}
				Static11.aClass57_1 = null;
				Static15.anInt299++;
				return false;
			}
		}
	}
}
