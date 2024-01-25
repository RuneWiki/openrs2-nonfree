import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString1 = null;

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method173(@OriginalArg(1) Class143 arg0) {
		Static383.aClass72_10 = Static250.method3527(Static551.anInt9039, arg0, true);
		Static172.aClass198_4 = Static403.method5900(arg0, Static551.anInt9039);
		Static5.aClass72_1 = Static250.method3527(Static90.anInt1505, arg0, true);
		Static364.aClass198_8 = Static403.method5900(arg0, Static90.anInt1505);
		Static32.aClass72_2 = Static250.method3527(Static6.anInt137, arg0, true);
		Static358.aClass198_7 = Static403.method5900(arg0, Static6.anInt137);
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V")
	public static void method175() {
		if (Static566.anInt9293 == 1 || Static566.anInt9293 == 3 || Static645.anInt10204 != Static566.anInt9293 && (Static566.anInt9293 == 0 || Static645.anInt10204 == 0)) {
			Static386.anInt6720 = 0;
			Static562.anInt9155 = 0;
			Static223.aClass335_19.method7773();
		}
		Static645.anInt10204 = Static566.anInt9293;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)Lclient!ls;")
	public static Class13 method176() {
		try {
			return new Class13_Sub3();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class13) Class.forName("Class13_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class13_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!rv;I)Ljava/lang/String;")
	public static String method177(@OriginalArg(0) Class5_Sub15 arg0) {
		return Static106.method1750(arg0);
	}
}
