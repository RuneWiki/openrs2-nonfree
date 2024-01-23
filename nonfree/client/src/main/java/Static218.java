import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ve", name = "V", descriptor = "[I")
	public static int[] anIntArray383;

	@OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
	public static int anInt3563;

	@OriginalMember(owner = "client!ve", name = "hb", descriptor = "Lclient!pa;")
	public static Class86 aClass86_68;

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1181 = Static186.method3527("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1182 = Static186.method3527("Clientscript error in: ");

	@OriginalMember(owner = "client!ve", name = "fb", descriptor = "[I")
	public static int[] anIntArray385 = new int[25];

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
	public static int anInt3570 = -1;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!qh;I)Lclient!hh;")
	public static Class50 method2871(@OriginalArg(1) Class93 arg0, @OriginalArg(2) int arg1) {
		if (!Static86.method1289(Static35.method552(arg0), arg1) && arg0.anObjectArray12 == null) {
			return null;
		} else if (arg0.aClass50Array69 == null || arg0.aClass50Array69.length <= arg1 || arg0.aClass50Array69[arg1] == null || arg0.aClass50Array69[arg1].method1222().method1249() == 0) {
			return Static131.aBoolean115 ? Static17.method257(new Class50[] { Static7.aClass50_65, Static160.method2684(arg1) }) : null;
		} else {
			return arg0.aClass50Array69[arg1];
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!hh;I)V")
	public static void method2873(@OriginalArg(0) Class50 arg0) {
		if (Static122.anInt2447 >= 2) {
			@Pc(17) int local17;
			@Pc(38) int local38;
			if (arg0.method1256(Static69.aClass50_480)) {
				Static179.method2937();
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				@Pc(28) Runtime local28 = Runtime.getRuntime();
				local38 = (int) ((local28.totalMemory() - local28.freeMemory()) / 1024L);
				Static123.method1275(Static17.method257(new Class50[] { Static160.aClass50_1084, Static160.method2684(local38), Static216.aClass50_1346 }), null, 0);
			}
			if (arg0.method1256(Static187.aClass50_1246)) {
				Static91.method3219();
			}
			if (arg0.method1256(Static156.aClass50_1070)) {
				Static229.method3481(25);
			}
			if (arg0.method1256(Static105.aClass50_678)) {
				Static229.aBoolean214 = true;
			}
			if (arg0.method1256(Static62.aClass50_444)) {
				Static229.aBoolean214 = false;
			}
			if (arg0.method1256(Static179.aClass50_1206)) {
				for (local17 = 0; local17 < 4; local17++) {
					for (@Pc(104) int local104 = 1; local104 < 103; local104++) {
						for (local38 = 1; local38 < 103; local38++) {
							Static22.aClass16Array1[local17].anIntArrayArray6[local104][local38] = 0;
						}
					}
				}
			}
			if (arg0.method1240(Static71.aClass50_483) && Static46.anInt954 != 0) {
				Static41.method651(arg0.method1244(6).method1235());
			}
			if (arg0.method1256(Static211.aClass50_1328) && Static46.anInt954 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1240(Static102.aClass50_668)) {
				Static20.anInt418 = arg0.method1244(12).method1222().method1235();
				Static123.method1275(Static17.method257(new Class50[] { Static129.aClass50_894, Static160.method2684(Static20.anInt418) }), null, 0);
			}
			if (arg0.method1256(Static229.aClass50_1412)) {
				Static131.aBoolean115 = true;
			}
		}
		Static32.aClass1_Sub17_Sub1_1.method2182(248);
		Static32.aClass1_Sub17_Sub1_1.method2175(arg0.method1249() - 1);
		Static32.aClass1_Sub17_Sub1_1.method2174(arg0.method1244(2));
	}
}
