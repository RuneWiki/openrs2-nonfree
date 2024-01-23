import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Z")
	public static boolean aBoolean163;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!nb;")
	public static Class15 aClass15_25;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!ca;")
	public static Class16 aClass16_8 = new Class16(5);

	@OriginalMember(owner = "client!n", name = "e", descriptor = "I")
	public static int anInt2963 = 0;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!i;")
	public static Class41 aClass41_831 = Static184.method2923("<br>");

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_832 = Static184.method2923("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!n", name = "h", descriptor = "I")
	public static int anInt2964 = 0;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_833 = Static184.method2923("scrollbar");

	@OriginalMember(owner = "client!n", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_834 = Static184.method2923("hint_mapmarkers");

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_835 = Static184.method2923("VOLL");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
	public static int method2068(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)Z")
	public static boolean method2069() {
		try {
			if (Static108.anInt2618 == 2) {
				if (Static173.aClass2_Sub14_1 == null) {
					Static173.aClass2_Sub14_1 = Static224.method1461(Static143.aClass15_31, Static202.anInt1732, Static215.anInt4739);
					if (Static173.aClass2_Sub14_1 == null) {
						return false;
					}
				}
				if (Static220.aClass69_1 == null) {
					Static220.aClass69_1 = new Class69(Static138.aClass15_29, Static75.aClass15_35);
				}
				if (Static28.aClass2_Sub6_Sub3_1.method2441(Static220.aClass69_1, Static173.aClass2_Sub14_1, Static11.aClass15_1)) {
					Static28.aClass2_Sub6_Sub3_1.method2446();
					Static28.aClass2_Sub6_Sub3_1.method2445(Static10.anInt373);
					Static28.aClass2_Sub6_Sub3_1.method2444(Static173.aClass2_Sub14_1, Static16.aBoolean20);
					Static143.aClass15_31 = null;
					Static173.aClass2_Sub14_1 = null;
					Static108.anInt2618 = 0;
					Static220.aClass69_1 = null;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static28.aClass2_Sub6_Sub3_1.method2467();
			Static220.aClass69_1 = null;
			Static143.aClass15_31 = null;
			Static108.anInt2618 = 0;
			Static173.aClass2_Sub14_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)I")
	public static int method2070(@OriginalArg(1) int arg0) {
		@Pc(7) Class2_Sub2_Sub22 local7 = Static138.method2199(arg0);
		@Pc(10) int local10 = local7.anInt4486;
		@Pc(13) int local13 = local7.anInt4489;
		@Pc(16) int local16 = local7.anInt4485;
		@Pc(28) int local28 = Class2_Sub2_Sub8.anIntArray223[local13 - local10];
		return Static99.anIntArray243[local16] >> local10 & local28;
	}
}
