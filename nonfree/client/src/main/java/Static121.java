import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_18;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean175 = false;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "I")
	public static int anInt3167 = 0;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "I")
	public static int anInt3168 = 2;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!he;")
	public static Class26 aClass26_1724 = Static6.method100("Sprites geladen)3");

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Lclient!he;")
	private static Class26 aClass26_1726 = Static6.method100("K");

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!he;")
	public static Class26 aClass26_1725 = aClass26_1726;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "I")
	public static int anInt3170 = 0;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "Lclient!he;")
	public static Class26 aClass26_1727 = aClass26_1726;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method2166() {
		aClass26_1726 = null;
		aClass26_1724 = null;
		aClass26_1727 = null;
		aClass16_Sub1_18 = null;
		aClass26_1725 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method2167() {
		Static106.anIntArray342 = new int[104];
		Static24.aByteArrayArrayArray1 = new byte[4][104][104];
		Static32.anInt1043 = 99;
		Static44.anIntArray142 = new int[104];
		Static117.anIntArray368 = new int[104];
		Static71.aByteArrayArrayArray4 = new byte[4][104][104];
		Static86.aByteArrayArrayArray6 = new byte[4][105][105];
		Static15.anIntArrayArrayArray1 = new int[4][105][105];
		Static108.anIntArray346 = new int[104];
		Static71.aByteArrayArrayArray3 = new byte[4][104][104];
		Static98.aByteArrayArrayArray7 = new byte[4][104][104];
		Static74.anIntArray200 = new int[104];
		Static58.anIntArrayArray14 = new int[105][105];
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!d;I)V")
	public static void method2168(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub5_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		if ((arg2 & 0x100) != 0) {
			local21 = Static33.aClass3_Sub11_Sub1_2.method1005();
			local25 = Static33.aClass3_Sub11_Sub1_2.method1005();
			arg1.method1879(local21, Static4.anInt136, local25);
			arg1.anInt2735 = Static4.anInt136 + 300;
			arg1.anInt2725 = Static33.aClass3_Sub11_Sub1_2.method1004();
			arg1.anInt2727 = Static33.aClass3_Sub11_Sub1_2.method1004();
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt2698 = Static33.aClass3_Sub11_Sub1_2.method974();
			local21 = Static33.aClass3_Sub11_Sub1_2.method1002();
			arg1.anInt2710 = 0;
			arg1.anInt2711 = 0;
			if (arg1.anInt2698 == 65535) {
				arg1.anInt2698 = -1;
			}
			arg1.anInt2705 = (local21 & 0xFFFF) + Static4.anInt136;
			arg1.anInt2700 = local21 >> 16;
			if (arg1.anInt2705 > Static4.anInt136) {
				arg1.anInt2711 = -1;
			}
		}
		if ((arg2 & 0x8) != 0) {
			arg1.anInt2749 = Static33.aClass3_Sub11_Sub1_2.method978();
			if (arg1.anInt2749 == 65535) {
				arg1.anInt2749 = -1;
			}
		}
		if ((arg2 & 0x4) != 0) {
			arg1.anInt2748 = Static33.aClass3_Sub11_Sub1_2.method1000();
			arg1.anInt2702 = Static33.aClass3_Sub11_Sub1_2.method1000();
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt2709 = Static33.aClass3_Sub11_Sub1_2.method1005();
			arg1.anInt2740 = Static33.aClass3_Sub11_Sub1_2.method1005();
			arg1.anInt2739 = Static33.aClass3_Sub11_Sub1_2.method1005();
			arg1.anInt2703 = Static33.aClass3_Sub11_Sub1_2.method1004();
			arg1.anInt2696 = Static33.aClass3_Sub11_Sub1_2.method988() + Static4.anInt136;
			arg1.anInt2742 = Static33.aClass3_Sub11_Sub1_2.method974() + Static4.anInt136;
			arg1.anInt2713 = Static33.aClass3_Sub11_Sub1_2.method973();
			arg1.anInt2706 = 0;
			arg1.anInt2699 = 1;
		}
		if ((arg2 & 0x80) != 0) {
			arg1.aClass26_1479 = Static33.aClass3_Sub11_Sub1_2.method977();
			if (arg1.aClass26_1479.method848(0) == 126) {
				arg1.aClass26_1479 = arg1.aClass26_1479.method819(1);
				Static67.method1915(arg1.aClass26_1479, arg1.aClass26_393, 2);
			} else if (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1 == arg1) {
				Static67.method1915(arg1.aClass26_1479, arg1.aClass26_393, 2);
			}
			arg1.anInt2719 = 150;
			arg1.anInt2693 = 0;
			arg1.anInt2697 = 0;
		}
		if ((arg2 & 0x20) != 0) {
			local21 = Static33.aClass3_Sub11_Sub1_2.method978();
			if (local21 == 65535) {
				local21 = -1;
			}
			local25 = Static33.aClass3_Sub11_Sub1_2.method973();
			Static105.method1951(local25, arg1, local21);
		}
		if ((arg2 & 0x1) != 0) {
			local21 = Static33.aClass3_Sub11_Sub1_2.method1000();
			local25 = Static33.aClass3_Sub11_Sub1_2.method1004();
			@Pc(279) int local279 = Static33.aClass3_Sub11_Sub1_2.method981();
			@Pc(282) int local282 = Static33.aClass3_Sub11_Sub1_2.anInt1562;
			if (arg1.aClass26_393 != null && arg1.aClass35_1 != null) {
				@Pc(293) long local293 = arg1.aClass26_393.method820();
				@Pc(295) boolean local295 = false;
				if (local25 <= 1) {
					for (@Pc(300) int local300 = 0; local300 < Static44.anInt1362; local300++) {
						if (Static14.aLongArray1[local300] == local293) {
							local295 = true;
							break;
						}
					}
				}
				if (!local295 && Static131.anInt3269 == 0) {
					Static65.aClass3_Sub11_22.anInt1562 = 0;
					Static33.aClass3_Sub11_Sub1_2.method985(Static65.aClass3_Sub11_22.aByteArray13, local279);
					Static65.aClass3_Sub11_22.anInt1562 = 0;
					@Pc(350) Class26 local350 = Static129.method1614(Static114.method2078(Static65.aClass3_Sub11_22).method815());
					arg1.aClass26_1479 = local350.method829();
					arg1.anInt2719 = 150;
					arg1.anInt2693 = local21 & 0xFF;
					arg1.anInt2697 = local21 >> 8;
					if (local25 == 2 || local25 == 3) {
						Static67.method1915(local350, Static119.method2136(new Class26[] { Static105.aClass26_1537, arg1.aClass26_393 }), 1);
					} else if (local25 == 1) {
						Static67.method1915(local350, Static119.method2136(new Class26[] { Static76.aClass26_1077, arg1.aClass26_393 }), 1);
					} else {
						Static67.method1915(local350, arg1.aClass26_393, 2);
					}
				}
			}
			Static33.aClass3_Sub11_Sub1_2.anInt1562 = local279 + local282;
		}
		if ((arg2 & 0x2) != 0) {
			local21 = Static33.aClass3_Sub11_Sub1_2.method1004();
			local25 = Static33.aClass3_Sub11_Sub1_2.method1005();
			arg1.method1879(local21, Static4.anInt136, local25);
			arg1.anInt2735 = Static4.anInt136 + 300;
			arg1.anInt2725 = Static33.aClass3_Sub11_Sub1_2.method1005();
			arg1.anInt2727 = Static33.aClass3_Sub11_Sub1_2.method1005();
		}
		if ((arg2 & 0x40) == 0) {
			return;
		}
		local21 = Static33.aClass3_Sub11_Sub1_2.method1004();
		@Pc(478) byte[] local478 = new byte[local21];
		@Pc(483) Class3_Sub11 local483 = new Class3_Sub11(local478);
		Static33.aClass3_Sub11_Sub1_2.method1018(local21, local478);
		Static40.aClass3_Sub11Array1[arg0] = local483;
		arg1.method477(local483);
	}
}
