import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_819 = Static134.method2017("mapback");

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_820 = Static134.method2017("event_opbase");

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!n", name = "P", descriptor = "Lclient!v;")
	private static Class76 aClass76_824 = Static134.method2017("Unable to connect)3");

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!v;")
	public static Class76 aClass76_821 = aClass76_824;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array20 = new Class76[100];

	@OriginalMember(owner = "client!n", name = "t", descriptor = "Lclient!ua;")
	public static Class72 aClass72_20 = new Class72(64);

	@OriginalMember(owner = "client!n", name = "D", descriptor = "I")
	public static int anInt1928 = 0;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "Lclient!v;")
	public static Class76 aClass76_822 = Static134.method2017("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!n", name = "N", descriptor = "Lclient!v;")
	public static Class76 aClass76_823 = aClass76_824;

	@OriginalMember(owner = "client!n", name = "T", descriptor = "Lclient!v;")
	private static Class76 aClass76_825 = Static134.method2017("Login");

	@OriginalMember(owner = "client!n", name = "U", descriptor = "Lclient!v;")
	public static Class76 aClass76_826 = Static134.method2017("Hidden)2");

	@OriginalMember(owner = "client!n", name = "W", descriptor = "Lclient!v;")
	private static Class76 aClass76_828 = Static134.method2017("No reply from loginserver)3");

	@OriginalMember(owner = "client!n", name = "V", descriptor = "Lclient!v;")
	public static Class76 aClass76_827 = aClass76_828;

	@OriginalMember(owner = "client!n", name = "X", descriptor = "Lclient!v;")
	public static Class76 aClass76_829 = aClass76_825;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method1370() {
		Static26.aClass72_10.method1786();
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
	public static void method1371() {
		aClass76_829 = null;
		aClass76_819 = null;
		aClass76_824 = null;
		aClass76_820 = null;
		aClass76Array20 = null;
		aClass76_823 = null;
		aClass76_825 = null;
		aClass76_827 = null;
		aClass76_828 = null;
		aClass76_826 = null;
		aClass72_20 = null;
		aClass76_821 = null;
		aClass76_822 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!ef;)V")
	public static void method1373(@OriginalArg(1) Class4_Sub4_Sub3_Sub1 arg0) {
		arg0.anInt1421 = 0;
		@Pc(12) int local12 = arg0.anInt1397 - Static78.anInt1981;
		if (arg0.anInt1407 == 0) {
			arg0.anInt1409 = 1024;
		}
		if (arg0.anInt1407 == 1) {
			arg0.anInt1409 = 1536;
		}
		if (arg0.anInt1407 == 2) {
			arg0.anInt1409 = 0;
		}
		if (arg0.anInt1407 == 3) {
			arg0.anInt1409 = 512;
		}
		@Pc(58) int local58 = arg0.anInt1382 * 64 + arg0.anInt1436 * 128;
		arg0.anInt1393 += (local58 - arg0.anInt1393) / local12;
		@Pc(88) int local88 = arg0.anInt1408 * 128 + arg0.anInt1382 * 64;
		arg0.anInt1416 += (local88 - arg0.anInt1416) / local12;
	}
}
