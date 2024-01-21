import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "[I")
	public static int[] anIntArray437;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_23;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Lclient!pb;")
	public static Class41 aClass41_74;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1767 = Static69.method1153("Hidden");

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1769 = Static69.method1153("Loading ignore list");

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1768 = aClass64_1769;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "[Lclient!ia;")
	public static Class34[] aClass34Array5 = new Class34[50];

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public static final int anInt2760 = 50;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
	public static int[] anIntArray438 = new int[25];

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1771 = Static69.method1153("Username: ");

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1770 = aClass64_1771;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1772 = aClass64_1767;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1773 = Static69.method1153("Ausw-=hlen");

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1774 = Static69.method1153("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1775 = Static69.method1153("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method2022() {
		aClass64_1773 = null;
		anIntArray437 = null;
		aClass64_1769 = null;
		aClass34Array5 = null;
		aClass41_Sub1_23 = null;
		aClass64_1772 = null;
		aClass64_1767 = null;
		aClass64_1775 = null;
		aClass64_1768 = null;
		aClass64_1770 = null;
		anIntArray438 = null;
		aClass41_74 = null;
		aClass64_1771 = null;
		aClass64_1774 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([II)V")
	public static synchronized void method2023(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		if (Static86.aBoolean123) {
			local1 = arg1 << 1;
		}
		@Pc(9) int local9 = 0;
		local1 -= 7;
		while (local9 < local1) {
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
		}
		local1 += 7;
		while (local9 < local1) {
			arg0[local9++] = 0;
		}
		Static64.anInt1484 -= arg1;
		if (Static105.aClass1_Sub2_4 != null && Static64.anInt1484 <= 0) {
			Static64.anInt1484 += Static43.anInt980 >> 4;
			Static57.method965(Static105.aClass1_Sub2_4);
			Static113.method1308(Static105.aClass1_Sub2_4, Static105.aClass1_Sub2_4.method1517());
			@Pc(88) int local88 = 0;
			@Pc(90) int local90 = 255;
			@Pc(92) int local92 = 7;
			@Pc(99) int local99;
			label110: while (local90 != 0) {
				@Pc(104) int local104;
				if (local92 < 0) {
					local99 = local92 & 0x3;
					local104 = -(local92 >> 2);
				} else {
					local99 = local92;
					local104 = 0;
				}
				for (@Pc(115) int local115 = local90 >>> local99 & 0x11111111; local115 != 0; local115 >>>= 0x4) {
					if ((local115 & 0x1) != 0) {
						local90 &= ~(0x1 << local99);
						@Pc(131) Class1_Sub2 local131 = null;
						@Pc(135) Class1_Sub2 local135 = Static85.aClass1_Sub2Array4[local99];
						label104: while (true) {
							while (true) {
								if (local135 == null) {
									break label104;
								}
								@Pc(139) Class1_Sub4 local139 = local135.aClass1_Sub4_3;
								if (local139 == null || local139.anInt1628 <= local104) {
									local135.aBoolean128 = true;
									@Pc(163) int local163 = local135.method1513();
									local88 += local163;
									if (local139 != null) {
										local139.anInt1628 += local163;
									}
									if (local88 >= Static19.anInt612) {
										break label110;
									}
									@Pc(181) Class1_Sub2 local181 = local135.method1514();
									if (local181 != null) {
										@Pc(186) int local186 = local135.anInt2117;
										while (local181 != null) {
											Static113.method1308(local181, local186 * local181.method1517() >> 8);
											local181 = local135.method1518();
										}
									}
									@Pc(204) Class1_Sub2 local204 = local135.aClass1_Sub2_3;
									local135.aClass1_Sub2_3 = null;
									if (local131 == null) {
										Static85.aClass1_Sub2Array4[local99] = local204;
									} else {
										local131.aClass1_Sub2_3 = local204;
									}
									if (local204 == null) {
										Static110.aClass1_Sub2Array3[local99] = local131;
									}
									local135 = local204;
								} else {
									local90 |= 0x1 << local99;
									local131 = local135;
									local135 = local135.aClass1_Sub2_3;
								}
							}
						}
					}
					local99 += 4;
					local104++;
				}
				local92--;
			}
			for (local99 = 0; local99 < 8; local99++) {
				@Pc(244) Class1_Sub2 local244 = Static85.aClass1_Sub2Array4[local99];
				Static85.aClass1_Sub2Array4[local99] = Static110.aClass1_Sub2Array3[local99] = null;
				while (local244 != null) {
					@Pc(256) Class1_Sub2 local256 = local244.aClass1_Sub2_3;
					local244.aClass1_Sub2_3 = null;
					local244 = local256;
				}
			}
		}
		if (Static64.anInt1484 < 0) {
			Static64.anInt1484 = 0;
		}
		if (Static105.aClass1_Sub2_4 != null) {
			Static105.aClass1_Sub2_4.method1512(arg0, 0, arg1);
		}
		Static72.method1192(arg1);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public static synchronized void method2025() {
		Static64.anInt1484 -= 256;
		if (Static64.anInt1484 < 0) {
			Static64.anInt1484 = 0;
		}
		if (Static105.aClass1_Sub2_4 != null) {
			Static105.aClass1_Sub2_4.method1515(256);
		}
		Static72.method1192(256);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!mc;)V")
	public static synchronized void method2026(@OriginalArg(1) Class1_Sub2 arg0) {
		Static105.aClass1_Sub2_4 = arg0;
	}
}
