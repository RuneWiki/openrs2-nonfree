import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public static int anInt963;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	public static int anInt962 = 0;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "Lclient!tg;")
	private static Class81 aClass81_339 = Static120.method2057("M");

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_331 = aClass81_339;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Lclient!tg;")
	private static Class81 aClass81_335 = Static120.method2057("Select a world");

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!tg;")
	public static Class81 aClass81_332 = aClass81_335;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_333 = Static120.method2057("Null");

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	public static int anInt964 = 0;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!tg;")
	public static Class81 aClass81_334 = Static120.method2057(" loggt sich ein)3");

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "[Lclient!tg;")
	public static Class81[] aClass81Array2 = new Class81[500];

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "Lclient!tg;")
	public static Class81 aClass81_336 = Static120.method2057(" )2> ");

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Lclient!tg;")
	public static Class81 aClass81_337 = Static120.method2057("Titelbild geladen)3");

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_338 = Static120.method2057("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public static int anInt969 = 0;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "Lclient!tg;")
	public static Class81 aClass81_340 = aClass81_339;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "Lclient!tg;")
	public static Class81 aClass81_341 = Static120.method2057(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method739() {
		aClass81_340 = null;
		aClass81_338 = null;
		aClass81_336 = null;
		aClass81_337 = null;
		aClass81Array2 = null;
		aClass81_332 = null;
		aClass81_331 = null;
		aClass81_339 = null;
		aClass81_334 = null;
		aClass81_341 = null;
		aClass81_335 = null;
		aClass81_333 = null;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	public static void method740() {
		Static21.aClass1_Sub8_Sub1_1.method371();
		@Pc(11) int local11 = Static21.aClass1_Sub8_Sub1_1.method375(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static21.aClass1_Sub8_Sub1_1.method375(2);
		if (local19 == 0) {
			Static90.anIntArray221[Static77.anInt1829++] = 2047;
			return;
		}
		@Pc(51) int local51;
		if (local19 == 1) {
			@Pc(41) int local41 = Static21.aClass1_Sub8_Sub1_1.method375(3);
			Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.method2358(local41, false);
			local51 = Static21.aClass1_Sub8_Sub1_1.method375(1);
			if (local51 == 1) {
				Static90.anIntArray221[Static77.anInt1829++] = 2047;
			}
			return;
		}
		@Pc(91) int local91;
		@Pc(101) int local101;
		if (local19 == 2) {
			local51 = Static21.aClass1_Sub8_Sub1_1.method375(3);
			Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.method2358(local51, true);
			local91 = Static21.aClass1_Sub8_Sub1_1.method375(3);
			Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.method2358(local91, true);
			local101 = Static21.aClass1_Sub8_Sub1_1.method375(1);
			if (local101 == 1) {
				Static90.anIntArray221[Static77.anInt1829++] = 2047;
			}
		} else if (local19 == 3) {
			Static44.anInt1086 = Static21.aClass1_Sub8_Sub1_1.method375(2);
			local51 = Static21.aClass1_Sub8_Sub1_1.method375(1);
			local91 = Static21.aClass1_Sub8_Sub1_1.method375(7);
			local101 = Static21.aClass1_Sub8_Sub1_1.method375(7);
			@Pc(145) int local145 = Static21.aClass1_Sub8_Sub1_1.method375(1);
			if (local145 == 1) {
				Static90.anIntArray221[Static77.anInt1829++] = 2047;
			}
			Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.method2362(local101, local91, local51 == 1);
		}
	}
}
