import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static239 {

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "[I")
	public static int[] anIntArray268;

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
	public static int anInt5180 = -1;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZILclient!in;II)V")
	public static void method4462(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class157 arg2, @OriginalArg(6) int arg3) {
		if (arg3 <= 0) {
			Static196.method3971(arg1, arg2, arg0);
			return;
		}
		Static122.aBoolean721 = false;
		Static614.anInt10750 = 1;
		Static42.aClass157_33 = arg2;
		Static177.anInt4267 = arg1;
		Static603.aClass2_Sub8_Sub3_5 = null;
		Static77.anInt10672 = 0;
		Static267.anInt5676 = arg0;
		Static436.anInt8106 = Static341.aClass2_Sub8_Sub3_4.method5786() / arg3;
		if (Static436.anInt8106 < 1) {
			Static436.anInt8106 = 1;
			return;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method4463() {
		Static55.aClass46Array14 = null;
		Static182.aClass46Array7 = null;
		Static22.aClass46Array1 = null;
		Static529.aClass46Array18 = null;
		Static30.aClass46_2 = null;
		Static221.aClass46Array10 = null;
		Static352.aClass46Array11 = null;
		Static479.aClass46Array15 = null;
		Static146.aClass46Array6 = null;
		Static571.aClass68_12 = null;
		Static90.aClass46_10 = null;
		Static300.aClass68_4 = null;
		Static529.aClass68_10 = null;
		Static427.aClass46Array13 = null;
		Static38.aClass46Array2 = null;
		Static573.aClass46Array19 = null;
		Static487.aClass46Array17 = null;
		Static504.aClass46Array16 = null;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Z")
	public static boolean method4465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
