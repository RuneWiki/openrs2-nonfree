import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "Lclient!jb;")
	public static Class28 aClass28_41;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_64;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Lclient!jd;")
	public static Class61 aClass61_42 = new Class61(64);

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Lclient!jd;")
	public static Class61 aClass61_43 = new Class61(64);

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "[I")
	public static int[] anIntArray226 = new int[2];

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "Lclient!sc;")
	public static Class107 aClass107_635 = Static231.method3737("cookieprefix");

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "[Lclient!bh;")
	public static Class15[] aClass15Array2 = new Class15[6];

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!gd;IZ)V")
	public static void method1867(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) int local6 = arg0.anInt1575;
		@Pc(10) int local10 = (int) arg0.aLong177;
		arg0.method3735();
		if (arg1) {
			Static218.method3570(local6);
		}
		Static182.method3005(local6);
		@Pc(30) Class86 local30 = Static13.method333(local10);
		if (local30 != null) {
			Static16.method354(local30);
		}
		Static8.anInt259 = 0;
		Static40.aBoolean81 = false;
		Static5.method224(Static44.anInt965, Static100.anInt2167, Static104.anInt3191, Static101.anInt2176);
		if (Static77.anInt1732 != -1) {
			Static31.method2199(1, Static77.anInt1732);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZZ)V")
	public static void method1868(@OriginalArg(0) boolean arg0) {
		Static181.aBoolean381 = arg0;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(34) int local34;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(76) int local76;
		@Pc(136) int local136;
		@Pc(144) int local144;
		@Pc(153) int local153;
		if (!Static181.aBoolean381) {
			local18 = Static194.aClass1_Sub26_Sub1_3.method2983();
			local22 = Static194.aClass1_Sub26_Sub1_3.method2977();
			local26 = Static194.aClass1_Sub26_Sub1_3.method2983();
			local34 = (Static24.anInt450 - Static194.aClass1_Sub26_Sub1_3.anInt4021) / 16;
			Static1.anIntArrayArray1 = new int[local34][4];
			for (local40 = 0; local40 < local34; local40++) {
				for (local44 = 0; local44 < 4; local44++) {
					Static1.anIntArrayArray1[local40][local44] = Static194.aClass1_Sub26_Sub1_3.method2960();
				}
			}
			local44 = Static194.aClass1_Sub26_Sub1_3.method2968();
			local76 = Static194.aClass1_Sub26_Sub1_3.method2977();
			Static156.aByteArrayArray6 = null;
			Static85.aByteArrayArray3 = new byte[local34][];
			Static182.anIntArray343 = new int[local34];
			@Pc(86) boolean local86 = false;
			Static35.anIntArray79 = new int[local34];
			Static33.anIntArray76 = new int[local34];
			Static122.anIntArray237 = null;
			if ((local22 / 8 == 48 || local22 / 8 == 49) && local26 / 8 == 48) {
				local86 = true;
			}
			Static172.aByteArrayArray9 = new byte[local34][];
			if (local22 / 8 == 48 && local26 / 8 == 148) {
				local86 = true;
			}
			local34 = 0;
			for (local136 = (local22 - 6) / 8; local136 <= (local22 + 6) / 8; local136++) {
				for (local144 = (local26 - 6) / 8; local144 <= (local26 + 6) / 8; local144++) {
					local153 = (local136 << 8) + local144;
					if (local86 && (local144 == 49 || local144 == 149 || local144 == 147 || local136 == 50 || local136 == 49 && local144 == 47)) {
						Static182.anIntArray343[local34] = local153;
						Static35.anIntArray79[local34] = -1;
						Static33.anIntArray76[local34] = -1;
					} else {
						Static182.anIntArray343[local34] = local153;
						Static35.anIntArray79[local34] = Static42.aClass28_Sub1_24.method837(Static149.method2437(new Class107[] { Static34.aClass107_236, Static115.method2001(local136), Static224.aClass107_1321, Static115.method2001(local144) }));
						Static33.anIntArray76[local34] = Static42.aClass28_Sub1_24.method837(Static149.method2437(new Class107[] { Static211.aClass107_1238, Static115.method2001(local136), Static224.aClass107_1321, Static115.method2001(local144) }));
					}
					local34++;
				}
			}
			Static76.method1342(local26, local18, local44, local22, local76);
			return;
		}
		local18 = Static194.aClass1_Sub26_Sub1_3.method2964();
		local22 = Static194.aClass1_Sub26_Sub1_3.method2964();
		local26 = Static194.aClass1_Sub26_Sub1_3.method2987();
		local34 = Static194.aClass1_Sub26_Sub1_3.method2968();
		local40 = Static194.aClass1_Sub26_Sub1_3.method2983();
		Static194.aClass1_Sub26_Sub1_3.method3004();
		@Pc(322) int local322;
		for (local44 = 0; local44 < 4; local44++) {
			for (local76 = 0; local76 < 13; local76++) {
				for (local322 = 0; local322 < 13; local322++) {
					local136 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
					if (local136 == 1) {
						Static60.anIntArrayArrayArray6[local44][local76][local322] = Static194.aClass1_Sub26_Sub1_3.method3007(26);
					} else {
						Static60.anIntArrayArrayArray6[local44][local76][local322] = -1;
					}
				}
			}
		}
		Static194.aClass1_Sub26_Sub1_3.method3001();
		local76 = (Static24.anInt450 - Static194.aClass1_Sub26_Sub1_3.anInt4021) / 16;
		Static1.anIntArrayArray1 = new int[local76][4];
		for (local322 = 0; local322 < local76; local322++) {
			for (local136 = 0; local136 < 4; local136++) {
				Static1.anIntArrayArray1[local322][local136] = Static194.aClass1_Sub26_Sub1_3.method2995();
			}
		}
		Static156.aByteArrayArray6 = null;
		Static85.aByteArrayArray3 = new byte[local76][];
		Static182.anIntArray343 = new int[local76];
		Static122.anIntArray237 = null;
		Static33.anIntArray76 = new int[local76];
		Static172.aByteArrayArray9 = new byte[local76][];
		Static35.anIntArray79 = new int[local76];
		local76 = 0;
		for (local136 = 0; local136 < 4; local136++) {
			for (local144 = 0; local144 < 13; local144++) {
				for (local153 = 0; local153 < 13; local153++) {
					@Pc(452) int local452 = Static60.anIntArrayArrayArray6[local136][local144][local153];
					if (local452 != -1) {
						@Pc(462) int local462 = local452 >> 3 & 0x7FF;
						@Pc(468) int local468 = local452 >> 14 & 0x3FF;
						@Pc(478) int local478 = local462 / 8 + (local468 / 8 << 8);
						for (@Pc(480) int local480 = 0; local480 < local76; local480++) {
							if (Static182.anIntArray343[local480] == local478) {
								local478 = -1;
								break;
							}
						}
						if (local478 != -1) {
							Static182.anIntArray343[local76] = local478;
							@Pc(512) int local512 = local478 >> 8 & 0xFF;
							@Pc(516) int local516 = local478 & 0xFF;
							Static35.anIntArray79[local76] = Static42.aClass28_Sub1_24.method837(Static149.method2437(new Class107[] { Static34.aClass107_236, Static115.method2001(local512), Static224.aClass107_1321, Static115.method2001(local516) }));
							Static33.anIntArray76[local76] = Static42.aClass28_Sub1_24.method837(Static149.method2437(new Class107[] { Static211.aClass107_1238, Static115.method2001(local512), Static224.aClass107_1321, Static115.method2001(local516) }));
							local76++;
						}
					}
				}
			}
		}
		Static76.method1342(local40, local26, local34, local18, local22);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public static void method1869() {
		Static180.method3734();
		Static203.method192();
		Static219.method3596();
		Static178.method2836();
		Static71.method1281();
		Static182.method3002();
		Static83.method1390();
		Static227.method3694();
		Static149.method2447();
		Static58.method1125();
		Static20.method1727();
		Static46.method906();
		Static88.method1499();
		Static2.method86();
		Static179.aClass61_69.method1697();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!jb;ILclient!jb;II)Lclient!pe;")
	public static Class1_Sub2_Sub15 method1872(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(4) int arg2) {
		return Static83.method1393(arg2, arg1) ? Static43.method857(arg0.method819(0, arg2)) : null;
	}
}
