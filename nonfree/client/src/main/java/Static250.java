import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Lclient!vp;")
	public static Class255 aClass255_1;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Z")
	public static boolean aBoolean516 = false;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_32 = new Class102(8);

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString54 = "";

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
	public static int anInt4507 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V")
	public static void method3551() {
		Static52.method867(Static197.aClass103_144);
		for (@Pc(17) Class1_Sub14 local17 = (Class1_Sub14) Static94.aClass199_54.method4392(); local17 != null; local17 = (Class1_Sub14) Static94.aClass199_54.method4393()) {
			if (!local17.method5914()) {
				local17 = (Class1_Sub14) Static94.aClass199_54.method4392();
				if (local17 == null) {
					break;
				}
			}
			if (local17.anInt1427 == 0) {
				Static452.method5911(true, true, local17);
			}
		}
		if (Static395.aClass124_11 != null) {
			Static160.method2323(Static395.aClass124_11);
			Static395.aClass124_11 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!tl;)V")
	public static void method3554(@OriginalArg(1) Class4_Sub6 arg0) {
		arg0.aClass25_Sub5_Sub1_1 = null;
		if (Static78.anInt3512 < 20) {
			Static190.aClass262_6.method5815(arg0);
			Static78.anInt3512++;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B[S)[S")
	public static short[] method3556(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static468.method5035(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
