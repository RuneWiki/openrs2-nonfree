import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!lc;")
	public static Class40 aClass40_90;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1212 = Static121.method2047("Abbrechen");

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "[B")
	public static byte[] aByteArray127 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1213 = Static121.method2047(" <col=00ff80>");

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public static int anInt3005 = 0;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	public static final int anInt3006 = 50;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1214 = Static121.method2047("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public static final int anInt3010 = 7759444;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public static void method2126() {
		aClass60_1212 = null;
		aByteArray127 = null;
		aClass60_1213 = null;
		aClass60_1214 = null;
		aClass40_90 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!lc;Lclient!lc;)V")
	public static void method2127(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		Static18.aClass40_13 = arg0;
		Static65.aClass40_49 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public static void method2128() {
		@Pc(5) Class3 local5 = Static54.aClass3_1;
		synchronized (Static54.aClass3_1) {
			Static116.anInt2785 = Static56.anInt1432;
			Static82.anInt1962 = Static130.anInt3021;
			Static17.anInt452 = Static46.anInt1191;
			Static3.anInt28 = Static26.anInt729;
			Static128.anInt2648 = Static2.anInt1360;
			Static22.anInt652 = Static111.anInt2688;
			Static26.aLong22 = Static24.aLong20;
			Static26.anInt729 = 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method2129(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static71.aBoolean71) {
			try {
				@Pc(28) Class16 local28 = (Class16) Class.forName("Class16_Sub1").getDeclaredConstructor().newInstance();
				local28.method467(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static71.aBoolean71 = true;
			}
		}
		return arg0;
	}
}
