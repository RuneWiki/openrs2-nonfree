import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!na", name = "R", descriptor = "Lclient!he;")
	public static Class11 aClass11_45;

	@OriginalMember(owner = "client!na", name = "T", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_19;

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "Lclient!tc;")
	public static Class10_Sub10 aClass10_Sub10_5;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "I")
	public static int anInt1731 = 0;

	@OriginalMember(owner = "client!na", name = "O", descriptor = "I")
	public static volatile int anInt1733 = -1;

	@OriginalMember(owner = "client!na", name = "P", descriptor = "Lclient!va;")
	private static Class61 aClass61_719 = Static88.method1421("Remove");

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
	public static int anInt1734 = 0;

	@OriginalMember(owner = "client!na", name = "S", descriptor = "Lclient!va;")
	public static Class61 aClass61_720 = aClass61_719;

	@OriginalMember(owner = "client!na", name = "W", descriptor = "I")
	public static int anInt1737 = 0;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V")
	public static void method941() {
		@Pc(11) Class51 local11 = Static57.aClass51_1;
		synchronized (Static57.aClass51_1) {
			Static96.anInt2450 = Static23.anInt760;
			@Pc(26) int local26;
			if (Static51.anInt1409 >= 0) {
				while (Static51.anInt1409 != Static37.anInt1042) {
					local26 = Static33.anIntArray111[Static37.anInt1042];
					Static37.anInt1042 = Static37.anInt1042 + 1 & 0x7F;
					if (local26 >= 0) {
						Static19.aBooleanArray2[local26] = true;
					} else {
						Static19.aBooleanArray2[~local26] = false;
					}
				}
			} else {
				for (local26 = 0; local26 < 112; local26++) {
					Static19.aBooleanArray2[local26] = false;
				}
				Static51.anInt1409 = Static37.anInt1042;
			}
			Static23.anInt760 = Static34.anInt1015;
		}
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(B)V")
	public static void method944() {
		aClass10_Sub1_Sub1_Sub2_19 = null;
		aClass61_720 = null;
		aClass61_719 = null;
		aClass11_45 = null;
		aClass10_Sub10_5 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!ec;)V")
	public static void method945(@OriginalArg(1) Class18 arg0) {
		Static35.aClass18_1 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(B)V")
	public static void method946() {
		@Pc(18) int local18;
		for (@Pc(11) int local11 = -1; local11 < Static10.anInt305; local11++) {
			if (local11 == -1) {
				local18 = 2047;
			} else {
				local18 = Static58.anIntArray170[local11];
			}
			@Pc(28) Class10_Sub1_Sub5_Sub2_Sub2 local28 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local18];
			if (local28 != null && local28.anInt1663 > 0) {
				local28.anInt1663--;
				if (local28.anInt1663 == 0) {
					local28.aClass61_695 = null;
				}
			}
		}
		for (local18 = 0; local18 < Static34.anInt1005; local18++) {
			@Pc(61) int local61 = Static1.anIntArray3[local18];
			@Pc(65) Class10_Sub1_Sub5_Sub2_Sub1 local65 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local61];
			if (local65 != null && local65.anInt1663 > 0) {
				local65.anInt1663--;
				if (local65.anInt1663 == 0) {
					local65.aClass61_695 = null;
				}
			}
		}
	}
}
