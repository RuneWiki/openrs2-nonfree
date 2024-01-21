import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
	public static int anInt177;

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "Lclient!rc;")
	public static Class61 aClass61_3 = new Class61();

	@OriginalMember(owner = "client!sf", name = "R", descriptor = "Lclient!sc;")
	private static Class66 aClass66_128 = Static106.method1849("Login server offline)3");

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "Lclient!sc;")
	public static Class66 aClass66_127 = aClass66_128;

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "Lclient!rb;")
	public static Class60 aClass60_13 = new Class60(64);

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "Lclient!sc;")
	public static Class66 aClass66_129 = Static106.method1849("swe");

	@OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
	public static int anInt180 = 0;

	@OriginalMember(owner = "client!sf", name = "X", descriptor = "Ljava/lang/Object;")
	public static Object anObject2 = new Object();

	@OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
	public static int anInt181 = 0;

	@OriginalMember(owner = "client!sf", name = "Z", descriptor = "Lclient!sc;")
	public static Class66 aClass66_130 = Static106.method1849("null");

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method109() {
		anIntArrayArray4 = null;
		aClass66_129 = null;
		aClass66_127 = null;
		aClass61_3 = null;
		aClass66_128 = null;
		aClass66_130 = null;
		aClass60_13 = null;
		anObject2 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)I")
	public static int method111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) (arg1 + (arg0 << 16));
		return Static74.aClass1_Sub1_Sub4_1 != null && Static74.aClass1_Sub1_Sub4_1.aLong130 == local15 ? Static71.aClass1_Sub12_9.anInt1694 * 99 / (Static71.aClass1_Sub12_9.aByteArray12.length - Static74.aClass1_Sub1_Sub4_1.aByte2) + 1 : 0;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	public static void method114() {
		for (@Pc(15) Class1_Sub4 local15 = (Class1_Sub4) Static71.aClass61_12.method1748(); local15 != null; local15 = (Class1_Sub4) Static71.aClass61_12.method1760()) {
			if (local15.anInt436 == -1) {
				local15.anInt440 = 0;
				Static6.method271(local15);
			} else {
				local15.method2050();
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
	public static void method117() {
		Static48.anIntArray226 = new int[151];
		Static42.anIntArray193 = new int[151];
		Static15.anIntArray499 = new int[33];
		Static95.anIntArray414 = new int[33];
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(32) int local32;
		for (@Pc(24) int local24 = 0; local24 < 33; local24++) {
			local28 = 999;
			local30 = 0;
			for (local32 = 0; local32 < 34; local32++) {
				if (Static92.aClass1_Sub1_Sub2_Sub3_3.aByteArray9[Static92.aClass1_Sub1_Sub2_Sub3_3.anInt1432 * local24 + local32] == 0) {
					if (local28 == 999) {
						local28 = local32;
					}
				} else if (local28 != 999) {
					local30 = local32;
					break;
				}
			}
			Static95.anIntArray414[local24] = local28;
			Static15.anIntArray499[local24] = local30 - local28;
		}
		for (local28 = 5; local28 < 156; local28++) {
			local32 = 0;
			local30 = 999;
			for (@Pc(94) int local94 = 25; local94 < 172; local94++) {
				if (Static92.aClass1_Sub1_Sub2_Sub3_3.aByteArray9[local28 * Static92.aClass1_Sub1_Sub2_Sub3_3.anInt1432 + local94] == 0 && (local94 > 34 || local28 > 34)) {
					if (local30 == 999) {
						local30 = local94;
					}
				} else if (local30 != 999) {
					local32 = local94;
					break;
				}
			}
			Static48.anIntArray226[local28 - 5] = local30 - 25;
			Static42.anIntArray193[local28 - 5] = local32 - local30;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sf;I)V")
	public static void method125(@OriginalArg(0) Class5 arg0) {
		Static66.aClass5_17 = arg0;
	}
}
