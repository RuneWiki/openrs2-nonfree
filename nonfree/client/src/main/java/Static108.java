import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
	public static int anInt2582 = 0;

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "Lclient!kb;")
	private static Class46 aClass46_854 = Static65.method1172("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "Lclient!kb;")
	public static Class46 aClass46_850 = aClass46_854;

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
	public static int anInt2585 = 0;

	@OriginalMember(owner = "client!nf", name = "W", descriptor = "Lclient!kb;")
	public static Class46 aClass46_851 = Static65.method1172("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
	public static int anInt2586 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "Lclient!kb;")
	private static Class46 aClass46_853 = Static65.method1172("Password: ");

	@OriginalMember(owner = "client!nf", name = "Y", descriptor = "Lclient!kb;")
	public static Class46 aClass46_852 = aClass46_853;

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!rd;)V")
	public static void method1768(@OriginalArg(1) Class3_Sub4 arg0) {
		if (Static135.aClass6_5 != null) {
			try {
				Static135.aClass6_5.method295(0L);
				Static135.aClass6_5.method287(24, arg0.anInt232, arg0.aByteArray5);
			} catch (@Pc(24) Exception local24) {
			}
		}
		arg0.anInt232 += 24;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(ZI)V")
	public static void method1769(@OriginalArg(0) boolean arg0) {
		Static174.aBoolean166 = arg0;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(39) int local39;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(75) int local75;
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(151) int local151;
		if (!Static174.aBoolean166) {
			local24 = Static49.aClass3_Sub4_Sub1_2.method174();
			local28 = Static49.aClass3_Sub4_Sub1_2.method184();
			local32 = Static49.aClass3_Sub4_Sub1_2.method223();
			local39 = (Static139.anInt3221 - Static49.aClass3_Sub4_Sub1_2.anInt232) / 16;
			Static149.anIntArrayArray37 = new int[local39][4];
			for (local45 = 0; local45 < local39; local45++) {
				for (local49 = 0; local49 < 4; local49++) {
					Static149.anIntArrayArray37[local45][local49] = Static49.aClass3_Sub4_Sub1_2.method213();
				}
			}
			local49 = Static49.aClass3_Sub4_Sub1_2.method171();
			local75 = Static49.aClass3_Sub4_Sub1_2.method184();
			Static52.anIntArray129 = new int[local39];
			Static66.anIntArray166 = new int[local39];
			Static140.aByteArrayArray3 = new byte[local39][];
			@Pc(86) boolean local86 = false;
			Static116.aByteArrayArray11 = new byte[local39][];
			if ((local28 / 8 == 48 || local28 / 8 == 49) && (local24 / 8) == 48) {
				local86 = true;
			}
			if (local28 / 8 == 48 && local24 / 8 == 148) {
				local86 = true;
			}
			Static181.anIntArray444 = new int[local39];
			local39 = 0;
			for (local135 = (local28 - 6) / 8; local135 <= (local28 + 6) / 8; local135++) {
				for (local143 = (local24 - 6) / 8; local143 <= (local24 + 6) / 8; local143++) {
					local151 = local143 + (local135 << 8);
					if (!local86 || local143 != 49 && local143 != 149 && local143 != 147 && local135 != 50 && (local135 != 49 || local143 != 47)) {
						Static181.anIntArray444[local39] = local151;
						Static52.anIntArray129[local39] = Static51.aClass44_Sub1_3.method1617(Static178.method2860(new Class46[] { Static33.aClass46_251, Static57.method1068(local135), Static96.aClass46_787, Static57.method1068(local143) }));
						Static66.anIntArray166[local39] = Static51.aClass44_Sub1_3.method1617(Static178.method2860(new Class46[] { Static2.aClass46_3, Static57.method1068(local135), Static96.aClass46_787, Static57.method1068(local143) }));
						local39++;
					}
				}
			}
			Static91.method1511(local49, local28, local75, local24, local32);
			return;
		}
		local24 = Static49.aClass3_Sub4_Sub1_2.method171();
		local28 = Static49.aClass3_Sub4_Sub1_2.method205();
		Static49.aClass3_Sub4_Sub1_2.method227();
		for (local32 = 0; local32 < 4; local32++) {
			for (local39 = 0; local39 < 13; local39++) {
				for (local45 = 0; local45 < 13; local45++) {
					local49 = Static49.aClass3_Sub4_Sub1_2.method228(1);
					if (local49 == 1) {
						Static49.anIntArrayArrayArray1[local32][local39][local45] = Static49.aClass3_Sub4_Sub1_2.method228(26);
					} else {
						Static49.anIntArrayArrayArray1[local32][local39][local45] = -1;
					}
				}
			}
		}
		Static49.aClass3_Sub4_Sub1_2.method231();
		local39 = (Static139.anInt3221 - Static49.aClass3_Sub4_Sub1_2.anInt232) / 16;
		Static149.anIntArrayArray37 = new int[local39][4];
		for (local45 = 0; local45 < local39; local45++) {
			for (local49 = 0; local49 < 4; local49++) {
				Static149.anIntArrayArray37[local45][local49] = Static49.aClass3_Sub4_Sub1_2.method212();
			}
		}
		local49 = Static49.aClass3_Sub4_Sub1_2.method174();
		local75 = Static49.aClass3_Sub4_Sub1_2.method208();
		@Pc(407) int local407 = Static49.aClass3_Sub4_Sub1_2.method174();
		Static66.anIntArray166 = new int[local39];
		Static181.anIntArray444 = new int[local39];
		Static116.aByteArrayArray11 = new byte[local39][];
		Static52.anIntArray129 = new int[local39];
		Static140.aByteArrayArray3 = new byte[local39][];
		local39 = 0;
		for (local135 = 0; local135 < 4; local135++) {
			for (local143 = 0; local143 < 13; local143++) {
				for (local151 = 0; local151 < 13; local151++) {
					@Pc(444) int local444 = Static49.anIntArrayArrayArray1[local135][local143][local151];
					if (local444 != -1) {
						@Pc(453) int local453 = local444 >> 14 & 0x3FF;
						@Pc(459) int local459 = local444 >> 3 & 0x7FF;
						@Pc(469) int local469 = (local453 / 8 << 8) + local459 / 8;
						for (@Pc(471) int local471 = 0; local471 < local39; local471++) {
							if (Static181.anIntArray444[local471] == local469) {
								local469 = -1;
								break;
							}
						}
						if (local469 != -1) {
							Static181.anIntArray444[local39] = local469;
							@Pc(507) int local507 = local469 >> 8 & 0xFF;
							@Pc(511) int local511 = local469 & 0xFF;
							Static52.anIntArray129[local39] = Static51.aClass44_Sub1_3.method1617(Static178.method2860(new Class46[] { Static33.aClass46_251, Static57.method1068(local507), Static96.aClass46_787, Static57.method1068(local511) }));
							Static66.anIntArray166[local39] = Static51.aClass44_Sub1_3.method1617(Static178.method2860(new Class46[] { Static2.aClass46_3, Static57.method1068(local507), Static96.aClass46_787, Static57.method1068(local511) }));
							local39++;
						}
					}
				}
			}
		}
		Static91.method1511(local24, local407, local75, local49, local28);
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
	public static void method1770() {
		aRandom1 = null;
		aClass46_853 = null;
		aClass46_850 = null;
		aClass46_852 = null;
		aClass46_854 = null;
		aClass46_851 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIZ)Z")
	public static boolean method1771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = Static154.aClass62_1.method1967(Static99.anInt2422, arg2, arg0, arg1);
		@Pc(18) int local18 = arg1 >> 14 & 0x7FFF;
		if (local12 == -1) {
			return false;
		}
		@Pc(28) int local28 = local12 & 0x1F;
		@Pc(34) int local34 = local12 >> 6 & 0x3;
		if (local28 == 10 || local28 == 11 || local28 == 22) {
			@Pc(51) Class3_Sub2_Sub9 local51 = Static136.method2319(local18);
			@Pc(64) int local64;
			@Pc(67) int local67;
			if (local34 == 0 || local34 == 2) {
				local64 = local51.anInt1795;
				local67 = local51.anInt1825;
			} else {
				local64 = local51.anInt1825;
				local67 = local51.anInt1795;
			}
			@Pc(78) int local78 = local51.anInt1813;
			if (local34 != 0) {
				local78 = (local78 << local34 & 0xF) + (local78 >> 4 - local34);
			}
			Static6.method100(0, true, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], local64, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], arg0, local78, local67, 0, arg2);
		} else {
			Static6.method100(local28 + 1, true, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 0, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], arg0, 0, 0, local34, arg2);
		}
		Static23.anInt542 = 0;
		Static4.anInt3715 = Static48.anInt1329;
		Static13.anInt356 = Static77.anInt1923;
		Static182.anInt4022 = 2;
		return true;
	}
}
