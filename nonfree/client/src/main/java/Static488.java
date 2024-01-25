import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!qj", name = "A", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
	public static int anInt7901;

	@OriginalMember(owner = "client!qj", name = "B", descriptor = "Lclient!po;")
	public static final Class290 aClass290_4 = new Class290("game3", "Game 3", 2);

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
	public static int anInt7900 = 0;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)Z")
	public static boolean method6854() {
		if (Static460.aBoolean507) {
			try {
				Static684.method782(Static265.anApplet2, "showVideoAd");
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!gda;[IBLclient!gda;)V")
	public static void method6856(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class126 arg2) {
		Static153.aClass126_88 = arg0;
		if (arg1 != null) {
			Static54.anIntArray64 = arg1;
		}
		Static471.aClass126_219 = arg2;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZLclient!caa;)V")
	public static void method6857(@OriginalArg(1) Class4_Sub3 arg0) {
		arg0.aClass4_Sub1_Sub1_Sub2_1 = null;
		if (Static99.anInt1643 < 20) {
			Static485.aClass387_11.method9017(arg0);
			Static99.anInt1643++;
		}
	}
}
