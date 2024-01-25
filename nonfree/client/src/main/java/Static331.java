import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!v", name = "O", descriptor = "I")
	public static int anInt6341;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "[I")
	public static final int[] anIntArray488 = new int[13];

	@OriginalMember(owner = "client!v", name = "C", descriptor = "[I")
	public static final int[] anIntArray489 = new int[32];

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZIZI)I")
	public static int method5364(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub44 local8 = Static92.method531(arg1, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray503.length) {
			return local8.anIntArray503[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!ec;I)V")
	public static void method5365(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1) {
		if (Static287.aBoolean345) {
			Static287.aBoolean345 = false;
			arg0 = 0;
		}
		if (Static248.aClass50_2 != null && Static248.aClass50_2.method1649(arg1)) {
			return;
		}
		Static248.aClass50_2 = arg1;
		Static214.aLong61 = Static208.method3879();
		Static281.anInt5555 = arg0;
		Static173.anInt3686 = arg0;
		if (Static173.anInt3686 != 0) {
			Static99.aFloat29 = Static127.aFloat36;
			Static138.aFloat35 = Static150.aFloat64;
			Static319.aFloat94 = Static337.aFloat96;
			Static290.aClass81_6 = Static278.aClass81_7;
			Static80.aFloat24 = Static140.aFloat63;
			Static143.anInt3253 = Static235.anInt4755;
			Static269.aFloat88 = Static151.aFloat61;
			Static221.aFloat33 = Static177.aFloat68;
			Static335.anInt6407 = Static261.anInt5279;
			Static139.anInt3197 = Static192.anInt4032;
			return;
		}
		Static82.method2085();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ta;B)V")
	public static void method5366(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.aClass8_Sub1_Sub2_1 = null;
		if (Static121.anInt4966 < 20) {
			Static63.aClass32_3.method844(arg0);
			Static121.anInt4966++;
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	public static void method5367() {
		Static333.method5390();
		Static243.aClass47_10 = null;
		Static162.aClass50ArrayArray1 = null;
		Static290.aClass81_6 = null;
		Static278.aClass81_7 = null;
		Static6.aClass81_1 = null;
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)Lclient!vl;")
	public static Class1 method5369() {
		try {
			return (Class1) Class.forName("Class1_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}
}
