import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!we", name = "u", descriptor = "Z")
	public static boolean aBoolean402 = false;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
	public static void method4754() {
		Static149.aClass26_28.method517(5);
		Static125.aClass26_23.method517(5);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method4755() {
		Static46.aClass4_Sub6_Sub2_3.method2508();
		Static227.anInt4358 = 1;
		Static85.aClass58_42 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method4756(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1) {
			try {
				Static319.method1852(Static276.aClass139_4.anApplet1, "loggedout");
			} catch (@Pc(51) Throwable local51) {
			}
			try {
				Static47.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static47.anApplet_Sub1_1.getCodeBase(), arg0), "_top");
			} catch (@Pc(63) Exception local63) {
			}
			return;
		}
		if (Static94.aBoolean138 && Static151.aBoolean207) {
			try {
				Static319.method1853(new Object[] { (new URL(Static47.anApplet_Sub1_1.getCodeBase(), arg0)).toString() }, Static276.aClass139_4.anApplet1, "openjs");
				return;
			} catch (@Pc(29) Throwable local29) {
			}
		}
		try {
			Static47.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static47.anApplet_Sub1_1.getCodeBase(), arg0), "_blank");
		} catch (@Pc(41) Exception local41) {
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Z")
	public static boolean method4757(@OriginalArg(1) int arg0) {
		@Pc(8) Class63_Sub1 local8 = Static125.method1928(arg0);
		if (local8 == null) {
			return false;
		} else if (Static215.anInt4212 == 1 || Static215.anInt4212 == 2 || Static166.anInt3406 == 2) {
			Static251.aString299 = local8.aString111;
			Static254.anInt4847 = local8.anInt2037;
			if (Static166.anInt3406 != 0) {
				Static220.anInt4045 = Static254.anInt4847 + 50000;
				Static109.anInt2194 = Static254.anInt4847 + 40000;
				Static256.anInt4867 = Static109.anInt2194;
			}
			return true;
		} else {
			@Pc(52) String local52 = "";
			@Pc(54) String local54 = "";
			if (Static227.aString268 != null) {
				local54 = "/p=" + Static227.aString268;
			}
			if (Static166.anInt3406 != 0) {
				local52 = ":" + (local8.anInt2037 + 7000);
			}
			@Pc(130) String local130 = "http://" + local8.aString111 + local52 + "/l=" + Static9.anInt124 + "/a=" + Static259.anInt4939 + local54 + "/j" + (Static75.aBoolean102 ? "1" : "0") + ",o" + (Static170.aBoolean231 ? "1" : "0") + ",a2,m" + (Static47.aBoolean52 ? "1" : "0");
			try {
				Static292.aClient1.getAppletContext().showDocument(new URL(local130), "_self");
				return true;
			} catch (@Pc(140) Exception local140) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method4758() {
		if (Static36.method561() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static86.anInt1997 - 4 & 0xFF);
		@Pc(27) int local27 = Static86.anInt1997 % 104;
		@Pc(29) int local29;
		@Pc(34) int local34;
		for (local29 = 0; local29 < 4; local29++) {
			for (local34 = 0; local34 < 104; local34++) {
				Static9.aByteArrayArrayArray2[local29][local27][local34] = local19;
			}
		}
		if (Static281.anInt5335 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static212.anIntArray440[local29] = -1000000;
			Static89.anIntArray164[local29] = 1000000;
			Static291.anIntArray620[local29] = 0;
			Static242.anIntArray492[local29] = 1000000;
			Static241.anIntArray489[local29] = 0;
		}
		if (Static41.anInt772 != 1) {
			local29 = Static33.method522(Static302.anInt5682, Static129.anInt2519, Static281.anInt5335);
			if (local29 - Static82.anInt1931 < 800 && (Static174.aByteArrayArrayArray17[Static281.anInt5335][Static129.anInt2519 >> 7][Static302.anInt5682 >> 7] & 0x4) != 0) {
				Static20.method279(1, Static129.anInt2519 >> 7, false, Static302.anInt5682 >> 7, Static6.aClass4_Sub19ArrayArrayArray1);
			}
			return;
		}
		if ((Static174.aByteArrayArrayArray17[Static281.anInt5335][Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7][Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7] & 0x4) != 0) {
			Static20.method279(0, Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7, false, Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7, Static6.aClass4_Sub19ArrayArrayArray1);
		}
		if (Static207.anInt4066 >= 310) {
			return;
		}
		local34 = Static302.anInt5682 >> 7;
		local29 = Static129.anInt2519 >> 7;
		@Pc(184) int local184 = Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7;
		@Pc(196) int local196;
		if (local34 >= local184) {
			local196 = local34 - local184;
		} else {
			local196 = local184 - local34;
		}
		@Pc(208) int local208 = Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7;
		@Pc(216) int local216;
		if (local208 > local29) {
			local216 = local208 - local29;
		} else {
			local216 = local29 - local208;
		}
		if (local216 == 0 && local196 == 0 || local216 <= -104 || local216 >= 104 || local196 <= -104 || local196 >= 104) {
			Static193.method3072(null, "RC: " + local29 + "," + local34 + " " + local208 + "," + local184 + " " + Static220.anInt3983 + "," + Static295.anInt5480);
			return;
		}
		@Pc(299) int local299;
		@Pc(293) int local293;
		if (local216 > local196) {
			local299 = local196 * 65536 / local216;
			local293 = 32768;
			while (local208 != local29) {
				if (local29 < local208) {
					local29++;
				} else if (local208 < local29) {
					local29--;
				}
				if ((Static174.aByteArrayArrayArray17[Static281.anInt5335][local29][local34] & 0x4) != 0) {
					Static20.method279(1, local29, false, local34, Static6.aClass4_Sub19ArrayArrayArray1);
					break;
				}
				local293 += local299;
				if (local293 >= 65536) {
					if (local34 < local184) {
						local34++;
					} else if (local184 < local34) {
						local34--;
					}
					local293 -= 65536;
					if ((Static174.aByteArrayArrayArray17[Static281.anInt5335][local29][local34] & 0x4) != 0) {
						Static20.method279(1, local29, false, local34, Static6.aClass4_Sub19ArrayArrayArray1);
						break;
					}
				}
			}
			return;
		}
		local293 = 32768;
		local299 = local216 * 65536 / local196;
		while (local34 != local184) {
			if (local184 > local34) {
				local34++;
			} else if (local184 < local34) {
				local34--;
			}
			if ((Static174.aByteArrayArrayArray17[Static281.anInt5335][local29][local34] & 0x4) != 0) {
				Static20.method279(1, local29, false, local34, Static6.aClass4_Sub19ArrayArrayArray1);
				break;
			}
			local293 += local299;
			if (local293 >= 65536) {
				local293 -= 65536;
				if (local208 > local29) {
					local29++;
				} else if (local29 > local208) {
					local29--;
				}
				if ((Static174.aByteArrayArrayArray17[Static281.anInt5335][local29][local34] & 0x4) != 0) {
					Static20.method279(1, local29, false, local34, Static6.aClass4_Sub19ArrayArrayArray1);
					break;
				}
			}
		}
	}
}
