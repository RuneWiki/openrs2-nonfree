import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!m", name = "Mc", descriptor = "I")
	public static int anInt1832;

	@OriginalMember(owner = "client!m", name = "Sc", descriptor = "[I")
	public static int[] anIntArray181;

	@OriginalMember(owner = "client!m", name = "Xc", descriptor = "B")
	public static byte aByte3;

	@OriginalMember(owner = "client!m", name = "ad", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_11;

	@OriginalMember(owner = "client!m", name = "Rc", descriptor = "Lclient!je;")
	private static Class40 aClass40_888 = Static69.method1231("M");

	@OriginalMember(owner = "client!m", name = "Oc", descriptor = "Lclient!je;")
	public static Class40 aClass40_887 = aClass40_888;

	@OriginalMember(owner = "client!m", name = "Tc", descriptor = "Lclient!je;")
	public static Class40 aClass40_889 = aClass40_888;

	@OriginalMember(owner = "client!m", name = "Wc", descriptor = "I")
	public static int anInt1838 = 0;

	@OriginalMember(owner = "client!m", name = "Yc", descriptor = "Lclient!je;")
	public static Class40 aClass40_890 = Static69.method1231("<col=ff3000>");

	@OriginalMember(owner = "client!m", name = "ld", descriptor = "Lclient!je;")
	public static Class40 aClass40_891 = Static69.method1231("null");

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
	public static void method1179() {
		aClass24_Sub1_11 = null;
		aClass40_891 = null;
		aClass40_888 = null;
		anIntArray181 = null;
		aClass40_889 = null;
		aClass40_890 = null;
		aClass40_887 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!fd;I)Z")
	public static boolean method1180(@OriginalArg(1) Class24 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) byte[] local4 = arg0.method1925(arg1);
		if (local4 == null) {
			return false;
		} else {
			Static104.method1820(local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ub;BLclient!fd;Lclient!fd;Lclient!fd;)Z")
	public static boolean method1181(@OriginalArg(0) Class2_Sub5_Sub4 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class24 arg3) {
		Static38.aClass24_12 = arg2;
		Static57.aClass24_15 = arg3;
		Static129.aClass2_Sub5_Sub4_2 = arg0;
		Static121.aClass24_31 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(B)V")
	public static void method1183() {
		@Pc(7) Class12 local7 = Static52.aClass12_1;
		synchronized (Static52.aClass12_1) {
			Static100.anInt2473 = Static60.anInt1672;
			@Pc(20) int local20;
			if (anInt1838 < 0) {
				for (local20 = 0; local20 < 112; local20++) {
					Static51.aBooleanArray14[local20] = false;
				}
				anInt1838 = Static127.anInt2945;
			} else {
				while (Static127.anInt2945 != anInt1838) {
					local20 = Static56.anIntArray145[Static127.anInt2945];
					Static127.anInt2945 = Static127.anInt2945 + 1 & 0x7F;
					if (local20 < 0) {
						Static51.aBooleanArray14[~local20] = false;
					} else {
						Static51.aBooleanArray14[local20] = true;
					}
				}
			}
			Static60.anInt1672 = Static103.anInt2504;
		}
	}
}
