import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "Lclient!gi;")
	public static Class93 aClass93_3 = null;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_15 = new Class231("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "S")
	public static short aShort1 = 1;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIII)V")
	public static void method575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static254.method3553(local35, false, true);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!za;Lclient!l;I)V")
	public static void method576(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Interface7 arg1) {
		if (Static5.aClass2_Sub1_Sub14_2 == null) {
			return;
		}
		if (Static382.anInt6617 < 10) {
			if (!Static5.aClass171_92.method3655(Static5.aClass2_Sub1_Sub14_2.aString57)) {
				Static382.anInt6617 = Static340.aClass171_73.method3657(Static5.aClass2_Sub1_Sub14_2.aString57) / 10;
				return;
			}
			Static428.method5830();
			Static382.anInt6617 = 10;
		}
		if (Static382.anInt6617 == 10) {
			Static5.anInt6721 = Static5.aClass2_Sub1_Sub14_2.anInt5746 >> 6 << 6;
			Static5.anInt6729 = Static5.aClass2_Sub1_Sub14_2.anInt5741 >> 6 << 6;
			Static5.anInt6725 = (Static5.aClass2_Sub1_Sub14_2.anInt5753 >> 6 << 6) + 64 - Static5.anInt6721;
			Static5.anInt6726 = (Static5.aClass2_Sub1_Sub14_2.anInt5751 >> 6 << 6) + 64 - Static5.anInt6729;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static5.aClass2_Sub1_Sub14_2.method4552(Static153.anInt2798 + (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 >> 7), (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 >> 7) + Static386.anInt7205, Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101, local76)) {
				local80 = local76[2] - Static5.anInt6729;
				local78 = local76[1] - Static5.anInt6721;
			}
			if (!Static114.aBoolean111 && local78 >= 0 && Static5.anInt6725 > local78 && local80 >= 0 && Static5.anInt6726 > local80) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static180.anInt3183 = local80;
				Static204.anInt3501 = local78;
			} else if (Static418.anInt7175 == -1 || Static59.anInt6508 == -1) {
				Static5.aClass2_Sub1_Sub14_2.method4558(Static5.aClass2_Sub1_Sub14_2.anInt5748 & 0x3FFF, Static5.aClass2_Sub1_Sub14_2.anInt5748 >> 14 & 0x3FFF, local76);
				Static204.anInt3501 = local76[1] - Static5.anInt6721;
				Static180.anInt3183 = local76[2] - Static5.anInt6729;
			} else {
				Static5.aClass2_Sub1_Sub14_2.method4558(Static59.anInt6508, Static418.anInt7175, local76);
				Static114.aBoolean111 = false;
				Static59.anInt6508 = -1;
				Static418.anInt7175 = -1;
				if (local76 != null) {
					Static204.anInt3501 = local76[1] - Static5.anInt6721;
					Static180.anInt3183 = local76[2] - Static5.anInt6729;
				}
			}
			if (Static5.aClass2_Sub1_Sub14_2.anInt5744 == 37) {
				Static5.aFloat88 = 3.0F;
				Static5.aFloat87 = 3.0F;
			} else if (Static5.aClass2_Sub1_Sub14_2.anInt5744 == 50) {
				Static5.aFloat88 = 4.0F;
				Static5.aFloat87 = 4.0F;
			} else if (Static5.aClass2_Sub1_Sub14_2.anInt5744 == 75) {
				Static5.aFloat88 = 6.0F;
				Static5.aFloat87 = 6.0F;
			} else if (Static5.aClass2_Sub1_Sub14_2.anInt5744 == 100) {
				Static5.aFloat88 = 8.0F;
				Static5.aFloat87 = 8.0F;
			} else if (Static5.aClass2_Sub1_Sub14_2.anInt5744 == 200) {
				Static5.aFloat88 = 16.0F;
				Static5.aFloat87 = 16.0F;
			} else {
				Static5.aFloat88 = 8.0F;
				Static5.aFloat87 = 8.0F;
			}
			Static5.anInt6717 = (int) Static5.aFloat88 >> 1;
			Static5.aByteArrayArrayArray16 = Static424.method5816(Static5.anInt6717);
			Static423.method5788();
			Static5.method5396();
			Static463.aClass181_53 = new Class181();
			Static5.anInt6718 += (int) (Math.random() * 5.0D) - 2;
			if (Static5.anInt6718 < -8) {
				Static5.anInt6718 = -8;
			}
			if (Static5.anInt6718 > 8) {
				Static5.anInt6718 = 8;
			}
			Static5.anInt6719 += (int) (Math.random() * 5.0D) - 2;
			if (Static5.anInt6719 < -16) {
				Static5.anInt6719 = -16;
			}
			if (Static5.anInt6719 > 16) {
				Static5.anInt6719 = 16;
			}
			Static5.method5394(arg1, Static5.anInt6718 >> 2 << 10, Static5.anInt6719 >> 1);
			Static5.aClass84_4.method1952(256, 1024);
			Static5.aClass230_6.method5257(256, 256);
			Static5.aClass39_4.method752(4096);
			Static371.aClass211_1.method4912(256);
			Static382.anInt6617 = 20;
		} else if (Static382.anInt6617 == 20) {
			Static413.method5674(true);
			Static5.method5398(arg0, Static5.anInt6718, Static5.anInt6719);
			Static382.anInt6617 = 60;
			Static413.method5674(true);
			Static87.method1363();
		} else if (Static382.anInt6617 == 60) {
			if (Static5.aClass171_92.method3661(Static5.aClass2_Sub1_Sub14_2.aString57 + "_staticelements")) {
				if (!Static5.aClass171_92.method3655(Static5.aClass2_Sub1_Sub14_2.aString57 + "_staticelements")) {
					return;
				}
				Static5.aClass176_3 = Static280.method3978(Static5.aClass2_Sub1_Sub14_2.aString57 + "_staticelements", Static183.aBoolean205, Static5.aClass171_92);
			} else {
				Static5.aClass176_3 = new Class176(0);
			}
			Static5.method5391();
			Static382.anInt6617 = 70;
			Static413.method5674(true);
			Static87.method1363();
		} else if (Static382.anInt6617 == 70) {
			Static326.aClass223_6 = new Class223(arg0, 11, true, Static291.aCanvas6);
			Static382.anInt6617 = 73;
			Static413.method5674(true);
			Static87.method1363();
		} else if (Static382.anInt6617 == 73) {
			Static206.aClass223_3 = new Class223(arg0, 12, true, Static291.aCanvas6);
			Static382.anInt6617 = 76;
			Static413.method5674(true);
			Static87.method1363();
		} else if (Static382.anInt6617 == 76) {
			Static131.aClass223_2 = new Class223(arg0, 14, true, Static291.aCanvas6);
			Static382.anInt6617 = 79;
			Static413.method5674(true);
			Static87.method1363();
		} else if (Static382.anInt6617 == 79) {
			Static78.aClass223_1 = new Class223(arg0, 17, true, Static291.aCanvas6);
			Static382.anInt6617 = 82;
			Static413.method5674(true);
			Static87.method1363();
		} else if (Static382.anInt6617 == 82) {
			Static372.aClass223_7 = new Class223(arg0, 19, true, Static291.aCanvas6);
			Static382.anInt6617 = 85;
			Static413.method5674(true);
			Static87.method1363();
		} else if (Static382.anInt6617 == 85) {
			Static306.aClass223_4 = new Class223(arg0, 22, true, Static291.aCanvas6);
			Static382.anInt6617 = 88;
			Static413.method5674(true);
			Static87.method1363();
		} else if (Static382.anInt6617 == 88) {
			Static399.aClass223_8 = new Class223(arg0, 26, true, Static291.aCanvas6);
			Static382.anInt6617 = 91;
			Static413.method5674(true);
			Static87.method1363();
		} else {
			Static323.aClass223_5 = new Class223(arg0, 30, true, Static291.aCanvas6);
			Static382.anInt6617 = 100;
			Static413.method5674(true);
			Static87.method1363();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public static void method577() {
		if (!Static373.aBoolean444) {
			return;
		}
		while (true) {
			while (Static117.aClass65_Sub1Array1.length > Static271.anInt4921) {
				@Pc(26) Class65_Sub1 local26 = Static117.aClass65_Sub1Array1[Static271.anInt4921];
				if (local26 != null && local26.anInt1485 == -1) {
					if (Static397.aClass2_Sub44_2 == null) {
						Static397.aClass2_Sub44_2 = Static11.aClass233_1.method5271(local26.aString10);
					}
					@Pc(50) int local50 = Static397.aClass2_Sub44_2.anInt7320;
					if (local50 == -1) {
						return;
					}
					Static271.anInt4921++;
					local26.anInt1485 = local50;
					Static397.aClass2_Sub44_2 = null;
				} else {
					Static271.anInt4921++;
				}
			}
			return;
		}
	}
}
