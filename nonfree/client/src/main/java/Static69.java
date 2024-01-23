import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[8];

	@OriginalMember(owner = "client!gi", name = "K", descriptor = "Lclient!ia;")
	public static Class51 aClass51_519 = Static64.method1101("loc)3dat");

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
	public static int anInt1577 = -1;

	@OriginalMember(owner = "client!gi", name = "N", descriptor = "Lclient!ia;")
	public static Class51 aClass51_520 = Static64.method1101("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ia;I)V")
	public static void method1209(@OriginalArg(0) Class51 arg0) {
		Static154.aClass51_1193 = arg0;
		if (Static51.aClass72_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) Class51 local15 = Static185.aClass51_1377.method1412(Static51.aClass72_3.anApplet1);
			@Pc(21) Class51 local21 = Static139.aClass51_1086.method1412(Static51.aClass72_3.anApplet1);
			@Pc(46) Class51 local46 = Static150.method2574(new Class51[] { local15, Static150.aClass51_1159, arg0, Static192.aClass51_1432, local21 });
			if (arg0.method1399() == 0) {
				local46 = Static150.method2574(new Class51[] { local46, Static131.aClass51_1029 });
			} else {
				local46 = Static150.method2574(new Class51[] { local46, Static8.aClass51_57, Static71.method1258(Static144.method2489() + 94608000000L), Static144.aClass51_1111, Static208.method3449(94608000L) });
			}
			Static150.method2574(new Class51[] { Static207.aClass51_1528, local46, Static100.aClass51_736 }).method1421(Static51.aClass72_3.anApplet1);
		} catch (@Pc(129) Throwable local129) {
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!k;Z)Lclient!ag;")
	public static Class8 method1210(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(7) Class8 local7 = new Class8();
		local7.anInt171 = arg0.method3805();
		local7.aClass1_Sub2_Sub13_1 = Static84.method1464(local7.anInt171);
		return local7;
	}
}
