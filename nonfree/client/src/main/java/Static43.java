import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
	public static int[] anIntArray141;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!je;")
	public static Class44 aClass44_4;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Lclient!ed;")
	public static Class23 aClass23_440 = Static169.method2903("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!ed;")
	private static Class23 aClass23_446 = Static169.method2903("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_441 = aClass23_446;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!ed;")
	public static Class23 aClass23_442 = Static169.method2903("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!ed;")
	public static Class23 aClass23_443 = Static169.method2903(":trade:");

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_444 = Static169.method2903("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_445 = Static169.method2903("nav");

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_447 = Static169.method2903("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!f", name = "s", descriptor = "I")
	public static int anInt1182 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!jg;Lclient!ed;I)I")
	public static int method716(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) Class23 arg1) {
		@Pc(6) int local6 = arg0.anInt1357;
		arg0.method887(arg1.anInt1053);
		arg0.anInt1357 += Static128.aClass67_1.method2313(arg1.aByteArray10, arg0.aByteArray12, arg0.anInt1357, arg1.anInt1053, 0);
		return arg0.anInt1357 - local6;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method718() {
		aClass44_4 = null;
		aClass23_440 = null;
		aClass23_447 = null;
		aClass23_441 = null;
		aClass23_446 = null;
		aClass23_442 = null;
		aClass23_443 = null;
		aClass23_445 = null;
		anIntArray141 = null;
		aClass23_444 = null;
	}
}
