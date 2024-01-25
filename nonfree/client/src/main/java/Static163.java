import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
	public static int anInt5784;

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
	public static int anInt5780 = 1;

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "[I")
	public static final int[] anIntArray438 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_89 = new Class142("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_224 = new Class67(33, -1);

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString61 = null;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Z")
	public static boolean method4677() {
		if (Static379.aBoolean16) {
			try {
				Static466.method42("showVideoAd", Static259.aClass177_2.anApplet1);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZIII)Lclient!qf;")
	public static Class1_Sub37 method4678(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub37 local7 = new Class1_Sub37();
		local7.anInt5481 = arg0;
		local7.anInt5479 = arg3;
		Static462.aClass208_42.method4413((long) arg2, local7);
		Static327.method4301(arg0);
		@Pc(30) Class107 local30 = Static55.method754(arg2);
		if (local30 != null) {
			Static260.method3633(local30);
		}
		if (Static414.aClass107_15 != null) {
			Static260.method3633(Static414.aClass107_15);
			Static414.aClass107_15 = null;
		}
		Static458.method5894();
		if (local30 != null) {
			Static213.method3088(!arg1, local30);
		}
		if (!arg1) {
			Static198.method2835(arg0);
		}
		if (!arg1 && Static118.anInt1785 != -1) {
			Static302.method4042(Static118.anInt1785, 1);
		}
		return local7;
	}
}
