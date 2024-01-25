import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static319 {

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
	public static int anInt5425;

	@OriginalMember(owner = "client!ss", name = "x", descriptor = "Lclient!am;")
	public static Class9 aClass9_3;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
	public static int anInt5426 = 0;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ)V")
	public static void method4719(@OriginalArg(0) int arg0) {
		if (Static348.method5096(arg0)) {
			Static192.method3301(Static183.aClass4ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(II)I")
	public static int method4726(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
