import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!ee;")
	public static Class27 aClass27_6;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1256 = Static186.method3527("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1255 = aClass50_1256;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "[I")
	public static int[] anIntArray440 = new int[100];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)V")
	public static void method3112() {
		Static42.aClass84_18.method2577(5);
		Static224.aClass84_6.method2577(5);
		Static1.aClass84_1.method2577(5);
		Static102.aClass84_21.method2577(5);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Z")
	public static boolean method3114() {
		try {
			if (Static19.anInt400 == 2) {
				if (Static74.aClass1_Sub24_1 == null) {
					Static74.aClass1_Sub24_1 = Static242.method2890(Static218.aClass86_68, Static67.anInt1302, Static85.anInt1755);
					if (Static74.aClass1_Sub24_1 == null) {
						return false;
					}
				}
				if (Static17.aClass66_1 == null) {
					Static17.aClass66_1 = new Class66(Static203.aClass86_13, Static65.aClass86_75);
				}
				if (Static203.aClass1_Sub12_Sub3_2.method2608(Static17.aClass66_1, Static134.aClass86_48, Static74.aClass1_Sub24_1)) {
					Static203.aClass1_Sub12_Sub3_2.method2605();
					Static203.aClass1_Sub12_Sub3_2.method2610(Static63.anInt1254);
					Static203.aClass1_Sub12_Sub3_2.method2616(Static74.aClass1_Sub24_1, Static92.aBoolean83);
					Static17.aClass66_1 = null;
					Static19.anInt400 = 0;
					Static74.aClass1_Sub24_1 = null;
					Static218.aClass86_68 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static203.aClass1_Sub12_Sub3_2.method2626();
			Static74.aClass1_Sub24_1 = null;
			Static19.anInt400 = 0;
			Static17.aClass66_1 = null;
			Static218.aClass86_68 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public static void method3115() {
		Static124.aClass75_12 = new Class75();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!pa;I)Z")
	public static boolean method3116(@OriginalArg(0) Class86 arg0) {
		return arg0.method3322(Static176.anInt3693);
	}
}
