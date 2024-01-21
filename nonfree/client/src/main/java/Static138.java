import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!r", name = "ab", descriptor = "Lclient!qb;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "[Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4[] aClass1_Sub1_Sub12_Sub4Array9;

	@OriginalMember(owner = "client!r", name = "P", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1318 = Static169.method2903(":assistreq:");

	@OriginalMember(owner = "client!r", name = "R", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1319 = Static169.method2903(")1j");

	@OriginalMember(owner = "client!r", name = "S", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1320 = Static169.method2903("event_opbase");

	@OriginalMember(owner = "client!r", name = "U", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1321 = Static169.method2903(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1322 = Static169.method2903("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!r", name = "db", descriptor = "I")
	public static int anInt3532 = 0;

	@OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
	public static final int anInt3535 = 2301979;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public static void method2423() {
		for (@Pc(8) int local8 = -1; local8 < Static152.anInt3549; local8++) {
			@Pc(16) int local16;
			if (local8 == -1) {
				local16 = 2047;
			} else {
				local16 = Static112.anIntArray382[local8];
			}
			@Pc(26) Class1_Sub1_Sub1_Sub1_Sub1 local26 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16];
			if (local26 != null) {
				Static152.method2441(1, local26);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method2426() {
		for (@Pc(15) Class1_Sub1_Sub1_Sub4 local15 = (Class1_Sub1_Sub1_Sub4) Static91.aClass56_7.method1853(); local15 != null; local15 = (Class1_Sub1_Sub1_Sub4) Static91.aClass56_7.method1855()) {
			if (Static85.anInt2267 != local15.anInt2941 || local15.anInt2927 < Static26.anInt845) {
				local15.method3141();
			} else if (local15.anInt2948 <= Static26.anInt845) {
				if (local15.anInt2930 > 0) {
					@Pc(46) Class1_Sub1_Sub1_Sub1_Sub2 local46 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local15.anInt2930 - 1];
					if (local46 != null && local46.anInt1838 >= 0 && local46.anInt1838 < 13312 && local46.anInt1825 >= 0 && local46.anInt1825 < 13312) {
						local15.method2028(Static26.anInt845, Static99.method1680(local46.anInt1825, local46.anInt1838, local15.anInt2941) - local15.anInt2937, local46.anInt1825, local46.anInt1838);
					}
				}
				if (local15.anInt2930 < 0) {
					@Pc(97) int local97 = -local15.anInt2930 - 1;
					@Pc(108) Class1_Sub1_Sub1_Sub1_Sub1 local108;
					if (Static72.anInt1984 == local97) {
						local108 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103;
					} else {
						local108 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local97];
					}
					if (local108 != null && local108.anInt1838 >= 0 && local108.anInt1838 < 13312 && local108.anInt1825 >= 0 && local108.anInt1825 < 13312) {
						local15.method2028(Static26.anInt845, Static99.method1680(local108.anInt1825, local108.anInt1838, local15.anInt2941) - local15.anInt2937, local108.anInt1825, local108.anInt1838);
					}
				}
				local15.method2027(Static58.anInt1635);
				Static123.aClass80_1.method2705(Static85.anInt2267, (int) local15.aDouble6, (int) local15.aDouble7, (int) local15.aDouble1, 60, local15, local15.anInt2926, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public static void method2429() {
		aClass25_1 = null;
		aClass23_1318 = null;
		aClass23_1321 = null;
		aClass1_Sub1_Sub12_Sub4Array9 = null;
		aClass23_1320 = null;
		aClass23_1322 = null;
		aClass23_1319 = null;
	}
}
