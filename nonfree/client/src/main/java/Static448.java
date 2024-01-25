import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!paa", name = "q", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!paa", name = "t", descriptor = "I")
	public static int anInt7231 = 0;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIII)V")
	public static void method6080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static617.anInt6260 && Static229.anInt4089 >= arg2) {
			@Pc(19) int local19 = Static166.method2620(arg0, Static629.anInt10412, Static300.anInt5091);
			@Pc(25) int local25 = Static166.method2620(arg1, Static629.anInt10412, Static300.anInt5091);
			Static282.method4103(local19, arg2, arg3, local25);
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILclient!ha;)Lclient!eb;")
	public static Class91 method6082(@OriginalArg(1) int arg0, @OriginalArg(2) Class95 arg1) {
		@Pc(9) Class221 local9 = Static256.method3849(arg0, arg1, true);
		return local9 == null ? null : local9.aClass91_9;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)I")
	public static int method6083() {
		return Static380.anInt6370;
	}
}
