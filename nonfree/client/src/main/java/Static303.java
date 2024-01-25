import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!mh", name = "Gb", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_87 = new Class45(61, -1);

	@OriginalMember(owner = "client!mh", name = "Hb", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_168 = new Class88("K", "T", "K", "K");

	@OriginalMember(owner = "client!mh", name = "Ib", descriptor = "[I")
	public static final int[] anIntArray412 = new int[4];

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method4926(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static358.anInt6694; local16++) {
			if (arg0.equalsIgnoreCase(Static54.aStringArray5[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static362.aStringArray43[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIBI)V")
	public static void method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static332.method5312(Static54.aClass77_12);
		}
		if (arg1 == 1) {
			Static332.method5312(Static289.aClass77_53);
		}
		Static383.aClass12_Sub8_Sub2_1.method5182(Static203.anInt4534 + arg0);
		Static383.aClass12_Sub8_Sub2_1.method5197(arg2 + Static61.anInt1459);
		Static383.aClass12_Sub8_Sub2_1.method5167(Static23.aClass5_3.method211(82) ? 1 : 0);
		Static209.aBoolean364 = false;
		Static141.anInt3151 = arg0;
		Static273.anInt5444 = arg2;
		Static62.method1459();
	}
}
