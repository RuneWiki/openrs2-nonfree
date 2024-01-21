import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!i", name = "d", descriptor = "J")
	public static long aLong35;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Lclient!ac;")
	public static Class3 aClass3_6;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!uc;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!kc;")
	private static Class36 aClass36_540 = Static14.method2017("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!kc;")
	public static Class36 aClass36_534 = aClass36_540;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Lclient!kc;")
	public static Class36 aClass36_535 = Static14.method2017("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!kc;")
	private static Class36 aClass36_536 = Static14.method2017("Loading friend list");

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!kc;")
	private static Class36 aClass36_538 = Static14.method2017("Unable to find ");

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!kc;")
	public static Class36 aClass36_537 = aClass36_538;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "I")
	public static int anInt1077 = -1;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Z")
	public static boolean aBoolean53 = false;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "Lclient!kc;")
	public static Class36 aClass36_539 = aClass36_536;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "I")
	public static int anInt1078 = 0;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "I")
	public static int anInt1079 = 1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
	public static void method799() {
		aClass36_539 = null;
		aClass36_535 = null;
		aClass36_540 = null;
		aClass29_1 = null;
		aClass36_536 = null;
		aClass36_538 = null;
		aClass36_537 = null;
		aClass36_534 = null;
		aClass3_6 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method800(@OriginalArg(1) int arg0) {
		if (!Static33.method328(arg0)) {
			return;
		}
		@Pc(14) Class2_Sub1_Sub6[] local14 = Static42.aClass2_Sub1_Sub6ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class2_Sub1_Sub6 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt684 = 0;
				local22.anInt664 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)I")
	public static int method801(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
