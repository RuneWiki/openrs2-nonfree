import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lclient!ig;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
	public static int anInt1583;

	@OriginalMember(owner = "client!ef", name = "bb", descriptor = "Lclient!pa;")
	public static Class103 aClass103_2;

	@OriginalMember(owner = "client!ef", name = "db", descriptor = "Lclient!hc;")
	public static Class51 aClass51_20;

	@OriginalMember(owner = "client!ef", name = "eb", descriptor = "Lclient!hc;")
	public static Class51 aClass51_21;

	@OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
	public static int anInt1588;

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "[S")
	public static short[] aShortArray26 = new short[500];

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "Lclient!lc;")
	public static Class79 aClass79_6 = new Class79(16);

	@OriginalMember(owner = "client!ef", name = "ab", descriptor = "Lclient!lc;")
	public static Class79 aClass79_7 = new Class79(64);

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
	public static int anInt1587 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZIIZ)V")
	public static void method1100(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(204) int local204;
		@Pc(208) int local208;
		@Pc(104) int local104;
		for (@Pc(3) int local3 = 0; local3 < Static16.anInt4955; local3++) {
			@Pc(11) Class9_Sub1_Sub2 local11 = Static36.aClass9_Sub1_Sub2Array2[Static142.anIntArray260[local3]];
			if (local11 != null && local11.method219() && local11.aClass45_1.method1468()) {
				@Pc(26) int local26 = local11.method208();
				if (arg0) {
					if (!local11.aClass45_1.aBoolean121) {
						continue;
					}
				} else if (arg2 != local11.aClass45_1.aBoolean122 || arg1 != 0 && arg1 != local26) {
					continue;
				}
				@Pc(78) int local78;
				@Pc(83) int local83;
				if (local26 == 1) {
					if ((local11.anInt427 & 0x7F) == 64 && (local11.anInt479 & 0x7F) == 64) {
						local78 = local11.anInt427 >> 7;
						local83 = local11.anInt479 >> 7;
						if (local78 >= 0 && local78 < 104 && local83 >= 0 && local83 < 104) {
							local104 = Static265.anIntArrayArray40[local78][local83]++;
						}
					}
				} else if (((local26 & 0x1) != 0 || (local11.anInt427 & 0x7F) == 0 && (local11.anInt479 & 0x7F) == 0) && ((local26 & 0x1) != 1 || (local11.anInt427 & 0x7F) == 64 && (local11.anInt479 & 0x7F) == 64)) {
					local83 = local11.anInt479 - local26 * 64 >> 7;
					local78 = local11.anInt427 - local26 * 64 >> 7;
					local178 = local11.method208() + local78;
					if (local178 > 104) {
						local178 = 104;
					}
					local189 = local11.method208() + local83;
					if (local78 < 0) {
						local78 = 0;
					}
					if (local189 > 104) {
						local189 = 104;
					}
					if (local83 < 0) {
						local83 = 0;
					}
					for (local204 = local78; local204 < local178; local204++) {
						for (local208 = local83; local208 < local189; local208++) {
							local104 = Static265.anIntArrayArray40[local204][local208]++;
						}
					}
				}
			}
		}
		label204: for (@Pc(250) int local250 = 0; local250 < Static16.anInt4955; local250++) {
			@Pc(258) Class9_Sub1_Sub2 local258 = Static36.aClass9_Sub1_Sub2Array2[Static142.anIntArray260[local250]];
			@Pc(267) long local267 = (long) Static142.anIntArray260[local250] << 32 | 0x20000000L;
			if (local258 != null && local258.method219() && local258.aClass45_1.method1468()) {
				local178 = local258.method208();
				if (arg0) {
					if (!local258.aClass45_1.aBoolean121) {
						continue;
					}
				} else if (arg2 != local258.aClass45_1.aBoolean122 || arg1 != 0 && local178 != arg1) {
					continue;
				}
				local258.aBoolean28 = true;
				if (local178 == 1) {
					if ((local258.anInt427 & 0x7F) == 64 && (local258.anInt479 & 0x7F) == 64) {
						local204 = local258.anInt479 >> 7;
						local189 = local258.anInt427 >> 7;
						if (local189 < 0 || local189 >= 104 || local204 < 0 || local204 >= 104) {
							continue;
						}
						if (Static265.anIntArrayArray40[local189][local204] > 1) {
							local104 = Static265.anIntArrayArray40[local189][local204]--;
							continue;
						}
					}
				} else if ((local178 & 0x1) == 0 && (local258.anInt427 & 0x7F) == 0 && (local258.anInt479 & 0x7F) == 0 || (local178 & 0x1) == 1 && (local258.anInt427 & 0x7F) == 64 && (local258.anInt479 & 0x7F) == 64) {
					local189 = local258.anInt427 - local178 * 64 >> 7;
					local204 = local258.anInt479 - local178 * 64 >> 7;
					local208 = local189 + local178;
					if (local189 < 0) {
						local189 = 0;
					}
					if (local208 > 104) {
						local208 = 104;
					}
					@Pc(456) int local456 = local204 + local178;
					if (local204 < 0) {
						local204 = 0;
					}
					@Pc(462) boolean local462 = true;
					if (local456 > 104) {
						local456 = 104;
					}
					@Pc(475) int local475;
					for (@Pc(471) int local471 = local189; local471 < local208; local471++) {
						for (local475 = local204; local475 < local456; local475++) {
							if (Static265.anIntArrayArray40[local471][local475] <= 1) {
								local462 = false;
								break;
							}
						}
					}
					if (local462) {
						local475 = local189;
						while (true) {
							if (local208 <= local475) {
								continue label204;
							}
							for (@Pc(508) int local508 = local204; local508 < local456; local508++) {
								local104 = Static265.anIntArrayArray40[local475][local508]--;
							}
							local475++;
						}
					}
				}
				if (!local258.aClass45_1.aBoolean123) {
					local267 |= Long.MIN_VALUE;
				}
				local258.aBoolean28 = false;
				local258.anInt401 = Static200.method3326(Static137.anInt3321, local258.anInt479, local258.anInt427);
				Static164.method2853(Static137.anInt3321, local258.anInt427, local258.anInt479, local258.anInt401, (local178 - 1) * 64 + 60, local258, local258.anInt419, local267, local258.aBoolean23);
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method1101(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(12) String local12 = "";
			if (arg1 != null) {
				local12 = Static21.method406(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local12 = local12 + " | ";
				}
				local12 = local12 + arg0;
			}
			Static138.method2533(local12);
			local12 = Static153.method2748("%3a", ":", local12);
			local12 = Static153.method2748("%40", "@", local12);
			local12 = Static153.method2748("%26", "&", local12);
			local12 = Static153.method2748("%23", "#", local12);
			if (Static150.aClass28_5.anApplet1 != null) {
				@Pc(104) Class145 local104 = Static150.aClass28_5.method723(new URL(Static150.aClass28_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static92.anInt2555 + "&u=" + Static148.aLong16 + "&v1=" + Static40.aString55 + "&v2=" + Static40.aString57 + "&e=" + local12));
				while (local104.anInt5354 == 0) {
					Static30.method587(1L);
				}
				if (local104.anInt5354 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local104.anObject7;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}
}
