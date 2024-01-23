import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Z")
	public static boolean aBoolean349;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "[I")
	public static int[] anIntArray529;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "[I")
	public static int[] anIntArray531;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Lclient!gi;")
	public static Class64 aClass64_19 = new Class64(64);

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString151 = " has logged out.";

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public static int anInt4688 = 0;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!db;")
	public static Class31 aClass31_35 = new Class31(64);

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Z")
	public static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "[I")
	public static int[] anIntArray530 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!me", name = "m", descriptor = "I")
	public static int anInt4690 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZ)Lclient!in;")
	public static Class1_Sub2_Sub11 method3579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub2_Sub11 local16 = (Class1_Sub2_Sub11) Static191.aClass22_15.method633((long) arg1 | (long) arg0 << 32);
		if (local16 == null) {
			local16 = new Class1_Sub2_Sub11(arg0, arg1);
			Static191.aClass22_15.method643(local16.aLong202, local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method3580() {
		@Pc(31) String local31;
		if (Static282.anInt5856 == 1 && Static29.anInt626 < 2) {
			local31 = Static149.aString96 + Static221.aString148 + Static196.aString132 + " ->";
		} else if (Static75.aBoolean115 && Static29.anInt626 < 2) {
			local31 = Static222.aString150 + Static221.aString148 + Static54.aString32 + " ->";
		} else if (Static266.aBoolean410 && Static246.aBooleanArray15[81] && Static29.anInt626 > 2) {
			local31 = Static242.method3843(Static29.anInt626 - 2);
		} else {
			local31 = Static242.method3843(Static29.anInt626 - 1);
		}
		if (Static29.anInt626 > 2) {
			local31 = local31 + "<col=ffffff> / " + (Static29.anInt626 - 2) + Static137.aString136;
		}
		return local31;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method3581() {
		Static205.aClass31_31.method855();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method3583(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1) {
			try {
				Static301.method946("loggedout", Static13.aClass84_3.anApplet1);
			} catch (@Pc(19) Throwable local19) {
			}
			try {
				Static237.anApplet_Sub1_2.getAppletContext().showDocument(new URL(Static237.anApplet_Sub1_2.getCodeBase(), arg0), "_top");
			} catch (@Pc(31) Exception local31) {
			}
			return;
		}
		if (Static240.aBoolean369 && aBoolean349) {
			try {
				Static301.method948("openjs", Static13.aClass84_3.anApplet1, new Object[] { (new URL(Static237.anApplet_Sub1_2.getCodeBase(), arg0)).toString() });
				return;
			} catch (@Pc(59) Throwable local59) {
			}
		}
		try {
			Static237.anApplet_Sub1_2.getAppletContext().showDocument(new URL(Static237.anApplet_Sub1_2.getCodeBase(), arg0), "_blank");
		} catch (@Pc(71) Exception local71) {
		}
	}
}
