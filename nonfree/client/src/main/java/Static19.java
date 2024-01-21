import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[I")
	public static int[] anIntArray31;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!qc;")
	public static Class60 aClass60_187 = Static121.method2047("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_192 = Static121.method2047("You can(Wt add yourself to your own ignore list");

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!qc;")
	public static Class60 aClass60_188 = aClass60_192;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!qc;")
	private static Class60 aClass60_191 = Static121.method2047(" is already on your ignore list");

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!qc;")
	public static Class60 aClass60_189 = aClass60_191;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!qc;")
	private static Class60 aClass60_196 = Static121.method2047("Loading textures )2 ");

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!qc;")
	public static Class60 aClass60_190 = aClass60_196;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!qc;")
	public static Class60 aClass60_193 = Static121.method2047(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_194 = Static121.method2047("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_195 = Static121.method2047("Stufe)2");

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_197 = Static121.method2047("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_198 = Static121.method2047("(U(Y");

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method338() {
		Static67.aClass48_63.method1393();
		Static56.aClass48_35.method1393();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method339(@OriginalArg(1) Class4_Sub2 arg0) {
		arg0.aBoolean47 = false;
		if (arg0.aClass4_Sub1_5 != null) {
			arg0.aClass4_Sub1_5.anInt1053 = 0;
		}
		for (@Pc(18) Class4_Sub2 local18 = arg0.method969(); local18 != null; local18 = arg0.method967()) {
			method339(local18);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	public static void method340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
			Static29.anInt824 = -1;
			Static105.anInt2510 = -1;
			return;
		}
		@Pc(30) int local30 = Static54.method1001(arg1, arg0, Static129.anInt3003) - arg2;
		@Pc(34) int local34 = arg0 - Static74.anInt1856;
		@Pc(38) int local38 = local30 - Static23.anInt663;
		@Pc(42) int local42 = Class4_Sub4_Sub3_Sub3.anIntArray214[Static120.anInt1940];
		@Pc(46) int local46 = arg1 - Static88.anInt2065;
		@Pc(50) int local50 = Class4_Sub4_Sub3_Sub3.anIntArray217[Static120.anInt1940];
		@Pc(54) int local54 = Class4_Sub4_Sub3_Sub3.anIntArray214[Static75.anInt1872];
		@Pc(58) int local58 = Class4_Sub4_Sub3_Sub3.anIntArray217[Static75.anInt1872];
		@Pc(68) int local68 = local34 * local54 + local58 * local46 >> 16;
		@Pc(79) int local79 = local58 * local34 - local54 * local46 >> 16;
		@Pc(81) int local81 = local68;
		@Pc(96) int local96 = local50 * local38 - local79 * local42 >> 16;
		@Pc(106) int local106 = local50 * local79 + local42 * local38 >> 16;
		if (local106 < 50) {
			Static29.anInt824 = -1;
			Static105.anInt2510 = -1;
		} else {
			Static105.anInt2510 = (local81 << 9) / local106 + 256;
			Static29.anInt824 = (local96 << 9) / local106 + 167;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	public static void method342(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub12 local10 = (Class4_Sub12) Static111.aClass66_13.method1834((long) arg0);
		if (local10 != null) {
			local10.method2124();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method343() {
		anIntArray31 = null;
		aClass60_192 = null;
		aClass60_196 = null;
		aClass60_194 = null;
		aClass60_190 = null;
		aClass60_198 = null;
		aClass60_189 = null;
		aClass60_195 = null;
		aClass60_188 = null;
		aClass60_197 = null;
		aClass60_191 = null;
		aClass60_193 = null;
		aClass60_187 = null;
	}
}
