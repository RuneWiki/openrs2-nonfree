import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
	public static int anInt5364;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!bo;")
	public static Class24 aClass24_28 = new Class24();

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString176 = "Loading...";

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
	public static int anInt5365 = 0;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
	public static void method4171() {
		Static8.anInt141++;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
	public static void method4172(@OriginalArg(1) boolean arg0) {
		Static288.aBoolean393 = arg0;
		@Pc(25) boolean local25;
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(43) int local43;
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(155) int local155;
		@Pc(168) int local168;
		@Pc(181) int local181;
		if (!Static288.aBoolean393) {
			local15 = Static237.aClass1_Sub14_Sub1_7.method2593();
			local19 = Static237.aClass1_Sub14_Sub1_7.method2593();
			local25 = Static4.method50(Static237.aClass1_Sub14_Sub1_7.method2596());
			local29 = Static237.aClass1_Sub14_Sub1_7.method2627();
			local35 = Static237.aClass1_Sub14_Sub1_7.method2638();
			local43 = (Static127.anInt2543 - Static237.aClass1_Sub14_Sub1_7.anInt3290) / 16;
			Static272.anIntArrayArray41 = new int[local43][4];
			for (local49 = 0; local49 < local43; local49++) {
				for (local58 = 0; local58 < 4; local58++) {
					Static272.anIntArrayArray41[local49][local58] = Static237.aClass1_Sub14_Sub1_7.method2635();
				}
			}
			local49 = Static237.aClass1_Sub14_Sub1_7.method2626();
			Static254.aByteArrayArray14 = new byte[local43][];
			Static70.aByteArrayArray3 = new byte[local43][];
			Static90.aByteArrayArray13 = new byte[local43][];
			Static274.anIntArray473 = new int[local43];
			Static53.anIntArray89 = new int[local43];
			Static156.aByteArrayArray10 = new byte[local43][];
			@Pc(99) boolean local99 = false;
			Static206.aByteArrayArray12 = null;
			if ((local15 / 8 == 48 || local15 / 8 == 49) && (local35 / 8) == 48) {
				local99 = true;
			}
			Static272.anIntArray469 = new int[local43];
			Static274.anIntArray472 = null;
			Static278.anIntArray487 = new int[local43];
			Static302.anIntArray522 = new int[local43];
			local43 = 0;
			if (local15 / 8 == 48 && local35 / 8 == 148) {
				local99 = true;
			}
			for (local155 = (local15 - 6) / 8; local155 <= (local15 + 6) / 8; local155++) {
				for (local168 = (local35 - 6) / 8; local168 <= (local35 + 6) / 8; local168++) {
					local181 = local168 + (local155 << 8);
					if (local99 && (local168 == 49 || local168 == 149 || local168 == 147 || local155 == 50 || local155 == 49 && local168 == 47)) {
						Static278.anIntArray487[local43] = local181;
						Static274.anIntArray473[local43] = -1;
						Static53.anIntArray89[local43] = -1;
						Static302.anIntArray522[local43] = -1;
						Static272.anIntArray469[local43] = -1;
					} else {
						Static278.anIntArray487[local43] = local181;
						Static274.anIntArray473[local43] = Static124.aClass138_40.method3331("m" + local155 + "_" + local168);
						Static53.anIntArray89[local43] = Static124.aClass138_40.method3331("l" + local155 + "_" + local168);
						Static302.anIntArray522[local43] = Static124.aClass138_40.method3331("um" + local155 + "_" + local168);
						Static272.anIntArray469[local43] = Static124.aClass138_40.method3331("ul" + local155 + "_" + local168);
					}
					local43++;
				}
			}
			Static295.method4396(local49, false, local15, local25, local19, local29, local35);
			return;
		}
		local15 = Static237.aClass1_Sub14_Sub1_7.method2614();
		local19 = Static237.aClass1_Sub14_Sub1_7.method2593();
		local29 = Static237.aClass1_Sub14_Sub1_7.method2614();
		Static237.aClass1_Sub14_Sub1_7.method2659();
		for (local35 = 0; local35 < 4; local35++) {
			for (local43 = 0; local43 < 13; local43++) {
				for (local49 = 0; local49 < 13; local49++) {
					local58 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
					if (local58 == 1) {
						Static268.anIntArrayArrayArray19[local35][local43][local49] = Static237.aClass1_Sub14_Sub1_7.method2657(26);
					} else {
						Static268.anIntArrayArrayArray19[local35][local43][local49] = -1;
					}
				}
			}
		}
		Static237.aClass1_Sub14_Sub1_7.method2663();
		local35 = (Static127.anInt2543 - Static237.aClass1_Sub14_Sub1_7.anInt3290) / 16;
		Static272.anIntArrayArray41 = new int[local35][4];
		for (local43 = 0; local43 < local35; local43++) {
			for (local49 = 0; local49 < 4; local49++) {
				Static272.anIntArrayArray41[local43][local49] = Static237.aClass1_Sub14_Sub1_7.method2620();
			}
		}
		local25 = Static4.method50(Static237.aClass1_Sub14_Sub1_7.method2596());
		local43 = Static237.aClass1_Sub14_Sub1_7.method2595();
		local49 = Static237.aClass1_Sub14_Sub1_7.method2593();
		Static272.anIntArray469 = new int[local35];
		Static156.aByteArrayArray10 = new byte[local35][];
		Static278.anIntArray487 = new int[local35];
		Static302.anIntArray522 = new int[local35];
		Static53.anIntArray89 = new int[local35];
		Static274.anIntArray473 = new int[local35];
		Static274.anIntArray472 = null;
		Static90.aByteArrayArray13 = new byte[local35][];
		Static206.aByteArrayArray12 = null;
		Static70.aByteArrayArray3 = new byte[local35][];
		Static254.aByteArrayArray14 = new byte[local35][];
		local35 = 0;
		for (local58 = 0; local58 < 4; local58++) {
			for (local155 = 0; local155 < 13; local155++) {
				for (local168 = 0; local168 < 13; local168++) {
					local181 = Static268.anIntArrayArrayArray19[local58][local155][local168];
					if (local181 != -1) {
						@Pc(517) int local517 = local181 >> 14 & 0x3FF;
						@Pc(523) int local523 = local181 >> 3 & 0x7FF;
						@Pc(534) int local534 = (local517 / 8 << 8) + (local523 / 8);
						@Pc(536) int local536;
						for (local536 = 0; local536 < local35; local536++) {
							if (Static278.anIntArray487[local536] == local534) {
								local534 = -1;
								break;
							}
						}
						if (local534 != -1) {
							Static278.anIntArray487[local35] = local534;
							@Pc(568) int local568 = local534 & 0xFF;
							local536 = local534 >> 8 & 0xFF;
							Static274.anIntArray473[local35] = Static124.aClass138_40.method3331("m" + local536 + "_" + local568);
							Static53.anIntArray89[local35] = Static124.aClass138_40.method3331("l" + local536 + "_" + local568);
							Static302.anIntArray522[local35] = Static124.aClass138_40.method3331("um" + local536 + "_" + local568);
							Static272.anIntArray469[local35] = Static124.aClass138_40.method3331("ul" + local536 + "_" + local568);
							local35++;
						}
					}
				}
			}
		}
		Static295.method4396(local19, false, local15, local25, local29, local43, local49);
	}
}
