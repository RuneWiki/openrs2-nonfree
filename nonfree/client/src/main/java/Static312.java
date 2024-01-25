import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
	public static int anInt5956;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Lclient!ra;")
	public static Class170 aClass170_108;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString340 = "purple:";

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "[Lclient!bb;")
	public static final Class17[] aClass17Array1 = new Class17[14];

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "[Lclient!nj;")
	public static final Class25_Sub1_Sub1_Sub1[] aClass25_Sub1_Sub1_Sub1Array1 = new Class25_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
	public static int anInt5960 = 0;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	public static int anInt5961 = 0;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "[I")
	public static final int[] anIntArray503 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public static void method5289() {
		Static98.aClass54Array9 = null;
		Static148.aClass54Array15 = null;
		Static225.aClass54Array17 = null;
		Static109.aClass54Array12 = null;
		Static323.aClass54Array24 = null;
		Static62.aClass91_3 = null;
		Static29.aClass54_1 = null;
		Static50.aClass54Array5 = null;
		Static190.aClass91_8 = null;
		Static29.aClass54Array2 = null;
		Static112.aClass54Array13 = null;
		Static160.aClass54Array16 = null;
		Static247.aClass91_9 = null;
		Static260.aClass54Array25 = null;
		Static32.aClass54Array3 = null;
		Static288.aClass54Array22 = null;
		Static29.aClass54Array1 = null;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ra;I)V")
	public static void method5292(@OriginalArg(0) Class170 arg0) {
		Static67.aClass170_23 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZII)Z")
	public static boolean method5295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static188.aBoolean264) {
			return false;
		}
		@Pc(19) int local19 = arg0 >> 16;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		if (Static348.aClass96ArrayArray1[local19] == null || Static348.aClass96ArrayArray1[local19][local23] == null) {
			return false;
		}
		@Pc(41) Class96 local41 = Static348.aClass96ArrayArray1[local19][local23];
		@Pc(52) Class5_Sub4 local52;
		if (arg1 == -1 && local41.anInt2933 == 0) {
			for (local52 = (Class5_Sub4) Static60.aClass211_4.method5608(); local52 != null; local52 = (Class5_Sub4) Static60.aClass211_4.method5603()) {
				if (local52.anInt785 == 5 || local52.anInt785 == 1004 || local52.anInt785 == 8 || local52.anInt785 == 48 || local52.anInt785 == 20) {
					for (@Pc(138) Class96 local138 = Static121.method2396(local52.anInt781); local138 != null; local138 = Static88.method1380(local138)) {
						if (local138.anInt2877 == local41.anInt2877) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class5_Sub4) Static60.aClass211_4.method5608(); local52 != null; local52 = (Class5_Sub4) Static60.aClass211_4.method5603()) {
				if (arg1 == local52.anInt790 && local41.anInt2877 == local52.anInt781 && (local52.anInt785 == 5 || local52.anInt785 == 1004 || local52.anInt785 == 8 || local52.anInt785 == 48 || local52.anInt785 == 20)) {
					return true;
				}
			}
		}
		return false;
	}
}
