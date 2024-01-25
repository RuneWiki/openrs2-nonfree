import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Lclient!ra;")
	public static Class170 aClass170_13;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!bm;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
	public static int anInt1288;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "[I")
	public static final int[] anIntArray58 = new int[200];

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Lclient!gg;")
	public static Class5_Sub9_Sub8 method1134() {
		return Static186.aClass5_Sub9_Sub8_3;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public static void method1136() {
		@Pc(5) Class66 local5 = Static59.aClass66_20;
		synchronized (Static59.aClass66_20) {
			Static59.aClass66_20.method1942();
		}
		local5 = Static43.aClass66_14;
		synchronized (Static43.aClass66_14) {
			Static43.aClass66_14.method1942();
		}
		local5 = Static287.aClass66_96;
		synchronized (Static287.aClass66_96) {
			Static287.aClass66_96.method1942();
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public static void method1139() {
		for (@Pc(16) Class5_Sub9_Sub4 local16 = (Class5_Sub9_Sub4) Static262.aClass211_32.method5608(); local16 != null; local16 = (Class5_Sub9_Sub4) Static262.aClass211_32.method5603()) {
			@Pc(21) Class25_Sub1_Sub3 local21 = local16.aClass25_Sub1_Sub3_1;
			if (Static156.anInt3123 != local21.aByte62 || Static180.anInt3606 > local21.anInt1507) {
				local16.method5803();
				local21.method1322();
			} else if (local21.anInt1490 <= Static180.anInt3606) {
				if (local21.anInt1510 > 0) {
					@Pc(63) Class25_Sub1_Sub1_Sub2 local63 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local21.anInt1510 - 1];
					if (local63 != null && local63.anInt5769 >= 0 && Static266.anInt5101 * 128 > local63.anInt5769 && local63.anInt5773 >= 0 && local63.anInt5773 < Static339.anInt6352 * 128) {
						local21.method1316(local63.anInt5773, Static66.method1393(local63.anInt5773, local21.aByte62, local63.anInt5769) - local21.anInt1497, local63.anInt5769, Static180.anInt3606);
					}
				}
				if (local21.anInt1510 < 0) {
					@Pc(121) int local121 = -local21.anInt1510 - 1;
					@Pc(126) Class25_Sub1_Sub1_Sub1 local126;
					if (local121 == Static99.anInt2186) {
						local126 = Static85.aClass25_Sub1_Sub1_Sub1_1;
					} else {
						local126 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local121];
					}
					if (local126 != null && local126.anInt5769 >= 0 && Static266.anInt5101 * 128 > local126.anInt5769 && local126.anInt5773 >= 0 && local126.anInt5773 < Static339.anInt6352 * 128) {
						local21.method1316(local126.anInt5773, Static66.method1393(local126.anInt5773, local21.aByte62, local126.anInt5769) - local21.anInt1497, local126.anInt5769, Static180.anInt3606);
					}
				}
				local21.method1321(Static346.anInt6449);
				Static82.method1817(local21, true);
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method1141(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; local9 < Static161.anInt3258; local9++) {
			@Pc(17) Class25_Sub1_Sub1_Sub1 local17 = Static312.aClass25_Sub1_Sub1_Sub1Array1[Static220.anIntArray311[local9]];
			if (local17 != null && local17.aString237 != null && local17.aString237.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static335.aClass5_Sub1_Sub1_3.method174(57);
					Static335.aClass5_Sub1_Sub1_3.method1870(Static220.anIntArray311[local9]);
					Static335.aClass5_Sub1_Sub1_3.method1886(0);
				} else if (arg0 == 4) {
					Static335.aClass5_Sub1_Sub1_3.method174(114);
					Static335.aClass5_Sub1_Sub1_3.method1870(Static220.anIntArray311[local9]);
					Static335.aClass5_Sub1_Sub1_3.method1886(0);
				} else if (arg0 == 5) {
					Static335.aClass5_Sub1_Sub1_3.method174(205);
					Static335.aClass5_Sub1_Sub1_3.method1861(Static220.anIntArray311[local9]);
					Static335.aClass5_Sub1_Sub1_3.method1835(0);
				} else if (arg0 == 6) {
					Static335.aClass5_Sub1_Sub1_3.method174(144);
					Static335.aClass5_Sub1_Sub1_3.method1886(0);
					Static335.aClass5_Sub1_Sub1_3.method1861(Static220.anIntArray311[local9]);
				} else if (arg0 == 7) {
					Static335.aClass5_Sub1_Sub1_3.method174(218);
					Static335.aClass5_Sub1_Sub1_3.method1886(0);
					Static335.aClass5_Sub1_Sub1_3.method1861(Static220.anIntArray311[local9]);
				}
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static217.method3824(Static251.aString289 + arg1);
		}
	}
}
