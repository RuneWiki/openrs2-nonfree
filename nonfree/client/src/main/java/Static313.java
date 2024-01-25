import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_210 = new Class106("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
	public static int anInt6023 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V")
	public static void method5408() {
		@Pc(10) Class21 local10 = Static14.aClass21_133;
		synchronized (Static14.aClass21_133) {
			Static14.aClass21_133.method844(5);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZIIII)V")
	public static void method5412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if (arg3 > arg1) {
			for (local15 = arg1; local15 < arg3; local15++) {
				Static43.anIntArrayArray57[local15][arg2] = arg0;
			}
		} else {
			for (local15 = arg3; local15 < arg1; local15++) {
				Static43.anIntArrayArray57[local15][arg2] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
	public static Object method5414(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static55.aBoolean99) {
			try {
				@Pc(25) Class10 local25 = (Class10) Class.forName("Class10_Sub1").getDeclaredConstructor().newInstance();
				local25.method348(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static55.aBoolean99 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZI)I")
	public static int method5417(@OriginalArg(2) int arg0) {
		@Pc(19) Class1_Sub26 local19 = Static65.method5281(arg0, false);
		if (local19 == null) {
			return Static148.method2875(arg0).anInt2436;
		}
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local19.anIntArray255.length; local30++) {
			if (local19.anIntArray255[local30] == -1) {
				local28++;
			}
		}
		return local28 + Static148.method2875(arg0).anInt2436 - local19.anIntArray255.length;
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)Z")
	public static boolean method5418() throws IOException {
		if (Static165.aClass76_2 == null) {
			return false;
		}
		@Pc(13) int local13 = Static165.aClass76_2.method2387();
		if (local13 == 0) {
			return false;
		}
		@Pc(63) int local63;
		if (Static293.aClass217_165 == null) {
			if (Static228.aBoolean351) {
				Static165.aClass76_2.method2384(0, 1, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
				local13--;
				Static228.aBoolean351 = false;
			}
			Static180.aClass1_Sub7_Sub2_2.anInt2219 = 0;
			if (Static180.aClass1_Sub7_Sub2_2.method2171()) {
				if (local13 == 0) {
					return false;
				}
				Static165.aClass76_2.method2384(1, 1, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
				local13--;
			}
			Static228.aBoolean351 = true;
			@Pc(59) Class217[] local59 = Static124.method2601();
			local63 = Static180.aClass1_Sub7_Sub2_2.method2165();
			if (local63 < 0 || local59.length <= local63) {
				throw new IOException("invo:" + local63);
			}
			Static293.aClass217_165 = local59[local63];
			Static366.anInt7026 = Static293.aClass217_165.anInt6557;
		}
		if (Static366.anInt7026 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static165.aClass76_2.method2384(0, 1, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
			local13--;
			Static366.anInt7026 = Static180.aClass1_Sub7_Sub2_2.aByteArray41[0] & 0xFF;
		}
		if (Static366.anInt7026 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static165.aClass76_2.method2384(0, 2, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
			Static180.aClass1_Sub7_Sub2_2.anInt2219 = 0;
			Static366.anInt7026 = Static180.aClass1_Sub7_Sub2_2.method2161();
			local13 -= 2;
		}
		if (local13 < Static366.anInt7026) {
			return false;
		}
		Static180.aClass1_Sub7_Sub2_2.anInt2219 = 0;
		Static165.aClass76_2.method2384(0, Static366.anInt7026, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
		Static16.anInt401 = 0;
		Static197.aClass217_134 = Static341.aClass217_202;
		Static341.aClass217_202 = Static206.aClass217_177;
		Static206.aClass217_177 = Static293.aClass217_165;
		@Pc(178) int local178;
		@Pc(170) int local170;
		@Pc(174) String local174;
		if (Static232.aClass217_154 == Static293.aClass217_165) {
			local170 = Static180.aClass1_Sub7_Sub2_2.method2123();
			local174 = Static180.aClass1_Sub7_Sub2_2.method2109();
			local178 = Static180.aClass1_Sub7_Sub2_2.method2112();
			if (Static85.method1808(local170)) {
				Static155.method2929(local174, local178);
			}
			Static293.aClass217_165 = null;
			return true;
		}
		@Pc(221) int local221;
		@Pc(225) int local225;
		@Pc(231) int local231;
		@Pc(241) long local241;
		@Pc(258) Class1_Sub42 local258;
		@Pc(247) Class1_Sub42 local247;
		if (Static293.aClass217_165 == Static279.aClass217_181) {
			local170 = Static180.aClass1_Sub7_Sub2_2.method2139();
			local63 = Static180.aClass1_Sub7_Sub2_2.method2139();
			if (local63 == 65535) {
				local63 = -1;
			}
			local178 = Static180.aClass1_Sub7_Sub2_2.method2139();
			if (local178 == 65535) {
				local178 = -1;
			}
			local221 = Static180.aClass1_Sub7_Sub2_2.method2146();
			local225 = Static180.aClass1_Sub7_Sub2_2.method2123();
			if (Static85.method1808(local225)) {
				for (local231 = local178; local231 <= local63; local231++) {
					local241 = (long) local231 + ((long) local221 << 32);
					local247 = (Class1_Sub42) Static113.aClass38_10.method1475(local241);
					if (local247 != null) {
						local258 = new Class1_Sub42(local247.anInt6536, local170);
						local247.method6045();
					} else if (local231 == -1) {
						local258 = new Class1_Sub42(Static188.method3536(local221).aClass1_Sub42_2.anInt6536, local170);
					} else {
						local258 = new Class1_Sub42(0, local170);
					}
					Static113.aClass38_10.method1472(local258, local241);
				}
			}
			Static293.aClass217_165 = null;
			return true;
		} else if (Static184.aClass217_129 == Static293.aClass217_165) {
			local170 = Static180.aClass1_Sub7_Sub2_2.method2123();
			local63 = Static180.aClass1_Sub7_Sub2_2.method2161();
			local178 = Static180.aClass1_Sub7_Sub2_2.method2143();
			if (Static85.method1808(local63)) {
				Static144.method2860(local170, local178);
			}
			Static293.aClass217_165 = null;
			return true;
		} else if (Static293.aClass217_165 == Static13.aClass217_11) {
			if (Static336.anInt6389 != -1) {
				Static127.method2641(0, Static336.anInt6389);
			}
			Static293.aClass217_165 = null;
			return true;
		} else if (Static188.aClass217_132 == Static293.aClass217_165) {
			local170 = Static180.aClass1_Sub7_Sub2_2.method2139();
			local63 = Static180.aClass1_Sub7_Sub2_2.method2146();
			local178 = Static180.aClass1_Sub7_Sub2_2.method2130();
			local221 = Static180.aClass1_Sub7_Sub2_2.method2140();
			if (Static85.method1808(local178)) {
				Static362.method5987(5, local63, local170, local221);
			}
			Static293.aClass217_165 = null;
			return true;
		} else if (Static329.aClass217_193 == Static293.aClass217_165) {
			Static338.anInt6437 = Static180.aClass1_Sub7_Sub2_2.method2132();
			Static42.anInt1017 = Static180.aClass1_Sub7_Sub2_2.method2156();
			Static35.anInt921 = Static180.aClass1_Sub7_Sub2_2.method2156();
			for (@Pc(402) Class1_Sub3 local402 = (Class1_Sub3) Static46.aClass38_4.method1474(); local402 != null; local402 = (Class1_Sub3) Static46.aClass38_4.method1470()) {
				local63 = (int) (local402.aLong217 & 0x3FFFL);
				local178 = (int) (local402.aLong217 >> 14 & 0x3FFFL);
				local221 = (int) (local402.aLong217 >> 28 & 0x3L);
				if (Static338.anInt6437 == local221 && local63 >= Static35.anInt921 && Static35.anInt921 + 8 > local63 && local178 >= Static42.anInt1017 && Static42.anInt1017 + 8 > local178) {
					local402.method6045();
					Static287.method5073(local63, local178, Static338.anInt6437);
				}
			}
			for (@Pc(465) Class1_Sub20 local465 = (Class1_Sub20) Static75.aClass42_19.method1543(); local465 != null; local465 = (Class1_Sub20) Static75.aClass42_19.method1551()) {
				if (local465.anInt2716 >= Static35.anInt921 && local465.anInt2716 < Static35.anInt921 + 8 && Static42.anInt1017 <= local465.anInt2698 && Static42.anInt1017 + 8 > local465.anInt2698 && Static338.anInt6437 == local465.anInt2707) {
					local465.anInt2713 = 0;
				}
			}
			Static293.aClass217_165 = null;
			return true;
		} else if (Static293.aClass217_165 == Static108.aClass217_83) {
			local170 = Static180.aClass1_Sub7_Sub2_2.method2130();
			local63 = Static180.aClass1_Sub7_Sub2_2.method2143();
			local178 = Static180.aClass1_Sub7_Sub2_2.method2123();
			if (Static85.method1808(local178)) {
				Static300.method5231(local170, local63);
			}
			Static293.aClass217_165 = null;
			return true;
		} else if (Static321.aClass217_192 == Static293.aClass217_165) {
			local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
			if (Static85.method1808(local170)) {
				Static363.method6019();
			}
			Static293.aClass217_165 = null;
			return true;
		} else {
			@Pc(577) boolean local577;
			if (Static293.aClass217_165 == Static112.aClass217_87) {
				local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local63 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local577 = (local63 & 0x1) == 1;
				while (Static366.anInt7026 > Static180.aClass1_Sub7_Sub2_2.anInt2219) {
					local221 = Static180.aClass1_Sub7_Sub2_2.method2134();
					local225 = Static180.aClass1_Sub7_Sub2_2.method2161();
					local231 = 0;
					if (local225 != 0) {
						local231 = Static180.aClass1_Sub7_Sub2_2.method2132();
						if (local231 == 255) {
							local231 = Static180.aClass1_Sub7_Sub2_2.method2140();
						}
					}
					Static59.method1447(local170, local231, local221, local577, local225 - 1);
				}
				Static314.anIntArray470[Static196.anInt3969++ & 0x1F] = local170;
				Static293.aClass217_165 = null;
				return true;
			} else if (Static33.aClass217_30 == Static293.aClass217_165) {
				local170 = Static180.aClass1_Sub7_Sub2_2.method2123();
				local63 = Static180.aClass1_Sub7_Sub2_2.method2139();
				local178 = Static180.aClass1_Sub7_Sub2_2.method2130();
				local221 = Static180.aClass1_Sub7_Sub2_2.method2143();
				if (Static85.method1808(local63)) {
					Static78.method1688(local221, local178 + (local170 << 16));
				}
				Static293.aClass217_165 = null;
				return true;
			} else if (Static234.aClass217_156 == Static293.aClass217_165) {
				for (local170 = 0; local170 < Static275.aClass11_Sub2_Sub6_Sub1Array1.length; local170++) {
					if (Static275.aClass11_Sub2_Sub6_Sub1Array1[local170] != null) {
						Static275.aClass11_Sub2_Sub6_Sub1Array1[local170].anInt6772 = -1;
					}
				}
				for (local63 = 0; local63 < Static231.aClass11_Sub2_Sub6_Sub2Array1.length; local63++) {
					if (Static231.aClass11_Sub2_Sub6_Sub2Array1[local63] != null) {
						Static231.aClass11_Sub2_Sub6_Sub2Array1[local63].anInt6772 = -1;
					}
				}
				Static293.aClass217_165 = null;
				return true;
			} else if (Static293.aClass217_165 == Static59.aClass217_52) {
				local170 = Static180.aClass1_Sub7_Sub2_2.method2143();
				local63 = Static180.aClass1_Sub7_Sub2_2.method2139();
				if (Static85.method1808(local63)) {
					Static362.method5987(3, -1, -1, local170);
				}
				Static293.aClass217_165 = null;
				return true;
			} else if (Static297.aClass217_184 == Static293.aClass217_165) {
				Static184.method3479(Static223.aClass93_13);
				Static293.aClass217_165 = null;
				return true;
			} else if (Static293.aClass217_165 == Static365.aClass217_215) {
				local170 = Static180.aClass1_Sub7_Sub2_2.method2140();
				local63 = Static180.aClass1_Sub7_Sub2_2.method2130();
				local178 = Static180.aClass1_Sub7_Sub2_2.method2130();
				if (Static85.method1808(local63)) {
					Static224.method4160(local170, local178);
				}
				Static293.aClass217_165 = null;
				return true;
			} else if (Static293.aClass217_165 == Static67.aClass217_55) {
				local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local63 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local178 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local221 = Static180.aClass1_Sub7_Sub2_2.method2161();
				if (Static85.method1808(local170) && Static341.aClass112ArrayArray1[local63] != null) {
					for (local225 = local178; local225 < local221; local225++) {
						local231 = Static180.aClass1_Sub7_Sub2_2.method2119();
						if (Static341.aClass112ArrayArray1[local63].length > local225 && Static341.aClass112ArrayArray1[local63][local225] != null) {
							Static341.aClass112ArrayArray1[local63][local225].anInt3420 = local231;
						}
					}
				}
				Static293.aClass217_165 = null;
				return true;
			} else {
				@Pc(861) String local861;
				if (Static49.aClass217_47 == Static293.aClass217_165) {
					local861 = Static180.aClass1_Sub7_Sub2_2.method2109();
					local174 = Static113.method2408(Static196.method3687(Static337.method5674(Static180.aClass1_Sub7_Sub2_2)));
					Static19.method530(6, 0, local861, local174, local861);
					Static293.aClass217_165 = null;
					return true;
				} else if (Static91.aClass217_220 == Static293.aClass217_165) {
					local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
					if (Static85.method1808(local170)) {
						Static109.method2323();
					}
					Static293.aClass217_165 = null;
					return true;
				} else if (Static64.aClass217_210 == Static293.aClass217_165) {
					local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
					local63 = Static180.aClass1_Sub7_Sub2_2.method2132();
					local178 = Static180.aClass1_Sub7_Sub2_2.method2123();
					if (Static85.method1808(local170)) {
						if (local63 == 2) {
							Static149.method2884();
						}
						Static336.anInt6389 = local178;
						Static235.method4357(local178);
						Static14.method4534(false);
						Static302.method5245(Static336.anInt6389);
						for (local221 = 0; local221 < 100; local221++) {
							Static207.aBooleanArray21[local221] = true;
						}
					}
					Static293.aClass217_165 = null;
					return true;
				} else if (Static334.aClass217_207 == Static293.aClass217_165) {
					Static191.method5777(Static180.aClass1_Sub7_Sub2_2.method2109());
					Static293.aClass217_165 = null;
					return true;
				} else {
					@Pc(1003) int local1003;
					@Pc(989) long local989;
					@Pc(979) String local979;
					@Pc(973) boolean local973;
					@Pc(994) long local994;
					@Pc(999) long local999;
					@Pc(1073) String local1073;
					if (Static300.aClass217_187 == Static293.aClass217_165) {
						local973 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
						local174 = Static180.aClass1_Sub7_Sub2_2.method2109();
						local979 = local174;
						if (local973) {
							local979 = Static180.aClass1_Sub7_Sub2_2.method2109();
						}
						local989 = Static180.aClass1_Sub7_Sub2_2.method2148();
						local994 = Static180.aClass1_Sub7_Sub2_2.method2161();
						local999 = Static180.aClass1_Sub7_Sub2_2.method2119();
						local1003 = Static180.aClass1_Sub7_Sub2_2.method2132();
						@Pc(1009) long local1009 = (local994 << 32) + local999;
						@Pc(1011) boolean local1011 = false;
						@Pc(1013) int local1013 = 0;
						while (true) {
							if (local1013 >= 100) {
								if (local1003 <= 1) {
									if (Static212.aBoolean313 && !Static67.aBoolean111 || Static9.aBoolean12) {
										local1011 = true;
									} else if (Static17.method2116(local979)) {
										local1011 = true;
									}
								}
								break;
							}
							if (Static110.aLongArray6[local1013] == local1009) {
								local1011 = true;
								break;
							}
							local1013++;
						}
						if (!local1011 && Static94.anInt2085 == 0) {
							Static110.aLongArray6[Static153.anInt3178] = local1009;
							Static153.anInt3178 = (Static153.anInt3178 + 1) % 100;
							local1073 = Static113.method2408(Static196.method3687(Static337.method5674(Static180.aClass1_Sub7_Sub2_2)));
							if (local1003 == 2 || local1003 == 3) {
								Static134.method2729("<img=1>" + local174, Static157.method2978(local989), local1073, "<img=1>" + local979, 9, 0, -1);
							} else if (local1003 == 1) {
								Static134.method2729("<img=0>" + local174, Static157.method2978(local989), local1073, "<img=0>" + local979, 9, 0, -1);
							} else {
								Static134.method2729(local174, Static157.method2978(local989), local1073, local979, 9, 0, -1);
							}
						}
						Static293.aClass217_165 = null;
						return true;
					} else if (Static293.aClass217_165 == Static270.aClass217_173) {
						Static184.method3479(Static41.aClass93_6);
						Static293.aClass217_165 = null;
						return true;
					} else if (Static293.aClass217_165 == Static40.aClass217_36) {
						local170 = Static180.aClass1_Sub7_Sub2_2.method2135();
						local63 = Static180.aClass1_Sub7_Sub2_2.method2130();
						if (local63 == 65535) {
							local63 = -1;
						}
						Static249.method104(local170, local63);
						Static293.aClass217_165 = null;
						return true;
					} else if (Static293.aClass217_165 == Static357.aClass217_211) {
						local170 = Static180.aClass1_Sub7_Sub2_2.method2139();
						if (local170 == 65535) {
							local170 = -1;
						}
						local63 = Static180.aClass1_Sub7_Sub2_2.method2156();
						local178 = Static180.aClass1_Sub7_Sub2_2.method2119();
						Static26.method640(local170, local63, local178);
						Static293.aClass217_165 = null;
						return true;
					} else if (Static218.aClass217_147 == Static293.aClass217_165) {
						Static184.method3479(Static260.aClass93_14);
						Static293.aClass217_165 = null;
						return true;
					} else if (Static293.aClass217_165 == Static339.aClass217_191) {
						local170 = Static180.aClass1_Sub7_Sub2_2.method2135();
						local63 = Static180.aClass1_Sub7_Sub2_2.method2123();
						if (Static85.method1808(local63)) {
							Static363.anInt6977 = local170;
						}
						Static293.aClass217_165 = null;
						return true;
					} else if (Static129.aClass217_93 == Static293.aClass217_165) {
						local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
						local63 = Static180.aClass1_Sub7_Sub2_2.method2132();
						local178 = Static180.aClass1_Sub7_Sub2_2.method2132();
						local221 = Static180.aClass1_Sub7_Sub2_2.method2132();
						local225 = Static180.aClass1_Sub7_Sub2_2.method2132();
						local231 = Static180.aClass1_Sub7_Sub2_2.method2161();
						if (Static85.method1808(local170)) {
							Static26.aBooleanArray1[local63] = true;
							Static319.anIntArray473[local63] = local178;
							Static277.anIntArray418[local63] = local221;
							Static123.anIntArray197[local63] = local225;
							Static113.anIntArray188[local63] = local231;
						}
						Static293.aClass217_165 = null;
						return true;
					} else if (Static293.aClass217_165 == Static352.aClass217_65) {
						local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
						if (local170 == 65535) {
							local170 = -1;
						}
						local63 = Static180.aClass1_Sub7_Sub2_2.method2132();
						local178 = Static180.aClass1_Sub7_Sub2_2.method2161();
						local221 = Static180.aClass1_Sub7_Sub2_2.method2132();
						Static308.method5351(local178, local63, local170, local221);
						Static293.aClass217_165 = null;
						return true;
					} else {
						@Pc(1547) int local1547;
						@Pc(1393) int local1393;
						@Pc(1374) boolean local1374;
						@Pc(1372) String local1372;
						@Pc(1600) String local1600;
						@Pc(1582) int local1582;
						@Pc(1636) String local1636;
						if (Static366.aClass217_218 == Static293.aClass217_165) {
							local973 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
							local174 = Static180.aClass1_Sub7_Sub2_2.method2109();
							local979 = Static180.aClass1_Sub7_Sub2_2.method2109();
							local221 = Static180.aClass1_Sub7_Sub2_2.method2161();
							local225 = Static180.aClass1_Sub7_Sub2_2.method2132();
							local1372 = "";
							local1374 = false;
							if (local221 > 0) {
								local1372 = Static180.aClass1_Sub7_Sub2_2.method2109();
								local1374 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
							}
							for (local1393 = 0; local1393 < Static195.anInt3948; local1393++) {
								if (local973) {
									if (local979.equals(Static247.aStringArray29[local1393])) {
										Static247.aStringArray29[local1393] = local174;
										local174 = null;
										Static160.aStringArray14[local1393] = local979;
										break;
									}
								} else if (local174.equals(Static247.aStringArray29[local1393])) {
									if (local221 != Static28.anIntArray47[local1393]) {
										Static28.anIntArray47[local1393] = local221;
										if (local221 > 0) {
											Static19.method530(5, 0, "", local174 + Static368.aClass106_239.method2927(Static254.anInt5172), "");
										}
										if (local221 == 0) {
											Static19.method530(5, 0, "", local174 + Static238.aClass106_163.method2927(Static254.anInt5172), "");
										}
									}
									Static160.aStringArray14[local1393] = local979;
									Static275.aStringArray31[local1393] = local1372;
									Static330.anIntArray482[local1393] = local225;
									Static206.aBooleanArray28[local1393] = local1374;
									local174 = null;
									break;
								}
							}
							if (local174 != null && Static195.anInt3948 < 200) {
								Static247.aStringArray29[Static195.anInt3948] = local174;
								Static160.aStringArray14[Static195.anInt3948] = local979;
								Static28.anIntArray47[Static195.anInt3948] = local221;
								Static275.aStringArray31[Static195.anInt3948] = local1372;
								Static330.anIntArray482[Static195.anInt3948] = local225;
								Static206.aBooleanArray28[Static195.anInt3948] = local1374;
								Static195.anInt3948++;
							}
							Static27.anInt621 = Static356.anInt6822;
							local1003 = Static195.anInt3948;
							while (local1003 > 0) {
								local1003--;
								@Pc(1545) boolean local1545 = true;
								for (local1547 = 0; local1547 < local1003; local1547++) {
									if (Static28.anIntArray47[local1547] != Static239.anInt4853 && Static239.anInt4853 == Static28.anIntArray47[local1547 + 1] || Static28.anIntArray47[local1547] == 0 && Static28.anIntArray47[local1547 + 1] != 0) {
										local1582 = Static28.anIntArray47[local1547];
										Static28.anIntArray47[local1547] = Static28.anIntArray47[local1547 + 1];
										Static28.anIntArray47[local1547 + 1] = local1582;
										local1600 = Static275.aStringArray31[local1547];
										Static275.aStringArray31[local1547] = Static275.aStringArray31[local1547 + 1];
										Static275.aStringArray31[local1547 + 1] = local1600;
										local1073 = Static247.aStringArray29[local1547];
										Static247.aStringArray29[local1547] = Static247.aStringArray29[local1547 + 1];
										Static247.aStringArray29[local1547 + 1] = local1073;
										local1636 = Static160.aStringArray14[local1547];
										Static160.aStringArray14[local1547] = Static160.aStringArray14[local1547 + 1];
										Static160.aStringArray14[local1547 + 1] = local1636;
										@Pc(1654) int local1654 = Static330.anIntArray482[local1547];
										Static330.anIntArray482[local1547] = Static330.anIntArray482[local1547 + 1];
										Static330.anIntArray482[local1547 + 1] = local1654;
										@Pc(1672) boolean local1672 = Static206.aBooleanArray28[local1547];
										Static206.aBooleanArray28[local1547] = Static206.aBooleanArray28[local1547 + 1];
										Static206.aBooleanArray28[local1547 + 1] = local1672;
										local1545 = false;
									}
								}
								if (local1545) {
									break;
								}
							}
							Static293.aClass217_165 = null;
							return true;
						} else if (Static293.aClass217_165 == Static21.aClass217_17) {
							Static184.method3479(Static27.aClass93_5);
							Static293.aClass217_165 = null;
							return true;
						} else if (Static293.aClass217_165 == Static149.aClass217_103) {
							local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
							local63 = Static180.aClass1_Sub7_Sub2_2.method2140();
							if (Static85.method1808(local170)) {
								@Pc(1738) Class1_Sub15 local1738 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local63);
								if (local1738 != null) {
									Static15.method343(false, true, local1738);
								}
								if (Static323.aClass112_13 != null) {
									Static133.method2725(Static323.aClass112_13);
									Static323.aClass112_13 = null;
								}
							}
							Static293.aClass217_165 = null;
							return true;
						} else if (Static220.aClass217_148 == Static293.aClass217_165) {
							local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
							local174 = Static180.aClass1_Sub7_Sub2_2.method2109();
							@Pc(1773) Object[] local1773 = new Object[local174.length() + 1];
							for (local221 = local174.length() - 1; local221 >= 0; local221--) {
								if (local174.charAt(local221) == 's') {
									local1773[local221 + 1] = Static180.aClass1_Sub7_Sub2_2.method2109();
								} else {
									local1773[local221 + 1] = Integer.valueOf(Static180.aClass1_Sub7_Sub2_2.method2140());
								}
							}
							local1773[0] = Integer.valueOf(Static180.aClass1_Sub7_Sub2_2.method2140());
							if (Static85.method1808(local170)) {
								@Pc(1831) Class1_Sub35 local1831 = new Class1_Sub35();
								local1831.anObjectArray34 = local1773;
								Static302.method5243(local1831);
							}
							Static293.aClass217_165 = null;
							return true;
						} else if (Static188.aClass217_133 == Static293.aClass217_165) {
							local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
							local63 = Static180.aClass1_Sub7_Sub2_2.method2146();
							if (Static85.method1808(local170)) {
								Static362.method5987(5, 0, Static352.anInt1802, local63);
							}
							Static293.aClass217_165 = null;
							return true;
						} else if (Static87.aClass217_69 == Static293.aClass217_165) {
							Static180.aClass1_Sub7_Sub2_2.anInt2219 += 28;
							if (Static180.aClass1_Sub7_Sub2_2.method2160()) {
								Static13.method375(Static180.aClass1_Sub7_Sub2_2.anInt2219 - 28, Static180.aClass1_Sub7_Sub2_2);
							}
							Static293.aClass217_165 = null;
							return true;
						} else if (Static293.aClass217_165 == Static26.aClass217_21) {
							local170 = Static180.aClass1_Sub7_Sub2_2.method2123();
							local174 = Static180.aClass1_Sub7_Sub2_2.method2109();
							local178 = Static180.aClass1_Sub7_Sub2_2.method2130();
							if (Static85.method1808(local170)) {
								Static42.method982(local178, local174);
							}
							Static293.aClass217_165 = null;
							return true;
						} else if (Static293.aClass217_165 == Static116.aClass217_88) {
							Static177.method3447(Static366.anInt7026, Static180.aClass1_Sub7_Sub2_2, Static227.aClass75_5);
							Static293.aClass217_165 = null;
							return true;
						} else if (Static72.aClass217_59 == Static293.aClass217_165) {
							local170 = Static180.aClass1_Sub7_Sub2_2.method2128();
							local63 = Static180.aClass1_Sub7_Sub2_2.method2130();
							local178 = Static180.aClass1_Sub7_Sub2_2.method2140();
							if (Static85.method1808(local63)) {
								Static62.method1471(local170, local178);
							}
							Static293.aClass217_165 = null;
							return true;
						} else if (Static293.aClass217_165 == Static339.aClass217_190) {
							local170 = Static180.aClass1_Sub7_Sub2_2.method2140();
							Static363.aClass121_9 = Static227.aClass75_5.method2357(local170);
							Static293.aClass217_165 = null;
							return true;
						} else if (Static142.aClass217_100 == Static293.aClass217_165) {
							if (Static31.aFrame1 != null) {
								Static194.method3635(Static164.anInt3449, -1, -1, false);
							}
							@Pc(1987) byte[] local1987 = new byte[Static366.anInt7026];
							Static180.aClass1_Sub7_Sub2_2.method2170(Static366.anInt7026, local1987);
							local174 = Static162.method3074(Static366.anInt7026, local1987, 0);
							Static245.method4675(Static227.aClass75_5, true, local174, Static241.anInt4925 == 1);
							Static293.aClass217_165 = null;
							return true;
						} else if (Static145.aClass217_102 == Static293.aClass217_165) {
							local170 = Static180.aClass1_Sub7_Sub2_2.method2112();
							local63 = Static180.aClass1_Sub7_Sub2_2.method2130();
							local178 = Static180.aClass1_Sub7_Sub2_2.method2139();
							if (local178 == 65535) {
								local178 = -1;
							}
							local221 = Static180.aClass1_Sub7_Sub2_2.method2146();
							if (Static85.method1808(local63)) {
								Static103.method2248(local221, local178, local170);
								@Pc(2056) Class22 local2056 = Static243.aClass220_2.method5972(local178);
								Static163.method3097(local2056.anInt898, local2056.anInt877, local2056.anInt896, local221);
								Static328.method5540(local2056.anInt867, local2056.anInt915, local2056.anInt911, local221);
							}
							Static293.aClass217_165 = null;
							return true;
						} else if (Static259.aClass217_170 == Static293.aClass217_165) {
							local170 = Static180.aClass1_Sub7_Sub2_2.method2123();
							local174 = Static180.aClass1_Sub7_Sub2_2.method2109();
							local178 = Static180.aClass1_Sub7_Sub2_2.method2130();
							if (Static85.method1808(local178)) {
								Static42.method982(local170, local174);
							}
							Static293.aClass217_165 = null;
							return true;
						} else if (Static293.aClass217_165 == Static277.aClass217_178) {
							Static67.anInt1589 = Static180.aClass1_Sub7_Sub2_2.method2132();
							Static293.aClass217_165 = null;
							Static27.anInt621 = Static356.anInt6822;
							return true;
						} else if (Static293.aClass217_165 == Static298.aClass217_200) {
							Static17.method2105();
							Static293.aClass217_165 = null;
							Static120.anInt2628 += 32;
							return true;
						} else if (Static293.aClass217_165 == Static344.aClass217_161) {
							local170 = Static180.aClass1_Sub7_Sub2_2.method2143();
							local63 = Static180.aClass1_Sub7_Sub2_2.method2139();
							Static133.method2719(local170, local63);
							Static293.aClass217_165 = null;
							return true;
						} else if (Static293.aClass217_165 == Static298.aClass217_201) {
							local170 = Static180.aClass1_Sub7_Sub2_2.method2113();
							local63 = Static180.aClass1_Sub7_Sub2_2.method2123();
							Static161.method3065(local63, local170);
							Static293.aClass217_165 = null;
							return true;
						} else if (Static97.aClass217_78 == Static293.aClass217_165) {
							local170 = Static180.aClass1_Sub7_Sub2_2.method2123();
							local63 = Static180.aClass1_Sub7_Sub2_2.method2156();
							local178 = Static180.aClass1_Sub7_Sub2_2.method2140();
							if (Static85.method1808(local170)) {
								Static67.method1545(local63, local178);
							}
							Static293.aClass217_165 = null;
							return true;
						} else if (Static11.aClass217_31 == Static293.aClass217_165) {
							Static304.method5259(true);
							Static293.aClass217_165 = null;
							return true;
						} else {
							@Pc(2234) String local2234;
							if (Static92.aClass217_75 == Static293.aClass217_165) {
								local170 = Static180.aClass1_Sub7_Sub2_2.method2113();
								local63 = Static180.aClass1_Sub7_Sub2_2.method2123();
								if (local63 == 65535) {
									local63 = -1;
								}
								local178 = Static180.aClass1_Sub7_Sub2_2.method2135();
								local2234 = Static180.aClass1_Sub7_Sub2_2.method2109();
								if (local170 >= 1 && local170 <= 8) {
									if (local2234.equalsIgnoreCase("null")) {
										local2234 = null;
									}
									Static19.aStringArray2[local170 - 1] = local2234;
									Static182.anIntArray283[local170 - 1] = local63;
									Static135.aBooleanArray15[local170 - 1] = local178 == 0;
								}
								Static293.aClass217_165 = null;
								return true;
							}
							@Pc(2480) Class126 local2480;
							@Pc(2455) int local2455;
							if (Static293.aClass217_165 == Static23.aClass217_19) {
								Static55.anInt1396 = Static356.anInt6822;
								if (Static366.anInt7026 == 0) {
									Static223.aString44 = null;
									Static365.aClass126Array1 = null;
									Static135.anInt2903 = 0;
									Static345.aString60 = null;
									Static293.aClass217_165 = null;
									return true;
								}
								Static345.aString60 = Static180.aClass1_Sub7_Sub2_2.method2109();
								local973 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
								if (local973) {
									Static180.aClass1_Sub7_Sub2_2.method2109();
								}
								@Pc(2324) long local2324 = Static180.aClass1_Sub7_Sub2_2.method2148();
								Static223.aString44 = Static49.method1168(local2324);
								Static11.aByte9 = Static180.aClass1_Sub7_Sub2_2.method2122();
								local221 = Static180.aClass1_Sub7_Sub2_2.method2132();
								if (local221 == 255) {
									Static293.aClass217_165 = null;
									return true;
								}
								Static135.anInt2903 = local221;
								@Pc(2350) Class126[] local2350 = new Class126[100];
								for (local231 = 0; local231 < Static135.anInt2903; local231++) {
									local2350[local231] = new Class126();
									local2350[local231].aString38 = Static180.aClass1_Sub7_Sub2_2.method2109();
									local973 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
									if (local973) {
										local2350[local231].aString36 = Static180.aClass1_Sub7_Sub2_2.method2109();
									} else {
										local2350[local231].aString36 = local2350[local231].aString38;
									}
									local2350[local231].aString35 = Static267.method4817(local2350[local231].aString36);
									local2350[local231].anInt3765 = Static180.aClass1_Sub7_Sub2_2.method2161();
									local2350[local231].aByte28 = Static180.aClass1_Sub7_Sub2_2.method2122();
									local2350[local231].aString37 = Static180.aClass1_Sub7_Sub2_2.method2109();
									if (local2350[local231].aString36.equals(Static191.aClass11_Sub2_Sub6_Sub1_4.aString63)) {
										Static222.aByte34 = local2350[local231].aByte28;
									}
								}
								local2455 = Static135.anInt2903;
								while (local2455 > 0) {
									local1374 = true;
									local2455--;
									for (local1003 = 0; local1003 < local2455; local1003++) {
										if (local2350[local1003].aString35.compareTo(local2350[local1003 + 1].aString35) > 0) {
											local2480 = local2350[local1003];
											local2350[local1003] = local2350[local1003 + 1];
											local1374 = false;
											local2350[local1003 + 1] = local2480;
										}
									}
									if (local1374) {
										break;
									}
								}
								Static365.aClass126Array1 = local2350;
								Static293.aClass217_165 = null;
								return true;
							}
							@Pc(2564) int local2564;
							@Pc(2550) String local2550;
							if (Static293.aClass217_165 == Static161.aClass217_115) {
								local170 = Static180.aClass1_Sub7_Sub2_2.method2132();
								@Pc(2532) boolean local2532 = (local170 & 0x1) == 1;
								local979 = Static180.aClass1_Sub7_Sub2_2.method2109();
								local2234 = Static180.aClass1_Sub7_Sub2_2.method2109();
								if (local2234.equals("")) {
									local2234 = local979;
								}
								local2550 = Static180.aClass1_Sub7_Sub2_2.method2109();
								local1372 = Static180.aClass1_Sub7_Sub2_2.method2109();
								if (local1372.equals("")) {
									local1372 = local2550;
								}
								if (local2532) {
									for (local2564 = 0; local2564 < Static216.anInt4293; local2564++) {
										if (Static191.aStringArray43[local2564].equals(local1372)) {
											Static150.aStringArray32[local2564] = local979;
											Static191.aStringArray43[local2564] = local2234;
											Static322.aStringArray39[local2564] = local2550;
											Static239.aStringArray26[local2564] = local1372;
											break;
										}
									}
								} else {
									Static150.aStringArray32[Static216.anInt4293] = local979;
									Static191.aStringArray43[Static216.anInt4293] = local2234;
									Static322.aStringArray39[Static216.anInt4293] = local2550;
									Static239.aStringArray26[Static216.anInt4293] = local1372;
									Static209.aBooleanArray24[Static216.anInt4293] = (local170 & 0x2) == 2;
									Static216.anInt4293++;
								}
								Static27.anInt621 = Static356.anInt6822;
								Static293.aClass217_165 = null;
								return true;
							} else if (Static293.aClass217_165 == Static359.aClass217_212) {
								local170 = Static180.aClass1_Sub7_Sub2_2.method2130();
								local63 = Static180.aClass1_Sub7_Sub2_2.method2161();
								local178 = Static180.aClass1_Sub7_Sub2_2.method2130();
								local221 = Static180.aClass1_Sub7_Sub2_2.method2161();
								local225 = Static180.aClass1_Sub7_Sub2_2.method2112();
								if (Static85.method1808(local178)) {
									Static362.method5987(7, local221, local63 | local170 << 16, local225);
								}
								Static293.aClass217_165 = null;
								return true;
							} else if (Static6.aClass217_4 == Static293.aClass217_165) {
								Static184.method3479(Static62.aClass93_8);
								Static293.aClass217_165 = null;
								return true;
							} else if (Static293.aClass217_165 == Static149.aClass217_104) {
								Static216.anInt4293 = Static180.aClass1_Sub7_Sub2_2.method2132();
								for (local170 = 0; local170 < Static216.anInt4293; local170++) {
									Static150.aStringArray32[local170] = Static180.aClass1_Sub7_Sub2_2.method2109();
									Static191.aStringArray43[local170] = Static180.aClass1_Sub7_Sub2_2.method2109();
									if (Static191.aStringArray43[local170].equals("")) {
										Static191.aStringArray43[local170] = Static150.aStringArray32[local170];
									}
									Static322.aStringArray39[local170] = Static180.aClass1_Sub7_Sub2_2.method2109();
									Static239.aStringArray26[local170] = Static180.aClass1_Sub7_Sub2_2.method2109();
									if (Static239.aStringArray26[local170].equals("")) {
										Static239.aStringArray26[local170] = Static322.aStringArray39[local170];
									}
									Static209.aBooleanArray24[local170] = false;
								}
								Static293.aClass217_165 = null;
								Static27.anInt621 = Static356.anInt6822;
								return true;
							} else if (Static85.aClass217_67 == Static293.aClass217_165) {
								Static184.method3479(Static138.aClass93_12);
								Static293.aClass217_165 = null;
								return true;
							} else if (Static290.aClass217_186 == Static293.aClass217_165) {
								local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
								local63 = Static180.aClass1_Sub7_Sub2_2.method2132();
								local577 = (local63 & 0x1) == 1;
								Static340.method5699(local170, local577);
								local221 = Static180.aClass1_Sub7_Sub2_2.method2161();
								for (local225 = 0; local225 < local221; local225++) {
									local231 = Static180.aClass1_Sub7_Sub2_2.method2132();
									if (local231 == 255) {
										local231 = Static180.aClass1_Sub7_Sub2_2.method2112();
									}
									local2564 = Static180.aClass1_Sub7_Sub2_2.method2139();
									Static59.method1447(local170, local231, local225, local577, local2564 - 1);
								}
								Static314.anIntArray470[Static196.anInt3969++ & 0x1F] = local170;
								Static293.aClass217_165 = null;
								return true;
							} else if (Static185.aClass217_72 == Static293.aClass217_165) {
								local170 = Static180.aClass1_Sub7_Sub2_2.method2146();
								local63 = Static180.aClass1_Sub7_Sub2_2.method2123();
								if (local63 == 65535) {
									local63 = -1;
								}
								local178 = Static180.aClass1_Sub7_Sub2_2.method2161();
								if (Static85.method1808(local178)) {
									Static362.method5987(2, -1, local63, local170);
								}
								Static293.aClass217_165 = null;
								return true;
							} else if (Static212.aClass217_140 == Static293.aClass217_165) {
								Static184.method3479(Static324.aClass93_19);
								Static293.aClass217_165 = null;
								return true;
							} else if (Static293.aClass217_165 == Static364.aClass217_214) {
								Static272.method4853(true);
								Static293.aClass217_165 = null;
								return false;
							} else if (Static293.aClass217_165 == Static354.aClass217_205) {
								local170 = Static180.aClass1_Sub7_Sub2_2.method2134();
								local63 = Static180.aClass1_Sub7_Sub2_2.method2140();
								local178 = Static180.aClass1_Sub7_Sub2_2.method2132();
								local2234 = "";
								local2550 = local2234;
								if ((local178 & 0x1) != 0) {
									local2234 = Static180.aClass1_Sub7_Sub2_2.method2109();
									if ((local178 & 0x2) == 0) {
										local2550 = local2234;
									} else {
										local2550 = Static180.aClass1_Sub7_Sub2_2.method2109();
									}
								}
								local1372 = Static180.aClass1_Sub7_Sub2_2.method2109();
								if (local170 == 99) {
									Static160.method3015(local1372);
								} else if (local2550.equals("") || !Static17.method2116(local2550)) {
									Static19.method530(local170, local63, local2550, local1372, local2234);
								} else {
									Static293.aClass217_165 = null;
									return true;
								}
								Static293.aClass217_165 = null;
								return true;
							} else if (Static247.aClass217_166 == Static293.aClass217_165) {
								local170 = Static180.aClass1_Sub7_Sub2_2.method2139();
								local63 = Static180.aClass1_Sub7_Sub2_2.method2130();
								local178 = Static180.aClass1_Sub7_Sub2_2.method2123();
								local221 = Static180.aClass1_Sub7_Sub2_2.method2146();
								if (local221 >> 30 == 0) {
									@Pc(3146) Class109 local3146;
									@Pc(3164) Class199 local3164;
									@Pc(3198) Class199 local3198;
									@Pc(3169) Class199 local3169;
									@Pc(3151) Class109 local3151;
									if (local221 >> 29 != 0) {
										local225 = local221 & 0xFFFF;
										@Pc(3307) Class11_Sub2_Sub6_Sub2 local3307 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local225];
										if (local3307 != null) {
											if (local178 == 65535) {
												local178 = -1;
											}
											local1374 = true;
											if (local178 != -1 && local3307.anInt6795 != -1) {
												if (local178 == local3307.anInt6795) {
													local3146 = Static345.method5752(local178);
													if (local3146.aBoolean221 && local3146.anInt3267 != -1) {
														local3198 = Static161.method3066(local3146.anInt3267);
														local1003 = local3198.anInt6015;
														if (local1003 == 0 || local1003 == 2) {
															local1374 = false;
														} else if (local1003 == 1) {
															local1374 = true;
														}
													}
												} else {
													local3146 = Static345.method5752(local178);
													local3151 = Static345.method5752(local3307.anInt6795);
													if (local3146.anInt3267 != -1 && local3151.anInt3267 != -1) {
														local3164 = Static161.method3066(local3146.anInt3267);
														local3169 = Static161.method3066(local3151.anInt3267);
														if (local3164.anInt6020 < local3169.anInt6020) {
															local1374 = false;
														}
													}
												}
											}
											if (local1374) {
												local3307.anInt6734 = local170;
												local3307.anInt6795 = local178;
												local3307.anInt6774 = Static51.anInt1301 + local63;
												local3307.anInt6778 = 0;
												local3307.anInt6748 = 0;
												local3307.anInt6782 = 1;
												if (local3307.anInt6774 > Static51.anInt1301) {
													local3307.anInt6778 = -1;
												}
												if (local3307.anInt6795 != -1 && local3307.anInt6774 == Static51.anInt1301) {
													local1393 = Static345.method5752(local3307.anInt6795).anInt3267;
													if (local1393 != -1) {
														local3198 = Static161.method3066(local1393);
														if (local3198 != null && local3198.anIntArray467 != null) {
															Static96.method2060(local3198, false, local3307.aByte79, 0, local3307.anInt6729, local3307.anInt6726);
														}
													}
												}
											}
										}
									} else if (local221 >> 28 != 0) {
										local225 = local221 & 0xFFFF;
										@Pc(3111) Class11_Sub2_Sub6_Sub1 local3111;
										if (local225 == Static352.anInt1802) {
											local3111 = Static191.aClass11_Sub2_Sub6_Sub1_4;
										} else {
											local3111 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local225];
										}
										if (local3111 != null) {
											if (local178 == 65535) {
												local178 = -1;
											}
											local1374 = true;
											if (local178 != -1 && local3111.anInt6795 != -1) {
												if (local3111.anInt6795 == local178) {
													local3146 = Static345.method5752(local178);
													if (local3146.aBoolean221 && local3146.anInt3267 != -1) {
														local3198 = Static161.method3066(local3146.anInt3267);
														local1003 = local3198.anInt6015;
														if (local1003 == 0 || local1003 == 2) {
															local1374 = false;
														} else if (local1003 == 1) {
															local1374 = true;
														}
													}
												} else {
													local3146 = Static345.method5752(local178);
													local3151 = Static345.method5752(local3111.anInt6795);
													if (local3146.anInt3267 != -1 && local3151.anInt3267 != -1) {
														local3164 = Static161.method3066(local3146.anInt3267);
														local3169 = Static161.method3066(local3151.anInt3267);
														if (local3169.anInt6020 > local3164.anInt6020) {
															local1374 = false;
														}
													}
												}
											}
											if (local1374) {
												local3111.anInt6774 = local63 + Static51.anInt1301;
												local3111.anInt6734 = local170;
												local3111.anInt6795 = local178;
												local3111.anInt6778 = 0;
												local3111.anInt6748 = 0;
												local3111.anInt6782 = 1;
												if (local3111.anInt6795 == 65535) {
													local3111.anInt6795 = -1;
												}
												if (local3111.anInt6774 > Static51.anInt1301) {
													local3111.anInt6778 = -1;
												}
												if (local3111.anInt6795 != -1 && local3111.anInt6774 == Static51.anInt1301) {
													local1393 = Static345.method5752(local3111.anInt6795).anInt3267;
													if (local1393 != -1) {
														local3198 = Static161.method3066(local1393);
														if (local3198 != null && local3198.anIntArray467 != null) {
															Static96.method2060(local3198, local3111 == Static191.aClass11_Sub2_Sub6_Sub1_4, local3111.aByte79, 0, local3111.anInt6729, local3111.anInt6726);
														}
													}
												}
											}
										}
									}
								} else {
									local225 = local221 >> 28 & 0x3;
									local231 = (local221 >> 14 & 0x3FFF) - Static50.anInt1271;
									local2564 = (local221 & 0x3FFF) - Static299.anInt4036;
									if (local231 >= 0 && local2564 >= 0 && local231 < Static311.anInt5653 && Static189.anInt3820 > local2564) {
										local1393 = local231 * 128 + 64;
										local2455 = local2564 * 128 + 64;
										@Pc(3082) Class11_Sub2_Sub2 local3082 = new Class11_Sub2_Sub2(local178, 0, Static51.anInt1301, local225, local1393, Static8.method288(local225, local1393, local2455) - local170, local2455, local231, local231, local2564, local2564);
										Static42.aClass42_3.method1549(new Class1_Sub4_Sub1(local3082));
									}
								}
								Static293.aClass217_165 = null;
								return true;
							} else if (Static293.aClass217_165 == Static161.aClass217_114) {
								local170 = Static180.aClass1_Sub7_Sub2_2.method2114();
								local63 = Static180.aClass1_Sub7_Sub2_2.method2146();
								local178 = Static180.aClass1_Sub7_Sub2_2.method2114();
								local221 = Static180.aClass1_Sub7_Sub2_2.method2161();
								if (Static85.method1808(local221)) {
									Static41.method960(local63, local178, local170);
								}
								Static293.aClass217_165 = null;
								return true;
							} else {
								@Pc(3565) Class1_Sub15 local3565;
								if (Static293.aClass217_165 == Static2.aClass217_2) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2139();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2146();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2140();
									if (Static85.method1808(local170)) {
										@Pc(3558) Class1_Sub15 local3558 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local63);
										local3565 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local178);
										if (local3565 != null) {
											Static15.method343(false, local3558 == null || local3558.anInt1496 != local3565.anInt1496, local3565);
										}
										if (local3558 != null) {
											local3558.method6045();
											Static281.aClass38_30.method1472(local3558, (long) local178);
										}
										@Pc(3596) Class112 local3596 = Static188.method3536(local63);
										if (local3596 != null) {
											Static133.method2725(local3596);
										}
										local3596 = Static188.method3536(local178);
										if (local3596 != null) {
											Static133.method2725(local3596);
											Static129.method2662(true, local3596);
										}
										if (Static336.anInt6389 != -1) {
											Static127.method2641(1, Static336.anInt6389);
										}
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static71.aClass217_58) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2146();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2123();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2139();
									if (local178 == 65535) {
										local178 = -1;
									}
									if (Static85.method1808(local63)) {
										Static129.method2668(local170, local178);
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static6.aClass217_3 == Static293.aClass217_165) {
									local861 = Static180.aClass1_Sub7_Sub2_2.method2109();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2161();
									local979 = Static113.method2414(local63).method3418(Static180.aClass1_Sub7_Sub2_2);
									Static134.method2729(local861, null, local979, local861, 19, 0, local63);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static213.aClass217_143) {
									Static272.method4853(false);
									Static293.aClass217_165 = null;
									return false;
								} else if (Static293.aClass217_165 == Static140.aClass217_96) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2130();
									if (local170 == 65535) {
										local170 = -1;
									}
									local63 = Static180.aClass1_Sub7_Sub2_2.method2161();
									if (local63 == 65535) {
										local63 = -1;
									}
									local178 = Static180.aClass1_Sub7_Sub2_2.method2112();
									local221 = Static180.aClass1_Sub7_Sub2_2.method2146();
									local225 = Static180.aClass1_Sub7_Sub2_2.method2161();
									if (Static85.method1808(local225)) {
										for (local231 = local63; local231 <= local170; local231++) {
											local241 = ((long) local178 << 32) + (long) local231;
											local247 = (Class1_Sub42) Static113.aClass38_10.method1475(local241);
											if (local247 != null) {
												local258 = new Class1_Sub42(local221, local247.anInt6537);
												local247.method6045();
											} else if (local231 == -1) {
												local258 = new Class1_Sub42(local221, Static188.method3536(local178).aClass1_Sub42_2.anInt6537);
											} else {
												local258 = new Class1_Sub42(local221, -1);
											}
											Static113.aClass38_10.method1472(local258, local241);
										}
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static261.aClass217_171) {
									Static304.method5259(false);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static46.aClass217_46 == Static293.aClass217_165) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2123();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2123();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2132();
									@Pc(3846) Class11_Sub2_Sub6_Sub2 local3846 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local170];
									if (local3846 != null) {
										Static315.method5401(local3846, local178, local63);
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static166.aClass217_119 == Static293.aClass217_165) {
									Static184.method3479(Static301.aClass93_17);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static333.aClass217_194 == Static293.aClass217_165) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2143();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2135();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2113();
									Static21.anIntArray39[local63] = local170;
									Static25.anIntArray81[local63] = local178;
									Static225.anIntArray372[local63] = 1;
									local221 = Static330.anIntArray481[local63] - 1;
									for (local225 = 0; local225 < local221; local225++) {
										if (local170 >= Class212.anIntArray489[local225]) {
											Static225.anIntArray372[local63] = local225 + 2;
										}
									}
									Static341.anIntArray490[Static139.anInt3015++ & 0x1F] = local63;
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static232.aClass217_153) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2143();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2161();
									Static161.method3065(local63, local170);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static356.aClass217_208) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
									@Pc(3965) byte local3965 = Static180.aClass1_Sub7_Sub2_2.method2154();
									Static133.method2719(local3965, local170);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static220.aClass217_149 == Static293.aClass217_165) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2135();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2130();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2130();
									local221 = Static180.aClass1_Sub7_Sub2_2.method2112();
									if (Static85.method1808(local178)) {
										local3565 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local221);
										if (local3565 != null) {
											Static15.method343(false, local63 != local3565.anInt1496, local3565);
										}
										Static77.method1642(false, local63, local170, local221);
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static176.aClass217_197 == Static293.aClass217_165) {
									Static311.anInt5657 = Static180.aClass1_Sub7_Sub2_2.method2156();
									Static129.anInt2812 = Static180.aClass1_Sub7_Sub2_2.method2132();
									Static210.anInt4193 = Static180.aClass1_Sub7_Sub2_2.method2132();
									Static293.aClass217_165 = null;
									return true;
								} else if (Static85.aClass217_66 == Static293.aClass217_165) {
									Static184.method3479(Static230.aClass93_10);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static177.aClass217_125) {
									local973 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
									local174 = Static180.aClass1_Sub7_Sub2_2.method2109();
									local979 = local174;
									if (local973) {
										local979 = Static180.aClass1_Sub7_Sub2_2.method2109();
									}
									local989 = Static180.aClass1_Sub7_Sub2_2.method2161();
									local994 = Static180.aClass1_Sub7_Sub2_2.method2119();
									local1393 = Static180.aClass1_Sub7_Sub2_2.method2132();
									@Pc(4116) long local4116 = local994 + (local989 << 32);
									@Pc(4118) boolean local4118 = false;
									local1582 = 0;
									while (true) {
										if (local1582 >= 100) {
											if (local1393 <= 1) {
												if (Static212.aBoolean313 && !Static67.aBoolean111 || Static9.aBoolean12) {
													local4118 = true;
												} else if (Static17.method2116(local979)) {
													local4118 = true;
												}
											}
											break;
										}
										if (Static110.aLongArray6[local1582] == local4116) {
											local4118 = true;
											break;
										}
										local1582++;
									}
									if (!local4118 && Static94.anInt2085 == 0) {
										Static110.aLongArray6[Static153.anInt3178] = local4116;
										Static153.anInt3178 = (Static153.anInt3178 + 1) % 100;
										@Pc(4179) String local4179 = Static113.method2408(Static196.method3687(Static337.method5674(Static180.aClass1_Sub7_Sub2_2)));
										if (local1393 == 2) {
											Static134.method2729("<img=1>" + local174, null, local4179, "<img=1>" + local979, 7, 0, -1);
										} else if (local1393 == 1) {
											Static134.method2729("<img=0>" + local174, null, local4179, "<img=0>" + local979, 7, 0, -1);
										} else {
											Static134.method2729(local174, null, local4179, local979, 3, 0, -1);
										}
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static12.aClass217_6) {
									Static184.method3479(Static118.aClass93_11);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static165.aClass217_118 == Static293.aClass217_165) {
									Static184.method3479(Static289.aClass93_16);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static255.aClass217_169 == Static293.aClass217_165) {
									Static93.method4630(Static366.anInt7026, Static180.aClass1_Sub7_Sub2_2);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static212.aClass217_139 == Static293.aClass217_165) {
									local973 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
									local174 = Static180.aClass1_Sub7_Sub2_2.method2109();
									local979 = local174;
									if (local973) {
										local979 = Static180.aClass1_Sub7_Sub2_2.method2109();
									}
									local989 = Static180.aClass1_Sub7_Sub2_2.method2148();
									local994 = Static180.aClass1_Sub7_Sub2_2.method2161();
									local999 = Static180.aClass1_Sub7_Sub2_2.method2119();
									local1003 = Static180.aClass1_Sub7_Sub2_2.method2132();
									local1547 = Static180.aClass1_Sub7_Sub2_2.method2161();
									@Pc(4333) long local4333 = (local994 << 32) + local999;
									@Pc(4335) boolean local4335 = false;
									@Pc(4337) int local4337 = 0;
									while (true) {
										if (local4337 >= 100) {
											if (local1003 <= 1 && Static17.method2116(local979)) {
												local4335 = true;
											}
											break;
										}
										if (local4333 == Static110.aLongArray6[local4337]) {
											local4335 = true;
											break;
										}
										local4337++;
									}
									if (!local4335 && Static94.anInt2085 == 0) {
										Static110.aLongArray6[Static153.anInt3178] = local4333;
										Static153.anInt3178 = (Static153.anInt3178 + 1) % 100;
										local1636 = Static113.method2414(local1547).method3418(Static180.aClass1_Sub7_Sub2_2);
										if (local1003 == 2) {
											Static134.method2729("<img=1>" + local174, Static157.method2978(local989), local1636, "<img=1>" + local979, 20, 0, local1547);
										} else if (local1003 == 1) {
											Static134.method2729("<img=0>" + local174, Static157.method2978(local989), local1636, "<img=0>" + local979, 20, 0, local1547);
										} else {
											Static134.method2729(local174, Static157.method2978(local989), local1636, local979, 20, 0, local1547);
										}
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static155.aClass217_108 == Static293.aClass217_165) {
									Static184.method3479(Static249.aClass93_2);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static163.aClass217_116 == Static293.aClass217_165) {
									Static158.anInt3254 = Static180.aClass1_Sub7_Sub2_2.method2132();
									Static293.aClass217_165 = null;
									Static264.anInt5206 = Static356.anInt6822;
									return true;
								} else if (Static361.aClass217_213 == Static293.aClass217_165) {
									local973 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
									local174 = Static180.aClass1_Sub7_Sub2_2.method2109();
									local979 = local174;
									if (local973) {
										local979 = Static180.aClass1_Sub7_Sub2_2.method2109();
									}
									local989 = Static180.aClass1_Sub7_Sub2_2.method2161();
									local994 = Static180.aClass1_Sub7_Sub2_2.method2119();
									local1393 = Static180.aClass1_Sub7_Sub2_2.method2132();
									local2455 = Static180.aClass1_Sub7_Sub2_2.method2161();
									@Pc(4536) long local4536 = (local989 << 32) + local994;
									@Pc(4538) boolean local4538 = false;
									@Pc(4540) int local4540 = 0;
									while (true) {
										if (local4540 >= 100) {
											if (local1393 <= 1 && Static17.method2116(local979)) {
												local4538 = true;
											}
											break;
										}
										if (local4536 == Static110.aLongArray6[local4540]) {
											local4538 = true;
											break;
										}
										local4540++;
									}
									if (!local4538 && Static94.anInt2085 == 0) {
										Static110.aLongArray6[Static153.anInt3178] = local4536;
										Static153.anInt3178 = (Static153.anInt3178 + 1) % 100;
										local1600 = Static113.method2414(local2455).method3418(Static180.aClass1_Sub7_Sub2_2);
										if (local1393 == 2) {
											Static134.method2729("<img=1>" + local174, null, local1600, "<img=1>" + local979, 18, 0, local2455);
										} else if (local1393 == 1) {
											Static134.method2729("<img=0>" + local174, null, local1600, "<img=0>" + local979, 18, 0, local2455);
										} else {
											Static134.method2729(local174, null, local1600, local979, 18, 0, local2455);
										}
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static132.aClass217_94) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2132();
									if (Static180.aClass1_Sub7_Sub2_2.method2132() == 0) {
										Static277.aClass104Array1[local170] = new Class104();
									} else {
										Static180.aClass1_Sub7_Sub2_2.anInt2219--;
										Static277.aClass104Array1[local170] = new Class104(Static180.aClass1_Sub7_Sub2_2);
									}
									Static46.anInt1183 = Static356.anInt6822;
									Static293.aClass217_165 = null;
									return true;
								} else if (Static156.aClass217_109 == Static293.aClass217_165) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2132();
									local63 = local170 >> 5;
									local178 = local170 & 0x1F;
									if (local178 == 0) {
										Static60.aClass101Array1[local63] = null;
										Static293.aClass217_165 = null;
										return true;
									}
									@Pc(4731) Class101 local4731 = new Class101();
									local4731.anInt3096 = local178;
									local4731.anInt3104 = Static180.aClass1_Sub7_Sub2_2.method2132();
									if (local4731.anInt3104 >= 0 && local4731.anInt3104 < Static225.aClass4Array13.length) {
										if (local4731.anInt3096 == 1 || local4731.anInt3096 == 10) {
											local4731.anInt3103 = Static180.aClass1_Sub7_Sub2_2.method2161();
											Static180.aClass1_Sub7_Sub2_2.anInt2219 += 6;
										} else if (local4731.anInt3096 >= 2 && local4731.anInt3096 <= 6) {
											if (local4731.anInt3096 == 2) {
												local4731.anInt3092 = 64;
												local4731.anInt3099 = 64;
											}
											if (local4731.anInt3096 == 3) {
												local4731.anInt3099 = 0;
												local4731.anInt3092 = 64;
											}
											if (local4731.anInt3096 == 4) {
												local4731.anInt3092 = 64;
												local4731.anInt3099 = 128;
											}
											if (local4731.anInt3096 == 5) {
												local4731.anInt3092 = 0;
												local4731.anInt3099 = 64;
											}
											if (local4731.anInt3096 == 6) {
												local4731.anInt3092 = 128;
												local4731.anInt3099 = 64;
											}
											local4731.anInt3096 = 2;
											local4731.anInt3106 = Static180.aClass1_Sub7_Sub2_2.method2132();
											local4731.anInt3098 = Static180.aClass1_Sub7_Sub2_2.method2161();
											local4731.anInt3094 = Static180.aClass1_Sub7_Sub2_2.method2161();
											local4731.anInt3101 = Static180.aClass1_Sub7_Sub2_2.method2132();
											local4731.anInt3107 = Static180.aClass1_Sub7_Sub2_2.method2161();
										}
										local4731.anInt3095 = Static180.aClass1_Sub7_Sub2_2.method2161();
										if (local4731.anInt3095 == 65535) {
											local4731.anInt3095 = -1;
										}
										Static60.aClass101Array1[local63] = local4731;
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static144.aClass217_101) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2130();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2130();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2146();
									local221 = Static180.aClass1_Sub7_Sub2_2.method2123();
									local225 = Static180.aClass1_Sub7_Sub2_2.method2139();
									if (Static85.method1808(local63)) {
										Static163.method3097(local225, local170, local221, local178);
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static165.aClass217_117 == Static293.aClass217_165) {
									Static338.anInt6437 = Static180.aClass1_Sub7_Sub2_2.method2132();
									Static42.anInt1017 = Static180.aClass1_Sub7_Sub2_2.method2132();
									Static35.anInt921 = Static180.aClass1_Sub7_Sub2_2.method2132();
									while (Static366.anInt7026 > Static180.aClass1_Sub7_Sub2_2.anInt2219) {
										@Pc(4953) Class93 local4953 = Static12.method334()[Static180.aClass1_Sub7_Sub2_2.method2132()];
										Static184.method3479(local4953);
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static43.aClass217_175) {
									Static42.anInt1017 = Static180.aClass1_Sub7_Sub2_2.method2113();
									Static35.anInt921 = Static180.aClass1_Sub7_Sub2_2.method2135();
									Static338.anInt6437 = Static180.aClass1_Sub7_Sub2_2.method2156();
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static267.aClass217_172) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2132();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2132();
									local221 = Static180.aClass1_Sub7_Sub2_2.method2161();
									local225 = Static180.aClass1_Sub7_Sub2_2.method2132();
									local231 = Static180.aClass1_Sub7_Sub2_2.method2132();
									if (Static85.method1808(local170)) {
										Static225.method4174(local63, local225, true, local178, local221, local231);
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static78.aClass217_62 == Static293.aClass217_165) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2113();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2161();
									local577 = (local170 & 0x1) == 1;
									Static219.method4065(local63, local577);
									Static314.anIntArray470[Static196.anInt3969++ & 0x1F] = local63;
									Static293.aClass217_165 = null;
									return true;
								} else if (Static257.aClass217_43 == Static293.aClass217_165) {
									Static351.anInt2686 = Static180.aClass1_Sub7_Sub2_2.method2141();
									Static293.aClass217_165 = null;
									Static264.anInt5206 = Static356.anInt6822;
									return true;
								} else if (Static293.aClass217_165 == Static142.aClass217_99) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2161();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2132();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2132();
									local221 = Static180.aClass1_Sub7_Sub2_2.method2161();
									local225 = Static180.aClass1_Sub7_Sub2_2.method2132();
									local231 = Static180.aClass1_Sub7_Sub2_2.method2132();
									if (Static85.method1808(local170)) {
										Static193.method3627(local221, local63, local231, local178, local225);
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static184.aClass217_130 == Static293.aClass217_165) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2132();
									local63 = local170 >> 2;
									local178 = local170 & 0x3;
									local221 = Static253.anIntArray397[local63];
									local225 = Static180.aClass1_Sub7_Sub2_2.method2130();
									if (local225 == 65535) {
										local225 = -1;
									}
									local231 = Static180.aClass1_Sub7_Sub2_2.method2143();
									local2564 = local231 >> 28 & 0x3;
									local1393 = local231 >> 14 & 0x3FFF;
									@Pc(5175) int local5175 = local1393 - Static50.anInt1271;
									local2455 = local231 & 0x3FFF;
									local2455 -= Static299.anInt4036;
									Static56.method1387(local2564, local221, local2455, local63, local178, local225, local5175);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static182.aClass217_126 == Static293.aClass217_165) {
									local861 = Static180.aClass1_Sub7_Sub2_2.method2109();
									local577 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
									if (local577) {
										local174 = Static180.aClass1_Sub7_Sub2_2.method2109();
									} else {
										local174 = local861;
									}
									local221 = Static180.aClass1_Sub7_Sub2_2.method2161();
									@Pc(5234) byte local5234 = Static180.aClass1_Sub7_Sub2_2.method2122();
									@Pc(5236) boolean local5236 = false;
									if (local5234 == -128) {
										local5236 = true;
									}
									if (local5236) {
										if (Static135.anInt2903 == 0) {
											Static293.aClass217_165 = null;
											return true;
										}
										for (local2564 = 0; Static135.anInt2903 > local2564 && (!Static365.aClass126Array1[local2564].aString36.equals(local174) || local221 != Static365.aClass126Array1[local2564].anInt3765); local2564++) {
										}
										if (local2564 < Static135.anInt2903) {
											while (local2564 < Static135.anInt2903 - 1) {
												Static365.aClass126Array1[local2564] = Static365.aClass126Array1[local2564 + 1];
												local2564++;
											}
											Static135.anInt2903--;
											Static365.aClass126Array1[Static135.anInt2903] = null;
										}
									} else {
										@Pc(5249) String local5249 = Static180.aClass1_Sub7_Sub2_2.method2109();
										local2480 = new Class126();
										local2480.aString36 = local174;
										local2480.aString38 = local861;
										local2480.aString35 = Static267.method4817(local2480.aString36);
										local2480.anInt3765 = local221;
										local2480.aString37 = local5249;
										local2480.aByte28 = local5234;
										for (local2455 = Static135.anInt2903 - 1; local2455 >= 0; local2455--) {
											local1003 = Static365.aClass126Array1[local2455].aString35.compareTo(local2480.aString35);
											if (local1003 == 0) {
												Static365.aClass126Array1[local2455].anInt3765 = local221;
												Static365.aClass126Array1[local2455].aByte28 = local5234;
												Static365.aClass126Array1[local2455].aString37 = local5249;
												if (local174.equals(Static191.aClass11_Sub2_Sub6_Sub1_4.aString63)) {
													Static222.aByte34 = local5234;
												}
												Static55.anInt1396 = Static356.anInt6822;
												Static293.aClass217_165 = null;
												return true;
											}
											if (local1003 < 0) {
												break;
											}
										}
										if (Static365.aClass126Array1.length <= Static135.anInt2903) {
											Static293.aClass217_165 = null;
											return true;
										}
										for (local1003 = Static135.anInt2903 - 1; local1003 > local2455; local1003--) {
											Static365.aClass126Array1[local1003 + 1] = Static365.aClass126Array1[local1003];
										}
										if (Static135.anInt2903 == 0) {
											Static365.aClass126Array1 = new Class126[100];
										}
										Static365.aClass126Array1[local2455 + 1] = local2480;
										Static135.anInt2903++;
										if (local174.equals(Static191.aClass11_Sub2_Sub6_Sub1_4.aString63)) {
											Static222.aByte34 = local5234;
										}
									}
									Static293.aClass217_165 = null;
									Static55.anInt1396 = Static356.anInt6822;
									return true;
								} else if (Static293.aClass217_165 == Static230.aClass217_74) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2123();
									if (local170 == 65535) {
										local170 = -1;
									}
									local63 = Static180.aClass1_Sub7_Sub2_2.method2123();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2146();
									if (Static85.method1808(local63)) {
										Static362.method5987(1, -1, local170, local178);
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static146.aClass217_209) {
									@Pc(5497) byte local5497 = Static180.aClass1_Sub7_Sub2_2.method2117();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2130();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2139();
									if (Static85.method1808(local63)) {
										Static300.method5231(local178, local5497);
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static297.aClass217_185) {
									Static294.method5141();
									Static293.aClass217_165 = null;
									return false;
								} else if (Static42.aClass217_37 == Static293.aClass217_165) {
									Static184.method3479(Static270.aClass93_15);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static87.aClass217_70) {
									Static133.anInt2883 = Static180.aClass1_Sub7_Sub2_2.method2161() * 30;
									Static293.aClass217_165 = null;
									Static264.anInt5206 = Static356.anInt6822;
									return true;
								} else if (Static293.aClass217_165 == Static253.aClass217_168) {
									Static184.method3479(Static25.aClass93_7);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static91.aClass217_219 == Static293.aClass217_165) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2139();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2161();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2123();
									if (Static85.method1808(local63)) {
										Static273.method4878(local170, local178);
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static153.aClass217_107 == Static293.aClass217_165) {
									Static184.method3479(Static306.aClass93_18);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static85.aClass217_68 == Static293.aClass217_165) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2112();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2123();
									local178 = Static180.aClass1_Sub7_Sub2_2.method2161();
									if (Static85.method1808(local63)) {
										Static116.method2434(local170, local178);
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static295.aClass217_183) {
									local170 = Static180.aClass1_Sub7_Sub2_2.method2132();
									local63 = Static180.aClass1_Sub7_Sub2_2.method2135();
									if (local170 == 255) {
										local63 = -1;
										local170 = -1;
									}
									Static282.method5026(local63, local170);
									Static293.aClass217_165 = null;
									return true;
								} else if (Static293.aClass217_165 == Static1.aClass217_1) {
									if (Static366.anInt7026 == 0) {
										Static325.aString48 = Static166.aClass106_121.method2927(Static254.anInt5172);
									} else {
										Static325.aString48 = Static180.aClass1_Sub7_Sub2_2.method2109();
									}
									Static293.aClass217_165 = null;
									return true;
								} else if (Static112.aClass217_86 == Static293.aClass217_165) {
									Static294.anInt5663 = Static180.aClass1_Sub7_Sub2_2.method2132();
									Static293.aClass217_165 = null;
									return true;
								} else {
									Static119.method2541("T1 - " + (Static293.aClass217_165 == null ? -1 : Static293.aClass217_165.method5768()) + "," + (Static341.aClass217_202 == null ? -1 : Static341.aClass217_202.method5768()) + "," + (Static197.aClass217_134 == null ? -1 : Static197.aClass217_134.method5768()) + " - " + Static366.anInt7026, null);
									Static294.method5141();
									return true;
								}
							}
						}
					}
				}
			}
		}
	}
}
