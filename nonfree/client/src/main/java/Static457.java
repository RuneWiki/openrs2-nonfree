import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!qga", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34;

	@OriginalMember(owner = "client!qga", name = "k", descriptor = "[Lclient!ac;")
	public static Class5[] aClass5Array13;

	@OriginalMember(owner = "client!qga", name = "n", descriptor = "Z")
	public static boolean aBoolean715;

	@OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
	public static int anInt8300 = 0;

	@OriginalMember(owner = "client!qga", name = "o", descriptor = "Lclient!us;")
	public static final Class344 aClass344_94 = new Class344(28, 3);

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)Z")
	public static boolean method6873() {
		try {
			if (Static565.anInt9608 == 2) {
				if (Static513.aClass3_Sub33_2 == null) {
					Static513.aClass3_Sub33_2 = Static656.method6548(Static110.aClass181_22, Static627.anInt10354, Static369.anInt7034);
					if (Static513.aClass3_Sub33_2 == null) {
						return false;
					}
				}
				if (Static622.aClass58_5 == null) {
					Static622.aClass58_5 = new Class58(Static222.aClass181_45, Static260.aClass181_56);
				}
				@Pc(29) Class3_Sub7_Sub5 local29 = Static522.aClass3_Sub7_Sub5_4;
				if (Static218.aClass3_Sub7_Sub5_1 != null) {
					local29 = Static218.aClass3_Sub7_Sub5_1;
				}
				if (local29.method6038(Static226.aClass181_49, Static622.aClass58_5, Static513.aClass3_Sub33_2)) {
					Static522.aClass3_Sub7_Sub5_4 = local29;
					Static522.aClass3_Sub7_Sub5_4.method6037();
					@Pc(59) int local59;
					if (Static135.anInt3494 <= 0) {
						Static565.anInt9608 = 0;
						Static522.aClass3_Sub7_Sub5_4.method6043(Static458.anInt8332);
						for (local59 = 0; local59 < Static102.anIntArray598.length; local59++) {
							Static522.aClass3_Sub7_Sub5_4.method6021(local59, Static102.anIntArray598[local59]);
							Static102.anIntArray598[local59] = 255;
						}
					} else {
						Static565.anInt9608 = 3;
						Static522.aClass3_Sub7_Sub5_4.method6043(Static135.anInt3494 > Static458.anInt8332 ? Static458.anInt8332 : Static135.anInt3494);
						for (local59 = 0; local59 < Static102.anIntArray598.length; local59++) {
							Static522.aClass3_Sub7_Sub5_4.method6021(local59, Static102.anIntArray598[local59]);
							Static102.anIntArray598[local59] = 255;
						}
					}
					if (Static218.aClass3_Sub7_Sub5_1 == null) {
						if (Static459.aLong211 <= 0L) {
							Static522.aClass3_Sub7_Sub5_4.method6031(Static513.aClass3_Sub33_2, Static618.aBoolean861);
						} else {
							Static522.aClass3_Sub7_Sub5_4.method6032(Static618.aBoolean861, Static513.aClass3_Sub33_2, Static459.aLong211);
						}
					}
					if (Static493.aClass122_2 != null) {
						Static493.aClass122_2.method6808(Static522.aClass3_Sub7_Sub5_4);
					}
					Static459.aLong211 = 0L;
					Static513.aClass3_Sub33_2 = null;
					Static110.aClass181_22 = null;
					Static218.aClass3_Sub7_Sub5_1 = null;
					Static622.aClass58_5 = null;
					return true;
				}
			}
		} catch (@Pc(158) Exception local158) {
			local158.printStackTrace();
			Static522.aClass3_Sub7_Sub5_4.method6023();
			Static218.aClass3_Sub7_Sub5_1 = null;
			Static565.anInt9608 = 0;
			Static110.aClass181_22 = null;
			Static513.aClass3_Sub33_2 = null;
			Static622.aClass58_5 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	public static void method6874() {
		if (Static552.aClass3_Sub48_30.aClass23_Sub25_1.method7082() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static469.anInt8476 - 4 & 0xFF);
		@Pc(25) int local25 = Static469.anInt8476 % Static394.anInt7540;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static462.anInt8391; local31++) {
				Static192.aByteArrayArrayArray3[local27][local25][local31] = local21;
			}
		}
		if (Static552.anInt9440 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static286.anIntArray346[local31] = -1000000;
			Static99.anIntArray103[local31] = 1000000;
			Static170.anIntArray225[local31] = 0;
			Static454.anIntArray521[local31] = 1000000;
			Static394.anIntArray471[local31] = 0;
		}
		@Pc(90) int local90 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428;
		@Pc(97) int local97 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424;
		@Pc(109) int local109;
		if (Static516.anInt9019 != 1 && Static531.anInt9157 == -1) {
			local109 = Static202.method3958(Static289.anInt5908, Static552.anInt9440, Static465.anInt8425);
			if (local109 - Static641.anInt10516 < 3200 && (Static244.aByteArrayArrayArray10[Static552.anInt9440][Static465.anInt8425 >> 9][Static289.anInt5908 >> 9] & 0x4) != 0) {
				Static164.method7303(1, false, Static289.anInt5908 >> 9, Static465.anInt8425 >> 9, Static170.aClass106ArrayArrayArray1);
				return;
			}
			return;
		}
		if (Static516.anInt9019 != 1) {
			local90 = Static531.anInt9157;
			local97 = Static155.anInt3810;
		}
		if ((Static244.aByteArrayArrayArray10[Static552.anInt9440][local90 >> 9][local97 >> 9] & 0x4) != 0) {
			Static164.method7303(0, false, local97 >> 9, local90 >> 9, Static170.aClass106ArrayArrayArray1);
		}
		if (Static299.anInt8877 >= 2560) {
			return;
		}
		local109 = Static465.anInt8425 >> 9;
		@Pc(193) int local193 = Static289.anInt5908 >> 9;
		@Pc(197) int local197 = local90 >> 9;
		@Pc(201) int local201 = local97 >> 9;
		@Pc(208) int local208;
		if (local109 >= local197) {
			local208 = local109 - local197;
		} else {
			local208 = local197 - local109;
		}
		@Pc(226) int local226;
		if (local201 <= local193) {
			local226 = local193 - local201;
		} else {
			local226 = local201 - local193;
		}
		if (local208 == 0 && local226 == 0 || local208 <= -Static394.anInt7540 || local208 >= Static394.anInt7540 || -Static462.anInt8391 >= local226 || Static462.anInt8391 <= local226) {
			Static544.method7724("RC: " + local109 + "," + local193 + " " + local197 + "," + local201 + " " + Static446.anInt8090 + "," + Static124.anInt3150, null);
			return;
		}
		@Pc(306) int local306;
		@Pc(308) int local308;
		if (local208 <= local226) {
			local306 = local208 * 65536 / local226;
			local308 = 32768;
			while (local201 != local193) {
				if (local201 > local193) {
					local193++;
				} else if (local201 < local193) {
					local193--;
				}
				if ((Static244.aByteArrayArrayArray10[Static552.anInt9440][local109][local193] & 0x4) != 0) {
					Static164.method7303(1, false, local193, local109, Static170.aClass106ArrayArrayArray1);
					return;
				}
				local308 += local306;
				if (local308 >= 65536) {
					if (local197 > local109) {
						local109++;
					} else if (local109 > local197) {
						local109--;
					}
					local308 -= 65536;
					if ((Static244.aByteArrayArrayArray10[Static552.anInt9440][local109][local193] & 0x4) != 0) {
						Static164.method7303(1, false, local193, local109, Static170.aClass106ArrayArrayArray1);
						return;
					}
				}
			}
			return;
		}
		local306 = local226 * 65536 / local208;
		local308 = 32768;
		while (local197 != local109) {
			if (local109 < local197) {
				local109++;
			} else if (local109 > local197) {
				local109--;
			}
			if ((Static244.aByteArrayArrayArray10[Static552.anInt9440][local109][local193] & 0x4) != 0) {
				Static164.method7303(1, false, local193, local109, Static170.aClass106ArrayArrayArray1);
				return;
			}
			local308 += local306;
			if (local308 >= 65536) {
				if (local193 < local201) {
					local193++;
				} else if (local201 < local193) {
					local193--;
				}
				local308 -= 65536;
				if ((Static244.aByteArrayArrayArray10[Static552.anInt9440][local109][local193] & 0x4) != 0) {
					Static164.method7303(1, false, local193, local109, Static170.aClass106ArrayArrayArray1);
					return;
				}
			}
		}
	}
}
