import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!se", name = "db", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_34;

	@OriginalMember(owner = "client!se", name = "ib", descriptor = "Lclient!bg;")
	public static Class11 aClass11_117;

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1464 = Static32.method683("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!se", name = "bb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1465 = Static32.method683("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!se", name = "eb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1466 = Static32.method683("blinken1:");

	@OriginalMember(owner = "client!se", name = "gb", descriptor = "I")
	public static int anInt3254 = 0;

	@OriginalMember(owner = "client!se", name = "hb", descriptor = "[I")
	public static int[] anIntArray292 = new int[32];

	@OriginalMember(owner = "client!se", name = "jb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1467 = Static32.method683("::fpson");

	@OriginalMember(owner = "client!se", name = "kb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1468 = Static32.method683("");

	@OriginalMember(owner = "client!se", name = "lb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1469 = Static32.method683(" )2>");

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
	public static void method2501() {
		Static32.anInt846 = 0;
		@Pc(12) int local12 = Static49.anInt1133 + (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 >> 7);
		@Pc(19) int local19 = Static38.anInt944 + (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static32.anInt846 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static32.anInt846 = 1;
		}
		if (Static32.anInt846 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static32.anInt846 = 0;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(III)V")
	public static void method2502(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class81 local11 = Static177.aClass81ArrayArrayArray1[Static66.anInt1396][arg0][arg1];
		if (local11 == null) {
			Static72.method1195(Static66.anInt1396, arg0, arg1);
			return;
		}
		@Pc(25) int local25 = -99999999;
		@Pc(30) Class2_Sub2_Sub3_Sub5 local30 = (Class2_Sub2_Sub3_Sub5) local11.method2682();
		@Pc(32) Class2_Sub2_Sub3_Sub5 local32 = null;
		while (local30 != null) {
			@Pc(38) Class2_Sub2_Sub10 local38 = Static113.method1913(local30.anInt1391);
			@Pc(41) int local41 = local38.anInt1605;
			if (local38.anInt1586 == 1) {
				local41 *= local30.anInt1386 + 1;
			}
			if (local41 > local25) {
				local25 = local41;
				local32 = local30;
			}
			local30 = (Class2_Sub2_Sub3_Sub5) local11.method2686();
		}
		if (local32 == null) {
			Static72.method1195(Static66.anInt1396, arg0, arg1);
			return;
		}
		local11.method2679(local32);
		local30 = (Class2_Sub2_Sub3_Sub5) local11.method2682();
		@Pc(86) Class2_Sub2_Sub3_Sub5 local86 = null;
		@Pc(95) long local95 = (long) (arg0 + (arg1 << 7) + 1610612736);
		@Pc(97) Class2_Sub2_Sub3_Sub5 local97 = null;
		while (local30 != null) {
			if (local30.anInt1391 != local32.anInt1391) {
				if (local86 == null) {
					local86 = local30;
				}
				if (local86.anInt1391 != local30.anInt1391 && local97 == null) {
					local97 = local30;
				}
			}
			local30 = (Class2_Sub2_Sub3_Sub5) local11.method2686();
		}
		Static95.method1634(Static66.anInt1396, arg0, arg1, Static18.method346(arg1 * 128 + 64, Static66.anInt1396, arg0 * 128 + 64), local32, local95, local86, local97);
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
	public static void method2503() {
		aClass49_1467 = null;
		anIntArray292 = null;
		aClass49_1466 = null;
		aClass49_1468 = null;
		aClass49_1465 = null;
		aClass49_1464 = null;
		aClass49_1469 = null;
		Class2_Sub3_Sub30.anIntArray290 = null;
		aClass11_117 = null;
		aClass11_Sub1_34 = null;
	}
}
