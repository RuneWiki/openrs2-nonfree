import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static284 {

	@OriginalMember(owner = "client!vl", name = "U", descriptor = "I")
	public static int anInt5587;

	@OriginalMember(owner = "client!vl", name = "K", descriptor = "[I")
	public static int[] anIntArray489 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!vl", name = "T", descriptor = "[I")
	public static int[] anIntArray490 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method4231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 >= Static253.anInt4996 && arg2 <= Static52.anInt1146 && arg5 >= Static228.anInt4643 && Static244.anInt4872 >= arg1) {
			Static115.method1853(arg6, arg5, arg1, arg2, arg4, arg0, arg3);
		} else {
			Static63.method985(arg1, arg4, arg2, arg0, arg6, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!pk;)V")
	public static void method4234(@OriginalArg(1) Class132 arg0) {
		Static28.anInt694 = arg0.method3185("p11_full");
		Static230.anInt4669 = arg0.method3185("p12_full");
		Static74.anInt1608 = arg0.method3185("b12_full");
		Static60.anInt1298 = arg0.method3185("mapfunction");
		Static22.anInt617 = arg0.method3185("hitmarks");
		Static114.anInt2338 = arg0.method3185("hitbar_default");
		Static77.anInt1675 = arg0.method3185("headicons_pk");
		Static206.anInt4276 = arg0.method3185("headicons_prayer");
		Static167.anInt3365 = arg0.method3185("hint_headicons");
		Static234.anInt4712 = arg0.method3185("hint_mapmarkers");
		Static121.anInt2429 = arg0.method3185("mapflag");
		Static201.anInt4151 = arg0.method3185("cross");
		Static270.anInt5335 = arg0.method3185("mapdots");
		Static130.anInt2597 = arg0.method3185("scrollbar");
		Static97.anInt2004 = arg0.method3185("name_icons");
		Static145.anInt2862 = arg0.method3185("floorshadows");
		Static76.anInt1639 = arg0.method3185("compass");
		Static189.anInt3787 = arg0.method3185("hint_mapedge");
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BILclient!pk;)Lclient!wd;")
	public static Class8_Sub1_Sub7 method4236(@OriginalArg(1) int arg0, @OriginalArg(2) Class132 arg1) {
		return Static34.method533(arg1, arg0) ? Static54.method869() : null;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(ZI)V")
	public static void method4237() {
		Static120.aClass61_20.method1381(5);
		Static147.aClass61_24.method1381(5);
	}
}
