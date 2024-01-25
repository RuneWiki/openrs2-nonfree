import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static230 {

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30;

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "Lclient!qfa;")
	public static Class272 aClass272_135 = null;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)Lclient!ho;")
	public static Class133_Sub1 method3914() {
		return Static444.anInt7325 < Static338.aClass133_Sub1Array2.length ? Static338.aClass133_Sub1Array2[Static444.anInt7325++] : null;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	public static void method3915() {
		Static49.aClass117_1 = null;
		Static405.aClass46Array13 = null;
		Static569.aClass46_33 = null;
		Static90.aClass46Array4 = null;
		Static231.aClass46Array9 = null;
		Static330.aClass46Array12 = null;
		Static56.aClass46Array2 = null;
		Static245.aClass46Array10 = null;
		Static223.aClass46Array8 = null;
		Static503.aClass46Array14 = null;
		Static480.aClass117_9 = null;
		Static410.aClass117_8 = null;
		Static58.aClass46Array3 = null;
		Static10.aClass46Array1 = null;
		Static277.aClass46Array11 = null;
		Static594.aClass46Array15 = null;
		Static191.aClass46Array7 = null;
		Static573.aClass46_35 = null;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)V")
	public static void method3917(@OriginalArg(1) int arg0) {
		Static383.aLong187 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZII)Z")
	public static boolean method3918(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static530.method6997(arg1, arg0) & ((arg1 & 0x2000) != 0 | Static188.method3226(arg1, arg0) | Static8.method111(arg0, arg1));
	}
}
