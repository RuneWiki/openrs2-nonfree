import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
	public static int anInt186;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
	public static int anInt188 = 0;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
	public static int anInt191 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!km;I)[Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2[] method206(@OriginalArg(2) Class91 arg0, @OriginalArg(3) int arg1) {
		return Static240.method3698(0, arg1, arg0) ? Static66.method1198() : null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZ)V")
	public static void method207(@OriginalArg(0) boolean arg0) {
		Static127.aBoolean210 = arg0;
		@Pc(142) boolean local142;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(28) int local28;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(50) int local50;
		@Pc(187) int local187;
		@Pc(192) int local192;
		@Pc(205) int local205;
		if (!Static127.aBoolean210) {
			local19 = Static187.aClass1_Sub11_Sub1_2.method2661();
			local23 = Static187.aClass1_Sub11_Sub1_2.method2631();
			local28 = (Static33.anInt762 - Static187.aClass1_Sub11_Sub1_2.anInt3264) / 16;
			Static124.anIntArrayArray9 = new int[local28][4];
			for (local35 = 0; local35 < local28; local35++) {
				for (local40 = 0; local40 < 4; local40++) {
					Static124.anIntArrayArray9[local35][local40] = Static187.aClass1_Sub11_Sub1_2.method2643();
				}
			}
			local35 = Static187.aClass1_Sub11_Sub1_2.method2639();
			local142 = Static101.method1895(Static187.aClass1_Sub11_Sub1_2.method2675());
			local40 = Static187.aClass1_Sub11_Sub1_2.method2691();
			@Pc(436) boolean local436 = false;
			if ((local19 / 8 == 48 || local19 / 8 == 49) && local23 / 8 == 48) {
				local436 = true;
			}
			local50 = Static187.aClass1_Sub11_Sub1_2.method2690();
			Static189.anIntArray350 = new int[local28];
			Static136.anIntArray379 = new int[local28];
			Static170.aByteArrayArray9 = null;
			Static24.anIntArray414 = new int[local28];
			Static39.aByteArrayArray5 = new byte[local28][];
			Static270.aByteArrayArray14 = new byte[local28][];
			Static143.aByteArrayArray8 = new byte[local28][];
			Static202.anIntArray365 = new int[local28];
			if (local19 / 8 == 48 && local23 / 8 == 148) {
				local436 = true;
			}
			Static16.aByteArrayArray2 = new byte[local28][];
			Static225.anIntArray398 = new int[local28];
			local28 = 0;
			Static118.anIntArray250 = null;
			for (local187 = (local19 - 6) / 8; local187 <= (local19 + 6) / 8; local187++) {
				for (local192 = (local23 - 6) / 8; local192 <= (local23 + 6) / 8; local192++) {
					local205 = local192 + (local187 << 8);
					if (local436 && (local192 == 49 || local192 == 149 || local192 == 147 || local187 == 50 || local187 == 49 && local192 == 47)) {
						Static24.anIntArray414[local28] = local205;
						Static136.anIntArray379[local28] = -1;
						Static202.anIntArray365[local28] = -1;
						Static225.anIntArray398[local28] = -1;
						Static189.anIntArray350[local28] = -1;
					} else {
						Static24.anIntArray414[local28] = local205;
						Static136.anIntArray379[local28] = Static203.aClass91_157.method2504("m" + local187 + "_" + local192);
						Static202.anIntArray365[local28] = Static203.aClass91_157.method2504("l" + local187 + "_" + local192);
						Static225.anIntArray398[local28] = Static203.aClass91_157.method2504("um" + local187 + "_" + local192);
						Static189.anIntArray350[local28] = Static203.aClass91_157.method2504("ul" + local187 + "_" + local192);
					}
					local28++;
				}
			}
			Static102.method1907(local19, false, local142, local35, local50, local40, local23);
			return;
		}
		local19 = Static187.aClass1_Sub11_Sub1_2.method2661();
		local23 = Static187.aClass1_Sub11_Sub1_2.method2639();
		Static187.aClass1_Sub11_Sub1_2.method2699();
		for (local28 = 0; local28 < 4; local28++) {
			for (local35 = 0; local35 < 13; local35++) {
				for (local40 = 0; local40 < 13; local40++) {
					local50 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
					if (local50 == 1) {
						Static33.anIntArrayArrayArray2[local28][local35][local40] = Static187.aClass1_Sub11_Sub1_2.method2701(26);
					} else {
						Static33.anIntArrayArrayArray2[local28][local35][local40] = -1;
					}
				}
			}
		}
		Static187.aClass1_Sub11_Sub1_2.method2692();
		local28 = (Static33.anInt762 - Static187.aClass1_Sub11_Sub1_2.anInt3264) / 16;
		Static124.anIntArrayArray9 = new int[local28][4];
		for (local35 = 0; local35 < local28; local35++) {
			for (local40 = 0; local40 < 4; local40++) {
				Static124.anIntArrayArray9[local35][local40] = Static187.aClass1_Sub11_Sub1_2.method2643();
			}
		}
		local35 = Static187.aClass1_Sub11_Sub1_2.method2675();
		local40 = Static187.aClass1_Sub11_Sub1_2.method2631();
		local142 = Static101.method1895(Static187.aClass1_Sub11_Sub1_2.method2647());
		local50 = Static187.aClass1_Sub11_Sub1_2.method2691();
		Static143.aByteArrayArray8 = new byte[local28][];
		Static270.aByteArrayArray14 = new byte[local28][];
		Static39.aByteArrayArray5 = new byte[local28][];
		Static170.aByteArrayArray9 = null;
		Static24.anIntArray414 = new int[local28];
		Static16.aByteArrayArray2 = new byte[local28][];
		Static118.anIntArray250 = null;
		Static189.anIntArray350 = new int[local28];
		Static225.anIntArray398 = new int[local28];
		Static202.anIntArray365 = new int[local28];
		Static136.anIntArray379 = new int[local28];
		local28 = 0;
		for (@Pc(182) int local182 = 0; local182 < 4; local182++) {
			for (local187 = 0; local187 < 13; local187++) {
				for (local192 = 0; local192 < 13; local192++) {
					local205 = Static33.anIntArrayArrayArray2[local182][local187][local192];
					if (local205 != -1) {
						@Pc(214) int local214 = local205 >> 14 & 0x3FF;
						@Pc(220) int local220 = local205 >> 3 & 0x7FF;
						@Pc(230) int local230 = local220 / 8 + (local214 / 8 << 8);
						@Pc(232) int local232;
						for (local232 = 0; local232 < local28; local232++) {
							if (local230 == Static24.anIntArray414[local232]) {
								local230 = -1;
								break;
							}
						}
						if (local230 != -1) {
							local232 = local230 >> 8 & 0xFF;
							Static24.anIntArray414[local28] = local230;
							@Pc(273) int local273 = local230 & 0xFF;
							Static136.anIntArray379[local28] = Static203.aClass91_157.method2504("m" + local232 + "_" + local273);
							Static202.anIntArray365[local28] = Static203.aClass91_157.method2504("l" + local232 + "_" + local273);
							Static225.anIntArray398[local28] = Static203.aClass91_157.method2504("um" + local232 + "_" + local273);
							Static189.anIntArray350[local28] = Static203.aClass91_157.method2504("ul" + local232 + "_" + local273);
							local28++;
						}
					}
				}
			}
		}
		Static102.method1907(local40, false, local142, local19, local35, local50, local23);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!km;)V")
	public static void method208(@OriginalArg(1) Class91 arg0) {
		Static265.aClass91_191 = arg0;
		Static180.anInt3781 = Static265.aClass91_191.method2510(16);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	public static void method209() {
		Static250.aClass135_32.method3320(5);
		Static115.aClass135_12.method3320(5);
	}
}
