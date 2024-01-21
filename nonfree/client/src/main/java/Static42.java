import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_7;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public static int anInt1085 = 0;

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "Lclient!od;")
	private static Class60 aClass60_415 = Static41.method597("green:");

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_407 = aClass60_415;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "[I")
	public static int[] anIntArray115 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!od;")
	private static Class60 aClass60_408 = Static41.method597("Unable to find ");

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	public static int anInt1098 = 0;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_409 = Static41.method597("null");

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Lclient!od;")
	public static Class60 aClass60_410 = aClass60_415;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_411 = Static41.method597("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Lclient!od;")
	public static Class60 aClass60_412 = aClass60_408;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!od;")
	public static Class60 aClass60_413 = Static41.method597("titlebutton");

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "Lclient!od;")
	public static Class60 aClass60_414 = Static41.method597("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
	public static int anInt1103 = 1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
	public static boolean method598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(19) Class4_Sub3_Sub3 local19 = Static76.method1244(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local19.method401(arg1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBLclient!c;)Lclient!sb;")
	public static Class4_Sub15 method604(@OriginalArg(0) int arg0, @OriginalArg(2) Class10 arg1) {
		@Pc(8) byte[] local8 = arg1.method1768(arg0);
		return local8 == null ? null : new Class4_Sub15(local8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Lclient!od;")
	public static Class60 method607(@OriginalArg(1) int arg0) {
		@Pc(9) Class60 local9 = Static65.method1051(arg0);
		for (@Pc(15) int local15 = local9.method1345() - 3; local15 > 0; local15 -= 3) {
			local9 = Static12.method1761(new Class60[] { local9.method1333(0, local15), Static48.aClass60_451, local9.method1315(local15) });
		}
		if (local9.method1345() > 9) {
			return Static12.method1761(new Class60[] { Static51.aClass60_493, local9.method1333(0, local9.method1345() - 8), Static105.aClass60_972, Static97.aClass60_922, local9, Static117.aClass60_1061 });
		} else if (local9.method1345() > 6) {
			return Static12.method1761(new Class60[] { Static23.aClass60_257, local9.method1333(0, local9.method1345() - 4), Static91.aClass60_881, Static97.aClass60_922, local9, Static117.aClass60_1061 });
		} else {
			return Static12.method1761(new Class60[] { Static49.aClass60_461, local9, Static62.aClass60_586 });
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public static void method612() {
		aClass60_415 = null;
		aClass60_412 = null;
		aClass60_408 = null;
		anIntArray115 = null;
		aClass10_Sub1_7 = null;
		aClass60_410 = null;
		aClass60_411 = null;
		aClass60_413 = null;
		aClass60_414 = null;
		aClass60_409 = null;
		aClass60_407 = null;
	}
}
