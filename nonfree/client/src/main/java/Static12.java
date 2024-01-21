import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "Lclient!r;")
	public static Class53 aClass53_1;

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
	public static int anInt349;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "[I")
	public static int[] anIntArray46 = new int[2048];

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!va;")
	public static Class61 aClass61_87 = Static88.method1421("titlebox");

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	public static int anInt333 = 0;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "Lclient!va;")
	public static Class61 aClass61_88 = Static88.method1421(" @cya@");

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "Lclient!bb;")
	public static Class9 aClass9_2 = new Class9();

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "Lclient!bb;")
	public static Class9 aClass9_3 = new Class9();

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "Lclient!va;")
	private static Class61 aClass61_91 = Static88.method1421("Loaded interfaces");

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "Lclient!va;")
	public static Class61 aClass61_89 = aClass61_91;

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "Lclient!va;")
	public static Class61 aClass61_90 = Static88.method1421("*6n");

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
	public static int anInt348 = 0;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "Lclient!va;")
	public static Class61 aClass61_92 = Static88.method1421("l");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public static void method259() {
		aClass61_89 = null;
		aClass61_87 = null;
		aClass61_92 = null;
		aClass61_90 = null;
		anIntArray46 = null;
		aClass9_3 = null;
		aClass53_1 = null;
		aClass61_91 = null;
		aClass61_88 = null;
		aClass9_2 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method260() {
		for (@Pc(3) int local3 = 0; local3 < Static41.anInt1196; local3++) {
			@Pc(9) int local9 = Static98.anIntArray327[local3]--;
			if (Static98.anIntArray327[local3] >= -10) {
				@Pc(72) Class36 local72 = Static74.aClass36Array1[local3];
				if (local72 == null) {
					local72 = Static111.method827(Static103.aClass11_Sub1_6, Static63.anIntArray56[local3]);
					if (local72 == null) {
						continue;
					}
					Static98.anIntArray327[local3] += local72.method826();
					Static74.aClass36Array1[local3] = local72;
				}
				if (Static98.anIntArray327[local3] < 0) {
					@Pc(109) Class10_Sub9_Sub1 local109 = local72.method825().method1023(Static46.aClass35_1);
					@Pc(114) Class10_Sub5_Sub2 local114 = Static113.method890(local109, Static88.anInt2323);
					local114.method888(Static94.anIntArray318[local3] - 1);
					Static81.aClass10_Sub5_Sub1_1.method547(local114);
					Static98.anIntArray327[local3] = -100;
				}
			} else {
				Static41.anInt1196--;
				for (@Pc(23) int local23 = local3; local23 < Static41.anInt1196; local23++) {
					Static63.anIntArray56[local23] = Static63.anIntArray56[local23 + 1];
					Static74.aClass36Array1[local23] = Static74.aClass36Array1[local23 + 1];
					Static94.anIntArray318[local23] = Static94.anIntArray318[local23 + 1];
					Static98.anIntArray327[local23] = Static98.anIntArray327[local23 + 1];
				}
				local3--;
			}
		}
		if (Static70.anInt2671 <= 0) {
			return;
		}
		Static70.anInt2671 -= 20;
		if (Static70.anInt2671 < 0) {
			Static70.anInt2671 = 0;
		}
		if (Static70.anInt2671 == 0 && Static51.anInt1419 != 0 && Static47.anInt1303 != -1) {
			Static15.method344(Static51.anInt1419, Static47.anInt1303, Static106.aClass11_Sub1_16, 0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)Lclient!ub;")
	public static Class10_Sub1_Sub1_Sub4 method261() {
		@Pc(12) Class10_Sub1_Sub1_Sub4 local12 = new Class10_Sub1_Sub1_Sub4(Static54.anIntArray158, Static88.anIntArray306, Static71.anIntArray207, Static25.anIntArray80, Static47.aByteArrayArray8);
		Static1.method5();
		return local12;
	}
}
