import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!it", name = "Y", descriptor = "Lclient!cu;")
	public static final Class54 aClass54_16 = new Class54(2, 7);

	@OriginalMember(owner = "client!it", name = "Z", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_197 = new Class305(102, 2);

	@OriginalMember(owner = "client!it", name = "ab", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_63 = new Class252(32, 7);

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)Z")
	public static boolean method3917() throws IOException {
		if (Static200.aClass134_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static43.aClass305_340 == null) {
			if (Static183.aBoolean312) {
				if (!Static200.aClass134_2.method8118(1)) {
					return false;
				}
				Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 1, 0);
				Static183.aBoolean312 = false;
				Static103.anInt2200++;
				Static508.anInt8899 = 0;
			}
			Static352.aClass1_Sub17_Sub2_2.anInt4872 = 0;
			if (Static352.aClass1_Sub17_Sub2_2.method4513()) {
				if (!Static200.aClass134_2.method8118(1)) {
					return false;
				}
				Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 1, 1);
				Static103.anInt2200++;
				Static508.anInt8899 = 0;
			}
			Static183.aBoolean312 = true;
			@Pc(69) Class305[] local69 = Static36.method1110();
			local73 = Static352.aClass1_Sub17_Sub2_2.method4509();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static352.aClass1_Sub17_Sub2_2.anInt4872);
			}
			Static43.aClass305_340 = local69[local73];
			Static494.anInt8660 = Static43.aClass305_340.anInt9059;
		}
		if (Static494.anInt8660 == -1) {
			if (!Static200.aClass134_2.method8118(1)) {
				return false;
			}
			Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 1, 0);
			Static494.anInt8660 = Static352.aClass1_Sub17_Sub2_2.aByteArray58[0] & 0xFF;
			Static508.anInt8899 = 0;
			Static103.anInt2200++;
		}
		if (Static494.anInt8660 == -2) {
			if (!Static200.aClass134_2.method8118(2)) {
				return false;
			}
			Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 2, 0);
			Static352.aClass1_Sub17_Sub2_2.anInt4872 = 0;
			Static494.anInt8660 = Static352.aClass1_Sub17_Sub2_2.method4494();
			Static508.anInt8899 = 0;
			Static103.anInt2200 += 2;
		}
		if (Static494.anInt8660 > 0) {
			if (!Static200.aClass134_2.method8118(Static494.anInt8660)) {
				return false;
			}
			Static352.aClass1_Sub17_Sub2_2.anInt4872 = 0;
			Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, Static494.anInt8660, 0);
			Static508.anInt8899 = 0;
			Static103.anInt2200 += Static494.anInt8660;
		}
		Static381.aClass305_360 = Static517.aClass305_447;
		Static517.aClass305_447 = Static350.aClass305_326;
		Static350.aClass305_326 = Static43.aClass305_340;
		@Pc(204) int local204;
		if (Static367.aClass305_344 == Static43.aClass305_340) {
			for (local204 = 0; local204 < Static511.aClass20_Sub1_Sub1_Sub1Array1.length; local204++) {
				if (Static511.aClass20_Sub1_Sub1_Sub1Array1[local204] != null) {
					Static511.aClass20_Sub1_Sub1_Sub1Array1[local204].anInt9022 = -1;
				}
			}
			for (local73 = 0; local73 < Static342.anInt6322; local73++) {
				Static35.aClass1_Sub41Array1[local73].aClass20_Sub1_Sub1_Sub2_2.anInt9022 = -1;
			}
			Static43.aClass305_340 = null;
			return true;
		}
		@Pc(266) String local266;
		@Pc(280) String local280;
		@Pc(284) String local284;
		@Pc(294) int local294;
		@Pc(270) String local270;
		if (Static43.aClass305_340 == Static373.aClass305_349) {
			local204 = Static352.aClass1_Sub17_Sub2_2.method4487();
			@Pc(262) boolean local262 = (local204 & 0x1) == 1;
			local266 = Static352.aClass1_Sub17_Sub2_2.method4491();
			local270 = Static352.aClass1_Sub17_Sub2_2.method4491();
			if (local270.equals("")) {
				local270 = local266;
			}
			local280 = Static352.aClass1_Sub17_Sub2_2.method4491();
			local284 = Static352.aClass1_Sub17_Sub2_2.method4491();
			if (local284.equals("")) {
				local284 = local280;
			}
			if (local262) {
				for (local294 = 0; local294 < Static508.anInt8897; local294++) {
					if (Static322.aStringArray29[local294].equals(local284)) {
						Static537.aStringArray44[local294] = local266;
						Static322.aStringArray29[local294] = local270;
						Static515.aStringArray38[local294] = local280;
						Static233.aStringArray24[local294] = local284;
						break;
					}
				}
			} else {
				Static537.aStringArray44[Static508.anInt8897] = local266;
				Static322.aStringArray29[Static508.anInt8897] = local270;
				Static515.aStringArray38[Static508.anInt8897] = local280;
				Static233.aStringArray24[Static508.anInt8897] = local284;
				Static214.aBooleanArray13[Static508.anInt8897] = (local204 & 0x2) == 2;
				Static508.anInt8897++;
			}
			Static82.anInt1887 = Static209.anInt4108;
			Static43.aClass305_340 = null;
			return true;
		}
		@Pc(385) boolean local385;
		if (Static43.aClass305_340 == Static131.aClass305_120) {
			local204 = Static352.aClass1_Sub17_Sub2_2.method4467();
			local73 = Static352.aClass1_Sub17_Sub2_2.method4472();
			local385 = (local204 & 0x1) == 1;
			Static319.method5471(local385, local73);
			Static512.anIntArray785[Static131.anInt2627++ & 0x1F] = local73;
			Static43.aClass305_340 = null;
			return true;
		}
		@Pc(435) int local435;
		@Pc(425) String local425;
		@Pc(525) String local525;
		@Pc(529) Class181 local529;
		@Pc(410) String local410;
		@Pc(554) int local554;
		@Pc(564) int local564;
		@Pc(441) boolean local441;
		if (Static142.aClass305_126 == Static43.aClass305_340) {
			local410 = Static352.aClass1_Sub17_Sub2_2.method4491();
			local385 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
			if (local385) {
				local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
			} else {
				local425 = local410;
			}
			local435 = Static352.aClass1_Sub17_Sub2_2.method4494();
			@Pc(439) byte local439 = Static352.aClass1_Sub17_Sub2_2.method4482();
			local441 = false;
			if (local439 == -128) {
				local441 = true;
			}
			if (local441) {
				if (Static246.anInt4721 == 0) {
					Static43.aClass305_340 = null;
					return true;
				}
				for (local294 = 0; local294 < Static246.anInt4721 && (!Static161.aClass181Array1[local294].aString131.equals(local425) || Static161.aClass181Array1[local294].anInt5549 != local435); local294++) {
				}
				if (Static246.anInt4721 > local294) {
					while (Static246.anInt4721 - 1 > local294) {
						Static161.aClass181Array1[local294] = Static161.aClass181Array1[local294 + 1];
						local294++;
					}
					Static246.anInt4721--;
					Static161.aClass181Array1[Static246.anInt4721] = null;
				}
			} else {
				local525 = Static352.aClass1_Sub17_Sub2_2.method4491();
				local529 = new Class181();
				local529.aString128 = local410;
				local529.aString131 = local425;
				local529.aString129 = Static442.method6847(local529.aString131);
				local529.aString127 = local525;
				local529.aByte69 = local439;
				local529.anInt5549 = local435;
				for (local554 = Static246.anInt4721 - 1; local554 >= 0; local554--) {
					local564 = Static161.aClass181Array1[local554].aString129.compareTo(local529.aString129);
					if (local564 == 0) {
						Static161.aClass181Array1[local554].anInt5549 = local435;
						Static161.aClass181Array1[local554].aByte69 = local439;
						Static161.aClass181Array1[local554].aString127 = local525;
						if (local425.equals(Static107.aClass20_Sub1_Sub1_Sub1_1.aString13)) {
							Static104.aByte113 = local439;
						}
						Static223.anInt4338 = Static209.anInt4108;
						Static43.aClass305_340 = null;
						return true;
					}
					if (local564 < 0) {
						break;
					}
				}
				if (Static161.aClass181Array1.length <= Static246.anInt4721) {
					Static43.aClass305_340 = null;
					return true;
				}
				for (local564 = Static246.anInt4721 - 1; local564 > local554; local564--) {
					Static161.aClass181Array1[local564 + 1] = Static161.aClass181Array1[local564];
				}
				if (Static246.anInt4721 == 0) {
					Static161.aClass181Array1 = new Class181[100];
				}
				Static161.aClass181Array1[local554 + 1] = local529;
				Static246.anInt4721++;
				if (local425.equals(Static107.aClass20_Sub1_Sub1_Sub1_1.aString13)) {
					Static104.aByte113 = local439;
				}
			}
			Static223.anInt4338 = Static209.anInt4108;
			Static43.aClass305_340 = null;
			return true;
		} else if (Static43.aClass305_340 == Static482.aClass305_420) {
			local204 = Static352.aClass1_Sub17_Sub2_2.method4502();
			@Pc(673) byte local673 = Static352.aClass1_Sub17_Sub2_2.method4468();
			Static417.aClass10_1.method524(local204, local673);
			Static43.aClass305_340 = null;
			return true;
		} else if (Static43.aClass305_340 == Static522.aClass305_448) {
			Static301.method5328(Static352.aClass1_Sub17_Sub2_2, Static494.anInt8660, Static473.aClass229_14);
			Static43.aClass305_340 = null;
			return true;
		} else {
			@Pc(714) int local714;
			if (Static43.aClass305_340 == Static330.aClass305_310) {
				local204 = Static352.aClass1_Sub17_Sub2_2.method4502();
				if (local204 == 65535) {
					local204 = -1;
				}
				local73 = Static352.aClass1_Sub17_Sub2_2.method4502();
				local714 = Static352.aClass1_Sub17_Sub2_2.method4481();
				if (Static465.method7068(local73)) {
					Static82.method1816(local714, 1, local204, -1);
				}
				Static43.aClass305_340 = null;
				return true;
			} else if (Static543.aClass305_467 == Static43.aClass305_340) {
				if (Static189.aFrame1 != null) {
					Static487.method7514(Static286.aClass1_Sub15_Sub1_1.anInt7031, -1, -1, false);
				}
				@Pc(743) byte[] local743 = new byte[Static494.anInt8660];
				Static352.aClass1_Sub17_Sub2_2.method4516(Static494.anInt8660, local743);
				local425 = Static332.method5654(local743, 0, Static494.anInt8660);
				Static427.method6646(Static449.anInt7876 == 1, Static473.aClass229_14, local425, true);
				Static43.aClass305_340 = null;
				return true;
			} else {
				@Pc(795) int local795;
				@Pc(799) int local799;
				if (Static363.aClass305_339 == Static43.aClass305_340) {
					local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
					local73 = Static352.aClass1_Sub17_Sub2_2.method4487();
					local714 = Static352.aClass1_Sub17_Sub2_2.method4487();
					local435 = Static352.aClass1_Sub17_Sub2_2.method4487();
					local795 = Static352.aClass1_Sub17_Sub2_2.method4487();
					local799 = Static352.aClass1_Sub17_Sub2_2.method4494();
					if (Static465.method7068(local204)) {
						Static174.aBooleanArray6[local73] = true;
						Static499.anIntArray762[local73] = local714;
						Static412.anIntArray698[local73] = local435;
						Static174.anIntArray290[local73] = local795;
						Static62.anIntArray100[local73] = local799;
					}
					Static43.aClass305_340 = null;
					return true;
				} else if (Static4.aClass305_5 == Static43.aClass305_340) {
					local204 = Static352.aClass1_Sub17_Sub2_2.method4502();
					local73 = Static352.aClass1_Sub17_Sub2_2.method4461();
					local714 = Static352.aClass1_Sub17_Sub2_2.method4444();
					if (Static465.method7068(local73)) {
						Static278.method4876(local204, local714);
					}
					Static43.aClass305_340 = null;
					return true;
				} else if (Static348.aClass305_323 == Static43.aClass305_340) {
					local204 = Static352.aClass1_Sub17_Sub2_2.method4461();
					if (local204 == 65535) {
						local204 = -1;
					}
					local73 = Static352.aClass1_Sub17_Sub2_2.method4472();
					local714 = Static352.aClass1_Sub17_Sub2_2.method4458();
					if (Static465.method7068(local73)) {
						Static244.method4326(local714, local204);
					}
					Static43.aClass305_340 = null;
					return true;
				} else if (Static282.aClass305_266 == Static43.aClass305_340) {
					Static508.anInt8897 = Static352.aClass1_Sub17_Sub2_2.method4487();
					for (local204 = 0; local204 < Static508.anInt8897; local204++) {
						Static537.aStringArray44[local204] = Static352.aClass1_Sub17_Sub2_2.method4491();
						Static322.aStringArray29[local204] = Static352.aClass1_Sub17_Sub2_2.method4491();
						if (Static322.aStringArray29[local204].equals("")) {
							Static322.aStringArray29[local204] = Static537.aStringArray44[local204];
						}
						Static515.aStringArray38[local204] = Static352.aClass1_Sub17_Sub2_2.method4491();
						Static233.aStringArray24[local204] = Static352.aClass1_Sub17_Sub2_2.method4491();
						if (Static233.aStringArray24[local204].equals("")) {
							Static233.aStringArray24[local204] = Static515.aStringArray38[local204];
						}
						Static214.aBooleanArray13[local204] = false;
					}
					Static43.aClass305_340 = null;
					Static82.anInt1887 = Static209.anInt4108;
					return true;
				} else {
					@Pc(1003) int local1003;
					@Pc(1013) int local1013;
					@Pc(977) boolean local977;
					@Pc(994) long local994;
					@Pc(999) long local999;
					if (Static70.aClass305_73 == Static43.aClass305_340) {
						local977 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
						local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
						local266 = local425;
						if (local977) {
							local266 = Static352.aClass1_Sub17_Sub2_2.method4491();
						}
						local994 = Static352.aClass1_Sub17_Sub2_2.method4494();
						local999 = Static352.aClass1_Sub17_Sub2_2.method4486();
						local1003 = Static352.aClass1_Sub17_Sub2_2.method4487();
						@Pc(1009) long local1009 = local999 + (local994 << 32);
						@Pc(1011) boolean local1011 = false;
						local1013 = 0;
						while (true) {
							if (local1013 >= 100) {
								if (local1003 <= 1) {
									if (Static498.aBoolean656 && !Static353.aBoolean479 || Static394.aBoolean512) {
										local1011 = true;
									} else if (Static505.method5588(local266)) {
										local1011 = true;
									}
								}
								break;
							}
							if (Static537.aLongArray17[local1013] == local1009) {
								local1011 = true;
								break;
							}
							local1013++;
						}
						if (!local1011 && Static280.anInt5322 == 0) {
							Static537.aLongArray17[Static499.anInt8738] = local1009;
							Static499.anInt8738 = (Static499.anInt8738 + 1) % 100;
							@Pc(1068) String local1068 = Static22.method606(Static229.method4131(Static352.aClass1_Sub17_Sub2_2));
							if (local1003 == 2) {
								Static313.method5432(local1068, 0, null, "<img=1>" + local425, 7, "<img=1>" + local266, -1);
							} else if (local1003 == 1) {
								Static313.method5432(local1068, 0, null, "<img=0>" + local425, 7, "<img=0>" + local266, -1);
							} else {
								Static313.method5432(local1068, 0, null, local425, 3, local266, -1);
							}
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static191.aClass305_454 == Static43.aClass305_340) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4502();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4471();
						Static417.aClass10_1.method524(local204, local73);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static367.aClass305_343) {
						if (Static328.anInt6167 != -1) {
							Static120.method7553(Static328.anInt6167, 0);
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static208.aClass305_190 == Static43.aClass305_340) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4502();
						if (local204 == 65535) {
							local204 = -1;
						}
						local73 = Static352.aClass1_Sub17_Sub2_2.method4461();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4471();
						local435 = Static352.aClass1_Sub17_Sub2_2.method4481();
						if (Static465.method7068(local73)) {
							Static154.method2827(local435, local714, local204);
							@Pc(1208) Class180 local1208 = Static181.aClass316_1.method8107(local204);
							Static472.method7363(local1208.anInt5425, local1208.anInt5436, local1208.anInt5422, local714);
							Static319.method5469(local1208.anInt5445, local1208.anInt5447, local1208.anInt5402, local714);
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static542.aClass305_466) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4487();
						local385 = (local73 & 0x1) == 1;
						Static192.method545(local385, local204);
						local435 = Static352.aClass1_Sub17_Sub2_2.method4494();
						for (local795 = 0; local795 < local435; local795++) {
							local799 = Static352.aClass1_Sub17_Sub2_2.method4472();
							local294 = Static352.aClass1_Sub17_Sub2_2.method4449();
							if (local294 == 255) {
								local294 = Static352.aClass1_Sub17_Sub2_2.method4444();
							}
							Static307.method5379(local294, local795, local204, local799 - 1, local385);
						}
						Static512.anIntArray785[Static131.anInt2627++ & 0x1F] = local204;
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static226.aClass305_210) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4442();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4471();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4442();
						Static451.anIntArray730[local204] = local73;
						Static347.anIntArray621[local204] = local714;
						Static75.anIntArray121[local204] = 1;
						local435 = Static312.anIntArray465[local204] - 1;
						for (local795 = 0; local795 < local435; local795++) {
							if (Class193.anIntArray464[local795] <= local73) {
								Static75.anIntArray121[local204] = local795 + 2;
							}
						}
						Static513.anIntArray788[Static275.anInt5269++ & 0x1F] = local204;
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static385.aClass305_361) {
						if (Static275.method4864(Static186.anInt3863)) {
							Static396.anInt6970 = (int) ((float) Static352.aClass1_Sub17_Sub2_2.method4494() * 2.5F);
						} else {
							Static396.anInt6970 = Static352.aClass1_Sub17_Sub2_2.method4494() * 30;
						}
						Static448.anInt7840 = Static209.anInt4108;
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static479.aClass305_419) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4471();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4494();
						if (Static465.method7068(local73)) {
							Static82.method1816(local204, 5, Static16.anInt9513, 0);
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static381.aClass305_359) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4461();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4502();
						if (local73 == 65535) {
							local73 = -1;
						}
						local714 = Static352.aClass1_Sub17_Sub2_2.method4471();
						if (Static465.method7068(local204)) {
							Static82.method1816(local714, 2, local73, -1);
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static361.aClass305_335 == Static43.aClass305_340) {
						Static392.aClass121_4 = Static262.method4709(Static352.aClass1_Sub17_Sub2_2.method4487());
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static78.aClass305_80) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4481();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4494();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4494();
						if (Static465.method7068(local714)) {
							Static288.method5069(local204, local73);
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static48.aClass305_51) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4461();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4472();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4472();
						local435 = Static352.aClass1_Sub17_Sub2_2.method4458();
						if (Static465.method7068(local204)) {
							Static485.method6304((local714 << 16) + local73, local435);
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static190.aClass305_172 == Static43.aClass305_340) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4449();
						local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4449();
						local435 = Static352.aClass1_Sub17_Sub2_2.method4502();
						if (local435 == 65535) {
							local435 = -1;
						}
						if (local204 >= 1 && local204 <= 8) {
							if (local425.equalsIgnoreCase("null")) {
								local425 = null;
							}
							Static74.aStringArray8[local204 - 1] = local425;
							Static200.anIntArray315[local204 - 1] = local435;
							Static142.aBooleanArray5[local204 - 1] = local714 == 0;
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static541.aClass305_463) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4481();
						Static399.aClass311_7 = Static473.aClass229_14.method6075(local204);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static438.aClass305_390) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4502();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4461();
						@Pc(1639) byte local1639 = Static352.aClass1_Sub17_Sub2_2.method4468();
						if (Static465.method7068(local204)) {
							Static278.method4876(local73, local1639);
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static317.aClass305_297) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4487();
						if (Static352.aClass1_Sub17_Sub2_2.method4487() == 0) {
							Static538.aClass42Array1[local204] = new Class42();
						} else {
							Static352.aClass1_Sub17_Sub2_2.anInt4872--;
							Static538.aClass42Array1[local204] = new Class42(Static352.aClass1_Sub17_Sub2_2);
						}
						Static43.aClass305_340 = null;
						Static26.anInt752 = Static209.anInt4108;
						return true;
					} else if (Static43.aClass305_340 == Static453.aClass305_397) {
						Static31.method7265(Static108.aClass54_8);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static274.aClass305_261) {
						local410 = Static352.aClass1_Sub17_Sub2_2.method4491();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4494();
						local266 = Static221.aClass41_1.method1404(local73).method5424(Static352.aClass1_Sub17_Sub2_2);
						Static313.method5432(local266, 0, null, local410, 19, local410, local73);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static212.aClass305_198 == Static43.aClass305_340) {
						Static406.method6459(false);
						Static43.aClass305_340 = null;
						return false;
					} else if (Static43.aClass305_340 == Static473.aClass305_413) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4461();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4472();
						local266 = Static352.aClass1_Sub17_Sub2_2.method4491();
						if (Static465.method7068(local204)) {
							Static394.method6255(local266, local73);
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static84.aClass305_84) {
						Static31.method7265(Static83.aClass54_28);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static248.aClass305_235) {
						local977 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
						local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
						local266 = local425;
						if (local977) {
							local266 = Static352.aClass1_Sub17_Sub2_2.method4491();
						}
						local435 = Static352.aClass1_Sub17_Sub2_2.method4487();
						@Pc(1813) boolean local1813 = false;
						if (local435 <= 1) {
							if (Static498.aBoolean656 && !Static353.aBoolean479 || Static394.aBoolean512) {
								local1813 = true;
							} else if (local435 <= 1 && Static505.method5588(local266)) {
								local1813 = true;
							}
						}
						if (!local1813 && Static280.anInt5322 == 0) {
							local284 = Static22.method606(Static229.method4131(Static352.aClass1_Sub17_Sub2_2));
							if (local435 == 2) {
								Static313.method5432(local284, 0, null, "<img=1>" + local425, 24, "<img=1>" + local266, -1);
							} else if (local435 == 1) {
								Static313.method5432(local284, 0, null, "<img=0>" + local425, 24, "<img=0>" + local266, -1);
							} else {
								Static313.method5432(local284, 0, null, local425, 24, local266, -1);
							}
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static81.aClass305_83) {
						Static31.method7265(Static310.aClass54_23);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static89.aClass305_89 == Static43.aClass305_340) {
						Static31.method7265(Static480.aClass54_27);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static257.aClass305_245 == Static43.aClass305_340) {
						Static172.anInt3437 = Static352.aClass1_Sub17_Sub2_2.method4498();
						Static498.aBoolean656 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
						Static43.aClass305_340 = null;
						return true;
					} else if (Static408.aClass305_377 == Static43.aClass305_340) {
						Static227.method4089();
						Static43.aClass305_340 = null;
						return false;
					} else if (Static453.aClass305_398 == Static43.aClass305_340) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4480();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4481();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4487();
						local270 = "";
						local280 = local270;
						if ((local714 & 0x1) != 0) {
							local270 = Static352.aClass1_Sub17_Sub2_2.method4491();
							if ((local714 & 0x2) == 0) {
								local280 = local270;
							} else {
								local280 = Static352.aClass1_Sub17_Sub2_2.method4491();
							}
						}
						local284 = Static352.aClass1_Sub17_Sub2_2.method4491();
						if (local204 == 99) {
							Static465.method7070(local284);
						} else if (local280.equals("") || !Static505.method5588(local280)) {
							Static229.method4129(local284, local204, local270, local73, local280);
						} else {
							Static43.aClass305_340 = null;
							return true;
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static62.aClass305_65) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4487();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4487();
						local435 = Static352.aClass1_Sub17_Sub2_2.method4494() << 0;
						local795 = Static352.aClass1_Sub17_Sub2_2.method4487();
						local799 = Static352.aClass1_Sub17_Sub2_2.method4487();
						if (Static465.method7068(local204)) {
							Static437.method4251(local714, local795, local73, true, local435, local799);
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static244.aClass305_230) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4487();
						local73 = local204 >> 5;
						local714 = local204 & 0x1F;
						if (local714 == 0) {
							Static261.aClass248Array1[local73] = null;
							Static43.aClass305_340 = null;
							return true;
						}
						@Pc(2116) Class248 local2116 = new Class248();
						local2116.anInt7271 = local714;
						local2116.anInt7270 = Static352.aClass1_Sub17_Sub2_2.method4487();
						if (local2116.anInt7270 >= 0 && Static321.aClass104Array55.length > local2116.anInt7270) {
							if (local2116.anInt7271 == 1 || local2116.anInt7271 == 10) {
								local2116.anInt7267 = Static352.aClass1_Sub17_Sub2_2.method4494();
								Static352.aClass1_Sub17_Sub2_2.anInt4872 += 6;
							} else if (local2116.anInt7271 >= 2 && local2116.anInt7271 <= 6) {
								if (local2116.anInt7271 == 2) {
									local2116.anInt7261 = 64;
									local2116.anInt7264 = 64;
								}
								if (local2116.anInt7271 == 3) {
									local2116.anInt7261 = 0;
									local2116.anInt7264 = 64;
								}
								if (local2116.anInt7271 == 4) {
									local2116.anInt7264 = 64;
									local2116.anInt7261 = 128;
								}
								if (local2116.anInt7271 == 5) {
									local2116.anInt7264 = 0;
									local2116.anInt7261 = 64;
								}
								if (local2116.anInt7271 == 6) {
									local2116.anInt7261 = 64;
									local2116.anInt7264 = 128;
								}
								local2116.anInt7271 = 2;
								local2116.anInt7262 = Static352.aClass1_Sub17_Sub2_2.method4487();
								local2116.anInt7261 += Static352.aClass1_Sub17_Sub2_2.method4494() - Static538.anInt9485 << 7;
								local2116.anInt7264 += Static352.aClass1_Sub17_Sub2_2.method4494() - Static282.anInt5380 << 7;
								local2116.anInt7269 = Static352.aClass1_Sub17_Sub2_2.method4487() << 0;
								local2116.anInt7268 = Static352.aClass1_Sub17_Sub2_2.method4494();
							}
							local2116.anInt7266 = Static352.aClass1_Sub17_Sub2_2.method4494();
							if (local2116.anInt7266 == 65535) {
								local2116.anInt7266 = -1;
							}
							Static261.aClass248Array1[local73] = local2116;
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static25.aClass305_26 == Static43.aClass305_340) {
						Static36.anInt1095 = Static352.aClass1_Sub17_Sub2_2.method4447();
						Static448.anInt7840 = Static209.anInt4108;
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static81.aClass305_82) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4472();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4502();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4502();
						local435 = Static352.aClass1_Sub17_Sub2_2.method4461();
						local795 = Static352.aClass1_Sub17_Sub2_2.method4471();
						if (Static465.method7068(local714)) {
							Static82.method1816(local795, 7, local73 << 16 | local204, local435);
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static214.aClass305_202 == Static43.aClass305_340) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4461();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4487();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4502();
						if (Static465.method7068(local714)) {
							if (local73 == 2) {
								Static31.method7280();
							}
							Static328.anInt6167 = local204;
							Static529.method8235(local204);
							Static220.method4021(false);
							Static173.method3206(Static328.anInt6167);
							for (local435 = 0; local435 < 100; local435++) {
								Static258.aBooleanArray17[local435] = true;
							}
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static8.aClass305_6) {
						Static235.anInt4528 = Static352.aClass1_Sub17_Sub2_2.method4487();
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static425.aClass305_382) {
						Static474.method4198(false);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static208.aClass305_189) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4467();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4449();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4502();
						if (local714 == 65535) {
							local714 = -1;
						}
						Static460.method7025(local73, local204, local714);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static320.aClass305_300) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4442();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4461();
						if (local73 == 65535) {
							local73 = -1;
						}
						local714 = Static352.aClass1_Sub17_Sub2_2.method4507();
						Static91.method7967(local714, local73, local204);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static285.aClass305_274) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4471();
						local73 = local204 >> 28 & 0x3;
						local714 = local204 >> 14 & 0x3FFF;
						local435 = local204 & 0x3FFF;
						local795 = Static352.aClass1_Sub17_Sub2_2.method4487();
						local799 = local795 >> 2;
						local294 = local795 & 0x3;
						local1003 = Static250.anIntArray400[local799];
						local554 = Static352.aClass1_Sub17_Sub2_2.method4472();
						local435 -= Static282.anInt5380;
						if (local554 == 65535) {
							local554 = -1;
						}
						local714 -= Static538.anInt9485;
						Static101.method2059(local294, local435, local714, local1003, local799, local73, local554);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static11.aClass305_17) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4481();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4494();
						if (Static465.method7068(local714)) {
							Static307.method5376(local204, local73);
						}
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_340 == Static338.aClass305_160) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4461();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4458();
						Static417.aClass10_1.method525(local73, local204);
						Static43.aClass305_340 = null;
						return true;
					} else if (Static43.aClass305_341 == Static43.aClass305_340) {
						local204 = Static352.aClass1_Sub17_Sub2_2.method4472();
						local73 = Static352.aClass1_Sub17_Sub2_2.method4502();
						local714 = Static352.aClass1_Sub17_Sub2_2.method4502();
						if (Static465.method7068(local73)) {
							Static302.method8220(local714, local204);
						}
						Static43.aClass305_340 = null;
						return true;
					} else {
						@Pc(2683) int local2683;
						if (Static94.aClass305_92 == Static43.aClass305_340) {
							local977 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
							local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
							local266 = local425;
							if (local977) {
								local266 = Static352.aClass1_Sub17_Sub2_2.method4491();
							}
							local994 = Static352.aClass1_Sub17_Sub2_2.method4494();
							local999 = Static352.aClass1_Sub17_Sub2_2.method4486();
							local1003 = Static352.aClass1_Sub17_Sub2_2.method4487();
							local554 = Static352.aClass1_Sub17_Sub2_2.method4494();
							@Pc(2679) long local2679 = (local994 << 32) + local999;
							@Pc(2681) boolean local2681 = false;
							local2683 = 0;
							while (true) {
								if (local2683 >= 100) {
									if (local1003 <= 1 && Static505.method5588(local266)) {
										local2681 = true;
									}
									break;
								}
								if (Static537.aLongArray17[local2683] == local2679) {
									local2681 = true;
									break;
								}
								local2683++;
							}
							if (!local2681 && Static280.anInt5322 == 0) {
								Static537.aLongArray17[Static499.anInt8738] = local2679;
								Static499.anInt8738 = (Static499.anInt8738 + 1) % 100;
								@Pc(2732) String local2732 = Static221.aClass41_1.method1404(local554).method5424(Static352.aClass1_Sub17_Sub2_2);
								if (local1003 == 2) {
									Static313.method5432(local2732, 0, null, "<img=1>" + local425, 18, "<img=1>" + local266, local554);
								} else if (local1003 == 1) {
									Static313.method5432(local2732, 0, null, "<img=0>" + local425, 18, "<img=0>" + local266, local554);
								} else {
									Static313.method5432(local2732, 0, null, local425, 18, local266, local554);
								}
							}
							Static43.aClass305_340 = null;
							return true;
						}
						@Pc(2845) int local2845;
						@Pc(2837) long local2837;
						if (Static77.aClass305_77 == Static43.aClass305_340) {
							local977 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
							local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
							local266 = local425;
							if (local977) {
								local266 = Static352.aClass1_Sub17_Sub2_2.method4491();
							}
							local994 = Static352.aClass1_Sub17_Sub2_2.method4465();
							local999 = Static352.aClass1_Sub17_Sub2_2.method4494();
							local2837 = Static352.aClass1_Sub17_Sub2_2.method4486();
							local564 = Static352.aClass1_Sub17_Sub2_2.method4487();
							local2845 = Static352.aClass1_Sub17_Sub2_2.method4494();
							@Pc(2851) long local2851 = local2837 + (local999 << 32);
							@Pc(2853) boolean local2853 = false;
							@Pc(2855) int local2855 = 0;
							while (true) {
								if (local2855 >= 100) {
									if (local564 <= 1 && Static505.method5588(local266)) {
										local2853 = true;
									}
									break;
								}
								if (local2851 == Static537.aLongArray17[local2855]) {
									local2853 = true;
									break;
								}
								local2855++;
							}
							if (!local2853 && Static280.anInt5322 == 0) {
								Static537.aLongArray17[Static499.anInt8738] = local2851;
								Static499.anInt8738 = (Static499.anInt8738 + 1) % 100;
								@Pc(2907) String local2907 = Static221.aClass41_1.method1404(local2845).method5424(Static352.aClass1_Sub17_Sub2_2);
								if (local564 == 2) {
									Static313.method5432(local2907, 0, Static175.method3243(local994), "<img=1>" + local425, 20, "<img=1>" + local266, local2845);
								} else if (local564 == 1) {
									Static313.method5432(local2907, 0, Static175.method3243(local994), "<img=0>" + local425, 20, "<img=0>" + local266, local2845);
								} else {
									Static313.method5432(local2907, 0, Static175.method3243(local994), local425, 20, local266, local2845);
								}
							}
							Static43.aClass305_340 = null;
							return true;
						}
						@Pc(3034) long local3034;
						@Pc(3055) Class1_Sub9 local3055;
						@Pc(3040) Class1_Sub9 local3040;
						if (Static43.aClass305_340 == Static127.aClass305_116) {
							local204 = Static352.aClass1_Sub17_Sub2_2.method4458();
							local73 = Static352.aClass1_Sub17_Sub2_2.method4502();
							if (local73 == 65535) {
								local73 = -1;
							}
							local714 = Static352.aClass1_Sub17_Sub2_2.method4502();
							local435 = Static352.aClass1_Sub17_Sub2_2.method4494();
							if (local435 == 65535) {
								local435 = -1;
							}
							local795 = Static352.aClass1_Sub17_Sub2_2.method4471();
							if (Static465.method7068(local714)) {
								for (local799 = local73; local799 <= local435; local799++) {
									local3034 = ((long) local204 << 32) + ((long) local799);
									local3040 = (Class1_Sub9) Static339.aClass230_35.method6144(local3034);
									if (local3040 != null) {
										local3055 = new Class1_Sub9(local795, local3040.anInt1812);
										local3040.method8239();
									} else if (local799 == -1) {
										local3055 = new Class1_Sub9(local795, Static384.method6156(local204).aClass1_Sub9_2.anInt1812);
									} else {
										local3055 = new Class1_Sub9(local795, -1);
									}
									Static339.aClass230_35.method6139(local3034, local3055);
								}
							}
							Static43.aClass305_340 = null;
							return true;
						}
						@Pc(3145) int local3145;
						if (Static43.aClass305_340 == Static284.aClass305_269) {
							local977 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
							local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
							local266 = local425;
							if (local977) {
								local266 = Static352.aClass1_Sub17_Sub2_2.method4491();
							}
							local994 = Static352.aClass1_Sub17_Sub2_2.method4465();
							local999 = Static352.aClass1_Sub17_Sub2_2.method4494();
							local2837 = Static352.aClass1_Sub17_Sub2_2.method4486();
							local564 = Static352.aClass1_Sub17_Sub2_2.method4487();
							@Pc(3141) long local3141 = (local999 << 32) + local2837;
							@Pc(3143) boolean local3143 = false;
							local3145 = 0;
							while (true) {
								if (local3145 >= 100) {
									if (local564 <= 1) {
										if (Static498.aBoolean656 && !Static353.aBoolean479 || Static394.aBoolean512) {
											local3143 = true;
										} else if (Static505.method5588(local266)) {
											local3143 = true;
										}
									}
									break;
								}
								if (local3141 == Static537.aLongArray17[local3145]) {
									local3143 = true;
									break;
								}
								local3145++;
							}
							if (!local3143 && Static280.anInt5322 == 0) {
								Static537.aLongArray17[Static499.anInt8738] = local3141;
								Static499.anInt8738 = (Static499.anInt8738 + 1) % 100;
								@Pc(3209) String local3209 = Static22.method606(Static229.method4131(Static352.aClass1_Sub17_Sub2_2));
								if (local564 == 2 || local564 == 3) {
									Static313.method5432(local3209, 0, Static175.method3243(local994), "<img=1>" + local425, 9, "<img=1>" + local266, -1);
								} else if (local564 == 1) {
									Static313.method5432(local3209, 0, Static175.method3243(local994), "<img=0>" + local425, 9, "<img=0>" + local266, -1);
								} else {
									Static313.method5432(local3209, 0, Static175.method3243(local994), local425, 9, local266, -1);
								}
							}
							Static43.aClass305_340 = null;
							return true;
						} else if (Static43.aClass305_340 == Static299.aClass305_282) {
							Static31.method7265(Static320.aClass54_22);
							Static43.aClass305_340 = null;
							return true;
						} else if (Static80.aClass305_81 == Static43.aClass305_340) {
							Static31.method7265(Static29.aClass54_1);
							Static43.aClass305_340 = null;
							return true;
						} else if (Static43.aClass305_340 == Static509.aClass305_440) {
							Static31.method7265(Static45.aClass54_2);
							Static43.aClass305_340 = null;
							return true;
						} else if (Static355.aClass305_331 == Static43.aClass305_340) {
							local204 = Static352.aClass1_Sub17_Sub2_2.method4461();
							if (local204 == 65535) {
								local204 = -1;
							}
							local73 = Static352.aClass1_Sub17_Sub2_2.method4461();
							local714 = Static352.aClass1_Sub17_Sub2_2.method4444();
							local435 = Static352.aClass1_Sub17_Sub2_2.method4472();
							local795 = Static352.aClass1_Sub17_Sub2_2.method4472();
							if (local795 == 65535) {
								local795 = -1;
							}
							if (Static465.method7068(local435)) {
								for (local799 = local795; local799 <= local204; local799++) {
									local3034 = (long) local799 + ((long) local714 << 32);
									local3040 = (Class1_Sub9) Static339.aClass230_35.method6144(local3034);
									if (local3040 != null) {
										local3055 = new Class1_Sub9(local3040.anInt1806, local73);
										local3040.method8239();
									} else if (local799 == -1) {
										local3055 = new Class1_Sub9(Static384.method6156(local714).aClass1_Sub9_2.anInt1806, local73);
									} else {
										local3055 = new Class1_Sub9(0, local73);
									}
									Static339.aClass230_35.method6139(local3034, local3055);
								}
							}
							Static43.aClass305_340 = null;
							return true;
						} else if (Static43.aClass305_340 == Static16.aClass305_462) {
							local204 = Static352.aClass1_Sub17_Sub2_2.method4472();
							local73 = Static352.aClass1_Sub17_Sub2_2.method4458();
							local714 = Static352.aClass1_Sub17_Sub2_2.method4461();
							local435 = Static352.aClass1_Sub17_Sub2_2.method4481();
							if (Static465.method7068(local204)) {
								Static82.method1816(local73, 5, local714, local435);
							}
							Static43.aClass305_340 = null;
							return true;
						} else if (Static46.aClass305_50 == Static43.aClass305_340) {
							local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
							if (local204 == 65535) {
								local204 = -1;
							}
							local73 = Static352.aClass1_Sub17_Sub2_2.method4487();
							local714 = Static352.aClass1_Sub17_Sub2_2.method4494();
							local435 = Static352.aClass1_Sub17_Sub2_2.method4487();
							Static394.method6253(local204, local435, local73, local714);
							Static43.aClass305_340 = null;
							return true;
						} else {
							@Pc(3671) boolean local3671;
							if (Static43.aClass305_340 == Static369.aClass305_345) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4472();
								local73 = Static352.aClass1_Sub17_Sub2_2.method4461();
								local714 = Static352.aClass1_Sub17_Sub2_2.method4458();
								local435 = Static352.aClass1_Sub17_Sub2_2.method4487();
								local795 = Static352.aClass1_Sub17_Sub2_2.method4461();
								local441 = (local435 & 0x80) != 0;
								if (local714 >> 30 == 0) {
									@Pc(3761) Class176 local3761;
									@Pc(3739) Class87 local3739;
									@Pc(3755) Class176 local3755;
									if (local714 >> 29 != 0) {
										local294 = local714 & 0xFFFF;
										@Pc(3959) Class1_Sub41 local3959 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local294);
										if (local3959 != null) {
											if (local795 == 65535) {
												local795 = -1;
											}
											@Pc(3969) Class20_Sub1_Sub1_Sub2 local3969 = local3959.aClass20_Sub1_Sub1_Sub2_2;
											@Pc(3971) boolean local3971 = true;
											local2845 = local441 ? local3969.anInt8967 : local3969.anInt8970;
											if (local795 != -1 && local2845 != -1) {
												if (local795 == local2845) {
													local3739 = Static530.aClass195_2.method5439(local795);
													if (local3739.aBoolean193 && local3739.anInt2314 != -1) {
														local3755 = Static35.aClass152_1.method4045(local3739.anInt2314);
														local3145 = local3755.anInt5271;
														if (local3145 == 0 || local3145 == 2) {
															local3971 = false;
														} else if (local3145 == 1) {
															local3971 = true;
														}
													}
												} else {
													local3739 = Static530.aClass195_2.method5439(local795);
													@Pc(4043) Class87 local4043 = Static530.aClass195_2.method5439(local2845);
													if (local3739.anInt2314 != -1 && local4043.anInt2314 != -1) {
														local3761 = Static35.aClass152_1.method4045(local3739.anInt2314);
														@Pc(4063) Class176 local4063 = Static35.aClass152_1.method4045(local4043.anInt2314);
														if (local4063.anInt5277 > local3761.anInt5277) {
															local3971 = false;
														}
													}
												}
											}
											if (local3971) {
												if (local441) {
													local3969.anInt8957 = local435 & 0x7;
													local3969.anInt9015 = local73;
													local3969.anInt9011 = 0;
													local3969.anInt8967 = local795;
													local3969.anInt8984 = 1;
													local3969.anInt8999 = local204 + Static445.anInt7791;
													local3969.anInt8958 = 0;
													if (local3969.anInt8999 > Static445.anInt7791) {
														local3969.anInt9011 = -1;
													}
													if (local3969.anInt8967 != -1 && Static445.anInt7791 == local3969.anInt8999) {
														local1013 = Static530.aClass195_2.method5439(local3969.anInt8967).anInt2314;
														if (local1013 != -1) {
															local3755 = Static35.aClass152_1.method4045(local1013);
															if (local3755 != null && local3755.anIntArray432 != null) {
																Static425.method6639(local3969.aByte108, local3755, local3969.anInt8949, 0, false, local3969.anInt8954);
															}
														}
													}
												} else {
													local3969.anInt8991 = local204 + Static445.anInt7791;
													local3969.anInt9027 = 1;
													local3969.anInt8970 = local795;
													local3969.anInt8968 = 0;
													local3969.anInt9005 = local435 & 0x7;
													local3969.lb = local73;
													local3969.anInt9026 = 0;
													if (Static445.anInt7791 < local3969.anInt8991) {
														local3969.anInt9026 = -1;
													}
													if (local3969.anInt8970 != -1 && local3969.anInt8991 == Static445.anInt7791) {
														local1013 = Static530.aClass195_2.method5439(local3969.anInt8970).anInt2314;
														if (local1013 != -1) {
															local3755 = Static35.aClass152_1.method4045(local1013);
															if (local3755 != null && local3755.anIntArray432 != null) {
																Static425.method6639(local3969.aByte108, local3755, local3969.anInt8949, 0, false, local3969.anInt8954);
															}
														}
													}
												}
											}
										}
									} else if (local714 >> 28 != 0) {
										local294 = local714 & 0xFFFF;
										@Pc(3656) Class20_Sub1_Sub1_Sub1 local3656;
										if (Static16.anInt9513 == local294) {
											local3656 = Static107.aClass20_Sub1_Sub1_Sub1_1;
										} else {
											local3656 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local294];
										}
										if (local3656 != null) {
											if (local795 == 65535) {
												local795 = -1;
											}
											local3671 = true;
											local564 = local441 ? local3656.anInt8967 : local3656.anInt8970;
											@Pc(3706) Class176 local3706;
											if (local795 != -1 && local564 != -1) {
												@Pc(3693) Class87 local3693;
												if (local795 == local564) {
													local3693 = Static530.aClass195_2.method5439(local795);
													if (local3693.aBoolean193 && local3693.anInt2314 != -1) {
														local3706 = Static35.aClass152_1.method4045(local3693.anInt2314);
														local2683 = local3706.anInt5271;
														if (local2683 == 0 || local2683 == 2) {
															local3671 = false;
														} else if (local2683 == 1) {
															local3671 = true;
														}
													}
												} else {
													local3693 = Static530.aClass195_2.method5439(local795);
													local3739 = Static530.aClass195_2.method5439(local564);
													if (local3693.anInt2314 != -1 && local3739.anInt2314 != -1) {
														local3755 = Static35.aClass152_1.method4045(local3693.anInt2314);
														local3761 = Static35.aClass152_1.method4045(local3739.anInt2314);
														if (local3755.anInt5277 < local3761.anInt5277) {
															local3671 = false;
														}
													}
												}
											}
											if (local3671) {
												if (local441) {
													local3656.anInt9011 = 0;
													local3656.anInt8984 = 1;
													local3656.anInt8999 = local204 + Static445.anInt7791;
													local3656.anInt8957 = local435 & 0x7;
													local3656.anInt8958 = 0;
													local3656.anInt9015 = local73;
													local3656.anInt8967 = local795;
													if (local3656.anInt8967 == 65535) {
														local3656.anInt8967 = -1;
													}
													if (Static445.anInt7791 < local3656.anInt8999) {
														local3656.anInt9011 = -1;
													}
													if (local3656.anInt8967 != -1 && local3656.anInt8999 == Static445.anInt7791) {
														local2845 = Static530.aClass195_2.method5439(local3656.anInt8967).anInt2314;
														if (local2845 != -1) {
															local3706 = Static35.aClass152_1.method4045(local2845);
															if (local3706 != null && local3706.anIntArray432 != null) {
																Static425.method6639(local3656.aByte108, local3706, local3656.anInt8949, 0, local3656 == Static107.aClass20_Sub1_Sub1_Sub1_1, local3656.anInt8954);
															}
														}
													}
												} else {
													local3656.anInt8970 = local795;
													local3656.anInt9026 = 0;
													local3656.anInt8991 = local204 + Static445.anInt7791;
													local3656.lb = local73;
													local3656.anInt8968 = 0;
													local3656.anInt9027 = 1;
													local3656.anInt9005 = local435 & 0x7;
													if (local3656.anInt8970 == 65535) {
														local3656.anInt8970 = -1;
													}
													if (local3656.anInt8991 > Static445.anInt7791) {
														local3656.anInt9026 = -1;
													}
													if (local3656.anInt8970 != -1 && Static445.anInt7791 == local3656.anInt8991) {
														local2845 = Static530.aClass195_2.method5439(local3656.anInt8970).anInt2314;
														if (local2845 != -1) {
															local3706 = Static35.aClass152_1.method4045(local2845);
															if (local3706 != null && local3706.anIntArray432 != null) {
																Static425.method6639(local3656.aByte108, local3706, local3656.anInt8949, 0, local3656 == Static107.aClass20_Sub1_Sub1_Sub1_1, local3656.anInt8954);
															}
														}
													}
												}
											}
										}
									}
								} else {
									local294 = local714 >> 28 & 0x3;
									local1003 = (local714 >> 14 & 0x3FFF) - Static538.anInt9485;
									local554 = (local714 & 0x3FFF) - Static282.anInt5380;
									if (local1003 >= 0 && local554 >= 0 && local1003 < Static237.anInt4563 && local554 < Static373.anInt6694) {
										local564 = local1003 * 128 + 64;
										local2845 = local554 * 128 + 64;
										local1013 = local294;
										if (local294 < 3 && Static4.method186(local554, local1003)) {
											local1013 = local294 + 1;
										}
										@Pc(3627) Class20_Sub1_Sub6 local3627 = new Class20_Sub1_Sub6(local795, 0, Static445.anInt7791, local294, local1013, local564, Static508.method7754(local2845, local564, local294) - local73, local2845, local1003, local1003, local554, local554, local435);
										Static330.aClass295_36.method7533(new Class1_Sub2_Sub14(local3627));
									}
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static43.aClass305_342) {
								Static238.anInt4640 = Static352.aClass1_Sub17_Sub2_2.method4468() << 3;
								Static492.anInt8645 = Static352.aClass1_Sub17_Sub2_2.method4449();
								Static140.anInt2803 = Static352.aClass1_Sub17_Sub2_2.method4501() << 3;
								while (Static494.anInt8660 > Static352.aClass1_Sub17_Sub2_2.anInt4872) {
									@Pc(4268) Class54 local4268 = Static385.method6170()[Static352.aClass1_Sub17_Sub2_2.method4487()];
									Static31.method7265(local4268);
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static456.aClass305_402 == Static43.aClass305_340) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
								local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
								@Pc(4296) Object[] local4296 = new Object[local425.length() + 1];
								for (local435 = local425.length() - 1; local435 >= 0; local435--) {
									if (local425.charAt(local435) == 's') {
										local4296[local435 + 1] = Static352.aClass1_Sub17_Sub2_2.method4491();
									} else {
										local4296[local435 + 1] = Integer.valueOf(Static352.aClass1_Sub17_Sub2_2.method4481());
									}
								}
								local4296[0] = Integer.valueOf(Static352.aClass1_Sub17_Sub2_2.method4481());
								if (Static465.method7068(local204)) {
									@Pc(4352) Class1_Sub10 local4352 = new Class1_Sub10();
									local4352.anObjectArray4 = local4296;
									Static173.method3207(local4352);
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static333.aClass305_314) {
								Static140.anInt2803 = Static352.aClass1_Sub17_Sub2_2.method4485() << 3;
								Static492.anInt8645 = Static352.aClass1_Sub17_Sub2_2.method4442();
								Static238.anInt4640 = Static352.aClass1_Sub17_Sub2_2.method4501() << 3;
								for (@Pc(4385) Class1_Sub20 local4385 = (Class1_Sub20) Static4.aClass230_2.method6137(); local4385 != null; local4385 = (Class1_Sub20) Static4.aClass230_2.method6140()) {
									local73 = (int) (local4385.aLong251 >> 28 & 0x3L);
									local714 = (int) (local4385.aLong251 & 0x3FFFL);
									local435 = local714 - Static538.anInt9485;
									local795 = (int) (local4385.aLong251 >> 14 & 0x3FFFL);
									local799 = local795 - Static282.anInt5380;
									if (local73 == Static492.anInt8645 && local435 >= Static238.anInt4640 && local435 < Static238.anInt4640 + 8 && local799 >= Static140.anInt2803 && Static140.anInt2803 + 8 > local799) {
										local4385.method8239();
										if (local435 >= 0 && local799 >= 0 && local435 < Static237.anInt4563 && local799 < Static373.anInt6694) {
											Static388.method6198(local799, local435, Static492.anInt8645);
										}
									}
								}
								for (@Pc(4478) Class1_Sub46 local4478 = (Class1_Sub46) Static30.aClass295_6.method7543(); local4478 != null; local4478 = (Class1_Sub46) Static30.aClass295_6.method7540()) {
									if (Static238.anInt4640 <= local4478.anInt7932 && Static238.anInt4640 + 8 > local4478.anInt7932 && local4478.anInt7922 >= Static140.anInt2803 && local4478.anInt7922 < Static140.anInt2803 + 8 && Static492.anInt8645 == local4478.anInt7933) {
										local4478.anInt7927 = 0;
									}
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static433.aClass305_387) {
								local977 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
								local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
								local266 = local425;
								if (local977) {
									local266 = Static352.aClass1_Sub17_Sub2_2.method4491();
								}
								local435 = Static352.aClass1_Sub17_Sub2_2.method4487();
								local795 = Static352.aClass1_Sub17_Sub2_2.method4494();
								local441 = false;
								if (local435 <= 1 && Static505.method5588(local266)) {
									local441 = true;
								}
								if (!local441 && Static280.anInt5322 == 0) {
									local525 = Static221.aClass41_1.method1404(local795).method5424(Static352.aClass1_Sub17_Sub2_2);
									if (local435 == 2) {
										Static313.method5432(local525, 0, null, "<img=1>" + local425, 25, "<img=1>" + local266, local795);
									} else if (local435 == 1) {
										Static313.method5432(local525, 0, null, "<img=0>" + local425, 25, "<img=0>" + local266, local795);
									} else {
										Static313.method5432(local525, 0, null, local425, 25, local266, local795);
									}
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static485.aClass305_368) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
								local73 = Static352.aClass1_Sub17_Sub2_2.method4481();
								if (Static465.method7068(local204)) {
									@Pc(4670) Class1_Sub35 local4670 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local73);
									if (local4670 != null) {
										Static537.method8142(local4670, false, true);
									}
									if (Static447.aClass91_14 != null) {
										Static243.method4316(Static447.aClass91_14);
										Static447.aClass91_14 = null;
									}
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static344.aClass305_322 == Static43.aClass305_340) {
								Static31.method7265(Static320.aClass54_21);
								Static43.aClass305_340 = null;
								return true;
							} else if (Static184.aClass305_159 == Static43.aClass305_340) {
								Static492.anInt8645 = Static352.aClass1_Sub17_Sub2_2.method4449();
								Static238.anInt4640 = Static352.aClass1_Sub17_Sub2_2.method4501() << 3;
								Static140.anInt2803 = Static352.aClass1_Sub17_Sub2_2.method4485() << 3;
								Static43.aClass305_340 = null;
								return true;
							} else if (Static495.aClass305_428 == Static43.aClass305_340) {
								Static352.aClass1_Sub17_Sub2_2.anInt4872 += 28;
								if (Static352.aClass1_Sub17_Sub2_2.method4503()) {
									Static39.method1123(Static352.aClass1_Sub17_Sub2_2, Static352.aClass1_Sub17_Sub2_2.anInt4872 - 28);
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static210.aClass305_196) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
								if (local204 == 65535) {
									local204 = -1;
								}
								local73 = Static352.aClass1_Sub17_Sub2_2.method4487();
								local714 = Static352.aClass1_Sub17_Sub2_2.method4494();
								local435 = Static352.aClass1_Sub17_Sub2_2.method4487();
								Static363.method5895(local714, local73, local435, local204);
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static236.aClass305_224) {
								Static181.anInt3813 = 1;
								Static82.anInt1887 = Static209.anInt4108;
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static253.aClass305_239) {
								local410 = Static352.aClass1_Sub17_Sub2_2.method4491();
								local425 = Static22.method606(Static229.method4131(Static352.aClass1_Sub17_Sub2_2));
								Static229.method4129(local425, 6, local410, 0, local410);
								Static43.aClass305_340 = null;
								return true;
							} else if (Static510.aClass305_441 == Static43.aClass305_340) {
								Static16.anInt9498 = Static352.aClass1_Sub17_Sub2_2.method4467();
								Static78.anInt1854 = Static352.aClass1_Sub17_Sub2_2.method4449();
								Static43.aClass305_340 = null;
								return true;
							} else if (Static75.aClass305_74 == Static43.aClass305_340) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4502();
								local73 = Static352.aClass1_Sub17_Sub2_2.method4481();
								if (Static465.method7068(local204)) {
									Static82.method1816(local73, 3, -1, -1);
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static39.aClass305_37 == Static43.aClass305_340) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
								local73 = Static352.aClass1_Sub17_Sub2_2.method4487();
								local714 = Static352.aClass1_Sub17_Sub2_2.method4487();
								local435 = Static352.aClass1_Sub17_Sub2_2.method4494() << 0;
								local795 = Static352.aClass1_Sub17_Sub2_2.method4487();
								local799 = Static352.aClass1_Sub17_Sub2_2.method4487();
								if (Static465.method7068(local204)) {
									Static446.method6922(local795, local73, local799, local435, local714);
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static176.aClass305_157 == Static43.aClass305_340) {
								Static421.method6579(Static494.anInt8660, Static352.aClass1_Sub17_Sub2_2);
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static534.aClass305_455) {
								Static189.method3657();
								Static43.aClass305_340 = null;
								return true;
							} else if (Static529.aClass305_465 == Static43.aClass305_340) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4444();
								local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
								local714 = Static352.aClass1_Sub17_Sub2_2.method4494();
								if (Static465.method7068(local714)) {
									Static496.method7603(local425, local204);
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static63.aClass305_66 == Static43.aClass305_340) {
								Static308.anInt5928 = Static352.aClass1_Sub17_Sub2_2.method4487();
								Static43.aClass305_340 = null;
								Static448.anInt7840 = Static209.anInt4108;
								return true;
							} else if (Static43.aClass305_340 == Static67.aClass305_70) {
								Static406.method6459(Static125.aBoolean217);
								Static43.aClass305_340 = null;
								return false;
							} else if (Static183.aClass305_158 == Static43.aClass305_340) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4442();
								local73 = Static352.aClass1_Sub17_Sub2_2.method4487();
								if (local204 == 255) {
									local73 = -1;
									local204 = -1;
								}
								Static463.method7054(local204, local73);
								Static43.aClass305_340 = null;
								return true;
							} else if (Static93.aClass305_91 == Static43.aClass305_340) {
								Static31.method7265(Static105.aClass54_7);
								Static43.aClass305_340 = null;
								return true;
							} else if (Static410.aClass305_389 == Static43.aClass305_340) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4461();
								local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
								local714 = Static352.aClass1_Sub17_Sub2_2.method4461();
								if (Static465.method7068(local204)) {
									Static394.method6255(local425, local714);
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static534.aClass305_456) {
								Static43.aClass305_340 = null;
								return false;
							} else if (Static43.aClass305_340 == Static337.aClass305_318) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4461();
								local73 = Static352.aClass1_Sub17_Sub2_2.method4444();
								local714 = Static352.aClass1_Sub17_Sub2_2.method4461();
								local435 = Static352.aClass1_Sub17_Sub2_2.method4494();
								local795 = Static352.aClass1_Sub17_Sub2_2.method4472();
								if (Static465.method7068(local435)) {
									Static472.method7363(local204, local714, local795, local73);
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static108.aClass305_107) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4502();
								local73 = Static352.aClass1_Sub17_Sub2_2.method4467();
								Static417.aClass10_1.method525(local73, local204);
								Static43.aClass305_340 = null;
								return true;
							} else if (Static419.aClass305_381 == Static43.aClass305_340) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
								local73 = Static352.aClass1_Sub17_Sub2_2.method4461();
								local714 = Static352.aClass1_Sub17_Sub2_2.method4458();
								if (Static465.method7068(local73)) {
									Static146.method2746(local204, local714);
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static397.aClass305_369 == Static43.aClass305_340) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4502();
								local73 = Static352.aClass1_Sub17_Sub2_2.method4496();
								local714 = Static352.aClass1_Sub17_Sub2_2.method4471();
								if (Static465.method7068(local204)) {
									Static167.method3166(local714, local73);
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static224.aClass305_207) {
								Static417.aClass10_1.method531();
								Static43.aClass305_340 = null;
								Static460.anInt7964 += 32;
								return true;
							} else if (Static297.aClass305_281 == Static43.aClass305_340) {
								Static31.method7265(Static247.aClass54_19);
								Static43.aClass305_340 = null;
								return true;
							} else if (Static483.aClass305_421 == Static43.aClass305_340) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4461();
								local73 = Static352.aClass1_Sub17_Sub2_2.method4458();
								local714 = Static352.aClass1_Sub17_Sub2_2.method4449();
								if (Static465.method7068(local204)) {
									Static187.method3600(local714, local73);
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static114.aClass305_111 == Static43.aClass305_340) {
								local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
								if (Static465.method7068(local204)) {
									Static441.method6830();
								}
								Static43.aClass305_340 = null;
								return true;
							} else if (Static43.aClass305_340 == Static544.aClass305_396) {
								Static322.method5569(Static352.aClass1_Sub17_Sub2_2.method4491());
								Static43.aClass305_340 = null;
								return true;
							} else {
								@Pc(5261) Class1_Sub35 local5261;
								if (Static15.aClass305_21 == Static43.aClass305_340) {
									local204 = Static352.aClass1_Sub17_Sub2_2.method4502();
									local73 = Static352.aClass1_Sub17_Sub2_2.method4461();
									local714 = Static352.aClass1_Sub17_Sub2_2.method4449();
									local435 = Static352.aClass1_Sub17_Sub2_2.method4458();
									if (Static465.method7068(local204)) {
										local5261 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local435);
										if (local5261 != null) {
											Static537.method8142(local5261, false, local5261.anInt5502 != local73);
										}
										Static198.method3755(local73, local435, false, local714);
									}
									Static43.aClass305_340 = null;
									return true;
								} else if (Static431.aClass305_386 == Static43.aClass305_340) {
									local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
									local73 = Static352.aClass1_Sub17_Sub2_2.method4449();
									local714 = Static352.aClass1_Sub17_Sub2_2.method4461();
									@Pc(5311) Class1_Sub41 local5311 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local204);
									if (local5311 != null) {
										Static31.method7249(local714, local5311.aClass20_Sub1_Sub1_Sub2_2, local73);
									}
									Static43.aClass305_340 = null;
									return true;
								} else {
									@Pc(5498) boolean local5498;
									if (Static43.aClass305_340 == Static370.aClass305_346) {
										Static223.anInt4338 = Static209.anInt4108;
										if (Static494.anInt8660 == 0) {
											Static246.anInt4721 = 0;
											Static161.aClass181Array1 = null;
											Static43.aClass305_340 = null;
											Static172.aString73 = null;
											Static81.aString35 = null;
											return true;
										}
										Static172.aString73 = Static352.aClass1_Sub17_Sub2_2.method4491();
										local977 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
										if (local977) {
											Static352.aClass1_Sub17_Sub2_2.method4491();
										}
										@Pc(5368) long local5368 = Static352.aClass1_Sub17_Sub2_2.method4465();
										Static81.aString35 = Static229.method4132(local5368);
										Static294.aByte71 = Static352.aClass1_Sub17_Sub2_2.method4482();
										local435 = Static352.aClass1_Sub17_Sub2_2.method4487();
										if (local435 == 255) {
											Static43.aClass305_340 = null;
											return true;
										}
										Static246.anInt4721 = local435;
										@Pc(5392) Class181[] local5392 = new Class181[100];
										for (local799 = 0; local799 < Static246.anInt4721; local799++) {
											local5392[local799] = new Class181();
											local5392[local799].aString128 = Static352.aClass1_Sub17_Sub2_2.method4491();
											local977 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
											if (local977) {
												local5392[local799].aString131 = Static352.aClass1_Sub17_Sub2_2.method4491();
											} else {
												local5392[local799].aString131 = local5392[local799].aString128;
											}
											local5392[local799].aString129 = Static442.method6847(local5392[local799].aString131);
											local5392[local799].anInt5549 = Static352.aClass1_Sub17_Sub2_2.method4494();
											local5392[local799].aByte69 = Static352.aClass1_Sub17_Sub2_2.method4482();
											local5392[local799].aString127 = Static352.aClass1_Sub17_Sub2_2.method4491();
											if (local5392[local799].aString131.equals(Static107.aClass20_Sub1_Sub1_Sub1_1.aString13)) {
												Static104.aByte113 = local5392[local799].aByte69;
											}
										}
										local554 = Static246.anInt4721;
										while (local554 > 0) {
											local554--;
											local5498 = true;
											for (local564 = 0; local564 < local554; local564++) {
												if (local5392[local564].aString129.compareTo(local5392[local564 + 1].aString129) > 0) {
													local529 = local5392[local564];
													local5392[local564] = local5392[local564 + 1];
													local5498 = false;
													local5392[local564 + 1] = local529;
												}
											}
											if (local5498) {
												break;
											}
										}
										Static43.aClass305_340 = null;
										Static161.aClass181Array1 = local5392;
										return true;
									} else if (Static43.aClass305_340 == Static492.aClass305_427) {
										Static474.method4198(true);
										Static43.aClass305_340 = null;
										return true;
									} else if (Static43.aClass305_340 == Static149.aClass305_374) {
										Static31.method7265(Static279.aClass54_14);
										Static43.aClass305_340 = null;
										return true;
									} else if (Static93.aClass305_90 == Static43.aClass305_340) {
										Static31.method7265(Static467.aClass54_26);
										Static43.aClass305_340 = null;
										return true;
									} else if (Static43.aClass305_340 == Static440.aClass305_393) {
										while (Static494.anInt8660 > Static352.aClass1_Sub17_Sub2_2.anInt4872) {
											local977 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
											local425 = Static352.aClass1_Sub17_Sub2_2.method4491();
											local266 = Static352.aClass1_Sub17_Sub2_2.method4491();
											local435 = Static352.aClass1_Sub17_Sub2_2.method4494();
											local795 = Static352.aClass1_Sub17_Sub2_2.method4487();
											local284 = "";
											local5498 = false;
											if (local435 > 0) {
												local284 = Static352.aClass1_Sub17_Sub2_2.method4491();
												local5498 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
											}
											for (local1003 = 0; local1003 < Static330.anInt6194; local1003++) {
												if (local977) {
													if (local266.equals(Static163.aStringArray18[local1003])) {
														Static163.aStringArray18[local1003] = local425;
														local425 = null;
														Static223.aStringArray23[local1003] = local266;
														break;
													}
												} else if (local425.equals(Static163.aStringArray18[local1003])) {
													if (local435 != Static462.anIntArray734[local1003]) {
														local3671 = true;
														for (@Pc(5662) Class46_Sub3_Sub2 local5662 = (Class46_Sub3_Sub2) Static162.aClass184_10.method5138(); local5662 != null; local5662 = (Class46_Sub3_Sub2) Static162.aClass184_10.method5145()) {
															if (local5662.aString216.equals(local425)) {
																if (local435 != 0 && local5662.aShort128 == 0) {
																	local5662.method8227();
																	local3671 = false;
																} else if (local435 == 0 && local5662.aShort128 != 0) {
																	local5662.method8227();
																	local3671 = false;
																}
															}
														}
														if (local3671) {
															Static162.aClass184_10.method5142(new Class46_Sub3_Sub2(local425, local435));
														}
														Static462.anIntArray734[local1003] = local435;
													}
													Static223.aStringArray23[local1003] = local266;
													Static467.aStringArray33[local1003] = local284;
													Static296.anIntArray695[local1003] = local795;
													Static232.aBooleanArray14[local1003] = local5498;
													local425 = null;
													break;
												}
											}
											if (local425 != null && Static330.anInt6194 < 200) {
												Static163.aStringArray18[Static330.anInt6194] = local425;
												Static223.aStringArray23[Static330.anInt6194] = local266;
												Static462.anIntArray734[Static330.anInt6194] = local435;
												Static467.aStringArray33[Static330.anInt6194] = local284;
												Static296.anIntArray695[Static330.anInt6194] = local795;
												Static232.aBooleanArray14[Static330.anInt6194] = local5498;
												Static330.anInt6194++;
											}
										}
										Static82.anInt1887 = Static209.anInt4108;
										Static181.anInt3813 = 2;
										local73 = Static330.anInt6194;
										while (local73 > 0) {
											local977 = true;
											local73--;
											for (local714 = 0; local714 < local73; local714++) {
												if (Static462.anIntArray734[local714] != Class216.lb.anInt6291 && Static462.anIntArray734[local714 + 1] == Class216.lb.anInt6291 || Static462.anIntArray734[local714] == 0 && Static462.anIntArray734[local714 + 1] != 0) {
													local435 = Static462.anIntArray734[local714];
													Static462.anIntArray734[local714] = Static462.anIntArray734[local714 + 1];
													Static462.anIntArray734[local714 + 1] = local435;
													local280 = Static467.aStringArray33[local714];
													Static467.aStringArray33[local714] = Static467.aStringArray33[local714 + 1];
													Static467.aStringArray33[local714 + 1] = local280;
													local284 = Static163.aStringArray18[local714];
													Static163.aStringArray18[local714] = Static163.aStringArray18[local714 + 1];
													Static163.aStringArray18[local714 + 1] = local284;
													local525 = Static223.aStringArray23[local714];
													Static223.aStringArray23[local714] = Static223.aStringArray23[local714 + 1];
													Static223.aStringArray23[local714 + 1] = local525;
													local1003 = Static296.anIntArray695[local714];
													Static296.anIntArray695[local714] = Static296.anIntArray695[local714 + 1];
													Static296.anIntArray695[local714 + 1] = local1003;
													local3671 = Static232.aBooleanArray14[local714];
													Static232.aBooleanArray14[local714] = Static232.aBooleanArray14[local714 + 1];
													local977 = false;
													Static232.aBooleanArray14[local714 + 1] = local3671;
												}
											}
											if (local977) {
												break;
											}
										}
										Static43.aClass305_340 = null;
										return true;
									} else if (Static529.aClass305_464 == Static43.aClass305_340) {
										local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
										local73 = Static352.aClass1_Sub17_Sub2_2.method4487();
										local385 = (local73 & 0x1) == 1;
										while (Static494.anInt8660 > Static352.aClass1_Sub17_Sub2_2.anInt4872) {
											local435 = Static352.aClass1_Sub17_Sub2_2.method4480();
											local795 = Static352.aClass1_Sub17_Sub2_2.method4494();
											local799 = 0;
											if (local795 != 0) {
												local799 = Static352.aClass1_Sub17_Sub2_2.method4487();
												if (local799 == 255) {
													local799 = Static352.aClass1_Sub17_Sub2_2.method4481();
												}
											}
											Static307.method5379(local799, local435, local204, local795 - 1, local385);
										}
										Static512.anIntArray785[Static131.anInt2627++ & 0x1F] = local204;
										Static43.aClass305_340 = null;
										return true;
									} else if (Static43.aClass305_340 == Static430.aClass305_457) {
										local204 = Static352.aClass1_Sub17_Sub2_2.method4461();
										local73 = Static352.aClass1_Sub17_Sub2_2.method4458();
										local714 = Static352.aClass1_Sub17_Sub2_2.method4481();
										if (Static465.method7068(local204)) {
											@Pc(6073) Class1_Sub35 local6073 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local73);
											local5261 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local714);
											if (local5261 != null) {
												Static537.method8142(local5261, false, local6073 == null || local6073.anInt5502 != local5261.anInt5502);
											}
											if (local6073 != null) {
												local6073.method8239();
												Static362.aClass230_45.method6139((long) local714, local6073);
											}
											@Pc(6115) Class91 local6115 = Static384.method6156(local73);
											if (local6115 != null) {
												Static243.method4316(local6115);
											}
											local6115 = Static384.method6156(local714);
											if (local6115 != null) {
												Static243.method4316(local6115);
												Static64.method1611(local6115, true);
											}
											if (Static328.anInt6167 != -1) {
												Static120.method7553(Static328.anInt6167, 1);
											}
										}
										Static43.aClass305_340 = null;
										return true;
									} else if (Static317.aClass305_298 == Static43.aClass305_340) {
										local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
										if (Static465.method7068(local204)) {
											Static476.method7401();
										}
										Static43.aClass305_340 = null;
										return true;
									} else if (Static327.aClass305_307 == Static43.aClass305_340) {
										local204 = Static352.aClass1_Sub17_Sub2_2.method4479();
										local73 = Static352.aClass1_Sub17_Sub2_2.method4481();
										local714 = Static352.aClass1_Sub17_Sub2_2.method4461();
										local435 = Static352.aClass1_Sub17_Sub2_2.method4496();
										if (Static465.method7068(local714)) {
											Static431.method6696(local73, local435, local204);
										}
										Static43.aClass305_340 = null;
										return true;
									} else if (Static320.aClass305_299 == Static43.aClass305_340) {
										local977 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
										@Pc(6214) byte[] local6214 = new byte[Static494.anInt8660 - 1];
										Static352.aClass1_Sub17_Sub2_2.method4505(local6214, Static494.anInt8660 - 1);
										Static539.method8206(local977, local6214);
										Static43.aClass305_340 = null;
										return true;
									} else if (Static43.aClass305_340 == Static454.aClass305_401) {
										Static31.method7265(Static115.aClass54_9);
										Static43.aClass305_340 = null;
										return true;
									} else if (Static28.aClass305_27 == Static43.aClass305_340) {
										Static252.aString108 = Static494.anInt8660 > 2 ? Static352.aClass1_Sub17_Sub2_2.method4491() : Static322.aClass45_94.method1474(Static544.anInt7853);
										Static514.anInt9106 = Static494.anInt8660 <= 0 ? -1 : Static352.aClass1_Sub17_Sub2_2.method4494();
										Static43.aClass305_340 = null;
										if (Static514.anInt9106 == 65535) {
											Static514.anInt9106 = -1;
										}
										return true;
									} else if (Static198.aClass305_183 == Static43.aClass305_340) {
										local204 = Static352.aClass1_Sub17_Sub2_2.method4494();
										local73 = Static352.aClass1_Sub17_Sub2_2.method4494();
										local714 = Static352.aClass1_Sub17_Sub2_2.method4494();
										local435 = Static352.aClass1_Sub17_Sub2_2.method4494();
										if (Static465.method7068(local204) && Static511.aClass91ArrayArray2[local73] != null) {
											for (local795 = local714; local795 < local435; local795++) {
												local799 = Static352.aClass1_Sub17_Sub2_2.method4486();
												if (Static511.aClass91ArrayArray2[local73].length > local795 && Static511.aClass91ArrayArray2[local73][local795] != null) {
													Static511.aClass91ArrayArray2[local73][local795].anInt2410 = local799;
												}
											}
										}
										Static43.aClass305_340 = null;
										return true;
									} else if (Static344.aClass305_321 == Static43.aClass305_340) {
										local204 = Static352.aClass1_Sub17_Sub2_2.method4487();
										local73 = Static352.aClass1_Sub17_Sub2_2.method4502();
										if (Static465.method7068(local73)) {
											Static432.anInt7508 = local204;
										}
										Static43.aClass305_340 = null;
										return true;
									} else if (Static43.aClass305_340 == Static137.aClass305_123) {
										Static308.method5381();
										Static43.aClass305_340 = null;
										return false;
									} else if (aClass305_197 == Static43.aClass305_340) {
										Static31.method7265(Static481.aClass54_24);
										Static43.aClass305_340 = null;
										return true;
									} else if (Static46.aClass305_49 == Static43.aClass305_340) {
										Static31.method7265(aClass54_16);
										Static43.aClass305_340 = null;
										return true;
									} else {
										Static25.method773(null, "T1 - " + (Static43.aClass305_340 == null ? -1 : Static43.aClass305_340.method7835()) + "," + (Static517.aClass305_447 == null ? -1 : Static517.aClass305_447.method7835()) + "," + (Static381.aClass305_360 == null ? -1 : Static381.aClass305_360.method7835()) + " - " + Static494.anInt8660);
										Static406.method6459(false);
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

	@OriginalMember(owner = "client!it", name = "g", descriptor = "(I)V")
	public static void method3918() {
		Static280.anInt5322 = 0;
		@Pc(13) int local13 = (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 >> 7) + Static538.anInt9485;
		@Pc(20) int local20 = (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 >> 7) + Static282.anInt5380;
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static280.anInt5322 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static280.anInt5322 = 1;
		}
		if (Static280.anInt5322 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static280.anInt5322 = 0;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI[B)[B")
	public static byte[] method3920(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[32768];
		Static556.method7044(arg1, arg0, local14, 0, 32768);
		return local14;
	}
}
