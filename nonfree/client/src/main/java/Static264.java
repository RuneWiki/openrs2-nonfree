import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "[[Lclient!is;")
	public static Class155[][] aClass155ArrayArray1;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	public static int anInt5328;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_40 = new Class344(77, 8);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lclient!hc;")
	public static Class134 method4152(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static584.aClass134Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method4154() {
		Static57.anInt1513 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static229.aClass4_Sub13Array1[local14] = null;
			Static298.aByteArray48[local14] = 1;
			Static140.aClass337Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)Z")
	public static boolean method4155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static249.method2740(arg1, arg0) || Static276.method4454(arg1, arg0);
	}
}
