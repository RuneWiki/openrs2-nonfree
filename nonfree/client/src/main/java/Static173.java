import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!vh", name = "Hc", descriptor = "[I")
	public static int[] anIntArray623;

	@OriginalMember(owner = "client!vh", name = "Ic", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array26 = new Class77[100];

	@OriginalMember(owner = "client!vh", name = "Nc", descriptor = "Lclient!uh;")
	public static Class85 aClass85_2 = new Class85();

	@OriginalMember(owner = "client!vh", name = "Oc", descriptor = "I")
	public static int anInt4432 = 500;

	@OriginalMember(owner = "client!vh", name = "Pc", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1509 = Static146.method2172("Texturen geladen)3");

	@OriginalMember(owner = "client!vh", name = "Qc", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1510 = Static146.method2172("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)Z")
	public static boolean method2918() {
		@Pc(5) Class9 local5 = Static125.aClass9_1;
		synchronized (Static125.aClass9_1) {
			if (Static94.anInt2401 == Static160.anInt4576) {
				return false;
			} else {
				Static53.anInt1463 = Static57.anIntArray641[Static94.anInt2401];
				Static33.anInt968 = Static63.anIntArray262[Static94.anInt2401];
				Static94.anInt2401 = Static94.anInt2401 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	public static void method2919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub2_Sub10 local7 = Static136.method2288(arg0);
		@Pc(10) int local10 = local7.anInt1832;
		@Pc(13) int local13 = local7.anInt1835;
		@Pc(16) int local16 = local7.anInt1837;
		@Pc(23) int local23 = Class2_Sub1_Sub28.anIntArray453[local16 - local13];
		if (arg1 < 0 || local23 < arg1) {
			arg1 = 0;
		}
		local23 <<= local13;
		Static6.anIntArray24[local10] = local23 & arg1 << local13 | Static6.anIntArray24[local10] & ~local23;
	}

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "(I)V")
	public static void method2920() {
		aClass77_1509 = null;
		aClass85_2 = null;
		aClass77Array26 = null;
		aClass77_1510 = null;
		anIntArray623 = null;
	}
}
