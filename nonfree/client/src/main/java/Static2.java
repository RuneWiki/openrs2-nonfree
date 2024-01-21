import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_4 = Static41.method597(")3runescape)3com");

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!od;")
	private static Class60 aClass60_10 = Static41.method597("Login");

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_5 = aClass60_10;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!od;")
	private static Class60 aClass60_11 = Static41.method597("Password: ");

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_6 = aClass60_11;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!od;")
	private static Class60 aClass60_7 = Static41.method597("You can(Wt add yourself to your own friend list");

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_8 = Static41.method597("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Lclient!od;")
	public static Class60 aClass60_9 = aClass60_7;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "[I")
	public static int[] anIntArray3 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public static int anInt17 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method7() {
		aClass60_5 = null;
		aClass60_10 = null;
		anIntArray3 = null;
		aClass60_8 = null;
		aClass60_4 = null;
		aClass60_6 = null;
		aClass60_11 = null;
		aClass60_7 = null;
		aFont1 = null;
		anIntArray1 = null;
		aClass60_9 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!od;Lclient!od;IILclient!od;)V")
	public static void method8(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class60 arg3) {
		for (@Pc(15) int local15 = 99; local15 > 0; local15--) {
			Static133.anIntArray347[local15] = Static133.anIntArray347[local15 - 1];
			Static35.aClass60Array5[local15] = Static35.aClass60Array5[local15 - 1];
			Static62.aClass60Array8[local15] = Static62.aClass60Array8[local15 - 1];
			Static77.aClass60Array12[local15] = Static77.aClass60Array12[local15 - 1];
		}
		Static133.anIntArray347[0] = arg2;
		Static41.anInt1083 = Static87.anInt2052;
		Static116.anInt2704++;
		Static35.aClass60Array5[0] = arg1;
		Static62.aClass60Array8[0] = arg3;
		Static77.aClass60Array12[0] = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!sa;)Z")
	public static boolean method9(@OriginalArg(1) Class4_Sub14 arg0) {
		if (Static62.aBoolean54) {
			if (Static38.method575(arg0) != 0) {
				return false;
			}
			if (arg0.anInt2389 == 0) {
				return false;
			}
		}
		return arg0.aBoolean91;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lclient!od;")
	public static Class60 method10(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static65.method1051(arg0) : Static56.aClass60_544;
	}
}
