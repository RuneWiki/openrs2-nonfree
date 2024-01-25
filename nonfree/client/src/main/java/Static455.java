import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static455 {

	@OriginalMember(owner = "client!wv", name = "R", descriptor = "I")
	public static int anInt7452;

	@OriginalMember(owner = "client!wv", name = "V", descriptor = "Lclient!dm;")
	public static Class52 aClass52_2;

	@OriginalMember(owner = "client!wv", name = "M", descriptor = "Lclient!ai;")
	public static final Class6 aClass6_5 = new Class6("runescape", 0);

	@OriginalMember(owner = "client!wv", name = "S", descriptor = "I")
	public static int anInt7453 = 13156520;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIILclient!me;II)V")
	public static void method5632(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class20_Sub3_Sub3 arg3) {
		Static22.method400(arg2, 0, arg1, arg0, arg3.anInt6616, arg3.aByte89, arg3.anInt6613);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIZ)V")
	public static void method5633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static357.aClass6_4 == Static43.aClass6_3) {
			if (!Static308.method4012(arg1, 1, arg0, 1, false, 0, 0, -2)) {
				Static308.method4012(arg1, 1, arg0, 1, false, 0, 0, -3);
			}
		} else if (!Static308.method4012(arg1, 1, arg0, 1, false, 0, 0, -3)) {
			Static308.method4012(arg1, 1, arg0, 1, false, 0, 0, -2);
		}
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(IBI)Z")
	public static boolean method5635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
