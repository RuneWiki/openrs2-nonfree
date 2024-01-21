import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!va", name = "H", descriptor = "Lclient!dd;")
	public static Class4_Sub8 aClass4_Sub8_15;

	@OriginalMember(owner = "client!va", name = "N", descriptor = "[I")
	public static int[] anIntArray392;

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "J")
	public static long aLong97;

	@OriginalMember(owner = "client!va", name = "T", descriptor = "I")
	public static int anInt2705;

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "Lclient!la;")
	public static Class17 aClass17_40;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!v;")
	private static Class76 aClass76_1254 = Static134.method2017("Create a free account");

	@OriginalMember(owner = "client!va", name = "x", descriptor = "Lclient!v;")
	private static Class76 aClass76_1255 = Static134.method2017("This world is full)3");

	@OriginalMember(owner = "client!va", name = "D", descriptor = "Lclient!v;")
	public static Class76 aClass76_1256 = Static134.method2017("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!va", name = "V", descriptor = "Lclient!v;")
	private static Class76 aClass76_1261 = Static134.method2017("Select a world");

	@OriginalMember(owner = "client!va", name = "F", descriptor = "Lclient!v;")
	public static Class76 aClass76_1257 = aClass76_1261;

	@OriginalMember(owner = "client!va", name = "I", descriptor = "Lclient!v;")
	public static Class76 aClass76_1258 = Static134.method2017("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!va", name = "K", descriptor = "Lclient!v;")
	public static Class76 aClass76_1259 = aClass76_1254;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "Lclient!v;")
	public static Class76 aClass76_1260 = aClass76_1255;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!v;II)V")
	public static void method1896(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) boolean local3 = false;
		@Pc(13) Class76 local13 = arg0.method1885().method1858();
		for (@Pc(15) int local15 = 0; local15 < Static106.anInt2357; local15++) {
			@Pc(23) Class4_Sub4_Sub3_Sub1_Sub2 local23 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[Static113.anIntArray348[local15]];
			if (local23 != null && local23.aClass76_612 != null && local23.aClass76_612.method1882(local13)) {
				Static68.method1136(0, 0, local23.anIntArray184[0], 0, 1, false, local23.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				local3 = true;
				if (arg1 == 1) {
					Static69.aClass4_Sub10_Sub1_2.method611(241);
					Static69.aClass4_Sub10_Sub1_2.method603(Static113.anIntArray348[local15]);
				} else if (arg1 == 4) {
					Static69.aClass4_Sub10_Sub1_2.method611(51);
					Static69.aClass4_Sub10_Sub1_2.method565(Static113.anIntArray348[local15]);
				} else if (arg1 == 6) {
					Static69.aClass4_Sub10_Sub1_2.method611(124);
					Static69.aClass4_Sub10_Sub1_2.method565(Static113.anIntArray348[local15]);
				} else if (arg1 == 7) {
					Static69.aClass4_Sub10_Sub1_2.method611(236);
					Static69.aClass4_Sub10_Sub1_2.method565(Static113.anIntArray348[local15]);
				}
				break;
			}
		}
		if (!local3) {
			Static21.method328(0, Static133.aClass76_1322, Static59.method1017(new Class76[] { Static72.aClass76_810, local13 }));
		}
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
	public static void method1897() {
		aClass76_1256 = null;
		anIntArray392 = null;
		aClass76_1259 = null;
		aClass76_1254 = null;
		aClass4_Sub8_15 = null;
		aClass76_1260 = null;
		aClass76_1255 = null;
		aClass17_40 = null;
		aClass76_1258 = null;
		aClass76_1257 = null;
		aClass76_1261 = null;
	}
}
