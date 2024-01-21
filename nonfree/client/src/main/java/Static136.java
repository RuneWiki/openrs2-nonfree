import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static136 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1319 = Static32.method683("<col=80ff00>");

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1320 = Static32.method683(" loggt sich aus)3");

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1321 = Static32.method683("mn");

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1322 = Static32.method683("p11_full");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	public static void method2265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static156.anInt3412 != 0 && arg1 != -1) {
			Static15.method217(0, Static156.anInt3412, arg1, Static86.aClass11_Sub1_37);
			Static33.aBoolean32 = true;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method2266() {
		aClass49_1319 = null;
		aClass49_1321 = null;
		aClass49_1320 = null;
		aClass49_1322 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[S[Lclient!lf;)V")
	public static void method2267(@OriginalArg(1) short[] arg0, @OriginalArg(2) Class49[] arg1) {
		Static13.method199(0, arg0, arg1.length - 1, arg1);
	}
}
