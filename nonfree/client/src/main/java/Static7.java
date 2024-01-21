import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "d", descriptor = "[Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2[] aClass3_Sub2_Sub3_Sub2Array1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!kb;")
	public static Class46 aClass46_46 = Static65.method1172("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Lclient!kb;")
	public static Class46 aClass46_47 = Static65.method1172("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!kb;")
	public static Class46 aClass46_48 = Static65.method1172(":clanreq:");

	@OriginalMember(owner = "client!af", name = "e", descriptor = "I")
	public static int anInt139 = 1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)I")
	public static int method101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 * arg2 + arg1 * (4096 - arg2) >> 12;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public static void method102() {
		aClass3_Sub2_Sub3_Sub2Array1 = null;
		aClass46_47 = null;
		aClass46_48 = null;
		aClass46_46 = null;
	}
}
