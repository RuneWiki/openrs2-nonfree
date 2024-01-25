import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "[Lclient!o;")
	public static Class13[] aClass13Array16;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "[S")
	public static final short[] aShortArray53 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_43 = new Class132(64);

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "J")
	public static long aLong163 = 0L;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_108 = new Class211(93, -2);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Z")
	public static boolean method3926() {
		try {
			if (Static76.anInt1460 == 2) {
				if (Static424.aClass2_Sub32_3 == null) {
					Static424.aClass2_Sub32_3 = Static468.method3528(Static412.aClass54_111, Static147.anInt2601, Static101.anInt1907);
					if (Static424.aClass2_Sub32_3 == null) {
						return false;
					}
				}
				if (Static294.aClass227_2 == null) {
					Static294.aClass227_2 = new Class227(Static354.aClass54_97, Static407.aClass54_108);
				}
				if (Static84.aClass2_Sub1_Sub2_3.method598(Static10.aClass54_1, Static294.aClass227_2, Static424.aClass2_Sub32_3)) {
					Static84.aClass2_Sub1_Sub2_3.method590();
					Static84.aClass2_Sub1_Sub2_3.method574(Static64.anInt1192);
					Static84.aClass2_Sub1_Sub2_3.method577(Static430.aBoolean503, Static424.aClass2_Sub32_3);
					Static294.aClass227_2 = null;
					Static424.aClass2_Sub32_3 = null;
					Static412.aClass54_111 = null;
					Static76.anInt1460 = 0;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static84.aClass2_Sub1_Sub2_3.method572();
			Static294.aClass227_2 = null;
			Static76.anInt1460 = 0;
			Static412.aClass54_111 = null;
			Static424.aClass2_Sub32_3 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)I")
	public static int method3927(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(24) int local24 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}
}
